package de.fraunhofer.iais.eis;



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

}
