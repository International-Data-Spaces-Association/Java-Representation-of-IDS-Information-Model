package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The upper class of Constraints and LogicalConstraints is solely intended as a placholder at the
 * range of IDS Properties.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = Constraint.class),
    @JsonSubTypes.Type(value = LogicalConstraint.class)
})
public interface AbstractConstraint extends ModelClass {

    // standard methods

    @Beta
    public AbstractConstraint deepCopy();

}
