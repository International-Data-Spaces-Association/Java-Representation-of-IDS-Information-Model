package de.fraunhofer.iais.eis.mixins;

import java.net.URI;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Message")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = RequestMessage.class),
    @JsonSubTypes.Type(value = ResponseMessage.class),
    @JsonSubTypes.Type(value = NotificationMessage.class)
})
public interface MessageMixin {
    @JsonProperty("ids:modelVersion")
    @NotNull
    public String getModelVersion();

    @JsonProperty("ids:modelVersion")
    public void setModelVersion(String _modelVersion_);

    @JsonProperty("ids:issued")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    @NotNull
    public XMLGregorianCalendar getIssued();

    @JsonProperty("ids:issued")
    public void setIssued(XMLGregorianCalendar _issued_);

    @JsonProperty("ids:correlationMessage")
    public URI getCorrelationMessage();

    @JsonProperty("ids:correlationMessage")
    public void setCorrelationMessage(URI _correlationMessage_);

    @JsonProperty("ids:issuerConnector")
    @NotNull
    public URI getIssuerConnector();

    @JsonProperty("ids:issuerConnector")
    public void setIssuerConnector(URI _issuerConnector_);

    @JsonProperty("ids:recipientConnector")
    public List<URI> getRecipientConnector();

    @JsonProperty("ids:recipientConnector")
    public void setRecipientConnector(List<URI> _recipientConnector_);

    @JsonProperty("ids:senderAgent")
    @NotNull
    public URI getSenderAgent();

    @JsonProperty("ids:senderAgent")
    public void setSenderAgent(URI _senderAgent_);

    @JsonProperty("ids:recipientAgent")
    public List<URI> getRecipientAgent();

    @JsonProperty("ids:recipientAgent")
    public void setRecipientAgent(List<URI> _recipientAgent_);

    @JsonProperty("ids:securityToken")
    @NotNull
    public DynamicAttributeToken getSecurityToken();

    @JsonProperty("ids:securityToken")
    public void setSecurityToken(DynamicAttributeToken _securityToken_);

    @JsonProperty("ids:authorizationToken")
    public Token getAuthorizationToken();

    @JsonProperty("ids:authorizationToken")
    public void setAuthorizationToken(Token _authorizationToken_);

    @JsonProperty("ids:transferContract")
    public URI getTransferContract();

    @JsonProperty("ids:transferContract")
    public void setTransferContract(URI _transferContract_);

    @JsonProperty("ids:contentVersion")
    public String getContentVersion();

    @JsonProperty("ids:contentVersion")
    public void setContentVersion(String _contentVersion_);
}
