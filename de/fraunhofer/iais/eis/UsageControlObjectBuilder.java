package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class UsageControlObjectBuilder implements Builder<UsageControlObject> {

    private UsageControlObjectImpl usageControlObjectImpl;

    public UsageControlObjectBuilder() {
        usageControlObjectImpl = new UsageControlObjectImpl();
    }

    public UsageControlObjectBuilder(URI id) {
        this();
        usageControlObjectImpl.id = id;
    }

    /**
     * This function allows setting a value for _data
     * 
     * @param _data_ desired value to be set
     * @return Builder object with new value for _data
     */
    public UsageControlObjectBuilder _data_(URI _data_) {
        this.usageControlObjectImpl.setData(_data_);
        return this;
    }

    /**
     * This function allows setting a value for _user
     * 
     * @param _user_ desired value to be set
     * @return Builder object with new value for _user
     */
    public UsageControlObjectBuilder _user_(Participant _user_) {
        this.usageControlObjectImpl.setUser(_user_);
        return this;
    }

    /**
     * This function allows setting a value for _source
     * 
     * @param _source_ desired value to be set
     * @return Builder object with new value for _source
     */
    public UsageControlObjectBuilder _source_(URI _source_) {
        this.usageControlObjectImpl.setSource(_source_);
        return this;
    }

    /**
     * This function allows setting a value for _contract
     * 
     * @param _contract_ desired value to be set
     * @return Builder object with new value for _contract
     */
    public UsageControlObjectBuilder _contract_(List<ContractAgreement> _contract_) {
        this.usageControlObjectImpl.setContract(_contract_);
        return this;
    }

    /**
     * This function allows adding a value to the List _contract
     * 
     * @param _contract_ desired value to be added
     * @return Builder object with new value for _contract
     */
    public UsageControlObjectBuilder _contract_(ContractAgreement _contract_) {
        this.usageControlObjectImpl.getContract().add(_contract_);
        return this;
    }

    /**
     * This function allows setting a value for _usageDuration
     * 
     * @param _usageDuration_ desired value to be set
     * @return Builder object with new value for _usageDuration
     */
    public UsageControlObjectBuilder _usageDuration_(javax.xml.datatype.Duration _usageDuration_) {
        this.usageControlObjectImpl.setUsageDuration(_usageDuration_);
        return this;
    }

    /**
     * This function allows setting a value for _accessed
     * 
     * @param _accessed_ desired value to be set
     * @return Builder object with new value for _accessed
     */
    public UsageControlObjectBuilder _accessed_(XMLGregorianCalendar _accessed_) {
        this.usageControlObjectImpl.setAccessed(_accessed_);
        return this;
    }

    /**
     * This function allows setting a value for _hasState
     * 
     * @param _hasState_ desired value to be set
     * @return Builder object with new value for _hasState
     */
    public UsageControlObjectBuilder _hasState_(List<ArtifactState> _hasState_) {
        this.usageControlObjectImpl.setHasState(_hasState_);
        return this;
    }

    /**
     * This function allows adding a value to the List _hasState
     * 
     * @param _hasState_ desired value to be added
     * @return Builder object with new value for _hasState
     */
    public UsageControlObjectBuilder _hasState_(ArtifactState _hasState_) {
        this.usageControlObjectImpl.getHasState().add(_hasState_);
        return this;
    }

    /**
     * This function allows setting a value for _requester
     * 
     * @param _requester_ desired value to be set
     * @return Builder object with new value for _requester
     */
    public UsageControlObjectBuilder _requester_(URI _requester_) {
        this.usageControlObjectImpl.setRequester(_requester_);
        return this;
    }

    /**
     * This function allows setting a value for _created
     * 
     * @param _created_ desired value to be set
     * @return Builder object with new value for _created
     */
    public UsageControlObjectBuilder _created_(XMLGregorianCalendar _created_) {
        this.usageControlObjectImpl.setCreated(_created_);
        return this;
    }

    /**
     * This function allows setting a value for _modified
     * 
     * @param _modified_ desired value to be set
     * @return Builder object with new value for _modified
     */
    public UsageControlObjectBuilder _modified_(XMLGregorianCalendar _modified_) {
        this.usageControlObjectImpl.setModified(_modified_);
        return this;
    }

    /**
     * This function allows setting a value for _action
     * 
     * @param _action_ desired value to be set
     * @return Builder object with new value for _action
     */
    public UsageControlObjectBuilder _action_(List<Action> _action_) {
        this.usageControlObjectImpl.setAction(_action_);
        return this;
    }

    /**
     * This function allows adding a value to the List _action
     * 
     * @param _action_ desired value to be added
     * @return Builder object with new value for _action
     */
    public UsageControlObjectBuilder _action_(Action _action_) {
        this.usageControlObjectImpl.getAction().add(_action_);
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
    public UsageControlObject build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(usageControlObjectImpl);
        return usageControlObjectImpl;
    }
}
