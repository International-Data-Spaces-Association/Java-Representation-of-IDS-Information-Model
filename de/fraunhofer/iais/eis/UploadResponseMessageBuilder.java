package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import de.fraunhofer.iais.eis.util.*;

public class UploadResponseMessageBuilder implements Builder<UploadResponseMessage> {

    private UploadResponseMessageImpl uploadResponseMessageImpl;

    public UploadResponseMessageBuilder() {
        uploadResponseMessageImpl = new UploadResponseMessageImpl();
    }

    public UploadResponseMessageBuilder(URI id) {
        this();
        uploadResponseMessageImpl.id = id;
    }

    /**
     * This function allows setting a value for _modelVersion
     * 
     * @param _modelVersion_ desired value to be set
     * @return Builder object with new value for _modelVersion
     */
    public UploadResponseMessageBuilder _modelVersion_(String _modelVersion_) {
        this.uploadResponseMessageImpl.setModelVersion(_modelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _issued
     * 
     * @param _issued_ desired value to be set
     * @return Builder object with new value for _issued
     */
    public UploadResponseMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
        this.uploadResponseMessageImpl.setIssued(_issued_);
        return this;
    }

    /**
     * This function allows setting a value for _correlationMessage
     * 
     * @param _correlationMessage_ desired value to be set
     * @return Builder object with new value for _correlationMessage
     */
    public UploadResponseMessageBuilder _correlationMessage_(URI _correlationMessage_) {
        this.uploadResponseMessageImpl.setCorrelationMessage(_correlationMessage_);
        return this;
    }

    /**
     * This function allows setting a value for _issuerConnector
     * 
     * @param _issuerConnector_ desired value to be set
     * @return Builder object with new value for _issuerConnector
     */
    public UploadResponseMessageBuilder _issuerConnector_(URI _issuerConnector_) {
        this.uploadResponseMessageImpl.setIssuerConnector(_issuerConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be set
     * @return Builder object with new value for _recipientConnector
     */
    public UploadResponseMessageBuilder _recipientConnector_(List<URI> _recipientConnector_) {
        this.uploadResponseMessageImpl.setRecipientConnector(_recipientConnector_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be added
     * @return Builder object with new value for _recipientConnector
     */
    public UploadResponseMessageBuilder _recipientConnector_(URI _recipientConnector_) {
        this.uploadResponseMessageImpl.getRecipientConnector().add(_recipientConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _senderAgent
     * 
     * @param _senderAgent_ desired value to be set
     * @return Builder object with new value for _senderAgent
     */
    public UploadResponseMessageBuilder _senderAgent_(URI _senderAgent_) {
        this.uploadResponseMessageImpl.setSenderAgent(_senderAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be set
     * @return Builder object with new value for _recipientAgent
     */
    public UploadResponseMessageBuilder _recipientAgent_(List<URI> _recipientAgent_) {
        this.uploadResponseMessageImpl.setRecipientAgent(_recipientAgent_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be added
     * @return Builder object with new value for _recipientAgent
     */
    public UploadResponseMessageBuilder _recipientAgent_(URI _recipientAgent_) {
        this.uploadResponseMessageImpl.getRecipientAgent().add(_recipientAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _securityToken
     * 
     * @param _securityToken_ desired value to be set
     * @return Builder object with new value for _securityToken
     */
    public UploadResponseMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
        this.uploadResponseMessageImpl.setSecurityToken(_securityToken_);
        return this;
    }

    /**
     * This function allows setting a value for _authorizationToken
     * 
     * @param _authorizationToken_ desired value to be set
     * @return Builder object with new value for _authorizationToken
     */
    public UploadResponseMessageBuilder _authorizationToken_(Token _authorizationToken_) {
        this.uploadResponseMessageImpl.setAuthorizationToken(_authorizationToken_);
        return this;
    }

    /**
     * This function allows setting a value for _transferContract
     * 
     * @param _transferContract_ desired value to be set
     * @return Builder object with new value for _transferContract
     */
    public UploadResponseMessageBuilder _transferContract_(URI _transferContract_) {
        this.uploadResponseMessageImpl.setTransferContract(_transferContract_);
        return this;
    }

    /**
     * This function allows setting a value for _contentVersion
     * 
     * @param _contentVersion_ desired value to be set
     * @return Builder object with new value for _contentVersion
     */
    public UploadResponseMessageBuilder _contentVersion_(String _contentVersion_) {
        this.uploadResponseMessageImpl.setContentVersion(_contentVersion_);
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
    public UploadResponseMessage build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(uploadResponseMessageImpl);
        return uploadResponseMessageImpl;
    }
}
