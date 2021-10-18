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
 * Default implementation of package de.fraunhofer.iais.eis.DynamicAttributeToken
 * 
 * A JSON Web Token (e.g., for authorization) mediated as part of the message, formerly known as the
 * 'DAPS Token'. The complete JWT *including* header, payload and signiture is referenced by this
 * class and *not* only the JSON element in the payload. See ids:DatPayload for the payload
 * definition.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:DynamicAttributeToken")
public class DynamicAttributeTokenImpl implements DynamicAttributeToken {

    @JsonProperty("@id")
    @JsonAlias({"@id", "id"})
    @NotNull
    protected URI id;

    // List of all labels of this class
    @JsonIgnore
    protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Dynamic Attribute Token (DAT).", "en"));

    // List of all comments of this class
    @JsonIgnore
    protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral(
        "A JSON Web Token (e.g., for authorization) mediated as part of the message, formerly known as the 'DAPS Token'. The complete JWT *including* header, payload and signiture is referenced by this class and *not* only the JSON element in the payload. See ids:DatPayload for the payload definition.",
        "en"));

    // all classes have a generic property array
    @JsonIgnore
    protected Map<String, Object> properties;

    // instance fields as derived from the IDS Information Model ontology

    @NotNull
    @JsonAlias({"ids:tokenFormat", "tokenFormat"})
    protected TokenFormat _tokenFormat;

    @NotNull
    @JsonAlias({"ids:tokenValue", "tokenValue"})
    protected String _tokenValue;

    protected DynamicAttributeTokenImpl() {
        id = VocabUtil.getInstance().createRandomUrl("dynamicAttributeToken");
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
        return Objects.hash(this._tokenValue,
            this._tokenFormat);
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
            DynamicAttributeTokenImpl other = (DynamicAttributeTokenImpl) obj;
            return Objects.equals(this._tokenValue, other._tokenValue) &&
                Objects.equals(this._tokenFormat, other._tokenFormat);
        }
    }

    @Override
    public DynamicAttributeToken deepCopy() {
        DynamicAttributeTokenBuilder builder = new DynamicAttributeTokenBuilder();
        builder._tokenValue_(this._tokenValue);
        builder._tokenFormat_(this._tokenFormat);
        return builder.build();
    }

    // accessor method implementations as derived from the IDS Information Model ontology

    @Override
    @NotNull
    public String getTokenValue() {
        return _tokenValue;
    }

    @Override
    public void setTokenValue(String _tokenValue_) {
        this._tokenValue = _tokenValue_;
    }

    @Override
    @NotNull
    public TokenFormat getTokenFormat() {
        return _tokenFormat;
    }

    @Override
    public void setTokenFormat(TokenFormat _tokenFormat_) {
        this._tokenFormat = _tokenFormat_;
    }
}
