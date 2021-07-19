package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The class of mutable individuals.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = Resource.class),
    @JsonSubTypes.Type(value = Participant.class),
    @JsonSubTypes.Type(value = Certification.class),
    @JsonSubTypes.Type(value = InfrastructureComponent.class)
})
public interface ManagedEntity extends Described {

    // standard methods

    @Beta
    public ManagedEntity deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Version identifier of the Managed Entity
     *
     * More information under https://w3id.org/idsa/core/version
     *
     * @return Returns the String for the property _version.
     */
    @JsonProperty("ids:version")
    String getVersion();

    /**
     * Version identifier of the Managed Entity
     *
     * More information under https://w3id.org/idsa/core/version
     *
     * @param _version_ desired value for the property _version.
     */
    void setVersion(String _version_);

}
