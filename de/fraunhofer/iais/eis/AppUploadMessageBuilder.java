package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class AppUploadMessageBuilder implements Builder<AppUploadMessage> {

    private AppUploadMessageImpl appUploadMessageImpl;

    public AppUploadMessageBuilder() {
        appUploadMessageImpl = new AppUploadMessageImpl();
    }

    public AppUploadMessageBuilder(URI id) {
        this();
        appUploadMessageImpl.id = id;
    }

    /**
     * This function allows setting a value for _appArtifactReference
     * 
     * @param _appArtifactReference_ desired value to be set
     * @return Builder object with new value for _appArtifactReference
     */
    public AppUploadMessageBuilder _appArtifactReference_(URI _appArtifactReference_) {
        this.appUploadMessageImpl.setAppArtifactReference(_appArtifactReference_);
        return this;
    }

    /**
     * This function allows setting a value for _modelVersion
     * 
     * @param _modelVersion_ desired value to be set
     * @return Builder object with new value for _modelVersion
     */
    public AppUploadMessageBuilder _modelVersion_(String _modelVersion_) {
        this.appUploadMessageImpl.setModelVersion(_modelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _issued
     * 
     * @param _issued_ desired value to be set
     * @return Builder object with new value for _issued
     */
    public AppUploadMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
        this.appUploadMessageImpl.setIssued(_issued_);
        return this;
    }

    /**
     * This function allows setting a value for _correlationMessage
     * 
     * @param _correlationMessage_ desired value to be set
     * @return Builder object with new value for _correlationMessage
     */
    public AppUploadMessageBuilder _correlationMessage_(URI _correlationMessage_) {
        this.appUploadMessageImpl.setCorrelationMessage(_correlationMessage_);
        return this;
    }

    /**
     * This function allows setting a value for _issuerConnector
     * 
     * @param _issuerConnector_ desired value to be set
     * @return Builder object with new value for _issuerConnector
     */
    public AppUploadMessageBuilder _issuerConnector_(URI _issuerConnector_) {
        this.appUploadMessageImpl.setIssuerConnector(_issuerConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be set
     * @return Builder object with new value for _recipientConnector
     */
    public AppUploadMessageBuilder _recipientConnector_(List<URI> _recipientConnector_) {
        this.appUploadMessageImpl.setRecipientConnector(_recipientConnector_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be added
     * @return Builder object with new value for _recipientConnector
     */
    public AppUploadMessageBuilder _recipientConnector_(URI _recipientConnector_) {
        this.appUploadMessageImpl.getRecipientConnector().add(_recipientConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _senderAgent
     * 
     * @param _senderAgent_ desired value to be set
     * @return Builder object with new value for _senderAgent
     */
    public AppUploadMessageBuilder _senderAgent_(URI _senderAgent_) {
        this.appUploadMessageImpl.setSenderAgent(_senderAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be set
     * @return Builder object with new value for _recipientAgent
     */
    public AppUploadMessageBuilder _recipientAgent_(List<URI> _recipientAgent_) {
        this.appUploadMessageImpl.setRecipientAgent(_recipientAgent_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be added
     * @return Builder object with new value for _recipientAgent
     */
    public AppUploadMessageBuilder _recipientAgent_(URI _recipientAgent_) {
        this.appUploadMessageImpl.getRecipientAgent().add(_recipientAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _securityToken
     * 
     * @param _securityToken_ desired value to be set
     * @return Builder object with new value for _securityToken
     */
    public AppUploadMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
        this.appUploadMessageImpl.setSecurityToken(_securityToken_);
        return this;
    }

    /**
     * This function allows setting a value for _authorizationToken
     * 
     * @param _authorizationToken_ desired value to be set
     * @return Builder object with new value for _authorizationToken
     */
    public AppUploadMessageBuilder _authorizationToken_(Token _authorizationToken_) {
        this.appUploadMessageImpl.setAuthorizationToken(_authorizationToken_);
        return this;
    }

    /**
     * This function allows setting a value for _transferContract
     * 
     * @param _transferContract_ desired value to be set
     * @return Builder object with new value for _transferContract
     */
    public AppUploadMessageBuilder _transferContract_(URI _transferContract_) {
        this.appUploadMessageImpl.setTransferContract(_transferContract_);
        return this;
    }

    /**
     * This function allows setting a value for _contentVersion
     * 
     * @param _contentVersion_ desired value to be set
     * @return Builder object with new value for _contentVersion
     */
    public AppUploadMessageBuilder _contentVersion_(String _contentVersion_) {
        this.appUploadMessageImpl.setContentVersion(_contentVersion_);
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
    public AppUploadMessage build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(appUploadMessageImpl);
        return appUploadMessageImpl;
    }
}
