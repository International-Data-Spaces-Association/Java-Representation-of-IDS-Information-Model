package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Class of endpoint types a data app offers.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = AppEndpointTypeImpl.class)
})
public interface AppEndpointType extends ModelClass {

    // standard methods

    @Beta
    public AppEndpointType deepCopy();

}
