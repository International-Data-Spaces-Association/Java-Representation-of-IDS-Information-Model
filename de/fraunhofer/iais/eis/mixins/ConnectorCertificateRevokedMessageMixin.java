package de.fraunhofer.iais.eis.mixins;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("ConnectorCertificateRevokedMessage")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface ConnectorCertificateRevokedMessageMixin {
    @JsonProperty("ids:revocationReason")
    public TypedLiteral getRevocationReason();

    @JsonProperty("ids:revocationReason")
    public void setRevocationReason(TypedLiteral _revocationReason_);
}
