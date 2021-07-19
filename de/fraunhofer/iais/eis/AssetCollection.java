package de.fraunhofer.iais.eis;

import java.net.URI;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * An AssetCollection is a bracket object combining several ids:Assets.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = AssetCollectionImpl.class)
})
public interface AssetCollection extends Asset {

    // standard methods

    @Beta
    public AssetCollection deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * A remote link to the location (PIP) where this AssetCollection and its members are maintained.
     *
     * More information under https://w3id.org/idsa/core/assetSource
     *
     * @return Returns the URI for the property _assetSource.
     */
    @JsonProperty("ids:assetSource")
    URI getAssetSource();

    /**
     * A remote link to the location (PIP) where this AssetCollection and its members are maintained.
     *
     * More information under https://w3id.org/idsa/core/assetSource
     *
     * @param _assetSource_ desired value for the property _assetSource.
     */
    void setAssetSource(URI _assetSource_);

    /**
     * AssetRefinement define constraints that refine a (composite) Digital Content in an ids:Rule
     * respectively the ids:AssetCollection.
     *
     * More information under https://w3id.org/idsa/core/assetRefinement
     *
     * @return Returns the AbstractConstraint for the property _assetRefinement.
     */
    @JsonProperty("ids:assetRefinement")
    AbstractConstraint getAssetRefinement();

    /**
     * AssetRefinement define constraints that refine a (composite) Digital Content in an ids:Rule
     * respectively the ids:AssetCollection.
     *
     * More information under https://w3id.org/idsa/core/assetRefinement
     *
     * @param _assetRefinement_ desired value for the property _assetRefinement.
     */
    void setAssetRefinement(AbstractConstraint _assetRefinement_);

}
