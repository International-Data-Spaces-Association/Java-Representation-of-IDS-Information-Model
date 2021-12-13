package de.fraunhofer.iais.eis.mixins;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("AppResourceCatalog")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface AppResourceCatalogMixin {
    @JsonProperty("ids:listedAppResource")
    public List<AppResource> getListedAppResource();

    @JsonProperty("ids:listedAppResource")
    public void setListedAppResource(List<AppResource> _listedAppResource_);
}
