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
 * Message that usually follows a AppRegistrationResponseMessage and is used to upload a data app to
 * the app store. Payload contains data app. Note that the message must refer to the prior sent,
 * corresponding AppResource instance. The IRI of the ids:appArtifactReference must must match the
 * IRI of the artifact which is the value for the ids:instance property. The ids:instance is
 * specific for each representation. Therefore, if someone wants to upload multiple representations
 * for an app, he has to state them using multiple ids:instance properties inside the
 * AppRepresentation (and therefore inside the AppResource). Otherwise no mapping between payload
 * and app metadata can be achieved.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = AppUploadMessageImpl.class)
})
public interface AppUploadMessage extends ModelClass, UploadMessage {

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
     * IRI reference to the ids:Artifact, whose corresponding data is transfered as payload of the
     * AppUploadMessage. The Artifact IRI reference must match the IRI of the instance IRI for the
     * corresponding ids:AppRepresentation.
     *
     * More information under https://w3id.org/idsa/core/appArtifactReference
     *
     * @return Returns the URI for the property _appArtifactReference.
     */
    @NotNull
    @JsonProperty("ids:appArtifactReference")
    URI getAppArtifactReference();

    /**
     * IRI reference to the ids:Artifact, whose corresponding data is transfered as payload of the
     * AppUploadMessage. The Artifact IRI reference must match the IRI of the instance IRI for the
     * corresponding ids:AppRepresentation.
     *
     * More information under https://w3id.org/idsa/core/appArtifactReference
     *
     * @param _appArtifactReference_ desired value for the property _appArtifactReference.
     */
    void setAppArtifactReference(URI _appArtifactReference_);

}
