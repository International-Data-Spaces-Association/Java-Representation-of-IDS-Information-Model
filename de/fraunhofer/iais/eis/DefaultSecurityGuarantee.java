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
 * Security guarantee claimed by a security profile.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:SecurityGuarantee")
public enum DefaultSecurityGuarantee implements SecurityGuarantee {

    /** 
    */
    APP_RESOURCES_LOCAL_ENFORCEMENT("https://w3id.org/idsa/code/APP_RESOURCES_LOCAL_ENFORCEMENT"),

    /** 
    */
    APP_RESOURCES_NONE("https://w3id.org/idsa/code/APP_RESOURCES_NONE"),

    /** 
    */
    APP_RESOURCES_REMOTE_VERIFICATION("https://w3id.org/idsa/code/APP_RESOURCES_REMOTE_VERIFICATION"),

    /** 
    */
    AUDIT_LOCAL_LOGGING("https://w3id.org/idsa/code/AUDIT_LOCAL_LOGGING"),

    /** 
    */
    AUDIT_NONE("https://w3id.org/idsa/code/AUDIT_NONE"),

    /** 
    */
    AUDIT_REMOTE_TRACING("https://w3id.org/idsa/code/AUDIT_REMOTE_TRACING"),

    /** 
    */
    AUTHENTICATION_MUTUAL("https://w3id.org/idsa/code/AUTHENTICATION_MUTUAL"),

    /** 
    */
    AUTHENTICATION_NONE("https://w3id.org/idsa/code/AUTHENTICATION_NONE"),

    /** 
    */
    AUTHENTICATION_SERVER_SIDE("https://w3id.org/idsa/code/AUTHENTICATION_SERVER_SIDE"),

    /** 
    */
    INTEGRITY_PROTECTION_LOCAL("https://w3id.org/idsa/code/INTEGRITY_PROTECTION_LOCAL"),

    /** 
    */
    INTEGRITY_PROTECTION_NONE("https://w3id.org/idsa/code/INTEGRITY_PROTECTION_NONE"),

    /** 
    */
    INTEGRITY_VERIFICATION_REMOTE("https://w3id.org/idsa/code/INTEGRITY_VERIFICATION_REMOTE"),

    /** 
    */
    INTEGRITY_VERIFICATION_SCOPE_KERNEL_CORE_CONTAINER("https://w3id.org/idsa/code/INTEGRITY_VERIFICATION_SCOPE_KERNEL_CORE_CONTAINER"),

    /** 
    */
    INTEGRITY_VERIFICATION_SCOPE_KERNEL_CORE_CONTAINER_APPLICATION(
        "https://w3id.org/idsa/code/INTEGRITY_VERIFICATION_SCOPE_KERNEL_CORE_CONTAINER_APPLICATION"),

    /** 
    */
    INTEGRITY_VERIFICATION_SCOPE_NONE("https://w3id.org/idsa/code/INTEGRITY_VERIFICATION_SCOPE_NONE"),

    /** 
    */
    LOCAL_DATA_CONFIDENTIALITY_FULL_ENCRYPTION("https://w3id.org/idsa/code/LOCAL_DATA_CONFIDENTIALITY_FULL_ENCRYPTION"),

    /** 
    */
    LOCAL_DATA_CONFIDENTIALITY_NONE("https://w3id.org/idsa/code/LOCAL_DATA_CONFIDENTIALITY_NONE"),

    /** 
    */
    LOCAL_DATA_CONFIDENTIALITY_SECURE_ERASURE("https://w3id.org/idsa/code/LOCAL_DATA_CONFIDENTIALITY_SECURE_ERASURE"),

    /** 
    */
    SERVICE_ISOLATION_LEAST_PRIVILEGE("https://w3id.org/idsa/code/SERVICE_ISOLATION_LEAST_PRIVILEGE"),

    /** 
    */
    SERVICE_ISOLATION_NONE("https://w3id.org/idsa/code/SERVICE_ISOLATION_NONE"),

    /** 
    */
    SERVICE_ISOLATION_PROCESS_GROUP("https://w3id.org/idsa/code/SERVICE_ISOLATION_PROCESS_GROUP"),

    /** 
    */
    USAGE_CONTROL_NONE("https://w3id.org/idsa/code/USAGE_CONTROL_NONE"),

    /** 
    */
    USAGE_CONTROL_POLICY_ENFORCEMENT("https://w3id.org/idsa/code/USAGE_CONTROL_POLICY_ENFORCEMENT"),

    /** 
    */
    USAGE_CONTROL_REMOTE_COMPLIANCE_VERIFICATION("https://w3id.org/idsa/code/USAGE_CONTROL_REMOTE_COMPLIANCE_VERIFICATION"),;

    private static final Map<String, DefaultSecurityGuarantee> uriInstanceMapping;
    static {
        uriInstanceMapping = new HashMap<>();
        uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
        uriInstanceMapping
            .putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
    }

    private SecurityGuarantee securityGuarantee;

    DefaultSecurityGuarantee(String id) {
        this.securityGuarantee = new SecurityGuaranteeBuilder(URI.create(id)).build();
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
        return this.securityGuarantee.getId();
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
        return this.securityGuarantee.getLabel();
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
        return this.securityGuarantee.getComment();
    }

    public String toRdf() {
        return VocabUtil.getInstance().toRdf(this);
    }

    @JsonProperty("@id")
    final public URI getSerializedId() {
        return this.securityGuarantee.getId();
    }

    @JsonCreator
    public static DefaultSecurityGuarantee deserialize(JsonNode node) {
        return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
    }

    @Override
    public String toString() {
        return this.securityGuarantee.getId().toString();
    }

    @Override
    public SecurityGuarantee deepCopy() {
        // not implemented for enums
        throw new UnsupportedOperationException();
    }

}
