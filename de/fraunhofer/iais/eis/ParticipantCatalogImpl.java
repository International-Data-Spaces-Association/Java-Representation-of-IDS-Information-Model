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
 * Default implementation of package de.fraunhofer.iais.eis.ParticipantCatalog
 * 
 * Class that aggregates Participants from a (distributable) Catalog.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:ParticipantCatalog")
public class ParticipantCatalogImpl implements ParticipantCatalog {

    @JsonProperty("@id")
    @JsonAlias({"@id", "id"})
    @NotNull
    protected URI id;

    // List of all labels of this class
    @JsonIgnore
    protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Participant Catalog", "en"));

    // List of all comments of this class
    @JsonIgnore
    protected List<TypedLiteral> comment =
        Arrays.asList(new TypedLiteral("Class that aggregates Participants from a (distributable) Catalog.", "en"));

    // all classes have a generic property array
    @JsonIgnore
    protected Map<String, Object> properties;

    // instance fields as derived from the IDS Information Model ontology

    @JsonAlias({"ids:member", "member"})
    protected List<Participant> _member = new ArrayList<>();

    @JsonAlias({"ids:member", "member"})
    protected List<URI> _memberAsUri = new ArrayList<>();

    protected ParticipantCatalogImpl() {
        id = VocabUtil.getInstance().createRandomUrl("participantCatalog");
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
        return Objects.hash(this._member,
            this._memberAsUri);
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
            ParticipantCatalogImpl other = (ParticipantCatalogImpl) obj;
            return Objects.equals(this._member, other._member) &&
                Objects.equals(this._memberAsUri, other._memberAsUri);
        }
    }

    @Override
    public ParticipantCatalog deepCopy() {
        ParticipantCatalogBuilder builder = new ParticipantCatalogBuilder();
        for (Participant item : this._member) {
            if (item != null) {
                builder._member_(item.deepCopy());
            }
        }
        for (URI item : this._memberAsUri) {
            if (item != null) {
                builder._memberAsUri_(URI.create(item.toString()));
            }
        }
        return builder.build();
    }

    // accessor method implementations as derived from the IDS Information Model ontology

    @Override
    public List<Participant> getMember() {
        return _member;
    }

    @Override
    public void setMember(List<Participant> _member_) {
        this._member = _member_;
        this._memberAsUri = new ArrayList<>();
    }

    @Override
    public List<URI> getMemberAsUri() {
        return _memberAsUri;
    }

    @Override
    public void setMemberAsUri(List<URI> _member_) {
        this._memberAsUri = _member_;
        this._member = new ArrayList<>();
    }

    /**
     * Helper function for (de-)serialization of the _participantCatalog and the
     * _participantCatalogAsfields.
     *
     * @return Returns the a UriOrModelClass object with the content of the field or null if the field
     *         is not set.
     */
    @Override
    public UriOrModelClass getMemberAsObject() {
        if (!_memberAsUri.isEmpty()) {
            return new UriOrModelClass(_memberAsUri);
        } else if (!_member.isEmpty()) {
            return new UriOrModelClass(_member);
        } else {
            return null;
        }
    }

}
