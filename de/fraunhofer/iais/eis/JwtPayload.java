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
	"JWT Payload"@en

	"The payload of an JSON Web Token as a RDF class. Is used as the common parent of e.g. DatPayload and DatRequestPayload."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = DatPayload.class),

@JsonSubTypes.Type(value = DatRequestPayload.class),})
public interface JwtPayload {

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
	"aud"@en

	"The \'aud\' (audience) claim identifies the recipients that the JWT is intended for."@en
	*/
	
	@NotNull
	@JsonProperty("ids:aud")
	Audience getAud();
	/**
	"sub"@en

	"The \'sub\' (subject) claim identifies the principal that is the subject of the JWT."@en
	*/
	
	@NotNull
	@JsonProperty("ids:sub")
	String getSub();
	/**
	"nbf"@en

	"The \'aud\' (audience) claim identifies the recipients that the JWT is intended for."@en
	*/
	
	@NotNull
	@JsonProperty("ids:nbf")
	BigInteger getNbf();
	/**
	"exp"@en

	"The \'exp\' (expiration time) claim identifies the expiration time on or after which the JWT MUST NOT be accepted for processing."@en
	*/
	
	@NotNull
	@JsonProperty("ids:exp")
	BigInteger getExp();
	/**
	"iat"@en

	"The \'iat\' (issued at) claim contains the point in time when the JWT was created."@en
	*/
	
	@NotNull
	@JsonProperty("ids:iat")
	BigInteger getIat();
	/**
	"scope"@en

	"Currently, the scope is limited to \'Connector\' but can be used for scoping purposes in the future. Scope is currently fixed to \'https://w3id.org/idsa/core/Connector\'."@en
	*/
	
	@NotNull
	@JsonProperty("ids:scope")
	String getScope();
	/**
	"transportCertsSha256"@en

	"Separate certificates for IDS identification and transport encryption opens an attack vector for relay attacks. In order to prevent these attacks, a binding of this transport certificates to the connector is required. The inclusion of SHA256 fingerprints of currently valid transport certificates, mainly into the DAT, enables the client to relate the transport layer security with the IDS interactions."@en
	*/
	
	@NotEmpty
	@JsonProperty("ids:transportCertsSha256")
	java.util.ArrayList<? extends String> getTransportCertsSha256();
	/**
	"referringConnector"@en

	"The RDF connector entity as referred to by the DAT, with its URI included as the value. The value MUST be its accessible URI."@en
	*/
	
	
	@JsonProperty("ids:referringConnector")
	URI getReferringConnector();
	/**
	"iss"@en

	"The \'iss\' (issuer) claim identifies the principal that issued the JWT."@en
	*/
	
	
	@JsonProperty("ids:iss")
	String getIss();
	/**
	"securityProfile"@en

	"The SecurityProfile supported by the Connector."@en
	*/
	
	@NotNull
	@JsonProperty("ids:securityProfile")
	SecurityProfile getSecurityProfile();
}
