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
 * Default implementation of package de.fraunhofer.iais.eis.ComponentCertification
 * 
 * Process and result of certifying a software component/servivce in order to become a certified
 * part of the International Data Space infrastructure.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:ComponentCertification")
public class ComponentCertificationImpl implements ComponentCertification {

    @JsonProperty("@id")
    @JsonAlias({"@id", "id"})
    @NotNull
    protected URI id;

    // List of all labels of this class
    @JsonIgnore
    protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Component Certification", "en"));

    // List of all comments of this class
    @JsonIgnore
    protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral(
        "Process and result of certifying a software component/servivce in order to become a certified part of the International Data Space infrastructure.",
        "en"));

    // all classes have a generic property array
    @JsonIgnore
    protected Map<String, Object> properties;

    // instance fields as derived from the IDS Information Model ontology

    @JsonAlias({"ids:certificationLevel", "certificationLevel"})
    protected CertificationLevel _certificationLevel;

    @JsonAlias({"ids:description", "description"})
    protected List<TypedLiteral> _description = new ArrayList<>();

    @JsonAlias({"ids:evaluationFacility", "evaluationFacility"})
    protected EvaluationFacility _evaluationFacility;

    @JsonAlias({"ids:lastValidDate", "lastValidDate"})
    protected XMLGregorianCalendar _lastValidDate;

    @JsonAlias({"ids:title", "title"})
    protected List<TypedLiteral> _title = new ArrayList<>();

    @JsonAlias({"ids:version", "version"})
    protected String _version;

    protected ComponentCertificationImpl() {
        id = VocabUtil.getInstance().createRandomUrl("componentCertification");
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
        return Objects.hash(this._certificationLevel,
            this._lastValidDate,
            this._evaluationFacility,
            this._version,
            this._title,
            this._description);
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
            ComponentCertificationImpl other = (ComponentCertificationImpl) obj;
            return Objects.equals(this._certificationLevel, other._certificationLevel) &&
                Objects.equals(this._lastValidDate, other._lastValidDate) &&
                Objects.equals(this._evaluationFacility, other._evaluationFacility) &&
                Objects.equals(this._version, other._version) &&
                Objects.equals(this._title, other._title) &&
                Objects.equals(this._description, other._description);
        }
    }

    @Override
    public ComponentCertification deepCopy() {
        ComponentCertificationBuilder builder = new ComponentCertificationBuilder();
        builder._certificationLevel_(this._certificationLevel);
        if (this._lastValidDate != null) {
            builder._lastValidDate_((XMLGregorianCalendar) this._lastValidDate.clone());
        }
        if (this._evaluationFacility != null) {
            builder._evaluationFacility_(this._evaluationFacility.deepCopy());
        }
        builder._version_(this._version);
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
        return builder.build();
    }

    // accessor method implementations as derived from the IDS Information Model ontology

    @Override
    public CertificationLevel getCertificationLevel() {
        return _certificationLevel;
    }

    @Override
    public void setCertificationLevel(CertificationLevel _certificationLevel_) {
        this._certificationLevel = _certificationLevel_;
    }

    @Override
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    public XMLGregorianCalendar getLastValidDate() {
        return _lastValidDate;
    }

    @Override
    public void setLastValidDate(XMLGregorianCalendar _lastValidDate_) {
        this._lastValidDate = _lastValidDate_;
    }

    @Override
    public EvaluationFacility getEvaluationFacility() {
        return _evaluationFacility;
    }

    @Override
    public void setEvaluationFacility(EvaluationFacility _evaluationFacility_) {
        this._evaluationFacility = _evaluationFacility_;
    }

    @Override
    public String getVersion() {
        return _version;
    }

    @Override
    public void setVersion(String _version_) {
        this._version = _version_;
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

}
