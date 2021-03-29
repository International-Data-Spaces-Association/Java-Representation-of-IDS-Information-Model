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
	"Query Message"@en

	"Query message intended to be consumed by a component."@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:QueryMessage")
public class QueryMessageImpl implements Serializable, QueryMessage {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Query Message", "en"));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Query message intended to be consumed by a component.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

	/**
	"Authorization token"@en

	"An authorization token like JSON Web Token."@en
	*/
	@JsonAlias({"ids:authorizationToken", "authorizationToken"})
	 Token _authorizationToken;

	/**
	"contentVersion"@en

	"Version of the content in the payload. Use digits and semantic versioning pattern like MAJOR.MINOR.PATCH."@en
	*/
	@JsonAlias({"ids:contentVersion", "contentVersion"})
	 String _contentVersion;

	/**
	"consumer connector"@en

	"Correlated message, e.g. a response to a previous request."@en
	*/
	@JsonAlias({"ids:correlationMessage", "correlationMessage"})
	 URI _correlationMessage;

	/**
	"issued"@en

	"Date (as xsd:dateTimeStamp) of issuing the Message."@en
	*/
	@NotNull@JsonAlias({"ids:issued", "issued"})
	 XMLGregorianCalendar _issued;

	/**
	"issuer connector"@en

	"The Connector which is the origin of the message."@en
	*/
	@NotNull@JsonAlias({"ids:issuerConnector", "issuerConnector"})
	 URI _issuerConnector;

	/**
	"model version"@en

	"Version of the Information Model against which the Message should be interpreted."@en
	*/
	@NotNull@JsonAlias({"ids:modelVersion", "modelVersion"})
	 String _modelVersion;

	/**
	"queryLanguage"@en

	"This property specifies the language of the query."@en
	*/
	@JsonAlias({"ids:queryLanguage", "queryLanguage"})
	 QueryLanguage _queryLanguage;

	/**
	"queryScope"@en

	"Refers to the scope property of a query message, see ids:QueryScope."@en
	*/
	@JsonAlias({"ids:queryScope", "queryScope"})
	 QueryScope _queryScope;

	/**
	"recipient agent"@en

	"The Agent for which the Mesaage is intended."@en
	*/
	@JsonAlias({"ids:recipientAgent", "recipientAgent"})
	 java.util.ArrayList<? extends URI> _recipientAgent;

	/**
	"recipient connector"@en

	"The Connector which is the recipient of the message."@en
	*/
	@JsonAlias({"ids:recipientConnector", "recipientConnector"})
	 java.util.ArrayList<? extends URI> _recipientConnector;

	/**
	"recipient scope"@en

	"Refers to the target property of a query message, see ids:QueryTarget."@en
	*/
	@JsonAlias({"ids:recipientScope", "recipientScope"})
	 QueryTarget _recipientScope;

	/**
	"Security token"@en

	"A token representing a claim that the message sender supports a certain security profile."@en
	*/
	@NotNull@JsonAlias({"ids:securityToken", "securityToken"})
	 DynamicAttributeToken _securityToken;

	/**
	"sender agent"@en

	"The Agent which initiated the Message."@en
	*/
	@NotNull@JsonAlias({"ids:senderAgent", "senderAgent"})
	 URI _senderAgent;

	/**
	"transferContract"@en

	"The contract which is (or will be) the legal basis of the data transfer."@en
	*/
	@JsonAlias({"ids:transferContract", "transferContract"})
	 URI _transferContract;

