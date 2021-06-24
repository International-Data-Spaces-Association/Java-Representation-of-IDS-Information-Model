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
* "Participant Certification"@en
* "Process and result of certifying an interested party in order to become a certified member of the International Data Space."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:ParticipantCertification")
public class ParticipantCertificationImpl implements ParticipantCertification {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Participant Certification", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Process and result of certifying an interested party in order to become a certified member of the International Data Space.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDS Information Model ontology

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
	protected List<TypedLiteral> _description;


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
	* "membership end"@en
	* "End of the participant\'s IDS membership."@en
	*/
	@JsonAlias({"ids:membershipEnd", "membershipEnd"})
	protected XMLGregorianCalendar _membershipEnd;


	/**
	* "title"@en
	* "(Localized) name of the entity."@en
	*/
	@JsonAlias({"ids:title", "title"})
	protected List<TypedLiteral> _title;


	/**
	* "version"@en
	* "Version identifier of the Managed Entity"@en
	*/
	@JsonAlias({"ids:version", "version"})
	protected String _version;


	// no manual construction
	protected ParticipantCertificationImpl() {
		id = VocabUtil.getInstance().createRandomUrl("participantCertification");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	public List<TypedLiteral> getLabel() {
		return this.label;
	}

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
	@Override
	public int hashCode() {
		return Objects.hash(new Object[]{this._membershipEnd,
			this._certificationLevel,
			this._lastValidDate,
			this._evaluationFacility,
			this._version,
			this._title,
			this._description});
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			ParticipantCertificationImpl other = (ParticipantCertificationImpl) obj;
			return Objects.equals(this._membershipEnd, other._membershipEnd) &&
				Objects.equals(this._certificationLevel, other._certificationLevel) &&
				Objects.equals(this._lastValidDate, other._lastValidDate) &&
				Objects.equals(this._evaluationFacility, other._evaluationFacility) &&
				Objects.equals(this._version, other._version) &&
				Objects.equals(this._title, other._title) &&
				Objects.equals(this._description, other._description);
		}
	}


	// accessor method implementations as derived from the IDS Information Model ontology


	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@JsonProperty("ids:membershipEnd")
	final public XMLGregorianCalendar getMembershipEnd() {
		return _membershipEnd;
	}
	
	final public void setMembershipEnd (XMLGregorianCalendar _membershipEnd_) {
		this._membershipEnd = _membershipEnd_;
	}

	@JsonProperty("ids:certificationLevel")
	final public CertificationLevel getCertificationLevel() {
		return _certificationLevel;
	}
	
	final public void setCertificationLevel (CertificationLevel _certificationLevel_) {
		this._certificationLevel = _certificationLevel_;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@JsonProperty("ids:lastValidDate")
	final public XMLGregorianCalendar getLastValidDate() {
		return _lastValidDate;
	}
	
	final public void setLastValidDate (XMLGregorianCalendar _lastValidDate_) {
		this._lastValidDate = _lastValidDate_;
	}

	@JsonProperty("ids:evaluationFacility")
	final public EvaluationFacility getEvaluationFacility() {
		return _evaluationFacility;
	}
	
	final public void setEvaluationFacility (EvaluationFacility _evaluationFacility_) {
		this._evaluationFacility = _evaluationFacility_;
	}

	@JsonProperty("ids:version")
	final public String getVersion() {
		return _version;
	}
	
	final public void setVersion (String _version_) {
		this._version = _version_;
	}

	@JsonProperty("ids:title")
	final public List<TypedLiteral> getTitle() {
		return _title;
	}
	
	final public void setTitle (List<TypedLiteral> _title_) {
		this._title = _title_;
	}

	@JsonProperty("ids:description")
	final public List<TypedLiteral> getDescription() {
		return _description;
	}
	
	final public void setDescription (List<TypedLiteral> _description_) {
		this._description = _description_;
	}

}
