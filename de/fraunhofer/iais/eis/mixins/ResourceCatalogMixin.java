package de.fraunhofer.iais.eis.mixins;

import java.net.URI;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("ResourceCatalog")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface ResourceCatalogMixin {
    @JsonIgnore
    public List<Resource> getOfferedResourceAsObject();

    @JsonIgnore
    public List<URI> getOfferedResourceAsUri();

    @JsonIgnore(false)
    @JsonGetter("ids:offeredResource")
    public UriOrModelClass getOfferedResource();

    @JsonIgnore
    public void setOfferedResourceAsObject(List<Resource> _offeredResource_);

    @JsonIgnore
    public void setOfferedResourceAsUri(List<URI> _offeredResource_);

    @JsonIgnore
    public List<Resource> getRequestedResourceAsObject();

    @JsonIgnore
    public List<URI> getRequestedResourceAsUri();

    @JsonIgnore(false)
    @JsonGetter("ids:requestedResource")
    public UriOrModelClass getRequestedResource();

    @JsonIgnore
    public void setRequestedResourceAsObject(List<Resource> _requestedResource_);

    @JsonIgnore
    public void setRequestedResourceAsUri(List<URI> _requestedResource_);
}
