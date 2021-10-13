package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
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
     * The recipient of the policy statement.
     *
     * More information under https://w3id.org/idsa/core/assignee
     *
     * @return Returns the List of Participants for the property _assigneeAsParticipant.
     */
    @JsonIgnore
    List<Participant> getAssigneeAsParticipant();

    /**
     * The recipient of the policy statement.
     *
     * More information under https://w3id.org/idsa/core/assignee
     *
     * @param _assignee_ desired value for the property _assigneeAsParticipant.
     */
    void setAssigneeAsParticipant(List<Participant> _assignee_);

    /**
     * Helper function for (de-)serialization of the _rule and the _ruleAsParticipantfields.
     *
     * @return Returns the a UriOrModelClass object with the content of the field or null if the field
     *         is not set.
     */
    @JsonGetter("ids:assignee")
    UriOrModelClass getAssigneeAsObject();

    /**
     * The issuer of the policy statement.
     *
     * More information under https://w3id.org/idsa/core/assigner
     *
     * @return Returns the List of URIs for the property _assigner.
     */
    @JsonIgnore
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
     * The issuer of the policy statement.
     *
     * More information under https://w3id.org/idsa/core/assigner
     *
     * @return Returns the List of Participants for the property _assignerAsParticipant.
     */
    @JsonIgnore
    List<Participant> getAssignerAsParticipant();

    /**
     * The issuer of the policy statement.
     *
     * More information under https://w3id.org/idsa/core/assigner
     *
     * @param _assigner_ desired value for the property _assignerAsParticipant.
     */
    void setAssignerAsParticipant(List<Participant> _assigner_);

    /**
     * Helper function for (de-)serialization of the _rule and the _ruleAsParticipantfields.
     *
     * @return Returns the a UriOrModelClass object with the content of the field or null if the field
     *         is not set.
     */
    @JsonGetter("ids:assigner")
    UriOrModelClass getAssignerAsObject();

    /**
     * The subject of the policy statement (ids:Rule).
     *
     * More information under https://w3id.org/idsa/core/target
     *
     * @return Returns the URI for the property _target.
     */
    @JsonIgnore
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
     * The subject of the policy statement (ids:Rule).
     *
     * More information under https://w3id.org/idsa/core/target
     *
     * @return Returns the Asset for the property _targetAsAsset.
     */
    @JsonIgnore
    Asset getTargetAsAsset();

    /**
     * The subject of the policy statement (ids:Rule).
     *
     * More information under https://w3id.org/idsa/core/target
     *
     * @param _target_ desired value for the property _targetAsAsset.
     */
    void setTargetAsAsset(Asset _target_);

    /**
     * Helper function for (de-)serialization of the _rule and the _ruleAsAssetfields.
     *
     * @return Returns the a UriOrModelClass object with the content of the field or null if the field
     *         is not set.
     */
    @JsonGetter("ids:target")
    UriOrModelClass getTargetAsObject();

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
