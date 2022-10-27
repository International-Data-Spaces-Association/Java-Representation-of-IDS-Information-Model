package de.fraunhofer.iais.eis.mixins;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("ConnectorCatalog")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = BrokerCatalog.class),
    @JsonSubTypes.Type(value = AppStoreCatalog.class)
})
public interface ConnectorCatalogMixin {
    @JsonProperty("ids:listedConnector")
    public List<Connector> getListedConnector();

    @JsonProperty("ids:listedConnector")
    public void setListedConnector(List<Connector> _listedConnector_);
}
