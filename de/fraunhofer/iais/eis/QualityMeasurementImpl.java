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
 * Default implementation of package de.fraunhofer.iais.eis.QualityMeasurement
 * 
 * Represents the evaluation of a given dataset (or dataset distribution) against a specific quality
 * metric.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("http://www.w3.org/ns/dqv#QualityMeasurement")
public class QualityMeasurementImpl implements QualityMeasurement {

    @JsonProperty("@id")
    @JsonAlias({"@id", "id"})
    @NotNull
    protected URI id;

    // List of all labels of this class
    @JsonIgnore
    protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Quality Measurement", "en"));

    // List of all comments of this class
    @JsonIgnore
    protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral(
        "Represents the evaluation of a given dataset (or dataset distribution) against a specific quality metric.", "en"));

    // all classes have a generic property array
    @JsonIgnore
    protected Map<String, Object> properties;

    // instance fields as derived from the IDS Information Model ontology

    @JsonAlias({"http://www.w3.org/ns/dqv#isMeasurementOf", "isMeasurementOf"})
    protected Metric _isMeasurementOf;

    @JsonAlias({"http://www.w3.org/ns/dqv#value", "value"})
    protected TypedLiteral _value;

    protected QualityMeasurementImpl() {
        id = VocabUtil.getInstance().createRandomUrl("qualityMeasurement");
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
        return Objects.hash(this._isMeasurementOf,
            this._value);
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
            QualityMeasurementImpl other = (QualityMeasurementImpl) obj;
            return Objects.equals(this._isMeasurementOf, other._isMeasurementOf) &&
                Objects.equals(this._value, other._value);
        }
    }

    @Override
    public QualityMeasurement deepCopy() {
        QualityMeasurementBuilder builder = new QualityMeasurementBuilder();
        builder._isMeasurementOf_(this._isMeasurementOf);
        if (this._value != null && this._value.getLanguage() != null) {
            builder._value_(new TypedLiteral(this._value.getValue(), this._value.getLanguage()));
        } else {
            builder._value_(new TypedLiteral(this._value.getValue(), URI.create(this._value.getType())));
        }
        return builder.build();
    }

    // accessor method implementations as derived from the IDS Information Model ontology

    @Override
    public Metric getIsMeasurementOf() {
        return _isMeasurementOf;
    }

    @Override
    public void setIsMeasurementOf(Metric _isMeasurementOf_) {
        this._isMeasurementOf = _isMeasurementOf_;
    }

    @Override
    public TypedLiteral getValue() {
        return _value;
    }

    @Override
    public void setValue(TypedLiteral _value_) {
        this._value = _value_;
    }

}
