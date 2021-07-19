package de.fraunhofer.iais.eis;


import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * A defined point in time with zero duration.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = InstantImpl.class)
})
public interface Instant extends TemporalEntity {

    // standard methods

    @Beta
    public Instant deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Absolute date time with a defined time zone.
     *
     * More information under https://w3id.org/idsa/core/dateTime
     *
     * @return Returns the XMLGregorianCalendar for the property _dateTime.
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    @JsonProperty("ids:dateTime")
    XMLGregorianCalendar getDateTime();

    /**
     * Absolute date time with a defined time zone.
     *
     * More information under https://w3id.org/idsa/core/dateTime
     *
     * @param _dateTime_ desired value for the property _dateTime.
     */
    void setDateTime(XMLGregorianCalendar _dateTime_);

}
