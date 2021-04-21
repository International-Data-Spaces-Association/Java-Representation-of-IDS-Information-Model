package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
* "Message"@en
* "Metadata describing payload exchanged by interacting Connectors."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = RequestMessage.class),
	@JsonSubTypes.Type(value = ResponseMessage.class),
	@JsonSubTypes.Type(value = NotificationMessage.class)
})
public interface Message {

	// standard methods

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	@NotNull
	public URI getId();

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel();

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	public List<TypedLiteral> getComment();

	public String toRdf();

	// getter and setter for generic property map
	public Map<String,Object> getProperties();
	public void setProperty(String property, Object value);

	/**
	* This function returns a hash code value for the Message for the benefit of e.g. hash tables.
	* @return a hash code value for the Message
	*/
	public int hashCode();

	/**
	* This function indicates whether some other object is equal to this one.
	* @param obj the reference object with which to compare.
	* @return true if this Message is the same as the obj argument; false otherwise.
	*/
	public boolean equals(Object obj);

	// accessor methods as derived from the IDSA Information Model ontology


	/**
	* "Version of the Information Model against which the Message should be interpreted."@en
	* @return Returns the String for the property _modelVersion.
	* More information under https://w3id.org/idsa/core/modelVersion
	*/
	@NotNull
	@JsonProperty("ids:modelVersion")
	public String getModelVersion();

	/**
	* "Date (as xsd:dateTimeStamp) of issuing the Message."@en
	* @return Returns the XMLGregorianCalendar for the property _issued.
	* More information under https://w3id.org/idsa/core/issued
	*/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@NotNull
	@JsonProperty("ids:issued")
	public XMLGregorianCalendar getIssued();

	/**
	* "The Connector which is the origin of the message."@en
	* @return Returns the URI for the property _issuerConnector.
	* More information under https://w3id.org/idsa/core/issuerConnector
	*/
	@NotNull
	@JsonProperty("ids:issuerConnector")
	public URI getIssuerConnector();

	/**
	* "The Connector which is the recipient of the message."@en
	* @return Returns the List of URIs for the property _recipientConnector.
	* More information under https://w3id.org/idsa/core/recipientConnector
	*/
	@JsonProperty("ids:recipientConnector")
	public List<URI> getRecipientConnector();

	/**
	* "A token representing a claim that the message sender supports a certain security profile."@en
	* @return Returns the DynamicAttributeToken for the property _securityToken.
	* More information under https://w3id.org/idsa/core/securityToken
	*/
	@NotNull
	@JsonProperty("ids:securityToken")
	public DynamicAttributeToken getSecurityToken();

	/**
	* "The Agent which initiated the Message."@en
	* @return Returns the URI for the property _senderAgent.
	* More information under https://w3id.org/idsa/core/senderAgent
	*/
	@NotNull
	@JsonProperty("ids:senderAgent")
	public URI getSenderAgent();

	/**
	* "The Agent for which the Mesaage is intended."@en
	* @return Returns the List of URIs for the property _recipientAgent.
	* More information under https://w3id.org/idsa/core/recipientAgent
	*/
	@JsonProperty("ids:recipientAgent")
	public List<URI> getRecipientAgent();

	/**
	* "Correlated message, e.g. a response to a previous request."@en
	* @return Returns the URI for the property _correlationMessage.
	* More information under https://w3id.org/idsa/core/correlationMessage
	*/
	@JsonProperty("ids:correlationMessage")
	public URI getCorrelationMessage();

	/**
	* "An authorization token like JSON Web Token."@en
	* @return Returns the Token for the property _authorizationToken.
	* More information under https://w3id.org/idsa/core/authorizationToken
	*/
	@JsonProperty("ids:authorizationToken")
	public Token getAuthorizationToken();

	/**
	* "The contract which is (or will be) the legal basis of the data transfer."@en
	* @return Returns the URI for the property _transferContract.
	* More information under https://w3id.org/idsa/core/transferContract
	*/
	@JsonProperty("ids:transferContract")
	public URI getTransferContract();

	/**
	* "Version of the content in the payload. Use digits and semantic versioning pattern like MAJOR.MINOR.PATCH."@en
	* @return Returns the String for the property _contentVersion.
	* More information under https://w3id.org/idsa/core/contentVersion
	*/
	@JsonProperty("ids:contentVersion")
	public String getContentVersion();

}
