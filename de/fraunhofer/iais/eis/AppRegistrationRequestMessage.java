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
	"App Registration Request Message"@en

	"Message that asks for registration or update of a data app to the App Store. Payload contains app-related metadata (instance of class ids:AppResource). Message header may contain an app identifier parameter of a prior registered data app. If the app identifier is supplied, the message should be interpreted as a registration for an app update. Otherwise this message is used to register a new app. "@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = AppRegistrationRequestMessageImpl.class),})
public interface AppRegistrationRequestMessage extends RequestMessage {

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
	"affected AppResource"@en

	"The affected data app that is referenced in the App-related messages. "@en
	*/
	
	
	@JsonProperty("ids:affectedDataApp")
	URI getAffectedDataApp();
}
