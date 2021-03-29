package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.*;
import javax.validation.constraints.*;
import java.util.Arrays;
import java.io.Serializable;

import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
	"Message"@en

	"Metadata describing payload exchanged by interacting Connectors."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = NotificationMessage.class),

@JsonSubTypes.Type(value = RequestMessage.class),

@JsonSubTypes.Type(value = ResponseMessage.class),})
public interface Message {

	// standard methods

	@JsonProperty("@id")
	@javax.validation.constraints.NotNull URI getId();
	java.util.List<TypedLiteral> getLabel();
	java.util.List<TypedLiteral> getComment();
	String toRdf();

	// getter and setter for generic property map
	public java.util.Map<String,Object> getProperties();
	public void setProperty(String property, Object value);

	// accessor methods as derived from information model
	/**
	"model version"@en

	"Version of the Information Model against which the Message should be interpreted."@en
	*/
	
	@NotNull
	@JsonProperty("ids:modelVersion")
	String getModelVersion();
	/**
	"issued"@en

	"Date (as xsd:dateTimeStamp) of issuing the Message."@en
	*/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@NotNull
	@JsonProperty("ids:issued")
	XMLGregorianCalendar getIssued();
	/**
	"issuer connector"@en

	"The Connector which is the origin of the message."@en
	*/
	
	@NotNull
	@JsonProperty("ids:issuerConnector")
	URI getIssuerConnector();
	/**
	"recipient connector"@en

	"The Connector which is the recipient of the message."@en
	*/
	
	
	@JsonProperty("ids:recipientConnector")
	java.util.ArrayList<? extends URI> getRecipientConnector();
	/**
	"Security token"@en

	"A token representing a claim that the message sender supports a certain security profile."@en
	*/
	
	@NotNull
	@JsonProperty("ids:securityToken")
	DynamicAttributeToken getSecurityToken();
	/**
	"sender agent"@en

	"The Agent which initiated the Message."@en
	*/
	
	@NotNull
	@JsonProperty("ids:senderAgent")
	URI getSenderAgent();
	/**
	"recipient agent"@en

	"The Agent for which the Mesaage is intended."@en
	*/
	
	
	@JsonProperty("ids:recipientAgent")
	java.util.ArrayList<? extends URI> getRecipientAgent();
	/**
	"consumer connector"@en

	"Correlated message, e.g. a response to a previous request."@en
	*/
	
	
	@JsonProperty("ids:correlationMessage")
	URI getCorrelationMessage();
	/**
	"Authorization token"@en

	"An authorization token like JSON Web Token."@en
	*/
	
	
	@JsonProperty("ids:authorizationToken")
	Token getAuthorizationToken();
	/**
	"transferContract"@en

	"The contract which is (or will be) the legal basis of the data transfer."@en
	*/
	
	
	@JsonProperty("ids:transferContract")
	URI getTransferContract();
	/**
	"contentVersion"@en

	"Version of the content in the payload. Use digits and semantic versioning pattern like MAJOR.MINOR.PATCH."@en
	*/
	
	
	@JsonProperty("ids:contentVersion")
	String getContentVersion();
}
