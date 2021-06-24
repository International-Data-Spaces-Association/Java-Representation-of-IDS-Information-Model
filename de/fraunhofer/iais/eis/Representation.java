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
* "Representation"@en
* "Syntactic template of a Resource."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = RepresentationImpl.class),
	@JsonSubTypes.Type(value = DataRepresentation.class),
	@JsonSubTypes.Type(value = TextRepresentation.class),
	@JsonSubTypes.Type(value = AudioRepresentation.class),
	@JsonSubTypes.Type(value = ImageRepresentation.class),
	@JsonSubTypes.Type(value = VideoRepresentation.class),
	@JsonSubTypes.Type(value = SoftwareRepresentation.class)
})
public interface Representation extends Asset, DescribedSemantically {

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

	// accessor methods as derived from the IDS Information Model ontology


	/**
	* "Reference to an instance of given representation, i.e. inline value or file placeholder."@en
	* @return Returns the List of RepresentationInstances for the property _instance.
	* More information under https://w3id.org/idsa/core/instance
	*/
	@JsonProperty("ids:instance")
	public List<RepresentationInstance> getInstance();

	/**
	* "Media Type of the Representation."@en
	* @return Returns the MediaType for the property _mediaType.
	* More information under https://w3id.org/idsa/core/mediaType
	*/
	@JsonProperty("ids:mediaType")
	public MediaType getMediaType();

	/**
	* "Standards document defining the given Representation (in contrast to general Resource content). The Representation is assumed to conform to that Standard."@en
	* @return Returns the URI for the property _representationStandard.
	* More information under https://w3id.org/idsa/core/representationStandard
	*/
	@JsonProperty("ids:representationStandard")
	public URI getRepresentationStandard();

	/**
	* "Natural language(s) used within the content."@en
	* @return Returns the Language for the property _language.
	* More information under https://w3id.org/idsa/core/language
	*/
	@JsonProperty("ids:language")
	public Language getLanguage();

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
