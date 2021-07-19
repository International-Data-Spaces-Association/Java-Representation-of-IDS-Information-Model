package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The Participant Information Service (ParIS) provides metadata and relevant information about
 * participants (humans and organizations) in the International Data Spaces.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ParISImpl.class)
})
public interface ParIS extends Connector {

    // standard methods

    @Beta
    public ParIS deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * List of participants a ParIS may expose.
     *
     * More information under https://w3id.org/idsa/core/participantCatalog
     *
     * @return Returns the List of ParticipantCatalogs for the property _participantCatalog.
     */
    @JsonProperty("ids:participantCatalog")
    List<ParticipantCatalog> getParticipantCatalog();

    /**
     * List of participants a ParIS may expose.
     *
     * More information under https://w3id.org/idsa/core/participantCatalog
     *
     * @param _participantCatalog_ desired value for the property _participantCatalog.
     */
    void setParticipantCatalog(List<ParticipantCatalog> _participantCatalog_);

}
