package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class AppRegistrationRequestMessageBuilder implements Builder<AppRegistrationRequestMessage> {

    private AppRegistrationRequestMessageImpl appRegistrationRequestMessageImpl;

    public AppRegistrationRequestMessageBuilder() {
        appRegistrationRequestMessageImpl = new AppRegistrationRequestMessageImpl();
    }

    public AppRegistrationRequestMessageBuilder(URI id) {
        this();
        appRegistrationRequestMessageImpl.id = id;
    }

    /**
     * This function allows setting a value for _affectedDataApp
     * 
     * @param _affectedDataApp_ desired value to be set
     * @return Builder object with new value for _affectedDataApp
     */
    public AppRegistrationRequestMessageBuilder _affectedDataApp_(URI _affectedDataApp_) {
        this.appRegistrationRequestMessageImpl.setAffectedDataApp(_affectedDataApp_);
        return this;
    }

    /**
     * This function allows setting a value for _modelVersion
     * 
     * @param _modelVersion_ desired value to be set
     * @return Builder object with new value for _modelVersion
     */
    public AppRegistrationRequestMessageBuilder _modelVersion_(String _modelVersion_) {
        this.appRegistrationRequestMessageImpl.setModelVersion(_modelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _issued
     * 
     * @param _issued_ desired value to be set
     * @return Builder object with new value for _issued
     */
    public AppRegistrationRequestMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
        this.appRegistrationRequestMessageImpl.setIssued(_issued_);
        return this;
    }

    /**
     * This function allows setting a value for _correlationMessage
     * 
     * @param _correlationMessage_ desired value to be set
     * @return Builder object with new value for _correlationMessage
     */
    public AppRegistrationRequestMessageBuilder _correlationMessage_(URI _correlationMessage_) {
        this.appRegistrationRequestMessageImpl.setCorrelationMessage(_correlationMessage_);
        return this;
    }

    /**
     * This function allows setting a value for _issuerConnector
     * 
     * @param _issuerConnector_ desired value to be set
     * @return Builder object with new value for _issuerConnector
     */
    public AppRegistrationRequestMessageBuilder _issuerConnector_(URI _issuerConnector_) {
        this.appRegistrationRequestMessageImpl.setIssuerConnector(_issuerConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be set
     * @return Builder object with new value for _recipientConnector
     */
    public AppRegistrationRequestMessageBuilder _recipientConnector_(List<URI> _recipientConnector_) {
        this.appRegistrationRequestMessageImpl.setRecipientConnector(_recipientConnector_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be added
     * @return Builder object with new value for _recipientConnector
     */
    public AppRegistrationRequestMessageBuilder _recipientConnector_(URI _recipientConnector_) {
        this.appRegistrationRequestMessageImpl.getRecipientConnector().add(_recipientConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _senderAgent
     * 
     * @param _senderAgent_ desired value to be set
     * @return Builder object with new value for _senderAgent
     */
    public AppRegistrationRequestMessageBuilder _senderAgent_(URI _senderAgent_) {
        this.appRegistrationRequestMessageImpl.setSenderAgent(_senderAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be set
     * @return Builder object with new value for _recipientAgent
     */
    public AppRegistrationRequestMessageBuilder _recipientAgent_(List<URI> _recipientAgent_) {
        this.appRegistrationRequestMessageImpl.setRecipientAgent(_recipientAgent_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be added
     * @return Builder object with new value for _recipientAgent
     */
    public AppRegistrationRequestMessageBuilder _recipientAgent_(URI _recipientAgent_) {
        this.appRegistrationRequestMessageImpl.getRecipientAgent().add(_recipientAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _securityToken
     * 
     * @param _securityToken_ desired value to be set
     * @return Builder object with new value for _securityToken
     */
    public AppRegistrationRequestMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
        this.appRegistrationRequestMessageImpl.setSecurityToken(_securityToken_);
        return this;
    }

    /**
     * This function allows setting a value for _authorizationToken
     * 
     * @param _authorizationToken_ desired value to be set
     * @return Builder object with new value for _authorizationToken
     */
    public AppRegistrationRequestMessageBuilder _authorizationToken_(Token _authorizationToken_) {
        this.appRegistrationRequestMessageImpl.setAuthorizationToken(_authorizationToken_);
        return this;
    }

    /**
     * This function allows setting a value for _transferContract
     * 
     * @param _transferContract_ desired value to be set
     * @return Builder object with new value for _transferContract
     */
    public AppRegistrationRequestMessageBuilder _transferContract_(URI _transferContract_) {
        this.appRegistrationRequestMessageImpl.setTransferContract(_transferContract_);
        return this;
    }

    /**
     * This function allows setting a value for _contentVersion
     * 
     * @param _contentVersion_ desired value to be set
     * @return Builder object with new value for _contentVersion
     */
    public AppRegistrationRequestMessageBuilder _contentVersion_(String _contentVersion_) {
        this.appRegistrationRequestMessageImpl.setContentVersion(_contentVersion_);
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
    public AppRegistrationRequestMessage build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(appRegistrationRequestMessageImpl);
        return appRegistrationRequestMessageImpl;
    }
}
