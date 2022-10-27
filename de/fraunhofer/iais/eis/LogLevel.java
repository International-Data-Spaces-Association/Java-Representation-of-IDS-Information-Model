package de.fraunhofer.iais.eis;

import java.net.URI;

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

    // Default instances of this class as defined in the ontology

    /**
     * Debug level logging.
     */
    LogLevel DEBUG_LEVEL_LOGGING = new LogLevelBuilder(URI.create("https://w3id.org/idsa/code/DEBUG_LEVEL_LOGGING")).build();

    /**
     * Minimal logging.
     */
    LogLevel MINIMAL_LOGGING = new LogLevelBuilder(URI.create("https://w3id.org/idsa/code/MINIMAL_LOGGING")).build();

    /**
     * No logging.
     */
    LogLevel NO_LOGGING = new LogLevelBuilder(URI.create("https://w3id.org/idsa/code/NO_LOGGING")).build();

}
