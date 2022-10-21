package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Abstract set of rules governing the usage of a Resource.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ContractOffer.class),
    @JsonSubTypes.Type(value = ContractAgreement.class),
    @JsonSubTypes.Type(value = ContractRequest.class)
})
public interface Contract extends ModelClass {

    // standard methods

    @Beta
    public Contract deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Absolute datetime the Contract is requested, offered or expected to start, depending on the type
     * of Contract.
     *
     * More information under https://w3id.org/idsa/core/contractStart
     *
     * @return Returns the XMLGregorianCalendar for the property _contractStart.
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    @JsonProperty("ids:contractStart")
    XMLGregorianCalendar getContractStart();

    /**
     * Absolute datetime the Contract is requested, offered or expected to start, depending on the type
     * of Contract.
     *
     * More information under https://w3id.org/idsa/core/contractStart
     *
     * @param _contractStart_ desired value for the property _contractStart.
     */
    void setContractStart(XMLGregorianCalendar _contractStart_);

    /**
     * Absolute datetime the Contract is requested, offered or expected to end. If omitted, the contract
     * has to be explicitly terminated by any of the parties.
     *
     * More information under https://w3id.org/idsa/core/contractEnd
     *
     * @return Returns the XMLGregorianCalendar for the property _contractEnd.
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    @JsonProperty("ids:contractEnd")
    XMLGregorianCalendar getContractEnd();

    /**
     * Absolute datetime the Contract is requested, offered or expected to end. If omitted, the contract
     * has to be explicitly terminated by any of the parties.
     *
     * More information under https://w3id.org/idsa/core/contractEnd
     *
     * @param _contractEnd_ desired value for the property _contractEnd.
     */
    void setContractEnd(XMLGregorianCalendar _contractEnd_);

    /**
     * Absolute datetime of singing the Contract.
     *
     * More information under https://w3id.org/idsa/core/contractDate
     *
     * @return Returns the XMLGregorianCalendar for the property _contractDate.
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    @JsonProperty("ids:contractDate")
    XMLGregorianCalendar getContractDate();

    /**
     * Absolute datetime of singing the Contract.
     *
     * More information under https://w3id.org/idsa/core/contractDate
     *
     * @param _contractDate_ desired value for the property _contractDate.
     */
    void setContractDate(XMLGregorianCalendar _contractDate_);

    /**
     * Provider of a Resource or Service that is the subject matter of the contract. This party may
     * differ from the Assigner specified by the Contract rules.
     *
     * More information under https://w3id.org/idsa/core/provider
     *
     * @return Returns the URI for the property _provider.
     */
    @JsonProperty("ids:provider")
    URI getProvider();

    /**
     * Provider of a Resource or Service that is the subject matter of the contract. This party may
     * differ from the Assigner specified by the Contract rules.
     *
     * More information under https://w3id.org/idsa/core/provider
     *
     * @param _provider_ desired value for the property _provider.
     */
    void setProvider(URI _provider_);

    /**
     * Consumer of a Resource or Service that is the subject matter of the Contract. This party may
     * differ from the Assignee specified by the Contract rules.
     *
     * More information under https://w3id.org/idsa/core/consumer
     *
     * @return Returns the URI for the property _consumer.
     */
    @JsonProperty("ids:consumer")
    URI getConsumer();

    /**
     * Consumer of a Resource or Service that is the subject matter of the Contract. This party may
     * differ from the Assignee specified by the Contract rules.
     *
     * More information under https://w3id.org/idsa/core/consumer
     *
     * @param _consumer_ desired value for the property _consumer.
     */
    void setConsumer(URI _consumer_);

    /**
     * Equivalent human-readable encoding of this machine-interpretable Contract.
     *
     * More information under https://w3id.org/idsa/core/contractDocument
     *
     * @return Returns the TextResource for the property _contractDocument.
     */
    @JsonProperty("ids:contractDocument")
    TextResource getContractDocument();

    /**
     * Equivalent human-readable encoding of this machine-interpretable Contract.
     *
     * More information under https://w3id.org/idsa/core/contractDocument
     *
     * @param _contractDocument_ desired value for the property _contractDocument.
     */
    void setContractDocument(TextResource _contractDocument_);

    /**
     * Any type of resource related to the Contract.
     *
     * More information under https://w3id.org/idsa/core/contractAnnex
     *
     * @return Returns the Resource for the property _contractAnnex.
     */
    @JsonProperty("ids:contractAnnex")
    Resource getContractAnnex();

    /**
     * Any type of resource related to the Contract.
     *
     * More information under https://w3id.org/idsa/core/contractAnnex
     *
     * @param _contractAnnex_ desired value for the property _contractAnnex.
     */
    void setContractAnnex(Resource _contractAnnex_);

    /**
     * A Permission granted by the Contract.
     *
     * More information under https://w3id.org/idsa/core/permission
     *
     * @return Returns the List of Permissions for the property _permission.
     */
    @JsonProperty("ids:permission")
    List<Permission> getPermission();

    /**
     * A Permission granted by the Contract.
     *
     * More information under https://w3id.org/idsa/core/permission
     *
     * @param _permission_ desired value for the property _permission.
     */
    void setPermission(List<Permission> _permission_);

    /**
     * A Prohibition imposed by the Contract.
     *
     * More information under https://w3id.org/idsa/core/prohibition
     *
     * @return Returns the List of Prohibitions for the property _prohibition.
     */
    @JsonProperty("ids:prohibition")
    List<Prohibition> getProhibition();

    /**
     * A Prohibition imposed by the Contract.
     *
     * More information under https://w3id.org/idsa/core/prohibition
     *
     * @param _prohibition_ desired value for the property _prohibition.
     */
    void setProhibition(List<Prohibition> _prohibition_);

    /**
     * A Duty imposed by the Contract.
     *
     * More information under https://w3id.org/idsa/core/obligation
     *
     * @return Returns the List of Dutys for the property _obligation.
     */
    @JsonProperty("ids:obligation")
    List<Duty> getObligation();

    /**
     * A Duty imposed by the Contract.
     *
     * More information under https://w3id.org/idsa/core/obligation
     *
     * @param _obligation_ desired value for the property _obligation.
     */
    void setObligation(List<Duty> _obligation_);

}
