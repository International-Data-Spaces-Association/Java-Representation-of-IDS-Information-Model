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
 * Default implementation of package de.fraunhofer.iais.eis.Constraint
 * 
 * The class of Constraints that restrict a Rule.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:Constraint")
public class ConstraintImpl implements Constraint {

    @JsonProperty("@id")
    @JsonAlias({"@id", "id"})
    @NotNull
    protected URI id;

    // List of all labels of this class
    @JsonIgnore
    protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Constraint", "en"));

    // List of all comments of this class
    @JsonIgnore
    protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("The class of Constraints that restrict a Rule.", "en"));

    // all classes have a generic property array
    @JsonIgnore
    protected Map<String, Object> properties;

    // instance fields as derived from the IDS Information Model ontology

    @NotNull
    @JsonAlias({"ids:leftOperand", "leftOperand"})
    protected LeftOperand _leftOperand;

    @NotNull
    @JsonAlias({"ids:operator", "operator"})
    protected BinaryOperator _operator;

    @JsonAlias({"ids:pipEndpoint", "pipEndpoint"})
    protected URI _pipEndpoint;

    @JsonAlias({"ids:rightOperand", "rightOperand"})
    protected RdfResource _rightOperand;

    @JsonAlias({"ids:rightOperandReference", "rightOperandReference"})
    protected URI _rightOperandReference;

    @JsonAlias({"ids:unit", "unit"})
    protected URI _unit;

    protected ConstraintImpl() {
        id = VocabUtil.getInstance().createRandomUrl("constraint");
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
        return Objects.hash(this._leftOperand,
            this._operator,
            this._rightOperand,
            this._rightOperandReference,
            this._unit,
            this._pipEndpoint);
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
            ConstraintImpl other = (ConstraintImpl) obj;
            return Objects.equals(this._leftOperand, other._leftOperand) &&
                Objects.equals(this._operator, other._operator) &&
                Objects.equals(this._rightOperand, other._rightOperand) &&
                Objects.equals(this._rightOperandReference, other._rightOperandReference) &&
                Objects.equals(this._unit, other._unit) &&
                Objects.equals(this._pipEndpoint, other._pipEndpoint);
        }
    }

    @Override
    public Constraint deepCopy() {
        ConstraintBuilder builder = new ConstraintBuilder();
        builder._leftOperand_(this._leftOperand);
        builder._operator_(this._operator);
        if (this._rightOperand != null) {
            builder._rightOperand_(new RdfResource(this._rightOperand.getValue(), URI.create(this._rightOperand.getType())));
        }
        if (this._rightOperandReference != null) {
            builder._rightOperandReference_(URI.create(this._rightOperandReference.toString()));
        }
        if (this._unit != null) {
            builder._unit_(URI.create(this._unit.toString()));
        }
        if (this._pipEndpoint != null) {
            builder._pipEndpoint_(URI.create(this._pipEndpoint.toString()));
        }
        return builder.build();
    }

    // accessor method implementations as derived from the IDS Information Model ontology

    @Override
    @NotNull
    public LeftOperand getLeftOperand() {
        return _leftOperand;
    }

    @Override
    public void setLeftOperand(LeftOperand _leftOperand_) {
        this._leftOperand = _leftOperand_;
    }

    @Override
    @NotNull
    public BinaryOperator getOperator() {
        return _operator;
    }

    @Override
    public void setOperator(BinaryOperator _operator_) {
        this._operator = _operator_;
    }

    @Override
    public RdfResource getRightOperand() {
        return _rightOperand;
    }

    @Override
    public void setRightOperand(RdfResource _rightOperand_) {
        this._rightOperand = _rightOperand_;
    }

    @Override
    public URI getRightOperandReference() {
        return _rightOperandReference;
    }

    @Override
    public void setRightOperandReference(URI _rightOperandReference_) {
        this._rightOperandReference = _rightOperandReference_;
    }

    @Override
    public URI getUnit() {
        return _unit;
    }

    @Override
    public void setUnit(URI _unit_) {
        this._unit = _unit_;
    }

    @Override
    public URI getPipEndpoint() {
        return _pipEndpoint;
    }

    @Override
    public void setPipEndpoint(URI _pipEndpoint_) {
        this._pipEndpoint = _pipEndpoint_;
    }

}
