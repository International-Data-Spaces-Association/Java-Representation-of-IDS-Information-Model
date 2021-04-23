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
* "Participant Information Service"@en
* "The Participant Information Service (ParIS) provides metadata and relevant information about participants (humans and organizations) in the International Data Spaces."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:ParIS")
public class ParISImpl implements Serializable, ParIS {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Participant Information Service", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("The Participant Information Service (ParIS) provides metadata and relevant information about participants (humans and organizations) in the International Data Spaces.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDSA Information Model ontology

	/**
	* "authInfo"@en
	* "Information of the authentication service used by the Connector."@en
	*/
	@JsonAlias({"ids:authInfo", "authInfo"})
	protected AuthInfo _authInfo;


	/**
	* "component certification"@en
	* "Certification issued for the given Infrastructure Component."@en
	*/
	@JsonAlias({"ids:componentCertification", "componentCertification"})
	protected ComponentCertification _componentCertification;


	/**
	* "curator"@en
	* "Participant responsible for the correctness of the content offered by the InfrastructureComponent."@en
	*/
	@NotNull
	@JsonAlias({"ids:curator", "curator"})
	protected URI _curator;


	/**
	* "description"@en
	* "Explanation of the resource in a natural language text."@en
	*/
	@JsonAlias({"ids:description", "description"})
	protected List<TypedLiteral> _description;


	/**
	* "extended guarantee"@en
	* "Reference to a security guarantee that, if used in combination with a security profile instance, overrides the respective guarantee of the given predefined instance."@en
	*/
	@JsonAlias({"ids:extendedGuarantee", "extendedGuarantee"})
	protected List<SecurityGuarantee> _extendedGuarantee;


	/**
	* "has Agent"@en
	* "The Agents for which this Connector may initiate and receive Messages."@en
	*/
	@JsonAlias({"ids:hasAgent", "hasAgent"})
	protected List<URI> _hasAgent;


	/**
	* "has default endpoint"@en
	* "Indicates the default endpoint that should be used for basic infrastructure interactions, e.g., providing the self description."@en
	*/
	@NotNull
	@JsonAlias({"ids:hasDefaultEndpoint", "hasDefaultEndpoint"})
	protected ConnectorEndpoint _hasDefaultEndpoint;


	/**
	* "has endpoint"@en
	* "Reference to the Endpoints that serve the resource\'s content or let you exchange messages with an IDS Connector."@en
	*/
	@JsonAlias({"ids:hasEndpoint", "hasEndpoint"})
	protected List<ConnectorEndpoint> _hasEndpoint;


	/**
	* "inboundModelVersion"@en
	* "Information Model version that the InfrastructureComponent is capable of reading/processing."@en
	*/
	@NotEmpty
	@JsonAlias({"ids:inboundModelVersion", "inboundModelVersion"})
	protected List<String> _inboundModelVersion;


	/**
	* "maintainer"@en
	* "Participant responsible for technical maintenance of the InfrastructureComponent."@en
	*/
	@NotNull
	@JsonAlias({"ids:maintainer", "maintainer"})
	protected URI _maintainer;


	/**
	* "outbound model version"@en
	* "Information Model version being produced by the InfrastructureComponent."@en
	*/
	@NotNull
	@JsonAlias({"ids:outboundModelVersion", "outboundModelVersion"})
	protected String _outboundModelVersion;


	/**
	* "participant catalog"@en
	* "List of participants a ParIS may expose."@en
	*/
	@JsonAlias({"ids:participantCatalog", "participantCatalog"})
	protected List<ParticipantCatalog> _participantCatalog;


	/**
	* "physicalLocation"@en
	* "The location where the Connector is physically deployed."@en
	*/
	@JsonAlias({"ids:physicalLocation", "physicalLocation"})
	protected Location _physicalLocation;


	/**
	* "Public Key"@en
	* "Public Key that has been created for the Component."@en
	*/
	@JsonAlias({"ids:publicKey", "publicKey"})
	protected PublicKey _publicKey;


