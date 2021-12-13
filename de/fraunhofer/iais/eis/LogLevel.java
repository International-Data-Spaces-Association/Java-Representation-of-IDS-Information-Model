package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Instances of ids:LogLevel can be used to specify a log level. Currently this is only used by the
 * Configuration Model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = LogLevelImpl.class)
})
public interface LogLevel extends ModelClass {

    // standard methods

    @Beta
    public LogLevel deepCopy();

}
