package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Superclass of Permissions, Prohibitions and Duties.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = Permission.class),
    @JsonSubTypes.Type(value = Prohibition.class),
    @JsonSubTypes.Type(value = Duty.class)
})
public interface Rule extends Described {

    // standard methods

    @Beta
    public Rule deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * The recipient of the policy statement.
     *
     * More information under https://w3id.org/idsa/core/assignee
     *
     * @return Returns the List of URIs for the property _assignee.
     */
    @JsonProperty("ids:assignee")
    List<URI> getAssignee();

    /**
     * The recipient of the policy statement.
     *
     * More information under https://w3id.org/idsa/core/assignee
     *
     * @param _assignee_ desired value for the property _assignee.
     */
    void setAssignee(List<URI> _assignee_);

    /**
     * The issuer of the policy statement.
     *
     * More information under https://w3id.org/idsa/core/assigner
     *
     * @return Returns the List of URIs for the property _assigner.
     */
    @JsonProperty("ids:assigner")
    List<URI> getAssigner();

    /**
     * The issuer of the policy statement.
     *
     * More information under https://w3id.org/idsa/core/assigner
     *
     * @param _assigner_ desired value for the property _assigner.
     */
    void setAssigner(List<URI> _assigner_);

    /**
     * The subject of the policy statement (ids:Rule).
     *
     * More information under https://w3id.org/idsa/core/target
     *
     * @return Returns the URI for the property _target.
     */
    @JsonProperty("ids:target")
    URI getTarget();

    /**
     * The subject of the policy statement (ids:Rule).
     *
     * More information under https://w3id.org/idsa/core/target
     *
     * @param _target_ desired value for the property _target.
     */
    void setTarget(URI _target_);

    /**
     * The constraint to be used for a specific rule.
     *
     * More information under https://w3id.org/idsa/core/constraint
     *
     * @return Returns the List of AbstractConstraints for the property _constraint.
     */
    @JsonProperty("ids:constraint")
    List<AbstractConstraint> getConstraint();

    /**
     * The constraint to be used for a specific rule.
     *
     * More information under https://w3id.org/idsa/core/constraint
     *
     * @param _constraint_ desired value for the property _constraint.
     */
    void setConstraint(List<AbstractConstraint> _constraint_);

    /**
     * The operation relating to the asset / data object.
     *
     * More information under https://w3id.org/idsa/core/action
     *
     * @return Returns the List of Actions for the property _action.
     */
    @NotEmpty
    @JsonProperty("ids:action")
    List<Action> getAction();

    /**
     * The operation relating to the asset / data object.
     *
     * More information under https://w3id.org/idsa/core/action
     *
     * @param _action_ desired value for the property _action.
     */
    void setAction(List<Action> _action_);

    /**
     * AssetRefinement define constraints that refine a (composite) Digital Content in an ids:Rule
     * respectively the ids:AssetCollection.
     *
     * More information under https://w3id.org/idsa/core/assetRefinement
     *
     * @return Returns the AbstractConstraint for the property _assetRefinement.
     */
    @JsonProperty("ids:assetRefinement")
    AbstractConstraint getAssetRefinement();

    /**
     * AssetRefinement define constraints that refine a (composite) Digital Content in an ids:Rule
     * respectively the ids:AssetCollection.
     *
     * More information under https://w3id.org/idsa/core/assetRefinement
     *
     * @param _assetRefinement_ desired value for the property _assetRefinement.
     */
    void setAssetRefinement(AbstractConstraint _assetRefinement_);

}
