package de.fraunhofer.iais.eis.mixins;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("ParIS")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface ParISMixin {
    @JsonProperty("ids:participantCatalog")
    public List<ParticipantCatalog> getParticipantCatalog();

    @JsonProperty("ids:participantCatalog")
    public void setParticipantCatalog(List<ParticipantCatalog> _participantCatalog_);
}
