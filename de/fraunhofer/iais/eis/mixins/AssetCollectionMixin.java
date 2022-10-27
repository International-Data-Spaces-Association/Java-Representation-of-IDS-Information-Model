package de.fraunhofer.iais.eis.mixins;

import java.net.URI;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("AssetCollection")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface AssetCollectionMixin {
    @JsonProperty("ids:assetSource")
    public URI getAssetSource();

    @JsonProperty("ids:assetSource")
    public void setAssetSource(URI _assetSource_);

    @JsonProperty("ids:assetRefinement")
    public AbstractConstraint getAssetRefinement();

    @JsonProperty("ids:assetRefinement")
    public void setAssetRefinement(AbstractConstraint _assetRefinement_);
}
