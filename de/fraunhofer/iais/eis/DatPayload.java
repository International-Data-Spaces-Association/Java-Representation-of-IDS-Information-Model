package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The Dynamic Attribute Token (DAT) Payload is the JSON Element of any DAT containing the claims of
 * the token bearer. This payload itself is a JSON-LD encoded RDF class with a defined set of
 * attributes. These attributes are either defined by RFC 7519 or by the IDS Information Model. As a
 * direct consequence of regarding the DAT Payload as JSON-LD, *all* DAT Payloads must have exactly
 * one "@context" attribute with the IDS context URI as its value and a "@type" with ids:DatPayload
 * as its value.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = DatPayloadImpl.class)
})
public interface DatPayload extends JwtPayload {

    // standard methods

    @Beta
    public DatPayload deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Reference to a security guarantee that, if used in combination with a security profile instance,
     * overrides the respective guarantee of the given predefined instance.
     *
     * More information under https://w3id.org/idsa/core/extendedGuarantee
     *
     * @return Returns the List of SecurityGuarantees for the property _extendedGuarantee.
     */
    @JsonProperty("ids:extendedGuarantee")
    List<SecurityGuarantee> getExtendedGuarantee();

    /**
     * Reference to a security guarantee that, if used in combination with a security profile instance,
     * overrides the respective guarantee of the given predefined instance.
     *
     * More information under https://w3id.org/idsa/core/extendedGuarantee
     *
     * @param _extendedGuarantee_ desired value for the property _extendedGuarantee.
     */
    void setExtendedGuarantee(List<SecurityGuarantee> _extendedGuarantee_);

}
