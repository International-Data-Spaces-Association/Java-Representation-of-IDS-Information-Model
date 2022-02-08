package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Class that aggregates Resources from a (distributable) Catalog.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ResourceCatalogImpl.class)
})
public interface ResourceCatalog extends Catalog {

    // standard methods

    @Beta
    public ResourceCatalog deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * A Resource that is part of a resource catalog, indicating an offering (of, e.g., data).
     *
     * More information under https://w3id.org/idsa/core/offeredResource
     *
     * @return Returns the List of Resources for the property _offeredResource.
     */
    @JsonAlias({"https://w3id.org/idsa/core/offeredResourceAsObject", "ids:offeredResourceAsObject", "offeredResourceAsObject"})
    List<Resource> getOfferedResourceAsObject();

    /**
     * A Resource that is part of a resource catalog, indicating an offering (of, e.g., data).
     *
     * More information under https://w3id.org/idsa/core/offeredResource
     *
     * @param _offeredResource_ desired value for the property _offeredResource.
     */
    void setOfferedResourceAsObject(List<Resource> _offeredResource_);

    /**
     * A Resource that is part of a resource catalog, indicating an offering (of, e.g., data).
     *
     * More information under https://w3id.org/idsa/core/offeredResource
     *
     * @return Returns the List of URIs for the property .
     */
    @JsonAlias({"https://w3id.org/idsa/core/offeredResourceAsUri", "ids:offeredResourceAsUri", "offeredResourceAsUri"})
    List<URI> getOfferedResourceAsUri();

    /**
     * A Resource that is part of a resource catalog, indicating an offering (of, e.g., data).
     *
     * More information under https://w3id.org/idsa/core/offeredResource
     *
     * @param _offeredResource_ desired value for the property .
     */
    void setOfferedResourceAsUri(List<URI> _offeredResource_);

    /**
     * Helper function for (de-)serialization of the ResourceCatalog and the _offeredResource fields.
     *
     * @return Returns the a UriOrModelClass object with the content of the field or null if the field
     *         is not set.
     */
    @JsonIgnore
    UriOrModelClass getOfferedResource();

    /**
     * A Resource that is part of a resource catalog, indicating a request (of, e.g., data, software,
     * …).
     *
     * More information under https://w3id.org/idsa/core/requestedResource
     *
     * @return Returns the List of Resources for the property _requestedResource.
     */
    @JsonAlias({"https://w3id.org/idsa/core/requestedResourceAsObject", "ids:requestedResourceAsObject", "requestedResourceAsObject"})
    List<Resource> getRequestedResourceAsObject();

    /**
     * A Resource that is part of a resource catalog, indicating a request (of, e.g., data, software,
     * …).
     *
     * More information under https://w3id.org/idsa/core/requestedResource
     *
     * @param _requestedResource_ desired value for the property _requestedResource.
     */
    void setRequestedResourceAsObject(List<Resource> _requestedResource_);

    /**
     * A Resource that is part of a resource catalog, indicating a request (of, e.g., data, software,
     * …).
     *
     * More information under https://w3id.org/idsa/core/requestedResource
     *
     * @return Returns the List of URIs for the property .
     */
    @JsonAlias({"https://w3id.org/idsa/core/requestedResourceAsUri", "ids:requestedResourceAsUri", "requestedResourceAsUri"})
    List<URI> getRequestedResourceAsUri();

    /**
     * A Resource that is part of a resource catalog, indicating a request (of, e.g., data, software,
     * …).
     *
     * More information under https://w3id.org/idsa/core/requestedResource
     *
     * @param _requestedResource_ desired value for the property .
     */
    void setRequestedResourceAsUri(List<URI> _requestedResource_);

    /**
     * Helper function for (de-)serialization of the ResourceCatalog and the _requestedResource fields.
     *
     * @return Returns the a UriOrModelClass object with the content of the field or null if the field
     *         is not set.
     */
    @JsonIgnore
    UriOrModelClass getRequestedResource();

    // Default instances of this class as defined in the ontology

}
