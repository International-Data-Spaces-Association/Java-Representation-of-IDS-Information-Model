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

	"Instance of a Representation materialized at a partiuclar version and point in time. Possesses characteristics like file name, size, creation date etc."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = ArtifactImpl.class),})
public interface Artifact extends Asset
, RepresentationInstance {

	// standard methods

	@JsonProperty("@id")
	@javax.validation.constraints.NotNull URI getId();
	java.util.List<TypedLiteral> getLabel();
	java.util.List<TypedLiteral> getComment();
	String toRdf();

	// getter and setter for generic property map
	public java.util.Map<String,Object> getProperties();
	public void setProperty(String property, Object value);

	// accessor methods as derived from information model
	/**
	"byte size"@en

	"Size of the Artifact in bytes."@en
	*/
	
	
	@JsonProperty("ids:byteSize")
	BigInteger getByteSize();
	/**
	"file name"@en

	"Name of the Artifcat file."@en
	*/
	
	
	@JsonProperty("ids:fileName")
	String getFileName();
	/**
	"creation date"@en

	"Date (as xsd:dateTimeStamp) when the artifact was created, i.e. persisted."@en
	*/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	
	@JsonProperty("ids:creationDate")
	XMLGregorianCalendar getCreationDate();
	/**
	"checksum"@en

	"Checksum of the artifact"@en
	*/
	
	
	@JsonProperty("ids:checkSum")
	String getCheckSum();
	/**
	"duration"@en

	"Duration of the media resource in seconds."@en
	*/
	
	
	@JsonProperty("ids:duration")
	java.math.BigDecimal getDuration();
}
