package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Whenever a Connector has been successfully certified by the Certification Body, the Identity
 * Provider can use this message to notify Infrastructure Components.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ConnectorCertificateGrantedMessageImpl.class)
})
public interface ConnectorCertificateGrantedMessage extends ConnectorNotificationMessage {

    // standard methods

    @Beta
    public ConnectorCertificateGrantedMessage deepCopy();

}
