package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.JsonNode;

import de.fraunhofer.iais.eis.util.*;

/**
 * Level of a Participant Certification
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:ParticipantCertificationLevel")
public enum DefaultParticipantCertificationLevel implements ParticipantCertificationLevel {

    /** 
    */
    PARTICIPANT_CENTRAL_LEVEL_CONTROL_FRAMEWORK("https://w3id.org/idsa/code/PARTICIPANT_CENTRAL_LEVEL_CONTROL_FRAMEWORK"),

    /** 
    */
    PARTICIPANT_CENTRAL_LEVEL_MANAGEMENT_SYSTEM("https://w3id.org/idsa/code/PARTICIPANT_CENTRAL_LEVEL_MANAGEMENT_SYSTEM"),

    /** 
    */
    PARTICIPANT_ENTRY_LEVEL_MANAGEMENT_SYSTEM("https://w3id.org/idsa/code/PARTICIPANT_ENTRY_LEVEL_MANAGEMENT_SYSTEM"),

    /** 
    */
    PARTICIPANT_ENTRY_LEVEL_SELF_ASSESSMENT("https://w3id.org/idsa/code/PARTICIPANT_ENTRY_LEVEL_SELF_ASSESSMENT"),

    /** 
    */
    PARTICIPANT_MEMBER_LEVEL_CONTROL_FRAMEWORK("https://w3id.org/idsa/code/PARTICIPANT_MEMBER_LEVEL_CONTROL_FRAMEWORK"),

    /** 
    */
    PARTICIPANT_MEMBER_LEVEL_MANAGEMENT_SYSTEM("https://w3id.org/idsa/code/PARTICIPANT_MEMBER_LEVEL_MANAGEMENT_SYSTEM"),;

    private static final Map<String, DefaultParticipantCertificationLevel> uriInstanceMapping;
    static {
        uriInstanceMapping = new HashMap<>();
        uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
        uriInstanceMapping
            .putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
    }

    private ParticipantCertificationLevel participantCertificationLevel;

    DefaultParticipantCertificationLevel(String id) {
        this.participantCertificationLevel = new ParticipantCertificationLevelBuilder(URI.create(id)).build();
    }

    // TODO dummy method for generic properties, should be deleted in future versions
    public Map<String, Object> getProperties() {
        return null;
    }

    public void setProperty(String property, Object value) {
        // do nothing
    }

    /**
     * This function retrieves the ID of the current object (can be set via the constructor of the
     * builder class)
     * 
     * @return ID of current object as URI
     */

    @JsonIgnore
    @Override
    final public URI getId() {
        return this.participantCertificationLevel.getId();
    }

    /**
     * This function retrieves a human readable label about the current class, as defined in the
     * ontology. This label could, for example, be used as a field heading in a user interface
     * 
     * @return Human readable label
     */
    @JsonIgnore
    @Override
    final public List<TypedLiteral> getLabel() {
        return this.participantCertificationLevel.getLabel();
    }

    /**
     * This function retrieves a human readable explanatory comment about the current class, as defined
     * in the ontology. This comment could, for example, be used as a tooltip in a user interface
     * 
     * @return Human readable explanatory comment
     */
    @JsonIgnore
    @Override
    final public List<TypedLiteral> getComment() {
        return this.participantCertificationLevel.getComment();
    }

    public String toRdf() {
        return VocabUtil.getInstance().toRdf(this);
    }

    @JsonProperty("@id")
    final public URI getSerializedId() {
        return this.participantCertificationLevel.getId();
    }

    @JsonCreator
    public static DefaultParticipantCertificationLevel deserialize(JsonNode node) {
        return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
    }

    @Override
    public String toString() {
        return this.participantCertificationLevel.getId().toString();
    }

    @Override
    public ParticipantCertificationLevel deepCopy() {
        // not implemented for enums
        throw new UnsupportedOperationException();
    }

    @JsonIgnore

    @JsonProperty("ids:includedCertificationLevel")
    final public CertificationLevel getIncludedCertificationLevel() {
        // not implemented for enums
        throw new UnsupportedOperationException();
    }

    @JsonIgnore

    @Override
    public void setIncludedCertificationLevel(CertificationLevel _includedCertificationLevel_) {
        // not implemented for enums
        throw new UnsupportedOperationException();
    }

}
