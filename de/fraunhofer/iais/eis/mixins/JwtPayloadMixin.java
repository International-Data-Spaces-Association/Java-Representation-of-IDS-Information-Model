package de.fraunhofer.iais.eis.mixins;

import java.math.BigInteger;
import java.net.URI;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("JwtPayload")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = DatPayload.class),
    @JsonSubTypes.Type(value = DatRequestPayload.class)
})
public interface JwtPayloadMixin {
    @JsonProperty("ids:transportCertsSha256")
    @NotEmpty
    public List<String> getTransportCertsSha256();

    @JsonProperty("ids:transportCertsSha256")
    public void setTransportCertsSha256(List<String> _transportCertsSha256_);

    @JsonProperty("ids:aud")
    @NotNull
    public Audience getAud();

    @JsonProperty("ids:aud")
    public void setAud(Audience _aud_);

    @JsonProperty("ids:exp")
    @NotNull
    public BigInteger getExp();

    @JsonProperty("ids:exp")
    public void setExp(BigInteger _exp_);

    @JsonProperty("ids:iat")
    @NotNull
    public BigInteger getIat();

    @JsonProperty("ids:iat")
    public void setIat(BigInteger _iat_);

    @JsonProperty("ids:iss")
    public String getIss();

    @JsonProperty("ids:iss")
    public void setIss(String _iss_);

    @JsonProperty("ids:nbf")
    @NotNull
    public BigInteger getNbf();

    @JsonProperty("ids:nbf")
    public void setNbf(BigInteger _nbf_);

    @JsonProperty("ids:referringConnector")
    public URI getReferringConnector();

    @JsonProperty("ids:referringConnector")
    public void setReferringConnector(URI _referringConnector_);

    @JsonProperty("ids:scope")
    @NotNull
    public String getScope();

    @JsonProperty("ids:scope")
    public void setScope(String _scope_);

    @JsonProperty("ids:sub")
    @NotNull
    public String getSub();

    @JsonProperty("ids:sub")
    public void setSub(String _sub_);

    @JsonProperty("ids:securityProfile")
    @NotNull
    public SecurityProfile getSecurityProfile();

    @JsonProperty("ids:securityProfile")
    public void setSecurityProfile(SecurityProfile _securityProfile_);
}
