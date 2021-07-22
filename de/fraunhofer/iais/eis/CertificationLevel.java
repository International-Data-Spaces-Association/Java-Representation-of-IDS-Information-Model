package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
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
 * Level of Certification
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:CertificationLevel")
public enum CertificationLevel implements ModelClass {

    /** 
    */
    COMPONENT_BASE_SECURITY_PROFILE_CHECKLIST_APPROACH("https://w3id.org/idsa/code/COMPONENT_BASE_SECURITY_PROFILE_CHECKLIST_APPROACH",
        Arrays.asList(new TypedLiteral("Base Security Profile Certification of Components based on Checklist Approach", "en")),
        Collections.emptyList()),

    /** 
    */
    COMPONENT_BASE_SECURITY_PROFILE_CONCEPT_REVIEW("https://w3id.org/idsa/code/COMPONENT_BASE_SECURITY_PROFILE_CONCEPT_REVIEW",
        Arrays.asList(new TypedLiteral("Base Security Profile Certification of Components based on Concept Review", "en")),
        Collections.emptyList()),

    /** 
    */
    COMPONENT_TRUSTPLUS_SECURITY_PROFILE_CONCEPT_REVIEW("https://w3id.org/idsa/code/COMPONENT_TRUSTPLUS_SECURITY_PROFILE_CONCEPT_REVIEW",
        Arrays.asList(new TypedLiteral("Trust-Plus Security Profile Certification of Components based on Concept Review", "en")),
        Collections.emptyList()),

    /** 
    */
    COMPONENT_TRUSTPLUS_SECURITY_PROFILE_HIGH_ASSURANCE_EVALUATION(
        "https://w3id.org/idsa/code/COMPONENT_TRUSTPLUS_SECURITY_PROFILE_HIGH_ASSURANCE_EVALUATION",
        Arrays.asList(new TypedLiteral("Trust-Plus Security Profile Certification of Components based on High AssuranceEvaluation", "en")),
        Collections.emptyList()),

    /** 
    */
    COMPONENT_TRUST_SECURITY_PROFILE_CONCEPT_REVIEW("https://w3id.org/idsa/code/COMPONENT_TRUST_SECURITY_PROFILE_CONCEPT_REVIEW",
        Arrays.asList(new TypedLiteral("Trust Security Profile Certification of Components based on Concept Review", "en")),
        Collections.emptyList()),

    /** 
    */
    COMPONENT_TRUST_SECURITY_PROFILE_HIGH_ASSURANCE_EVALUATION(
        "https://w3id.org/idsa/code/COMPONENT_TRUST_SECURITY_PROFILE_HIGH_ASSURANCE_EVALUATION",
        Arrays.asList(new TypedLiteral("Trust Security Profile Certification of Components based on High Assurance Evaluation", "en")),
        Collections.emptyList()),

    /** 
    */
    PARTICIPANT_CENTRAL_LEVEL_CONTROL_FRAMEWORK("https://w3id.org/idsa/code/PARTICIPANT_CENTRAL_LEVEL_CONTROL_FRAMEWORK",
        Arrays.asList(new TypedLiteral("Central Level Control Framework Certification of Participants", "en")), Collections.emptyList()),

    /** 
    */
    PARTICIPANT_CENTRAL_LEVEL_MANAGEMENT_SYSTEM("https://w3id.org/idsa/code/PARTICIPANT_CENTRAL_LEVEL_MANAGEMENT_SYSTEM",
        Arrays.asList(new TypedLiteral("Central Level Management System Certification of Participants", "en")), Collections.emptyList()),

    /** 
    */
    PARTICIPANT_ENTRY_LEVEL_MANAGEMENT_SYSTEM("https://w3id.org/idsa/code/PARTICIPANT_ENTRY_LEVEL_MANAGEMENT_SYSTEM",
        Arrays.asList(new TypedLiteral("Entry Level Management System Certification of Participants", "en")), Collections.emptyList()),

    /** 
    */
    PARTICIPANT_ENTRY_LEVEL_SELF_ASSESSMENT("https://w3id.org/idsa/code/PARTICIPANT_ENTRY_LEVEL_SELF_ASSESSMENT",
        Arrays.asList(new TypedLiteral("Entry Level Self-Assessment Certification of Participants", "en")), Collections.emptyList()),

    /** 
    */
    PARTICIPANT_MEMBER_LEVEL_CONTROL_FRAMEWORK("https://w3id.org/idsa/code/PARTICIPANT_MEMBER_LEVEL_CONTROL_FRAMEWORK",
        Arrays.asList(new TypedLiteral("Member Level ControlFramework Certification of Participants", "en")), Collections.emptyList()),

    /** 
    */
    PARTICIPANT_MEMBER_LEVEL_MANAGEMENT_SYSTEM("https://w3id.org/idsa/code/PARTICIPANT_MEMBER_LEVEL_MANAGEMENT_SYSTEM",
        Arrays.asList(new TypedLiteral("Member Level Management System Certification of Participants", "en")), Collections.emptyList());

    private static final Map<String, CertificationLevel> uriInstanceMapping;
    static {
        uriInstanceMapping = new HashMap<>();
        uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
        uriInstanceMapping
            .putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
    }

    private URI id;
    private List<TypedLiteral> label;
    private List<TypedLiteral> comment;

    CertificationLevel(String id, List<TypedLiteral> label, List<TypedLiteral> comment) {
        try {
            this.id = new URI(id);
            this.label = label;
            this.comment = comment;
        } catch (java.net.URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
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
        return id;
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
        return label;
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
        return comment;
    }

    public String toRdf() {
        return VocabUtil.getInstance().toRdf(this);
    }

    @JsonProperty("@id")
    final public URI getSerializedId() {
        return id;
    }

    @JsonCreator
    public static CertificationLevel deserialize(JsonNode node) {
        return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
    }

    @Override
    public String toString() {
        return id.toString();
    }

    @JsonIgnore

    @JsonProperty("ids:includedCertificationLevel")
    final public CertificationLevel getIncludedCertificationLevel() {
        // not implemented for enums
        throw new UnsupportedOperationException();
    }

}
