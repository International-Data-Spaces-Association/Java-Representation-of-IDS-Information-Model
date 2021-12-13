package de.fraunhofer.iais.eis.mixins;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("DatPayload")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface DatPayloadMixin {
    @JsonProperty("ids:extendedGuarantee")
    public List<SecurityGuarantee> getExtendedGuarantee();

    @JsonProperty("ids:extendedGuarantee")
    public void setExtendedGuarantee(List<SecurityGuarantee> _extendedGuarantee_);
}
