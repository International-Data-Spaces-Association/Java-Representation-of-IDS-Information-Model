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
* "Generic Endpoint"@en
* "Generic endpoints describe non-IDS-specific endpoints, e.g., to integrate external services."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:GenericEndpoint")
public class GenericEndpointImpl implements GenericEndpoint {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Generic Endpoint", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Generic endpoints describe non-IDS-specific endpoints, e.g., to integrate external services.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDS Information Model ontology

	/**
	* "access URL"@en
	* "Access URL of an endpoint."@en
	*/
	@JsonAlias({"ids:accessURL", "accessURL"})
	protected URI _accessURL;


	/**
	* "endpoint documentation"@en
	* "IRI reference to a documentation of the endpoint, e.g., reference to an OpenAPI-based documentation."@en
	*/
	@JsonAlias({"ids:endpointDocumentation", "endpointDocumentation"})
	protected List<URI> _endpointDocumentation;


	/**
	* "endpoint information"@en
	* "Human-readable information and description of the endpoint."@en
	*/
	@JsonAlias({"ids:endpointInformation", "endpointInformation"})
	protected List<TypedLiteral> _endpointInformation;


	/**
	* "generic endpoint authentication"@en
	* "Authentication credentials for generic endpoints. "@en
	*/
	@JsonAlias({"ids:genericEndpointAuthentication", "genericEndpointAuthentication"})
	protected BasicAuthentication _genericEndpointAuthentication;


	/**
	* "generic endpoint configuration"@en
	* "Endpoint-specific configuration details (e.g., contents of a config file) used for the endpoint."@en
	*/
	@JsonAlias({"ids:genericEndpointConfiguration", "genericEndpointConfiguration"})
	protected String _genericEndpointConfiguration;


	/**
	* "inbound topic"@en
	* "Relative path used for inbound communication via this endpoint, i.e., input messages and faults only."@en
	*/
	@JsonAlias({"ids:inboundPath", "inboundPath"})
	protected String _inboundPath;


	/**
	* "outbound topic"@en
	* "Relative path used for outbound communication via this endpoint, i.e., output messages and faults only."@en
	*/
	@JsonAlias({"ids:outboundPath", "outboundPath"})
	protected String _outboundPath;


	/**
	* "path"@en
	* "Relative path, topic or queue at which the content is published by the related host."@en
	*/
	@JsonAlias({"ids:path", "path"})
	protected String _path;


	// no manual construction
	protected GenericEndpointImpl() {
		id = VocabUtil.getInstance().createRandomUrl("genericEndpoint");
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
		return Objects.hash(new Object[]{this._genericEndpointAuthentication,
			this._genericEndpointConfiguration,
			this._accessURL,
			this._endpointInformation,
			this._endpointDocumentation,
			this._path,
			this._inboundPath,
			this._outboundPath});
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
			GenericEndpointImpl other = (GenericEndpointImpl) obj;
			return Objects.equals(this._genericEndpointAuthentication, other._genericEndpointAuthentication) &&
				Objects.equals(this._genericEndpointConfiguration, other._genericEndpointConfiguration) &&
				Objects.equals(this._accessURL, other._accessURL) &&
				Objects.equals(this._endpointInformation, other._endpointInformation) &&
				Objects.equals(this._endpointDocumentation, other._endpointDocumentation) &&
				Objects.equals(this._path, other._path) &&
				Objects.equals(this._inboundPath, other._inboundPath) &&
				Objects.equals(this._outboundPath, other._outboundPath);
		}
	}


	// accessor method implementations as derived from the IDS Information Model ontology


	@JsonProperty("ids:genericEndpointAuthentication")
	final public BasicAuthentication getGenericEndpointAuthentication() {
		return _genericEndpointAuthentication;
	}
	
	final public void setGenericEndpointAuthentication (BasicAuthentication _genericEndpointAuthentication_) {
		this._genericEndpointAuthentication = _genericEndpointAuthentication_;
	}

	@JsonProperty("ids:genericEndpointConfiguration")
	final public String getGenericEndpointConfiguration() {
		return _genericEndpointConfiguration;
	}
	
	final public void setGenericEndpointConfiguration (String _genericEndpointConfiguration_) {
		this._genericEndpointConfiguration = _genericEndpointConfiguration_;
	}

	@JsonProperty("ids:accessURL")
	final public URI getAccessURL() {
		return _accessURL;
	}
	
	final public void setAccessURL (URI _accessURL_) {
		this._accessURL = _accessURL_;
	}

	@JsonProperty("ids:endpointInformation")
	final public List<TypedLiteral> getEndpointInformation() {
		return _endpointInformation;
	}
	
	final public void setEndpointInformation (List<TypedLiteral> _endpointInformation_) {
		this._endpointInformation = _endpointInformation_;
	}

	@JsonProperty("ids:endpointDocumentation")
	final public List<URI> getEndpointDocumentation() {
		return _endpointDocumentation;
	}
	
	final public void setEndpointDocumentation (List<URI> _endpointDocumentation_) {
		this._endpointDocumentation = _endpointDocumentation_;
	}

	@JsonProperty("ids:path")
	final public String getPath() {
		return _path;
	}
	
	final public void setPath (String _path_) {
		this._path = _path_;
	}

	@JsonProperty("ids:inboundPath")
	final public String getInboundPath() {
		return _inboundPath;
	}
	
	final public void setInboundPath (String _inboundPath_) {
		this._inboundPath = _inboundPath_;
	}

	@JsonProperty("ids:outboundPath")
	final public String getOutboundPath() {
		return _outboundPath;
	}
	
	final public void setOutboundPath (String _outboundPath_) {
		this._outboundPath = _outboundPath_;
	}
}
