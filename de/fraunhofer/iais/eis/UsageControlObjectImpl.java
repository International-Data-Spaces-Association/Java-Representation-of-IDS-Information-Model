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
* "Usage Control Object"@en
* "A data element containing all relevant information for usage control engines."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:UsageControlObject")
public class UsageControlObjectImpl implements UsageControlObject {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Usage Control Object", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("A data element containing all relevant information for usage control engines.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDSA Information Model ontology

	/**
	* "last accessed"@en
	* "Last read or write access."@en
	*/
	@JsonAlias({"ids:accessed", "accessed"})
	protected XMLGregorianCalendar _accessed;


	/**
	* "action"@en
	* "The operation relating to the asset /  data object. "@en
	*/
	@JsonAlias({"ids:action", "action"})
	protected List<Action> _action;


	/**
	* "has contract"@en
	* "The target contract defining the usage of the data object."@en
	*/
	@NotEmpty
	@JsonAlias({"ids:contract", "contract"})
	protected List<ContractAgreement> _contract;


	/**
	* "created"@en
	* "The date of the creation of the Digital Content. In contrast to the ids:temporalCoverage, creation dates of ids:Representation, ids:Artifacts or any other form of meta-data, this property describes the creation date of referenced Digital Content itself."@en
	*/
	@NotNull
	@JsonAlias({"ids:created", "created"})
	protected XMLGregorianCalendar _created;


	/**
	* "has data"@en
	* "The related data or a pointer/reference to it."@en
	*/
	@NotNull
	@JsonAlias({"ids:data", "data"})
	protected URI _data;


	/**
	* "has state"@en
	* "The list of combined current states of the data object."@en
	*/
	@JsonAlias({"ids:hasState", "hasState"})
	protected List<ArtifactState> _hasState;


	/**
	* "modified"@en
	* "The date/time this Digital Content has been changed the last time. Only one \'modified\' attribute is usually needed."@en
	*/
	@JsonAlias({"ids:modified", "modified"})
	protected XMLGregorianCalendar _modified;


	/**
	* "requesting application"@en
	* "\tThe target application requesting the usage. Should be some locally unique identifiers, preferably URIs."@en
	*/
	@JsonAlias({"ids:requester", "requester"})
	protected URI _requester;


	/**
	* "source"@en
	* "The application which provided the data object. Should be a valid URI. Must be unique in the regarded environment."@en
	*/
	@JsonAlias({"ids:source", "source"})
	protected URI _source;


	/**
	* "usage duration"@en
	* "Duration, which this asset is in use by now. Might be calculated on the fly when requested by a Usage Control Engine."@en
	*/
	@JsonAlias({"ids:usageDuration", "usageDuration"})
	protected javax.xml.datatype.Duration _usageDuration;


	/**
	* "has user"@en
	* "The participant intending to use the data."@en
	*/
	@JsonAlias({"ids:user", "user"})
	protected Participant _user;


	// no manual construction
	protected UsageControlObjectImpl() {
		id = VocabUtil.getInstance().createRandomUrl("usageControlObject");
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
		return Objects.hash(new Object[]{this._data,
			this._user,
			this._source,
			this._contract,
			this._usageDuration,
			this._accessed,
			this._hasState,
			this._requester,
			this._created,
			this._modified,
			this._action});
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
			UsageControlObjectImpl other = (UsageControlObjectImpl) obj;
			return Objects.equals(this._data, other._data) &&
				Objects.equals(this._user, other._user) &&
				Objects.equals(this._source, other._source) &&
				Objects.equals(this._contract, other._contract) &&
				Objects.equals(this._usageDuration, other._usageDuration) &&
				Objects.equals(this._accessed, other._accessed) &&
				Objects.equals(this._hasState, other._hasState) &&
				Objects.equals(this._requester, other._requester) &&
				Objects.equals(this._created, other._created) &&
				Objects.equals(this._modified, other._modified) &&
				Objects.equals(this._action, other._action);
		}
	}


	// accessor method implementations as derived from the IDSA Information Model ontology


	@NotNull
	@JsonProperty("ids:data")
	final public URI getData() {
		return _data;
	}
	
	final public void setData (URI _data_) {
		this._data = _data_;
	}

	@JsonProperty("ids:user")
	final public Participant getUser() {
		return _user;
	}
	
	final public void setUser (Participant _user_) {
		this._user = _user_;
	}

	@JsonProperty("ids:source")
	final public URI getSource() {
		return _source;
	}
	
	final public void setSource (URI _source_) {
		this._source = _source_;
	}

	@NotEmpty
	@JsonProperty("ids:contract")
	final public List<ContractAgreement> getContract() {
		return _contract;
	}
	
	final public void setContract (List<ContractAgreement> _contract_) {
		this._contract = _contract_;
	}

	@JsonProperty("ids:usageDuration")
	final public javax.xml.datatype.Duration getUsageDuration() {
		return _usageDuration;
	}
	
	final public void setUsageDuration (javax.xml.datatype.Duration _usageDuration_) {
		this._usageDuration = _usageDuration_;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@JsonProperty("ids:accessed")
	final public XMLGregorianCalendar getAccessed() {
		return _accessed;
	}
	
	final public void setAccessed (XMLGregorianCalendar _accessed_) {
		this._accessed = _accessed_;
	}

	@JsonProperty("ids:hasState")
	final public List<ArtifactState> getHasState() {
		return _hasState;
	}
	
	final public void setHasState (List<ArtifactState> _hasState_) {
		this._hasState = _hasState_;
	}

	@JsonProperty("ids:requester")
	final public URI getRequester() {
		return _requester;
	}
	
	final public void setRequester (URI _requester_) {
		this._requester = _requester_;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@NotNull
	@JsonProperty("ids:created")
	final public XMLGregorianCalendar getCreated() {
		return _created;
	}
	
	final public void setCreated (XMLGregorianCalendar _created_) {
		this._created = _created_;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@JsonProperty("ids:modified")
	final public XMLGregorianCalendar getModified() {
		return _modified;
	}
	
	final public void setModified (XMLGregorianCalendar _modified_) {
		this._modified = _modified_;
	}

	@JsonProperty("ids:action")
	final public List<Action> getAction() {
		return _action;
	}
	
	final public void setAction (List<Action> _action_) {
		this._action = _action_;
	}
}
