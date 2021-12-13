package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * A thing one might be permitted to do or prohibited from doing to something.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ActionImpl.class)
})
public interface Action extends ModelClass {

    // standard methods

    @Beta
    public Action deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Constraint that refines an Action.
     *
     * More information under https://w3id.org/idsa/core/actionRefinement
     *
     * @return Returns the List of Constraints for the property _actionRefinement.
     */
    @JsonProperty("ids:actionRefinement")
    List<Constraint> getActionRefinement();

    /**
     * Constraint that refines an Action.
     *
     * More information under https://w3id.org/idsa/core/actionRefinement
     *
     * @param _actionRefinement_ desired value for the property _actionRefinement.
     */
    void setActionRefinement(List<Constraint> _actionRefinement_);

    /**
     * The subject transitively asserts the object Action.
     *
     * More information under https://w3id.org/idsa/core/includedIn
     *
     * @return Returns the Action for the property _includedIn.
     */
    @JsonProperty("ids:includedIn")
    Action getIncludedIn();

    /**
     * The subject transitively asserts the object Action.
     *
     * More information under https://w3id.org/idsa/core/includedIn
     *
     * @param _includedIn_ desired value for the property _includedIn.
     */
    void setIncludedIn(Action _includedIn_);

    /**
     * The reference to the PXP which operates a specific action, URI or reference to an associated PXP
     * interface.
     *
     * More information under https://w3id.org/idsa/core/pxpEndpoint
     *
     * @return Returns the PXP for the property _pxpEndpoint.
     */
    @JsonProperty("ids:pxpEndpoint")
    PXP getPxpEndpoint();

    /**
     * The reference to the PXP which operates a specific action, URI or reference to an associated PXP
     * interface.
     *
     * More information under https://w3id.org/idsa/core/pxpEndpoint
     *
     * @param _pxpEndpoint_ desired value for the property _pxpEndpoint.
     */
    void setPxpEndpoint(PXP _pxpEndpoint_);

}
