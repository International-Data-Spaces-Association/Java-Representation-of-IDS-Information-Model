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
 * Default implementation of package de.fraunhofer.iais.eis.UsageControlComponent
 * 
 * Defined usage control component (i.e. PIP, PXP, etc.) in the IDS.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:UsageControlComponent")
public class UsageControlComponentImpl implements UsageControlComponent {

    @JsonProperty("@id")
    @JsonAlias({"@id", "id"})
    @NotNull
    protected URI id;

    // List of all labels of this class
    @JsonIgnore
    protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Usage Control Component", "en"));

    // List of all comments of this class
    @JsonIgnore
    protected List<TypedLiteral> comment =
        Arrays.asList(new TypedLiteral("Defined usage control component (i.e. PIP, PXP, etc.) in the IDS.", "en"));

    // all classes have a generic property array
    @JsonIgnore
    protected Map<String, Object> properties;

    // instance fields as derived from the IDS Information Model ontology

    @JsonAlias({"ids:endpointURI", "endpointURI"})
    protected URI _endpointURI;

    @NotNull
    @JsonAlias({"ids:interfaceDescription", "interfaceDescription"})
    protected URI _interfaceDescription;

    protected UsageControlComponentImpl() {
        id = VocabUtil.getInstance().createRandomUrl("usageControlComponent");
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
        return Objects.hash(this._interfaceDescription,
            this._endpointURI);
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
            UsageControlComponentImpl other = (UsageControlComponentImpl) obj;
            return Objects.equals(this._interfaceDescription, other._interfaceDescription) &&
                Objects.equals(this._endpointURI, other._endpointURI);
        }
    }

    @Override
    public UsageControlComponent deepCopy() {
        UsageControlComponentBuilder builder = new UsageControlComponentBuilder();
        if (this._interfaceDescription != null) {
            builder._interfaceDescription_(URI.create(this._interfaceDescription.toString()));
        }
        if (this._endpointURI != null) {
            builder._endpointURI_(URI.create(this._endpointURI.toString()));
        }
        return builder.build();
    }

    // accessor method implementations as derived from the IDS Information Model ontology

    @Override
    @NotNull
    public URI getInterfaceDescription() {
        return _interfaceDescription;
    }

    @Override
    public void setInterfaceDescription(URI _interfaceDescription_) {
        this._interfaceDescription = _interfaceDescription_;
    }

    @Override
    public URI getEndpointURI() {
        return _endpointURI;
    }

    @Override
    public void setEndpointURI(URI _endpointURI_) {
        this._endpointURI = _endpointURI_;
    }
}
