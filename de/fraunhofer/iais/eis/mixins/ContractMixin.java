package de.fraunhofer.iais.eis.mixins;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Contract")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ContractOffer.class),
    @JsonSubTypes.Type(value = ContractAgreement.class),
    @JsonSubTypes.Type(value = ContractRequest.class)
})
public interface ContractMixin {
    @JsonProperty("ids:contractStart")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    public XMLGregorianCalendar getContractStart();

    @JsonProperty("ids:contractStart")
    public void setContractStart(XMLGregorianCalendar _contractStart_);

    @JsonProperty("ids:contractEnd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    public XMLGregorianCalendar getContractEnd();

    @JsonProperty("ids:contractEnd")
    public void setContractEnd(XMLGregorianCalendar _contractEnd_);

    @JsonProperty("ids:contractDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    public XMLGregorianCalendar getContractDate();

    @JsonProperty("ids:contractDate")
    public void setContractDate(XMLGregorianCalendar _contractDate_);

    @JsonProperty("ids:provider")
    public URI getProvider();

    @JsonProperty("ids:provider")
    public void setProvider(URI _provider_);

    @JsonProperty("ids:consumer")
    public URI getConsumer();

    @JsonProperty("ids:consumer")
    public void setConsumer(URI _consumer_);

    @JsonProperty("ids:contractDocument")
    public TextResource getContractDocument();

    @JsonProperty("ids:contractDocument")
    public void setContractDocument(TextResource _contractDocument_);

    @JsonProperty("ids:contractAnnex")
    public Resource getContractAnnex();

    @JsonProperty("ids:contractAnnex")
    public void setContractAnnex(Resource _contractAnnex_);

    @JsonProperty("ids:permission")
    public List<Permission> getPermission();

    @JsonProperty("ids:permission")
    public void setPermission(List<Permission> _permission_);

    @JsonProperty("ids:prohibition")
    public List<Prohibition> getProhibition();

    @JsonProperty("ids:prohibition")
    public void setProhibition(List<Prohibition> _prohibition_);

    @JsonProperty("ids:obligation")
    public List<Duty> getObligation();

    @JsonProperty("ids:obligation")
    public void setObligation(List<Duty> _obligation_);
}
