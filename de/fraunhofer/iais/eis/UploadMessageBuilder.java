package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import de.fraunhofer.iais.eis.util.*;

public class UploadMessageBuilder implements Builder<UploadMessage> {

    private UploadMessageImpl uploadMessageImpl;

    public UploadMessageBuilder() {
        uploadMessageImpl = new UploadMessageImpl();
    }

    public UploadMessageBuilder(URI id) {
        this();
        uploadMessageImpl.id = id;
    }

    /**
     * This function allows setting a value for _modelVersion
     * 
     * @param _modelVersion_ desired value to be set
     * @return Builder object with new value for _modelVersion
     */
    public UploadMessageBuilder _modelVersion_(String _modelVersion_) {
        this.uploadMessageImpl.setModelVersion(_modelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _issued
     * 
     * @param _issued_ desired value to be set
     * @return Builder object with new value for _issued
     */
    public UploadMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
        this.uploadMessageImpl.setIssued(_issued_);
        return this;
    }

    /**
     * This function allows setting a value for _correlationMessage
     * 
     * @param _correlationMessage_ desired value to be set
     * @return Builder object with new value for _correlationMessage
     */
    public UploadMessageBuilder _correlationMessage_(URI _correlationMessage_) {
        this.uploadMessageImpl.setCorrelationMessage(_correlationMessage_);
        return this;
    }

    /**
     * This function allows setting a value for _issuerConnector
     * 
     * @param _issuerConnector_ desired value to be set
     * @return Builder object with new value for _issuerConnector
     */
    public UploadMessageBuilder _issuerConnector_(URI _issuerConnector_) {
        this.uploadMessageImpl.setIssuerConnector(_issuerConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be set
     * @return Builder object with new value for _recipientConnector
     */
    public UploadMessageBuilder _recipientConnector_(List<URI> _recipientConnector_) {
        this.uploadMessageImpl.setRecipientConnector(_recipientConnector_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be added
     * @return Builder object with new value for _recipientConnector
     */
    public UploadMessageBuilder _recipientConnector_(URI _recipientConnector_) {
        this.uploadMessageImpl.getRecipientConnector().add(_recipientConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _senderAgent
     * 
     * @param _senderAgent_ desired value to be set
     * @return Builder object with new value for _senderAgent
     */
    public UploadMessageBuilder _senderAgent_(URI _senderAgent_) {
        this.uploadMessageImpl.setSenderAgent(_senderAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be set
     * @return Builder object with new value for _recipientAgent
     */
    public UploadMessageBuilder _recipientAgent_(List<URI> _recipientAgent_) {
        this.uploadMessageImpl.setRecipientAgent(_recipientAgent_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be added
     * @return Builder object with new value for _recipientAgent
     */
    public UploadMessageBuilder _recipientAgent_(URI _recipientAgent_) {
        this.uploadMessageImpl.getRecipientAgent().add(_recipientAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _securityToken
     * 
     * @param _securityToken_ desired value to be set
     * @return Builder object with new value for _securityToken
     */
    public UploadMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
        this.uploadMessageImpl.setSecurityToken(_securityToken_);
        return this;
    }

    /**
     * This function allows setting a value for _authorizationToken
     * 
     * @param _authorizationToken_ desired value to be set
     * @return Builder object with new value for _authorizationToken
     */
    public UploadMessageBuilder _authorizationToken_(Token _authorizationToken_) {
        this.uploadMessageImpl.setAuthorizationToken(_authorizationToken_);
        return this;
    }

    /**
     * This function allows setting a value for _transferContract
     * 
     * @param _transferContract_ desired value to be set
     * @return Builder object with new value for _transferContract
     */
    public UploadMessageBuilder _transferContract_(URI _transferContract_) {
        this.uploadMessageImpl.setTransferContract(_transferContract_);
        return this;
    }

    /**
     * This function allows setting a value for _contentVersion
     * 
     * @param _contentVersion_ desired value to be set
     * @return Builder object with new value for _contentVersion
     */
    public UploadMessageBuilder _contentVersion_(String _contentVersion_) {
        this.uploadMessageImpl.setContentVersion(_contentVersion_);
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
    public UploadMessage build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(uploadMessageImpl);
        return uploadMessageImpl;
    }
}
