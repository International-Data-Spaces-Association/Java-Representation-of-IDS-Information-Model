package de.fraunhofer.iais.eis;

import java.net.URI;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Message requesting the recipient to invoke a specific operation.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = InvokeOperationMessageImpl.class)
})
public interface InvokeOperationMessage extends RequestMessage {

    // standard methods

    @Beta
    public InvokeOperationMessage deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * References the operation to be invoked on the recipient's side by an URI.
     *
     * More information under https://w3id.org/idsa/core/operationReference
     *
     * @return Returns the URI for the property _operationReference.
     */
    @NotNull
    @JsonProperty("ids:operationReference")
    URI getOperationReference();

    /**
     * References the operation to be invoked on the recipient's side by an URI.
     *
     * More information under https://w3id.org/idsa/core/operationReference
     *
     * @param _operationReference_ desired value for the property _operationReference.
     */
    void setOperationReference(URI _operationReference_);

}
