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
	"Representation"@en

	"Syntactic template of a Resource."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = RepresentationImpl.class),
@JsonSubTypes.Type(value = AudioRepresentation.class),

@JsonSubTypes.Type(value = DataRepresentation.class),

@JsonSubTypes.Type(value = ImageRepresentation.class),

@JsonSubTypes.Type(value = SoftwareRepresentation.class),

@JsonSubTypes.Type(value = TextRepresentation.class),

@JsonSubTypes.Type(value = VideoRepresentation.class),})
public interface Representation extends Asset
, DescribedSemantically {

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
	"instance"@en

	"Reference to an instance of given representation, i.e. inline value or file placeholder."@en
	*/
	
	
	@JsonProperty("ids:instance")
	java.util.ArrayList<? extends RepresentationInstance> getInstance();
	/**
	"media type"@en

	"Media Type of the Representation."@en
	*/
	
	
	@JsonProperty("ids:mediaType")
	MediaType getMediaType();
	/**
	"representation standard"@en

	"Standards document defining the given Representation (in contrast to general Resource content). The Representation is assumed to conform to that Standard."@en
	*/
	
	
	@JsonProperty("ids:representationStandard")
	URI getRepresentationStandard();
	/**
	"language"@en

	"Natural language(s) used within the content."@en
	*/
	
	
	@JsonProperty("ids:language")
	Language getLanguage();
	/**
	"created"@en

	"The date of the creation of the Digital Content. In contrast to the ids:temporalCoverage, creation dates of ids:Representation, ids:Artifacts or any other form of meta-data, this property describes the creation date of referenced Digital Content itself."@en
	*/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	
	@JsonProperty("ids:created")
	XMLGregorianCalendar getCreated();
	/**
	"modified"@en

	"The date/time this Digital Content has been changed the last time. Only one \'modified\' attribute is usually needed."@en
	*/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	
	@JsonProperty("ids:modified")
	XMLGregorianCalendar getModified();
}
