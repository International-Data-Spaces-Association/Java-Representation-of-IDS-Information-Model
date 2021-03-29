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
	"Participant Certification"@en

	"Process and result of certifying an interested party in order to become a certified member of the International Data Space."@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:ParticipantCertification")
public class ParticipantCertificationImpl implements Serializable, ParticipantCertification {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Participant Certification", "en"));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Process and result of certifying an interested party in order to become a certified member of the International Data Space.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

	/**
	"certification level"@en

	"Level of certification (based on a combination of requierements, evaluation method etc.)"@en
	*/
	@JsonAlias({"ids:certificationLevel", "certificationLevel"})
	 CertificationLevel _certificationLevel;

	/**
	"description"@en

	"Explanation of the resource in a natural language text."@en
	*/
	@JsonAlias({"ids:description", "description"})
	 java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _description;

	/**
	"evaluation facility"@en

	"Evaluation Facility that performed and issued given Certification"@en
	*/
	@JsonAlias({"ids:evaluationFacility", "evaluationFacility"})
	 EvaluationFacility _evaluationFacility;

	/**
	"last valid date"@en

	"Last date (as xsd:dateTimeStamp) the given Certification is considered valid."@en
	*/
	@JsonAlias({"ids:lastValidDate", "lastValidDate"})
	 XMLGregorianCalendar _lastValidDate;

	/**
	"membership end"@en

	"End of the participant\'s IDS membership."@en
	*/
	@JsonAlias({"ids:membershipEnd", "membershipEnd"})
	 XMLGregorianCalendar _membershipEnd;

	/**
	"title"@en

	"(Localized) name of the entity."@en
	*/
	@JsonAlias({"ids:title", "title"})
	 java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _title;

	/**
	"version"@en

	"Version identifier of the Managed Entity"@en
	*/
	@JsonAlias({"ids:version", "version"})
	 String _version;

	// no manual construction
	ParticipantCertificationImpl() {
		id = VocabUtil.getInstance().createRandomUrl("participantCertification");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	public java.util.List<TypedLiteral> getLabel() {
		return this.label;
	}

	public java.util.List<TypedLiteral> getComment() {
		return this.comment;
	}

	// getter and setter for generic property map
	@JsonAnyGetter
	public java.util.Map<String,Object> getProperties() {
		if (this.properties == null) return null;
		Iterator<String> iter = this.properties.keySet().iterator();
		java.util.Map<String,Object> resultset = new HashMap<String, Object>();
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
		} else if (value instanceof java.util.Map) {
			java.util.Map<String, Object> result_map = new HashMap<String, Object>();
			((java.util.Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	@JsonAnySetter
	public void setProperty(String property, Object value) {
	if (this.properties == null) this.properties = new java.util.HashMap<String,Object>();
	if (property.startsWith("@")) {return ;};
	this.properties.put(property, value) ;
	}
	// accessor method implementations as derived from information model

	final public 
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	
	@JsonProperty("ids:membershipEnd")
	XMLGregorianCalendar getMembershipEnd() {
		return _membershipEnd;
	}
	final public void setMembershipEnd (XMLGregorianCalendar _membershipEnd_) {
		this._membershipEnd = _membershipEnd_;
	}

	final public 
	
	
	@JsonProperty("ids:certificationLevel")
	CertificationLevel getCertificationLevel() {
		return _certificationLevel;
	}
	final public void setCertificationLevel (CertificationLevel _certificationLevel_) {
		this._certificationLevel = _certificationLevel_;
	}

	final public 
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	
	@JsonProperty("ids:lastValidDate")
	XMLGregorianCalendar getLastValidDate() {
		return _lastValidDate;
	}
	final public void setLastValidDate (XMLGregorianCalendar _lastValidDate_) {
		this._lastValidDate = _lastValidDate_;
	}

	final public 
	
	
	@JsonProperty("ids:evaluationFacility")
	EvaluationFacility getEvaluationFacility() {
		return _evaluationFacility;
	}
	final public void setEvaluationFacility (EvaluationFacility _evaluationFacility_) {
		this._evaluationFacility = _evaluationFacility_;
	}

	final public 
	
	
	@JsonProperty("ids:version")
	String getVersion() {
		return _version;
	}
	final public void setVersion (String _version_) {
		this._version = _version_;
	}

	final public 
	
	
	@JsonProperty("ids:title")
	java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> getTitle() {
		return _title;
	}
	final public void setTitle (java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _title_) {
		this._title = _title_;
	}

	final public 
	
	
	@JsonProperty("ids:description")
	java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> getDescription() {
		return _description;
	}
	final public void setDescription (java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _description_) {
		this._description = _description_;
	}

}
