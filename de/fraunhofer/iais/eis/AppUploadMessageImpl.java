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
* "App Upload Message"@en
* "Message that usually follows a AppRegistrationResponseMessage and is used to upload a data app to the app store. Payload contains data app. Note that the message must refer to the prior sent, corresponding AppResource instance. The IRI of the ids:appArtifactReference must must match the IRI of the artifact which is the value for the ids:instance property. The ids:instance is specific for each representation. Therefore, if someone wants to upload multiple representations for an app, he has to state them using multiple ids:instance properties inside the AppRepresentation (and therefore inside the AppResource). Otherwise no mapping between payload and app metadata can be achieved."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:AppUploadMessage")
public class AppUploadMessageImpl implements Serializable, AppUploadMessage {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("App Upload Message", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Message that usually follows a AppRegistrationResponseMessage and is used to upload a data app to the app store. Payload contains data app. Note that the message must refer to the prior sent, corresponding AppResource instance. The IRI of the ids:appArtifactReference must must match the IRI of the artifact which is the value for the ids:instance property. The ids:instance is specific for each representation. Therefore, if someone wants to upload multiple representations for an app, he has to state them using multiple ids:instance properties inside the AppRepresentation (and therefore inside the AppResource). Otherwise no mapping between payload and app metadata can be achieved.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDSA Information Model ontology

	/**
	* "app artifact reference"@en
	* "IRI reference to the ids:Artifact, whose corresponding data is transfered as payload of the AppUploadMessage. The Artifact IRI reference must match the IRI of the instance IRI for the corresponding ids:AppRepresentation."@en
	*/
	@NotNull
	@JsonAlias({"ids:appArtifactReference", "appArtifactReference"})
	protected URI _appArtifactReference;


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
	protected AppUploadMessageImpl() {
		id = VocabUtil.getInstance().createRandomUrl("appUploadMessage");
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
	public int hashCode() {
		return Objects.hash(new Object[]{this._appArtifactReference,
			this._modelVersion,
			this._issued,
			this._issuerConnector,
			this._recipientConnector,
			this._securityToken,
			this._senderAgent,
			this._recipientAgent,
			this._correlationMessage,
			this._authorizationToken,
			this._transferContract,
			this._contentVersion});
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			AppUploadMessageImpl other = (AppUploadMessageImpl) obj;
			return Objects.equals(this._appArtifactReference, other._appArtifactReference) &&
				Objects.equals(this._modelVersion, other._modelVersion) &&
				Objects.equals(this._issued, other._issued) &&
				Objects.equals(this._issuerConnector, other._issuerConnector) &&
				Objects.equals(this._recipientConnector, other._recipientConnector) &&
				Objects.equals(this._securityToken, other._securityToken) &&
				Objects.equals(this._senderAgent, other._senderAgent) &&
				Objects.equals(this._recipientAgent, other._recipientAgent) &&
				Objects.equals(this._correlationMessage, other._correlationMessage) &&
				Objects.equals(this._authorizationToken, other._authorizationToken) &&
				Objects.equals(this._transferContract, other._transferContract) &&
				Objects.equals(this._contentVersion, other._contentVersion);
		}
	}


	// accessor method implementations as derived from the IDSA Information Model ontology


	@NotNull
	@JsonProperty("ids:appArtifactReference")
	final public URI getAppArtifactReference() {
		return _appArtifactReference;
	}
	
	final public void setAppArtifactReference (URI _appArtifactReference_) {
		this._appArtifactReference = _appArtifactReference_;
	}



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
	@JsonProperty("ids:securityToken")
	final public DynamicAttributeToken getSecurityToken() {
		return _securityToken;
	}
	
	final public void setSecurityToken (DynamicAttributeToken _securityToken_) {
		this._securityToken = _securityToken_;
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

	@JsonProperty("ids:correlationMessage")
	final public URI getCorrelationMessage() {
		return _correlationMessage;
	}
	
	final public void setCorrelationMessage (URI _correlationMessage_) {
		this._correlationMessage = _correlationMessage_;
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
