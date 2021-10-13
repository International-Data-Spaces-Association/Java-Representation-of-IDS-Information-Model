package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
     * @return Returns the List of URIs for the property _member.
     */
    @JsonIgnore
    List<URI> getMember();

    /**
     * A Participant that is part of a participant catalog.
     *
     * More information under https://w3id.org/idsa/core/member
     *
     * @param _member_ desired value for the property _member.
     */
    void setMember(List<URI> _member_);

    /**
     * A Participant that is part of a participant catalog.
     *
     * More information under https://w3id.org/idsa/core/member
     *
     * @return Returns the List of Participants for the property _memberAsParticipant.
     */
    @JsonIgnore
    List<Participant> getMemberAsParticipant();

    /**
     * A Participant that is part of a participant catalog.
     *
     * More information under https://w3id.org/idsa/core/member
     *
     * @param _member_ desired value for the property _memberAsParticipant.
     */
    void setMemberAsParticipant(List<Participant> _member_);

    /**
     * Helper function for (de-)serialization of the _participantCatalog and the
     * _participantCatalogAsParticipantfields.
     *
     * @return Returns the a UriOrModelClass object with the content of the field or null if the field
     *         is not set.
     */
    @JsonGetter("ids:member")
    UriOrModelClass getMemberAsObject();

}
