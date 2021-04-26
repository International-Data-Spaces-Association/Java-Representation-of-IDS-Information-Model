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
* "DAT Request Payload"@en
* "The Dynamic Attribute Token (DAT) *Request* Payload is the JSON Element of any DAT containing the claims of the token bearer. This payload itself is a JSON-LD encoded RDF class with a defined set of attributes. These attributes are either defined by RFC 7519 or by the IDS Information Model. As a direct consequence of regarding the DAT Payload as JSON-LD, *all* DAT Payloads must have exactly one \"@context\" attribute with the IDS context URI as its value and a \"@type\" with ids:DatPayload as its value. Note that, different to the DatPayload, the DatRequestPayload contains the *self-claims* of a connector and is not yet signed by any DAPS. Consequently, no other connector must accept a DatRequest object as a DAT. A DatRequest and its contained DatRequestPayload is *only* intended for interactions with a DAPS and *nothing else*!"@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:DatRequestPayload")
public class DatRequestPayloadImpl implements Serializable, DatRequestPayload {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("DAT Request Payload", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("The Dynamic Attribute Token (DAT) *Request* Payload is the JSON Element of any DAT containing the claims of the token bearer. This payload itself is a JSON-LD encoded RDF class with a defined set of attributes. These attributes are either defined by RFC 7519 or by the IDS Information Model. As a direct consequence of regarding the DAT Payload as JSON-LD, *all* DAT Payloads must have exactly one \"@context\" attribute with the IDS context URI as its value and a \"@type\" with ids:DatPayload as its value. Note that, different to the DatPayload, the DatRequestPayload contains the *self-claims* of a connector and is not yet signed by any DAPS. Consequently, no other connector must accept a DatRequest object as a DAT. A DatRequest and its contained DatRequestPayload is *only* intended for interactions with a DAPS and *nothing else*!", "en"));

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
	protected List<String> _transportCertsSha256;


	// no manual construction
	protected DatRequestPayloadImpl() {
		id = VocabUtil.getInstance().createRandomUrl("datRequestPayload");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	public List<TypedLiteral> getLabel() {
		return this.label;
	}

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
	public int hashCode() {
		return Objects.hash(new Object[]{this._transportCertsSha256,
			this._aud,
			this._exp,
			this._iat,
			this._iss,
			this._nbf,
			this._referringConnector,
			this._scope,
			this._sub,
			this._securityProfile});
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DatRequestPayloadImpl other = (DatRequestPayloadImpl) obj;
			return Objects.equals(this._transportCertsSha256, other._transportCertsSha256) &&
				Objects.equals(this._aud, other._aud) &&
				Objects.equals(this._exp, other._exp) &&
				Objects.equals(this._iat, other._iat) &&
				Objects.equals(this._iss, other._iss) &&
				Objects.equals(this._nbf, other._nbf) &&
				Objects.equals(this._referringConnector, other._referringConnector) &&
				Objects.equals(this._scope, other._scope) &&
				Objects.equals(this._sub, other._sub) &&
				Objects.equals(this._securityProfile, other._securityProfile);
		}
	}


	// accessor method implementations as derived from the IDSA Information Model ontology



	@NotEmpty
	@JsonProperty("ids:transportCertsSha256")
	final public List<String> getTransportCertsSha256() {
		return _transportCertsSha256;
	}
	
	final public void setTransportCertsSha256 (List<String> _transportCertsSha256_) {
		this._transportCertsSha256 = _transportCertsSha256_;
	}

	@NotNull
	@JsonProperty("ids:aud")
	final public Audience getAud() {
		return _aud;
	}
	
	final public void setAud (Audience _aud_) {
		this._aud = _aud_;
	}

	@NotNull
	@JsonProperty("ids:exp")
	final public BigInteger getExp() {
		return _exp;
	}
	
	final public void setExp (BigInteger _exp_) {
		this._exp = _exp_;
	}

	@NotNull
	@JsonProperty("ids:iat")
	final public BigInteger getIat() {
		return _iat;
	}
	
	final public void setIat (BigInteger _iat_) {
		this._iat = _iat_;
	}

	@JsonProperty("ids:iss")
	final public String getIss() {
		return _iss;
	}
	
	final public void setIss (String _iss_) {
		this._iss = _iss_;
	}

	@NotNull
	@JsonProperty("ids:nbf")
	final public BigInteger getNbf() {
		return _nbf;
	}
	
	final public void setNbf (BigInteger _nbf_) {
		this._nbf = _nbf_;
	}

	@JsonProperty("ids:referringConnector")
	final public URI getReferringConnector() {
		return _referringConnector;
	}
	
	final public void setReferringConnector (URI _referringConnector_) {
		this._referringConnector = _referringConnector_;
	}

	@NotNull
	@JsonProperty("ids:scope")
	final public String getScope() {
		return _scope;
	}
	
	final public void setScope (String _scope_) {
		this._scope = _scope_;
	}

	@NotNull
	@JsonProperty("ids:sub")
	final public String getSub() {
		return _sub;
	}
	
	final public void setSub (String _sub_) {
		this._sub = _sub_;
	}

	@NotNull
	@JsonProperty("ids:securityProfile")
	final public SecurityProfile getSecurityProfile() {
		return _securityProfile;
	}
	
	final public void setSecurityProfile (SecurityProfile _securityProfile_) {
		this._securityProfile = _securityProfile_;
	}
}
