package de.fraunhofer.iais.eis;

import java.util.List;


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
public interface Permission extends Rule {

    // standard methods

    @Beta
    public Permission deepCopy();

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
