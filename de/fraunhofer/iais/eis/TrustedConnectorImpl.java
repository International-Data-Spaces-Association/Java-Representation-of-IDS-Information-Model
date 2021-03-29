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
	"Trusted Connector"@en

	"Hardened implementation of the Connector specification providing enhanced security capabilities."@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:TrustedConnector")
public class TrustedConnectorImpl implements Serializable, TrustedConnector {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Trusted Connector", "en"));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Hardened implementation of the Connector specification providing enhanced security capabilities.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

	/**
	"authInfo"@en

	"Information of the authentication service used by the Connector."@en
	*/
	@JsonAlias({"ids:authInfo", "authInfo"})
	 AuthInfo _authInfo;

	/**
	"component certification"@en

	"Certification issued for the given Infrastructure Component."@en
	*/
	@JsonAlias({"ids:componentCertification", "componentCertification"})
	 ComponentCertification _componentCertification;

	/**
	"curator"@en

	"Participant responsible for the correctness of the content offered by the InfrastructureComponent."@en
	*/
	@NotNull@JsonAlias({"ids:curator", "curator"})
	 URI _curator;

	/**
	"description"@en

	"Explanation of the resource in a natural language text."@en
	*/
	@JsonAlias({"ids:description", "description"})
	 java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _description;

	/**
	"extended guarantee"@en

	"Reference to a security guarantee that, if used in combination with a security profile instance, overrides the respective guarantee of the given predefined instance."@en
	*/
	@JsonAlias({"ids:extendedGuarantee", "extendedGuarantee"})
	 java.util.ArrayList<? extends SecurityGuarantee> _extendedGuarantee;

	/**
	"has Agent"@en

	"The Agents for which this Connector may initiate and receive Messages."@en
	*/
	@JsonAlias({"ids:hasAgent", "hasAgent"})
	 java.util.ArrayList<? extends URI> _hasAgent;

	/**
	"has default endpoint"@en

	"Indicates the default endpoint that should be used for basic infrastructure interactions, e.g., providing the self description."@en
	*/
	@JsonAlias({"ids:hasDefaultEndpoint", "hasDefaultEndpoint"})
	 ConnectorEndpoint _hasDefaultEndpoint;

	/**
	"has endpoint"@en

	"Reference to the Endpoints serving the resource\'s content or let you exchange messages with an IDS Connector."@en
	*/
	@JsonAlias({"ids:hasEndpoint", "hasEndpoint"})
	 java.util.ArrayList<? extends ConnectorEndpoint> _hasEndpoint;

	/**
	"inboundModelVersion"@en

	"Information Model version that the InfrastructureComponent is capable of reading/processing."@en
	*/
	@NotEmpty@JsonAlias({"ids:inboundModelVersion", "inboundModelVersion"})
	 java.util.ArrayList<? extends String> _inboundModelVersion;

	/**
	"maintainer"@en

	"Participant responsible for technical maintenance of the InfrastructureComponent."@en
	*/
	@NotNull@JsonAlias({"ids:maintainer", "maintainer"})
	 URI _maintainer;

	/**
	"outbound model version"@en

	"Information Model version being produced by the InfrastructureComponent."@en
	*/
	@NotNull@JsonAlias({"ids:outboundModelVersion", "outboundModelVersion"})
	 String _outboundModelVersion;

	/**
	"physicalLocation"@en

	"The location where the Connector is physically deployed."@en
	*/
	@JsonAlias({"ids:physicalLocation", "physicalLocation"})
	 Location _physicalLocation;

	/**
	"Public Key"@en

	"Public Key that has been created for the Component."@en
	*/
	@JsonAlias({"ids:publicKey", "publicKey"})
	 PublicKey _publicKey;

	/**
	"resource catalog"@en

	"References the Catalog of published or requested resource by this Connector."@en
	*/
	@JsonAlias({"ids:resourceCatalog", "resourceCatalog"})
	 java.util.ArrayList<? extends ResourceCatalog> _resourceCatalog;

	/**
	"securityProfile"@en

	"The SecurityProfile supported by the Connector."@en
	*/
	@NotNull@JsonAlias({"ids:securityProfile", "securityProfile"})
	 SecurityProfile _securityProfile;

	/**
	"title"@en

	"(Localized) name of the entity."@en
	*/
	@JsonAlias({"ids:title", "title"})
	 java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _title;

	/**
	"version"@en

	"Version identifier of the Managed Entity"@en
	*/
	@JsonAlias({"ids:version", "version"})
	 String _version;

