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
 * Default implementation of package de.fraunhofer.iais.eis.Resource
 * 
 * Resource is a single digital content or a coherent set of digital contents. Resource content is
 * formalized in Representations and optionally materialized as Artifacts. The Resource's content is
 * exposed via defined Interfaces at various protocol Endpoints.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:Resource")
public class ResourceImpl implements Resource {

    @JsonProperty("@id")
    @JsonAlias({"@id", "id"})
    @NotNull
    protected URI id;

    // List of all labels of this class
    @JsonIgnore
    protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Resource", "en"));

    // List of all comments of this class
    @JsonIgnore
    protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral(
        "Resource is a single digital content or a coherent set of digital contents. Resource content is formalized in Representations and optionally materialized as Artifacts. The Resource's content is exposed via defined Interfaces at various protocol Endpoints.",
        "en"));

    // all classes have a generic property array
    @JsonIgnore
    protected Map<String, Object> properties;

    // instance fields as derived from the IDS Information Model ontology

    @JsonAlias({"ids:accrualPeriodicity", "accrualPeriodicity"})
    protected Frequency _accrualPeriodicity;

    @JsonAlias({"ids:contentPart", "contentPart"})
    protected List<DigitalContent> _contentPart = new ArrayList<>();

    @JsonAlias({"ids:contentStandard", "contentStandard"})
    protected URI _contentStandard;

    @JsonAlias({"ids:contentType", "contentType"})
    protected ContentType _contentType;

    @JsonAlias({"ids:contractOffer", "contractOffer"})
    protected List<ContractOffer> _contractOffer = new ArrayList<>();

    @JsonAlias({"ids:created", "created"})
    protected XMLGregorianCalendar _created;

    @JsonAlias({"ids:customLicense", "customLicense"})
    protected URI _customLicense;

    @JsonAlias({"ids:defaultRepresentation", "defaultRepresentation"})
    protected List<Representation> _defaultRepresentation = new ArrayList<>();

    @JsonAlias({"ids:description", "description"})
    protected List<TypedLiteral> _description = new ArrayList<>();

    @JsonAlias({"ids:keyword", "keyword"})
    protected List<TypedLiteral> _keyword = new ArrayList<>();

    @JsonAlias({"ids:language", "language"})
    protected List<Language> _language = new ArrayList<>();

    @JsonAlias({"ids:modified", "modified"})
    protected XMLGregorianCalendar _modified;

    @JsonAlias({"ids:paymentModality", "paymentModality"})
    protected PaymentModality _paymentModality;

    @JsonAlias({"ids:publisher", "publisher"})
    protected URI _publisher;

    @JsonAlias({"ids:representation", "representation"})
    protected List<Representation> _representation = new ArrayList<>();

    @JsonAlias({"ids:resourceEndpoint", "resourceEndpoint"})
    protected List<ConnectorEndpoint> _resourceEndpoint = new ArrayList<>();

    @JsonAlias({"ids:resourcePart", "resourcePart"})
    protected List<Resource> _resourcePart = new ArrayList<>();

    @JsonAlias({"ids:sample", "sample"})
    protected List<Resource> _sample = new ArrayList<>();

    @JsonAlias({"ids:shapesGraph", "shapesGraph"})
    protected URI _shapesGraph;

    @JsonAlias({"ids:sovereign", "sovereign"})
    protected URI _sovereign;

    @JsonAlias({"ids:spatialCoverage", "spatialCoverage"})
    protected List<Location> _spatialCoverage = new ArrayList<>();

    @JsonAlias({"ids:standardLicense", "standardLicense"})
    protected URI _standardLicense;

    @JsonAlias({"ids:temporalCoverage", "temporalCoverage"})
    protected List<TemporalEntity> _temporalCoverage = new ArrayList<>();

    @JsonAlias({"ids:temporalResolution", "temporalResolution"})
    protected Frequency _temporalResolution;

    @JsonAlias({"ids:theme", "theme"})
    protected List<URI> _theme = new ArrayList<>();

    @JsonAlias({"ids:title", "title"})
    protected List<TypedLiteral> _title = new ArrayList<>();

    @JsonAlias({"ids:variant", "variant"})
    protected Resource _variant;

    @JsonAlias({"ids:version", "version"})
    protected String _version;

    protected ResourceImpl() {
        id = VocabUtil.getInstance().createRandomUrl("resource");
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
        return Objects.hash(this._standardLicense,
            this._customLicense,
            this._resourcePart,
            this._resourceEndpoint,
            this._contractOffer,
            this._paymentModality,
            this._publisher,
            this._sovereign,
            this._sample,
            this._variant,
            this._contentType,
            this._contentPart,
            this._representation,
            this._defaultRepresentation,
            this._theme,
            this._keyword,
            this._temporalCoverage,
            this._temporalResolution,
            this._spatialCoverage,
            this._accrualPeriodicity,
            this._contentStandard,
            this._language,
            this._created,
            this._modified,
            this._title,
            this._description,
            this._shapesGraph,
            this._version);
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
            ResourceImpl other = (ResourceImpl) obj;
            return Objects.equals(this._standardLicense, other._standardLicense) &&
                Objects.equals(this._customLicense, other._customLicense) &&
                Objects.equals(this._resourcePart, other._resourcePart) &&
                Objects.equals(this._resourceEndpoint, other._resourceEndpoint) &&
                Objects.equals(this._contractOffer, other._contractOffer) &&
                Objects.equals(this._paymentModality, other._paymentModality) &&
                Objects.equals(this._publisher, other._publisher) &&
                Objects.equals(this._sovereign, other._sovereign) &&
                Objects.equals(this._sample, other._sample) &&
                Objects.equals(this._variant, other._variant) &&
                Objects.equals(this._contentType, other._contentType) &&
                Objects.equals(this._contentPart, other._contentPart) &&
                Objects.equals(this._representation, other._representation) &&
                Objects.equals(this._defaultRepresentation, other._defaultRepresentation) &&
                Objects.equals(this._theme, other._theme) &&
                Objects.equals(this._keyword, other._keyword) &&
                Objects.equals(this._temporalCoverage, other._temporalCoverage) &&
                Objects.equals(this._temporalResolution, other._temporalResolution) &&
                Objects.equals(this._spatialCoverage, other._spatialCoverage) &&
                Objects.equals(this._accrualPeriodicity, other._accrualPeriodicity) &&
                Objects.equals(this._contentStandard, other._contentStandard) &&
                Objects.equals(this._language, other._language) &&
                Objects.equals(this._created, other._created) &&
                Objects.equals(this._modified, other._modified) &&
                Objects.equals(this._title, other._title) &&
                Objects.equals(this._description, other._description) &&
                Objects.equals(this._shapesGraph, other._shapesGraph) &&
                Objects.equals(this._version, other._version);
        }
    }

    @Override
    public Resource deepCopy() {
        ResourceBuilder builder = new ResourceBuilder();
        if (this._standardLicense != null) {
            builder._standardLicense_(URI.create(this._standardLicense.toString()));
        }
        if (this._customLicense != null) {
            builder._customLicense_(URI.create(this._customLicense.toString()));
        }
        for (Resource item : this._resourcePart) {
            if (item != null) {
                builder._resourcePart_(item.deepCopy());
            }
        }
        for (ConnectorEndpoint item : this._resourceEndpoint) {
            if (item != null) {
                builder._resourceEndpoint_(item.deepCopy());
            }
        }
        for (ContractOffer item : this._contractOffer) {
            if (item != null) {
                builder._contractOffer_(item.deepCopy());
            }
        }
        builder._paymentModality_(this._paymentModality);
        if (this._publisher != null) {
            builder._publisher_(URI.create(this._publisher.toString()));
        }
        if (this._sovereign != null) {
            builder._sovereign_(URI.create(this._sovereign.toString()));
        }
        for (Resource item : this._sample) {
            if (item != null) {
                builder._sample_(item.deepCopy());
            }
        }
        if (this._variant != null) {
            builder._variant_(this._variant.deepCopy());
        }
        builder._contentType_(this._contentType);
        for (DigitalContent item : this._contentPart) {
            if (item != null) {
                builder._contentPart_(item.deepCopy());
            }
        }
        for (Representation item : this._representation) {
            if (item != null) {
                builder._representation_(item.deepCopy());
            }
        }
        for (Representation item : this._defaultRepresentation) {
            if (item != null) {
                builder._defaultRepresentation_(item.deepCopy());
            }
        }
        for (URI item : this._theme) {
            if (item != null) {
                builder._theme_(URI.create(item.toString()));
            }
        }
        for (TypedLiteral item : this._keyword) {
            if (item != null && item.getLanguage() != null) {
                builder._keyword_(new TypedLiteral(item.getValue(), item.getLanguage()));
            } else {
                builder._keyword_(new TypedLiteral(item.getValue(), URI.create(item.getType())));
            }
        }
        for (TemporalEntity item : this._temporalCoverage) {
            if (item != null) {
                builder._temporalCoverage_(item.deepCopy());
            }
        }
        builder._temporalResolution_(this._temporalResolution);
        for (Location item : this._spatialCoverage) {
            if (item != null) {
                builder._spatialCoverage_(item.deepCopy());
            }
        }
        builder._accrualPeriodicity_(this._accrualPeriodicity);
        if (this._contentStandard != null) {
            builder._contentStandard_(URI.create(this._contentStandard.toString()));
        }
        for (Language item : this._language) {
            builder._language_(item);
        }
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
        builder._version_(this._version);
        return builder.build();
    }

    // accessor method implementations as derived from the IDS Information Model ontology

    @Override
    public URI getStandardLicense() {
        return _standardLicense;
    }

    @Override
    public void setStandardLicense(URI _standardLicense_) {
        this._standardLicense = _standardLicense_;
    }

    @Override
    public URI getCustomLicense() {
        return _customLicense;
    }

    @Override
    public void setCustomLicense(URI _customLicense_) {
        this._customLicense = _customLicense_;
    }

    @Override
    public List<Resource> getResourcePart() {
        return _resourcePart;
    }

    @Override
    public void setResourcePart(List<Resource> _resourcePart_) {
        this._resourcePart = _resourcePart_;
    }

    @Override
    public List<ConnectorEndpoint> getResourceEndpoint() {
        return _resourceEndpoint;
    }

    @Override
    public void setResourceEndpoint(List<ConnectorEndpoint> _resourceEndpoint_) {
        this._resourceEndpoint = _resourceEndpoint_;
    }

    @Override
    public List<ContractOffer> getContractOffer() {
        return _contractOffer;
    }

    @Override
    public void setContractOffer(List<ContractOffer> _contractOffer_) {
        this._contractOffer = _contractOffer_;
    }

    @Override
    public PaymentModality getPaymentModality() {
        return _paymentModality;
    }

    @Override
    public void setPaymentModality(PaymentModality _paymentModality_) {
        this._paymentModality = _paymentModality_;
    }

    @Override
    public URI getPublisher() {
        return _publisher;
    }

    @Override
    public void setPublisher(URI _publisher_) {
        this._publisher = _publisher_;
    }

    @Override
    public URI getSovereign() {
        return _sovereign;
    }

    @Override
    public void setSovereign(URI _sovereign_) {
        this._sovereign = _sovereign_;
    }

    @Override
    public List<Resource> getSample() {
        return _sample;
    }

    @Override
    public void setSample(List<Resource> _sample_) {
        this._sample = _sample_;
    }

    @Override
    public Resource getVariant() {
        return _variant;
    }

    @Override
    public void setVariant(Resource _variant_) {
        this._variant = _variant_;
    }

    @Override
    public ContentType getContentType() {
        return _contentType;
    }

    @Override
    public void setContentType(ContentType _contentType_) {
        this._contentType = _contentType_;
    }

    @Override
    public List<DigitalContent> getContentPart() {
        return _contentPart;
    }

    @Override
    public void setContentPart(List<DigitalContent> _contentPart_) {
        this._contentPart = _contentPart_;
    }

    @Override
    public List<Representation> getRepresentation() {
        return _representation;
    }

    @Override
    public void setRepresentation(List<Representation> _representation_) {
        this._representation = _representation_;
    }

    @Override
    public List<Representation> getDefaultRepresentation() {
        return _defaultRepresentation;
    }

    @Override
    public void setDefaultRepresentation(List<Representation> _defaultRepresentation_) {
        this._defaultRepresentation = _defaultRepresentation_;
    }

    @Override
    public List<URI> getTheme() {
        return _theme;
    }

    @Override
    public void setTheme(List<URI> _theme_) {
        this._theme = _theme_;
    }

    @Override
    public List<TypedLiteral> getKeyword() {
        return _keyword;
    }

    @Override
    public void setKeyword(List<TypedLiteral> _keyword_) {
        this._keyword = _keyword_;
    }

    @Override
    public List<TemporalEntity> getTemporalCoverage() {
        return _temporalCoverage;
    }

    @Override
    public void setTemporalCoverage(List<TemporalEntity> _temporalCoverage_) {
        this._temporalCoverage = _temporalCoverage_;
    }

    @Override
    public Frequency getTemporalResolution() {
        return _temporalResolution;
    }

    @Override
    public void setTemporalResolution(Frequency _temporalResolution_) {
        this._temporalResolution = _temporalResolution_;
    }

    @Override
    public List<Location> getSpatialCoverage() {
        return _spatialCoverage;
    }

    @Override
    public void setSpatialCoverage(List<Location> _spatialCoverage_) {
        this._spatialCoverage = _spatialCoverage_;
    }

    @Override
    public Frequency getAccrualPeriodicity() {
        return _accrualPeriodicity;
    }

    @Override
    public void setAccrualPeriodicity(Frequency _accrualPeriodicity_) {
        this._accrualPeriodicity = _accrualPeriodicity_;
    }

    @Override
    public URI getContentStandard() {
        return _contentStandard;
    }

    @Override
    public void setContentStandard(URI _contentStandard_) {
        this._contentStandard = _contentStandard_;
    }

    @Override
    public List<Language> getLanguage() {
        return _language;
    }

    @Override
    public void setLanguage(List<Language> _language_) {
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

    @Override
    public String getVersion() {
        return _version;
    }

    @Override
    public void setVersion(String _version_) {
        this._version = _version_;
    }
}
