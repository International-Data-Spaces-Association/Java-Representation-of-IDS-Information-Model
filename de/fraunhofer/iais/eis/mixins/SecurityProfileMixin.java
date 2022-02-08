package de.fraunhofer.iais.eis.mixins;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("SecurityProfile")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface SecurityProfileMixin {
    @JsonProperty("ids:securityGuarantee")
    public List<SecurityGuarantee> getSecurityGuarantee();

    @JsonProperty("ids:securityGuarantee")
    public void setSecurityGuarantee(List<SecurityGuarantee> _securityGuarantee_);
}
