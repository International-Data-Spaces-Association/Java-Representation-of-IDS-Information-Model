package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;

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

    /**
     * This function retrieves the ID of the current object (can be set via the constructor of the
     * builder class)
     * 
     * @return ID of current object as URI
     */
    @JsonProperty("@id")
    @NotNull
    public URI getId();

    /**
     * This function retrieves a human readable label about the current class, as defined in the
     * ontology. This label could, for example, be used as a field heading in a user interface
     * 
     * @return Human readable label
     */
    public List<TypedLiteral> getLabel();

    /**
     * This function retrieves a human readable explanatory comment about the current class, as defined
     * in the ontology. This comment could, for example, be used as a tooltip in a user interface
     * 
     * @return Human readable explanatory comment
     */
    public List<TypedLiteral> getComment();

    public String toRdf();

    // getter and setter for generic property map
    public Map<String, Object> getProperties();

    public void setProperty(String property, Object value);

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
