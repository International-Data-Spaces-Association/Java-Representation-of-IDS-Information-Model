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
	"Instant"@en

	"A defined point in time with zero duration."@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:Instant")
public class InstantImpl implements Serializable, Instant {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Instant", "en"));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("A defined point in time with zero duration.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

	/**
	"date time"@en

	"Absolute date time with a defined time zone."@en
	*/
	@JsonAlias({"ids:dateTime", "dateTime"})
	 XMLGregorianCalendar _dateTime;

	/**
	"has duration"@en

	"Duration (relative time interval) of a temporal specification. Different to the TIME Ontology, durations are expressed using the xsd:duration datatype. In case it is used with a instance of ids:Instant, the value must be \'P0Y0M0DT0H0M0S\'^^xsd:duration."@en
	*/
	@JsonAlias({"ids:hasDuration", "hasDuration"})
	 javax.xml.datatype.Duration _hasDuration;

	// no manual construction
	InstantImpl() {
		id = VocabUtil.getInstance().createRandomUrl("instant");
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
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	
	@JsonProperty("ids:dateTime")
	XMLGregorianCalendar getDateTime() {
		return _dateTime;
	}
	final public void setDateTime (XMLGregorianCalendar _dateTime_) {
		this._dateTime = _dateTime_;
	}

	final public 
	
	
	@JsonProperty("ids:hasDuration")
	javax.xml.datatype.Duration getHasDuration() {
		return _hasDuration;
	}
	final public void setHasDuration (javax.xml.datatype.Duration _hasDuration_) {
		this._hasDuration = _hasDuration_;
	}


}
