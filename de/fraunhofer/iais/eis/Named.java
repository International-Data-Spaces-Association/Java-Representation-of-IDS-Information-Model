package de.fraunhofer.iais.eis;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import de.fraunhofer.iais.eis.util.*;

/**
 * Entity that is identifiable within a context by means of a name.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = NamedImpl.class)
})
public interface Named extends ModelClass {

    // standard methods

    @Beta
    public Named deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Entity name unique within a specified context.
     *
     * More information under https://w3id.org/idsa/core/name
     *
     * @return Returns the String for the property _name.
     */
    @NotNull
    @JsonAlias({"https://w3id.org/idsa/core/name", "ids:name", "name"})
    String getName();

    /**
     * Entity name unique within a specified context.
     *
     * More information under https://w3id.org/idsa/core/name
     *
     * @param _name_ desired value for the property _name.
     */
    void setName(String _name_);

    // Default instances of this class as defined in the ontology

}
