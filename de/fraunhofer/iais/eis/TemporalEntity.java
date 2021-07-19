package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * A temporal interval, instant or a relative duration.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = TemporalEntityImpl.class),
    @JsonSubTypes.Type(value = Instant.class),
    @JsonSubTypes.Type(value = Interval.class),
    @JsonSubTypes.Type(value = DurationEntity.class)
})
public interface TemporalEntity extends ModelClass {

    // standard methods

    @Beta
    public TemporalEntity deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Duration (relative time interval) of a temporal specification. Different to the TIME Ontology,
     * durations are expressed using the xsd:duration datatype. In case it is used with a instance of
     * ids:Instant, the value must be 'P0Y0M0DT0H0M0S'^^xsd:duration.
     *
     * More information under https://w3id.org/idsa/core/hasDuration
     *
     * @return Returns the javax.xml.datatype.Duration for the property _hasDuration.
     */
    @JsonProperty("ids:hasDuration")
    javax.xml.datatype.Duration getHasDuration();

    /**
     * Duration (relative time interval) of a temporal specification. Different to the TIME Ontology,
     * durations are expressed using the xsd:duration datatype. In case it is used with a instance of
     * ids:Instant, the value must be 'P0Y0M0DT0H0M0S'^^xsd:duration.
     *
     * More information under https://w3id.org/idsa/core/hasDuration
     *
     * @param _hasDuration_ desired value for the property _hasDuration.
     */
    void setHasDuration(javax.xml.datatype.Duration _hasDuration_);

}
