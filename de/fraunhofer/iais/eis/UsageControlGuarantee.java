package de.fraunhofer.iais.eis;

import java.net.URI;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import de.fraunhofer.iais.eis.util.*;

/**
 * Extent of supporting usage control.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = UsageControlGuaranteeImpl.class)
})
public interface UsageControlGuarantee extends SecurityGuarantee {

    // standard methods

    @Beta
    public UsageControlGuarantee deepCopy();

    // Default instances of this class as defined in the ontology

    /** 
    */
    UsageControlGuarantee USAGE_CONTROL_NONE =
        new UsageControlGuaranteeBuilder(URI.create("https://w3id.org/idsa/code/USAGE_CONTROL_NONE")).build();

    /** 
    */
    UsageControlGuarantee USAGE_CONTROL_POLICY_ENFORCEMENT =
        new UsageControlGuaranteeBuilder(URI.create("https://w3id.org/idsa/code/USAGE_CONTROL_POLICY_ENFORCEMENT")).build();

    /** 
    */
    UsageControlGuarantee USAGE_CONTROL_REMOTE_COMPLIANCE_VERIFICATION =
        new UsageControlGuaranteeBuilder(URI.create("https://w3id.org/idsa/code/USAGE_CONTROL_REMOTE_COMPLIANCE_VERIFICATION")).build();

}
