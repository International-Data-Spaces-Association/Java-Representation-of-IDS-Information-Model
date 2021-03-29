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
	"Response Message"@en

	"Response messages hold information about the reaction of a recipient to a formerly sent command or event. They must be correlated to this message."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = ResponseMessageImpl.class),
@JsonSubTypes.Type(value = AccessTokenResponseMessage.class),

@JsonSubTypes.Type(value = AppRegistrationResponseMessage.class),

@JsonSubTypes.Type(value = ArtifactResponseMessage.class),

@JsonSubTypes.Type(value = ContractAgreementMessage.class),

@JsonSubTypes.Type(value = ContractResponseMessage.class),

@JsonSubTypes.Type(value = DescriptionResponseMessage.class),

@JsonSubTypes.Type(value = OperationResultMessage.class),

@JsonSubTypes.Type(value = ParticipantResponseMessage.class),

@JsonSubTypes.Type(value = RejectionMessage.class),

@JsonSubTypes.Type(value = ResultMessage.class),

@JsonSubTypes.Type(value = UploadResponseMessage.class),})
public interface ResponseMessage extends Message {

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
