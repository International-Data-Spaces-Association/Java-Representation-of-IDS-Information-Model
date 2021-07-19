package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class ContractOfferMessageBuilder implements Builder<ContractOfferMessage> {

    private ContractOfferMessageImpl contractOfferMessageImpl;

    public ContractOfferMessageBuilder() {
        contractOfferMessageImpl = new ContractOfferMessageImpl();
    }

    public ContractOfferMessageBuilder(URI id) {
        this();
        contractOfferMessageImpl.id = id;
    }

    /**
     * This function allows setting a value for _modelVersion
     * 
     * @param _modelVersion_ desired value to be set
     * @return Builder object with new value for _modelVersion
     */
    public ContractOfferMessageBuilder _modelVersion_(String _modelVersion_) {
        this.contractOfferMessageImpl.setModelVersion(_modelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _issued
     * 
     * @param _issued_ desired value to be set
     * @return Builder object with new value for _issued
     */
    public ContractOfferMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
        this.contractOfferMessageImpl.setIssued(_issued_);
        return this;
    }

    /**
     * This function allows setting a value for _correlationMessage
     * 
     * @param _correlationMessage_ desired value to be set
     * @return Builder object with new value for _correlationMessage
     */
    public ContractOfferMessageBuilder _correlationMessage_(URI _correlationMessage_) {
        this.contractOfferMessageImpl.setCorrelationMessage(_correlationMessage_);
        return this;
    }

    /**
     * This function allows setting a value for _issuerConnector
     * 
     * @param _issuerConnector_ desired value to be set
     * @return Builder object with new value for _issuerConnector
     */
    public ContractOfferMessageBuilder _issuerConnector_(URI _issuerConnector_) {
        this.contractOfferMessageImpl.setIssuerConnector(_issuerConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be set
     * @return Builder object with new value for _recipientConnector
     */
    public ContractOfferMessageBuilder _recipientConnector_(List<URI> _recipientConnector_) {
        this.contractOfferMessageImpl.setRecipientConnector(_recipientConnector_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be added
     * @return Builder object with new value for _recipientConnector
     */
    public ContractOfferMessageBuilder _recipientConnector_(URI _recipientConnector_) {
        this.contractOfferMessageImpl.getRecipientConnector().add(_recipientConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _senderAgent
     * 
     * @param _senderAgent_ desired value to be set
     * @return Builder object with new value for _senderAgent
     */
    public ContractOfferMessageBuilder _senderAgent_(URI _senderAgent_) {
        this.contractOfferMessageImpl.setSenderAgent(_senderAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be set
     * @return Builder object with new value for _recipientAgent
     */
    public ContractOfferMessageBuilder _recipientAgent_(List<URI> _recipientAgent_) {
        this.contractOfferMessageImpl.setRecipientAgent(_recipientAgent_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be added
     * @return Builder object with new value for _recipientAgent
     */
    public ContractOfferMessageBuilder _recipientAgent_(URI _recipientAgent_) {
        this.contractOfferMessageImpl.getRecipientAgent().add(_recipientAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _securityToken
     * 
     * @param _securityToken_ desired value to be set
     * @return Builder object with new value for _securityToken
     */
    public ContractOfferMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
        this.contractOfferMessageImpl.setSecurityToken(_securityToken_);
        return this;
    }

    /**
     * This function allows setting a value for _authorizationToken
     * 
     * @param _authorizationToken_ desired value to be set
     * @return Builder object with new value for _authorizationToken
     */
    public ContractOfferMessageBuilder _authorizationToken_(Token _authorizationToken_) {
        this.contractOfferMessageImpl.setAuthorizationToken(_authorizationToken_);
        return this;
    }

    /**
     * This function allows setting a value for _transferContract
     * 
     * @param _transferContract_ desired value to be set
     * @return Builder object with new value for _transferContract
     */
    public ContractOfferMessageBuilder _transferContract_(URI _transferContract_) {
        this.contractOfferMessageImpl.setTransferContract(_transferContract_);
        return this;
    }

    /**
     * This function allows setting a value for _contentVersion
     * 
     * @param _contentVersion_ desired value to be set
     * @return Builder object with new value for _contentVersion
     */
    public ContractOfferMessageBuilder _contentVersion_(String _contentVersion_) {
        this.contractOfferMessageImpl.setContentVersion(_contentVersion_);
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
    public ContractOfferMessage build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(contractOfferMessageImpl);
        return contractOfferMessageImpl;
    }
}
