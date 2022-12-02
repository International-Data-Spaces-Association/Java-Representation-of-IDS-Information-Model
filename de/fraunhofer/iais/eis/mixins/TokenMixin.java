package de.fraunhofer.iais.eis.mixins;


import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Token")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = DynamicAttributeToken.class)
})
public interface TokenMixin {
    @JsonProperty("ids:tokenValue")
    @NotNull
    public String getTokenValue();

    @JsonProperty("ids:tokenValue")
    public void setTokenValue(String _tokenValue_);

    @JsonProperty("ids:tokenFormat")
    @NotNull
    public TokenFormat getTokenFormat();

    @JsonProperty("ids:tokenFormat")
    public void setTokenFormat(TokenFormat _tokenFormat_);
}
