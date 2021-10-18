package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

/**
 * Default implementation of package de.fraunhofer.iais.eis.RejectionMessage
 * 
 * Rejection messages are specialized response messages that notify the sender of a message that
 * processing of this message has failed.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:RejectionMessage")
public class RejectionMessageImpl implements RejectionMessage {

    @JsonProperty("@id")
    @JsonAlias({"@id", "id"})
    @NotNull
    protected URI id;

    // List of all labels of this class
    @JsonIgnore
    protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Rejection Message", "en"));

    // List of all comments of this class
    @JsonIgnore
    protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral(
        "Rejection messages are specialized response messages that notify the sender of a message that processing of this message has failed.",
        "en"));

    // all classes have a generic property array
    @JsonIgnore
    protected Map<String, Object> properties;

    // instance fields as derived from the IDS Information Model ontology

    @JsonAlias({"ids:authorizationToken", "authorizationToken"})
    protected Token _authorizationToken;

    @JsonAlias({"ids:contentVersion", "contentVersion"})
    protected String _contentVersion;

    @NotNull
    @JsonAlias({"ids:correlationMessage", "correlationMessage"})
    protected URI _correlationMessage;

    @NotNull
    @JsonAlias({"ids:issued", "issued"})
    protected XMLGregorianCalendar _issued;

    @NotNull
    @JsonAlias({"ids:issuerConnector", "issuerConnector"})
    protected URI _issuerConnector;

    @NotNull
    @JsonAlias({"ids:modelVersion", "modelVersion"})
    protected String _modelVersion;

    @JsonAlias({"ids:recipientAgent", "recipientAgent"})
    protected List<URI> _recipientAgent = new ArrayList<>();

    @JsonAlias({"ids:recipientConnector", "recipientConnector"})
    protected List<URI> _recipientConnector = new ArrayList<>();

    @JsonAlias({"ids:rejectionReason", "rejectionReason"})
    protected RejectionReason _rejectionReason;

    @NotNull
    @JsonAlias({"ids:securityToken", "securityToken"})
    protected DynamicAttributeToken _securityToken;

    @NotNull
    @JsonAlias({"ids:senderAgent", "senderAgent"})
    protected URI _senderAgent;

    @JsonAlias({"ids:transferContract", "transferContract"})
    protected URI _transferContract;

    protected RejectionMessageImpl() {
        id = VocabUtil.getInstance().createRandomUrl("rejectionMessage");
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
        return Objects.hash(this._rejectionReason,
            this._modelVersion,
            this._issued,
            this._correlationMessage,
            this._issuerConnector,
            this._recipientConnector,
            this._senderAgent,
            this._recipientAgent,
            this._securityToken,
            this._authorizationToken,
            this._transferContract,
            this._contentVersion);
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
            RejectionMessageImpl other = (RejectionMessageImpl) obj;
            return Objects.equals(this._rejectionReason, other._rejectionReason) &&
                Objects.equals(this._modelVersion, other._modelVersion) &&
                Objects.equals(this._issued, other._issued) &&
                Objects.equals(this._correlationMessage, other._correlationMessage) &&
                Objects.equals(this._issuerConnector, other._issuerConnector) &&
                Objects.equals(this._recipientConnector, other._recipientConnector) &&
                Objects.equals(this._senderAgent, other._senderAgent) &&
                Objects.equals(this._recipientAgent, other._recipientAgent) &&
                Objects.equals(this._securityToken, other._securityToken) &&
                Objects.equals(this._authorizationToken, other._authorizationToken) &&
                Objects.equals(this._transferContract, other._transferContract) &&
                Objects.equals(this._contentVersion, other._contentVersion);
        }
    }

    @Override
    public RejectionMessage deepCopy() {
        RejectionMessageBuilder builder = new RejectionMessageBuilder();
        builder._rejectionReason_(this._rejectionReason);
        builder._modelVersion_(this._modelVersion);
        if (this._issued != null) {
            builder._issued_((XMLGregorianCalendar) this._issued.clone());
        }
        if (this._correlationMessage != null) {
            builder._correlationMessage_(URI.create(this._correlationMessage.toString()));
        }
        if (this._issuerConnector != null) {
            builder._issuerConnector_(URI.create(this._issuerConnector.toString()));
        }
        for (URI item : this._recipientConnector) {
            if (item != null) {
                builder._recipientConnector_(URI.create(item.toString()));
            }
        }
        if (this._senderAgent != null) {
            builder._senderAgent_(URI.create(this._senderAgent.toString()));
        }
        for (URI item : this._recipientAgent) {
            if (item != null) {
                builder._recipientAgent_(URI.create(item.toString()));
            }
        }
        if (this._securityToken != null) {
            builder._securityToken_(this._securityToken.deepCopy());
        }
        if (this._authorizationToken != null) {
            builder._authorizationToken_(this._authorizationToken.deepCopy());
        }
        if (this._transferContract != null) {
            builder._transferContract_(URI.create(this._transferContract.toString()));
        }
        builder._contentVersion_(this._contentVersion);
        return builder.build();
    }

    // accessor method implementations as derived from the IDS Information Model ontology

    @Override
    public RejectionReason getRejectionReason() {
        return _rejectionReason;
    }

    @Override
    public void setRejectionReason(RejectionReason _rejectionReason_) {
        this._rejectionReason = _rejectionReason_;
    }

    @Override
    @NotNull
    public String getModelVersion() {
        return _modelVersion;
    }

    @Override
    public void setModelVersion(String _modelVersion_) {
        this._modelVersion = _modelVersion_;
    }

    @Override
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    @NotNull
    public XMLGregorianCalendar getIssued() {
        return _issued;
    }

    @Override
    public void setIssued(XMLGregorianCalendar _issued_) {
        this._issued = _issued_;
    }

    @Override
    @NotNull
    public URI getCorrelationMessage() {
        return _correlationMessage;
    }

    @Override
    public void setCorrelationMessage(URI _correlationMessage_) {
        this._correlationMessage = _correlationMessage_;
    }

    @Override
    @NotNull
    public URI getIssuerConnector() {
        return _issuerConnector;
    }

    @Override
    public void setIssuerConnector(URI _issuerConnector_) {
        this._issuerConnector = _issuerConnector_;
    }

    @Override
    public List<URI> getRecipientConnector() {
        return _recipientConnector;
    }

    @Override
    public void setRecipientConnector(List<URI> _recipientConnector_) {
        this._recipientConnector = _recipientConnector_;
    }

    @Override
    @NotNull
    public URI getSenderAgent() {
        return _senderAgent;
    }

    @Override
    public void setSenderAgent(URI _senderAgent_) {
        this._senderAgent = _senderAgent_;
    }

    @Override
    public List<URI> getRecipientAgent() {
        return _recipientAgent;
    }

    @Override
    public void setRecipientAgent(List<URI> _recipientAgent_) {
        this._recipientAgent = _recipientAgent_;
    }

    @Override
    @NotNull
    public DynamicAttributeToken getSecurityToken() {
        return _securityToken;
    }

    @Override
    public void setSecurityToken(DynamicAttributeToken _securityToken_) {
        this._securityToken = _securityToken_;
    }

    @Override
    public Token getAuthorizationToken() {
        return _authorizationToken;
    }

    @Override
    public void setAuthorizationToken(Token _authorizationToken_) {
        this._authorizationToken = _authorizationToken_;
    }

    @Override
    public URI getTransferContract() {
        return _transferContract;
    }

    @Override
    public void setTransferContract(URI _transferContract_) {
        this._transferContract = _transferContract_;
    }

    @Override
    public String getContentVersion() {
        return _contentVersion;
    }

    @Override
    public void setContentVersion(String _contentVersion_) {
        this._contentVersion = _contentVersion_;
    }
}
