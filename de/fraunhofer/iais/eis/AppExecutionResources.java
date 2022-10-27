package de.fraunhofer.iais.eis;

import java.net.URI;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import de.fraunhofer.iais.eis.util.*;

/**
 * Resource control for deployed services.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = AppExecutionResourcesImpl.class)
})
public interface AppExecutionResources extends SecurityGuarantee {

    // standard methods

    @Beta
    public AppExecutionResources deepCopy();

    // Default instances of this class as defined in the ontology

    /** 
    */
    AppExecutionResources APP_RESOURCES_LOCAL_ENFORCEMENT =
        new AppExecutionResourcesBuilder(URI.create("https://w3id.org/idsa/code/APP_RESOURCES_LOCAL_ENFORCEMENT")).build();

    /** 
    */
    AppExecutionResources APP_RESOURCES_NONE =
        new AppExecutionResourcesBuilder(URI.create("https://w3id.org/idsa/code/APP_RESOURCES_NONE")).build();

    /** 
    */
    AppExecutionResources APP_RESOURCES_REMOTE_VERIFICATION =
        new AppExecutionResourcesBuilder(URI.create("https://w3id.org/idsa/code/APP_RESOURCES_REMOTE_VERIFICATION")).build();

}
