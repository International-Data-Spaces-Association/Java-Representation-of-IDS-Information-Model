package de.fraunhofer.iais.eis.mixins;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Catalog")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ConnectorCatalog.class),
    @JsonSubTypes.Type(value = ResourceCatalog.class),
    @JsonSubTypes.Type(value = ParticipantCatalog.class),
    @JsonSubTypes.Type(value = AppResourceCatalog.class),
    @JsonSubTypes.Type(value = ClearingHouseCatalog.class)
})
public interface CatalogMixin {

}
