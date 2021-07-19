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

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

/**
 * Default implementation of package de.fraunhofer.iais.eis.Duty
 * 
 * The class of Duties as defined in the ODRL ontology.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:Duty")
public class DutyImpl implements Duty {

    @JsonProperty("@id")
    @JsonAlias({"@id", "id"})
    @NotNull
    protected URI id;

    // List of all labels of this class
    @JsonIgnore
    protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Duty", "en"));

    // List of all comments of this class
    @JsonIgnore
    protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("The class of Duties as defined in the ODRL ontology.", "en"));

    // all classes have a generic property array
    @JsonIgnore
    protected Map<String, Object> properties;

    // instance fields as derived from the IDS Information Model ontology

    @NotEmpty
    @JsonAlias({"ids:action", "action"})
    protected List<Action> _action = new ArrayList<>();

    @JsonAlias({"ids:assetRefinement", "assetRefinement"})
    protected AbstractConstraint _assetRefinement;

    @JsonAlias({"ids:assignee", "assignee"})
    protected List<URI> _assignee = new ArrayList<>();

    @JsonAlias({"ids:assigner", "assigner"})
    protected List<URI> _assigner = new ArrayList<>();

    @JsonAlias({"ids:constraint", "constraint"})
    protected List<AbstractConstraint> _constraint = new ArrayList<>();

    @JsonAlias({"ids:description", "description"})
    protected List<TypedLiteral> _description = new ArrayList<>();

    @JsonAlias({"ids:target", "target"})
    protected URI _target;

    @JsonAlias({"ids:title", "title"})
    protected List<TypedLiteral> _title = new ArrayList<>();

    protected DutyImpl() {
        id = VocabUtil.getInstance().createRandomUrl("duty");
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
        return Objects.hash(this._assignee,
            this._assigner,
            this._target,
            this._constraint,
            this._action,
            this._assetRefinement,
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
            DutyImpl other = (DutyImpl) obj;
            return Objects.equals(this._assignee, other._assignee) &&
                Objects.equals(this._assigner, other._assigner) &&
                Objects.equals(this._target, other._target) &&
                Objects.equals(this._constraint, other._constraint) &&
                Objects.equals(this._action, other._action) &&
                Objects.equals(this._assetRefinement, other._assetRefinement) &&
                Objects.equals(this._title, other._title) &&
                Objects.equals(this._description, other._description);
        }
    }

    @Override
    public Duty deepCopy() {
        DutyBuilder builder = new DutyBuilder();
        for (URI item : this._assignee) {
            if (item != null) {
                builder._assignee_(URI.create(item.toString()));
            }
        }
        for (URI item : this._assigner) {
            if (item != null) {
                builder._assigner_(URI.create(item.toString()));
            }
        }
        if (this._target != null) {
            builder._target_(URI.create(this._target.toString()));
        }
        for (AbstractConstraint item : this._constraint) {
            if (item != null) {
                builder._constraint_(item.deepCopy());
            }
        }
        for (Action item : this._action) {
            builder._action_(item);
        }
        if (this._assetRefinement != null) {
            builder._assetRefinement_(this._assetRefinement.deepCopy());
        }
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
    public List<URI> getAssignee() {
        return _assignee;
    }

    @Override
    public void setAssignee(List<URI> _assignee_) {
        this._assignee = _assignee_;
    }

    @Override
    public List<URI> getAssigner() {
        return _assigner;
    }

    @Override
    public void setAssigner(List<URI> _assigner_) {
        this._assigner = _assigner_;
    }

    @Override
    public URI getTarget() {
        return _target;
    }

    @Override
    public void setTarget(URI _target_) {
        this._target = _target_;
    }

    @Override
    public List<AbstractConstraint> getConstraint() {
        return _constraint;
    }

    @Override
    public void setConstraint(List<AbstractConstraint> _constraint_) {
        this._constraint = _constraint_;
    }

    @Override
    @NotEmpty
    public List<Action> getAction() {
        return _action;
    }

    @Override
    public void setAction(List<Action> _action_) {
        this._action = _action_;
    }

    @Override
    public AbstractConstraint getAssetRefinement() {
        return _assetRefinement;
    }

    @Override
    public void setAssetRefinement(AbstractConstraint _assetRefinement_) {
        this._assetRefinement = _assetRefinement_;
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
