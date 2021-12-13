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

@JsonTypeName("Representation")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = DataRepresentation.class),
    @JsonSubTypes.Type(value = TextRepresentation.class),
    @JsonSubTypes.Type(value = AudioRepresentation.class),
    @JsonSubTypes.Type(value = ImageRepresentation.class),
    @JsonSubTypes.Type(value = VideoRepresentation.class),
    @JsonSubTypes.Type(value = SoftwareRepresentation.class)
})
public interface RepresentationMixin {
    @JsonProperty("ids:instance")
    public List<RepresentationInstance> getInstance();

    @JsonProperty("ids:instance")
    public void setInstance(List<RepresentationInstance> _instance_);

    @JsonProperty("ids:mediaType")
    public MediaType getMediaType();

    @JsonProperty("ids:mediaType")
    public void setMediaType(MediaType _mediaType_);

    @JsonProperty("ids:representationStandard")
    public URI getRepresentationStandard();

    @JsonProperty("ids:representationStandard")
    public void setRepresentationStandard(URI _representationStandard_);

    @JsonProperty("ids:language")
    public Language getLanguage();

    @JsonProperty("ids:language")
    public void setLanguage(Language _language_);

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
