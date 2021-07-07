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
 * Entity described by a minimal textual annotation, i.e. a title and description.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = Agent.class),
    @JsonSubTypes.Type(value = DigitalContent.class),
    @JsonSubTypes.Type(value = ManagedEntity.class),
    @JsonSubTypes.Type(value = Rule.class)
})
public interface Described extends ModelClass {

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
