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
 * Default implementation of package de.fraunhofer.iais.eis.Proxy
 * 
 * Holds Proxy information.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:Proxy")
public class ProxyImpl implements Proxy {

    @JsonProperty("@id")
    @JsonAlias({"@id", "id"})
    @NotNull
    protected URI id;

    // List of all labels of this class
    @JsonIgnore
    protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Proxy", "en"));

    // List of all comments of this class
    @JsonIgnore
    protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Holds Proxy information.", "en"));

    // all classes have a generic property array
    @JsonIgnore
    protected Map<String, Object> properties;

    // instance fields as derived from the IDS Information Model ontology

    @JsonAlias({"ids:noProxy", "noProxy"})
    protected List<URI> _noProxy = new ArrayList<>();

    @JsonAlias({"ids:proxyAuthentication", "proxyAuthentication"})
    protected BasicAuthentication _proxyAuthentication;

    @NotNull
    @JsonAlias({"ids:proxyURI", "proxyURI"})
    protected URI _proxyURI;

    protected ProxyImpl() {
        id = VocabUtil.getInstance().createRandomUrl("proxy");
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
        return Objects.hash(this._proxyURI,
            this._noProxy,
            this._proxyAuthentication);
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
            ProxyImpl other = (ProxyImpl) obj;
            return Objects.equals(this._proxyURI, other._proxyURI) &&
                Objects.equals(this._noProxy, other._noProxy) &&
                Objects.equals(this._proxyAuthentication, other._proxyAuthentication);
        }
    }

    @Override
    public Proxy deepCopy() {
        ProxyBuilder builder = new ProxyBuilder();
        if (this._proxyURI != null) {
            builder._proxyURI_(URI.create(this._proxyURI.toString()));
        }
        for (URI item : this._noProxy) {
            if (item != null) {
                builder._noProxy_(URI.create(item.toString()));
            }
        }
        if (this._proxyAuthentication != null) {
            builder._proxyAuthentication_(this._proxyAuthentication.deepCopy());
        }
        return builder.build();
    }

    // accessor method implementations as derived from the IDS Information Model ontology

    @Override
    @NotNull
    public URI getProxyURI() {
        return _proxyURI;
    }

    @Override
    public void setProxyURI(URI _proxyURI_) {
        this._proxyURI = _proxyURI_;
    }

    @Override
    public List<URI> getNoProxy() {
        return _noProxy;
    }

    @Override
    public void setNoProxy(List<URI> _noProxy_) {
        this._noProxy = _noProxy_;
    }

    @Override
    public BasicAuthentication getProxyAuthentication() {
        return _proxyAuthentication;
    }

    @Override
    public void setProxyAuthentication(BasicAuthentication _proxyAuthentication_) {
        this._proxyAuthentication = _proxyAuthentication_;
    }
}
