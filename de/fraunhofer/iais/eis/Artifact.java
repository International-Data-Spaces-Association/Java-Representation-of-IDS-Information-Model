package de.fraunhofer.iais.eis;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Instance of a Representation materialized at a partiuclar version and point in time. Possesses
 * characteristics like file name, size, creation date etc.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ArtifactImpl.class)
})
public interface Artifact extends Asset, RepresentationInstance {

    // standard methods

    @Beta
    public Artifact deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Size of the Artifact in bytes.
     *
     * More information under https://w3id.org/idsa/core/byteSize
     *
     * @return Returns the BigInteger for the property _byteSize.
     */
    @JsonProperty("ids:byteSize")
    BigInteger getByteSize();

    /**
     * Size of the Artifact in bytes.
     *
     * More information under https://w3id.org/idsa/core/byteSize
     *
     * @param _byteSize_ desired value for the property _byteSize.
     */
    void setByteSize(BigInteger _byteSize_);

    /**
     * Name of the Artifcat file.
     *
     * More information under https://w3id.org/idsa/core/fileName
     *
     * @return Returns the String for the property _fileName.
     */
    @JsonProperty("ids:fileName")
    String getFileName();

    /**
     * Name of the Artifcat file.
     *
     * More information under https://w3id.org/idsa/core/fileName
     *
     * @param _fileName_ desired value for the property _fileName.
     */
    void setFileName(String _fileName_);

    /**
     * Date (as xsd:dateTimeStamp) when the artifact was created, i.e. persisted.
     *
     * More information under https://w3id.org/idsa/core/creationDate
     *
     * @return Returns the XMLGregorianCalendar for the property _creationDate.
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    @JsonProperty("ids:creationDate")
    XMLGregorianCalendar getCreationDate();

    /**
     * Date (as xsd:dateTimeStamp) when the artifact was created, i.e. persisted.
     *
     * More information under https://w3id.org/idsa/core/creationDate
     *
     * @param _creationDate_ desired value for the property _creationDate.
     */
    void setCreationDate(XMLGregorianCalendar _creationDate_);

    /**
     * Checksum of the artifact
     *
     * More information under https://w3id.org/idsa/core/checkSum
     *
     * @return Returns the String for the property _checkSum.
     */
    @JsonProperty("ids:checkSum")
    String getCheckSum();

    /**
     * Checksum of the artifact
     *
     * More information under https://w3id.org/idsa/core/checkSum
     *
     * @param _checkSum_ desired value for the property _checkSum.
     */
    void setCheckSum(String _checkSum_);

    /**
     * Duration of the media resource in seconds.
     *
     * More information under https://w3id.org/idsa/core/duration
     *
     * @return Returns the java.math.BigDecimal for the property _duration.
     */
    @JsonProperty("ids:duration")
    java.math.BigDecimal getDuration();

    /**
     * Duration of the media resource in seconds.
     *
     * More information under https://w3id.org/idsa/core/duration
     *
     * @param _duration_ desired value for the property _duration.
     */
    void setDuration(java.math.BigDecimal _duration_);

}
