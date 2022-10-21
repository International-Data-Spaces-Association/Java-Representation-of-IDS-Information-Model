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
 * Default implementation of package de.fraunhofer.iais.eis.Person
 * 
 * The class of persons (people)
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:Person")
public class PersonImpl implements Person {

    @JsonProperty("@id")
    @JsonAlias({"@id", "id"})
    @NotNull
    protected URI id;

    // List of all labels of this class
    @JsonIgnore
    protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Person", "en"));

    // List of all comments of this class
    @JsonIgnore
    protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("The class of persons (people)", "en"));

    // all classes have a generic property array
    @JsonIgnore
    protected Map<String, Object> properties;

    // instance fields as derived from the IDS Information Model ontology

    @JsonAlias({"ids:emailAddress", "emailAddress"})
    protected List<String> _emailAddress = new ArrayList<>();

    @JsonAlias({"ids:familyName", "familyName"})
    protected String _familyName;

    @JsonAlias({"ids:givenName", "givenName"})
    protected String _givenName;

    @JsonAlias({"ids:homepage", "homepage"})
    protected String _homepage;

    @JsonAlias({"ids:phoneNumber", "phoneNumber"})
    protected List<String> _phoneNumber = new ArrayList<>();

    protected PersonImpl() {
        id = VocabUtil.getInstance().createRandomUrl("person");
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
        return Objects.hash(this._familyName,
            this._givenName,
            this._phoneNumber,
            this._emailAddress,
            this._homepage);
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
            PersonImpl other = (PersonImpl) obj;
            return Objects.equals(this._familyName, other._familyName) &&
                Objects.equals(this._givenName, other._givenName) &&
                Objects.equals(this._phoneNumber, other._phoneNumber) &&
                Objects.equals(this._emailAddress, other._emailAddress) &&
                Objects.equals(this._homepage, other._homepage);
        }
    }

    @Override
    public Person deepCopy() {
        PersonBuilder builder = new PersonBuilder();
        builder._familyName_(this._familyName);
        builder._givenName_(this._givenName);
        for (String item : this._phoneNumber) {
            builder._phoneNumber_(item);
        }
        for (String item : this._emailAddress) {
            builder._emailAddress_(item);
        }
        builder._homepage_(this._homepage);
        return builder.build();
    }

    // accessor method implementations as derived from the IDS Information Model ontology

    @Override
    public String getFamilyName() {
        return _familyName;
    }

    @Override
    public void setFamilyName(String _familyName_) {
        this._familyName = _familyName_;
    }

    @Override
    public String getGivenName() {
        return _givenName;
    }

    @Override
    public void setGivenName(String _givenName_) {
        this._givenName = _givenName_;
    }

    @Override
    public List<String> getPhoneNumber() {
        return _phoneNumber;
    }

    @Override
    public void setPhoneNumber(List<String> _phoneNumber_) {
        this._phoneNumber = _phoneNumber_;
    }

    @Override
    public List<String> getEmailAddress() {
        return _emailAddress;
    }

    @Override
    public void setEmailAddress(List<String> _emailAddress_) {
        this._emailAddress = _emailAddress_;
    }

    @Override
    public String getHomepage() {
        return _homepage;
    }

    @Override
    public void setHomepage(String _homepage_) {
        this._homepage = _homepage_;
    }

}
