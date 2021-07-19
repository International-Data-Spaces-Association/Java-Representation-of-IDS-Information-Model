package de.fraunhofer.iais.eis;

import java.util.List;


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
public interface LogicalConstraint extends AbstractConstraint {

    // standard methods

    @Beta
    public LogicalConstraint deepCopy();

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
