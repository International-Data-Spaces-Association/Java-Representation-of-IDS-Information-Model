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
 * Default implementation of package de.fraunhofer.iais.eis.HTTPAuthentication
 * 
 * HTTP authentication.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:HTTPAuthentication")
public class HTTPAuthenticationImpl implements HTTPAuthentication {

    @JsonProperty("@id")
    @JsonAlias({"@id", "id"})
    @NotNull
    protected URI id;

    // List of all labels of this class
    @JsonIgnore
    protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("HTTP Authentication", "en"));

    // List of all comments of this class
    @JsonIgnore
    protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("HTTP authentication.", "en"));

    // all classes have a generic property array
    @JsonIgnore
    protected Map<String, Object> properties;

    // instance fields as derived from the IDS Information Model ontology

    @JsonAlias({"ids:authPassword", "authPassword"})
    protected String _authPassword;

    @JsonAlias({"ids:authUsername", "authUsername"})
    protected String _authUsername;

    @JsonAlias({"ids:httpAuthURI", "httpAuthURI"})
    protected URI _httpAuthURI;

    protected HTTPAuthenticationImpl() {
        id = VocabUtil.getInstance().createRandomUrl("hTTPAuthentication");
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
        return Objects.hash(this._httpAuthURI,
            this._authPassword,
            this._authUsername);
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
            HTTPAuthenticationImpl other = (HTTPAuthenticationImpl) obj;
            return Objects.equals(this._httpAuthURI, other._httpAuthURI) &&
                Objects.equals(this._authPassword, other._authPassword) &&
                Objects.equals(this._authUsername, other._authUsername);
        }
    }

    @Override
    public HTTPAuthentication deepCopy() {
        HTTPAuthenticationBuilder builder = new HTTPAuthenticationBuilder();
        if (this._httpAuthURI != null) {
            builder._httpAuthURI_(URI.create(this._httpAuthURI.toString()));
        }
        builder._authPassword_(this._authPassword);
        builder._authUsername_(this._authUsername);
        return builder.build();
    }

    // accessor method implementations as derived from the IDS Information Model ontology

    @Override
    public URI getHttpAuthURI() {
        return _httpAuthURI;
    }

    @Override
    public void setHttpAuthURI(URI _httpAuthURI_) {
        this._httpAuthURI = _httpAuthURI_;
    }

    @Override
    public String getAuthPassword() {
        return _authPassword;
    }

    @Override
    public void setAuthPassword(String _authPassword_) {
        this._authPassword = _authPassword_;
    }

    @Override
    public String getAuthUsername() {
        return _authUsername;
    }

    @Override
    public void setAuthUsername(String _authUsername_) {
        this._authUsername = _authUsername_;
    }
}
