package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The class of all infrastructure components of the IDS.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = InfrastructureComponentImpl.class),
    @JsonSubTypes.Type(value = ClearingHouse.class),
    @JsonSubTypes.Type(value = Connector.class),
    @JsonSubTypes.Type(value = DAPS.class),
    @JsonSubTypes.Type(value = IdentityProvider.class)
})
public interface InfrastructureComponent extends ManagedEntity {

    // standard methods

    @Beta
    public InfrastructureComponent deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Participant responsible for technical maintenance of the InfrastructureComponent.
     *
     * More information under https://w3id.org/idsa/core/maintainer
     *
     * @return Returns the Participant for the property _maintainer.
     */
    @JsonAlias({"https://w3id.org/idsa/core/maintainerAsObject", "ids:maintainerAsObject", "maintainerAsObject"})
    Participant getMaintainerAsObject();

    /**
     * Participant responsible for technical maintenance of the InfrastructureComponent.
     *
     * More information under https://w3id.org/idsa/core/maintainer
     *
     * @param _maintainer_ desired value for the property _maintainer.
     */
    void setMaintainerAsObject(Participant _maintainer_);

    /**
     * Participant responsible for technical maintenance of the InfrastructureComponent.
     *
     * More information under https://w3id.org/idsa/core/maintainer
     *
     * @return Returns the URI for the property .
     */
    @JsonAlias({"https://w3id.org/idsa/core/maintainerAsUri", "ids:maintainerAsUri", "maintainerAsUri"})
    URI getMaintainerAsUri();

    /**
     * Participant responsible for technical maintenance of the InfrastructureComponent.
     *
     * More information under https://w3id.org/idsa/core/maintainer
     *
     * @param _maintainer_ desired value for the property .
     */
    void setMaintainerAsUri(URI _maintainer_);

    /**
     * Helper function for (de-)serialization of the InfrastructureComponent and the _maintainer fields.
     *
     * @return Returns the a UriOrModelClass object with the content of the field or null if the field
     *         is not set.
     */
    @JsonIgnore
    UriOrModelClass getMaintainer();

    /**
     * Participant responsible for the correctness of the content offered by the
     * InfrastructureComponent.
     *
     * More information under https://w3id.org/idsa/core/curator
     *
     * @return Returns the Participant for the property _curator.
     */
    @JsonAlias({"https://w3id.org/idsa/core/curatorAsObject", "ids:curatorAsObject", "curatorAsObject"})
    Participant getCuratorAsObject();

    /**
     * Participant responsible for the correctness of the content offered by the
     * InfrastructureComponent.
     *
     * More information under https://w3id.org/idsa/core/curator
     *
     * @param _curator_ desired value for the property _curator.
     */
    void setCuratorAsObject(Participant _curator_);

    /**
     * Participant responsible for the correctness of the content offered by the
     * InfrastructureComponent.
     *
     * More information under https://w3id.org/idsa/core/curator
     *
     * @return Returns the URI for the property .
     */
    @JsonAlias({"https://w3id.org/idsa/core/curatorAsUri", "ids:curatorAsUri", "curatorAsUri"})
    URI getCuratorAsUri();

    /**
     * Participant responsible for the correctness of the content offered by the
     * InfrastructureComponent.
     *
     * More information under https://w3id.org/idsa/core/curator
     *
     * @param _curator_ desired value for the property .
     */
    void setCuratorAsUri(URI _curator_);

    /**
     * Helper function for (de-)serialization of the InfrastructureComponent and the _curator fields.
     *
     * @return Returns the a UriOrModelClass object with the content of the field or null if the field
     *         is not set.
     */
    @NotNull
    @JsonIgnore
    UriOrModelClass getCurator();

    /**
     * The location where the Connector is physically deployed.
     *
     * More information under https://w3id.org/idsa/core/physicalLocation
     *
     * @return Returns the Location for the property _physicalLocation.
     */
    @JsonAlias({"https://w3id.org/idsa/core/physicalLocation", "ids:physicalLocation", "physicalLocation"})
    Location getPhysicalLocation();

    /**
     * The location where the Connector is physically deployed.
     *
     * More information under https://w3id.org/idsa/core/physicalLocation
     *
     * @param _physicalLocation_ desired value for the property _physicalLocation.
     */
    void setPhysicalLocation(Location _physicalLocation_);

    /**
     * Information Model version that the InfrastructureComponent is capable of reading/processing.
     *
     * More information under https://w3id.org/idsa/core/inboundModelVersion
     *
     * @return Returns the List of Strings for the property _inboundModelVersion.
     */
    @NotEmpty
    @JsonAlias({"https://w3id.org/idsa/core/inboundModelVersion", "ids:inboundModelVersion", "inboundModelVersion"})
    List<String> getInboundModelVersion();

    /**
     * Information Model version that the InfrastructureComponent is capable of reading/processing.
     *
     * More information under https://w3id.org/idsa/core/inboundModelVersion
     *
     * @param _inboundModelVersion_ desired value for the property _inboundModelVersion.
     */
    void setInboundModelVersion(List<String> _inboundModelVersion_);

    /**
     * Information Model version being produced by the InfrastructureComponent.
     *
     * More information under https://w3id.org/idsa/core/outboundModelVersion
     *
     * @return Returns the String for the property _outboundModelVersion.
     */
    @NotNull
    @JsonAlias({"https://w3id.org/idsa/core/outboundModelVersion", "ids:outboundModelVersion", "outboundModelVersion"})
    String getOutboundModelVersion();

    /**
     * Information Model version being produced by the InfrastructureComponent.
     *
     * More information under https://w3id.org/idsa/core/outboundModelVersion
     *
     * @param _outboundModelVersion_ desired value for the property _outboundModelVersion.
     */
    void setOutboundModelVersion(String _outboundModelVersion_);

    /**
     * Certification issued for the given Infrastructure Component.
     *
     * More information under https://w3id.org/idsa/core/componentCertification
     *
     * @return Returns the ComponentCertification for the property _componentCertification.
     */
    @JsonAlias({"https://w3id.org/idsa/core/componentCertification", "ids:componentCertification", "componentCertification"})
    ComponentCertification getComponentCertification();

    /**
     * Certification issued for the given Infrastructure Component.
     *
     * More information under https://w3id.org/idsa/core/componentCertification
     *
     * @param _componentCertification_ desired value for the property _componentCertification.
     */
    void setComponentCertification(ComponentCertification _componentCertification_);

    /**
     * Public Key that has been created for the Component.
     *
     * More information under https://w3id.org/idsa/core/publicKey
     *
     * @return Returns the PublicKey for the property _publicKey.
     */
    @JsonAlias({"https://w3id.org/idsa/core/publicKey", "ids:publicKey", "publicKey"})
    PublicKey getPublicKey();

    /**
     * Public Key that has been created for the Component.
     *
     * More information under https://w3id.org/idsa/core/publicKey
     *
     * @param _publicKey_ desired value for the property _publicKey.
     */
    void setPublicKey(PublicKey _publicKey_);

    // Default instances of this class as defined in the ontology

}
