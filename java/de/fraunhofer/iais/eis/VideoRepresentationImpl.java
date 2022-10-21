package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

/**
 * Default implementation of package de.fraunhofer.iais.eis.VideoRepresentation
 * 
 * Video representation
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:VideoRepresentation")
public class VideoRepresentationImpl implements VideoRepresentation {

    @JsonProperty("@id")
    @JsonAlias({"@id", "id"})
    @NotNull
    protected URI id;

    // List of all labels of this class
    @JsonIgnore
    protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Video Representation", "en"));

    // List of all comments of this class
    @JsonIgnore
    protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Video representation", "en"));

    // all classes have a generic property array
    @JsonIgnore
    protected Map<String, Object> properties;

    // instance fields as derived from the IDS Information Model ontology

    @JsonAlias({"ids:created", "created"})
    protected XMLGregorianCalendar _created;

    @JsonAlias({"ids:description", "description"})
    protected List<TypedLiteral> _description = new ArrayList<>();

    @JsonAlias({"ids:frameRate", "frameRate"})
    protected java.math.BigDecimal _frameRate;

    @JsonAlias({"ids:instance", "instance"})
    protected List<RepresentationInstance> _instance = new ArrayList<>();

    @JsonAlias({"ids:language", "language"})
    protected Language _language;

    @JsonAlias({"ids:mediaType", "mediaType"})
    protected MediaType _mediaType;

    @JsonAlias({"ids:modified", "modified"})
    protected XMLGregorianCalendar _modified;

    @JsonAlias({"ids:representationStandard", "representationStandard"})
    protected URI _representationStandard;

    @JsonAlias({"ids:shapesGraph", "shapesGraph"})
    protected URI _shapesGraph;

    @JsonAlias({"ids:title", "title"})
    protected List<TypedLiteral> _title = new ArrayList<>();

    protected VideoRepresentationImpl() {
        id = VocabUtil.getInstance().createRandomUrl("videoRepresentation");
    }

    @JsonProperty("@id")
    final public URI getId() {
        return id;
    }

    public String toRdf() {
        return VocabUtil.getInstance().toRdf(this);
    }

    @Override
    public String toString() {
        return this.toRdf();
    }

    public List<TypedLiteral> getLabel() {
        return this.label;
    }

    public List<TypedLiteral> getComment() {
        return this.comment;
    }

    // getter and setter for generic property map
    @JsonAnyGetter
    public Map<String, Object> getProperties() {
        if (this.properties == null)
            return null;
        Iterator<String> iter = this.properties.keySet().iterator();
        Map<String, Object> resultset = new HashMap<String, Object>();
        while (iter.hasNext()) {
            String key = iter.next();
            resultset.put(key, urifyObjects(this.properties.get(key)));
        }
        return resultset;
    }

    public Object urifyObjects(Object value) {
        if (value instanceof String && value.toString().startsWith("http")) {
            try {
                value = new URI(value.toString());
            } catch (Exception e) {
                /* do nothing */ }
        } else if (value instanceof ArrayList) {
            ArrayList<Object> result_array = new ArrayList<Object>();
            ((ArrayList) value).forEach(x -> result_array.add(urifyObjects(x)));
            return result_array;
        } else if (value instanceof Map) {
            Map<String, Object> result_map = new HashMap<String, Object>();
            ((Map) value).forEach((k, v) -> result_map.put(k.toString(), urifyObjects(v)));
            return result_map;
        }
        return value;
    }

    @JsonAnySetter
    public void setProperty(String property, Object value) {
        if (this.properties == null)
            this.properties = new HashMap<String, Object>();
        if (property.startsWith("@")) {
            return;
        } ;
        this.properties.put(property, value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this._frameRate,
            this._instance,
            this._mediaType,
            this._representationStandard,
            this._language,
            this._created,
            this._modified,
            this._title,
            this._description,
            this._shapesGraph);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            VideoRepresentationImpl other = (VideoRepresentationImpl) obj;
            return Objects.equals(this._frameRate, other._frameRate) &&
                Objects.equals(this._instance, other._instance) &&
                Objects.equals(this._mediaType, other._mediaType) &&
                Objects.equals(this._representationStandard, other._representationStandard) &&
                Objects.equals(this._language, other._language) &&
                Objects.equals(this._created, other._created) &&
                Objects.equals(this._modified, other._modified) &&
                Objects.equals(this._title, other._title) &&
                Objects.equals(this._description, other._description) &&
                Objects.equals(this._shapesGraph, other._shapesGraph);
        }
    }

    @Override
    public VideoRepresentation deepCopy() {
        VideoRepresentationBuilder builder = new VideoRepresentationBuilder();
        builder._frameRate_(this._frameRate);
        for (RepresentationInstance item : this._instance) {
            if (item != null) {
                builder._instance_(item.deepCopy());
            }
        }
        if (this._mediaType != null) {
            builder._mediaType_(this._mediaType.deepCopy());
        }
        if (this._representationStandard != null) {
            builder._representationStandard_(URI.create(this._representationStandard.toString()));
        }
        builder._language_(this._language);
        if (this._created != null) {
            builder._created_((XMLGregorianCalendar) this._created.clone());
        }
        if (this._modified != null) {
            builder._modified_((XMLGregorianCalendar) this._modified.clone());
        }
        for (TypedLiteral item : this._title) {
            if (item != null && item.getLanguage() != null) {
                builder._title_(new TypedLiteral(item.getValue(), item.getLanguage()));
            } else {
                builder._title_(new TypedLiteral(item.getValue(), URI.create(item.getType())));
            }
        }
        for (TypedLiteral item : this._description) {
            if (item != null && item.getLanguage() != null) {
                builder._description_(new TypedLiteral(item.getValue(), item.getLanguage()));
            } else {
                builder._description_(new TypedLiteral(item.getValue(), URI.create(item.getType())));
            }
        }
        if (this._shapesGraph != null) {
            builder._shapesGraph_(URI.create(this._shapesGraph.toString()));
        }
        return builder.build();
    }

    // accessor method implementations as derived from the IDS Information Model ontology

    @Override
    public java.math.BigDecimal getFrameRate() {
        return _frameRate;
    }

    @Override
    public void setFrameRate(java.math.BigDecimal _frameRate_) {
        this._frameRate = _frameRate_;
    }

    @Override
    public List<RepresentationInstance> getInstance() {
        return _instance;
    }

    @Override
    public void setInstance(List<RepresentationInstance> _instance_) {
        this._instance = _instance_;
    }

    @Override
    public MediaType getMediaType() {
        return _mediaType;
    }

    @Override
    public void setMediaType(MediaType _mediaType_) {
        this._mediaType = _mediaType_;
    }

    @Override
    public URI getRepresentationStandard() {
        return _representationStandard;
    }

    @Override
    public void setRepresentationStandard(URI _representationStandard_) {
        this._representationStandard = _representationStandard_;
    }

    @Override
    public Language getLanguage() {
        return _language;
    }

    @Override
    public void setLanguage(Language _language_) {
        this._language = _language_;
    }

    @Override
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    public XMLGregorianCalendar getCreated() {
        return _created;
    }

    @Override
    public void setCreated(XMLGregorianCalendar _created_) {
        this._created = _created_;
    }

    @Override
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    public XMLGregorianCalendar getModified() {
        return _modified;
    }

    @Override
    public void setModified(XMLGregorianCalendar _modified_) {
        this._modified = _modified_;
    }

    @Override
    public List<TypedLiteral> getTitle() {
        return _title;
    }

    @Override
    public void setTitle(List<TypedLiteral> _title_) {
        this._title = _title_;
    }

    @Override
    public List<TypedLiteral> getDescription() {
        return _description;
    }

    @Override
    public void setDescription(List<TypedLiteral> _description_) {
        this._description = _description_;
    }

    @Override
    public URI getShapesGraph() {
        return _shapesGraph;
    }

    @Override
    public void setShapesGraph(URI _shapesGraph_) {
        this._shapesGraph = _shapesGraph_;
    }

}
