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
 * Local audit logging (including integrity protection) is the baseline for auditing and clearing.
 * Remote audit log tracing provides means to do external audit verification.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:AuditGuarantee")
public enum DefaultAuditGuarantee implements AuditGuarantee {

    /** 
    */
    AUDIT_LOCAL_LOGGING("https://w3id.org/idsa/code/AUDIT_LOCAL_LOGGING"),

    /** 
    */
    AUDIT_NONE("https://w3id.org/idsa/code/AUDIT_NONE"),

    /** 
    */
    AUDIT_REMOTE_TRACING("https://w3id.org/idsa/code/AUDIT_REMOTE_TRACING"),;

    private static final Map<String, DefaultAuditGuarantee> uriInstanceMapping;
    static {
        uriInstanceMapping = new HashMap<>();
        uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
        uriInstanceMapping
            .putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
    }

    private AuditGuarantee auditGuarantee;

    DefaultAuditGuarantee(String id) {
        this.auditGuarantee = new AuditGuaranteeBuilder(URI.create(id)).build();
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
        return this.auditGuarantee.getId();
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
        return this.auditGuarantee.getLabel();
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
        return this.auditGuarantee.getComment();
    }

    public String toRdf() {
        return VocabUtil.getInstance().toRdf(this);
    }

    @JsonProperty("@id")
    final public URI getSerializedId() {
        return this.auditGuarantee.getId();
    }

    @JsonCreator
    public static DefaultAuditGuarantee deserialize(JsonNode node) {
        return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
    }

    @Override
    public String toString() {
        return this.auditGuarantee.getId().toString();
    }

    @Override
    public AuditGuarantee deepCopy() {
        // not implemented for enums
        throw new UnsupportedOperationException();
    }

}
