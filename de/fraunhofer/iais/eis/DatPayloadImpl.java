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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

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
* "DAT Payload"@en
* "The Dynamic Attribute Token (DAT) Payload is the JSON Element of any DAT containing the claims of the token bearer. This payload itself is a JSON-LD encoded RDF class with a defined set of attributes. These attributes are either defined by RFC 7519 or by the IDS Information Model. As a direct consequence of regarding the DAT Payload as JSON-LD, *all* DAT Payloads must have exactly one \"@context\" attribute with the IDS context URI as its value and a \"@type\" with ids:DatPayload as its value."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:DatPayload")
public class DatPayloadImpl implements Serializable, DatPayload {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("DAT Payload", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("The Dynamic Attribute Token (DAT) Payload is the JSON Element of any DAT containing the claims of the token bearer. This payload itself is a JSON-LD encoded RDF class with a defined set of attributes. These attributes are either defined by RFC 7519 or by the IDS Information Model. As a direct consequence of regarding the DAT Payload as JSON-LD, *all* DAT Payloads must have exactly one \"@context\" attribute with the IDS context URI as its value and a \"@type\" with ids:DatPayload as its value.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDSA Information Model ontology

	/**
	* "aud"@en
	* "The \'aud\' (audience) claim identifies the recipients that the JWT is intended for."@en
	*/
	@NotNull
	@JsonAlias({"ids:aud", "aud"})
	protected Audience _aud;


	/**
	* "exp"@en
	* "The \'exp\' (expiration time) claim identifies the expiration time on or after which the JWT MUST NOT be accepted for processing."@en
	*/
	@NotNull
	@JsonAlias({"ids:exp", "exp"})
	protected BigInteger _exp;


	/**
	* "extended guarantee"@en
	* "Reference to a security guarantee that, if used in combination with a security profile instance, overrides the respective guarantee of the given predefined instance."@en
	*/
	@JsonAlias({"ids:extendedGuarantee", "extendedGuarantee"})
	protected ArrayList<? extends SecurityGuarantee> _extendedGuarantee;


	/**
	* "iat"@en
	* "The \'iat\' (issued at) claim contains the point in time when the JWT was created."@en
	*/
	@NotNull
	@JsonAlias({"ids:iat", "iat"})
	protected BigInteger _iat;


	/**
	* "iss"@en
	* "The \'iss\' (issuer) claim identifies the principal that issued the JWT."@en
	*/
	@NotNull
	@JsonAlias({"ids:iss", "iss"})
	protected String _iss;


	/**
	* "nbf"@en
	* "The \'aud\' (audience) claim identifies the recipients that the JWT is intended for."@en
	*/
	@NotNull
	@JsonAlias({"ids:nbf", "nbf"})
	protected BigInteger _nbf;


	/**
	* "referringConnector"@en
	* "The RDF connector entity as referred to by the DAT, with its URI included as the value. The value MUST be its accessible URI."@en
	*/
	@NotNull
	@JsonAlias({"ids:referringConnector", "referringConnector"})
	protected URI _referringConnector;


	/**
	* "scope"@en
	* "Currently, the scope is limited to \'Connector\' but can be used for scoping purposes in the future. Scope is currently fixed to \'https://w3id.org/idsa/core/Connector\'."@en
	*/
	@NotNull
	@JsonAlias({"ids:scope", "scope"})
	protected String _scope;


	/**
	* "securityProfile"@en
	* "The SecurityProfile supported by the Connector."@en
	*/
	@NotNull
	@JsonAlias({"ids:securityProfile", "securityProfile"})
	protected SecurityProfile _securityProfile;


	/**
	* "sub"@en
	* "The \'sub\' (subject) claim identifies the principal that is the subject of the JWT."@en
	*/
	@NotNull
	@JsonAlias({"ids:sub", "sub"})
	protected String _sub;


	/**
	* "transportCertsSha256"@en
	* "Separate certificates for IDS identification and transport encryption opens an attack vector for relay attacks. In order to prevent these attacks, a binding of this transport certificates to the connector is required. The inclusion of SHA256 fingerprints of currently valid transport certificates, mainly into the DAT, enables the client to relate the transport layer security with the IDS interactions."@en
	*/
	@NotEmpty
	@JsonAlias({"ids:transportCertsSha256", "transportCertsSha256"})
	protected ArrayList<? extends String> _transportCertsSha256;


	// no manual construction
	protected DatPayloadImpl() {
		id = VocabUtil.getInstance().createRandomUrl("datPayload");
	}

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel() {
		return this.label;
	}

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	public List<TypedLiteral> getComment() {
		return this.comment;
	}

	// getter and setter for generic property map
	@JsonAnyGetter
	public Map<String,Object> getProperties() {
		if (this.properties == null) return null;
		Iterator<String> iter = this.properties.keySet().iterator();
		Map<String,Object> resultset = new HashMap<String, Object>();
		while (iter.hasNext()) {
			String key = iter.next();
			resultset.put(key,urifyObjects(this.properties.get(key)));
		}
		return resultset ;
	}

	public Object urifyObjects(Object value) {
		if (value instanceof String && value.toString().startsWith("http")) {
			try {
				value = new URI(value.toString());
			} catch (Exception e) { /* do nothing */ }
		} else if (value instanceof ArrayList) {
			ArrayList<Object> result_array = new ArrayList<Object>();
			((ArrayList) value).forEach(x -> result_array.add(urifyObjects(x)));
			return result_array;
		} else if (value instanceof Map) {
			Map<String, Object> result_map = new HashMap<String, Object>();
			((Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	@JsonAnySetter
	public void setProperty(String property, Object value) {
		if (this.properties == null) this.properties = new HashMap<String,Object>();
		if (property.startsWith("@")) {return ;};
		this.properties.put(property, value) ;
	}

	// accessor method implementations as derived from the IDSA Information Model ontology


	/**
	* "Reference to a security guarantee that, if used in combination with a security profile instance, overrides the respective guarantee of the given predefined instance."@en
	* @return Returns the ArrayList of SecurityGuarantee for the property extendedGuarantee.
	* More information under https://w3id.org/idsa/core/extendedGuarantee
	*/
	@JsonProperty("ids:extendedGuarantee")
	final public ArrayList<? extends SecurityGuarantee> getExtendedGuarantee() {
		return _extendedGuarantee;
	}

	
	/**
	* "Reference to a security guarantee that, if used in combination with a security profile instance, overrides the respective guarantee of the given predefined instance."@en
	* @param _extendedGuarantee_ desired value for the property extendedGuarantee.
	* More information under https://w3id.org/idsa/core/extendedGuarantee
	*/
	final public void setExtendedGuarantee (ArrayList<? extends SecurityGuarantee> _extendedGuarantee_) {
		this._extendedGuarantee = _extendedGuarantee_;
	}

	/**
	* "The \'aud\' (audience) claim identifies the recipients that the JWT is intended for."@en
	* @return Returns the Audience for the property aud.
	* More information under https://w3id.org/idsa/core/aud
	*/
	@NotNull
	@JsonProperty("ids:aud")
	final public Audience getAud() {
		return _aud;
	}

	
	/**
	* "The \'aud\' (audience) claim identifies the recipients that the JWT is intended for."@en
	* @param _aud_ desired value for the property aud.
	* More information under https://w3id.org/idsa/core/aud
	*/
	final public void setAud (Audience _aud_) {
		this._aud = _aud_;
	}

	/**
	* "The \'sub\' (subject) claim identifies the principal that is the subject of the JWT."@en
	* @return Returns the String for the property sub.
	* More information under https://w3id.org/idsa/core/sub
	*/
	@NotNull
	@JsonProperty("ids:sub")
	final public String getSub() {
		return _sub;
	}

	
	/**
	* "The \'sub\' (subject) claim identifies the principal that is the subject of the JWT."@en
	* @param _sub_ desired value for the property sub.
	* More information under https://w3id.org/idsa/core/sub
	*/
	final public void setSub (String _sub_) {
		this._sub = _sub_;
	}

	/**
	* "The \'aud\' (audience) claim identifies the recipients that the JWT is intended for."@en
	* @return Returns the BigInteger for the property nbf.
	* More information under https://w3id.org/idsa/core/nbf
	*/
	@NotNull
	@JsonProperty("ids:nbf")
	final public BigInteger getNbf() {
		return _nbf;
	}

	
	/**
	* "The \'aud\' (audience) claim identifies the recipients that the JWT is intended for."@en
	* @param _nbf_ desired value for the property nbf.
	* More information under https://w3id.org/idsa/core/nbf
	*/
	final public void setNbf (BigInteger _nbf_) {
		this._nbf = _nbf_;
	}

	/**
	* "The \'exp\' (expiration time) claim identifies the expiration time on or after which the JWT MUST NOT be accepted for processing."@en
	* @return Returns the BigInteger for the property exp.
	* More information under https://w3id.org/idsa/core/exp
	*/
	@NotNull
	@JsonProperty("ids:exp")
	final public BigInteger getExp() {
		return _exp;
	}

	
	/**
	* "The \'exp\' (expiration time) claim identifies the expiration time on or after which the JWT MUST NOT be accepted for processing."@en
	* @param _exp_ desired value for the property exp.
	* More information under https://w3id.org/idsa/core/exp
	*/
	final public void setExp (BigInteger _exp_) {
		this._exp = _exp_;
	}

	/**
	* "The \'iat\' (issued at) claim contains the point in time when the JWT was created."@en
	* @return Returns the BigInteger for the property iat.
	* More information under https://w3id.org/idsa/core/iat
	*/
	@NotNull
	@JsonProperty("ids:iat")
	final public BigInteger getIat() {
		return _iat;
	}

	
	/**
	* "The \'iat\' (issued at) claim contains the point in time when the JWT was created."@en
	* @param _iat_ desired value for the property iat.
	* More information under https://w3id.org/idsa/core/iat
	*/
	final public void setIat (BigInteger _iat_) {
		this._iat = _iat_;
	}

	/**
	* "Currently, the scope is limited to \'Connector\' but can be used for scoping purposes in the future. Scope is currently fixed to \'https://w3id.org/idsa/core/Connector\'."@en
	* @return Returns the String for the property scope.
	* More information under https://w3id.org/idsa/core/scope
	*/
	@NotNull
	@JsonProperty("ids:scope")
	final public String getScope() {
		return _scope;
	}

	
	/**
	* "Currently, the scope is limited to \'Connector\' but can be used for scoping purposes in the future. Scope is currently fixed to \'https://w3id.org/idsa/core/Connector\'."@en
	* @param _scope_ desired value for the property scope.
	* More information under https://w3id.org/idsa/core/scope
	*/
	final public void setScope (String _scope_) {
		this._scope = _scope_;
	}

	/**
	* "Separate certificates for IDS identification and transport encryption opens an attack vector for relay attacks. In order to prevent these attacks, a binding of this transport certificates to the connector is required. The inclusion of SHA256 fingerprints of currently valid transport certificates, mainly into the DAT, enables the client to relate the transport layer security with the IDS interactions."@en
	* @return Returns the ArrayList of String for the property transportCertsSha256.
	* More information under https://w3id.org/idsa/core/transportCertsSha256
	*/
	@NotEmpty
	@JsonProperty("ids:transportCertsSha256")
	final public ArrayList<? extends String> getTransportCertsSha256() {
		return _transportCertsSha256;
	}

	
	/**
	* "Separate certificates for IDS identification and transport encryption opens an attack vector for relay attacks. In order to prevent these attacks, a binding of this transport certificates to the connector is required. The inclusion of SHA256 fingerprints of currently valid transport certificates, mainly into the DAT, enables the client to relate the transport layer security with the IDS interactions."@en
	* @param _transportCertsSha256_ desired value for the property transportCertsSha256.
	* More information under https://w3id.org/idsa/core/transportCertsSha256
	*/
	final public void setTransportCertsSha256 (ArrayList<? extends String> _transportCertsSha256_) {
		this._transportCertsSha256 = _transportCertsSha256_;
	}

	/**
	* "The RDF connector entity as referred to by the DAT, with its URI included as the value. The value MUST be its accessible URI."@en
	* @return Returns the URI for the property referringConnector.
	* More information under https://w3id.org/idsa/core/referringConnector
	*/
	@NotNull
	@JsonProperty("ids:referringConnector")
	final public URI getReferringConnector() {
		return _referringConnector;
	}

	
	/**
	* "The RDF connector entity as referred to by the DAT, with its URI included as the value. The value MUST be its accessible URI."@en
	* @param _referringConnector_ desired value for the property referringConnector.
	* More information under https://w3id.org/idsa/core/referringConnector
	*/
	final public void setReferringConnector (URI _referringConnector_) {
		this._referringConnector = _referringConnector_;
	}

	/**
	* "The \'iss\' (issuer) claim identifies the principal that issued the JWT."@en
	* @return Returns the String for the property iss.
	* More information under https://w3id.org/idsa/core/iss
	*/
	@NotNull
	@JsonProperty("ids:iss")
	final public String getIss() {
		return _iss;
	}

	
	/**
	* "The \'iss\' (issuer) claim identifies the principal that issued the JWT."@en
	* @param _iss_ desired value for the property iss.
	* More information under https://w3id.org/idsa/core/iss
	*/
	final public void setIss (String _iss_) {
		this._iss = _iss_;
	}

	/**
	* "The SecurityProfile supported by the Connector."@en
	* @return Returns the SecurityProfile for the property securityProfile.
	* More information under https://w3id.org/idsa/core/securityProfile
	*/
	@NotNull
	@JsonProperty("ids:securityProfile")
	final public SecurityProfile getSecurityProfile() {
		return _securityProfile;
	}

	
	/**
	* "The SecurityProfile supported by the Connector."@en
	* @param _securityProfile_ desired value for the property securityProfile.
	* More information under https://w3id.org/idsa/core/securityProfile
	*/
	final public void setSecurityProfile (SecurityProfile _securityProfile_) {
		this._securityProfile = _securityProfile_;
	}
}
