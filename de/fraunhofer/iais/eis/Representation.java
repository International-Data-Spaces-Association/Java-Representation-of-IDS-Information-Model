package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Syntactic template of a Resource.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = RepresentationImpl.class),
    @JsonSubTypes.Type(value = DataRepresentation.class),
    @JsonSubTypes.Type(value = TextRepresentation.class),
    @JsonSubTypes.Type(value = AudioRepresentation.class),
    @JsonSubTypes.Type(value = ImageRepresentation.class),
    @JsonSubTypes.Type(value = VideoRepresentation.class),
    @JsonSubTypes.Type(value = SoftwareRepresentation.class)
})
public interface Representation extends Asset, Described, DescribedSemantically {

    // standard methods

    @Beta
    public Representation deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Reference to an instance of given representation, i.e. inline value or file placeholder.
     *
     * More information under https://w3id.org/idsa/core/instance
     *
     * @return Returns the List of RepresentationInstances for the property _instance.
     */
    @JsonProperty("ids:instance")
    List<RepresentationInstance> getInstance();

    /**
     * Reference to an instance of given representation, i.e. inline value or file placeholder.
     *
     * More information under https://w3id.org/idsa/core/instance
     *
     * @param _instance_ desired value for the property _instance.
     */
    void setInstance(List<RepresentationInstance> _instance_);

    /**
     * Media Type of the Representation.
     *
     * More information under https://w3id.org/idsa/core/mediaType
     *
     * @return Returns the MediaType for the property _mediaType.
     */
    @JsonProperty("ids:mediaType")
    MediaType getMediaType();

    /**
     * Media Type of the Representation.
     *
     * More information under https://w3id.org/idsa/core/mediaType
     *
     * @param _mediaType_ desired value for the property _mediaType.
     */
    void setMediaType(MediaType _mediaType_);

    /**
     * Standards document defining the given Representation (in contrast to general Resource content).
     * The Representation is assumed to conform to that Standard.
     *
     * More information under https://w3id.org/idsa/core/representationStandard
     *
     * @return Returns the URI for the property _representationStandard.
     */
    @JsonProperty("ids:representationStandard")
    URI getRepresentationStandard();

    /**
     * Standards document defining the given Representation (in contrast to general Resource content).
     * The Representation is assumed to conform to that Standard.
     *
     * More information under https://w3id.org/idsa/core/representationStandard
     *
     * @param _representationStandard_ desired value for the property _representationStandard.
     */
    void setRepresentationStandard(URI _representationStandard_);

    /**
     * Natural language(s) used within the content.
     *
     * More information under https://w3id.org/idsa/core/language
     *
     * @return Returns the Language for the property _language.
     */
    @JsonProperty("ids:language")
    Language getLanguage();

    /**
     * Natural language(s) used within the content.
     *
     * More information under https://w3id.org/idsa/core/language
     *
     * @param _language_ desired value for the property _language.
     */
    void setLanguage(Language _language_);

    /**
     * The date of the creation of the Digital Content. In contrast to the ids:temporalCoverage,
     * creation dates of ids:Representation, ids:Artifacts or any other form of meta-data, this property
     * describes the creation date of referenced Digital Content itself.
     *
     * More information under https://w3id.org/idsa/core/created
     *
     * @return Returns the XMLGregorianCalendar for the property _created.
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    @JsonProperty("ids:created")
    XMLGregorianCalendar getCreated();

    /**
     * The date of the creation of the Digital Content. In contrast to the ids:temporalCoverage,
     * creation dates of ids:Representation, ids:Artifacts or any other form of meta-data, this property
     * describes the creation date of referenced Digital Content itself.
     *
     * More information under https://w3id.org/idsa/core/created
     *
     * @param _created_ desired value for the property _created.
     */
    void setCreated(XMLGregorianCalendar _created_);

    /**
     * The date/time this Digital Content has been changed the last time. Only one 'modified' attribute
     * is usually needed.
     *
     * More information under https://w3id.org/idsa/core/modified
     *
     * @return Returns the XMLGregorianCalendar for the property _modified.
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    @JsonProperty("ids:modified")
    XMLGregorianCalendar getModified();

    /**
     * The date/time this Digital Content has been changed the last time. Only one 'modified' attribute
     * is usually needed.
     *
     * More information under https://w3id.org/idsa/core/modified
     *
     * @param _modified_ desired value for the property _modified.
     */
    void setModified(XMLGregorianCalendar _modified_);

}
