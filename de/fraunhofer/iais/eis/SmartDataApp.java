package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Smart DataApps are executing any kind of necessary data processing or transformation.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = SmartDataAppImpl.class)
})
public interface SmartDataApp extends DataApp {

    // standard methods

    @Beta
    public SmartDataApp deepCopy();

    // Default instances of this class as defined in the ontology

}
