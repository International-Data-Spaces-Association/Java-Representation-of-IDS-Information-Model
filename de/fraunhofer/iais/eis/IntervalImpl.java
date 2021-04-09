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
* "Interval"@en
* "A temporal entity with extent or duration, fixed in time (different to ids:DurationEntity)."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:Interval")
public class IntervalImpl implements Serializable, Interval {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Interval", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("A temporal entity with extent or duration, fixed in time (different to ids:DurationEntity).", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDSA Information Model ontology

	/**
	* "beginning"@en
	* "Beginning of an Interval."@en
	*/
	@NotNull
	@JsonAlias({"ids:begin", "begin"})
	protected Instant _begin;


	/**
	* "end"@en
	* "End of an Interval."@en
	*/
	@JsonAlias({"ids:end", "end"})
	protected Instant _end;


	/**
	* "has duration"@en
	* "Duration (relative time interval) of a temporal specification. Different to the TIME Ontology, durations are expressed using the xsd:duration datatype. In case it is used with a instance of ids:Instant, the value must be \'P0Y0M0DT0H0M0S\'^^xsd:duration."@en
	*/
	@JsonAlias({"ids:hasDuration", "hasDuration"})
	protected javax.xml.datatype.Duration _hasDuration;


	// no manual construction
	protected IntervalImpl() {
		id = VocabUtil.getInstance().createRandomUrl("interval");
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
	* "Beginning of an Interval."@en
	* @return Returns the Instant for the property begin.
	* More information under https://w3id.org/idsa/core/begin
	*/
	@NotNull
	@JsonProperty("ids:begin")
	final public Instant getBegin() {
		return _begin;
	}

	
	/**
	* "Beginning of an Interval."@en
	* @param _begin_ desired value for the property begin.
	* More information under https://w3id.org/idsa/core/begin
	*/
	final public void setBegin (Instant _begin_) {
		this._begin = _begin_;
	}

	/**
	* "End of an Interval."@en
	* @return Returns the Instant for the property end.
	* More information under https://w3id.org/idsa/core/end
	*/
	@JsonProperty("ids:end")
	final public Instant getEnd() {
		return _end;
	}

	
	/**
	* "End of an Interval."@en
	* @param _end_ desired value for the property end.
	* More information under https://w3id.org/idsa/core/end
	*/
	final public void setEnd (Instant _end_) {
		this._end = _end_;
	}

	/**
	* "Duration (relative time interval) of a temporal specification. Different to the TIME Ontology, durations are expressed using the xsd:duration datatype. In case it is used with a instance of ids:Instant, the value must be \'P0Y0M0DT0H0M0S\'^^xsd:duration."@en
	* @return Returns the javax.xml.datatype.Duration for the property hasDuration.
	* More information under https://w3id.org/idsa/core/hasDuration
	*/
	@JsonProperty("ids:hasDuration")
	final public javax.xml.datatype.Duration getHasDuration() {
		return _hasDuration;
	}

	
	/**
	* "Duration (relative time interval) of a temporal specification. Different to the TIME Ontology, durations are expressed using the xsd:duration datatype. In case it is used with a instance of ids:Instant, the value must be \'P0Y0M0DT0H0M0S\'^^xsd:duration."@en
	* @param _hasDuration_ desired value for the property hasDuration.
	* More information under https://w3id.org/idsa/core/hasDuration
	*/
	final public void setHasDuration (javax.xml.datatype.Duration _hasDuration_) {
		this._hasDuration = _hasDuration_;
	}



}
