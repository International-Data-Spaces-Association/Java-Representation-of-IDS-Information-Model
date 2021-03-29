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
	"Agent"@en

	"Internal or external Agent interacting with the Industrial Data Space, not necessarily an IDS Participant."@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:Agent")
public class AgentImpl implements Serializable, Agent {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Agent", "en"));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Internal or external Agent interacting with the Industrial Data Space, not necessarily an IDS Participant.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

	/**
	"description"@en

	"Explanation of the resource in a natural language text."@en
	*/
	@JsonAlias({"ids:description", "description"})
	 java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _description;

	/**
	"title"@en

	"(Localized) name of the entity."@en
	*/
	@JsonAlias({"ids:title", "title"})
	 java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _title;

	// no manual construction
	AgentImpl() {
		id = VocabUtil.getInstance().createRandomUrl("agent");
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
