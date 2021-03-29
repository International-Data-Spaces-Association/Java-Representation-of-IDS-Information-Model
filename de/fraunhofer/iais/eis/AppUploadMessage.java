package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.*;
import javax.validation.constraints.*;
import java.util.Arrays;
import java.io.Serializable;

import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
	"App Upload Message"@en

	"Message that usually follows a AppRegistrationResponseMessage and is used to upload a data app to the app store. Payload contains data app. Note that the message must refer to the prior sent, corresponding AppResource instance. The IRI of the ids:appArtifactReference must must match the IRI of the artifact which is the value for the ids:instance property. The ids:instance is specific for each representation. Therefore, if someone wants to upload multiple representations for an app, he has to state them using multiple ids:instance properties inside the AppRepresentation (and therefore inside the AppResource). Otherwise no mapping between payload and app metadata can be achieved."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = AppUploadMessageImpl.class),})
public interface AppUploadMessage extends UploadMessage {

	// standard methods

	@JsonProperty("@id")
	@javax.validation.constraints.NotNull URI getId();
	java.util.List<TypedLiteral> getLabel();
	java.util.List<TypedLiteral> getComment();
	String toRdf();

	// getter and setter for generic property map
	public java.util.Map<String,Object> getProperties();
	public void setProperty(String property, Object value);

	// accessor methods as derived from information model
	/**
	"app artifact reference"@en

	"IRI reference to the ids:Artifact, whose corresponding data is transfered as payload of the AppUploadMessage. The Artifact IRI reference must match the IRI of the instance IRI for the corresponding ids:AppRepresentation."@en
	*/
	
	@NotNull
	@JsonProperty("ids:appArtifactReference")
	URI getAppArtifactReference();
}
