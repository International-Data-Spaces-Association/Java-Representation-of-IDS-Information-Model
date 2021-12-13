package de.fraunhofer.iais.eis.mixins;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Broker")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface BrokerMixin {
    @JsonProperty("ids:connectorCatalog")
    public List<ConnectorCatalog> getConnectorCatalog();

    @JsonProperty("ids:connectorCatalog")
    public void setConnectorCatalog(List<ConnectorCatalog> _connectorCatalog_);
}
