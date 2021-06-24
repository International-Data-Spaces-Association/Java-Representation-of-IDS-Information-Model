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
* "Contract Supplement Message"@en
* "Message containing supplemental information to access resources of a contract (e.g., resource access tokens)."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:ContractSupplementMessage")
public class ContractSupplementMessageImpl implements ContractSupplementMessage {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Contract Supplement Message", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Message containing supplemental information to access resources of a contract (e.g., resource access tokens).", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDS Information Model ontology

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
	* "Correlated message, e.g., a response to a previous request."@en
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
	protected List<URI> _recipientAgent;


	/**
	* "recipient connector"@en
	* "The Connector which is the recipient of the message."@en
	*/
	@JsonAlias({"ids:recipientConnector", "recipientConnector"})
	protected List<URI> _recipientConnector;


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
	protected ContractSupplementMessageImpl() {
		id = VocabUtil.getInstance().createRandomUrl("contractSupplementMessage");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	public List<TypedLiteral> getLabel() {
		return this.label;
	}

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
	@Override
	public int hashCode() {
		return Objects.hash(new Object[]{this._modelVersion,
			this._issued,
			this._correlationMessage,
			this._issuerConnector,
			this._recipientConnector,
			this._senderAgent,
			this._recipientAgent,
			this._securityToken,
			this._authorizationToken,
			this._transferContract,
			this._contentVersion});
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			ContractSupplementMessageImpl other = (ContractSupplementMessageImpl) obj;
			return Objects.equals(this._modelVersion, other._modelVersion) &&
				Objects.equals(this._issued, other._issued) &&
				Objects.equals(this._correlationMessage, other._correlationMessage) &&
				Objects.equals(this._issuerConnector, other._issuerConnector) &&
				Objects.equals(this._recipientConnector, other._recipientConnector) &&
				Objects.equals(this._senderAgent, other._senderAgent) &&
				Objects.equals(this._recipientAgent, other._recipientAgent) &&
				Objects.equals(this._securityToken, other._securityToken) &&
				Objects.equals(this._authorizationToken, other._authorizationToken) &&
				Objects.equals(this._transferContract, other._transferContract) &&
				Objects.equals(this._contentVersion, other._contentVersion);
		}
	}


	// accessor method implementations as derived from the IDS Information Model ontology




	@NotNull
	@JsonProperty("ids:modelVersion")
	final public String getModelVersion() {
		return _modelVersion;
	}
	
	final public void setModelVersion (String _modelVersion_) {
		this._modelVersion = _modelVersion_;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@NotNull
	@JsonProperty("ids:issued")
	final public XMLGregorianCalendar getIssued() {
		return _issued;
	}
	
	final public void setIssued (XMLGregorianCalendar _issued_) {
		this._issued = _issued_;
	}

	@JsonProperty("ids:correlationMessage")
	final public URI getCorrelationMessage() {
		return _correlationMessage;
	}
	
	final public void setCorrelationMessage (URI _correlationMessage_) {
		this._correlationMessage = _correlationMessage_;
	}

	@NotNull
	@JsonProperty("ids:issuerConnector")
	final public URI getIssuerConnector() {
		return _issuerConnector;
	}
	
	final public void setIssuerConnector (URI _issuerConnector_) {
		this._issuerConnector = _issuerConnector_;
	}

	@JsonProperty("ids:recipientConnector")
	final public List<URI> getRecipientConnector() {
		return _recipientConnector;
	}
	
	final public void setRecipientConnector (List<URI> _recipientConnector_) {
		this._recipientConnector = _recipientConnector_;
	}

	@NotNull
	@JsonProperty("ids:senderAgent")
	final public URI getSenderAgent() {
		return _senderAgent;
	}
	
	final public void setSenderAgent (URI _senderAgent_) {
		this._senderAgent = _senderAgent_;
	}

	@JsonProperty("ids:recipientAgent")
	final public List<URI> getRecipientAgent() {
		return _recipientAgent;
	}
	
	final public void setRecipientAgent (List<URI> _recipientAgent_) {
		this._recipientAgent = _recipientAgent_;
	}

	@NotNull
	@JsonProperty("ids:securityToken")
	final public DynamicAttributeToken getSecurityToken() {
		return _securityToken;
	}
	
	final public void setSecurityToken (DynamicAttributeToken _securityToken_) {
		this._securityToken = _securityToken_;
	}

	@JsonProperty("ids:authorizationToken")
	final public Token getAuthorizationToken() {
		return _authorizationToken;
	}
	
	final public void setAuthorizationToken (Token _authorizationToken_) {
		this._authorizationToken = _authorizationToken_;
	}

	@JsonProperty("ids:transferContract")
	final public URI getTransferContract() {
		return _transferContract;
	}
	
	final public void setTransferContract (URI _transferContract_) {
		this._transferContract = _transferContract_;
	}

	@JsonProperty("ids:contentVersion")
	final public String getContentVersion() {
		return _contentVersion;
	}
	
	final public void setContentVersion (String _contentVersion_) {
		this._contentVersion = _contentVersion_;
	}
}
