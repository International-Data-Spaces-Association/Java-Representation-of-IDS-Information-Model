package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Entity described by a minimal textual annotation, i.e. a title and description.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = Agent.class),
    @JsonSubTypes.Type(value = DigitalContent.class),
    @JsonSubTypes.Type(value = Representation.class),
    @JsonSubTypes.Type(value = ManagedEntity.class),
    @JsonSubTypes.Type(value = Rule.class)
})
public interface Described extends ModelClass {

    // standard methods

    @Beta
    public Described deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * (Localized) name of the entity.
     *
     * More information under https://w3id.org/idsa/core/title
     *
     * @return Returns the List of TypedLiterals for the property _title.
     */
    @JsonProperty("ids:title")
    List<TypedLiteral> getTitle();

    /**
     * (Localized) name of the entity.
     *
     * More information under https://w3id.org/idsa/core/title
     *
     * @param _title_ desired value for the property _title.
     */
    void setTitle(List<TypedLiteral> _title_);

    /**
     * Explanation of the resource in a natural language text.
     *
     * More information under https://w3id.org/idsa/core/description
     *
     * @return Returns the List of TypedLiterals for the property _description.
     */
    @JsonProperty("ids:description")
    List<TypedLiteral> getDescription();

    /**
     * Explanation of the resource in a natural language text.
     *
     * More information under https://w3id.org/idsa/core/description
     *
     * @param _description_ desired value for the property _description.
     */
    void setDescription(List<TypedLiteral> _description_);

}
