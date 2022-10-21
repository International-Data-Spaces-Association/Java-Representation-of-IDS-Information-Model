package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * A relative temporal entity of a certain length. Different to ids:Interval, the starting point is
 * not (yet) defined. Specifying a starting or ending point automatically transformes an instance of
 * ids:DurationEntity to an ids:Interval.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = DurationEntityImpl.class)
})
public interface DurationEntity extends TemporalEntity {

    // standard methods

    @Beta
    public DurationEntity deepCopy();

}
