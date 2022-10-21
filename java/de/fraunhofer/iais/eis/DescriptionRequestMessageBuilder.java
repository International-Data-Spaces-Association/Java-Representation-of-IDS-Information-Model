package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class DescriptionRequestMessageBuilder implements Builder<DescriptionRequestMessage> {

    private DescriptionRequestMessageImpl descriptionRequestMessageImpl;

    public DescriptionRequestMessageBuilder() {
        descriptionRequestMessageImpl = new DescriptionRequestMessageImpl();
    }

    public DescriptionRequestMessageBuilder(URI id) {
        this();
        descriptionRequestMessageImpl.id = id;
    }

    /**
     * This function allows setting a value for _requestedElement
     * 
     * @param _requestedElement_ desired value to be set
     * @return Builder object with new value for _requestedElement
     */
    public DescriptionRequestMessageBuilder _requestedElement_(URI _requestedElement_) {
        this.descriptionRequestMessageImpl.setRequestedElement(_requestedElement_);
        return this;
    }

    /**
     * This function allows setting a value for _modelVersion
     * 
     * @param _modelVersion_ desired value to be set
     * @return Builder object with new value for _modelVersion
     */
    public DescriptionRequestMessageBuilder _modelVersion_(String _modelVersion_) {
        this.descriptionRequestMessageImpl.setModelVersion(_modelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _issued
     * 
     * @param _issued_ desired value to be set
     * @return Builder object with new value for _issued
     */
    public DescriptionRequestMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
        this.descriptionRequestMessageImpl.setIssued(_issued_);
        return this;
    }

    /**
     * This function allows setting a value for _correlationMessage
     * 
     * @param _correlationMessage_ desired value to be set
     * @return Builder object with new value for _correlationMessage
     */
    public DescriptionRequestMessageBuilder _correlationMessage_(URI _correlationMessage_) {
        this.descriptionRequestMessageImpl.setCorrelationMessage(_correlationMessage_);
        return this;
    }

    /**
     * This function allows setting a value for _issuerConnector
     * 
     * @param _issuerConnector_ desired value to be set
     * @return Builder object with new value for _issuerConnector
     */
    public DescriptionRequestMessageBuilder _issuerConnector_(URI _issuerConnector_) {
        this.descriptionRequestMessageImpl.setIssuerConnector(_issuerConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be set
     * @return Builder object with new value for _recipientConnector
     */
    public DescriptionRequestMessageBuilder _recipientConnector_(List<URI> _recipientConnector_) {
        this.descriptionRequestMessageImpl.setRecipientConnector(_recipientConnector_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be added
     * @return Builder object with new value for _recipientConnector
     */
    public DescriptionRequestMessageBuilder _recipientConnector_(URI _recipientConnector_) {
        this.descriptionRequestMessageImpl.getRecipientConnector().add(_recipientConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _senderAgent
     * 
     * @param _senderAgent_ desired value to be set
     * @return Builder object with new value for _senderAgent
     */
    public DescriptionRequestMessageBuilder _senderAgent_(URI _senderAgent_) {
        this.descriptionRequestMessageImpl.setSenderAgent(_senderAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be set
     * @return Builder object with new value for _recipientAgent
     */
    public DescriptionRequestMessageBuilder _recipientAgent_(List<URI> _recipientAgent_) {
        this.descriptionRequestMessageImpl.setRecipientAgent(_recipientAgent_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be added
     * @return Builder object with new value for _recipientAgent
     */
    public DescriptionRequestMessageBuilder _recipientAgent_(URI _recipientAgent_) {
        this.descriptionRequestMessageImpl.getRecipientAgent().add(_recipientAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _securityToken
     * 
     * @param _securityToken_ desired value to be set
     * @return Builder object with new value for _securityToken
     */
    public DescriptionRequestMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
        this.descriptionRequestMessageImpl.setSecurityToken(_securityToken_);
        return this;
    }

    /**
     * This function allows setting a value for _authorizationToken
     * 
     * @param _authorizationToken_ desired value to be set
     * @return Builder object with new value for _authorizationToken
     */
    public DescriptionRequestMessageBuilder _authorizationToken_(Token _authorizationToken_) {
        this.descriptionRequestMessageImpl.setAuthorizationToken(_authorizationToken_);
        return this;
    }

    /**
     * This function allows setting a value for _transferContract
     * 
     * @param _transferContract_ desired value to be set
     * @return Builder object with new value for _transferContract
     */
    public DescriptionRequestMessageBuilder _transferContract_(URI _transferContract_) {
        this.descriptionRequestMessageImpl.setTransferContract(_transferContract_);
        return this;
    }

    /**
     * This function allows setting a value for _contentVersion
     * 
     * @param _contentVersion_ desired value to be set
     * @return Builder object with new value for _contentVersion
     */
    public DescriptionRequestMessageBuilder _contentVersion_(String _contentVersion_) {
        this.descriptionRequestMessageImpl.setContentVersion(_contentVersion_);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     * @throws ConstraintViolationException This exception is thrown, if a validator is used and a
     *         violation is found.
     */
    @Override
    public DescriptionRequestMessage build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(descriptionRequestMessageImpl);
        return descriptionRequestMessageImpl;
    }
}
