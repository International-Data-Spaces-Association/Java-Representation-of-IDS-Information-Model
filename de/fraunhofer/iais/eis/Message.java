package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import de.fraunhofer.iais.eis.util.*;

/**
 * Metadata describing payload exchanged by interacting Connectors.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = RequestMessage.class),
    @JsonSubTypes.Type(value = ResponseMessage.class),
    @JsonSubTypes.Type(value = NotificationMessage.class)
})
public interface Message extends ModelClass {

    // standard methods

    @Beta
    public Message deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Version of the Information Model against which the Message should be interpreted.
     *
     * More information under https://w3id.org/idsa/core/modelVersion
     *
     * @return Returns the String for the property _modelVersion.
     */
    @NotNull
    @JsonAlias({"https://w3id.org/idsa/core/modelVersion", "ids:modelVersion", "modelVersion"})
    String getModelVersion();

    /**
     * Version of the Information Model against which the Message should be interpreted.
     *
     * More information under https://w3id.org/idsa/core/modelVersion
     *
     * @param _modelVersion_ desired value for the property _modelVersion.
     */
    void setModelVersion(String _modelVersion_);

    /**
     * Date (as xsd:dateTimeStamp) of issuing the Message.
     *
     * More information under https://w3id.org/idsa/core/issued
     *
     * @return Returns the XMLGregorianCalendar for the property _issued.
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    @NotNull
    @JsonAlias({"https://w3id.org/idsa/core/issued", "ids:issued", "issued"})
    XMLGregorianCalendar getIssued();

    /**
     * Date (as xsd:dateTimeStamp) of issuing the Message.
     *
     * More information under https://w3id.org/idsa/core/issued
     *
     * @param _issued_ desired value for the property _issued.
     */
    void setIssued(XMLGregorianCalendar _issued_);

    /**
     * Correlated message, e.g., a response to a previous request.
     *
     * More information under https://w3id.org/idsa/core/correlationMessage
     *
     * @return Returns the URI for the property _correlationMessage.
     */
    @JsonAlias({"https://w3id.org/idsa/core/correlationMessage", "ids:correlationMessage", "correlationMessage"})
    URI getCorrelationMessage();

    /**
     * Correlated message, e.g., a response to a previous request.
     *
     * More information under https://w3id.org/idsa/core/correlationMessage
     *
     * @param _correlationMessage_ desired value for the property _correlationMessage.
     */
    void setCorrelationMessage(URI _correlationMessage_);

    /**
     * The Connector which is the origin of the message.
     *
     * More information under https://w3id.org/idsa/core/issuerConnector
     *
     * @return Returns the URI for the property _issuerConnector.
     */
    @NotNull
    @JsonAlias({"https://w3id.org/idsa/core/issuerConnector", "ids:issuerConnector", "issuerConnector"})
    URI getIssuerConnector();

    /**
     * The Connector which is the origin of the message.
     *
     * More information under https://w3id.org/idsa/core/issuerConnector
     *
     * @param _issuerConnector_ desired value for the property _issuerConnector.
     */
    void setIssuerConnector(URI _issuerConnector_);

    /**
     * The Connector which is the recipient of the message.
     *
     * More information under https://w3id.org/idsa/core/recipientConnector
     *
     * @return Returns the List of URIs for the property _recipientConnector.
     */
    @JsonAlias({"https://w3id.org/idsa/core/recipientConnector", "ids:recipientConnector", "recipientConnector"})
    List<URI> getRecipientConnector();

    /**
     * The Connector which is the recipient of the message.
     *
     * More information under https://w3id.org/idsa/core/recipientConnector
     *
     * @param _recipientConnector_ desired value for the property _recipientConnector.
     */
    void setRecipientConnector(List<URI> _recipientConnector_);

    /**
     * The Agent which initiated the Message.
     *
     * More information under https://w3id.org/idsa/core/senderAgent
     *
     * @return Returns the URI for the property _senderAgent.
     */
    @NotNull
    @JsonAlias({"https://w3id.org/idsa/core/senderAgent", "ids:senderAgent", "senderAgent"})
    URI getSenderAgent();

    /**
     * The Agent which initiated the Message.
     *
     * More information under https://w3id.org/idsa/core/senderAgent
     *
     * @param _senderAgent_ desired value for the property _senderAgent.
     */
    void setSenderAgent(URI _senderAgent_);

    /**
     * The Agent for which the Mesaage is intended.
     *
     * More information under https://w3id.org/idsa/core/recipientAgent
     *
     * @return Returns the List of URIs for the property _recipientAgent.
     */
    @JsonAlias({"https://w3id.org/idsa/core/recipientAgent", "ids:recipientAgent", "recipientAgent"})
    List<URI> getRecipientAgent();

    /**
     * The Agent for which the Mesaage is intended.
     *
     * More information under https://w3id.org/idsa/core/recipientAgent
     *
     * @param _recipientAgent_ desired value for the property _recipientAgent.
     */
    void setRecipientAgent(List<URI> _recipientAgent_);

    /**
     * A token representing a claim that the message sender supports a certain security profile.
     *
     * More information under https://w3id.org/idsa/core/securityToken
     *
     * @return Returns the DynamicAttributeToken for the property _securityToken.
     */
    @NotNull
    @JsonAlias({"https://w3id.org/idsa/core/securityToken", "ids:securityToken", "securityToken"})
    DynamicAttributeToken getSecurityToken();

    /**
     * A token representing a claim that the message sender supports a certain security profile.
     *
     * More information under https://w3id.org/idsa/core/securityToken
     *
     * @param _securityToken_ desired value for the property _securityToken.
     */
    void setSecurityToken(DynamicAttributeToken _securityToken_);

    /**
     * An authorization token like JSON Web Token.
     *
     * More information under https://w3id.org/idsa/core/authorizationToken
     *
     * @return Returns the Token for the property _authorizationToken.
     */
    @JsonAlias({"https://w3id.org/idsa/core/authorizationToken", "ids:authorizationToken", "authorizationToken"})
    Token getAuthorizationToken();

    /**
     * An authorization token like JSON Web Token.
     *
     * More information under https://w3id.org/idsa/core/authorizationToken
     *
     * @param _authorizationToken_ desired value for the property _authorizationToken.
     */
    void setAuthorizationToken(Token _authorizationToken_);

    /**
     * The contract which is (or will be) the legal basis of the data transfer.
     *
     * More information under https://w3id.org/idsa/core/transferContract
     *
     * @return Returns the URI for the property _transferContract.
     */
    @JsonAlias({"https://w3id.org/idsa/core/transferContract", "ids:transferContract", "transferContract"})
    URI getTransferContract();

    /**
     * The contract which is (or will be) the legal basis of the data transfer.
     *
     * More information under https://w3id.org/idsa/core/transferContract
     *
     * @param _transferContract_ desired value for the property _transferContract.
     */
    void setTransferContract(URI _transferContract_);

    /**
     * Version of the content in the payload. Use digits and semantic versioning pattern like
     * MAJOR.MINOR.PATCH.
     *
     * More information under https://w3id.org/idsa/core/contentVersion
     *
     * @return Returns the String for the property _contentVersion.
     */
    @JsonAlias({"https://w3id.org/idsa/core/contentVersion", "ids:contentVersion", "contentVersion"})
    String getContentVersion();

    /**
     * Version of the content in the payload. Use digits and semantic versioning pattern like
     * MAJOR.MINOR.PATCH.
     *
     * More information under https://w3id.org/idsa/core/contentVersion
     *
     * @param _contentVersion_ desired value for the property _contentVersion.
     */
    void setContentVersion(String _contentVersion_);

}
