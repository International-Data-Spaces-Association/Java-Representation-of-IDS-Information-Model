package de.fraunhofer.iais.eis;

import java.math.BigInteger;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

/**
 * Default implementation of package de.fraunhofer.iais.eis.DatRequestPayload
 * 
 * The Dynamic Attribute Token (DAT) *Request* Payload is the JSON Element of any DAT containing the
 * claims of the token bearer. This payload itself is a JSON-LD encoded RDF class with a defined set
 * of attributes. These attributes are either defined by RFC 7519 or by the IDS Information Model.
 * As a direct consequence of regarding the DAT Payload as JSON-LD, *all* DAT Payloads must have
 * exactly one "@context" attribute with the IDS context URI as its value and a "@type" with
 * ids:DatPayload as its value. Note that, different to the DatPayload, the DatRequestPayload
 * contains the *self-claims* of a connector and is not yet signed by any DAPS. Consequently, no
 * other connector must accept a DatRequest object as a DAT. A DatRequest and its contained
 * DatRequestPayload is *only* intended for interactions with a DAPS and *nothing else*!
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:DatRequestPayload")
public class DatRequestPayloadImpl implements DatRequestPayload {

    @JsonProperty("@id")
    @JsonAlias({"@id", "id"})
    @NotNull
    protected URI id;

    // List of all labels of this class
    @JsonIgnore
    protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("DAT Request Payload", "en"));

    // List of all comments of this class
    @JsonIgnore
    protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral(
        "The Dynamic Attribute Token (DAT) *Request* Payload is the JSON Element of any DAT containing the claims of the token bearer. This payload itself is a JSON-LD encoded RDF class with a defined set of attributes. These attributes are either defined by RFC 7519 or by the IDS Information Model. As a direct consequence of regarding the DAT Payload as JSON-LD, *all* DAT Payloads must have exactly one \"@context\" attribute with the IDS context URI as its value and a \"@type\" with ids:DatPayload as its value. Note that, different to the DatPayload, the DatRequestPayload contains the *self-claims* of a connector and is not yet signed by any DAPS. Consequently, no other connector must accept a DatRequest object as a DAT. A DatRequest and its contained DatRequestPayload is *only* intended for interactions with a DAPS and *nothing else*!",
        "en"));

    // all classes have a generic property array
    @JsonIgnore
    protected Map<String, Object> properties;

    // instance fields as derived from the IDS Information Model ontology

    @JsonAlias({"ids:aud", "aud"})
    protected Audience _aud;

    @JsonAlias({"ids:exp", "exp"})
    protected BigInteger _exp;

    @JsonAlias({"ids:iat", "iat"})
    protected BigInteger _iat;

    @JsonAlias({"ids:iss", "iss"})
    protected String _iss;

    @JsonAlias({"ids:nbf", "nbf"})
    protected BigInteger _nbf;

    @JsonAlias({"ids:referringConnector", "referringConnector"})
    protected URI _referringConnector;

    @JsonAlias({"ids:scope", "scope"})
    protected String _scope;

    @JsonAlias({"ids:securityProfile", "securityProfile"})
    protected SecurityProfile _securityProfile;

    @JsonAlias({"ids:sub", "sub"})
    protected String _sub;

    @JsonAlias({"ids:transportCertsSha256", "transportCertsSha256"})
    protected List<String> _transportCertsSha256 = new ArrayList<>();

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

    @Override
    public String toString() {
        return this.toRdf();
    }

    public List<TypedLiteral> getLabel() {
        return this.label;
    }

    public List<TypedLiteral> getComment() {
        return this.comment;
    }

    // getter and setter for generic property map
    @JsonAnyGetter
    public Map<String, Object> getProperties() {
        if (this.properties == null)
            return null;
        Iterator<String> iter = this.properties.keySet().iterator();
        Map<String, Object> resultset = new HashMap<String, Object>();
        while (iter.hasNext()) {
            String key = iter.next();
            resultset.put(key, urifyObjects(this.properties.get(key)));
        }
        return resultset;
    }

    public Object urifyObjects(Object value) {
        if (value instanceof String && value.toString().startsWith("http")) {
            try {
                value = new URI(value.toString());
            } catch (Exception e) {
                /* do nothing */ }
        } else if (value instanceof ArrayList) {
            ArrayList<Object> result_array = new ArrayList<Object>();
            ((ArrayList) value).forEach(x -> result_array.add(urifyObjects(x)));
            return result_array;
        } else if (value instanceof Map) {
            Map<String, Object> result_map = new HashMap<String, Object>();
            ((Map) value).forEach((k, v) -> result_map.put(k.toString(), urifyObjects(v)));
            return result_map;
        }
        return value;
    }

    @JsonAnySetter
    public void setProperty(String property, Object value) {
        if (this.properties == null)
            this.properties = new HashMap<String, Object>();
        if (property.startsWith("@")) {
            return;
        } ;
        this.properties.put(property, value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this._transportCertsSha256,
            this._aud,
            this._exp,
            this._iat,
            this._iss,
            this._nbf,
            this._referringConnector,
            this._scope,
            this._sub,
            this._securityProfile);
    }

    @Override
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

    @Override
    public DatRequestPayload deepCopy() {
        DatRequestPayloadBuilder builder = new DatRequestPayloadBuilder();
        for (String item : this._transportCertsSha256) {
            builder._transportCertsSha256_(item);
        }
        builder._aud_(this._aud);
        builder._exp_(this._exp);
        builder._iat_(this._iat);
        builder._iss_(this._iss);
        builder._nbf_(this._nbf);
        if (this._referringConnector != null) {
            builder._referringConnector_(URI.create(this._referringConnector.toString()));
        }
        builder._scope_(this._scope);
        builder._sub_(this._sub);
        builder._securityProfile_(this._securityProfile);
        return builder.build();
    }

    // accessor method implementations as derived from the IDS Information Model ontology

    @Override
    public List<String> getTransportCertsSha256() {
        return _transportCertsSha256;
    }

    @Override
    public void setTransportCertsSha256(List<String> _transportCertsSha256_) {
        this._transportCertsSha256 = _transportCertsSha256_;
    }

    @Override
    public Audience getAud() {
        return _aud;
    }

    @Override
    public void setAud(Audience _aud_) {
        this._aud = _aud_;
    }

    @Override
    public BigInteger getExp() {
        return _exp;
    }

    @Override
    public void setExp(BigInteger _exp_) {
        this._exp = _exp_;
    }

    @Override
    public BigInteger getIat() {
        return _iat;
    }

    @Override
    public void setIat(BigInteger _iat_) {
        this._iat = _iat_;
    }

    @Override
    public String getIss() {
        return _iss;
    }

    @Override
    public void setIss(String _iss_) {
        this._iss = _iss_;
    }

    @Override
    public BigInteger getNbf() {
        return _nbf;
    }

    @Override
    public void setNbf(BigInteger _nbf_) {
        this._nbf = _nbf_;
    }

    @Override
    public URI getReferringConnector() {
        return _referringConnector;
    }

    @Override
    public void setReferringConnector(URI _referringConnector_) {
        this._referringConnector = _referringConnector_;
    }

    @Override
    public String getScope() {
        return _scope;
    }

    @Override
    public void setScope(String _scope_) {
        this._scope = _scope_;
    }

    @Override
    public String getSub() {
        return _sub;
    }

    @Override
    public void setSub(String _sub_) {
        this._sub = _sub_;
    }

    @Override
    public SecurityProfile getSecurityProfile() {
        return _securityProfile;
    }

    @Override
    public void setSecurityProfile(SecurityProfile _securityProfile_) {
        this._securityProfile = _securityProfile_;
    }
}
