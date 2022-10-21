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
 * Default implementation of package de.fraunhofer.iais.eis.Interval
 * 
 * A temporal entity with extent or duration, fixed in time (different to ids:DurationEntity).
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:Interval")
public class IntervalImpl implements Interval {

    @JsonProperty("@id")
    @JsonAlias({"@id", "id"})
    @NotNull
    protected URI id;

    // List of all labels of this class
    @JsonIgnore
    protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Interval", "en"));

    // List of all comments of this class
    @JsonIgnore
    protected List<TypedLiteral> comment = Arrays
        .asList(new TypedLiteral("A temporal entity with extent or duration, fixed in time (different to ids:DurationEntity).", "en"));

    // all classes have a generic property array
    @JsonIgnore
    protected Map<String, Object> properties;

    // instance fields as derived from the IDS Information Model ontology

    @NotNull
    @JsonAlias({"ids:begin", "begin"})
    protected Instant _begin;

    @JsonAlias({"ids:end", "end"})
    protected Instant _end;

    @JsonAlias({"ids:hasDuration", "hasDuration"})
    protected javax.xml.datatype.Duration _hasDuration;

    protected IntervalImpl() {
        id = VocabUtil.getInstance().createRandomUrl("interval");
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
        return Objects.hash(this._begin,
            this._end,
            this._hasDuration);
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
            IntervalImpl other = (IntervalImpl) obj;
            return Objects.equals(this._begin, other._begin) &&
                Objects.equals(this._end, other._end) &&
                Objects.equals(this._hasDuration, other._hasDuration);
        }
    }

    @Override
    public Interval deepCopy() {
        IntervalBuilder builder = new IntervalBuilder();
        if (this._begin != null) {
            builder._begin_(this._begin.deepCopy());
        }
        if (this._end != null) {
            builder._end_(this._end.deepCopy());
        }
        builder._hasDuration_(this._hasDuration);
        return builder.build();
    }

    // accessor method implementations as derived from the IDS Information Model ontology

    @Override
    @NotNull
    public Instant getBegin() {
        return _begin;
    }

    @Override
    public void setBegin(Instant _begin_) {
        this._begin = _begin_;
    }

    @Override
    public Instant getEnd() {
        return _end;
    }

    @Override
    public void setEnd(Instant _end_) {
        this._end = _end_;
    }

    @Override
    public javax.xml.datatype.Duration getHasDuration() {
        return _hasDuration;
    }

    @Override
    public void setHasDuration(javax.xml.datatype.Duration _hasDuration_) {
        this._hasDuration = _hasDuration_;
    }

}
