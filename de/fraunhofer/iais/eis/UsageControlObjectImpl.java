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

	"A data element containing all relevant information for usage control engines."@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:UsageControlObject")
public class UsageControlObjectImpl implements Serializable, UsageControlObject {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Usage Control Object", "en"));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("A data element containing all relevant information for usage control engines.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

	/**
	"last accessed"@en

	"Last read or write access."@en
	*/
	@JsonAlias({"ids:accessed", "accessed"})
	 XMLGregorianCalendar _accessed;

	/**
	"action"@en

	"The operation relating to the asset /  data object. "@en
	*/
	@JsonAlias({"ids:action", "action"})
	 java.util.ArrayList<? extends Action> _action;

	/**
	"has contract"@en

	"The target contract defining the usage of the data object."@en
	*/
	@NotEmpty@JsonAlias({"ids:contract", "contract"})
	 java.util.ArrayList<? extends ContractAgreement> _contract;

	/**
	"created"@en

	"The date of the creation of the Digital Content. In contrast to the ids:temporalCoverage, creation dates of ids:Representation, ids:Artifacts or any other form of meta-data, this property describes the creation date of referenced Digital Content itself."@en
	*/
	@NotNull@JsonAlias({"ids:created", "created"})
	 XMLGregorianCalendar _created;

	/**
	"has data"@en

	"The related data or a pointer/reference to it."@en
	*/
	@NotNull@JsonAlias({"ids:data", "data"})
	 URI _data;

	/**
	"has state"@en

	"The list of combined current states of the data object."@en
	*/
	@JsonAlias({"ids:hasState", "hasState"})
	 java.util.ArrayList<? extends ArtifactState> _hasState;

	/**
	"modified"@en

	"The date/time this Digital Content has been changed the last time. Only one \'modified\' attribute is usually needed."@en
	*/
	@JsonAlias({"ids:modified", "modified"})
	 XMLGregorianCalendar _modified;

	/**
	"requesting application"@en

	"\tThe target application requesting the usage. Should be some locally unique identifiers, preferably URIs."@en
	*/
	@JsonAlias({"ids:requester", "requester"})
	 URI _requester;

	/**
	"source"@en

	"The application which provided the data object. Should be a valid URI. Must be unique in the regarded environment."@en
	*/
	@JsonAlias({"ids:source", "source"})
	 URI _source;

	/**
	"usage duration"@en

	"Duration, which this asset is in use by now. Might be calculated on the fly when requested by a Usage Control Engine."@en
	*/
	@JsonAlias({"ids:usageDuration", "usageDuration"})
	 javax.xml.datatype.Duration _usageDuration;

	/**
	"has user"@en

	"The participant intending to use the data."@en
	*/
	@JsonAlias({"ids:user", "user"})
	 Participant _user;

	// no manual construction
	UsageControlObjectImpl() {
		id = VocabUtil.getInstance().createRandomUrl("usageControlObject");
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
	
	@NotNull
	@JsonProperty("ids:data")
	URI getData() {
		return _data;
	}
	final public void setData (URI _data_) {
		this._data = _data_;
	}

	final public 
	
	@NotEmpty
	@JsonProperty("ids:contract")
	java.util.ArrayList<? extends ContractAgreement> getContract() {
		return _contract;
	}
	final public void setContract (java.util.ArrayList<? extends ContractAgreement> _contract_) {
		this._contract = _contract_;
	}

	final public 
	
	
	@JsonProperty("ids:hasState")
	java.util.ArrayList<? extends ArtifactState> getHasState() {
		return _hasState;
	}
	final public void setHasState (java.util.ArrayList<? extends ArtifactState> _hasState_) {
		this._hasState = _hasState_;
	}

	final public 
	
	
	@JsonProperty("ids:user")
	Participant getUser() {
		return _user;
	}
	final public void setUser (Participant _user_) {
		this._user = _user_;
	}

	final public 
	
	
	@JsonProperty("ids:source")
	URI getSource() {
		return _source;
	}
	final public void setSource (URI _source_) {
		this._source = _source_;
	}

	final public 
	
	
	@JsonProperty("ids:usageDuration")
	javax.xml.datatype.Duration getUsageDuration() {
		return _usageDuration;
	}
	final public void setUsageDuration (javax.xml.datatype.Duration _usageDuration_) {
		this._usageDuration = _usageDuration_;
	}

	final public 
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	
	@JsonProperty("ids:accessed")
	XMLGregorianCalendar getAccessed() {
		return _accessed;
	}
	final public void setAccessed (XMLGregorianCalendar _accessed_) {
		this._accessed = _accessed_;
	}

	final public 
	
	
	@JsonProperty("ids:requester")
	URI getRequester() {
		return _requester;
	}
	final public void setRequester (URI _requester_) {
		this._requester = _requester_;
	}

	final public 
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@NotNull
	@JsonProperty("ids:created")
	XMLGregorianCalendar getCreated() {
		return _created;
	}
	final public void setCreated (XMLGregorianCalendar _created_) {
		this._created = _created_;
	}

	final public 
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	
	@JsonProperty("ids:modified")
	XMLGregorianCalendar getModified() {
		return _modified;
	}
	final public void setModified (XMLGregorianCalendar _modified_) {
		this._modified = _modified_;
	}

	final public 
	
	
	@JsonProperty("ids:action")
	java.util.ArrayList<? extends Action> getAction() {
		return _action;
	}
	final public void setAction (java.util.ArrayList<? extends Action> _action_) {
		this._action = _action_;
	}
}
