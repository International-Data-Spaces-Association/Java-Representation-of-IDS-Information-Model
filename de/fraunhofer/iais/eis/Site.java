package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * An office or other premise at which the organization is located
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = SiteImpl.class)
})
public interface Site extends ModelClass {

    // standard methods

    @Beta
    public Site deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Indicates an address for the site.
     *
     * More information under https://w3id.org/idsa/core/siteAddress
     *
     * @return Returns the String for the property _siteAddress.
     */
    @JsonProperty("ids:siteAddress")
    String getSiteAddress();

    /**
     * Indicates an address for the site.
     *
     * More information under https://w3id.org/idsa/core/siteAddress
     *
     * @param _siteAddress_ desired value for the property _siteAddress.
     */
    void setSiteAddress(String _siteAddress_);

}
