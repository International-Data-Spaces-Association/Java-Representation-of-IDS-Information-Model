package de.fraunhofer.iais.eis;

import java.net.URI;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import de.fraunhofer.iais.eis.util.*;

/**
 * Class of endpoint types a data app offers.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = AppEndpointTypeImpl.class)
})
public interface AppEndpointType extends ModelClass {

    // standard methods

    @Beta
    public AppEndpointType deepCopy();

    // Default instances of this class as defined in the ontology

    /**
     * Endpoint is used for runtime-related app configurations and app parameters.
     */
    AppEndpointType CONFIG_ENDPOINT = new AppEndpointTypeBuilder(URI.create("https://w3id.org/idsa/code/CONFIG_ENDPOINT")).build();

    /**
     * Endpoint is used for data input.
     */
    AppEndpointType INPUT_ENDPOINT = new AppEndpointTypeBuilder(URI.create("https://w3id.org/idsa/code/INPUT_ENDPOINT")).build();

    /**
     * Endpoint is used for data output.
     */
    AppEndpointType OUTPUT_ENDPOINT = new AppEndpointTypeBuilder(URI.create("https://w3id.org/idsa/code/OUTPUT_ENDPOINT")).build();

    /**
     * Endpoint is used to start (or control) app processing.
     */
    AppEndpointType PROCESS_ENDPOINT = new AppEndpointTypeBuilder(URI.create("https://w3id.org/idsa/code/PROCESS_ENDPOINT")).build();

    /**
     * Pre-defined endpoint used to return the corresponding self-description of the data app.
     */
    AppEndpointType SELF_DESCRIPTION_ENDPOINT =
        new AppEndpointTypeBuilder(URI.create("https://w3id.org/idsa/code/SELF_DESCRIPTION_ENDPOINT")).build();

    /**
     * Endpoint is used to get app health / lifecycle status.
     */
    AppEndpointType STATUS_ENDPOINT = new AppEndpointTypeBuilder(URI.create("https://w3id.org/idsa/code/STATUS_ENDPOINT")).build();

    /**
     * Endpoint is used for usage policy / usage control related scenarios.
     */
    AppEndpointType USAGE_POLICY_ENDPOINT =
        new AppEndpointTypeBuilder(URI.create("https://w3id.org/idsa/code/USAGE_POLICY_ENDPOINT")).build();

}
