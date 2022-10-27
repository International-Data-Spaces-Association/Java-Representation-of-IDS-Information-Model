package de.fraunhofer.iais.eis.mixins;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("PublicKey")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface PublicKeyMixin {
    @JsonProperty("ids:keyType")
    public KeyType getKeyType();

    @JsonProperty("ids:keyType")
    public void setKeyType(KeyType _keyType_);

    @JsonProperty("ids:keyValue")
    public byte[] getKeyValue();

    @JsonProperty("ids:keyValue")
    public void setKeyValue(byte[] _keyValue_);
}
