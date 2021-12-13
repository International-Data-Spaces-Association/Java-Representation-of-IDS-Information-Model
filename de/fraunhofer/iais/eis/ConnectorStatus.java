package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Connector Status is used to represent a Connectors current state inside the Configuration Model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ConnectorStatusImpl.class)
})
public interface ConnectorStatus extends ModelClass {

    // standard methods

    @Beta
    public ConnectorStatus deepCopy();

}
