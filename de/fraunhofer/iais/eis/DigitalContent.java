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
* "Digital content"@en
* "Digital content of a particular type providing hints on its usage, e.g. listening to an Audio, navigating a Structure or accessing a List by an index."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = Resource.class)
})
public interface DigitalContent extends Described {

	// standard methods

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	@NotNull
	public URI getId();

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel();

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	public List<TypedLiteral> getComment();

	public String toRdf();

	// getter and setter for generic property map
	public Map<String,Object> getProperties();
	public void setProperty(String property, Object value);

	/**
	* This function returns a hash code value for the DigitalContent for the benefit of e.g. hash tables.
	* @return a hash code value for the DigitalContent
	*/
	public int hashCode();

	/**
	* This function indicates whether some other object is equal to this one.
	* @param obj the reference object with which to compare.
	* @return true if this DigitalContent is the same as the obj argument; false otherwise.
	*/
	public boolean equals(Object obj);

	// accessor methods as derived from the IDSA Information Model ontology


	/**
	* "Detailed type, genre or interpretation of the Digital Content."@en
	* @return Returns the ContentType for the property _contentType.
	* More information under https://w3id.org/idsa/core/contentType
	*/
	@JsonProperty("ids:contentType")
	public ContentType getContentType();

	/**
	* "Reference to a Digital Content (physically or logically) included, definition of part-whole hierarchies."@en
	* @return Returns the List of DigitalContents for the property _contentPart.
	* More information under https://w3id.org/idsa/core/contentPart
	*/
	@JsonProperty("ids:contentPart")
	public List<DigitalContent> getContentPart();

	/**
	* "Representation of the content."@en
	* @return Returns the List of Representations for the property _representation.
	* More information under https://w3id.org/idsa/core/representation
	*/
	@JsonProperty("ids:representation")
	public List<Representation> getRepresentation();

	/**
	* "Default representation of the content."@en
	* @return Returns the List of Representations for the property _defaultRepresentation.
	* More information under https://w3id.org/idsa/core/defaultRepresentation
	*/
	@JsonProperty("ids:defaultRepresentation")
	public List<Representation> getDefaultRepresentation();

	/**
	* "Abstract or concrete concept related to or referred by the content."@en
	* @return Returns the List of URIs for the property _theme.
	* More information under https://w3id.org/idsa/core/theme
	*/
	@JsonProperty("ids:theme")
	public List<URI> getTheme();

	/**
	* "Controlled keywords that describe the nature, purpose, or use of the content."@en
	* @return Returns the List of TypedLiterals for the property _keyword.
	* More information under https://w3id.org/idsa/core/keyword
	*/
	@JsonProperty("ids:keyword")
	public List<TypedLiteral> getKeyword();

	/**
	* "Temporal period or instance covered by the content."@en
	* @return Returns the List of TemporalEntitys for the property _temporalCoverage.
	* More information under https://w3id.org/idsa/core/temporalCoverage
	*/
	@JsonProperty("ids:temporalCoverage")
	public List<TemporalEntity> getTemporalCoverage();

	/**
	* "Minimum time between collected data points in a time series within this content."@en
	* @return Returns the Frequency for the property _temporalResolution.
	* More information under https://w3id.org/idsa/core/temporalResolution
	*/
	@JsonProperty("ids:temporalResolution")
	public Frequency getTemporalResolution();

	/**
	* "Named spatial entity covered by the Resource."@en
	* @return Returns the List of Locations for the property _spatialCoverage.
	* More information under https://w3id.org/idsa/core/spatialCoverage
	*/
	@JsonProperty("ids:spatialCoverage")
	public List<Location> getSpatialCoverage();

	/**
	* "The regular period with which items are added to a collection."@en
	* @return Returns the Frequency for the property _accrualPeriodicity.
	* More information under https://w3id.org/idsa/core/accrualPeriodicity
	*/
	@JsonProperty("ids:accrualPeriodicity")
	public Frequency getAccrualPeriodicity();

	/**
	* "IRI containing document, which defines the standard for the given Digital Content. The content is assumed to conform to that Standard."@en
	* @return Returns the URI for the property _contentStandard.
	* More information under https://w3id.org/idsa/core/contentStandard
	*/
	@JsonProperty("ids:contentStandard")
	public URI getContentStandard();

	/**
	* "Natural language(s) used within the content."@en
	* @return Returns the List of Languages for the property _language.
	* More information under https://w3id.org/idsa/core/language
	*/
	@JsonProperty("ids:language")
	public List<Language> getLanguage();

	/**
	* "The date of the creation of the Digital Content. In contrast to the ids:temporalCoverage, creation dates of ids:Representation, ids:Artifacts or any other form of meta-data, this property describes the creation date of referenced Digital Content itself."@en
	* @return Returns the XMLGregorianCalendar for the property _created.
	* More information under https://w3id.org/idsa/core/created
	*/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@JsonProperty("ids:created")
	public XMLGregorianCalendar getCreated();

	/**
	* "The date/time this Digital Content has been changed the last time. Only one \'modified\' attribute is usually needed."@en
	* @return Returns the XMLGregorianCalendar for the property _modified.
	* More information under https://w3id.org/idsa/core/modified
	*/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@JsonProperty("ids:modified")
	public XMLGregorianCalendar getModified();

}
