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
 * Digital content of a particular type providing hints on its usage, e.g., listening to an Audio,
 * navigating a Structure or accessing a List by an index.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = Resource.class)
})
public interface DigitalContent extends Described {

    // standard methods

    @Beta
    public DigitalContent deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Detailed type, genre or interpretation of the Digital Content.
     *
     * More information under https://w3id.org/idsa/core/contentType
     *
     * @return Returns the ContentType for the property _contentType.
     */
    @JsonProperty("ids:contentType")
    ContentType getContentType();

    /**
     * Detailed type, genre or interpretation of the Digital Content.
     *
     * More information under https://w3id.org/idsa/core/contentType
     *
     * @param _contentType_ desired value for the property _contentType.
     */
    void setContentType(ContentType _contentType_);

    /**
     * Reference to a Digital Content (physically or logically) included, definition of part-whole
     * hierarchies.
     *
     * More information under https://w3id.org/idsa/core/contentPart
     *
     * @return Returns the List of DigitalContents for the property _contentPart.
     */
    @JsonProperty("ids:contentPart")
    List<DigitalContent> getContentPart();

    /**
     * Reference to a Digital Content (physically or logically) included, definition of part-whole
     * hierarchies.
     *
     * More information under https://w3id.org/idsa/core/contentPart
     *
     * @param _contentPart_ desired value for the property _contentPart.
     */
    void setContentPart(List<DigitalContent> _contentPart_);

    /**
     * Representation of the content.
     *
     * More information under https://w3id.org/idsa/core/representation
     *
     * @return Returns the List of Representations for the property _representation.
     */
    @JsonProperty("ids:representation")
    List<Representation> getRepresentation();

    /**
     * Representation of the content.
     *
     * More information under https://w3id.org/idsa/core/representation
     *
     * @param _representation_ desired value for the property _representation.
     */
    void setRepresentation(List<Representation> _representation_);

    /**
     * Default representation of the content.
     *
     * More information under https://w3id.org/idsa/core/defaultRepresentation
     *
     * @return Returns the List of Representations for the property _defaultRepresentation.
     */
    @JsonProperty("ids:defaultRepresentation")
    List<Representation> getDefaultRepresentation();

    /**
     * Default representation of the content.
     *
     * More information under https://w3id.org/idsa/core/defaultRepresentation
     *
     * @param _defaultRepresentation_ desired value for the property _defaultRepresentation.
     */
    void setDefaultRepresentation(List<Representation> _defaultRepresentation_);

    /**
     * Abstract or concrete concept related to or referred by the content.
     *
     * More information under https://w3id.org/idsa/core/theme
     *
     * @return Returns the List of URIs for the property _theme.
     */
    @JsonProperty("ids:theme")
    List<URI> getTheme();

    /**
     * Abstract or concrete concept related to or referred by the content.
     *
     * More information under https://w3id.org/idsa/core/theme
     *
     * @param _theme_ desired value for the property _theme.
     */
    void setTheme(List<URI> _theme_);

    /**
     * Controlled keywords that describe the nature, purpose, or use of the content.
     *
     * More information under https://w3id.org/idsa/core/keyword
     *
     * @return Returns the List of TypedLiterals for the property _keyword.
     */
    @JsonProperty("ids:keyword")
    List<TypedLiteral> getKeyword();

    /**
     * Controlled keywords that describe the nature, purpose, or use of the content.
     *
     * More information under https://w3id.org/idsa/core/keyword
     *
     * @param _keyword_ desired value for the property _keyword.
     */
    void setKeyword(List<TypedLiteral> _keyword_);

    /**
     * Temporal period or instance covered by the content.
     *
     * More information under https://w3id.org/idsa/core/temporalCoverage
     *
     * @return Returns the List of TemporalEntitys for the property _temporalCoverage.
     */
    @JsonProperty("ids:temporalCoverage")
    List<TemporalEntity> getTemporalCoverage();

    /**
     * Temporal period or instance covered by the content.
     *
     * More information under https://w3id.org/idsa/core/temporalCoverage
     *
     * @param _temporalCoverage_ desired value for the property _temporalCoverage.
     */
    void setTemporalCoverage(List<TemporalEntity> _temporalCoverage_);

    /**
     * Minimum time between collected data points in a time series within this content.
     *
     * More information under https://w3id.org/idsa/core/temporalResolution
     *
     * @return Returns the Frequency for the property _temporalResolution.
     */
    @JsonProperty("ids:temporalResolution")
    Frequency getTemporalResolution();

    /**
     * Minimum time between collected data points in a time series within this content.
     *
     * More information under https://w3id.org/idsa/core/temporalResolution
     *
     * @param _temporalResolution_ desired value for the property _temporalResolution.
     */
    void setTemporalResolution(Frequency _temporalResolution_);

    /**
     * Named spatial entity covered by the Resource.
     *
     * More information under https://w3id.org/idsa/core/spatialCoverage
     *
     * @return Returns the List of Locations for the property _spatialCoverage.
     */
    @JsonProperty("ids:spatialCoverage")
    List<Location> getSpatialCoverage();

    /**
     * Named spatial entity covered by the Resource.
     *
     * More information under https://w3id.org/idsa/core/spatialCoverage
     *
     * @param _spatialCoverage_ desired value for the property _spatialCoverage.
     */
    void setSpatialCoverage(List<Location> _spatialCoverage_);

    /**
     * The regular period with which items are added to a collection.
     *
     * More information under https://w3id.org/idsa/core/accrualPeriodicity
     *
     * @return Returns the Frequency for the property _accrualPeriodicity.
     */
    @JsonProperty("ids:accrualPeriodicity")
    Frequency getAccrualPeriodicity();

    /**
     * The regular period with which items are added to a collection.
     *
     * More information under https://w3id.org/idsa/core/accrualPeriodicity
     *
     * @param _accrualPeriodicity_ desired value for the property _accrualPeriodicity.
     */
    void setAccrualPeriodicity(Frequency _accrualPeriodicity_);

    /**
     * IRI containing document, which defines the standard for the given Digital Content. The content is
     * assumed to conform to that Standard.
     *
     * More information under https://w3id.org/idsa/core/contentStandard
     *
     * @return Returns the URI for the property _contentStandard.
     */
    @JsonProperty("ids:contentStandard")
    URI getContentStandard();

    /**
     * IRI containing document, which defines the standard for the given Digital Content. The content is
     * assumed to conform to that Standard.
     *
     * More information under https://w3id.org/idsa/core/contentStandard
     *
     * @param _contentStandard_ desired value for the property _contentStandard.
     */
    void setContentStandard(URI _contentStandard_);

    /**
     * Natural language(s) used within the content.
     *
     * More information under https://w3id.org/idsa/core/language
     *
     * @return Returns the List of Languages for the property _language.
     */
    @JsonProperty("ids:language")
    List<Language> getLanguage();

    /**
     * Natural language(s) used within the content.
     *
     * More information under https://w3id.org/idsa/core/language
     *
     * @param _language_ desired value for the property _language.
     */
    void setLanguage(List<Language> _language_);

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
