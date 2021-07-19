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

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

/**
 * Default implementation of package de.fraunhofer.iais.eis.GenericEndpoint
 * 
 * Generic endpoints describe non-IDS-specific endpoints, e.g., to integrate external services.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:GenericEndpoint")
public class GenericEndpointImpl implements GenericEndpoint {

    @JsonProperty("@id")
    @JsonAlias({"@id", "id"})
    @NotNull
    protected URI id;

    // List of all labels of this class
    @JsonIgnore
    protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Generic Endpoint", "en"));

    // List of all comments of this class
    @JsonIgnore
    protected List<TypedLiteral> comment = Arrays
        .asList(new TypedLiteral("Generic endpoints describe non-IDS-specific endpoints, e.g., to integrate external services.", "en"));

    // all classes have a generic property array
    @JsonIgnore
    protected Map<String, Object> properties;

    // instance fields as derived from the IDS Information Model ontology

    @JsonAlias({"ids:accessURL", "accessURL"})
    protected URI _accessURL;

    @JsonAlias({"ids:endpointDocumentation", "endpointDocumentation"})
    protected List<URI> _endpointDocumentation = new ArrayList<>();

    @JsonAlias({"ids:endpointInformation", "endpointInformation"})
    protected List<TypedLiteral> _endpointInformation = new ArrayList<>();

    @JsonAlias({"ids:genericEndpointAuthentication", "genericEndpointAuthentication"})
    protected BasicAuthentication _genericEndpointAuthentication;

    @JsonAlias({"ids:genericEndpointConfiguration", "genericEndpointConfiguration"})
    protected String _genericEndpointConfiguration;

    @JsonAlias({"ids:inboundPath", "inboundPath"})
    protected String _inboundPath;

    @JsonAlias({"ids:outboundPath", "outboundPath"})
    protected String _outboundPath;

    @JsonAlias({"ids:path", "path"})
    protected String _path;

    protected GenericEndpointImpl() {
        id = VocabUtil.getInstance().createRandomUrl("genericEndpoint");
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
        return Objects.hash(this._genericEndpointAuthentication,
            this._genericEndpointConfiguration,
            this._accessURL,
            this._endpointInformation,
            this._endpointDocumentation,
            this._path,
            this._inboundPath,
            this._outboundPath);
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
            GenericEndpointImpl other = (GenericEndpointImpl) obj;
            return Objects.equals(this._genericEndpointAuthentication, other._genericEndpointAuthentication) &&
                Objects.equals(this._genericEndpointConfiguration, other._genericEndpointConfiguration) &&
                Objects.equals(this._accessURL, other._accessURL) &&
                Objects.equals(this._endpointInformation, other._endpointInformation) &&
                Objects.equals(this._endpointDocumentation, other._endpointDocumentation) &&
                Objects.equals(this._path, other._path) &&
                Objects.equals(this._inboundPath, other._inboundPath) &&
                Objects.equals(this._outboundPath, other._outboundPath);
        }
    }

    @Override
    public GenericEndpoint deepCopy() {
        GenericEndpointBuilder builder = new GenericEndpointBuilder();
        if (this._genericEndpointAuthentication != null) {
            builder._genericEndpointAuthentication_(this._genericEndpointAuthentication.deepCopy());
        }
        builder._genericEndpointConfiguration_(this._genericEndpointConfiguration);
        if (this._accessURL != null) {
            builder._accessURL_(URI.create(this._accessURL.toString()));
        }
        for (TypedLiteral item : this._endpointInformation) {
            if (item != null && item.getLanguage() != null) {
                builder._endpointInformation_(new TypedLiteral(item.getValue(), item.getLanguage()));
            } else {
                builder._endpointInformation_(new TypedLiteral(item.getValue(), URI.create(item.getType())));
            }
        }
        for (URI item : this._endpointDocumentation) {
            if (item != null) {
                builder._endpointDocumentation_(URI.create(item.toString()));
            }
        }
        builder._path_(this._path);
        builder._inboundPath_(this._inboundPath);
        builder._outboundPath_(this._outboundPath);
        return builder.build();
    }

    // accessor method implementations as derived from the IDS Information Model ontology

    @Override
    public BasicAuthentication getGenericEndpointAuthentication() {
        return _genericEndpointAuthentication;
    }

    @Override
    public void setGenericEndpointAuthentication(BasicAuthentication _genericEndpointAuthentication_) {
        this._genericEndpointAuthentication = _genericEndpointAuthentication_;
    }

    @Override
    public String getGenericEndpointConfiguration() {
        return _genericEndpointConfiguration;
    }

    @Override
    public void setGenericEndpointConfiguration(String _genericEndpointConfiguration_) {
        this._genericEndpointConfiguration = _genericEndpointConfiguration_;
    }

    @Override
    public URI getAccessURL() {
        return _accessURL;
    }

    @Override
    public void setAccessURL(URI _accessURL_) {
        this._accessURL = _accessURL_;
    }

    @Override
    public List<TypedLiteral> getEndpointInformation() {
        return _endpointInformation;
    }

    @Override
    public void setEndpointInformation(List<TypedLiteral> _endpointInformation_) {
        this._endpointInformation = _endpointInformation_;
    }

    @Override
    public List<URI> getEndpointDocumentation() {
        return _endpointDocumentation;
    }

    @Override
    public void setEndpointDocumentation(List<URI> _endpointDocumentation_) {
        this._endpointDocumentation = _endpointDocumentation_;
    }

    @Override
    public String getPath() {
        return _path;
    }

    @Override
    public void setPath(String _path_) {
        this._path = _path_;
    }

    @Override
    public String getInboundPath() {
        return _inboundPath;
    }

    @Override
    public void setInboundPath(String _inboundPath_) {
        this._inboundPath = _inboundPath_;
    }

    @Override
    public String getOutboundPath() {
        return _outboundPath;
    }

    @Override
    public void setOutboundPath(String _outboundPath_) {
        this._outboundPath = _outboundPath_;
    }
}
