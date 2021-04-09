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
* "HTTP Authentication"@en
* "HTTP authentication."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:HTTPAuthentication")
public class HTTPAuthenticationImpl implements Serializable, HTTPAuthentication {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("HTTP Authentication", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("HTTP authentication.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDSA Information Model ontology

	/**
	* "auth password"
	* "Username / ID used for authentication."
	*/
	@JsonAlias({"ids:authPassword", "authPassword"})
	protected String _authPassword;


	/**
	* "auth username"@en
	* "Username / ID used for authentication."@en
	*/
	@JsonAlias({"ids:authUsername", "authUsername"})
	protected String _authUsername;


	/**
	* "http auth URI"@en
	* "HTTP authentication URI."@en
	*/
	@JsonAlias({"ids:httpAuthURI", "httpAuthURI"})
	protected URI _httpAuthURI;


	// no manual construction
	protected HTTPAuthenticationImpl() {
		id = VocabUtil.getInstance().createRandomUrl("hTTPAuthentication");
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
	* "HTTP authentication URI."@en
	* @return Returns the URI for the property httpAuthURI.
	* More information under https://w3id.org/idsa/core/httpAuthURI
	*/
	@JsonProperty("ids:httpAuthURI")
	final public URI getHttpAuthURI() {
		return _httpAuthURI;
	}

	
	/**
	* "HTTP authentication URI."@en
	* @param _httpAuthURI_ desired value for the property httpAuthURI.
	* More information under https://w3id.org/idsa/core/httpAuthURI
	*/
	final public void setHttpAuthURI (URI _httpAuthURI_) {
		this._httpAuthURI = _httpAuthURI_;
	}

	/**
	* "Username / ID used for authentication."
	* @return Returns the String for the property authPassword.
	* More information under https://w3id.org/idsa/core/authPassword
	*/
	@JsonProperty("ids:authPassword")
	final public String getAuthPassword() {
		return _authPassword;
	}

	
	/**
	* "Username / ID used for authentication."
	* @param _authPassword_ desired value for the property authPassword.
	* More information under https://w3id.org/idsa/core/authPassword
	*/
	final public void setAuthPassword (String _authPassword_) {
		this._authPassword = _authPassword_;
	}

	/**
	* "Username / ID used for authentication."@en
	* @return Returns the String for the property authUsername.
	* More information under https://w3id.org/idsa/core/authUsername
	*/
	@JsonProperty("ids:authUsername")
	final public String getAuthUsername() {
		return _authUsername;
	}

	
	/**
	* "Username / ID used for authentication."@en
	* @param _authUsername_ desired value for the property authUsername.
	* More information under https://w3id.org/idsa/core/authUsername
	*/
	final public void setAuthUsername (String _authUsername_) {
		this._authUsername = _authUsername_;
	}
}
