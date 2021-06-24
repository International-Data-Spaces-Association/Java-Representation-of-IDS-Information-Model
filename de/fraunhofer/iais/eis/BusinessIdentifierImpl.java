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
* "Business Identifier"@en
* "A business identifier is a identification number used to identify a company. E.g., the Data Universal Numbering System, abbreviated as DUNS"@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:BusinessIdentifier")
public class BusinessIdentifierImpl implements BusinessIdentifier {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Business Identifier", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("A business identifier is a identification number used to identify a company. E.g., the Data Universal Numbering System, abbreviated as DUNS", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDS Information Model ontology

	/**
	* "identifier number"@en
	* "This property is used to define the value used as an business identifier."@en
	*/
	@NotNull
	@JsonAlias({"ids:identifierNumber", "identifierNumber"})
	protected String _identifierNumber;


	/**
	* "identifier system"@en
	* "This property is used to define the system used as an business identifier. E.g., DUNS or SIRET."@en
	*/
	@NotNull
	@JsonAlias({"ids:identifierSystem", "identifierSystem"})
	protected String _identifierSystem;


	// no manual construction
	protected BusinessIdentifierImpl() {
		id = VocabUtil.getInstance().createRandomUrl("businessIdentifier");
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
		return Objects.hash(new Object[]{this._identifierSystem,
			this._identifierNumber});
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
			BusinessIdentifierImpl other = (BusinessIdentifierImpl) obj;
			return Objects.equals(this._identifierSystem, other._identifierSystem) &&
				Objects.equals(this._identifierNumber, other._identifierNumber);
		}
	}


	// accessor method implementations as derived from the IDS Information Model ontology


	@NotNull
	@JsonProperty("ids:identifierSystem")
	final public String getIdentifierSystem() {
		return _identifierSystem;
	}
	
	final public void setIdentifierSystem (String _identifierSystem_) {
		this._identifierSystem = _identifierSystem_;
	}

	@NotNull
	@JsonProperty("ids:identifierNumber")
	final public String getIdentifierNumber() {
		return _identifierNumber;
	}
	
	final public void setIdentifierNumber (String _identifierNumber_) {
		this._identifierNumber = _identifierNumber_;
	}
}
