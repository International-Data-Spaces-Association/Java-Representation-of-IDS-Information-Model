package de.fraunhofer.iais.eis;

import java.net.URI;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Defined usage policy classes in the IDS.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = UsagePolicyClassImpl.class)
})
public interface UsagePolicyClass extends ModelClass {

    // standard methods

    @Beta
    public UsagePolicyClass deepCopy();

    // Default instances of this class as defined in the ontology

    /**
     * This policy restricts the usage of the data to a specific Data Consumer, regardless of how many
     * connectors they have and without any further usage restriction.
     */
    UsagePolicyClass ALLOW_DATA_USAGE = new UsagePolicyClassBuilder(URI.create("https://w3id.org/idsa/code/ALLOW_DATA_USAGE")).build();

    /**
     * This policy restricts the usage of the data to a specific system or application inside an IDS
     * Connector.
     */
    UsagePolicyClass APPLICATION_RESTRICTED_DATA_USAGE =
        new UsagePolicyClassBuilder(URI.create("https://w3id.org/idsa/code/APPLICATION_RESTRICTED_DATA_USAGE")).build();

    /**
     * This policy restricts the usage of data assets with the obligation to notify a specific party
     * about the data usage.
     */
    UsagePolicyClass ATTACH_POLICY_FOR_THIRD_PARTY =
        new UsagePolicyClassBuilder(URI.create("https://w3id.org/idsa/code/ATTACH_POLICY_FOR_THIRD_PARTY")).build();

    /**
     * This policy restrict the usage of the data to a specific IDS connector.
     */
    UsagePolicyClass CONNECTOR_RESTRICTED_DATA_USAGE =
        new UsagePolicyClassBuilder(URI.create("https://w3id.org/idsa/code/CONNECTOR_RESTRICTED_DATA_USAGE")).build();

    /**
     * This policy restricts transfer of data in return for a monthly fee. The ending is not specified.
     * Nevertheless, the policy ends when a notice of termination has been made by any of the policy
     * partners.
     */
    UsagePolicyClass DATA_RENTAL = new UsagePolicyClassBuilder(URI.create("https://w3id.org/idsa/code/DATA_RENTAL")).build();

    /**
     * This policy restricts the usage of data assets with the obligation to encrypt the data asset
     * before distribution.
     */
    UsagePolicyClass DISTRIBUTE_ONLY_IF_ENCRYPTED =
        new UsagePolicyClassBuilder(URI.create("https://w3id.org/idsa/code/DISTRIBUTE_ONLY_IF_ENCRYPTED")).build();

    /**
     * This policy restricts the usage of the data to a specific duration.
     */
    UsagePolicyClass DURATION_RESTRICTED_DATA_USAGE =
        new UsagePolicyClassBuilder(URI.create("https://w3id.org/idsa/code/DURATION_RESTRICTED_DATA_USAGE")).build();

    /**
     * This policy restricts the usage of data assets limited to specific events. The ODRL language
     * defines an identified event as a context for exercising the action of the Rule. Events are
     * temporal periods of time. A Data Provider may want to restrict the usage of the data to a
     * specific event when the exact time and date of the event is not clear in advance. Therefore, the
     * event condition can be specified in a policy.
     */
    UsagePolicyClass EVENT_RESTRICTED_DATA_USAGE =
        new UsagePolicyClassBuilder(URI.create("https://w3id.org/idsa/code/EVENT_RESTRICTED_DATA_USAGE")).build();

    /**
     * This policy restricts the usage of the data to a specific (time) interval.
     */
    UsagePolicyClass INTERVAL_RESTRICTED_DATA_USAGE =
        new UsagePolicyClassBuilder(URI.create("https://w3id.org/idsa/code/INTERVAL_RESTRICTED_DATA_USAGE")).build();

    /**
     * This policy restricts the usage of data assets with the obligation to log prior specified
     * processes, such as the data access.
     */
    UsagePolicyClass LOCAL_LOGGING = new UsagePolicyClassBuilder(URI.create("https://w3id.org/idsa/code/LOCAL_LOGGING")).build();

