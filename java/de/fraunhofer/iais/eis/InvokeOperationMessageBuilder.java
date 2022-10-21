package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class InvokeOperationMessageBuilder implements Builder<InvokeOperationMessage> {

    private InvokeOperationMessageImpl invokeOperationMessageImpl;

    public InvokeOperationMessageBuilder() {
        invokeOperationMessageImpl = new InvokeOperationMessageImpl();
    }

    public InvokeOperationMessageBuilder(URI id) {
        this();
        invokeOperationMessageImpl.id = id;
    }

    /**
     * This function allows setting a value for _operationReference
     * 
     * @param _operationReference_ desired value to be set
     * @return Builder object with new value for _operationReference
     */
    public InvokeOperationMessageBuilder _operationReference_(URI _operationReference_) {
        this.invokeOperationMessageImpl.setOperationReference(_operationReference_);
        return this;
    }

    /**
     * This function allows setting a value for _modelVersion
     * 
     * @param _modelVersion_ desired value to be set
     * @return Builder object with new value for _modelVersion
     */
    public InvokeOperationMessageBuilder _modelVersion_(String _modelVersion_) {
        this.invokeOperationMessageImpl.setModelVersion(_modelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _issued
     * 
     * @param _issued_ desired value to be set
     * @return Builder object with new value for _issued
     */
    public InvokeOperationMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
        this.invokeOperationMessageImpl.setIssued(_issued_);
        return this;
    }

    /**
     * This function allows setting a value for _correlationMessage
     * 
     * @param _correlationMessage_ desired value to be set
     * @return Builder object with new value for _correlationMessage
     */
    public InvokeOperationMessageBuilder _correlationMessage_(URI _correlationMessage_) {
        this.invokeOperationMessageImpl.setCorrelationMessage(_correlationMessage_);
        return this;
    }

    /**
     * This function allows setting a value for _issuerConnector
     * 
     * @param _issuerConnector_ desired value to be set
     * @return Builder object with new value for _issuerConnector
     */
    public InvokeOperationMessageBuilder _issuerConnector_(URI _issuerConnector_) {
        this.invokeOperationMessageImpl.setIssuerConnector(_issuerConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be set
     * @return Builder object with new value for _recipientConnector
     */
    public InvokeOperationMessageBuilder _recipientConnector_(List<URI> _recipientConnector_) {
        this.invokeOperationMessageImpl.setRecipientConnector(_recipientConnector_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be added
     * @return Builder object with new value for _recipientConnector
     */
    public InvokeOperationMessageBuilder _recipientConnector_(URI _recipientConnector_) {
        this.invokeOperationMessageImpl.getRecipientConnector().add(_recipientConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _senderAgent
     * 
     * @param _senderAgent_ desired value to be set
     * @return Builder object with new value for _senderAgent
     */
    public InvokeOperationMessageBuilder _senderAgent_(URI _senderAgent_) {
        this.invokeOperationMessageImpl.setSenderAgent(_senderAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be set
     * @return Builder object with new value for _recipientAgent
     */
    public InvokeOperationMessageBuilder _recipientAgent_(List<URI> _recipientAgent_) {
        this.invokeOperationMessageImpl.setRecipientAgent(_recipientAgent_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be added
     * @return Builder object with new value for _recipientAgent
     */
    public InvokeOperationMessageBuilder _recipientAgent_(URI _recipientAgent_) {
        this.invokeOperationMessageImpl.getRecipientAgent().add(_recipientAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _securityToken
     * 
     * @param _securityToken_ desired value to be set
     * @return Builder object with new value for _securityToken
     */
    public InvokeOperationMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
        this.invokeOperationMessageImpl.setSecurityToken(_securityToken_);
        return this;
    }

    /**
     * This function allows setting a value for _authorizationToken
     * 
     * @param _authorizationToken_ desired value to be set
     * @return Builder object with new value for _authorizationToken
     */
    public InvokeOperationMessageBuilder _authorizationToken_(Token _authorizationToken_) {
        this.invokeOperationMessageImpl.setAuthorizationToken(_authorizationToken_);
        return this;
    }

    /**
     * This function allows setting a value for _transferContract
     * 
     * @param _transferContract_ desired value to be set
     * @return Builder object with new value for _transferContract
     */
    public InvokeOperationMessageBuilder _transferContract_(URI _transferContract_) {
        this.invokeOperationMessageImpl.setTransferContract(_transferContract_);
        return this;
    }

    /**
     * This function allows setting a value for _contentVersion
     * 
     * @param _contentVersion_ desired value to be set
     * @return Builder object with new value for _contentVersion
     */
    public InvokeOperationMessageBuilder _contentVersion_(String _contentVersion_) {
        this.invokeOperationMessageImpl.setContentVersion(_contentVersion_);
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
    public InvokeOperationMessage build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(invokeOperationMessageImpl);
        return invokeOperationMessageImpl;
    }
}
