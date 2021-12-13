package de.fraunhofer.iais.eis.mixins;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("ClearingHouseCatalog")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface ClearingHouseCatalogMixin {
    @JsonProperty("ids:listedClearingHouse")
    public List<ClearingHouse> getListedClearingHouse();

    @JsonProperty("ids:listedClearingHouse")
    public void setListedClearingHouse(List<ClearingHouse> _listedClearingHouse_);
}
