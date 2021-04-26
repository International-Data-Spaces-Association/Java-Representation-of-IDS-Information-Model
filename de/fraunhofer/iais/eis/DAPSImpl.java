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
* "Dynamic Attribute Provisioning Service"@en
* "The Dynamic Attribute Provisioning Service (DAPS) is a component of the Identity Provider and manages and issues the Dynamic Attribute Tokens (DAT), acting as digtial proofs for dynamic attributes of both connectors and participants."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:DAPS")
public class DAPSImpl implements Serializable, DAPS {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Dynamic Attribute Provisioning Service", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("The Dynamic Attribute Provisioning Service (DAPS) is a component of the Identity Provider and manages and issues the Dynamic Attribute Tokens (DAT), acting as digtial proofs for dynamic attributes of both connectors and participants.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDSA Information Model ontology

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
	protected DAPSImpl() {
		id = VocabUtil.getInstance().createRandomUrl("dAPS");
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
		return Objects.hash(new Object[]{this._maintainer,
			this._curator,
			this._physicalLocation,
			this._inboundModelVersion,
			this._outboundModelVersion,
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
			DAPSImpl other = (DAPSImpl) obj;
			return Objects.equals(this._maintainer, other._maintainer) &&
				Objects.equals(this._curator, other._curator) &&
				Objects.equals(this._physicalLocation, other._physicalLocation) &&
				Objects.equals(this._inboundModelVersion, other._inboundModelVersion) &&
				Objects.equals(this._outboundModelVersion, other._outboundModelVersion) &&
				Objects.equals(this._componentCertification, other._componentCertification) &&
				Objects.equals(this._publicKey, other._publicKey) &&
				Objects.equals(this._version, other._version) &&
				Objects.equals(this._title, other._title) &&
				Objects.equals(this._description, other._description);
		}
	}


	// accessor method implementations as derived from the IDSA Information Model ontology



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

	@JsonProperty("ids:physicalLocation")
	final public Location getPhysicalLocation() {
		return _physicalLocation;
	}
	
	final public void setPhysicalLocation (Location _physicalLocation_) {
		this._physicalLocation = _physicalLocation_;
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
