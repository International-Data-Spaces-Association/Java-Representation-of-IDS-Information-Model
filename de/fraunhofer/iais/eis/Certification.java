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
* "Certification"@en
* "Abstract certification of compliance according to given Certification Scheme."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = ComponentCertification.class),
	@JsonSubTypes.Type(value = ParticipantCertification.class)
})
public interface Certification extends ManagedEntity {

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
	* "Level of certification (based on a combination of requierements, evaluation method etc.)"@en
	* @return Returns the CertificationLevel for the property _certificationLevel.
	* More information under https://w3id.org/idsa/core/certificationLevel
	*/
	@JsonProperty("ids:certificationLevel")
	public CertificationLevel getCertificationLevel();

	/**
	* "Last date (as xsd:dateTimeStamp) the given Certification is considered valid."@en
	* @return Returns the XMLGregorianCalendar for the property _lastValidDate.
	* More information under https://w3id.org/idsa/core/lastValidDate
	*/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@JsonProperty("ids:lastValidDate")
	public XMLGregorianCalendar getLastValidDate();

	/**
	* "Evaluation Facility that performed and issued given Certification"@en
	* @return Returns the EvaluationFacility for the property _evaluationFacility.
	* More information under https://w3id.org/idsa/core/evaluationFacility
	*/
	@JsonProperty("ids:evaluationFacility")
	public EvaluationFacility getEvaluationFacility();

}
