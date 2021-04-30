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
* "AuthInfo"@en
* "Holds authentication information so that connections to the Connector\'s data offerings can be establised."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:AuthInfo")
public class AuthInfoImpl implements AuthInfo {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("AuthInfo", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Holds authentication information so that connections to the Connector's data offerings can be establised.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDSA Information Model ontology

	/**
	* "authService"@en
	* "The URL of the authentication service that is provided by the Connector."@en
	*/
	@NotNull
	@JsonAlias({"ids:authService", "authService"})
	protected URI _authService;


	/**
	* "authStandard"@en
	* "The standard used by the authentication service that is provided by the Connector."@en
	*/
	@JsonAlias({"ids:authStandard", "authStandard"})
	protected AuthStandard _authStandard;


	// no manual construction
	protected AuthInfoImpl() {
		id = VocabUtil.getInstance().createRandomUrl("authInfo");
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
		return Objects.hash(new Object[]{this._authService,
			this._authStandard});
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
			AuthInfoImpl other = (AuthInfoImpl) obj;
			return Objects.equals(this._authService, other._authService) &&
				Objects.equals(this._authStandard, other._authStandard);
		}
	}


	// accessor method implementations as derived from the IDSA Information Model ontology


	@NotNull
	@JsonProperty("ids:authService")
	final public URI getAuthService() {
		return _authService;
	}
	
	final public void setAuthService (URI _authService_) {
		this._authService = _authService_;
	}

	@JsonProperty("ids:authStandard")
	final public AuthStandard getAuthStandard() {
		return _authStandard;
	}
	
	final public void setAuthStandard (AuthStandard _authStandard_) {
		this._authStandard = _authStandard_;
	}
}