	/**
	* "resource catalog"@en
	* "References the Catalog of published or requested resource by this Connector."@en
	*/
	@JsonAlias({"ids:resourceCatalog", "resourceCatalog"})
	protected List<ResourceCatalog> _resourceCatalog;


	/**
	* "securityProfile"@en
	* "The SecurityProfile supported by the Connector."@en
	*/
	@NotNull
	@JsonAlias({"ids:securityProfile", "securityProfile"})
	protected SecurityProfile _securityProfile;


	/**
	* "title"@en
	* "(Localized) name of the entity."@en
	*/
	@JsonAlias({"ids:title", "title"})
	protected List<TypedLiteral> _title;


	/**
	* "version"@en
	* "Version identifier of the Managed Entity"@en
	*/
	@JsonAlias({"ids:version", "version"})
	protected String _version;


	// no manual construction
	protected ParISImpl() {
		id = VocabUtil.getInstance().createRandomUrl("parIS");
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
		return Objects.hash(new Object[]{this._participantCatalog,
			this._hasEndpoint,
			this._hasAgent,
			this._resourceCatalog,
			this._hasDefaultEndpoint,
			this._authInfo,
			this._securityProfile,
			this._extendedGuarantee,
			this._maintainer,
			this._curator,
			this._inboundModelVersion,
			this._outboundModelVersion,
			this._physicalLocation,
			this._componentCertification,
			this._publicKey,
			this._version,
			this._title,
			this._description});
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			ParISImpl other = (ParISImpl) obj;
			return Objects.equals(this._participantCatalog, other._participantCatalog) &&
				Objects.equals(this._hasEndpoint, other._hasEndpoint) &&
				Objects.equals(this._hasAgent, other._hasAgent) &&
				Objects.equals(this._resourceCatalog, other._resourceCatalog) &&
				Objects.equals(this._hasDefaultEndpoint, other._hasDefaultEndpoint) &&
				Objects.equals(this._authInfo, other._authInfo) &&
				Objects.equals(this._securityProfile, other._securityProfile) &&
				Objects.equals(this._extendedGuarantee, other._extendedGuarantee) &&
				Objects.equals(this._maintainer, other._maintainer) &&
				Objects.equals(this._curator, other._curator) &&
				Objects.equals(this._inboundModelVersion, other._inboundModelVersion) &&
				Objects.equals(this._outboundModelVersion, other._outboundModelVersion) &&
				Objects.equals(this._physicalLocation, other._physicalLocation) &&
				Objects.equals(this._componentCertification, other._componentCertification) &&
				Objects.equals(this._publicKey, other._publicKey) &&
				Objects.equals(this._version, other._version) &&
				Objects.equals(this._title, other._title) &&
				Objects.equals(this._description, other._description);
		}
	}


	// accessor method implementations as derived from the IDSA Information Model ontology


	@JsonProperty("ids:participantCatalog")
	final public List<ParticipantCatalog> getParticipantCatalog() {
		return _participantCatalog;
	}
	
	final public void setParticipantCatalog (List<ParticipantCatalog> _participantCatalog_) {
		this._participantCatalog = _participantCatalog_;
	}

	@JsonProperty("ids:hasEndpoint")
	final public List<ConnectorEndpoint> getHasEndpoint() {
		return _hasEndpoint;
	}
	
	final public void setHasEndpoint (List<ConnectorEndpoint> _hasEndpoint_) {
		this._hasEndpoint = _hasEndpoint_;
	}

	@JsonProperty("ids:hasAgent")
	final public List<URI> getHasAgent() {
		return _hasAgent;
	}
	
	final public void setHasAgent (List<URI> _hasAgent_) {
		this._hasAgent = _hasAgent_;
	}

	@JsonProperty("ids:resourceCatalog")
	final public List<ResourceCatalog> getResourceCatalog() {
		return _resourceCatalog;
	}
	
	final public void setResourceCatalog (List<ResourceCatalog> _resourceCatalog_) {
		this._resourceCatalog = _resourceCatalog_;
	}

	@NotNull
	@JsonProperty("ids:hasDefaultEndpoint")
	final public ConnectorEndpoint getHasDefaultEndpoint() {
		return _hasDefaultEndpoint;
	}
	
	final public void setHasDefaultEndpoint (ConnectorEndpoint _hasDefaultEndpoint_) {
		this._hasDefaultEndpoint = _hasDefaultEndpoint_;
	}

	@JsonProperty("ids:authInfo")
	final public AuthInfo getAuthInfo() {
		return _authInfo;
	}
	
	final public void setAuthInfo (AuthInfo _authInfo_) {
		this._authInfo = _authInfo_;
	}

	@NotNull
	@JsonProperty("ids:securityProfile")
	final public SecurityProfile getSecurityProfile() {
		return _securityProfile;
	}
	
	final public void setSecurityProfile (SecurityProfile _securityProfile_) {
		this._securityProfile = _securityProfile_;
	}

	@JsonProperty("ids:extendedGuarantee")
	final public List<SecurityGuarantee> getExtendedGuarantee() {
		return _extendedGuarantee;
	}
	
	final public void setExtendedGuarantee (List<SecurityGuarantee> _extendedGuarantee_) {
		this._extendedGuarantee = _extendedGuarantee_;
	}

	@NotNull
	@JsonProperty("ids:maintainer")
	final public URI getMaintainer() {
		return _maintainer;
	}
	
	final public void setMaintainer (URI _maintainer_) {
		this._maintainer = _maintainer_;
	}

	@NotNull
	@JsonProperty("ids:curator")
	final public URI getCurator() {
		return _curator;
	}
	
	final public void setCurator (URI _curator_) {
		this._curator = _curator_;
	}

	@NotEmpty
	@JsonProperty("ids:inboundModelVersion")
	final public List<String> getInboundModelVersion() {
		return _inboundModelVersion;
	}
	
	final public void setInboundModelVersion (List<String> _inboundModelVersion_) {
		this._inboundModelVersion = _inboundModelVersion_;
	}

	@NotNull
	@JsonProperty("ids:outboundModelVersion")
	final public String getOutboundModelVersion() {
		return _outboundModelVersion;
	}
	
	final public void setOutboundModelVersion (String _outboundModelVersion_) {
		this._outboundModelVersion = _outboundModelVersion_;
	}

	@JsonProperty("ids:physicalLocation")
	final public Location getPhysicalLocation() {
		return _physicalLocation;
	}
	
	final public void setPhysicalLocation (Location _physicalLocation_) {
		this._physicalLocation = _physicalLocation_;
	}

	@JsonProperty("ids:componentCertification")
	final public ComponentCertification getComponentCertification() {
		return _componentCertification;
	}
	
	final public void setComponentCertification (ComponentCertification _componentCertification_) {
		this._componentCertification = _componentCertification_;
	}

	@JsonProperty("ids:publicKey")
	final public PublicKey getPublicKey() {
		return _publicKey;
	}
	
	final public void setPublicKey (PublicKey _publicKey_) {
		this._publicKey = _publicKey_;
	}

	@JsonProperty("ids:version")
	final public String getVersion() {
		return _version;
	}
	
	final public void setVersion (String _version_) {
		this._version = _version_;
	}

	@JsonProperty("ids:title")
	final public List<TypedLiteral> getTitle() {
		return _title;
	}
	
	final public void setTitle (List<TypedLiteral> _title_) {
		this._title = _title_;
	}

	@JsonProperty("ids:description")
	final public List<TypedLiteral> getDescription() {
		return _description;
	}
	
	final public void setDescription (List<TypedLiteral> _description_) {
		this._description = _description_;
	}
}
