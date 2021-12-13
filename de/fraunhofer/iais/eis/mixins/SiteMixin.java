package de.fraunhofer.iais.eis.mixins;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Site")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface SiteMixin {
    @JsonProperty("ids:siteAddress")
    public String getSiteAddress();

    @JsonProperty("ids:siteAddress")
    public void setSiteAddress(String _siteAddress_);
}
