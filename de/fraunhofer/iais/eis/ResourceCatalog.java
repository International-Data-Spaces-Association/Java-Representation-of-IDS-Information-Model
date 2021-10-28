package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonGetter;
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
    @JsonIgnore
    List<Resource> getOfferedResource();

    /**
     * A Resource that is part of a resource catalog, indicating an offering (of, e.g., data).
     *
     * More information under https://w3id.org/idsa/core/offeredResource
     *
     * @param _offeredResource_ desired value for the property _offeredResource.
     */
    void setOfferedResource(List<Resource> _offeredResource_);

    /**
     * A Resource that is part of a resource catalog, indicating an offering (of, e.g., data).
     *
     * More information under https://w3id.org/idsa/core/offeredResource
     *
     * @return Returns the List of URIs for the property _offeredResourceAsUri.
     */
    @JsonIgnore
    List<URI> getOfferedResourceAsUri();

    /**
     * A Resource that is part of a resource catalog, indicating an offering (of, e.g., data).
     *
     * More information under https://w3id.org/idsa/core/offeredResource
     *
     * @param _offeredResource_ desired value for the property _offeredResourceAsUri.
     */
    void setOfferedResourceAsUri(List<URI> _offeredResource_);

    /**
     * Helper function for (de-)serialization of the _resourceCatalog and the _resourceCatalogAsfields.
     *
     * @return Returns the a UriOrModelClass object with the content of the field or null if the field
     *         is not set.
     */
    @JsonGetter("ids:offeredResource")
    UriOrModelClass getOfferedResourceAsObject();

    /**
     * A Resource that is part of a resource catalog, indicating a request (of, e.g., data, software,
     * …).
     *
     * More information under https://w3id.org/idsa/core/requestedResource
     *
     * @return Returns the List of Resources for the property _requestedResource.
     */
    @JsonIgnore
    List<Resource> getRequestedResource();

    /**
     * A Resource that is part of a resource catalog, indicating a request (of, e.g., data, software,
     * …).
     *
     * More information under https://w3id.org/idsa/core/requestedResource
     *
     * @param _requestedResource_ desired value for the property _requestedResource.
     */
    void setRequestedResource(List<Resource> _requestedResource_);

    /**
     * A Resource that is part of a resource catalog, indicating a request (of, e.g., data, software,
     * …).
     *
     * More information under https://w3id.org/idsa/core/requestedResource
     *
     * @return Returns the List of URIs for the property _requestedResourceAsUri.
     */
    @JsonIgnore
    List<URI> getRequestedResourceAsUri();

    /**
     * A Resource that is part of a resource catalog, indicating a request (of, e.g., data, software,
     * …).
     *
     * More information under https://w3id.org/idsa/core/requestedResource
     *
     * @param _requestedResource_ desired value for the property _requestedResourceAsUri.
     */
    void setRequestedResourceAsUri(List<URI> _requestedResource_);

    /**
     * Helper function for (de-)serialization of the _resourceCatalog and the _resourceCatalogAsfields.
     *
     * @return Returns the a UriOrModelClass object with the content of the field or null if the field
     *         is not set.
     */
    @JsonGetter("ids:requestedResource")
    UriOrModelClass getRequestedResourceAsObject();

}
