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
 * Security guarantee claimed by a security profile.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:SecurityGuarantee")
public enum SecurityGuarantee implements ModelClass {

    /** 
    */
    APP_RESOURCES_LOCAL_ENFORCEMENT("https://w3id.org/idsa/code/APP_RESOURCES_LOCAL_ENFORCEMENT",
        Arrays.asList(new TypedLiteral("App Resources Local Enforcement", "")), Collections.emptyList()),

    /** 
    */
    APP_RESOURCES_NONE("https://w3id.org/idsa/code/APP_RESOURCES_NONE", Arrays.asList(new TypedLiteral("App Resources None", "")),
        Collections.emptyList()),

    /** 
    */
    APP_RESOURCES_REMOTE_VERIFICATION("https://w3id.org/idsa/code/APP_RESOURCES_REMOTE_VERIFICATION",
        Arrays.asList(new TypedLiteral("App Resources Remote Verification", "")), Collections.emptyList()),

    /** 
    */
    AUDIT_LOCAL_LOGGING("https://w3id.org/idsa/code/AUDIT_LOCAL_LOGGING", Arrays.asList(new TypedLiteral("Audit Local Logging", "")),
        Collections.emptyList()),

    /** 
    */
    AUDIT_NONE("https://w3id.org/idsa/code/AUDIT_NONE", Arrays.asList(new TypedLiteral("Audit None", "")), Collections.emptyList()),

    /** 
    */
    AUDIT_REMOTE_TRACING("https://w3id.org/idsa/code/AUDIT_REMOTE_TRACING", Arrays.asList(new TypedLiteral("Audit Remote Tracing", "")),
        Collections.emptyList()),

    /** 
    */
    AUTHENTICATION_MUTUAL("https://w3id.org/idsa/code/AUTHENTICATION_MUTUAL", Arrays.asList(new TypedLiteral("Authentication Mutual", "")),
        Collections.emptyList()),

    /** 
    */
    AUTHENTICATION_NONE("https://w3id.org/idsa/code/AUTHENTICATION_NONE", Arrays.asList(new TypedLiteral("Authentication None", "")),
        Collections.emptyList()),

    /** 
    */
    AUTHENTICATION_SERVER_SIDE("https://w3id.org/idsa/code/AUTHENTICATION_SERVER_SIDE",
        Arrays.asList(new TypedLiteral("Authentication Serverside", "")), Collections.emptyList()),

    /** 
    */
    INTEGRITY_PROTECTION_LOCAL("https://w3id.org/idsa/code/INTEGRITY_PROTECTION_LOCAL",
        Arrays.asList(new TypedLiteral("Integrity Protection Local", "")), Collections.emptyList()),

    /** 
    */
    INTEGRITY_PROTECTION_NONE("https://w3id.org/idsa/code/INTEGRITY_PROTECTION_NONE",
        Arrays.asList(new TypedLiteral("Integrity Protection None", "")), Collections.emptyList()),

    /** 
    */
    INTEGRITY_VERIFICATION_REMOTE("https://w3id.org/idsa/code/INTEGRITY_VERIFICATION_REMOTE",
        Arrays.asList(new TypedLiteral("Integrity Protection Remote", "")), Collections.emptyList()),

    /** 
    */
    INTEGRITY_VERIFICATION_SCOPE_KERNEL_CORE_CONTAINER("https://w3id.org/idsa/code/INTEGRITY_VERIFICATION_SCOPE_KERNEL_CORE_CONTAINER",
        Arrays.asList(new TypedLiteral("Integrity Verification Scope Kernel Core Container", "")), Collections.emptyList()),

    /** 
    */
    INTEGRITY_VERIFICATION_SCOPE_KERNEL_CORE_CONTAINER_APPLICATION(
        "https://w3id.org/idsa/code/INTEGRITY_VERIFICATION_SCOPE_KERNEL_CORE_CONTAINER_APPLICATION",
        Arrays.asList(new TypedLiteral("Integrity Verification Scope Kernel Core Container Application", "")), Collections.emptyList()),

    /** 
    */
    INTEGRITY_VERIFICATION_SCOPE_NONE("https://w3id.org/idsa/code/INTEGRITY_VERIFICATION_SCOPE_NONE",
        Arrays.asList(new TypedLiteral("Integrity Verification Scope None", "")), Collections.emptyList()),

    /** 
    */
    LOCAL_DATA_CONFIDENTIALITY_FULL_ENCRYPTION("https://w3id.org/idsa/code/LOCAL_DATA_CONFIDENTIALITY_FULL_ENCRYPTION",
        Arrays.asList(new TypedLiteral("Local Data Confidentiality Full Encryption", "")), Collections.emptyList()),

    /** 
    */
    LOCAL_DATA_CONFIDENTIALITY_NONE("https://w3id.org/idsa/code/LOCAL_DATA_CONFIDENTIALITY_NONE",
        Arrays.asList(new TypedLiteral("Local Data Confidentiality None", "")), Collections.emptyList()),

    /** 
    */
    LOCAL_DATA_CONFIDENTIALITY_SECURE_ERASURE("https://w3id.org/idsa/code/LOCAL_DATA_CONFIDENTIALITY_SECURE_ERASURE",
        Arrays.asList(new TypedLiteral("Local Data Confidentiality Secure Erasure", "")), Collections.emptyList()),

    /** 
    */
    SERVICE_ISOLATION_LEAST_PRIVILEGE("https://w3id.org/idsa/code/SERVICE_ISOLATION_LEAST_PRIVILEGE",
        Arrays.asList(new TypedLiteral("Service Isolation Least Privilege", "")), Collections.emptyList()),

    /** 
    */
    SERVICE_ISOLATION_NONE("https://w3id.org/idsa/code/SERVICE_ISOLATION_NONE",
        Arrays.asList(new TypedLiteral("Service Isolation None", "")), Collections.emptyList()),

    /** 
    */
    SERVICE_ISOLATION_PROCESS_GROUP("https://w3id.org/idsa/code/SERVICE_ISOLATION_PROCESS_GROUP",
        Arrays.asList(new TypedLiteral("Service Isolation Process Group", "")), Collections.emptyList()),

    /** 
    */
    USAGE_CONTROL_NONE("https://w3id.org/idsa/code/USAGE_CONTROL_NONE", Arrays.asList(new TypedLiteral("Usage Control None", "")),
        Collections.emptyList()),

    /** 
    */
    USAGE_CONTROL_POLICY_ENFORCEMENT("https://w3id.org/idsa/code/USAGE_CONTROL_POLICY_ENFORCEMENT",
        Arrays.asList(new TypedLiteral("Usage Control Policy Enforcement", "")), Collections.emptyList()),

    /** 
    */
    USAGE_CONTROL_REMOTE_COMPLIANCE_VERIFICATION("https://w3id.org/idsa/code/USAGE_CONTROL_REMOTE_COMPLIANCE_VERIFICATION",
        Arrays.asList(new TypedLiteral("Usage Control Remote Compliance Verification", "")), Collections.emptyList());

    private static final Map<String, SecurityGuarantee> uriInstanceMapping;
    static {
        uriInstanceMapping = new HashMap<>();
        uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
        uriInstanceMapping
            .putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
    }

    private URI id;
    private List<TypedLiteral> label;
    private List<TypedLiteral> comment;

    SecurityGuarantee(String id, List<TypedLiteral> label, List<TypedLiteral> comment) {
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
    public static SecurityGuarantee deserialize(JsonNode node) {
        return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
    }

    @Override
    public String toString() {
        return id.toString();
    }

}
