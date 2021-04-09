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
* "App Available Message"@en
* "Message indicating that a specific App should be available (again) in the AppStore."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:AppAvailableMessage")
public class AppAvailableMessageImpl implements Serializable, AppAvailableMessage {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("App Available Message", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Message indicating that a specific App should be available (again) in the AppStore.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDSA Information Model ontology

	/**
	* "affected Resource"@en
	* "The affected resource that is referenced in the resource-related notification messages. "@en
	*/
	@NotNull
	@JsonAlias({"ids:affectedResource", "affectedResource"})
	protected URI _affectedResource;


	/**
	* "Authorization token"@en
	* "An authorization token like JSON Web Token."@en
	*/
	@JsonAlias({"ids:authorizationToken", "authorizationToken"})
	protected Token _authorizationToken;


	/**
	* "contentVersion"@en
	* "Version of the content in the payload. Use digits and semantic versioning pattern like MAJOR.MINOR.PATCH."@en
	*/
	@JsonAlias({"ids:contentVersion", "contentVersion"})
	protected String _contentVersion;


	/**
	* "consumer connector"@en
	* "Correlated message, e.g. a response to a previous request."@en
	*/
	@JsonAlias({"ids:correlationMessage", "correlationMessage"})
	protected URI _correlationMessage;


	/**
	* "issued"@en
	* "Date (as xsd:dateTimeStamp) of issuing the Message."@en
	*/
	@NotNull
	@JsonAlias({"ids:issued", "issued"})
	protected XMLGregorianCalendar _issued;


	/**
	* "issuer connector"@en
	* "The Connector which is the origin of the message."@en
	*/
	@NotNull
	@JsonAlias({"ids:issuerConnector", "issuerConnector"})
	protected URI _issuerConnector;


	/**
	* "model version"@en
	* "Version of the Information Model against which the Message should be interpreted."@en
	*/
	@NotNull
	@JsonAlias({"ids:modelVersion", "modelVersion"})
	protected String _modelVersion;


	/**
	* "recipient agent"@en
	* "The Agent for which the Mesaage is intended."@en
	*/
	@JsonAlias({"ids:recipientAgent", "recipientAgent"})
	protected ArrayList<? extends URI> _recipientAgent;


	/**
	* "recipient connector"@en
	* "The Connector which is the recipient of the message."@en
	*/
	@JsonAlias({"ids:recipientConnector", "recipientConnector"})
	protected ArrayList<? extends URI> _recipientConnector;


	/**
	* "Security token"@en
	* "A token representing a claim that the message sender supports a certain security profile."@en
	*/
	@NotNull
	@JsonAlias({"ids:securityToken", "securityToken"})
	protected DynamicAttributeToken _securityToken;


	/**
	* "sender agent"@en
	* "The Agent which initiated the Message."@en
	*/
	@NotNull
	@JsonAlias({"ids:senderAgent", "senderAgent"})
	protected URI _senderAgent;


	/**
	* "transferContract"@en
	* "The contract which is (or will be) the legal basis of the data transfer."@en
	*/
	@JsonAlias({"ids:transferContract", "transferContract"})
	protected URI _transferContract;


	// no manual construction
	protected AppAvailableMessageImpl() {
		id = VocabUtil.getInstance().createRandomUrl("appAvailableMessage");
	}

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel() {
		return this.label;
	}

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	public List<TypedLiteral> getComment() {
		return this.comment;
	}

	// getter and setter for generic property map
	@JsonAnyGetter
	public Map<String,Object> getProperties() {
		if (this.properties == null) return null;
		Iterator<String> iter = this.properties.keySet().iterator();
		Map<String,Object> resultset = new HashMap<String, Object>();
		while (iter.hasNext()) {
			String key = iter.next();
			resultset.put(key,urifyObjects(this.properties.get(key)));
		}
		return resultset ;
	}

	public Object urifyObjects(Object value) {
		if (value instanceof String && value.toString().startsWith("http")) {
			try {
				value = new URI(value.toString());
			} catch (Exception e) { /* do nothing */ }
		} else if (value instanceof ArrayList) {
			ArrayList<Object> result_array = new ArrayList<Object>();
			((ArrayList) value).forEach(x -> result_array.add(urifyObjects(x)));
			return result_array;
		} else if (value instanceof Map) {
			Map<String, Object> result_map = new HashMap<String, Object>();
			((Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	@JsonAnySetter
	public void setProperty(String property, Object value) {
		if (this.properties == null) this.properties = new HashMap<String,Object>();
		if (property.startsWith("@")) {return ;};
		this.properties.put(property, value) ;
	}

	// accessor method implementations as derived from the IDSA Information Model ontology




	/**
	* "The affected resource that is referenced in the resource-related notification messages. "@en
	* @return Returns the URI for the property affectedResource.
	* More information under https://w3id.org/idsa/core/affectedResource
	*/
	@NotNull
	@JsonProperty("ids:affectedResource")
	final public URI getAffectedResource() {
		return _affectedResource;
	}

	
	/**
	* "The affected resource that is referenced in the resource-related notification messages. "@en
	* @param _affectedResource_ desired value for the property affectedResource.
	* More information under https://w3id.org/idsa/core/affectedResource
	*/
	final public void setAffectedResource (URI _affectedResource_) {
		this._affectedResource = _affectedResource_;
	}


	/**
	* "Version of the Information Model against which the Message should be interpreted."@en
	* @return Returns the String for the property modelVersion.
	* More information under https://w3id.org/idsa/core/modelVersion
	*/
	@NotNull
	@JsonProperty("ids:modelVersion")
	final public String getModelVersion() {
		return _modelVersion;
	}

	
	/**
	* "Version of the Information Model against which the Message should be interpreted."@en
	* @param _modelVersion_ desired value for the property modelVersion.
	* More information under https://w3id.org/idsa/core/modelVersion
	*/
	final public void setModelVersion (String _modelVersion_) {
		this._modelVersion = _modelVersion_;
	}

	/**
	* "Date (as xsd:dateTimeStamp) of issuing the Message."@en
	* @return Returns the XMLGregorianCalendar for the property issued.
	* More information under https://w3id.org/idsa/core/issued
	*/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@NotNull
	@JsonProperty("ids:issued")
	final public XMLGregorianCalendar getIssued() {
		return _issued;
	}

	
	/**
	* "Date (as xsd:dateTimeStamp) of issuing the Message."@en
	* @param _issued_ desired value for the property issued.
	* More information under https://w3id.org/idsa/core/issued
	*/
	final public void setIssued (XMLGregorianCalendar _issued_) {
		this._issued = _issued_;
	}

	/**
	* "The Connector which is the origin of the message."@en
	* @return Returns the URI for the property issuerConnector.
	* More information under https://w3id.org/idsa/core/issuerConnector
	*/
	@NotNull
	@JsonProperty("ids:issuerConnector")
	final public URI getIssuerConnector() {
		return _issuerConnector;
	}

	
	/**
	* "The Connector which is the origin of the message."@en
	* @param _issuerConnector_ desired value for the property issuerConnector.
	* More information under https://w3id.org/idsa/core/issuerConnector
	*/
	final public void setIssuerConnector (URI _issuerConnector_) {
		this._issuerConnector = _issuerConnector_;
	}

	/**
	* "The Connector which is the recipient of the message."@en
	* @return Returns the ArrayList of URI for the property recipientConnector.
	* More information under https://w3id.org/idsa/core/recipientConnector
	*/
	@JsonProperty("ids:recipientConnector")
	final public ArrayList<? extends URI> getRecipientConnector() {
		return _recipientConnector;
	}

	
	/**
	* "The Connector which is the recipient of the message."@en
	* @param _recipientConnector_ desired value for the property recipientConnector.
	* More information under https://w3id.org/idsa/core/recipientConnector
	*/
	final public void setRecipientConnector (ArrayList<? extends URI> _recipientConnector_) {
		this._recipientConnector = _recipientConnector_;
	}

	/**
	* "A token representing a claim that the message sender supports a certain security profile."@en
	* @return Returns the DynamicAttributeToken for the property securityToken.
	* More information under https://w3id.org/idsa/core/securityToken
	*/
	@NotNull
	@JsonProperty("ids:securityToken")
	final public DynamicAttributeToken getSecurityToken() {
		return _securityToken;
	}

	
	/**
	* "A token representing a claim that the message sender supports a certain security profile."@en
	* @param _securityToken_ desired value for the property securityToken.
	* More information under https://w3id.org/idsa/core/securityToken
	*/
	final public void setSecurityToken (DynamicAttributeToken _securityToken_) {
		this._securityToken = _securityToken_;
	}

	/**
	* "The Agent which initiated the Message."@en
	* @return Returns the URI for the property senderAgent.
	* More information under https://w3id.org/idsa/core/senderAgent
	*/
	@NotNull
	@JsonProperty("ids:senderAgent")
	final public URI getSenderAgent() {
		return _senderAgent;
	}

	
	/**
	* "The Agent which initiated the Message."@en
	* @param _senderAgent_ desired value for the property senderAgent.
	* More information under https://w3id.org/idsa/core/senderAgent
	*/
	final public void setSenderAgent (URI _senderAgent_) {
		this._senderAgent = _senderAgent_;
	}

	/**
	* "The Agent for which the Mesaage is intended."@en
	* @return Returns the ArrayList of URI for the property recipientAgent.
	* More information under https://w3id.org/idsa/core/recipientAgent
	*/
	@JsonProperty("ids:recipientAgent")
	final public ArrayList<? extends URI> getRecipientAgent() {
		return _recipientAgent;
	}

	
	/**
	* "The Agent for which the Mesaage is intended."@en
	* @param _recipientAgent_ desired value for the property recipientAgent.
	* More information under https://w3id.org/idsa/core/recipientAgent
	*/
	final public void setRecipientAgent (ArrayList<? extends URI> _recipientAgent_) {
		this._recipientAgent = _recipientAgent_;
	}

	/**
	* "Correlated message, e.g. a response to a previous request."@en
	* @return Returns the URI for the property correlationMessage.
	* More information under https://w3id.org/idsa/core/correlationMessage
	*/
	@JsonProperty("ids:correlationMessage")
	final public URI getCorrelationMessage() {
		return _correlationMessage;
	}

	
	/**
	* "Correlated message, e.g. a response to a previous request."@en
	* @param _correlationMessage_ desired value for the property correlationMessage.
	* More information under https://w3id.org/idsa/core/correlationMessage
	*/
	final public void setCorrelationMessage (URI _correlationMessage_) {
		this._correlationMessage = _correlationMessage_;
	}

	/**
	* "An authorization token like JSON Web Token."@en
	* @return Returns the Token for the property authorizationToken.
	* More information under https://w3id.org/idsa/core/authorizationToken
	*/
	@JsonProperty("ids:authorizationToken")
	final public Token getAuthorizationToken() {
		return _authorizationToken;
	}

	
	/**
	* "An authorization token like JSON Web Token."@en
	* @param _authorizationToken_ desired value for the property authorizationToken.
	* More information under https://w3id.org/idsa/core/authorizationToken
	*/
	final public void setAuthorizationToken (Token _authorizationToken_) {
		this._authorizationToken = _authorizationToken_;
	}

	/**
	* "The contract which is (or will be) the legal basis of the data transfer."@en
	* @return Returns the URI for the property transferContract.
	* More information under https://w3id.org/idsa/core/transferContract
	*/
	@JsonProperty("ids:transferContract")
	final public URI getTransferContract() {
		return _transferContract;
	}

	
	/**
	* "The contract which is (or will be) the legal basis of the data transfer."@en
	* @param _transferContract_ desired value for the property transferContract.
	* More information under https://w3id.org/idsa/core/transferContract
	*/
	final public void setTransferContract (URI _transferContract_) {
		this._transferContract = _transferContract_;
	}

	/**
	* "Version of the content in the payload. Use digits and semantic versioning pattern like MAJOR.MINOR.PATCH."@en
	* @return Returns the String for the property contentVersion.
	* More information under https://w3id.org/idsa/core/contentVersion
	*/
	@JsonProperty("ids:contentVersion")
	final public String getContentVersion() {
		return _contentVersion;
	}

	
	/**
	* "Version of the content in the payload. Use digits and semantic versioning pattern like MAJOR.MINOR.PATCH."@en
	* @param _contentVersion_ desired value for the property contentVersion.
	* More information under https://w3id.org/idsa/core/contentVersion
	*/
	final public void setContentVersion (String _contentVersion_) {
		this._contentVersion = _contentVersion_;
	}
}
