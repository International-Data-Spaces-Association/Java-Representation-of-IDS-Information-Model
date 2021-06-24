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
* "DataApp Endpoint"@en
* "Description of endpoints a DataApp offers."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:AppEndpoint")
public class AppEndpointImpl implements AppEndpoint {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("DataApp Endpoint", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Description of endpoints a DataApp offers.", "en"));

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
	* "app endpoint media type"@en
	* "Mediatype, such as IANA types, of the data an endpoint expects or returns ."@en
	*/
	@JsonAlias({"ids:appEndpointMediaType", "appEndpointMediaType"})
	protected MediaType _appEndpointMediaType;


	/**
	* "app endpoint port"@en
	* "Port used to access the endpoint."@en
	*/
	@JsonAlias({"ids:appEndpointPort", "appEndpointPort"})
	protected BigInteger _appEndpointPort;


	/**
	* "app endpoint protocol"@en
	* "Protocol used to communicate with the app endpoint."@en
	*/
	@JsonAlias({"ids:appEndpointProtocol", "appEndpointProtocol"})
	protected String _appEndpointProtocol;


	/**
	* "App endpoint type"@en
	* "Type of an app endpoint. Data apps have different endpoint types, e.g., for input, output or health status."@en
	*/
	@NotNull
	@JsonAlias({"ids:appEndpointType", "appEndpointType"})
	protected AppEndpointType _appEndpointType;


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
	* "inbound topic"@en
	* "Relative path used for inbound communication via this endpoint, i.e., input messages and faults only."@en
	*/
	@JsonAlias({"ids:inboundPath", "inboundPath"})
	protected String _inboundPath;


	/**
	* "language"@en
	* "Natural language(s) used within the content."@en
	*/
	@JsonAlias({"ids:language", "language"})
	protected Language _language;


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
	protected AppEndpointImpl() {
		id = VocabUtil.getInstance().createRandomUrl("appEndpoint");
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
		return Objects.hash(new Object[]{this._appEndpointType,
			this._appEndpointPort,
			this._appEndpointMediaType,
			this._appEndpointProtocol,
			this._language,
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
			AppEndpointImpl other = (AppEndpointImpl) obj;
			return Objects.equals(this._appEndpointType, other._appEndpointType) &&
				Objects.equals(this._appEndpointPort, other._appEndpointPort) &&
				Objects.equals(this._appEndpointMediaType, other._appEndpointMediaType) &&
				Objects.equals(this._appEndpointProtocol, other._appEndpointProtocol) &&
				Objects.equals(this._language, other._language) &&
				Objects.equals(this._accessURL, other._accessURL) &&
				Objects.equals(this._endpointInformation, other._endpointInformation) &&
				Objects.equals(this._endpointDocumentation, other._endpointDocumentation) &&
				Objects.equals(this._path, other._path) &&
				Objects.equals(this._inboundPath, other._inboundPath) &&
				Objects.equals(this._outboundPath, other._outboundPath);
		}
	}


	// accessor method implementations as derived from the IDS Information Model ontology


	@NotNull
	@JsonProperty("ids:appEndpointType")
	final public AppEndpointType getAppEndpointType() {
		return _appEndpointType;
	}
	
	final public void setAppEndpointType (AppEndpointType _appEndpointType_) {
		this._appEndpointType = _appEndpointType_;
	}

	@JsonProperty("ids:appEndpointPort")
	final public BigInteger getAppEndpointPort() {
		return _appEndpointPort;
	}
	
	final public void setAppEndpointPort (BigInteger _appEndpointPort_) {
		this._appEndpointPort = _appEndpointPort_;
	}

	@JsonProperty("ids:appEndpointMediaType")
	final public MediaType getAppEndpointMediaType() {
		return _appEndpointMediaType;
	}
	
	final public void setAppEndpointMediaType (MediaType _appEndpointMediaType_) {
		this._appEndpointMediaType = _appEndpointMediaType_;
	}

	@JsonProperty("ids:appEndpointProtocol")
	final public String getAppEndpointProtocol() {
		return _appEndpointProtocol;
	}
	
	final public void setAppEndpointProtocol (String _appEndpointProtocol_) {
		this._appEndpointProtocol = _appEndpointProtocol_;
	}

	@JsonProperty("ids:language")
	final public Language getLanguage() {
		return _language;
	}
	
	final public void setLanguage (Language _language_) {
		this._language = _language_;
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
