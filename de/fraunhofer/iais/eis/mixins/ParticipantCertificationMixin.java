package de.fraunhofer.iais.eis.mixins;


import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("ParticipantCertification")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface ParticipantCertificationMixin {
    @JsonProperty("ids:membershipEnd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    public XMLGregorianCalendar getMembershipEnd();

    @JsonProperty("ids:membershipEnd")
    public void setMembershipEnd(XMLGregorianCalendar _membershipEnd_);
}
