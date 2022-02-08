package de.fraunhofer.iais.eis.mixins;

import java.net.URI;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("ParticipantCatalog")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface ParticipantCatalogMixin {
    @JsonIgnore
    public List<Participant> getMemberAsObject();

    @JsonIgnore
    public List<URI> getMemberAsUri();

    @JsonIgnore(false)
    @JsonGetter("ids:member")
    public UriOrModelClass getMember();

    @JsonIgnore
    public void setMemberAsObject(List<Participant> _member_);

    @JsonIgnore
    public void setMemberAsUri(List<URI> _member_);
}
