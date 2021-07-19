package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class ContractRejectionMessageBuilder implements Builder<ContractRejectionMessage> {

    private ContractRejectionMessageImpl contractRejectionMessageImpl;

    public ContractRejectionMessageBuilder() {
        contractRejectionMessageImpl = new ContractRejectionMessageImpl();
    }

    public ContractRejectionMessageBuilder(URI id) {
        this();
        contractRejectionMessageImpl.id = id;
    }

    /**
     * This function allows setting a value for _contractRejectionReason
     * 
     * @param _contractRejectionReason_ desired value to be set
     * @return Builder object with new value for _contractRejectionReason
     */
    public ContractRejectionMessageBuilder _contractRejectionReason_(TypedLiteral _contractRejectionReason_) {
        this.contractRejectionMessageImpl.setContractRejectionReason(_contractRejectionReason_);
        return this;
    }

    /**
     * This function allows setting a value for _rejectionReason
     * 
     * @param _rejectionReason_ desired value to be set
     * @return Builder object with new value for _rejectionReason
     */
    public ContractRejectionMessageBuilder _rejectionReason_(RejectionReason _rejectionReason_) {
        this.contractRejectionMessageImpl.setRejectionReason(_rejectionReason_);
        return this;
    }

    /**
     * This function allows setting a value for _modelVersion
     * 
     * @param _modelVersion_ desired value to be set
     * @return Builder object with new value for _modelVersion
     */
    public ContractRejectionMessageBuilder _modelVersion_(String _modelVersion_) {
        this.contractRejectionMessageImpl.setModelVersion(_modelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _issued
     * 
     * @param _issued_ desired value to be set
     * @return Builder object with new value for _issued
     */
    public ContractRejectionMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
        this.contractRejectionMessageImpl.setIssued(_issued_);
        return this;
    }

    /**
     * This function allows setting a value for _correlationMessage
     * 
     * @param _correlationMessage_ desired value to be set
     * @return Builder object with new value for _correlationMessage
     */
    public ContractRejectionMessageBuilder _correlationMessage_(URI _correlationMessage_) {
        this.contractRejectionMessageImpl.setCorrelationMessage(_correlationMessage_);
        return this;
    }

    /**
     * This function allows setting a value for _issuerConnector
     * 
     * @param _issuerConnector_ desired value to be set
     * @return Builder object with new value for _issuerConnector
     */
    public ContractRejectionMessageBuilder _issuerConnector_(URI _issuerConnector_) {
        this.contractRejectionMessageImpl.setIssuerConnector(_issuerConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be set
     * @return Builder object with new value for _recipientConnector
     */
    public ContractRejectionMessageBuilder _recipientConnector_(List<URI> _recipientConnector_) {
        this.contractRejectionMessageImpl.setRecipientConnector(_recipientConnector_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be added
     * @return Builder object with new value for _recipientConnector
     */
    public ContractRejectionMessageBuilder _recipientConnector_(URI _recipientConnector_) {
        this.contractRejectionMessageImpl.getRecipientConnector().add(_recipientConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _senderAgent
     * 
     * @param _senderAgent_ desired value to be set
     * @return Builder object with new value for _senderAgent
     */
    public ContractRejectionMessageBuilder _senderAgent_(URI _senderAgent_) {
        this.contractRejectionMessageImpl.setSenderAgent(_senderAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be set
     * @return Builder object with new value for _recipientAgent
     */
    public ContractRejectionMessageBuilder _recipientAgent_(List<URI> _recipientAgent_) {
        this.contractRejectionMessageImpl.setRecipientAgent(_recipientAgent_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be added
     * @return Builder object with new value for _recipientAgent
     */
    public ContractRejectionMessageBuilder _recipientAgent_(URI _recipientAgent_) {
        this.contractRejectionMessageImpl.getRecipientAgent().add(_recipientAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _securityToken
     * 
     * @param _securityToken_ desired value to be set
     * @return Builder object with new value for _securityToken
     */
    public ContractRejectionMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
        this.contractRejectionMessageImpl.setSecurityToken(_securityToken_);
        return this;
    }

    /**
     * This function allows setting a value for _authorizationToken
     * 
     * @param _authorizationToken_ desired value to be set
     * @return Builder object with new value for _authorizationToken
     */
    public ContractRejectionMessageBuilder _authorizationToken_(Token _authorizationToken_) {
        this.contractRejectionMessageImpl.setAuthorizationToken(_authorizationToken_);
        return this;
    }

    /**
     * This function allows setting a value for _transferContract
     * 
     * @param _transferContract_ desired value to be set
     * @return Builder object with new value for _transferContract
     */
    public ContractRejectionMessageBuilder _transferContract_(URI _transferContract_) {
        this.contractRejectionMessageImpl.setTransferContract(_transferContract_);
        return this;
    }

    /**
     * This function allows setting a value for _contentVersion
     * 
     * @param _contentVersion_ desired value to be set
     * @return Builder object with new value for _contentVersion
     */
    public ContractRejectionMessageBuilder _contentVersion_(String _contentVersion_) {
        this.contractRejectionMessageImpl.setContentVersion(_contentVersion_);
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
    public ContractRejectionMessage build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(contractRejectionMessageImpl);
        return contractRejectionMessageImpl;
    }
}
