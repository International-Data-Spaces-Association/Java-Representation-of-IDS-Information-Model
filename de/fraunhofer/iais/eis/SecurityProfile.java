package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import de.fraunhofer.iais.eis.util.*;

/**
 * Set of security guarantees claimed by a Connector. Connectors may asses their mutual technical
 * reliability and trustworthiness by evaluating each other’s security profile.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = SecurityProfileImpl.class)
})
public interface SecurityProfile extends ModelClass {

    // standard methods

    @Beta
    public SecurityProfile deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Reference to a security guarantee supported by given profile.
     *
     * More information under https://w3id.org/idsa/core/securityGuarantee
     *
     * @return Returns the List of SecurityGuarantees for the property _securityGuarantee.
     */
    @JsonAlias({"https://w3id.org/idsa/core/securityGuarantee", "ids:securityGuarantee", "securityGuarantee"})
    List<SecurityGuarantee> getSecurityGuarantee();

    /**
     * Reference to a security guarantee supported by given profile.
     *
     * More information under https://w3id.org/idsa/core/securityGuarantee
     *
     * @param _securityGuarantee_ desired value for the property _securityGuarantee.
     */
    void setSecurityGuarantee(List<SecurityGuarantee> _securityGuarantee_);

    // Default instances of this class as defined in the ontology

    /**
     * Default security profile of a certified IDS Connector.
     */
    SecurityProfile BASE_SECURITY_PROFILE =
        new SecurityProfileBuilder(URI.create("https://w3id.org/idsa/code/BASE_SECURITY_PROFILE")).build();

    /**
     * The Security Profile TRUST+ as defined by the IDS certification criteria.
     */
    SecurityProfile TRUST_PLUS_SECURITY_PROFILE =
        new SecurityProfileBuilder(URI.create("https://w3id.org/idsa/code/TRUST_PLUS_SECURITY_PROFILE")).build();

    /**
     * The Security Profile TRUST as defined by the IDS certification criteria.
     */
    SecurityProfile TRUST_SECURITY_PROFILE =
        new SecurityProfileBuilder(URI.create("https://w3id.org/idsa/code/TRUST_SECURITY_PROFILE")).build();

}
