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
 * Set of security guarantees claimed by a Connector. Connectors may asses their mutual technical
 * reliability and trustworthiness by evaluating each other’s security profile.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:SecurityProfile")
public enum DefaultSecurityProfile implements SecurityProfile {

    /**
     * Default security profile of a certified IDS Connector.
     */
    BASE_SECURITY_PROFILE("https://w3id.org/idsa/code/BASE_SECURITY_PROFILE"),

    /**
     * The Security Profile TRUST+ as defined by the IDS certification criteria.
     */
    TRUST_PLUS_SECURITY_PROFILE("https://w3id.org/idsa/code/TRUST_PLUS_SECURITY_PROFILE"),

    /**
     * The Security Profile TRUST as defined by the IDS certification criteria.
     */
    TRUST_SECURITY_PROFILE("https://w3id.org/idsa/code/TRUST_SECURITY_PROFILE"),;

    private static final Map<String, DefaultSecurityProfile> uriInstanceMapping;
    static {
        uriInstanceMapping = new HashMap<>();
        uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
        uriInstanceMapping
            .putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
    }

    private SecurityProfile securityProfile;

    DefaultSecurityProfile(String id) {
        this.securityProfile = new SecurityProfileBuilder(URI.create(id)).build();
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
        return this.securityProfile.getId();
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
        return this.securityProfile.getLabel();
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
        return this.securityProfile.getComment();
    }

    public String toRdf() {
        return VocabUtil.getInstance().toRdf(this);
    }

    @JsonProperty("@id")
    final public URI getSerializedId() {
        return this.securityProfile.getId();
    }

    @JsonCreator
    public static DefaultSecurityProfile deserialize(JsonNode node) {
        return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
    }

    @Override
    public String toString() {
        return this.securityProfile.getId().toString();
    }

    @Override
    public SecurityProfile deepCopy() {
        // not implemented for enums
        throw new UnsupportedOperationException();
    }

    @JsonIgnore

    @JsonProperty("ids:securityGuarantee")
    final public List<SecurityGuarantee> getSecurityGuarantee() {
        // not implemented for enums
        throw new UnsupportedOperationException();
    }

    @JsonIgnore

    @Override
    public void setSecurityGuarantee(List<SecurityGuarantee> _securityGuarantee_) {
        // not implemented for enums
        throw new UnsupportedOperationException();
    }

}
