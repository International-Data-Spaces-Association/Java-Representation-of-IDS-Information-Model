package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Class that aggregates Participants from a (distributable) Catalog.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ParticipantCatalogImpl.class)
})
public interface ParticipantCatalog extends Catalog {

    // standard methods

    @Beta
    public ParticipantCatalog deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * A Participant that is part of a participant catalog.
     *
     * More information under https://w3id.org/idsa/core/member
     *
     * @return Returns the List of Participants for the property _member.
     */
    @JsonAlias({"https://w3id.org/idsa/core/member", "ids:member", "member"})
    List<Participant> getMember();

    /**
     * A Participant that is part of a participant catalog.
     *
     * More information under https://w3id.org/idsa/core/member
     *
     * @param _member_ desired value for the property _member.
     */
    void setMember(List<Participant> _member_);

    // Default instances of this class as defined in the ontology

}