	// no manual construction
	QueryMessageImpl() {
		id = VocabUtil.getInstance().createRandomUrl("queryMessage");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	public java.util.List<TypedLiteral> getLabel() {
		return this.label;
	}

	public java.util.List<TypedLiteral> getComment() {
		return this.comment;
	}

	// getter and setter for generic property map
	@JsonAnyGetter
	public java.util.Map<String,Object> getProperties() {
		if (this.properties == null) return null;
		Iterator<String> iter = this.properties.keySet().iterator();
		java.util.Map<String,Object> resultset = new HashMap<String, Object>();
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
		} else if (value instanceof java.util.Map) {
			java.util.Map<String, Object> result_map = new HashMap<String, Object>();
			((java.util.Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	@JsonAnySetter
	public void setProperty(String property, Object value) {
	if (this.properties == null) this.properties = new java.util.HashMap<String,Object>();
	if (property.startsWith("@")) {return ;};
	this.properties.put(property, value) ;
	}
	// accessor method implementations as derived from information model

	final public 
	
	
	@JsonProperty("ids:queryLanguage")
	QueryLanguage getQueryLanguage() {
		return _queryLanguage;
	}
	final public void setQueryLanguage (QueryLanguage _queryLanguage_) {
		this._queryLanguage = _queryLanguage_;
	}

	final public 
	
	
	@JsonProperty("ids:queryScope")
	QueryScope getQueryScope() {
		return _queryScope;
	}
	final public void setQueryScope (QueryScope _queryScope_) {
		this._queryScope = _queryScope_;
	}

	final public 
	
	
	@JsonProperty("ids:recipientScope")
	QueryTarget getRecipientScope() {
		return _recipientScope;
	}
	final public void setRecipientScope (QueryTarget _recipientScope_) {
		this._recipientScope = _recipientScope_;
	}


	final public 
	
	@NotNull
	@JsonProperty("ids:modelVersion")
	String getModelVersion() {
		return _modelVersion;
	}
	final public void setModelVersion (String _modelVersion_) {
		this._modelVersion = _modelVersion_;
	}

	final public 
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@NotNull
	@JsonProperty("ids:issued")
	XMLGregorianCalendar getIssued() {
		return _issued;
	}
	final public void setIssued (XMLGregorianCalendar _issued_) {
		this._issued = _issued_;
	}

	final public 
	
	@NotNull
	@JsonProperty("ids:issuerConnector")
	URI getIssuerConnector() {
		return _issuerConnector;
	}
	final public void setIssuerConnector (URI _issuerConnector_) {
		this._issuerConnector = _issuerConnector_;
	}

	final public 
	
	
	@JsonProperty("ids:recipientConnector")
	java.util.ArrayList<? extends URI> getRecipientConnector() {
		return _recipientConnector;
	}
	final public void setRecipientConnector (java.util.ArrayList<? extends URI> _recipientConnector_) {
		this._recipientConnector = _recipientConnector_;
	}

	final public 
	
	@NotNull
	@JsonProperty("ids:securityToken")
	DynamicAttributeToken getSecurityToken() {
		return _securityToken;
	}
	final public void setSecurityToken (DynamicAttributeToken _securityToken_) {
		this._securityToken = _securityToken_;
	}

	final public 
	
	@NotNull
	@JsonProperty("ids:senderAgent")
	URI getSenderAgent() {
		return _senderAgent;
	}
	final public void setSenderAgent (URI _senderAgent_) {
		this._senderAgent = _senderAgent_;
	}

	final public 
	
	
	@JsonProperty("ids:recipientAgent")
	java.util.ArrayList<? extends URI> getRecipientAgent() {
		return _recipientAgent;
	}
	final public void setRecipientAgent (java.util.ArrayList<? extends URI> _recipientAgent_) {
		this._recipientAgent = _recipientAgent_;
	}

	final public 
	
	
	@JsonProperty("ids:correlationMessage")
	URI getCorrelationMessage() {
		return _correlationMessage;
	}
	final public void setCorrelationMessage (URI _correlationMessage_) {
		this._correlationMessage = _correlationMessage_;
	}

	final public 
	
	
	@JsonProperty("ids:authorizationToken")
	Token getAuthorizationToken() {
		return _authorizationToken;
	}
	final public void setAuthorizationToken (Token _authorizationToken_) {
		this._authorizationToken = _authorizationToken_;
	}

	final public 
	
	
	@JsonProperty("ids:transferContract")
	URI getTransferContract() {
		return _transferContract;
	}
	final public void setTransferContract (URI _transferContract_) {
		this._transferContract = _transferContract_;
	}

	final public 
	
	
	@JsonProperty("ids:contentVersion")
	String getContentVersion() {
		return _contentVersion;
	}
	final public void setContentVersion (String _contentVersion_) {
		this._contentVersion = _contentVersion_;
	}
}
