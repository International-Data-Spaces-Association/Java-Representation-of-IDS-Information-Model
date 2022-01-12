package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Class that represents (distributable) Catalogs.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ConnectorCatalog.class),
    @JsonSubTypes.Type(value = ResourceCatalog.class),
    @JsonSubTypes.Type(value = ParticipantCatalog.class),
    @JsonSubTypes.Type(value = AppResourceCatalog.class),
    @JsonSubTypes.Type(value = ClearingHouseCatalog.class)
})
public interface Catalog extends ModelClass {

    // standard methods

    @Beta
    public Catalog deepCopy();

}
