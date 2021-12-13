package de.fraunhofer.iais.eis.mixins;

import java.net.URI;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("ConnectorNotificationMessage")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ConnectorUpdateMessage.class),
    @JsonSubTypes.Type(value = ConnectorUnavailableMessage.class),
    @JsonSubTypes.Type(value = ConnectorCertificateGrantedMessage.class),
    @JsonSubTypes.Type(value = ConnectorCertificateRevokedMessage.class)
})
public interface ConnectorNotificationMessageMixin {
    @JsonProperty("ids:affectedConnector")
    @NotNull
    public URI getAffectedConnector();

    @JsonProperty("ids:affectedConnector")
    public void setAffectedConnector(URI _affectedConnector_);
}