    /**
     * This policy restricts the usage of the data to a specific location, e.g., expressed via location
     * areas, geographic points or geographic bounding polygons.
     */
    UsagePolicyClass LOCATION_RESTRICTED_DATA_USAGE =
        new UsagePolicyClassBuilder(URI.create("https://w3id.org/idsa/code/LOCATION_RESTRICTED_DATA_USAGE")).build();

    /**
     * This policy restricts the usage of data assets with the obligation to anonymize the data before
     * permission to use the data is granted. In contrast to the idsc:MODIFY_DATA_IN_TRANSIT policy
     * class, it demands the modifications to be done when data is stored.
     */
    UsagePolicyClass MODIFY_DATA_IN_REST =
        new UsagePolicyClassBuilder(URI.create("https://w3id.org/idsa/code/MODIFY_DATA_IN_REST")).build();

    /**
     * This policy restricts the usage of data assets with the obligation to anonymize the data when it
     * is leaving the Data Provider connector or when it is entering the Data Consumer connector
     */
    UsagePolicyClass MODIFY_DATA_IN_TRANSIT =
        new UsagePolicyClassBuilder(URI.create("https://w3id.org/idsa/code/MODIFY_DATA_IN_TRANSIT")).build();

    /**
     * This policy restricts the transfer of a Data Asset against a one-off payment in a given currency.
     */
    UsagePolicyClass PREPATUAL_DATA_SALE =
        new UsagePolicyClassBuilder(URI.create("https://w3id.org/idsa/code/PREPATUAL_DATA_SALE")).build();

    /**
     * This policy restricts the usage of data assets limited to specific purposes.
     */
    UsagePolicyClass PURPOSE_RESTRICTED_DATA_USAGE =
        new UsagePolicyClassBuilder(URI.create("https://w3id.org/idsa/code/PURPOSE_RESTRICTED_DATA_USAGE")).build();

    /**
     * This policy restricts the usage of data assets with the obligation to notify a specific party
     * about the data usage.
     */
    UsagePolicyClass REMOTE_NOTIFICATION =
        new UsagePolicyClassBuilder(URI.create("https://w3id.org/idsa/code/REMOTE_NOTIFICATION")).build();

    /**
     * This policy restricts the usage of data assets limited to numeric count of executions of actions.
     * A mechanism is needed that counts the usage of data in order to enforce the policy.
     */
    UsagePolicyClass RESTRICTED_NUMBER_OF_USAGES =
        new UsagePolicyClassBuilder(URI.create("https://w3id.org/idsa/code/RESTRICTED_NUMBER_OF_USAGES")).build();

    /**
     * This policy restricts the usage of the data to a specific role. For example, you can instantiate
     * a policy of this class that allows only the members of the engineering department to use your
     * data. This policy class faces few limitations, i.e., in order to evaluate the conditions, it
     * requires that the user roles are available and follow a common vocabulary
     */
    UsagePolicyClass ROLE_RESTRICTED_DATA_USAGE =
        new UsagePolicyClassBuilder(URI.create("https://w3id.org/idsa/code/ROLE_RESTRICTED_DATA_USAGE")).build();

    /**
     * This policy restricts the usage of data assets limited to a security level the consumer must
     * conform to.
     */
    UsagePolicyClass SECURITY_LEVEL_RESTRICTED_POLICY =
        new UsagePolicyClassBuilder(URI.create("https://w3id.org/idsa/code/SECURITY_LEVEL_RESTRICTED_POLICY")).build();

    /**
     * This policy restricts the usage of data assets limited to specific states. Possible states
     * include, for example, that the contract for the given data asset has not yet expired.
     */
    UsagePolicyClass STATE_RESTRICTED_POLICY =
        new UsagePolicyClassBuilder(URI.create("https://w3id.org/idsa/code/STATE_RESTRICTED_POLICY")).build();

    /**
     * This policy restricts the usage of data assets with the obligation to delete the asset after
     * usage.
     */
    UsagePolicyClass USE_DATA_AND_DELETE_AFTER =
        new UsagePolicyClassBuilder(URI.create("https://w3id.org/idsa/code/USE_DATA_AND_DELETE_AFTER")).build();

}
