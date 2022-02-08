package de.fraunhofer.iais.eis.mixins;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("ResourceCatalog")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface ResourceCatalogMixin {
    @JsonProperty("ids:offeredResource")
    public List<Resource> getOfferedResource();

    @JsonProperty("ids:offeredResource")
    public void setOfferedResource(List<Resource> _offeredResource_);

    @JsonProperty("ids:requestedResource")
    public List<Resource> getRequestedResource();

    @JsonProperty("ids:requestedResource")
    public void setRequestedResource(List<Resource> _requestedResource_);
}
