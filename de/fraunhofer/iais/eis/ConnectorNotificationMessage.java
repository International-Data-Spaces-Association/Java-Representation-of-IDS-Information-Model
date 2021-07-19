package de.fraunhofer.iais.eis;

import java.net.URI;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Superclass of all messages, indicating a change of a connector's conditions.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ConnectorUpdateMessage.class),
    @JsonSubTypes.Type(value = ConnectorUnavailableMessage.class),
    @JsonSubTypes.Type(value = ConnectorCertificateGrantedMessage.class),
    @JsonSubTypes.Type(value = ConnectorCertificateRevokedMessage.class)
})
public interface ConnectorNotificationMessage extends NotificationMessage {

    // standard methods

    @Beta
    public ConnectorNotificationMessage deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * References the connector that is affected by the runtime condition change.
     *
     * More information under https://w3id.org/idsa/core/affectedConnector
     *
     * @return Returns the URI for the property _affectedConnector.
     */
    @NotNull
    @JsonProperty("ids:affectedConnector")
    URI getAffectedConnector();

    /**
     * References the connector that is affected by the runtime condition change.
     *
     * More information under https://w3id.org/idsa/core/affectedConnector
     *
     * @param _affectedConnector_ desired value for the property _affectedConnector.
     */
    void setAffectedConnector(URI _affectedConnector_);

}
