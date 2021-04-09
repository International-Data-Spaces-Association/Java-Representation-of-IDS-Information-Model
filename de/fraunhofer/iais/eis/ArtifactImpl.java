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
* "Artifact"@en
* "Instance of a Representation materialized at a partiuclar version and point in time. Possesses characteristics like file name, size, creation date etc."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:Artifact")
public class ArtifactImpl implements Serializable, Artifact {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Artifact", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Instance of a Representation materialized at a partiuclar version and point in time. Possesses characteristics like file name, size, creation date etc.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDSA Information Model ontology

	/**
	* "byte size"@en
	* "Size of the Artifact in bytes."@en
	*/
	@JsonAlias({"ids:byteSize", "byteSize"})
	protected BigInteger _byteSize;


	/**
	* "checksum"@en
	* "Checksum of the artifact"@en
	*/
	@JsonAlias({"ids:checkSum", "checkSum"})
	protected String _checkSum;


	/**
	* "creation date"@en
	* "Date (as xsd:dateTimeStamp) when the artifact was created, i.e. persisted."@en
	*/
	@JsonAlias({"ids:creationDate", "creationDate"})
	protected XMLGregorianCalendar _creationDate;


	/**
	* "duration"@en
	* "Duration of the media resource in seconds."@en
	*/
	@JsonAlias({"ids:duration", "duration"})
	protected java.math.BigDecimal _duration;


	/**
	* "file name"@en
	* "Name of the Artifcat file."@en
	*/
	@JsonAlias({"ids:fileName", "fileName"})
	protected String _fileName;


	// no manual construction
	protected ArtifactImpl() {
		id = VocabUtil.getInstance().createRandomUrl("artifact");
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
	* "Size of the Artifact in bytes."@en
	* @return Returns the BigInteger for the property byteSize.
	* More information under https://w3id.org/idsa/core/byteSize
	*/
	@JsonProperty("ids:byteSize")
	final public BigInteger getByteSize() {
		return _byteSize;
	}

	
	/**
	* "Size of the Artifact in bytes."@en
	* @param _byteSize_ desired value for the property byteSize.
	* More information under https://w3id.org/idsa/core/byteSize
	*/
	final public void setByteSize (BigInteger _byteSize_) {
		this._byteSize = _byteSize_;
	}

	/**
	* "Name of the Artifcat file."@en
	* @return Returns the String for the property fileName.
	* More information under https://w3id.org/idsa/core/fileName
	*/
	@JsonProperty("ids:fileName")
	final public String getFileName() {
		return _fileName;
	}

	
	/**
	* "Name of the Artifcat file."@en
	* @param _fileName_ desired value for the property fileName.
	* More information under https://w3id.org/idsa/core/fileName
	*/
	final public void setFileName (String _fileName_) {
		this._fileName = _fileName_;
	}

	/**
	* "Date (as xsd:dateTimeStamp) when the artifact was created, i.e. persisted."@en
	* @return Returns the XMLGregorianCalendar for the property creationDate.
	* More information under https://w3id.org/idsa/core/creationDate
	*/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@JsonProperty("ids:creationDate")
	final public XMLGregorianCalendar getCreationDate() {
		return _creationDate;
	}

	
	/**
	* "Date (as xsd:dateTimeStamp) when the artifact was created, i.e. persisted."@en
	* @param _creationDate_ desired value for the property creationDate.
	* More information under https://w3id.org/idsa/core/creationDate
	*/
	final public void setCreationDate (XMLGregorianCalendar _creationDate_) {
		this._creationDate = _creationDate_;
	}

	/**
	* "Checksum of the artifact"@en
	* @return Returns the String for the property checkSum.
	* More information under https://w3id.org/idsa/core/checkSum
	*/
	@JsonProperty("ids:checkSum")
	final public String getCheckSum() {
		return _checkSum;
	}

	
	/**
	* "Checksum of the artifact"@en
	* @param _checkSum_ desired value for the property checkSum.
	* More information under https://w3id.org/idsa/core/checkSum
	*/
	final public void setCheckSum (String _checkSum_) {
		this._checkSum = _checkSum_;
	}

	/**
	* "Duration of the media resource in seconds."@en
	* @return Returns the java.math.BigDecimal for the property duration.
	* More information under https://w3id.org/idsa/core/duration
	*/
	@JsonProperty("ids:duration")
	final public java.math.BigDecimal getDuration() {
		return _duration;
	}

	
	/**
	* "Duration of the media resource in seconds."@en
	* @param _duration_ desired value for the property duration.
	* More information under https://w3id.org/idsa/core/duration
	*/
	final public void setDuration (java.math.BigDecimal _duration_) {
		this._duration = _duration_;
	}



}
