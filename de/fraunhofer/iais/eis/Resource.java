package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Resource is a single digital content or a coherent set of digital contents. Resource content is
 * formalized in Representations and optionally materialized as Artifacts. The Resource's content is
 * exposed via defined Interfaces at various protocol Endpoints.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ResourceImpl.class),
    @JsonSubTypes.Type(value = TextResource.class),
    @JsonSubTypes.Type(value = AppResource.class),
    @JsonSubTypes.Type(value = DataResource.class),
    @JsonSubTypes.Type(value = AudioResource.class),
    @JsonSubTypes.Type(value = ImageResource.class),
    @JsonSubTypes.Type(value = VideoResource.class),
    @JsonSubTypes.Type(value = SoftwareResource.class)
})
public interface Resource extends Asset, DigitalContent, DescribedSemantically, ManagedEntity {

    // standard methods

    @Beta
    public Resource deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * 
     * Reference to a well-known License regulating the general usage of the Resource. Check wikidata
     * license documentation for an extensive list of licenses. License IRI should refer to the direct
     * of link for a given standard license, e.g., MIT license (https://www.wikidata.org/wiki/Q334661).
     * The label of the resolved wikidata license IRI can be used to present the license in
     * human-readable form.
     *
     * 
     * More information under https://w3id.org/idsa/core/standardLicense
     *
     * @return Returns the URI for the property _standardLicense.
     */
    @JsonAlias({"https://w3id.org/idsa/core/standardLicense", "ids:standardLicense", "standardLicense"})
    URI getStandardLicense();

    /**
     * 
     * Reference to a well-known License regulating the general usage of the Resource. Check wikidata
     * license documentation for an extensive list of licenses. License IRI should refer to the direct
     * of link for a given standard license, e.g., MIT license (https://www.wikidata.org/wiki/Q334661).
     * The label of the resolved wikidata license IRI can be used to present the license in
     * human-readable form.
     *
     * 
     * More information under https://w3id.org/idsa/core/standardLicense
     *
     * @param _standardLicense_ desired value for the property _standardLicense.
     */
    void setStandardLicense(URI _standardLicense_);

    /**
     * URL reference to a custom license regulating the general usage of the Resource.
     *
     * More information under https://w3id.org/idsa/core/customLicense
     *
     * @return Returns the URI for the property _customLicense.
     */
    @JsonAlias({"https://w3id.org/idsa/core/customLicense", "ids:customLicense", "customLicense"})
    URI getCustomLicense();

    /**
     * URL reference to a custom license regulating the general usage of the Resource.
     *
     * More information under https://w3id.org/idsa/core/customLicense
     *
     * @param _customLicense_ desired value for the property _customLicense.
     */
    void setCustomLicense(URI _customLicense_);

    /**
     * Reference to a Resource (physically or logically) included, definition of part-whole hierarchies.
     *
     * More information under https://w3id.org/idsa/core/resourcePart
     *
     * @return Returns the List of Resources for the property _resourcePart.
     */
    @JsonAlias({"https://w3id.org/idsa/core/resourcePart", "ids:resourcePart", "resourcePart"})
    List<Resource> getResourcePart();

    /**
     * Reference to a Resource (physically or logically) included, definition of part-whole hierarchies.
     *
     * More information under https://w3id.org/idsa/core/resourcePart
     *
     * @param _resourcePart_ desired value for the property _resourcePart.
     */
    void setResourcePart(List<Resource> _resourcePart_);

    /**
     * Reference to the Endpoints that serve the resource's content or let you exchange messages with an
     * IDS Connector.
     *
     * More information under https://w3id.org/idsa/core/resourceEndpoint
     *
     * @return Returns the List of ConnectorEndpoints for the property _resourceEndpoint.
     */
    @JsonAlias({"https://w3id.org/idsa/core/resourceEndpoint", "ids:resourceEndpoint", "resourceEndpoint"})
    List<ConnectorEndpoint> getResourceEndpoint();

    /**
     * Reference to the Endpoints that serve the resource's content or let you exchange messages with an
     * IDS Connector.
     *
     * More information under https://w3id.org/idsa/core/resourceEndpoint
     *
     * @param _resourceEndpoint_ desired value for the property _resourceEndpoint.
     */
    void setResourceEndpoint(List<ConnectorEndpoint> _resourceEndpoint_);

    /**
     * Reference to a Contract Offer defining the authorized use of the Resource.
     *
     * More information under https://w3id.org/idsa/core/contractOffer
     *
     * @return Returns the List of ContractOffers for the property _contractOffer.
     */
    @JsonAlias({"https://w3id.org/idsa/core/contractOffer", "ids:contractOffer", "contractOffer"})
    List<ContractOffer> getContractOffer();

    /**
     * Reference to a Contract Offer defining the authorized use of the Resource.
     *
     * More information under https://w3id.org/idsa/core/contractOffer
     *
     * @param _contractOffer_ desired value for the property _contractOffer.
     */
    void setContractOffer(List<ContractOffer> _contractOffer_);

    /**
     * Various pricing modalities such as idsc:FREE, idsc:FIXED_PRICE and idsc:NEGOTIATION_BASIS can be
     * used as a pre-selection to annotate the terms of the contract. Depending on the requirements,
     * additional free text information can be attached.
     *
     * More information under https://w3id.org/idsa/core/paymentModality
     *
     * @return Returns the PaymentModality for the property _paymentModality.
     */
    @JsonAlias({"https://w3id.org/idsa/core/paymentModality", "ids:paymentModality", "paymentModality"})
    PaymentModality getPaymentModality();

    /**
     * Various pricing modalities such as idsc:FREE, idsc:FIXED_PRICE and idsc:NEGOTIATION_BASIS can be
     * used as a pre-selection to annotate the terms of the contract. Depending on the requirements,
     * additional free text information can be attached.
     *
     * More information under https://w3id.org/idsa/core/paymentModality
     *
     * @param _paymentModality_ desired value for the property _paymentModality.
     */
    void setPaymentModality(PaymentModality _paymentModality_);

    /**
     * The publisher of the resource (which may differ from the sovereign).
     *
     * More information under https://w3id.org/idsa/core/publisher
     *
     * @return Returns the Agent for the property _publisher.
     */
    @JsonAlias({"https://w3id.org/idsa/core/publisherAsObject", "ids:publisherAsObject", "publisherAsObject"})
    Agent getPublisherAsObject();

    /**
     * The publisher of the resource (which may differ from the sovereign).
     *
     * More information under https://w3id.org/idsa/core/publisher
     *
     * @param _publisher_ desired value for the property _publisher.
     */
    void setPublisherAsObject(Agent _publisher_);

    /**
     * The publisher of the resource (which may differ from the sovereign).
     *
     * More information under https://w3id.org/idsa/core/publisher
     *
     * @return Returns the URI for the property .
     */
    @JsonAlias({"https://w3id.org/idsa/core/publisherAsUri", "ids:publisherAsUri", "publisherAsUri"})
    URI getPublisherAsUri();

    /**
     * The publisher of the resource (which may differ from the sovereign).
     *
     * More information under https://w3id.org/idsa/core/publisher
     *
     * @param _publisher_ desired value for the property .
     */
    void setPublisherAsUri(URI _publisher_);

    /**
     * Helper function for (de-)serialization of the Resource and the _publisher fields.
     *
     * @return Returns the a UriOrModelClass object with the content of the field or null if the field
     *         is not set.
     */
    @JsonIgnore
    UriOrModelClass getPublisher();

    /**
     * The 'owner', i.e. sovereign of the data.
     *
     * More information under https://w3id.org/idsa/core/sovereign
     *
     * @return Returns the Agent for the property _sovereign.
     */
    @JsonAlias({"https://w3id.org/idsa/core/sovereignAsObject", "ids:sovereignAsObject", "sovereignAsObject"})
    Agent getSovereignAsObject();

    /**
     * The 'owner', i.e. sovereign of the data.
     *
     * More information under https://w3id.org/idsa/core/sovereign
     *
     * @param _sovereign_ desired value for the property _sovereign.
     */
    void setSovereignAsObject(Agent _sovereign_);

    /**
     * The 'owner', i.e. sovereign of the data.
     *
     * More information under https://w3id.org/idsa/core/sovereign
     *
     * @return Returns the URI for the property .
     */
    @JsonAlias({"https://w3id.org/idsa/core/sovereignAsUri", "ids:sovereignAsUri", "sovereignAsUri"})
    URI getSovereignAsUri();

    /**
     * The 'owner', i.e. sovereign of the data.
     *
     * More information under https://w3id.org/idsa/core/sovereign
     *
     * @param _sovereign_ desired value for the property .
     */
    void setSovereignAsUri(URI _sovereign_);

    /**
     * Helper function for (de-)serialization of the Resource and the _sovereign fields.
     *
     * @return Returns the a UriOrModelClass object with the content of the field or null if the field
     *         is not set.
     */
    @JsonIgnore
    UriOrModelClass getSovereign();

    /**
     * Sample Resource instance.
     *
     * More information under https://w3id.org/idsa/core/sample
     *
     * @return Returns the List of Resources for the property _sample.
     */
    @JsonAlias({"https://w3id.org/idsa/core/sample", "ids:sample", "sample"})
    List<Resource> getSample();

    /**
     * Sample Resource instance.
     *
     * More information under https://w3id.org/idsa/core/sample
     *
     * @param _sample_ desired value for the property _sample.
     */
    void setSample(List<Resource> _sample_);

    /**
     * (Equivalent) variant of given Resource, e.g., a translation.
     *
     * More information under https://w3id.org/idsa/core/variant
     *
     * @return Returns the Resource for the property _variant.
     */
    @JsonAlias({"https://w3id.org/idsa/core/variant", "ids:variant", "variant"})
    Resource getVariant();

    /**
     * (Equivalent) variant of given Resource, e.g., a translation.
     *
     * More information under https://w3id.org/idsa/core/variant
     *
     * @param _variant_ desired value for the property _variant.
     */
    void setVariant(Resource _variant_);

    // Default instances of this class as defined in the ontology

}
