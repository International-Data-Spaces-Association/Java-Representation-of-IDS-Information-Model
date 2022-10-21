package de.fraunhofer.iais.eis;

import java.math.BigInteger;
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
 * Default implementation of package de.fraunhofer.iais.eis.Artifact
 * 
 * Instance of a Representation materialized at a partiuclar version and point in time. Possesses
 * characteristics like file name, size, creation date etc.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:Artifact")
public class ArtifactImpl implements Artifact {

    @JsonProperty("@id")
    @JsonAlias({"@id", "id"})
    @NotNull
    protected URI id;

    // List of all labels of this class
    @JsonIgnore
    protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Artifact", "en"));

    // List of all comments of this class
    @JsonIgnore
    protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral(
        "Instance of a Representation materialized at a partiuclar version and point in time. Possesses characteristics like file name, size, creation date etc.",
        "en"));

    // all classes have a generic property array
    @JsonIgnore
    protected Map<String, Object> properties;

    // instance fields as derived from the IDS Information Model ontology

    @JsonAlias({"ids:byteSize", "byteSize"})
    protected BigInteger _byteSize;

    @JsonAlias({"ids:checkSum", "checkSum"})
    protected String _checkSum;

    @JsonAlias({"ids:creationDate", "creationDate"})
    protected XMLGregorianCalendar _creationDate;

    @JsonAlias({"ids:duration", "duration"})
    protected java.math.BigDecimal _duration;

    @JsonAlias({"ids:fileName", "fileName"})
    protected String _fileName;

    protected ArtifactImpl() {
        id = VocabUtil.getInstance().createRandomUrl("artifact");
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
        return Objects.hash(this._byteSize,
            this._fileName,
            this._creationDate,
            this._checkSum,
            this._duration);
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
            ArtifactImpl other = (ArtifactImpl) obj;
            return Objects.equals(this._byteSize, other._byteSize) &&
                Objects.equals(this._fileName, other._fileName) &&
                Objects.equals(this._creationDate, other._creationDate) &&
                Objects.equals(this._checkSum, other._checkSum) &&
                Objects.equals(this._duration, other._duration);
        }
    }

    @Override
    public Artifact deepCopy() {
        ArtifactBuilder builder = new ArtifactBuilder();
        builder._byteSize_(this._byteSize);
        builder._fileName_(this._fileName);
        if (this._creationDate != null) {
            builder._creationDate_((XMLGregorianCalendar) this._creationDate.clone());
        }
        builder._checkSum_(this._checkSum);
        builder._duration_(this._duration);
        return builder.build();
    }

    // accessor method implementations as derived from the IDS Information Model ontology

    @Override
    public BigInteger getByteSize() {
        return _byteSize;
    }

    @Override
    public void setByteSize(BigInteger _byteSize_) {
        this._byteSize = _byteSize_;
    }

    @Override
    public String getFileName() {
        return _fileName;
    }

    @Override
    public void setFileName(String _fileName_) {
        this._fileName = _fileName_;
    }

    @Override
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    public XMLGregorianCalendar getCreationDate() {
        return _creationDate;
    }

    @Override
    public void setCreationDate(XMLGregorianCalendar _creationDate_) {
        this._creationDate = _creationDate_;
    }

    @Override
    public String getCheckSum() {
        return _checkSum;
    }

    @Override
    public void setCheckSum(String _checkSum_) {
        this._checkSum = _checkSum_;
    }

    @Override
    public java.math.BigDecimal getDuration() {
        return _duration;
    }

    @Override
    public void setDuration(java.math.BigDecimal _duration_) {
        this._duration = _duration_;
    }

}
