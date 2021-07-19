package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The Dynamic Attribute Provisioning Service (DAPS) is a component of the Identity Provider and
 * manages and issues the Dynamic Attribute Tokens (DAT), acting as digtial proofs for dynamic
 * attributes of both connectors and participants.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = DAPSImpl.class)
})
public interface DAPS extends InfrastructureComponent {

    // standard methods

    @Beta
    public DAPS deepCopy();

}
