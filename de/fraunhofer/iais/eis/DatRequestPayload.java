package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The Dynamic Attribute Token (DAT) *Request* Payload is the JSON Element of any DAT containing the
 * claims of the token bearer. This payload itself is a JSON-LD encoded RDF class with a defined set
 * of attributes. These attributes are either defined by RFC 7519 or by the IDS Information Model.
 * As a direct consequence of regarding the DAT Payload as JSON-LD, *all* DAT Payloads must have
 * exactly one "@context" attribute with the IDS context URI as its value and a "@type" with
 * ids:DatPayload as its value. Note that, different to the DatPayload, the DatRequestPayload
 * contains the *self-claims* of a connector and is not yet signed by any DAPS. Consequently, no
 * other connector must accept a DatRequest object as a DAT. A DatRequest and its contained
 * DatRequestPayload is *only* intended for interactions with a DAPS and *nothing else*!
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = DatRequestPayloadImpl.class)
})
public interface DatRequestPayload extends JwtPayload {

    // standard methods

    @Beta
    public DatRequestPayload deepCopy();

}
