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
	"Participant Notification Message"@en

	"Superclass of all messages, indicating a change of a particpants\'s conditions."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = ParticipantCertificateGrantedMessage.class),

@JsonSubTypes.Type(value = ParticipantCertificateRevokedMessage.class),

@JsonSubTypes.Type(value = ParticipantUnavailableMessage.class),

@JsonSubTypes.Type(value = ParticipantUpdateMessage.class),})
public interface ParticipantNotificationMessage extends NotificationMessage {

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
	"affected Participant"@en

	"References the participant that is referenced in the participant-related notification messages."@en
	*/
	
	@NotNull
	@JsonProperty("ids:affectedParticipant")
	URI getAffectedParticipant();
}
