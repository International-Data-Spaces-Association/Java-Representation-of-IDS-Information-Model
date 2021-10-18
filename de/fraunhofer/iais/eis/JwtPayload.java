package de.fraunhofer.iais.eis;

import java.math.BigInteger;
import java.net.URI;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The payload of an JSON Web Token as a RDF class. Is used as the common parent of e.g., DatPayload
 * and DatRequestPayload.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = DatPayload.class),
    @JsonSubTypes.Type(value = DatRequestPayload.class)
})
public interface JwtPayload extends ModelClass {

    // standard methods

    @Beta
    public JwtPayload deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Separate certificates for IDS identification and transport encryption opens an attack vector for
     * relay attacks. In order to prevent these attacks, a binding of this transport certificates to the
     * connector is required. The inclusion of SHA256 fingerprints of currently valid transport
     * certificates, mainly into the DAT, enables the client to relate the transport layer security with
     * the IDS interactions.
     *
     * More information under https://w3id.org/idsa/core/transportCertsSha256
     *
     * @return Returns the List of Strings for the property _transportCertsSha256.
     */
    @NotEmpty
    @JsonProperty("ids:transportCertsSha256")
    List<String> getTransportCertsSha256();

    /**
     * Separate certificates for IDS identification and transport encryption opens an attack vector for
     * relay attacks. In order to prevent these attacks, a binding of this transport certificates to the
     * connector is required. The inclusion of SHA256 fingerprints of currently valid transport
     * certificates, mainly into the DAT, enables the client to relate the transport layer security with
     * the IDS interactions.
     *
     * More information under https://w3id.org/idsa/core/transportCertsSha256
     *
     * @param _transportCertsSha256_ desired value for the property _transportCertsSha256.
     */
    void setTransportCertsSha256(List<String> _transportCertsSha256_);

    /**
     * The 'aud' (audience) claim identifies the recipients that the JWT is intended for.
     *
     * More information under https://w3id.org/idsa/core/aud
     *
     * @return Returns the Audience for the property _aud.
     */
    @NotNull
    @JsonProperty("ids:aud")
    Audience getAud();

    /**
     * The 'aud' (audience) claim identifies the recipients that the JWT is intended for.
     *
     * More information under https://w3id.org/idsa/core/aud
     *
     * @param _aud_ desired value for the property _aud.
     */
    void setAud(Audience _aud_);

    /**
     * The 'exp' (expiration time) claim identifies the expiration time on or after which the JWT MUST
     * NOT be accepted for processing.
     *
     * More information under https://w3id.org/idsa/core/exp
     *
     * @return Returns the BigInteger for the property _exp.
     */
    @NotNull
    @JsonProperty("ids:exp")
    BigInteger getExp();

    /**
     * The 'exp' (expiration time) claim identifies the expiration time on or after which the JWT MUST
     * NOT be accepted for processing.
     *
     * More information under https://w3id.org/idsa/core/exp
     *
     * @param _exp_ desired value for the property _exp.
     */
    void setExp(BigInteger _exp_);

    /**
     * The 'iat' (issued at) claim contains the point in time when the JWT was created.
     *
     * More information under https://w3id.org/idsa/core/iat
     *
     * @return Returns the BigInteger for the property _iat.
     */
    @NotNull
    @JsonProperty("ids:iat")
    BigInteger getIat();

    /**
     * The 'iat' (issued at) claim contains the point in time when the JWT was created.
     *
     * More information under https://w3id.org/idsa/core/iat
     *
     * @param _iat_ desired value for the property _iat.
     */
    void setIat(BigInteger _iat_);

    /**
     * The 'iss' (issuer) claim identifies the principal that issued the JWT.
     *
     * More information under https://w3id.org/idsa/core/iss
     *
     * @return Returns the String for the property _iss.
     */
    @JsonProperty("ids:iss")
    String getIss();

    /**
     * The 'iss' (issuer) claim identifies the principal that issued the JWT.
     *
     * More information under https://w3id.org/idsa/core/iss
     *
     * @param _iss_ desired value for the property _iss.
     */
    void setIss(String _iss_);

    /**
     * The 'aud' (audience) claim identifies the recipients that the JWT is intended for.
     *
     * More information under https://w3id.org/idsa/core/nbf
     *
     * @return Returns the BigInteger for the property _nbf.
     */
    @NotNull
    @JsonProperty("ids:nbf")
    BigInteger getNbf();

    /**
     * The 'aud' (audience) claim identifies the recipients that the JWT is intended for.
     *
     * More information under https://w3id.org/idsa/core/nbf
     *
     * @param _nbf_ desired value for the property _nbf.
     */
    void setNbf(BigInteger _nbf_);

    /**
     * The RDF connector entity as referred to by the DAT, with its URI included as the value. The value
     * MUST be its accessible URI.
     *
     * More information under https://w3id.org/idsa/core/referringConnector
     *
     * @return Returns the URI for the property _referringConnector.
     */
    @JsonProperty("ids:referringConnector")
    URI getReferringConnector();

    /**
     * The RDF connector entity as referred to by the DAT, with its URI included as the value. The value
     * MUST be its accessible URI.
     *
     * More information under https://w3id.org/idsa/core/referringConnector
     *
     * @param _referringConnector_ desired value for the property _referringConnector.
     */
    void setReferringConnector(URI _referringConnector_);

    /**
     * Currently, the scope is limited to 'Connector' but can be used for scoping purposes in the
     * future. Scope is currently fixed to 'https://w3id.org/idsa/core/Connector'.
     *
     * More information under https://w3id.org/idsa/core/scope
     *
     * @return Returns the String for the property _scope.
     */
    @NotNull
    @JsonProperty("ids:scope")
    String getScope();

    /**
     * Currently, the scope is limited to 'Connector' but can be used for scoping purposes in the
     * future. Scope is currently fixed to 'https://w3id.org/idsa/core/Connector'.
     *
     * More information under https://w3id.org/idsa/core/scope
     *
     * @param _scope_ desired value for the property _scope.
     */
    void setScope(String _scope_);

    /**
     * The 'sub' (subject) claim identifies the principal that is the subject of the JWT.
     *
     * More information under https://w3id.org/idsa/core/sub
     *
     * @return Returns the String for the property _sub.
     */
    @NotNull
    @JsonProperty("ids:sub")
    String getSub();

    /**
     * The 'sub' (subject) claim identifies the principal that is the subject of the JWT.
     *
     * More information under https://w3id.org/idsa/core/sub
     *
     * @param _sub_ desired value for the property _sub.
     */
    void setSub(String _sub_);

    /**
     * The SecurityProfile supported by the Connector.
     *
     * More information under https://w3id.org/idsa/core/securityProfile
     *
     * @return Returns the SecurityProfile for the property _securityProfile.
     */
    @NotNull
    @JsonProperty("ids:securityProfile")
    SecurityProfile getSecurityProfile();

    /**
     * The SecurityProfile supported by the Connector.
     *
     * More information under https://w3id.org/idsa/core/securityProfile
     *
     * @param _securityProfile_ desired value for the property _securityProfile.
     */
    void setSecurityProfile(SecurityProfile _securityProfile_);

}
