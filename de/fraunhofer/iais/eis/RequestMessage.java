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
	"Request Message"@en

	"Client-generated message initiating a communication, motivated by a certain reason and with an answer expected."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = RequestMessageImpl.class),
@JsonSubTypes.Type(value = AccessTokenRequestMessage.class),

@JsonSubTypes.Type(value = AppRegistrationRequestMessage.class),

@JsonSubTypes.Type(value = ArtifactRequestMessage.class),

@JsonSubTypes.Type(value = CommandMessage.class),

@JsonSubTypes.Type(value = ContractRequestMessage.class),

@JsonSubTypes.Type(value = DescriptionRequestMessage.class),

@JsonSubTypes.Type(value = InvokeOperationMessage.class),

@JsonSubTypes.Type(value = ParticipantRequestMessage.class),

@JsonSubTypes.Type(value = QueryMessage.class),

@JsonSubTypes.Type(value = UploadMessage.class),})
public interface RequestMessage extends Message {

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

}
