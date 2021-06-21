package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
* "JWT Payload"@en
* "The payload of an JSON Web Token as a RDF class. Is used as the common parent of e.g., DatPayload and DatRequestPayload."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = DatPayload.class),
	@JsonSubTypes.Type(value = DatRequestPayload.class)
})
public interface JwtPayload {

	// standard methods

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	@NotNull
	public URI getId();

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel();

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	public List<TypedLiteral> getComment();

	public String toRdf();

	// getter and setter for generic property map
	public Map<String,Object> getProperties();
	public void setProperty(String property, Object value);

	// accessor methods as derived from the IDSA Information Model ontology


	/**
	* "Separate certificates for IDS identification and transport encryption opens an attack vector for relay attacks. In order to prevent these attacks, a binding of this transport certificates to the connector is required. The inclusion of SHA256 fingerprints of currently valid transport certificates, mainly into the DAT, enables the client to relate the transport layer security with the IDS interactions."@en
	* @return Returns the List of Strings for the property _transportCertsSha256.
	* More information under https://w3id.org/idsa/core/transportCertsSha256
	*/
	@NotEmpty
	@JsonProperty("ids:transportCertsSha256")
	public List<String> getTransportCertsSha256();

	/**
	* "The \'aud\' (audience) claim identifies the recipients that the JWT is intended for."@en
	* @return Returns the Audience for the property _aud.
	* More information under https://w3id.org/idsa/core/aud
	*/
	@NotNull
	@JsonProperty("ids:aud")
	public Audience getAud();

	/**
	* "The \'exp\' (expiration time) claim identifies the expiration time on or after which the JWT MUST NOT be accepted for processing."@en
	* @return Returns the BigInteger for the property _exp.
	* More information under https://w3id.org/idsa/core/exp
	*/
	@NotNull
	@JsonProperty("ids:exp")
	public BigInteger getExp();

	/**
	* "The \'iat\' (issued at) claim contains the point in time when the JWT was created."@en
	* @return Returns the BigInteger for the property _iat.
	* More information under https://w3id.org/idsa/core/iat
	*/
	@NotNull
	@JsonProperty("ids:iat")
	public BigInteger getIat();

	/**
	* "The \'iss\' (issuer) claim identifies the principal that issued the JWT."@en
	* @return Returns the String for the property _iss.
	* More information under https://w3id.org/idsa/core/iss
	*/
	@JsonProperty("ids:iss")
	public String getIss();

	/**
	* "The \'aud\' (audience) claim identifies the recipients that the JWT is intended for."@en
	* @return Returns the BigInteger for the property _nbf.
	* More information under https://w3id.org/idsa/core/nbf
	*/
	@NotNull
	@JsonProperty("ids:nbf")
	public BigInteger getNbf();

	/**
	* "The RDF connector entity as referred to by the DAT, with its URI included as the value. The value MUST be its accessible URI."@en
	* @return Returns the URI for the property _referringConnector.
	* More information under https://w3id.org/idsa/core/referringConnector
	*/
	@JsonProperty("ids:referringConnector")
	public URI getReferringConnector();

	/**
	* "Currently, the scope is limited to \'Connector\' but can be used for scoping purposes in the future. Scope is currently fixed to \'https://w3id.org/idsa/core/Connector\'."@en
	* @return Returns the String for the property _scope.
	* More information under https://w3id.org/idsa/core/scope
	*/
	@NotNull
	@JsonProperty("ids:scope")
	public String getScope();

	/**
	* "The \'sub\' (subject) claim identifies the principal that is the subject of the JWT."@en
	* @return Returns the String for the property _sub.
	* More information under https://w3id.org/idsa/core/sub
	*/
	@NotNull
	@JsonProperty("ids:sub")
	public String getSub();

	/**
	* "The SecurityProfile supported by the Connector."@en
	* @return Returns the SecurityProfile for the property _securityProfile.
	* More information under https://w3id.org/idsa/core/securityProfile
	*/
	@NotNull
	@JsonProperty("ids:securityProfile")
	public SecurityProfile getSecurityProfile();

}
