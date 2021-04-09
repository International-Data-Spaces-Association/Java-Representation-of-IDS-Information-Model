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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

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
* "Component Certification"@en
* "Process and result of certifying a software component/servivce in order to become a certified part of the International Data Space infrastructure."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:ComponentCertification")
public class ComponentCertificationImpl implements Serializable, ComponentCertification {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Component Certification", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Process and result of certifying a software component/servivce in order to become a certified part of the International Data Space infrastructure.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDSA Information Model ontology

	/**
	* "certification level"@en
	* "Level of certification (based on a combination of requierements, evaluation method etc.)"@en
	*/
	@JsonAlias({"ids:certificationLevel", "certificationLevel"})
	protected CertificationLevel _certificationLevel;


	/**
	* "description"@en
	* "Explanation of the resource in a natural language text."@en
	*/
	@JsonAlias({"ids:description", "description"})
	protected ArrayList<? extends TypedLiteral> _description;


	/**
	* "evaluation facility"@en
	* "Evaluation Facility that performed and issued given Certification"@en
	*/
	@JsonAlias({"ids:evaluationFacility", "evaluationFacility"})
	protected EvaluationFacility _evaluationFacility;


	/**
	* "last valid date"@en
	* "Last date (as xsd:dateTimeStamp) the given Certification is considered valid."@en
	*/
	@JsonAlias({"ids:lastValidDate", "lastValidDate"})
	protected XMLGregorianCalendar _lastValidDate;


	/**
	* "title"@en
	* "(Localized) name of the entity."@en
	*/
	@JsonAlias({"ids:title", "title"})
	protected ArrayList<? extends TypedLiteral> _title;


	/**
	* "version"@en
	* "Version identifier of the Managed Entity"@en
	*/
	@JsonAlias({"ids:version", "version"})
	protected String _version;


	// no manual construction
	protected ComponentCertificationImpl() {
		id = VocabUtil.getInstance().createRandomUrl("componentCertification");
	}

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel() {
		return this.label;
	}

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	public List<TypedLiteral> getComment() {
		return this.comment;
	}

	// getter and setter for generic property map
	@JsonAnyGetter
	public Map<String,Object> getProperties() {
		if (this.properties == null) return null;
		Iterator<String> iter = this.properties.keySet().iterator();
		Map<String,Object> resultset = new HashMap<String, Object>();
		while (iter.hasNext()) {
			String key = iter.next();
			resultset.put(key,urifyObjects(this.properties.get(key)));
		}
		return resultset ;
	}

	public Object urifyObjects(Object value) {
		if (value instanceof String && value.toString().startsWith("http")) {
			try {
				value = new URI(value.toString());
			} catch (Exception e) { /* do nothing */ }
		} else if (value instanceof ArrayList) {
			ArrayList<Object> result_array = new ArrayList<Object>();
			((ArrayList) value).forEach(x -> result_array.add(urifyObjects(x)));
			return result_array;
		} else if (value instanceof Map) {
			Map<String, Object> result_map = new HashMap<String, Object>();
			((Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	@JsonAnySetter
	public void setProperty(String property, Object value) {
		if (this.properties == null) this.properties = new HashMap<String,Object>();
		if (property.startsWith("@")) {return ;};
		this.properties.put(property, value) ;
	}

	// accessor method implementations as derived from the IDSA Information Model ontology



	/**
	* "Level of certification (based on a combination of requierements, evaluation method etc.)"@en
	* @return Returns the CertificationLevel for the property certificationLevel.
	* More information under https://w3id.org/idsa/core/certificationLevel
	*/
	@JsonProperty("ids:certificationLevel")
	final public CertificationLevel getCertificationLevel() {
		return _certificationLevel;
	}

	
	/**
	* "Level of certification (based on a combination of requierements, evaluation method etc.)"@en
	* @param _certificationLevel_ desired value for the property certificationLevel.
	* More information under https://w3id.org/idsa/core/certificationLevel
	*/
	final public void setCertificationLevel (CertificationLevel _certificationLevel_) {
		this._certificationLevel = _certificationLevel_;
	}

	/**
	* "Last date (as xsd:dateTimeStamp) the given Certification is considered valid."@en
	* @return Returns the XMLGregorianCalendar for the property lastValidDate.
	* More information under https://w3id.org/idsa/core/lastValidDate
	*/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@JsonProperty("ids:lastValidDate")
	final public XMLGregorianCalendar getLastValidDate() {
		return _lastValidDate;
	}

	
	/**
	* "Last date (as xsd:dateTimeStamp) the given Certification is considered valid."@en
	* @param _lastValidDate_ desired value for the property lastValidDate.
	* More information under https://w3id.org/idsa/core/lastValidDate
	*/
	final public void setLastValidDate (XMLGregorianCalendar _lastValidDate_) {
		this._lastValidDate = _lastValidDate_;
	}

	/**
	* "Evaluation Facility that performed and issued given Certification"@en
	* @return Returns the EvaluationFacility for the property evaluationFacility.
	* More information under https://w3id.org/idsa/core/evaluationFacility
	*/
	@JsonProperty("ids:evaluationFacility")
	final public EvaluationFacility getEvaluationFacility() {
		return _evaluationFacility;
	}

	
	/**
	* "Evaluation Facility that performed and issued given Certification"@en
	* @param _evaluationFacility_ desired value for the property evaluationFacility.
	* More information under https://w3id.org/idsa/core/evaluationFacility
	*/
	final public void setEvaluationFacility (EvaluationFacility _evaluationFacility_) {
		this._evaluationFacility = _evaluationFacility_;
	}

	/**
	* "Version identifier of the Managed Entity"@en
	* @return Returns the String for the property version.
	* More information under https://w3id.org/idsa/core/version
	*/
	@JsonProperty("ids:version")
	final public String getVersion() {
		return _version;
	}

	
	/**
	* "Version identifier of the Managed Entity"@en
	* @param _version_ desired value for the property version.
	* More information under https://w3id.org/idsa/core/version
	*/
	final public void setVersion (String _version_) {
		this._version = _version_;
	}

	/**
	* "(Localized) name of the entity."@en
	* @return Returns the ArrayList of TypedLiteral for the property title.
	* More information under https://w3id.org/idsa/core/title
	*/
	@JsonProperty("ids:title")
	final public ArrayList<? extends TypedLiteral> getTitle() {
		return _title;
	}

	
	/**
	* "(Localized) name of the entity."@en
	* @param _title_ desired value for the property title.
	* More information under https://w3id.org/idsa/core/title
	*/
	final public void setTitle (ArrayList<? extends TypedLiteral> _title_) {
		this._title = _title_;
	}

	/**
	* "Explanation of the resource in a natural language text."@en
	* @return Returns the ArrayList of TypedLiteral for the property description.
	* More information under https://w3id.org/idsa/core/description
	*/
	@JsonProperty("ids:description")
	final public ArrayList<? extends TypedLiteral> getDescription() {
		return _description;
	}

	
	/**
	* "Explanation of the resource in a natural language text."@en
	* @param _description_ desired value for the property description.
	* More information under https://w3id.org/idsa/core/description
	*/
	final public void setDescription (ArrayList<? extends TypedLiteral> _description_) {
		this._description = _description_;
	}

}
