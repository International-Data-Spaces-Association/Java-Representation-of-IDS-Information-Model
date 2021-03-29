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
	"Usage Control Object"@en

	"A data element containing all relevant information for usage control engines."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = UsageControlObjectImpl.class),})
public interface UsageControlObject {

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
	"has data"@en

	"The related data or a pointer/reference to it."@en
	*/
	
	@NotNull
	@JsonProperty("ids:data")
	URI getData();
	/**
	"has contract"@en

	"The target contract defining the usage of the data object."@en
	*/
	
	@NotEmpty
	@JsonProperty("ids:contract")
	java.util.ArrayList<? extends ContractAgreement> getContract();
	/**
	"has state"@en

	"The list of combined current states of the data object."@en
	*/
	
	
	@JsonProperty("ids:hasState")
	java.util.ArrayList<? extends ArtifactState> getHasState();
	/**
	"has user"@en

	"The participant intending to use the data."@en
	*/
	
	
	@JsonProperty("ids:user")
	Participant getUser();
	/**
	"source"@en

	"The application which provided the data object. Should be a valid URI. Must be unique in the regarded environment."@en
	*/
	
	
	@JsonProperty("ids:source")
	URI getSource();
	/**
	"usage duration"@en

	"Duration, which this asset is in use by now. Might be calculated on the fly when requested by a Usage Control Engine."@en
	*/
	
	
	@JsonProperty("ids:usageDuration")
	javax.xml.datatype.Duration getUsageDuration();
	/**
	"last accessed"@en

	"Last read or write access."@en
	*/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	
	@JsonProperty("ids:accessed")
	XMLGregorianCalendar getAccessed();
	/**
	"requesting application"@en

	"\tThe target application requesting the usage. Should be some locally unique identifiers, preferably URIs."@en
	*/
	
	
	@JsonProperty("ids:requester")
	URI getRequester();
	/**
	"created"@en

	"The date of the creation of the Digital Content. In contrast to the ids:temporalCoverage, creation dates of ids:Representation, ids:Artifacts or any other form of meta-data, this property describes the creation date of referenced Digital Content itself."@en
	*/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@NotNull
	@JsonProperty("ids:created")
	XMLGregorianCalendar getCreated();
	/**
	"modified"@en

	"The date/time this Digital Content has been changed the last time. Only one \'modified\' attribute is usually needed."@en
	*/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	
	@JsonProperty("ids:modified")
	XMLGregorianCalendar getModified();
	/**
	"action"@en

	"The operation relating to the asset /  data object. "@en
	*/
	
	
	@JsonProperty("ids:action")
	java.util.ArrayList<? extends Action> getAction();
}
