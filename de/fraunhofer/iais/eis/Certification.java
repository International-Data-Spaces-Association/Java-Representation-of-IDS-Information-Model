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
	"Certification"@en

	"Abstract certification of compliance according to given Certification Scheme."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = ComponentCertification.class),

@JsonSubTypes.Type(value = ParticipantCertification.class),})
public interface Certification extends ManagedEntity {

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
	"certification level"@en

	"Level of certification (based on a combination of requierements, evaluation method etc.)"@en
	*/
	
	
	@JsonProperty("ids:certificationLevel")
	CertificationLevel getCertificationLevel();
	/**
	"last valid date"@en

	"Last date (as xsd:dateTimeStamp) the given Certification is considered valid."@en
	*/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	
	@JsonProperty("ids:lastValidDate")
	XMLGregorianCalendar getLastValidDate();
	/**
	"evaluation facility"@en

	"Evaluation Facility that performed and issued given Certification"@en
	*/
	
	
	@JsonProperty("ids:evaluationFacility")
	EvaluationFacility getEvaluationFacility();
}
