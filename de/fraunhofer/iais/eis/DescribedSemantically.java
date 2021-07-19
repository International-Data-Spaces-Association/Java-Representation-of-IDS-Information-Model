package de.fraunhofer.iais.eis;

import java.net.URI;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Entity described semantically.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = Resource.class),
    @JsonSubTypes.Type(value = Representation.class)
})
public interface DescribedSemantically extends ModelClass {

    // standard methods

    @Beta
    public DescribedSemantically deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Reference to SHACL shape graph, which describes domain-specific knowledge.
     *
     * More information under https://w3id.org/idsa/core/shapesGraph
     *
     * @return Returns the URI for the property _shapesGraph.
     */
    @JsonProperty("ids:shapesGraph")
    URI getShapesGraph();

    /**
     * Reference to SHACL shape graph, which describes domain-specific knowledge.
     *
     * More information under https://w3id.org/idsa/core/shapesGraph
     *
     * @param _shapesGraph_ desired value for the property _shapesGraph.
     */
    void setShapesGraph(URI _shapesGraph_);

}
