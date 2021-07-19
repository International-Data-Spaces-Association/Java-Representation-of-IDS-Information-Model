package de.fraunhofer.iais.eis;


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
public interface Interval extends TemporalEntity {

    // standard methods

    @Beta
    public Interval deepCopy();

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
