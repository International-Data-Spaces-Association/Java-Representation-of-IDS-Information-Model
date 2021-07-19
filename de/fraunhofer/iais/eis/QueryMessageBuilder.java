package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class QueryMessageBuilder implements Builder<QueryMessage> {

    private QueryMessageImpl queryMessageImpl;

    public QueryMessageBuilder() {
        queryMessageImpl = new QueryMessageImpl();
    }

    public QueryMessageBuilder(URI id) {
        this();
        queryMessageImpl.id = id;
    }

    /**
     * This function allows setting a value for _queryLanguage
     * 
     * @param _queryLanguage_ desired value to be set
     * @return Builder object with new value for _queryLanguage
     */
    public QueryMessageBuilder _queryLanguage_(QueryLanguage _queryLanguage_) {
        this.queryMessageImpl.setQueryLanguage(_queryLanguage_);
        return this;
    }

    /**
     * This function allows setting a value for _queryScope
     * 
     * @param _queryScope_ desired value to be set
     * @return Builder object with new value for _queryScope
     */
    public QueryMessageBuilder _queryScope_(QueryScope _queryScope_) {
        this.queryMessageImpl.setQueryScope(_queryScope_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientScope
     * 
     * @param _recipientScope_ desired value to be set
     * @return Builder object with new value for _recipientScope
     */
    public QueryMessageBuilder _recipientScope_(QueryTarget _recipientScope_) {
        this.queryMessageImpl.setRecipientScope(_recipientScope_);
        return this;
    }

    /**
     * This function allows setting a value for _modelVersion
     * 
     * @param _modelVersion_ desired value to be set
     * @return Builder object with new value for _modelVersion
     */
    public QueryMessageBuilder _modelVersion_(String _modelVersion_) {
        this.queryMessageImpl.setModelVersion(_modelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _issued
     * 
     * @param _issued_ desired value to be set
     * @return Builder object with new value for _issued
     */
    public QueryMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
        this.queryMessageImpl.setIssued(_issued_);
        return this;
    }

    /**
     * This function allows setting a value for _correlationMessage
     * 
     * @param _correlationMessage_ desired value to be set
     * @return Builder object with new value for _correlationMessage
     */
    public QueryMessageBuilder _correlationMessage_(URI _correlationMessage_) {
        this.queryMessageImpl.setCorrelationMessage(_correlationMessage_);
        return this;
    }

    /**
     * This function allows setting a value for _issuerConnector
     * 
     * @param _issuerConnector_ desired value to be set
     * @return Builder object with new value for _issuerConnector
     */
    public QueryMessageBuilder _issuerConnector_(URI _issuerConnector_) {
        this.queryMessageImpl.setIssuerConnector(_issuerConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be set
     * @return Builder object with new value for _recipientConnector
     */
    public QueryMessageBuilder _recipientConnector_(List<URI> _recipientConnector_) {
        this.queryMessageImpl.setRecipientConnector(_recipientConnector_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be added
     * @return Builder object with new value for _recipientConnector
     */
    public QueryMessageBuilder _recipientConnector_(URI _recipientConnector_) {
        this.queryMessageImpl.getRecipientConnector().add(_recipientConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _senderAgent
     * 
     * @param _senderAgent_ desired value to be set
     * @return Builder object with new value for _senderAgent
     */
    public QueryMessageBuilder _senderAgent_(URI _senderAgent_) {
        this.queryMessageImpl.setSenderAgent(_senderAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be set
     * @return Builder object with new value for _recipientAgent
     */
    public QueryMessageBuilder _recipientAgent_(List<URI> _recipientAgent_) {
        this.queryMessageImpl.setRecipientAgent(_recipientAgent_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be added
     * @return Builder object with new value for _recipientAgent
     */
    public QueryMessageBuilder _recipientAgent_(URI _recipientAgent_) {
        this.queryMessageImpl.getRecipientAgent().add(_recipientAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _securityToken
     * 
     * @param _securityToken_ desired value to be set
     * @return Builder object with new value for _securityToken
     */
    public QueryMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
        this.queryMessageImpl.setSecurityToken(_securityToken_);
        return this;
    }

    /**
     * This function allows setting a value for _authorizationToken
     * 
     * @param _authorizationToken_ desired value to be set
     * @return Builder object with new value for _authorizationToken
     */
    public QueryMessageBuilder _authorizationToken_(Token _authorizationToken_) {
        this.queryMessageImpl.setAuthorizationToken(_authorizationToken_);
        return this;
    }

    /**
     * This function allows setting a value for _transferContract
     * 
     * @param _transferContract_ desired value to be set
     * @return Builder object with new value for _transferContract
     */
    public QueryMessageBuilder _transferContract_(URI _transferContract_) {
        this.queryMessageImpl.setTransferContract(_transferContract_);
        return this;
    }

    /**
     * This function allows setting a value for _contentVersion
     * 
     * @param _contentVersion_ desired value to be set
     * @return Builder object with new value for _contentVersion
     */
    public QueryMessageBuilder _contentVersion_(String _contentVersion_) {
        this.queryMessageImpl.setContentVersion(_contentVersion_);
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
    public QueryMessage build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(queryMessageImpl);
        return queryMessageImpl;
    }
}
