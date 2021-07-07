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
 * A temporal entity with extent or duration, fixed in time (different to ids:DurationEntity).
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = IntervalImpl.class)
})
public interface Interval extends ModelClass, TemporalEntity {

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
     * Beginning of an Interval.
     *
     * More information under https://w3id.org/idsa/core/begin
     *
     * @return Returns the Instant for the property _begin.
     */
    @NotNull
    @JsonProperty("ids:begin")
    Instant getBegin();

    /**
     * Beginning of an Interval.
     *
     * More information under https://w3id.org/idsa/core/begin
     *
     * @param _begin_ desired value for the property _begin.
     */
    void setBegin(Instant _begin_);

    /**
     * End of an Interval.
     *
     * More information under https://w3id.org/idsa/core/end
     *
     * @return Returns the Instant for the property _end.
     */
    @JsonProperty("ids:end")
    Instant getEnd();

    /**
     * End of an Interval.
     *
     * More information under https://w3id.org/idsa/core/end
     *
     * @param _end_ desired value for the property _end.
     */
    void setEnd(Instant _end_);

}
