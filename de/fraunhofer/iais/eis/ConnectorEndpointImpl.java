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
* "Connector Endpoint"@en
* "Connector-specific endpoint exposing Artifacts."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:ConnectorEndpoint")
public class ConnectorEndpointImpl implements Serializable, ConnectorEndpoint {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Connector Endpoint", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Connector-specific endpoint exposing Artifacts.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDSA Information Model ontology

	/**
	* "access URL"@en
	* "Access URL of an endpoint."@en
	*/
	@NotNull
	@JsonAlias({"ids:accessURL", "accessURL"})
	protected URI _accessURL;


	/**
	* "endpoint artifact"@en
	* "Content instance mediated via this individual endpoint (1:1 mapping)."@en
	*/
	@JsonAlias({"ids:endpointArtifact", "endpointArtifact"})
	protected Artifact _endpointArtifact;


	/**
	* "endpoint documentation"@en
	* "IRI reference to a documentation of the endpoint, e.g., reference to an OpenAPI-based documentation."@en
	*/
	@JsonAlias({"ids:endpointDocumentation", "endpointDocumentation"})
	protected ArrayList<? extends URI> _endpointDocumentation;


	/**
	* "endpoint information"@en
	* "Human-readable information and description of the endpoint."@en
	*/
	@JsonAlias({"ids:endpointInformation", "endpointInformation"})
	protected ArrayList<? extends TypedLiteral> _endpointInformation;


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
	protected ConnectorEndpointImpl() {
		id = VocabUtil.getInstance().createRandomUrl("connectorEndpoint");
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
	* "Content instance mediated via this individual endpoint (1:1 mapping)."@en
	* @return Returns the Artifact for the property endpointArtifact.
	* More information under https://w3id.org/idsa/core/endpointArtifact
	*/
	@JsonProperty("ids:endpointArtifact")
	final public Artifact getEndpointArtifact() {
		return _endpointArtifact;
	}

	
	/**
	* "Content instance mediated via this individual endpoint (1:1 mapping)."@en
	* @param _endpointArtifact_ desired value for the property endpointArtifact.
	* More information under https://w3id.org/idsa/core/endpointArtifact
	*/
	final public void setEndpointArtifact (Artifact _endpointArtifact_) {
		this._endpointArtifact = _endpointArtifact_;
	}

	/**
	* "Human-readable information and description of the endpoint."@en
	* @return Returns the ArrayList of TypedLiteral for the property endpointInformation.
	* More information under https://w3id.org/idsa/core/endpointInformation
	*/
	@JsonProperty("ids:endpointInformation")
	final public ArrayList<? extends TypedLiteral> getEndpointInformation() {
		return _endpointInformation;
	}

	
	/**
	* "Human-readable information and description of the endpoint."@en
	* @param _endpointInformation_ desired value for the property endpointInformation.
	* More information under https://w3id.org/idsa/core/endpointInformation
	*/
	final public void setEndpointInformation (ArrayList<? extends TypedLiteral> _endpointInformation_) {
		this._endpointInformation = _endpointInformation_;
	}

	/**
	* "IRI reference to a documentation of the endpoint, e.g., reference to an OpenAPI-based documentation."@en
	* @return Returns the ArrayList of URI for the property endpointDocumentation.
	* More information under https://w3id.org/idsa/core/endpointDocumentation
	*/
	@JsonProperty("ids:endpointDocumentation")
	final public ArrayList<? extends URI> getEndpointDocumentation() {
		return _endpointDocumentation;
	}

	
	/**
	* "IRI reference to a documentation of the endpoint, e.g., reference to an OpenAPI-based documentation."@en
	* @param _endpointDocumentation_ desired value for the property endpointDocumentation.
	* More information under https://w3id.org/idsa/core/endpointDocumentation
	*/
	final public void setEndpointDocumentation (ArrayList<? extends URI> _endpointDocumentation_) {
		this._endpointDocumentation = _endpointDocumentation_;
	}

	/**
	* "Access URL of an endpoint."@en
	* @return Returns the URI for the property accessURL.
	* More information under https://w3id.org/idsa/core/accessURL
	*/
	@NotNull
	@JsonProperty("ids:accessURL")
	final public URI getAccessURL() {
		return _accessURL;
	}

	
	/**
	* "Access URL of an endpoint."@en
	* @param _accessURL_ desired value for the property accessURL.
	* More information under https://w3id.org/idsa/core/accessURL
	*/
	final public void setAccessURL (URI _accessURL_) {
		this._accessURL = _accessURL_;
	}

	/**
	* "Relative path, topic or queue at which the content is published by the related host."@en
	* @return Returns the String for the property path.
	* More information under https://w3id.org/idsa/core/path
	*/
	@JsonProperty("ids:path")
	final public String getPath() {
		return _path;
	}

	
	/**
	* "Relative path, topic or queue at which the content is published by the related host."@en
	* @param _path_ desired value for the property path.
	* More information under https://w3id.org/idsa/core/path
	*/
	final public void setPath (String _path_) {
		this._path = _path_;
	}

	/**
	* "Relative path used for inbound communication via this endpoint, i.e., input messages and faults only."@en
	* @return Returns the String for the property inboundPath.
	* More information under https://w3id.org/idsa/core/inboundPath
	*/
	@JsonProperty("ids:inboundPath")
	final public String getInboundPath() {
		return _inboundPath;
	}

	
	/**
	* "Relative path used for inbound communication via this endpoint, i.e., input messages and faults only."@en
	* @param _inboundPath_ desired value for the property inboundPath.
	* More information under https://w3id.org/idsa/core/inboundPath
	*/
	final public void setInboundPath (String _inboundPath_) {
		this._inboundPath = _inboundPath_;
	}

	/**
	* "Relative path used for outbound communication via this endpoint, i.e., output messages and faults only."@en
	* @return Returns the String for the property outboundPath.
	* More information under https://w3id.org/idsa/core/outboundPath
	*/
	@JsonProperty("ids:outboundPath")
	final public String getOutboundPath() {
		return _outboundPath;
	}

	
	/**
	* "Relative path used for outbound communication via this endpoint, i.e., output messages and faults only."@en
	* @param _outboundPath_ desired value for the property outboundPath.
	* More information under https://w3id.org/idsa/core/outboundPath
	*/
	final public void setOutboundPath (String _outboundPath_) {
		this._outboundPath = _outboundPath_;
	}
}
