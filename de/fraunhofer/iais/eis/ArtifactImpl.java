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
	"Artifact"@en

	"Instance of a Representation materialized at a partiuclar version and point in time. Possesses characteristics like file name, size, creation date etc."@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:Artifact")
public class ArtifactImpl implements Serializable, Artifact {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Artifact", "en"));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Instance of a Representation materialized at a partiuclar version and point in time. Possesses characteristics like file name, size, creation date etc.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

	/**
	"byte size"@en

	"Size of the Artifact in bytes."@en
	*/
	@JsonAlias({"ids:byteSize", "byteSize"})
	 BigInteger _byteSize;

	/**
	"checksum"@en

	"Checksum of the artifact"@en
	*/
	@JsonAlias({"ids:checkSum", "checkSum"})
	 String _checkSum;

	/**
	"creation date"@en

	"Date (as xsd:dateTimeStamp) when the artifact was created, i.e. persisted."@en
	*/
	@JsonAlias({"ids:creationDate", "creationDate"})
	 XMLGregorianCalendar _creationDate;

	/**
	"duration"@en

	"Duration of the media resource in seconds."@en
	*/
	@JsonAlias({"ids:duration", "duration"})
	 java.math.BigDecimal _duration;

	/**
	"file name"@en

	"Name of the Artifcat file."@en
	*/
	@JsonAlias({"ids:fileName", "fileName"})
	 String _fileName;

	// no manual construction
	ArtifactImpl() {
		id = VocabUtil.getInstance().createRandomUrl("artifact");
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
	
	
	@JsonProperty("ids:byteSize")
	BigInteger getByteSize() {
		return _byteSize;
	}
	final public void setByteSize (BigInteger _byteSize_) {
		this._byteSize = _byteSize_;
	}

	final public 
	
	
	@JsonProperty("ids:fileName")
	String getFileName() {
		return _fileName;
	}
	final public void setFileName (String _fileName_) {
		this._fileName = _fileName_;
	}

	final public 
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	
	@JsonProperty("ids:creationDate")
	XMLGregorianCalendar getCreationDate() {
		return _creationDate;
	}
	final public void setCreationDate (XMLGregorianCalendar _creationDate_) {
		this._creationDate = _creationDate_;
	}

	final public 
	
	
	@JsonProperty("ids:checkSum")
	String getCheckSum() {
		return _checkSum;
	}
	final public void setCheckSum (String _checkSum_) {
		this._checkSum = _checkSum_;
	}

	final public 
	
	
	@JsonProperty("ids:duration")
	java.math.BigDecimal getDuration() {
		return _duration;
	}
	final public void setDuration (java.math.BigDecimal _duration_) {
		this._duration = _duration_;
	}



}
