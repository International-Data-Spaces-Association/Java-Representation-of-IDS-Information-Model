package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
* "Usage Control Object"@en
* "A data element containing all relevant information for usage control engines."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = UsageControlObjectImpl.class)
})
public interface UsageControlObject {

	// standard methods

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	@NotNull
	public URI getId();

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel();

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	public List<TypedLiteral> getComment();

	public String toRdf();

	// getter and setter for generic property map
	public Map<String,Object> getProperties();
	public void setProperty(String property, Object value);

	// accessor methods as derived from the IDSA Information Model ontology


	/**
	* "The related data or a pointer/reference to it."@en
	* @return Returns the URI for the property _data.
	* More information under https://w3id.org/idsa/core/data
	*/
	@NotNull
	@JsonProperty("ids:data")
	public URI getData();

	/**
	* "The participant intending to use the data."@en
	* @return Returns the Participant for the property _user.
	* More information under https://w3id.org/idsa/core/user
	*/
	@JsonProperty("ids:user")
	public Participant getUser();

	/**
	* "The application which provided the data object. Should be a valid URI. Must be unique in the regarded environment."@en
	* @return Returns the URI for the property _source.
	* More information under https://w3id.org/idsa/core/source
	*/
	@JsonProperty("ids:source")
	public URI getSource();

	/**
	* "The target contract defining the usage of the data object."@en
	* @return Returns the List of ContractAgreements for the property _contract.
	* More information under https://w3id.org/idsa/core/contract
	*/
	@NotEmpty
	@JsonProperty("ids:contract")
	public List<ContractAgreement> getContract();

	/**
	* "Duration, which this asset is in use by now. Might be calculated on the fly when requested by a Usage Control Engine."@en
	* @return Returns the javax.xml.datatype.Duration for the property _usageDuration.
	* More information under https://w3id.org/idsa/core/usageDuration
	*/
	@JsonProperty("ids:usageDuration")
	public javax.xml.datatype.Duration getUsageDuration();

	/**
	* "Last read or write access."@en
	* @return Returns the XMLGregorianCalendar for the property _accessed.
	* More information under https://w3id.org/idsa/core/accessed
	*/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@JsonProperty("ids:accessed")
	public XMLGregorianCalendar getAccessed();

	/**
	* "The list of combined current states of the data object."@en
	* @return Returns the List of ArtifactStates for the property _hasState.
	* More information under https://w3id.org/idsa/core/hasState
	*/
	@JsonProperty("ids:hasState")
	public List<ArtifactState> getHasState();

	/**
	* "\tThe target application requesting the usage. Should be some locally unique identifiers, preferably URIs."@en
	* @return Returns the URI for the property _requester.
	* More information under https://w3id.org/idsa/core/requester
	*/
	@JsonProperty("ids:requester")
	public URI getRequester();

	/**
	* "The date of the creation of the Digital Content. In contrast to the ids:temporalCoverage, creation dates of ids:Representation, ids:Artifacts or any other form of meta-data, this property describes the creation date of referenced Digital Content itself."@en
	* @return Returns the XMLGregorianCalendar for the property _created.
	* More information under https://w3id.org/idsa/core/created
	*/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@NotNull
	@JsonProperty("ids:created")
	public XMLGregorianCalendar getCreated();

	/**
	* "The date/time this Digital Content has been changed the last time. Only one \'modified\' attribute is usually needed."@en
	* @return Returns the XMLGregorianCalendar for the property _modified.
	* More information under https://w3id.org/idsa/core/modified
	*/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@JsonProperty("ids:modified")
	public XMLGregorianCalendar getModified();

	/**
	* "The operation relating to the asset /  data object. "@en
	* @return Returns the List of Actions for the property _action.
	* More information under https://w3id.org/idsa/core/action
	*/
	@JsonProperty("ids:action")
	public List<Action> getAction();

}
