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
* "Contract"@en
* "Abstract set of rules governing the usage of a Resource."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = ContractOffer.class),
	@JsonSubTypes.Type(value = ContractAgreement.class),
	@JsonSubTypes.Type(value = ContractRequest.class)
})
public interface Contract {

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

	// accessor methods as derived from the IDS Information Model ontology


	/**
	* "Absolute datetime the Contract is requested, offered or expected to start, depending on the type of Contract."@en
	* @return Returns the XMLGregorianCalendar for the property _contractStart.
	* More information under https://w3id.org/idsa/core/contractStart
	*/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@JsonProperty("ids:contractStart")
	public XMLGregorianCalendar getContractStart();

	/**
	* "Absolute datetime the Contract is requested, offered or expected to end. If omitted, the contract has to be explicitly terminated by any of the parties."@en
	* @return Returns the XMLGregorianCalendar for the property _contractEnd.
	* More information under https://w3id.org/idsa/core/contractEnd
	*/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@JsonProperty("ids:contractEnd")
	public XMLGregorianCalendar getContractEnd();

	/**
	* "Absolute datetime of singing the Contract."@en
	* @return Returns the XMLGregorianCalendar for the property _contractDate.
	* More information under https://w3id.org/idsa/core/contractDate
	*/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@JsonProperty("ids:contractDate")
	public XMLGregorianCalendar getContractDate();

	/**
	* "Provider of a Resource or Service that is the subject matter of the contract. This party may differ from the Assigner specified by the Contract rules."@en
	* @return Returns the URI for the property _provider.
	* More information under https://w3id.org/idsa/core/provider
	*/
	@JsonProperty("ids:provider")
	public URI getProvider();

	/**
	* "Consumer of a Resource or Service that is the subject matter of the Contract. This party may differ from the Assignee specified by the Contract rules."@en
	* @return Returns the URI for the property _consumer.
	* More information under https://w3id.org/idsa/core/consumer
	*/
	@JsonProperty("ids:consumer")
	public URI getConsumer();

	/**
	* "Equivalent human-readable encoding of this machine-interpretable Contract."@en
	* @return Returns the TextResource for the property _contractDocument.
	* More information under https://w3id.org/idsa/core/contractDocument
	*/
	@JsonProperty("ids:contractDocument")
	public TextResource getContractDocument();

	/**
	* "Any type of resource related to the Contract."@en
	* @return Returns the Resource for the property _contractAnnex.
	* More information under https://w3id.org/idsa/core/contractAnnex
	*/
	@JsonProperty("ids:contractAnnex")
	public Resource getContractAnnex();

	/**
	* "A Permission granted by the Contract."@en
	* @return Returns the List of Permissions for the property _permission.
	* More information under https://w3id.org/idsa/core/permission
	*/
	@JsonProperty("ids:permission")
	public List<Permission> getPermission();

	/**
	* "A Prohibition imposed by the Contract."@en
	* @return Returns the List of Prohibitions for the property _prohibition.
	* More information under https://w3id.org/idsa/core/prohibition
	*/
	@JsonProperty("ids:prohibition")
	public List<Prohibition> getProhibition();

	/**
	* "A Duty imposed by the Contract."@en
	* @return Returns the List of Dutys for the property _obligation.
	* More information under https://w3id.org/idsa/core/obligation
	*/
	@JsonProperty("ids:obligation")
	public List<Duty> getObligation();

}
