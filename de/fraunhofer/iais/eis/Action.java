package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonAlias;
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
    @JsonAlias({"https://w3id.org/idsa/core/actionRefinement", "ids:actionRefinement", "actionRefinement"})
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
    @JsonAlias({"https://w3id.org/idsa/core/includedIn", "ids:includedIn", "includedIn"})
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
    @JsonAlias({"https://w3id.org/idsa/core/pxpEndpoint", "ids:pxpEndpoint", "pxpEndpoint"})
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

    // Default instances of this class as defined in the ontology

    /**
     * This action modifies a number by adding a given value to it. This action modifies a number by
     * adding a given value to it. The field to be modified and the given value are specified in the
     * policy as idsc:JSONPATH/idsc:XPATH and idsc:OPERAND, respectively.
     */
    Action ADD = new ActionBuilder(URI.create("https://w3id.org/idsa/code/ADD")).build();

    /**
     * Data will be part of another piece of data so that it is not distinguishable anymore. This action
     * is always evaluated at the consumer side.
     */
    Action AGGREGATE_BY_CONSUMER = new ActionBuilder(URI.create("https://w3id.org/idsa/code/AGGREGATE_BY_CONSUMER")).build();

    /**
     * Data will be part of another piece of data so that it is not distinguishable anymore. This action
     * is always evaluated at the provider side.
     */
    Action AGGREGATE_BY_PROVIDER = new ActionBuilder(URI.create("https://w3id.org/idsa/code/AGGREGATE_BY_PROVIDER")).build();

    /**
     * To anonymize all, parts or certain attributes of the resource. This action is always evaluated at
     * the provider side.
     */
    Action ANONYMIZE = new ActionBuilder(URI.create("https://w3id.org/idsa/code/ANONYMIZE")).build();

    /**
     * To pay a certain amount of money in order to use a resource. This action must be evaluated both
     * at the consumer and provider side. A compensation might be required before access is granted
     * (provider-side), or each time the usage action is performed (consumer-side).
     */
    Action COMPENSATE = new ActionBuilder(URI.create("https://w3id.org/idsa/code/COMPENSATE")).build();

    /**
     * To remove a resource or inhibit any further access with reasonable measures. This action is
     * evaluated at the consumer side if used in a duty clause. A provider cannot be forced to delete
     * its data resources. If used in a permission clause, it is effecting the data provider as it
     * allows the consumer to delete the provider's resource remotely.
     */
    Action DELETE = new ActionBuilder(URI.create("https://w3id.org/idsa/code/DELETE")).build();

    /**
     * To forward or supply a resource to a third-party. This action is always evaluated at the consumer
     * side and allows it to become a data provider of this resource.
     */
    Action DISTRIBUTE = new ActionBuilder(URI.create("https://w3id.org/idsa/code/DISTRIBUTE")).build();

    /**
     * This action modifies dividing something by something else. This action modifies dividing
     * something by something else. The field to be modified and the given value are specified in the
     * policy as idsc:JSONPATH/idsc:XPATH and idsc:OPERAND, respectively.
     */
    Action DIVIDE = new ActionBuilder(URI.create("https://w3id.org/idsa/code/DIVIDE")).build();

    /**
     * The data artifact or parts of it are encrypted and can not be read by neither the
     * ids:DataConsumer nor any other third party. The encryption algorithm might be specified by a
     * constraint. This action is always evaluated at the provider side.
     */
    Action ENCRYPT = new ActionBuilder(URI.create("https://w3id.org/idsa/code/ENCRYPT")).build();

    /**
     * To grant use of a resource to another party. Does *not* imply any other usage rights. This action
     * is always evaluated at the consumer side, at the moment a third party intends to access the
     * resource as received by the original consumer.
     */
    Action GRANT_USE = new ActionBuilder(URI.create("https://w3id.org/idsa/code/GRANT_USE")).build();

    /**
     * This action modifies a value by replacing it with a hash of the value. This action modifies a
     * value by replacing it with a hash of the value. The field to be modified and the hash algorithm
     * are specified in the policy as idsc:JSONPATH/idsc:XPATH and idsc:HASH_ALGORITHM (eg. SHA256),
     * respectively.
     */
    Action HASH = new ActionBuilder(URI.create("https://w3id.org/idsa/code/HASH")).build();

    /**
     * An action to be used in the count usage policy where the idsc:COUNT left operand is used.
     */
    Action INCREMENT_COUNTER = new ActionBuilder(URI.create("https://w3id.org/idsa/code/INCREMENT_COUNTER")).build();

    /**
     * To log information or store information about incidents in a local file or database. Is not
     * necessarily available to external parties but can be used to create transparency on happened
     * events. This action is always evaluated at the consumer side.
     */
    Action LOG = new ActionBuilder(URI.create("https://w3id.org/idsa/code/LOG")).build();

    /**
     * To change a resource locally. This action is always evaluated at the consumer side. It
     * corresponds to 'allow changes of the copied resource'.
     */
    Action MODIFY = new ActionBuilder(URI.create("https://w3id.org/idsa/code/MODIFY")).build();

    /**
     * This action modifies a number by multiplying it to a given value. This action modifies a number
     * by multiplying it to a given value. The field to be modified and the given value are specified in
     * the policy as idsc:JSONPATH/idsc:XPATH and idsc:OPERAND, respectively.
     */
    Action MULTIPLY = new ActionBuilder(URI.create("https://w3id.org/idsa/code/MULTIPLY")).build();

    /**
     * To forward the resource under the same policy. Implies a permission to distribute. This action is
     * always evaluated at the consumer side.
     */
    Action NEXT_POLICY = new ActionBuilder(URI.create("https://w3id.org/idsa/code/NEXT_POLICY")).build();

    /**
     * To log information or notify an instance about incidents. Can be used to define Clearing House
     * interactions. This action can target the consumer and the data provider of the resource.
     */
    Action NOTIFY = new ActionBuilder(URI.create("https://w3id.org/idsa/code/NOTIFY")).build();

    /**
     * To obtain data from the resource. This action is always evaluated at the provider side. It
     * corresponds to 'give access to a resource'.
     */
    Action READ = new ActionBuilder(URI.create("https://w3id.org/idsa/code/READ")).build();

    /**
     * To replace some value. This action modifies a value by replacing it with a given value. The field
     * to be modified and the given value are specified in the policy as idsc:JSONPATH/idsc:XPATH and
     * idsc:REPLACE_WITH, respectively.
     */
    Action REPLACE = new ActionBuilder(URI.create("https://w3id.org/idsa/code/REPLACE")).build();

    /**
     * This action modifies a value by replacing it with an anagram of the value. This action modifies a
     * value by replacing it with an anagram of the value. The field to be modified is specified in the
     * policy as idsc:JSONPATH/idsc:XPATH.
     */
    Action SHUFFLE = new ActionBuilder(URI.create("https://w3id.org/idsa/code/SHUFFLE")).build();

    /**
     * To accept that the use of the Asset may be tracked. This action is always evaluated at the
     * consumer side.
     */
    Action TRACK_PROVENANCE = new ActionBuilder(URI.create("https://w3id.org/idsa/code/TRACK_PROVENANCE")).build();

    /**
     * To use a resource in any possible way. Includes all other actions. This action is always
     * evaluated at the consumer side.
     */
    Action USE = new ActionBuilder(URI.create("https://w3id.org/idsa/code/USE")).build();

    /**
     * To change a remote resource. This action is always evaluated at the provider side. It corresponds
     * to 'allow changes of a resource' but *not* including its deletion.
     */
    Action WRITE = new ActionBuilder(URI.create("https://w3id.org/idsa/code/WRITE")).build();

}
