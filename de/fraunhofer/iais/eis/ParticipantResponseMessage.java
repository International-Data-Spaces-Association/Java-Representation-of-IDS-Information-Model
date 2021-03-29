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
	"Participant Response Message"@en

	"Message that follows up a ParticipantRequestMessage and contains the Participant\'s information in the payload section."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = ParticipantResponseMessageImpl.class),})
public interface ParticipantResponseMessage extends ResponseMessage {

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
