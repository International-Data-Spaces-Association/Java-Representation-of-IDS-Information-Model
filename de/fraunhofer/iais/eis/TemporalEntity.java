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
	"TemporalEntity"@en

	"A temporal interval, instant or a relative duration."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = TemporalEntityImpl.class),
@JsonSubTypes.Type(value = DurationEntity.class),

@JsonSubTypes.Type(value = Instant.class),

@JsonSubTypes.Type(value = Interval.class),})
public interface TemporalEntity {

	// standard methods

	@JsonProperty("@id")
	@javax.validation.constraints.NotNull URI getId();
	java.util.List<TypedLiteral> getLabel();
	java.util.List<TypedLiteral> getComment();
	String toRdf();

	// getter and setter for generic property map
	public java.util.Map<String,Object> getProperties();
	public void setProperty(String property, Object value);

	// accessor methods as derived from information model
	/**
	"has duration"@en

	"Duration (relative time interval) of a temporal specification. Different to the TIME Ontology, durations are expressed using the xsd:duration datatype. In case it is used with a instance of ids:Instant, the value must be \'P0Y0M0DT0H0M0S\'^^xsd:duration."@en
	*/
	
	
	@JsonProperty("ids:hasDuration")
	javax.xml.datatype.Duration getHasDuration();
}
