package de.fraunhofer.iais.eis.mixins;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("QueryMessage")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface QueryMessageMixin {
    @JsonProperty("ids:queryLanguage")
    public QueryLanguage getQueryLanguage();

    @JsonProperty("ids:queryLanguage")
    public void setQueryLanguage(QueryLanguage _queryLanguage_);

    @JsonProperty("ids:queryScope")
    public QueryScope getQueryScope();

    @JsonProperty("ids:queryScope")
    public void setQueryScope(QueryScope _queryScope_);

    @JsonProperty("ids:recipientScope")
    public QueryTarget getRecipientScope();

    @JsonProperty("ids:recipientScope")
    public void setRecipientScope(QueryTarget _recipientScope_);
}
