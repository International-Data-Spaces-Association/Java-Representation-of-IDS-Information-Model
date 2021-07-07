package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The class of Logical Constraints that restrict a Rule. A Logical Constraints is a collection of
 * Constraints, related with each other through the ids:operand property.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = LogicalConstraintImpl.class)
})
public interface LogicalConstraint extends ModelClass, AbstractConstraint {

    // standard methods

    /**
     * This function retrieves the ID of the current object (can be set via the constructor of the
     * builder class)
     * 
     * @return ID of current object as URI
     */
    @JsonProperty("@id")
    @NotNull
    public URI getId();

    /**
     * This function retrieves a human readable label about the current class, as defined in the
     * ontology. This label could, for example, be used as a field heading in a user interface
     * 
     * @return Human readable label
     */
    public List<TypedLiteral> getLabel();

    /**
     * This function retrieves a human readable explanatory comment about the current class, as defined
     * in the ontology. This comment could, for example, be used as a tooltip in a user interface
     * 
     * @return Human readable explanatory comment
     */
    public List<TypedLiteral> getComment();

    public String toRdf();

    // getter and setter for generic property map
    public Map<String, Object> getProperties();

    public void setProperty(String property, Object value);

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * The 'and' operand connects a rdf:List of Constraints with the Boolean operator 'AND'. All
     * Constraints of an 'and' relation must be satisfied at the same time. Only one of ids:and, ids:or,
     * or ids:xone can be used for a specific ids:LogicalConstraint!
     *
     * More information under https://w3id.org/idsa/core/and
     *
     * @return Returns the List of Constraints for the property _and.
     */
    @JsonProperty("ids:and")
    List<Constraint> getAnd();

    /**
     * The 'and' operand connects a rdf:List of Constraints with the Boolean operator 'AND'. All
     * Constraints of an 'and' relation must be satisfied at the same time. Only one of ids:and, ids:or,
     * or ids:xone can be used for a specific ids:LogicalConstraint!
     *
     * More information under https://w3id.org/idsa/core/and
     *
     * @param _and_ desired value for the property _and.
     */
    void setAnd(List<Constraint> _and_);

    /**
     * The 'or' operand connects a rdf:List of Constraints with the Boolean operator 'OR'. At least one
     * Constraint of an 'or' relation must be satisfied. Only one of ids:and, ids:or, or ids:xone can be
     * used for a specific ids:LogicalConstraint!
     *
     * More information under https://w3id.org/idsa/core/or
     *
     * @return Returns the List of Constraints for the property _or.
     */
    @JsonProperty("ids:or")
    List<Constraint> getOr();

    /**
     * The 'or' operand connects a rdf:List of Constraints with the Boolean operator 'OR'. At least one
     * Constraint of an 'or' relation must be satisfied. Only one of ids:and, ids:or, or ids:xone can be
     * used for a specific ids:LogicalConstraint!
     *
     * More information under https://w3id.org/idsa/core/or
     *
     * @param _or_ desired value for the property _or.
     */
    void setOr(List<Constraint> _or_);

    /**
     * The 'xone' operand connects a rdf:List of Constraints. Only one Constraint, not more, of an
     * 'xone' relation must be satisfied. Only one of ids:and, ids:or, or ids:xone can be used for a
     * specific ids:LogicalConstraint!
     *
     * More information under https://w3id.org/idsa/core/xone
     *
     * @return Returns the List of Constraints for the property _xone.
     */
    @JsonProperty("ids:xone")
    List<Constraint> getXone();

    /**
     * The 'xone' operand connects a rdf:List of Constraints. Only one Constraint, not more, of an
     * 'xone' relation must be satisfied. Only one of ids:and, ids:or, or ids:xone can be used for a
     * specific ids:LogicalConstraint!
     *
     * More information under https://w3id.org/idsa/core/xone
     *
     * @param _xone_ desired value for the property _xone.
     */
    void setXone(List<Constraint> _xone_);

}
