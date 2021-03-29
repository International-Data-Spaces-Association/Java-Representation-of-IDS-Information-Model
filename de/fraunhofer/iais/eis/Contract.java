package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.*;
import javax.validation.constraints.*;
import java.util.Arrays;
import java.io.Serializable;

import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
	"Contract"@en

	"Abstract set of rules governing the usage of a Resource."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = ContractAgreement.class),

@JsonSubTypes.Type(value = ContractOffer.class),

@JsonSubTypes.Type(value = ContractRequest.class),})
public interface Contract {

	// standard methods

	@JsonProperty("@id")
	@javax.validation.constraints.NotNull URI getId();
	java.util.List<TypedLiteral> getLabel();
	java.util.List<TypedLiteral> getComment();
	String toRdf();

	// getter and setter for generic property map
	public java.util.Map<String,Object> getProperties();
	public void setProperty(String property, Object value);

	// accessor methods as derived from information model
	/**
	"permission"@en

	"A Permission granted by the Contract."@en
	*/
	
	
	@JsonProperty("ids:permission")
	java.util.ArrayList<? extends Permission> getPermission();
	/**
	"prohibition"@en

	"A Prohibition imposed by the Contract."@en
	*/
	
	
	@JsonProperty("ids:prohibition")
	java.util.ArrayList<? extends Prohibition> getProhibition();
	/**
	"obligation"@en

	"A Duty imposed by the Contract."@en
	*/
	
	
	@JsonProperty("ids:obligation")
	java.util.ArrayList<? extends Duty> getObligation();
	/**
	"Contract start"@en

	"Absolute datetime the Contract is requested, offered or expected to start, depending on the type of Contract."@en
	*/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	
	@JsonProperty("ids:contractStart")
	XMLGregorianCalendar getContractStart();
	/**
	"Contract end"@en

	"Absolute datetime the Contract is requested, offered or expected to end. If omitted, the contract has to be explicitly terminated by any of the parties."@en
	*/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	
	@JsonProperty("ids:contractEnd")
	XMLGregorianCalendar getContractEnd();
	/**
	"Contract date"@en

	"Absolute datetime of singing the Contract."@en
	*/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	
	@JsonProperty("ids:contractDate")
	XMLGregorianCalendar getContractDate();
	/**
	"Provider"@en

	"Provider of a Resource or Service that is the subject matter of the contract. This party may differ from the Assigner specified by the Contract rules."@en
	*/
	
	
	@JsonProperty("ids:provider")
	URI getProvider();
	/**
	"Consumer"@en

	"Consumer of a Resource or Service that is the subject matter of the Contract. This party may differ from the Assignee specified by the Contract rules."@en
	*/
	
	
	@JsonProperty("ids:consumer")
	URI getConsumer();
	/**
	"Contract document"@en

	"Equivalent human-readable encoding of this machine-interpretable Contract."@en
	*/
	
	
	@JsonProperty("ids:contractDocument")
	TextResource getContractDocument();
	/**
	"Annex to contract"@en

	"Any type of resource related to the Contract."@en
	*/
	
	
	@JsonProperty("ids:contractAnnex")
	Resource getContractAnnex();
}
