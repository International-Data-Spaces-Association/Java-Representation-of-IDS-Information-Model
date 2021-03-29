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
	"Notification Message"@en

	"Event messages are informative and no response is expected by the sender."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = NotificationMessageImpl.class),
@JsonSubTypes.Type(value = ConnectorNotificationMessage.class),

@JsonSubTypes.Type(value = ContractOfferMessage.class),

@JsonSubTypes.Type(value = ContractSupplementMessage.class),

@JsonSubTypes.Type(value = LogMessage.class),

@JsonSubTypes.Type(value = MessageProcessedNotificationMessage.class),

@JsonSubTypes.Type(value = ParticipantNotificationMessage.class),

@JsonSubTypes.Type(value = RequestInProcessMessage.class),

@JsonSubTypes.Type(value = ResourceNotificationMessage.class),})
public interface NotificationMessage extends Message {

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
