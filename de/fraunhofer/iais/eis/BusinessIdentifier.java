package de.fraunhofer.iais.eis;


import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * A business identifier is a identification number used to identify a company. E.g., the Data
 * Universal Numbering System, abbreviated as DUNS
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = BusinessIdentifierImpl.class)
})
public interface BusinessIdentifier extends ModelClass {

    // standard methods

    @Beta
    public BusinessIdentifier deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * This property is used to define the system used as an business identifier. E.g., DUNS or SIRET.
     *
     * More information under https://w3id.org/idsa/core/identifierSystem
     *
     * @return Returns the String for the property _identifierSystem.
     */
    @NotNull
    @JsonProperty("ids:identifierSystem")
    String getIdentifierSystem();

    /**
     * This property is used to define the system used as an business identifier. E.g., DUNS or SIRET.
     *
     * More information under https://w3id.org/idsa/core/identifierSystem
     *
     * @param _identifierSystem_ desired value for the property _identifierSystem.
     */
    void setIdentifierSystem(String _identifierSystem_);

    /**
     * This property is used to define the value used as an business identifier.
     *
     * More information under https://w3id.org/idsa/core/identifierNumber
     *
     * @return Returns the String for the property _identifierNumber.
     */
    @NotNull
    @JsonProperty("ids:identifierNumber")
    String getIdentifierNumber();

    /**
     * This property is used to define the value used as an business identifier.
     *
     * More information under https://w3id.org/idsa/core/identifierNumber
     *
     * @param _identifierNumber_ desired value for the property _identifierNumber.
     */
    void setIdentifierNumber(String _identifierNumber_);

}
