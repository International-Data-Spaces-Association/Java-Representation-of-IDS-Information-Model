package de.fraunhofer.iais.eis.mixins;

import java.net.URI;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("UsageControlObject")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface UsageControlObjectMixin {
    @JsonProperty("ids:data")
    @NotNull
    public URI getData();

    @JsonProperty("ids:data")
    public void setData(URI _data_);

    @JsonProperty("ids:user")
    public Participant getUser();

    @JsonProperty("ids:user")
    public void setUser(Participant _user_);

    @JsonProperty("ids:source")
    public URI getSource();

    @JsonProperty("ids:source")
    public void setSource(URI _source_);

    @JsonProperty("ids:contract")
    @NotEmpty
    public List<ContractAgreement> getContract();

    @JsonProperty("ids:contract")
    public void setContract(List<ContractAgreement> _contract_);

    @JsonProperty("ids:usageDuration")
    public javax.xml.datatype.Duration getUsageDuration();

    @JsonProperty("ids:usageDuration")
    public void setUsageDuration(javax.xml.datatype.Duration _usageDuration_);

    @JsonProperty("ids:accessed")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    public XMLGregorianCalendar getAccessed();

    @JsonProperty("ids:accessed")
    public void setAccessed(XMLGregorianCalendar _accessed_);

    @JsonProperty("ids:hasState")
    public List<ArtifactState> getHasState();

    @JsonProperty("ids:hasState")
    public void setHasState(List<ArtifactState> _hasState_);

    @JsonProperty("ids:requester")
    public URI getRequester();

    @JsonProperty("ids:requester")
    public void setRequester(URI _requester_);

    @JsonProperty("ids:created")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    @NotNull
    public XMLGregorianCalendar getCreated();

    @JsonProperty("ids:created")
    public void setCreated(XMLGregorianCalendar _created_);

    @JsonProperty("ids:modified")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    public XMLGregorianCalendar getModified();

    @JsonProperty("ids:modified")
    public void setModified(XMLGregorianCalendar _modified_);

    @JsonProperty("ids:action")
    public List<Action> getAction();

    @JsonProperty("ids:action")
    public void setAction(List<Action> _action_);
}
