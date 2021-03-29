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
	"Connector Notification Message"@en

	"Superclass of all messages, indicating a change of a connector\'s conditions."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = ConnectorCertificateGrantedMessage.class),

@JsonSubTypes.Type(value = ConnectorCertificateRevokedMessage.class),

@JsonSubTypes.Type(value = ConnectorUnavailableMessage.class),

@JsonSubTypes.Type(value = ConnectorUpdateMessage.class),})
public interface ConnectorNotificationMessage extends NotificationMessage {

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
	"affected Connector"@en

	"References the connector that is affected by the runtime condition change."@en
	*/
	
	@NotNull
	@JsonProperty("ids:affectedConnector")
	URI getAffectedConnector();
}
