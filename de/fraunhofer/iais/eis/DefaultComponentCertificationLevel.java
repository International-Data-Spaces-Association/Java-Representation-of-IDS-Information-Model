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
 * Level of a Component Certification
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:ComponentCertificationLevel")
public enum DefaultComponentCertificationLevel implements ComponentCertificationLevel {

    /** 
    */
    COMPONENT_BASE_SECURITY_PROFILE_CHECKLIST_APPROACH("https://w3id.org/idsa/code/COMPONENT_BASE_SECURITY_PROFILE_CHECKLIST_APPROACH"),

    /** 
    */
    COMPONENT_BASE_SECURITY_PROFILE_CONCEPT_REVIEW("https://w3id.org/idsa/code/COMPONENT_BASE_SECURITY_PROFILE_CONCEPT_REVIEW"),

    /** 
    */
    COMPONENT_TRUSTPLUS_SECURITY_PROFILE_CONCEPT_REVIEW("https://w3id.org/idsa/code/COMPONENT_TRUSTPLUS_SECURITY_PROFILE_CONCEPT_REVIEW"),

    /** 
    */
    COMPONENT_TRUSTPLUS_SECURITY_PROFILE_HIGH_ASSURANCE_EVALUATION(
        "https://w3id.org/idsa/code/COMPONENT_TRUSTPLUS_SECURITY_PROFILE_HIGH_ASSURANCE_EVALUATION"),

    /** 
    */
    COMPONENT_TRUST_SECURITY_PROFILE_CONCEPT_REVIEW("https://w3id.org/idsa/code/COMPONENT_TRUST_SECURITY_PROFILE_CONCEPT_REVIEW"),

    /** 
    */
    COMPONENT_TRUST_SECURITY_PROFILE_HIGH_ASSURANCE_EVALUATION(
        "https://w3id.org/idsa/code/COMPONENT_TRUST_SECURITY_PROFILE_HIGH_ASSURANCE_EVALUATION"),;

    private static final Map<String, DefaultComponentCertificationLevel> uriInstanceMapping;
    static {
        uriInstanceMapping = new HashMap<>();
        uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
        uriInstanceMapping
            .putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
    }

    private ComponentCertificationLevel componentCertificationLevel;

    DefaultComponentCertificationLevel(String id) {
        this.componentCertificationLevel = new ComponentCertificationLevelBuilder(URI.create(id)).build();
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
        return this.componentCertificationLevel.getId();
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
        return this.componentCertificationLevel.getLabel();
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
        return this.componentCertificationLevel.getComment();
    }

    public String toRdf() {
        return VocabUtil.getInstance().toRdf(this);
    }

    @JsonProperty("@id")
    final public URI getSerializedId() {
        return this.componentCertificationLevel.getId();
    }

    @JsonCreator
    public static DefaultComponentCertificationLevel deserialize(JsonNode node) {
        return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
    }

    @Override
    public String toString() {
        return this.componentCertificationLevel.getId().toString();
    }

    @Override
    public ComponentCertificationLevel deepCopy() {
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
