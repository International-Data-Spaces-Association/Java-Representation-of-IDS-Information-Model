package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The class of all infrastructure components of the IDS.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ClearingHouse.class),
    @JsonSubTypes.Type(value = Connector.class),
    @JsonSubTypes.Type(value = DAPS.class),
    @JsonSubTypes.Type(value = IdentityProvider.class)
})
public interface InfrastructureComponent extends ModelClass, ManagedEntity {

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
     * Participant responsible for technical maintenance of the InfrastructureComponent.
     *
     * More information under https://w3id.org/idsa/core/maintainer
     *
     * @return Returns the URI for the property _maintainer.
     */
    @NotNull
    @JsonProperty("ids:maintainer")
    URI getMaintainer();

    /**
     * Participant responsible for technical maintenance of the InfrastructureComponent.
     *
     * More information under https://w3id.org/idsa/core/maintainer
     *
     * @param _maintainer_ desired value for the property _maintainer.
     */
    void setMaintainer(URI _maintainer_);

    /**
     * Participant responsible for the correctness of the content offered by the
     * InfrastructureComponent.
     *
     * More information under https://w3id.org/idsa/core/curator
     *
     * @return Returns the URI for the property _curator.
     */
    @NotNull
    @JsonProperty("ids:curator")
    URI getCurator();

    /**
     * Participant responsible for the correctness of the content offered by the
     * InfrastructureComponent.
     *
     * More information under https://w3id.org/idsa/core/curator
     *
     * @param _curator_ desired value for the property _curator.
     */
    void setCurator(URI _curator_);

    /**
     * The location where the Connector is physically deployed.
     *
     * More information under https://w3id.org/idsa/core/physicalLocation
     *
     * @return Returns the Location for the property _physicalLocation.
     */
    @JsonProperty("ids:physicalLocation")
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
    @JsonProperty("ids:inboundModelVersion")
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
    @JsonProperty("ids:outboundModelVersion")
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
    @JsonProperty("ids:componentCertification")
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
    @JsonProperty("ids:publicKey")
    PublicKey getPublicKey();

    /**
     * Public Key that has been created for the Component.
     *
     * More information under https://w3id.org/idsa/core/publicKey
     *
     * @param _publicKey_ desired value for the property _publicKey.
     */
    void setPublicKey(PublicKey _publicKey_);

}
