package de.fraunhofer.iais.eis;

import java.net.URI;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import de.fraunhofer.iais.eis.util.*;

/**
 * Level of a Component Certification
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ComponentCertificationLevelImpl.class)
})
public interface ComponentCertificationLevel extends CertificationLevel {

    // standard methods

    @Beta
    public ComponentCertificationLevel deepCopy();

    // Default instances of this class as defined in the ontology

    /** 
    */
    ComponentCertificationLevel COMPONENT_BASE_SECURITY_PROFILE_CHECKLIST_APPROACH =
        new ComponentCertificationLevelBuilder(URI.create("https://w3id.org/idsa/code/COMPONENT_BASE_SECURITY_PROFILE_CHECKLIST_APPROACH"))
            .build();

    /** 
    */
    ComponentCertificationLevel COMPONENT_BASE_SECURITY_PROFILE_CONCEPT_REVIEW =
        new ComponentCertificationLevelBuilder(URI.create("https://w3id.org/idsa/code/COMPONENT_BASE_SECURITY_PROFILE_CONCEPT_REVIEW"))
            .build();

    /** 
    */
    ComponentCertificationLevel COMPONENT_TRUSTPLUS_SECURITY_PROFILE_CONCEPT_REVIEW =
        new ComponentCertificationLevelBuilder(URI.create("https://w3id.org/idsa/code/COMPONENT_TRUSTPLUS_SECURITY_PROFILE_CONCEPT_REVIEW"))
            .build();

    /** 
    */
    ComponentCertificationLevel COMPONENT_TRUSTPLUS_SECURITY_PROFILE_HIGH_ASSURANCE_EVALUATION = new ComponentCertificationLevelBuilder(
        URI.create("https://w3id.org/idsa/code/COMPONENT_TRUSTPLUS_SECURITY_PROFILE_HIGH_ASSURANCE_EVALUATION")).build();

    /** 
    */
    ComponentCertificationLevel COMPONENT_TRUST_SECURITY_PROFILE_CONCEPT_REVIEW =
        new ComponentCertificationLevelBuilder(URI.create("https://w3id.org/idsa/code/COMPONENT_TRUST_SECURITY_PROFILE_CONCEPT_REVIEW"))
            .build();

    /** 
    */
    ComponentCertificationLevel COMPONENT_TRUST_SECURITY_PROFILE_HIGH_ASSURANCE_EVALUATION = new ComponentCertificationLevelBuilder(
        URI.create("https://w3id.org/idsa/code/COMPONENT_TRUST_SECURITY_PROFILE_HIGH_ASSURANCE_EVALUATION")).build();

}
