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
 * Default implementation of package de.fraunhofer.iais.eis.AppRepresentation
 * 
 * App representation
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:AppRepresentation")
public class AppRepresentationImpl implements AppRepresentation {

    @JsonProperty("@id")
    @JsonAlias({"@id", "id"})
    @NotNull
    protected URI id;

    // List of all labels of this class
    @JsonIgnore
    protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("App Representation", "en"));

    // List of all comments of this class
    @JsonIgnore
    protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("App representation", "en"));

    // all classes have a generic property array
    @JsonIgnore
    protected Map<String, Object> properties;

    // instance fields as derived from the IDS Information Model ontology

    @JsonAlias({"ids:created", "created"})
    protected XMLGregorianCalendar _created;

    @JsonAlias({"ids:dataAppDistributionService", "dataAppDistributionService"})
    protected URI _dataAppDistributionService;

    @JsonAlias({"ids:dataAppInformation", "dataAppInformation"})
    protected DataApp _dataAppInformation;

    @JsonAlias({"ids:dataAppRuntimeEnvironment", "dataAppRuntimeEnvironment"})
    protected String _dataAppRuntimeEnvironment;

    @JsonAlias({"ids:description", "description"})
    protected List<TypedLiteral> _description = new ArrayList<>();

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

    protected AppRepresentationImpl() {
        id = VocabUtil.getInstance().createRandomUrl("appRepresentation");
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
        return Objects.hash(this._dataAppInformation,
            this._dataAppDistributionService,
            this._dataAppRuntimeEnvironment,
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
            AppRepresentationImpl other = (AppRepresentationImpl) obj;
            return Objects.equals(this._dataAppInformation, other._dataAppInformation) &&
                Objects.equals(this._dataAppDistributionService, other._dataAppDistributionService) &&
                Objects.equals(this._dataAppRuntimeEnvironment, other._dataAppRuntimeEnvironment) &&
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
    public AppRepresentation deepCopy() {
        AppRepresentationBuilder builder = new AppRepresentationBuilder();
        if (this._dataAppInformation != null) {
            builder._dataAppInformation_(this._dataAppInformation.deepCopy());
        }
        if (this._dataAppDistributionService != null) {
            builder._dataAppDistributionService_(URI.create(this._dataAppDistributionService.toString()));
        }
        builder._dataAppRuntimeEnvironment_(this._dataAppRuntimeEnvironment);
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
    public DataApp getDataAppInformation() {
        return _dataAppInformation;
    }

    @Override
    public void setDataAppInformation(DataApp _dataAppInformation_) {
        this._dataAppInformation = _dataAppInformation_;
    }

    @Override
    public URI getDataAppDistributionService() {
        return _dataAppDistributionService;
    }

    @Override
    public void setDataAppDistributionService(URI _dataAppDistributionService_) {
        this._dataAppDistributionService = _dataAppDistributionService_;
    }

    @Override
    public String getDataAppRuntimeEnvironment() {
        return _dataAppRuntimeEnvironment;
    }

    @Override
    public void setDataAppRuntimeEnvironment(String _dataAppRuntimeEnvironment_) {
        this._dataAppRuntimeEnvironment = _dataAppRuntimeEnvironment_;
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
