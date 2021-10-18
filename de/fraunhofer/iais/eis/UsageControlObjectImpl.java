package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.validation.constraints.NotEmpty;
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
 * Default implementation of package de.fraunhofer.iais.eis.UsageControlObject
 * 
 * A data element containing all relevant information for usage control engines.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:UsageControlObject")
public class UsageControlObjectImpl implements UsageControlObject {

    @JsonProperty("@id")
    @JsonAlias({"@id", "id"})
    @NotNull
    protected URI id;

    // List of all labels of this class
    @JsonIgnore
    protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Usage Control Object", "en"));

    // List of all comments of this class
    @JsonIgnore
    protected List<TypedLiteral> comment =
        Arrays.asList(new TypedLiteral("A data element containing all relevant information for usage control engines.", "en"));

    // all classes have a generic property array
    @JsonIgnore
    protected Map<String, Object> properties;

    // instance fields as derived from the IDS Information Model ontology

    @JsonAlias({"ids:accessed", "accessed"})
    protected XMLGregorianCalendar _accessed;

    @JsonAlias({"ids:action", "action"})
    protected List<Action> _action = new ArrayList<>();

    @NotEmpty
    @JsonAlias({"ids:contract", "contract"})
    protected List<ContractAgreement> _contract = new ArrayList<>();

    @NotNull
    @JsonAlias({"ids:created", "created"})
    protected XMLGregorianCalendar _created;

    @NotNull
    @JsonAlias({"ids:data", "data"})
    protected URI _data;

    @JsonAlias({"ids:hasState", "hasState"})
    protected List<ArtifactState> _hasState = new ArrayList<>();

    @JsonAlias({"ids:modified", "modified"})
    protected XMLGregorianCalendar _modified;

    @JsonAlias({"ids:requester", "requester"})
    protected URI _requester;

    @JsonAlias({"ids:source", "source"})
    protected URI _source;

    @JsonAlias({"ids:usageDuration", "usageDuration"})
    protected javax.xml.datatype.Duration _usageDuration;

    @JsonAlias({"ids:user", "user"})
    protected Participant _user;

    protected UsageControlObjectImpl() {
        id = VocabUtil.getInstance().createRandomUrl("usageControlObject");
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
        return Objects.hash(this._data,
            this._user,
            this._source,
            this._contract,
            this._usageDuration,
            this._accessed,
            this._hasState,
            this._requester,
            this._created,
            this._modified,
            this._action);
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
            UsageControlObjectImpl other = (UsageControlObjectImpl) obj;
            return Objects.equals(this._data, other._data) &&
                Objects.equals(this._user, other._user) &&
                Objects.equals(this._source, other._source) &&
                Objects.equals(this._contract, other._contract) &&
                Objects.equals(this._usageDuration, other._usageDuration) &&
                Objects.equals(this._accessed, other._accessed) &&
                Objects.equals(this._hasState, other._hasState) &&
                Objects.equals(this._requester, other._requester) &&
                Objects.equals(this._created, other._created) &&
                Objects.equals(this._modified, other._modified) &&
                Objects.equals(this._action, other._action);
        }
    }

    @Override
    public UsageControlObject deepCopy() {
        UsageControlObjectBuilder builder = new UsageControlObjectBuilder();
        if (this._data != null) {
            builder._data_(URI.create(this._data.toString()));
        }
        if (this._user != null) {
            builder._user_(this._user.deepCopy());
        }
        if (this._source != null) {
            builder._source_(URI.create(this._source.toString()));
        }
        for (ContractAgreement item : this._contract) {
            if (item != null) {
                builder._contract_(item.deepCopy());
            }
        }
        builder._usageDuration_(this._usageDuration);
        if (this._accessed != null) {
            builder._accessed_((XMLGregorianCalendar) this._accessed.clone());
        }
        for (ArtifactState item : this._hasState) {
            builder._hasState_(item);
        }
        if (this._requester != null) {
            builder._requester_(URI.create(this._requester.toString()));
        }
        if (this._created != null) {
            builder._created_((XMLGregorianCalendar) this._created.clone());
        }
        if (this._modified != null) {
            builder._modified_((XMLGregorianCalendar) this._modified.clone());
        }
        for (Action item : this._action) {
            builder._action_(item);
        }
        return builder.build();
    }

    // accessor method implementations as derived from the IDS Information Model ontology

    @Override
    @NotNull
    public URI getData() {
        return _data;
    }

    @Override
    public void setData(URI _data_) {
        this._data = _data_;
    }

    @Override
    public Participant getUser() {
        return _user;
    }

    @Override
    public void setUser(Participant _user_) {
        this._user = _user_;
    }

    @Override
    public URI getSource() {
        return _source;
    }

    @Override
    public void setSource(URI _source_) {
        this._source = _source_;
    }

    @Override
    @NotEmpty
    public List<ContractAgreement> getContract() {
        return _contract;
    }

    @Override
    public void setContract(List<ContractAgreement> _contract_) {
        this._contract = _contract_;
    }

    @Override
    public javax.xml.datatype.Duration getUsageDuration() {
        return _usageDuration;
    }

    @Override
    public void setUsageDuration(javax.xml.datatype.Duration _usageDuration_) {
        this._usageDuration = _usageDuration_;
    }

    @Override
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    public XMLGregorianCalendar getAccessed() {
        return _accessed;
    }

    @Override
    public void setAccessed(XMLGregorianCalendar _accessed_) {
        this._accessed = _accessed_;
    }

    @Override
    public List<ArtifactState> getHasState() {
        return _hasState;
    }

    @Override
    public void setHasState(List<ArtifactState> _hasState_) {
        this._hasState = _hasState_;
    }

    @Override
    public URI getRequester() {
        return _requester;
    }

    @Override
    public void setRequester(URI _requester_) {
        this._requester = _requester_;
    }

    @Override
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    @NotNull
    public XMLGregorianCalendar getCreated() {
        return _created;
    }

    @Override
    public void setCreated(XMLGregorianCalendar _created_) {
        this._created = _created_;
    }

    @Override
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    public XMLGregorianCalendar getModified() {
        return _modified;
    }

    @Override
    public void setModified(XMLGregorianCalendar _modified_) {
        this._modified = _modified_;
    }

    @Override
    public List<Action> getAction() {
        return _action;
    }

    @Override
    public void setAction(List<Action> _action_) {
        this._action = _action_;
    }
}
