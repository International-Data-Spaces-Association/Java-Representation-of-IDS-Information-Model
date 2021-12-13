package de.fraunhofer.iais.eis.mixins;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("DigitalContent")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = Resource.class)
})
public interface DigitalContentMixin {
    @JsonProperty("ids:contentType")
    public ContentType getContentType();

    @JsonProperty("ids:contentType")
    public void setContentType(ContentType _contentType_);

    @JsonProperty("ids:contentPart")
    public List<DigitalContent> getContentPart();

    @JsonProperty("ids:contentPart")
    public void setContentPart(List<DigitalContent> _contentPart_);

    @JsonProperty("ids:representation")
    public List<Representation> getRepresentation();

    @JsonProperty("ids:representation")
    public void setRepresentation(List<Representation> _representation_);

    @JsonProperty("ids:defaultRepresentation")
    public List<Representation> getDefaultRepresentation();

    @JsonProperty("ids:defaultRepresentation")
    public void setDefaultRepresentation(List<Representation> _defaultRepresentation_);

    @JsonProperty("ids:theme")
    public List<URI> getTheme();

    @JsonProperty("ids:theme")
    public void setTheme(List<URI> _theme_);

    @JsonProperty("ids:keyword")
    public List<TypedLiteral> getKeyword();

    @JsonProperty("ids:keyword")
    public void setKeyword(List<TypedLiteral> _keyword_);

    @JsonProperty("ids:temporalCoverage")
    public List<TemporalEntity> getTemporalCoverage();

    @JsonProperty("ids:temporalCoverage")
    public void setTemporalCoverage(List<TemporalEntity> _temporalCoverage_);

    @JsonProperty("ids:temporalResolution")
    public Frequency getTemporalResolution();

    @JsonProperty("ids:temporalResolution")
    public void setTemporalResolution(Frequency _temporalResolution_);

    @JsonProperty("ids:spatialCoverage")
    public List<Location> getSpatialCoverage();

    @JsonProperty("ids:spatialCoverage")
    public void setSpatialCoverage(List<Location> _spatialCoverage_);

    @JsonProperty("ids:accrualPeriodicity")
    public Frequency getAccrualPeriodicity();

    @JsonProperty("ids:accrualPeriodicity")
    public void setAccrualPeriodicity(Frequency _accrualPeriodicity_);

    @JsonProperty("ids:contentStandard")
    public URI getContentStandard();

    @JsonProperty("ids:contentStandard")
    public void setContentStandard(URI _contentStandard_);

    @JsonProperty("ids:language")
    public List<Language> getLanguage();

    @JsonProperty("ids:language")
    public void setLanguage(List<Language> _language_);

    @JsonProperty("ids:created")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    public XMLGregorianCalendar getCreated();

    @JsonProperty("ids:created")
    public void setCreated(XMLGregorianCalendar _created_);

    @JsonProperty("ids:modified")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    public XMLGregorianCalendar getModified();

    @JsonProperty("ids:modified")
    public void setModified(XMLGregorianCalendar _modified_);
}
