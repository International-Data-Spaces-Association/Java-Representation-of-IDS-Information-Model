package de.fraunhofer.iais.eis.mixins;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("ParticipantCatalog")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface ParticipantCatalogMixin {
    @JsonProperty("ids:member")
    public List<Participant> getMember();

    @JsonProperty("ids:member")
    public void setMember(List<Participant> _member_);
}
