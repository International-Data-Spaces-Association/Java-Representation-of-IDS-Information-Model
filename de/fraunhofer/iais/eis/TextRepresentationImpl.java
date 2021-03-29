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
	"Text representation"@en

	"Representation of a textual content."@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:TextRepresentation")
public class TextRepresentationImpl implements Serializable, TextRepresentation {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Text representation", "en"));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Representation of a textual content.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

	/**
	"created"@en

	"The date of the creation of the Digital Content. In contrast to the ids:temporalCoverage, creation dates of ids:Representation, ids:Artifacts or any other form of meta-data, this property describes the creation date of referenced Digital Content itself."@en
	*/
	@JsonAlias({"ids:created", "created"})
	 XMLGregorianCalendar _created;

	/**
	"instance"@en

	"Reference to an instance of given representation, i.e. inline value or file placeholder."@en
	*/
	@JsonAlias({"ids:instance", "instance"})
	 java.util.ArrayList<? extends RepresentationInstance> _instance;

	/**
	"language"@en

	"Natural language(s) used within the content."@en
	*/
	@JsonAlias({"ids:language", "language"})
	 Language _language;

	/**
	"media type"@en

	"Media Type of the Representation."@en
	*/
	@JsonAlias({"ids:mediaType", "mediaType"})
	 MediaType _mediaType;

	/**
	"modified"@en

	"The date/time this Digital Content has been changed the last time. Only one \'modified\' attribute is usually needed."@en
	*/
	@JsonAlias({"ids:modified", "modified"})
	 XMLGregorianCalendar _modified;

	/**
	"representation standard"@en

	"Standards document defining the given Representation (in contrast to general Resource content). The Representation is assumed to conform to that Standard."@en
	*/
	@JsonAlias({"ids:representationStandard", "representationStandard"})
	 URI _representationStandard;

	/**
	"shapeGraph"@en

	"Reference to SHACL shape graph, which describes domain-specific knowledge."@en
	*/
	@JsonAlias({"ids:shapesGraph", "shapesGraph"})
	 URI _shapesGraph;

	// no manual construction
	TextRepresentationImpl() {
		id = VocabUtil.getInstance().createRandomUrl("textRepresentation");
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
	
	
	@JsonProperty("ids:instance")
	java.util.ArrayList<? extends RepresentationInstance> getInstance() {
		return _instance;
	}
	final public void setInstance (java.util.ArrayList<? extends RepresentationInstance> _instance_) {
		this._instance = _instance_;
	}

	final public 
	
	
	@JsonProperty("ids:mediaType")
	MediaType getMediaType() {
		return _mediaType;
	}
	final public void setMediaType (MediaType _mediaType_) {
		this._mediaType = _mediaType_;
	}

	final public 
	
	
	@JsonProperty("ids:representationStandard")
	URI getRepresentationStandard() {
		return _representationStandard;
	}
	final public void setRepresentationStandard (URI _representationStandard_) {
		this._representationStandard = _representationStandard_;
	}

	final public 
	
	
	@JsonProperty("ids:language")
	Language getLanguage() {
		return _language;
	}
	final public void setLanguage (Language _language_) {
		this._language = _language_;
	}

	final public 
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	
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
	
	
	@JsonProperty("ids:shapesGraph")
	URI getShapesGraph() {
		return _shapesGraph;
	}
	final public void setShapesGraph (URI _shapesGraph_) {
		this._shapesGraph = _shapesGraph_;
	}

}
