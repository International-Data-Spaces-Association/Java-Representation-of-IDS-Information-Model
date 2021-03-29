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
	"Digital content"@en

	"Digital content of a particular type providing hints on its usage, e.g. listening to an Audio, navigating a Structure or accessing a List by an index."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = Resource.class),})
public interface DigitalContent extends Described {

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
	"content part"@en

	"Reference to a Digital Content (physically or logically) included, definition of part-whole hierarchies."@en
	*/
	
	
	@JsonProperty("ids:contentPart")
	java.util.ArrayList<? extends DigitalContent> getContentPart();
	/**
	"spatial coverage"@en

	"Named spatial entity covered by the Resource."@en
	*/
	
	
	@JsonProperty("ids:spatialCoverage")
	java.util.ArrayList<? extends Location> getSpatialCoverage();
	/**
	"temporal coverage"@en

	"Temporal period or instance covered by the content."@en
	*/
	
	
	@JsonProperty("ids:temporalCoverage")
	java.util.ArrayList<? extends TemporalEntity> getTemporalCoverage();
	/**
	"theme"@en

	"Abstract or concrete concept related to or referred by the content."@en
	*/
	
	
	@JsonProperty("ids:theme")
	java.util.ArrayList<? extends URI> getTheme();
	/**
	"keyword"@en

	"Controlled keywords that describe the nature, purpose, or use of the content."@en
	*/
	
	
	@JsonProperty("ids:keyword")
	java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> getKeyword();
	/**
	"representation"@en

	"Representation of the content."@en
	*/
	
	
	@JsonProperty("ids:representation")
	java.util.ArrayList<? extends Representation> getRepresentation();
	/**
	"content type"@en

	"Detailed type, genre or interpretation of the Digital Content."@en
	*/
	
	
	@JsonProperty("ids:contentType")
	ContentType getContentType();
	/**
	"Default representation"@en

	"Default representation of the content."@en
	*/
	
	
	@JsonProperty("ids:defaultRepresentation")
	java.util.ArrayList<? extends Representation> getDefaultRepresentation();
	/**
	"temporal resolution"@en

	"Minimum time between collected data points in a time series within this content."@en
	*/
	
	
	@JsonProperty("ids:temporalResolution")
	Frequency getTemporalResolution();
	/**
	"Accrual periodicity"@en

	"The regular period with which items are added to a collection."@en
	*/
	
	
	@JsonProperty("ids:accrualPeriodicity")
	Frequency getAccrualPeriodicity();
	/**
	"content standard"@en

	"IRI containing document, which defines the standard for the given Digital Content. The content is assumed to conform to that Standard."@en
	*/
	
	
	@JsonProperty("ids:contentStandard")
	URI getContentStandard();
	/**
	"language"@en

	"Natural language(s) used within the content."@en
	*/
	
	
	@JsonProperty("ids:language")
	java.util.ArrayList<? extends Language> getLanguage();
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
