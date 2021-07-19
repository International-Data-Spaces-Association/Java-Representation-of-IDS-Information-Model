package de.fraunhofer.iais.eis;


import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Process and result of certifying an interested party in order to become a certified member of the
 * International Data Space.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ParticipantCertificationImpl.class)
})
public interface ParticipantCertification extends Certification {

    // standard methods

    @Beta
    public ParticipantCertification deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * End of the participant's IDS membership.
     *
     * More information under https://w3id.org/idsa/core/membershipEnd
     *
     * @return Returns the XMLGregorianCalendar for the property _membershipEnd.
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    @JsonProperty("ids:membershipEnd")
    XMLGregorianCalendar getMembershipEnd();

    /**
     * End of the participant's IDS membership.
     *
     * More information under https://w3id.org/idsa/core/membershipEnd
     *
     * @param _membershipEnd_ desired value for the property _membershipEnd.
     */
    void setMembershipEnd(XMLGregorianCalendar _membershipEnd_);

}
