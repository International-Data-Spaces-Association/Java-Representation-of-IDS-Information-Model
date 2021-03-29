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
	"Generic Endpoint"@en

	"Generic endpoints describe non-IDS-specific endpoints, e.g., to integrate external services."@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:GenericEndpoint")
public class GenericEndpointImpl implements Serializable, GenericEndpoint {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Generic Endpoint", "en"));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Generic endpoints describe non-IDS-specific endpoints, e.g., to integrate external services.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

	/**
	"access URL"@en

	"Access URL of an endpoint."@en
	*/
	@JsonAlias({"ids:accessURL", "accessURL"})
	 URI _accessURL;

	/**
	"endpoint documentation"@en

	"IRI reference to a documentation of the endpoint, e.g., reference to an OpenAPI-based documentation."@en
	*/
	@JsonAlias({"ids:endpointDocumentation", "endpointDocumentation"})
	 java.util.ArrayList<? extends URI> _endpointDocumentation;

	/**
	"endpoint information"@en

	"Human-readable information and description of the endpoint."@en
	*/
	@JsonAlias({"ids:endpointInformation", "endpointInformation"})
	 java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _endpointInformation;

	/**
	"generic endpoint authentication"@en

	"Authentication credentials for generic endpoints. "@en
	*/
	@JsonAlias({"ids:genericEndpointAuthentication", "genericEndpointAuthentication"})
	 BasicAuthentication _genericEndpointAuthentication;

	/**
	"generic endpoint configuration"@en

	"Endpoint-specific configuration details (e.g., contents of a config file) used for the endpoint."@en
	*/
	@JsonAlias({"ids:genericEndpointConfiguration", "genericEndpointConfiguration"})
	 String _genericEndpointConfiguration;

	/**
	"inbound topic"@en

	"Relative path used for inbound communication via this endpoint, i.e., input messages and faults only."@en
	*/
	@JsonAlias({"ids:inboundPath", "inboundPath"})
	 String _inboundPath;

	/**
	"outbound topic"@en

	"Relative path used for outbound communication via this endpoint, i.e., output messages and faults only."@en
	*/
	@JsonAlias({"ids:outboundPath", "outboundPath"})
	 String _outboundPath;

	/**
	"path"@en

	"Relative path, topic or queue at which the content is published by the related host."@en
	*/
	@JsonAlias({"ids:path", "path"})
	 String _path;

	// no manual construction
	GenericEndpointImpl() {
		id = VocabUtil.getInstance().createRandomUrl("genericEndpoint");
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
	
	
	@JsonProperty("ids:genericEndpointAuthentication")
	BasicAuthentication getGenericEndpointAuthentication() {
		return _genericEndpointAuthentication;
	}
	final public void setGenericEndpointAuthentication (BasicAuthentication _genericEndpointAuthentication_) {
		this._genericEndpointAuthentication = _genericEndpointAuthentication_;
	}

	final public 
	
	
	@JsonProperty("ids:genericEndpointConfiguration")
	String getGenericEndpointConfiguration() {
		return _genericEndpointConfiguration;
	}
	final public void setGenericEndpointConfiguration (String _genericEndpointConfiguration_) {
		this._genericEndpointConfiguration = _genericEndpointConfiguration_;
	}

	final public 
	
	
	@JsonProperty("ids:endpointInformation")
	java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> getEndpointInformation() {
		return _endpointInformation;
	}
	final public void setEndpointInformation (java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _endpointInformation_) {
		this._endpointInformation = _endpointInformation_;
	}

	final public 
	
	
	@JsonProperty("ids:endpointDocumentation")
	java.util.ArrayList<? extends URI> getEndpointDocumentation() {
		return _endpointDocumentation;
	}
	final public void setEndpointDocumentation (java.util.ArrayList<? extends URI> _endpointDocumentation_) {
		this._endpointDocumentation = _endpointDocumentation_;
	}

	final public 
	
	
	@JsonProperty("ids:accessURL")
	URI getAccessURL() {
		return _accessURL;
	}
	final public void setAccessURL (URI _accessURL_) {
		this._accessURL = _accessURL_;
	}

	final public 
	
	
	@JsonProperty("ids:path")
	String getPath() {
		return _path;
	}
	final public void setPath (String _path_) {
		this._path = _path_;
	}

	final public 
	
	
	@JsonProperty("ids:inboundPath")
	String getInboundPath() {
		return _inboundPath;
	}
	final public void setInboundPath (String _inboundPath_) {
		this._inboundPath = _inboundPath_;
	}

	final public 
	
	
	@JsonProperty("ids:outboundPath")
	String getOutboundPath() {
		return _outboundPath;
	}
	final public void setOutboundPath (String _outboundPath_) {
		this._outboundPath = _outboundPath_;
	}
}
