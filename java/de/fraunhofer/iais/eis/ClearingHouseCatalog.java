package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Class that aggregates Clearing Houses from a (distributable) Catalog.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ClearingHouseCatalogImpl.class)
})
public interface ClearingHouseCatalog extends Catalog {

    // standard methods

    @Beta
    public ClearingHouseCatalog deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * A Clearing House that is part of a Clearing House catalog.
     *
     * More information under https://w3id.org/idsa/core/listedClearingHouse
     *
     * @return Returns the List of ClearingHouses for the property _listedClearingHouse.
     */
    @JsonProperty("ids:listedClearingHouse")
    List<ClearingHouse> getListedClearingHouse();

    /**
     * A Clearing House that is part of a Clearing House catalog.
     *
     * More information under https://w3id.org/idsa/core/listedClearingHouse
     *
     * @param _listedClearingHouse_ desired value for the property _listedClearingHouse.
     */
    void setListedClearingHouse(List<ClearingHouse> _listedClearingHouse_);

}
