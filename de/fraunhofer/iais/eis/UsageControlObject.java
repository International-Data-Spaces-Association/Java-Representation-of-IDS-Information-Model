package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * A data element containing all relevant information for usage control engines.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = UsageControlObjectImpl.class)
})
public interface UsageControlObject extends ModelClass {

    // standard methods

    @Beta
    public UsageControlObject deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * The related data or a pointer/reference to it.
     *
     * More information under https://w3id.org/idsa/core/data
     *
     * @return Returns the URI for the property _data.
     */
    @NotNull
    @JsonProperty("ids:data")
    URI getData();

    /**
     * The related data or a pointer/reference to it.
     *
     * More information under https://w3id.org/idsa/core/data
     *
     * @param _data_ desired value for the property _data.
     */
    void setData(URI _data_);

    /**
     * The participant intending to use the data.
     *
     * More information under https://w3id.org/idsa/core/user
     *
     * @return Returns the Participant for the property _user.
     */
    @JsonProperty("ids:user")
    Participant getUser();

    /**
     * The participant intending to use the data.
     *
     * More information under https://w3id.org/idsa/core/user
     *
     * @param _user_ desired value for the property _user.
     */
    void setUser(Participant _user_);

    /**
     * The application which provided the data object. Should be a valid URI. Must be unique in the
     * regarded environment.
     *
     * More information under https://w3id.org/idsa/core/source
     *
     * @return Returns the URI for the property _source.
     */
    @JsonProperty("ids:source")
    URI getSource();

    /**
     * The application which provided the data object. Should be a valid URI. Must be unique in the
     * regarded environment.
     *
     * More information under https://w3id.org/idsa/core/source
     *
     * @param _source_ desired value for the property _source.
     */
    void setSource(URI _source_);

    /**
     * The target contract defining the usage of the data object.
     *
     * More information under https://w3id.org/idsa/core/contract
     *
     * @return Returns the List of ContractAgreements for the property _contract.
     */
    @NotEmpty
    @JsonProperty("ids:contract")
    List<ContractAgreement> getContract();

    /**
     * The target contract defining the usage of the data object.
     *
     * More information under https://w3id.org/idsa/core/contract
     *
     * @param _contract_ desired value for the property _contract.
     */
    void setContract(List<ContractAgreement> _contract_);

    /**
     * Duration, which this asset is in use by now. Might be calculated on the fly when requested by a
     * Usage Control Engine.
     *
     * More information under https://w3id.org/idsa/core/usageDuration
     *
     * @return Returns the javax.xml.datatype.Duration for the property _usageDuration.
     */
    @JsonProperty("ids:usageDuration")
    javax.xml.datatype.Duration getUsageDuration();

    /**
     * Duration, which this asset is in use by now. Might be calculated on the fly when requested by a
     * Usage Control Engine.
     *
     * More information under https://w3id.org/idsa/core/usageDuration
     *
     * @param _usageDuration_ desired value for the property _usageDuration.
     */
    void setUsageDuration(javax.xml.datatype.Duration _usageDuration_);

    /**
     * Last read or write access.
     *
     * More information under https://w3id.org/idsa/core/accessed
     *
     * @return Returns the XMLGregorianCalendar for the property _accessed.
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    @JsonProperty("ids:accessed")
    XMLGregorianCalendar getAccessed();

    /**
     * Last read or write access.
     *
     * More information under https://w3id.org/idsa/core/accessed
     *
     * @param _accessed_ desired value for the property _accessed.
     */
    void setAccessed(XMLGregorianCalendar _accessed_);

    /**
     * The list of combined current states of the data object.
     *
     * More information under https://w3id.org/idsa/core/hasState
     *
     * @return Returns the List of ArtifactStates for the property _hasState.
     */
    @JsonProperty("ids:hasState")
    List<ArtifactState> getHasState();

    /**
     * The list of combined current states of the data object.
     *
     * More information under https://w3id.org/idsa/core/hasState
     *
     * @param _hasState_ desired value for the property _hasState.
     */
    void setHasState(List<ArtifactState> _hasState_);

    /**
     * The target application requesting the usage. Should be some locally unique identifiers,
     * preferably URIs.
     *
     * More information under https://w3id.org/idsa/core/requester
     *
     * @return Returns the URI for the property _requester.
     */
    @JsonProperty("ids:requester")
    URI getRequester();

    /**
     * The target application requesting the usage. Should be some locally unique identifiers,
     * preferably URIs.
     *
     * More information under https://w3id.org/idsa/core/requester
     *
     * @param _requester_ desired value for the property _requester.
     */
    void setRequester(URI _requester_);

    /**
     * The date of the creation of the Digital Content. In contrast to the ids:temporalCoverage,
     * creation dates of ids:Representation, ids:Artifacts or any other form of meta-data, this property
     * describes the creation date of referenced Digital Content itself.
     *
     * More information under https://w3id.org/idsa/core/created
     *
     * @return Returns the XMLGregorianCalendar for the property _created.
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    @NotNull
    @JsonProperty("ids:created")
    XMLGregorianCalendar getCreated();

    /**
     * The date of the creation of the Digital Content. In contrast to the ids:temporalCoverage,
     * creation dates of ids:Representation, ids:Artifacts or any other form of meta-data, this property
     * describes the creation date of referenced Digital Content itself.
     *
     * More information under https://w3id.org/idsa/core/created
     *
     * @param _created_ desired value for the property _created.
     */
    void setCreated(XMLGregorianCalendar _created_);

    /**
     * The date/time this Digital Content has been changed the last time. Only one 'modified' attribute
     * is usually needed.
     *
     * More information under https://w3id.org/idsa/core/modified
     *
     * @return Returns the XMLGregorianCalendar for the property _modified.
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    @JsonProperty("ids:modified")
    XMLGregorianCalendar getModified();

    /**
     * The date/time this Digital Content has been changed the last time. Only one 'modified' attribute
     * is usually needed.
     *
     * More information under https://w3id.org/idsa/core/modified
     *
     * @param _modified_ desired value for the property _modified.
     */
    void setModified(XMLGregorianCalendar _modified_);

    /**
     * The operation relating to the asset / data object.
     *
     * More information under https://w3id.org/idsa/core/action
     *
     * @return Returns the List of Actions for the property _action.
     */
    @JsonProperty("ids:action")
    List<Action> getAction();

    /**
     * The operation relating to the asset / data object.
     *
     * More information under https://w3id.org/idsa/core/action
     *
     * @param _action_ desired value for the property _action.
     */
    void setAction(List<Action> _action_);

}
