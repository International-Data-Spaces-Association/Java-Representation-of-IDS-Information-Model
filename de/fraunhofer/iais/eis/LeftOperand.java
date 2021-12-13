package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Instances of the LeftOperand class are used as the leftOperand of a Constraint.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = LeftOperandImpl.class)
})
public interface LeftOperand extends ModelClass {

    // standard methods

    @Beta
    public LeftOperand deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * This LeftOperand is transitively included in the object LeftOperand.
     *
     * More information under https://w3id.org/idsa/core/broader
     *
     * @return Returns the LeftOperand for the property _broader.
     */
    @JsonProperty("ids:broader")
    LeftOperand getBroader();

    /**
     * This LeftOperand is transitively included in the object LeftOperand.
     *
     * More information under https://w3id.org/idsa/core/broader
     *
     * @param _broader_ desired value for the property _broader.
     */
    void setBroader(LeftOperand _broader_);

}
