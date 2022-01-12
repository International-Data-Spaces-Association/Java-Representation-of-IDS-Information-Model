package de.fraunhofer.iais.eis;

import java.net.URI;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Defined usage control component (i.e. PIP, PXP, etc.) in the IDS.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = UsageControlComponentImpl.class),
    @JsonSubTypes.Type(value = PXP.class),
    @JsonSubTypes.Type(value = PIP.class)
})
public interface UsageControlComponent extends ModelClass {

    // standard methods

    @Beta
    public UsageControlComponent deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * The reference to a URI that provides the interface description of a usage control endpoint.
     *
     * More information under https://w3id.org/idsa/core/interfaceDescription
     *
     * @return Returns the URI for the property _interfaceDescription.
     */
    @NotNull
    URI getInterfaceDescription();

    /**
     * The reference to a URI that provides the interface description of a usage control endpoint.
     *
     * More information under https://w3id.org/idsa/core/interfaceDescription
     *
     * @param _interfaceDescription_ desired value for the property _interfaceDescription.
     */
    void setInterfaceDescription(URI _interfaceDescription_);

    /**
     * The reference to a URI that expresses an exact endpoint of that usage control endpoint.
     *
     * More information under https://w3id.org/idsa/core/endpointURI
     *
     * @return Returns the URI for the property _endpointURI.
     */
    URI getEndpointURI();

    /**
     * The reference to a URI that expresses an exact endpoint of that usage control endpoint.
     *
     * More information under https://w3id.org/idsa/core/endpointURI
     *
     * @param _endpointURI_ desired value for the property _endpointURI.
     */
    void setEndpointURI(URI _endpointURI_);

}
