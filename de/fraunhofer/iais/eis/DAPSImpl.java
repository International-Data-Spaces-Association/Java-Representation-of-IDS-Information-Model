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
	protected ArrayList<? extends TypedLiteral> _description;


	/**
	* "inboundModelVersion"@en
	* "Information Model version that the InfrastructureComponent is capable of reading/processing."@en
	*/
	@NotEmpty
	@JsonAlias({"ids:inboundModelVersion", "inboundModelVersion"})
	protected ArrayList<? extends String> _inboundModelVersion;


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
	protected ArrayList<? extends TypedLiteral> _title;


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
	* "Participant responsible for technical maintenance of the InfrastructureComponent."@en
	* @return Returns the URI for the property maintainer.
	* More information under https://w3id.org/idsa/core/maintainer
	*/
	@NotNull
	@JsonProperty("ids:maintainer")
	final public URI getMaintainer() {
		return _maintainer;
	}

	
	/**
	* "Participant responsible for technical maintenance of the InfrastructureComponent."@en
	* @param _maintainer_ desired value for the property maintainer.
	* More information under https://w3id.org/idsa/core/maintainer
	*/
	final public void setMaintainer (URI _maintainer_) {
		this._maintainer = _maintainer_;
	}

	/**
	* "Participant responsible for the correctness of the content offered by the InfrastructureComponent."@en
	* @return Returns the URI for the property curator.
	* More information under https://w3id.org/idsa/core/curator
	*/
	@NotNull
	@JsonProperty("ids:curator")
	final public URI getCurator() {
		return _curator;
	}

	
	/**
	* "Participant responsible for the correctness of the content offered by the InfrastructureComponent."@en
	* @param _curator_ desired value for the property curator.
	* More information under https://w3id.org/idsa/core/curator
	*/
	final public void setCurator (URI _curator_) {
		this._curator = _curator_;
	}

	/**
	* "Information Model version that the InfrastructureComponent is capable of reading/processing."@en
	* @return Returns the ArrayList of String for the property inboundModelVersion.
	* More information under https://w3id.org/idsa/core/inboundModelVersion
	*/
	@NotEmpty
	@JsonProperty("ids:inboundModelVersion")
	final public ArrayList<? extends String> getInboundModelVersion() {
		return _inboundModelVersion;
	}

	
	/**
	* "Information Model version that the InfrastructureComponent is capable of reading/processing."@en
	* @param _inboundModelVersion_ desired value for the property inboundModelVersion.
	* More information under https://w3id.org/idsa/core/inboundModelVersion
	*/
	final public void setInboundModelVersion (ArrayList<? extends String> _inboundModelVersion_) {
		this._inboundModelVersion = _inboundModelVersion_;
	}

	/**
	* "Information Model version being produced by the InfrastructureComponent."@en
	* @return Returns the String for the property outboundModelVersion.
	* More information under https://w3id.org/idsa/core/outboundModelVersion
	*/
	@NotNull
	@JsonProperty("ids:outboundModelVersion")
	final public String getOutboundModelVersion() {
		return _outboundModelVersion;
	}

	
	/**
	* "Information Model version being produced by the InfrastructureComponent."@en
	* @param _outboundModelVersion_ desired value for the property outboundModelVersion.
	* More information under https://w3id.org/idsa/core/outboundModelVersion
	*/
	final public void setOutboundModelVersion (String _outboundModelVersion_) {
		this._outboundModelVersion = _outboundModelVersion_;
	}

	/**
	* "The location where the Connector is physically deployed."@en
	* @return Returns the Location for the property physicalLocation.
	* More information under https://w3id.org/idsa/core/physicalLocation
	*/
	@JsonProperty("ids:physicalLocation")
	final public Location getPhysicalLocation() {
		return _physicalLocation;
	}

	
	/**
	* "The location where the Connector is physically deployed."@en
	* @param _physicalLocation_ desired value for the property physicalLocation.
	* More information under https://w3id.org/idsa/core/physicalLocation
	*/
	final public void setPhysicalLocation (Location _physicalLocation_) {
		this._physicalLocation = _physicalLocation_;
	}

	/**
	* "Certification issued for the given Infrastructure Component."@en
	* @return Returns the ComponentCertification for the property componentCertification.
	* More information under https://w3id.org/idsa/core/componentCertification
	*/
	@JsonProperty("ids:componentCertification")
	final public ComponentCertification getComponentCertification() {
		return _componentCertification;
	}

	
	/**
	* "Certification issued for the given Infrastructure Component."@en
	* @param _componentCertification_ desired value for the property componentCertification.
	* More information under https://w3id.org/idsa/core/componentCertification
	*/
	final public void setComponentCertification (ComponentCertification _componentCertification_) {
		this._componentCertification = _componentCertification_;
	}

	/**
	* "Public Key that has been created for the Component."@en
	* @return Returns the PublicKey for the property publicKey.
	* More information under https://w3id.org/idsa/core/publicKey
	*/
	@JsonProperty("ids:publicKey")
	final public PublicKey getPublicKey() {
		return _publicKey;
	}

	
	/**
	* "Public Key that has been created for the Component."@en
	* @param _publicKey_ desired value for the property publicKey.
	* More information under https://w3id.org/idsa/core/publicKey
	*/
	final public void setPublicKey (PublicKey _publicKey_) {
		this._publicKey = _publicKey_;
	}

	/**
	* "Version identifier of the Managed Entity"@en
	* @return Returns the String for the property version.
	* More information under https://w3id.org/idsa/core/version
	*/
	@JsonProperty("ids:version")
	final public String getVersion() {
		return _version;
	}

	
	/**
	* "Version identifier of the Managed Entity"@en
	* @param _version_ desired value for the property version.
	* More information under https://w3id.org/idsa/core/version
	*/
	final public void setVersion (String _version_) {
		this._version = _version_;
	}

	/**
	* "(Localized) name of the entity."@en
	* @return Returns the ArrayList of TypedLiteral for the property title.
	* More information under https://w3id.org/idsa/core/title
	*/
	@JsonProperty("ids:title")
	final public ArrayList<? extends TypedLiteral> getTitle() {
		return _title;
	}

	
	/**
	* "(Localized) name of the entity."@en
	* @param _title_ desired value for the property title.
	* More information under https://w3id.org/idsa/core/title
	*/
	final public void setTitle (ArrayList<? extends TypedLiteral> _title_) {
		this._title = _title_;
	}

	/**
	* "Explanation of the resource in a natural language text."@en
	* @return Returns the ArrayList of TypedLiteral for the property description.
	* More information under https://w3id.org/idsa/core/description
	*/
	@JsonProperty("ids:description")
	final public ArrayList<? extends TypedLiteral> getDescription() {
		return _description;
	}

	
	/**
	* "Explanation of the resource in a natural language text."@en
	* @param _description_ desired value for the property description.
	* More information under https://w3id.org/idsa/core/description
	*/
	final public void setDescription (ArrayList<? extends TypedLiteral> _description_) {
		this._description = _description_;
	}
}
