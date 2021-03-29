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
	"Dynamic Attribute Provisioning Service"@en

	"The Dynamic Attribute Provisioning Service (DAPS) is a component of the Identity Provider and manages and issues the Dynamic Attribute Tokens (DAT), acting as digtial proofs for dynamic attributes of both connectors and participants."@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:DAPS")
public class DAPSImpl implements Serializable, DAPS {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Dynamic Attribute Provisioning Service", "en"));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("The Dynamic Attribute Provisioning Service (DAPS) is a component of the Identity Provider and manages and issues the Dynamic Attribute Tokens (DAT), acting as digtial proofs for dynamic attributes of both connectors and participants.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

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
	DAPSImpl() {
		id = VocabUtil.getInstance().createRandomUrl("dAPS");
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
