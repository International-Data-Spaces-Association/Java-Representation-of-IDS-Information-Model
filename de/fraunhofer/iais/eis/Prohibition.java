package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The class of Prohibitions as defined in the ODRL ontology.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ProhibitionImpl.class)
})
public interface Prohibition extends Rule {

    // standard methods

    @Beta
    public Prohibition deepCopy();

}
