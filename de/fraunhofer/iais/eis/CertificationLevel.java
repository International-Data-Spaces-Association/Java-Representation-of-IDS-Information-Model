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
	"Certification Level"@en

	"Level of Certification"@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = ComponentCertificationLevel.class),

@JsonSubTypes.Type(value = ParticipantCertificationLevel.class),})
public interface CertificationLevel {

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
	"included certification level"@en

	"Certification Level transitively implied by given Certification Level of same root type."@en
	*/
	
	
	@JsonProperty("ids:includedCertificationLevel")
	CertificationLevel getIncludedCertificationLevel();
}
