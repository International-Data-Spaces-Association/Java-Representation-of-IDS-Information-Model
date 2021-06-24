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
* "Artifact"@en
* "Instance of a Representation materialized at a partiuclar version and point in time. Possesses characteristics like file name, size, creation date etc."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = ArtifactImpl.class)
})
public interface Artifact extends Asset, RepresentationInstance {

	// standard methods

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	@NotNull
	public URI getId();

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel();

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	public List<TypedLiteral> getComment();

	public String toRdf();

	// getter and setter for generic property map
	public Map<String,Object> getProperties();
	public void setProperty(String property, Object value);

	// accessor methods as derived from the IDS Information Model ontology


	/**
	* "Size of the Artifact in bytes."@en
	* @return Returns the BigInteger for the property _byteSize.
	* More information under https://w3id.org/idsa/core/byteSize
	*/
	@JsonProperty("ids:byteSize")
	public BigInteger getByteSize();

	/**
	* "Name of the Artifcat file."@en
	* @return Returns the String for the property _fileName.
	* More information under https://w3id.org/idsa/core/fileName
	*/
	@JsonProperty("ids:fileName")
	public String getFileName();

	/**
	* "Date (as xsd:dateTimeStamp) when the artifact was created, i.e. persisted."@en
	* @return Returns the XMLGregorianCalendar for the property _creationDate.
	* More information under https://w3id.org/idsa/core/creationDate
	*/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@JsonProperty("ids:creationDate")
	public XMLGregorianCalendar getCreationDate();

	/**
	* "Checksum of the artifact"@en
	* @return Returns the String for the property _checkSum.
	* More information under https://w3id.org/idsa/core/checkSum
	*/
	@JsonProperty("ids:checkSum")
	public String getCheckSum();

	/**
	* "Duration of the media resource in seconds."@en
	* @return Returns the java.math.BigDecimal for the property _duration.
	* More information under https://w3id.org/idsa/core/duration
	*/
	@JsonProperty("ids:duration")
	public java.math.BigDecimal getDuration();

}
