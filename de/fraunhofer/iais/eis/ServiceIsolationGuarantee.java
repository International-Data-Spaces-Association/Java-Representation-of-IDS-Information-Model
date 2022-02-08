package de.fraunhofer.iais.eis;

import java.net.URI;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Service isolation mechanism supported by the Connector. Examples are process group (Docker) or by
 * least privilege with clear separation and support for additional security modules as done by
 * trustme.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ServiceIsolationGuaranteeImpl.class)
})
public interface ServiceIsolationGuarantee extends SecurityGuarantee {

    // standard methods

    @Beta
    public ServiceIsolationGuarantee deepCopy();

    // Default instances of this class as defined in the ontology

    /** 
    */
    ServiceIsolationGuarantee SERVICE_ISOLATION_LEAST_PRIVILEGE =
        new ServiceIsolationGuaranteeBuilder(URI.create("https://w3id.org/idsa/code/SERVICE_ISOLATION_LEAST_PRIVILEGE")).build();

    /** 
    */
    ServiceIsolationGuarantee SERVICE_ISOLATION_NONE =
        new ServiceIsolationGuaranteeBuilder(URI.create("https://w3id.org/idsa/code/SERVICE_ISOLATION_NONE")).build();

    /** 
    */
    ServiceIsolationGuarantee SERVICE_ISOLATION_PROCESS_GROUP =
        new ServiceIsolationGuaranteeBuilder(URI.create("https://w3id.org/idsa/code/SERVICE_ISOLATION_PROCESS_GROUP")).build();

}