	// no manual construction
	TrustedConnectorImpl() {
		id = VocabUtil.getInstance().createRandomUrl("trustedConnector");
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
	
	
	@JsonProperty("ids:hasEndpoint")
	java.util.ArrayList<? extends ConnectorEndpoint> getHasEndpoint() {
		return _hasEndpoint;
	}
	final public void setHasEndpoint (java.util.ArrayList<? extends ConnectorEndpoint> _hasEndpoint_) {
		this._hasEndpoint = _hasEndpoint_;
	}

	final public 
	
	
	@JsonProperty("ids:hasAgent")
	java.util.ArrayList<? extends URI> getHasAgent() {
		return _hasAgent;
	}
	final public void setHasAgent (java.util.ArrayList<? extends URI> _hasAgent_) {
		this._hasAgent = _hasAgent_;
	}

	final public 
	
	
	@JsonProperty("ids:resourceCatalog")
	java.util.ArrayList<? extends ResourceCatalog> getResourceCatalog() {
		return _resourceCatalog;
	}
	final public void setResourceCatalog (java.util.ArrayList<? extends ResourceCatalog> _resourceCatalog_) {
		this._resourceCatalog = _resourceCatalog_;
	}

	final public 
	
	
	@JsonProperty("ids:hasDefaultEndpoint")
	ConnectorEndpoint getHasDefaultEndpoint() {
		return _hasDefaultEndpoint;
	}
	final public void setHasDefaultEndpoint (ConnectorEndpoint _hasDefaultEndpoint_) {
		this._hasDefaultEndpoint = _hasDefaultEndpoint_;
	}

	final public 
	
	
	@JsonProperty("ids:authInfo")
	AuthInfo getAuthInfo() {
		return _authInfo;
	}
	final public void setAuthInfo (AuthInfo _authInfo_) {
		this._authInfo = _authInfo_;
	}

	final public 
	
	@NotNull
	@JsonProperty("ids:securityProfile")
	SecurityProfile getSecurityProfile() {
		return _securityProfile;
	}
	final public void setSecurityProfile (SecurityProfile _securityProfile_) {
		this._securityProfile = _securityProfile_;
	}

	final public 
	
	
	@JsonProperty("ids:extendedGuarantee")
	java.util.ArrayList<? extends SecurityGuarantee> getExtendedGuarantee() {
		return _extendedGuarantee;
	}
	final public void setExtendedGuarantee (java.util.ArrayList<? extends SecurityGuarantee> _extendedGuarantee_) {
		this._extendedGuarantee = _extendedGuarantee_;
	}

	final public 
	
	@NotNull
	@JsonProperty("ids:maintainer")
	URI getMaintainer() {
		return _maintainer;
	}
	final public void setMaintainer (URI _maintainer_) {
		this._maintainer = _maintainer_;
	}

	final public 
	
	@NotNull
	@JsonProperty("ids:curator")
	URI getCurator() {
		return _curator;
	}
	final public void setCurator (URI _curator_) {
		this._curator = _curator_;
	}

	final public 
	
	@NotEmpty
	@JsonProperty("ids:inboundModelVersion")
	java.util.ArrayList<? extends String> getInboundModelVersion() {
		return _inboundModelVersion;
	}
	final public void setInboundModelVersion (java.util.ArrayList<? extends String> _inboundModelVersion_) {
		this._inboundModelVersion = _inboundModelVersion_;
	}

	final public 
	
	@NotNull
	@JsonProperty("ids:outboundModelVersion")
	String getOutboundModelVersion() {
		return _outboundModelVersion;
	}
	final public void setOutboundModelVersion (String _outboundModelVersion_) {
		this._outboundModelVersion = _outboundModelVersion_;
	}

	final public 
	
	
	@JsonProperty("ids:physicalLocation")
	Location getPhysicalLocation() {
		return _physicalLocation;
	}
	final public void setPhysicalLocation (Location _physicalLocation_) {
		this._physicalLocation = _physicalLocation_;
	}

	final public 
	
	
	@JsonProperty("ids:componentCertification")
	ComponentCertification getComponentCertification() {
		return _componentCertification;
	}
	final public void setComponentCertification (ComponentCertification _componentCertification_) {
		this._componentCertification = _componentCertification_;
	}

	final public 
	
	
	@JsonProperty("ids:publicKey")
	PublicKey getPublicKey() {
		return _publicKey;
	}
	final public void setPublicKey (PublicKey _publicKey_) {
		this._publicKey = _publicKey_;
	}

	final public 
	
	
	@JsonProperty("ids:version")
	String getVersion() {
		return _version;
	}
	final public void setVersion (String _version_) {
		this._version = _version_;
	}

	final public 
	
	
	@JsonProperty("ids:title")
	java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> getTitle() {
		return _title;
	}
	final public void setTitle (java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _title_) {
		this._title = _title_;
	}

	final public 
	
	
	@JsonProperty("ids:description")
	java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> getDescription() {
		return _description;
	}
	final public void setDescription (java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _description_) {
		this._description = _description_;
	}
}
