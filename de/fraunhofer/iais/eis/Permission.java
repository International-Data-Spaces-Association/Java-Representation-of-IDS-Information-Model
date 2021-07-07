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
 * The class of Permissions as defined in the ODRL ontology.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = PermissionImpl.class)
})
public interface Permission extends ModelClass, Rule {

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
     * A Duty imposed by the Rule, which must be executed before the Rule.
     *
     * More information under https://w3id.org/idsa/core/preDuty
     *
     * @return Returns the List of Dutys for the property _preDuty.
     */
    @JsonProperty("ids:preDuty")
    List<Duty> getPreDuty();

    /**
     * A Duty imposed by the Rule, which must be executed before the Rule.
     *
     * More information under https://w3id.org/idsa/core/preDuty
     *
     * @param _preDuty_ desired value for the property _preDuty.
     */
    void setPreDuty(List<Duty> _preDuty_);

    /**
     * A Duty imposed by the Rule, which must be executed after the Rule.
     *
     * More information under https://w3id.org/idsa/core/postDuty
     *
     * @return Returns the List of Dutys for the property _postDuty.
     */
    @JsonProperty("ids:postDuty")
    List<Duty> getPostDuty();

    /**
     * A Duty imposed by the Rule, which must be executed after the Rule.
     *
     * More information under https://w3id.org/idsa/core/postDuty
     *
     * @param _postDuty_ desired value for the property _postDuty.
     */
    void setPostDuty(List<Duty> _postDuty_);

}
