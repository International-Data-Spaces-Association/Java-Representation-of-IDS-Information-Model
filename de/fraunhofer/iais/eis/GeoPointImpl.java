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
* "GeoPoint"@en
* "A location identified by geo coordinates."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:GeoPoint")
public class GeoPointImpl implements Serializable, GeoPoint {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("GeoPoint", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("A location identified by geo coordinates.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDSA Information Model ontology

	/**
	* "latitude"@en
	* "Latitude of a GeoPoint (decimal degrees)."@en
	*/
	@NotNull
	@JsonAlias({"ids:latitude", "latitude"})
	protected float _latitude;


	/**
	* "longitude"@en
	* "Longitude of a GeoPoint (decimal degrees)."@en
	*/
	@NotNull
	@JsonAlias({"ids:longitude", "longitude"})
	protected float _longitude;


	// no manual construction
	protected GeoPointImpl() {
		id = VocabUtil.getInstance().createRandomUrl("geoPoint");
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
	* "Latitude of a GeoPoint (decimal degrees)."@en
	* @return Returns the float for the property latitude.
	* More information under https://w3id.org/idsa/core/latitude
	*/
	@NotNull
	@JsonProperty("ids:latitude")
	final public float getLatitude() {
		return _latitude;
	}

	
	/**
	* "Latitude of a GeoPoint (decimal degrees)."@en
	* @param _latitude_ desired value for the property latitude.
	* More information under https://w3id.org/idsa/core/latitude
	*/
	final public void setLatitude (float _latitude_) {
		this._latitude = _latitude_;
	}

	/**
	* "Longitude of a GeoPoint (decimal degrees)."@en
	* @return Returns the float for the property longitude.
	* More information under https://w3id.org/idsa/core/longitude
	*/
	@NotNull
	@JsonProperty("ids:longitude")
	final public float getLongitude() {
		return _longitude;
	}

	
	/**
	* "Longitude of a GeoPoint (decimal degrees)."@en
	* @param _longitude_ desired value for the property longitude.
	* More information under https://w3id.org/idsa/core/longitude
	*/
	final public void setLongitude (float _longitude_) {
		this._longitude = _longitude_;
	}



}
