package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

public class UsageControlObjectBuilder {

	private UsageControlObjectImpl usageControlObjectImpl;

	public UsageControlObjectBuilder() {
		usageControlObjectImpl = new UsageControlObjectImpl();
	}

	public UsageControlObjectBuilder(URI id) {
		this();
		usageControlObjectImpl.id = id;
	}

	/**
	* This function allows setting a value for data
	* @param _data_ desired value to be set
	* @return Builder object with new value for data
	*/
	final public UsageControlObjectBuilder _data_(URI _data_) {
		this.usageControlObjectImpl._data = _data_;
		return this;
	}


	/**
	* This function allows setting a value for contract
	* @param _contract_ desired value to be set
	* @return Builder object with new value for contract
	*/
	final public UsageControlObjectBuilder _contract_(ArrayList<? extends ContractAgreement> _contract_) {
		this.usageControlObjectImpl._contract = _contract_;
		return this;
	}


	/**
	* This function allows setting a value for hasState
	* @param _hasState_ desired value to be set
	* @return Builder object with new value for hasState
	*/
	final public UsageControlObjectBuilder _hasState_(ArrayList<? extends ArtifactState> _hasState_) {
		this.usageControlObjectImpl._hasState = _hasState_;
		return this;
	}


	/**
	* This function allows setting a value for user
	* @param _user_ desired value to be set
	* @return Builder object with new value for user
	*/
	final public UsageControlObjectBuilder _user_(Participant _user_) {
		this.usageControlObjectImpl._user = _user_;
		return this;
	}


	/**
	* This function allows setting a value for source
	* @param _source_ desired value to be set
	* @return Builder object with new value for source
	*/
	final public UsageControlObjectBuilder _source_(URI _source_) {
		this.usageControlObjectImpl._source = _source_;
		return this;
	}


	/**
	* This function allows setting a value for usageDuration
	* @param _usageDuration_ desired value to be set
	* @return Builder object with new value for usageDuration
	*/
	final public UsageControlObjectBuilder _usageDuration_(javax.xml.datatype.Duration _usageDuration_) {
		this.usageControlObjectImpl._usageDuration = _usageDuration_;
		return this;
	}


	/**
	* This function allows setting a value for accessed
	* @param _accessed_ desired value to be set
	* @return Builder object with new value for accessed
	*/
	final public UsageControlObjectBuilder _accessed_(XMLGregorianCalendar _accessed_) {
		this.usageControlObjectImpl._accessed = _accessed_;
		return this;
	}


	/**
	* This function allows setting a value for requester
	* @param _requester_ desired value to be set
	* @return Builder object with new value for requester
	*/
	final public UsageControlObjectBuilder _requester_(URI _requester_) {
		this.usageControlObjectImpl._requester = _requester_;
		return this;
	}


	/**
	* This function allows setting a value for created
	* @param _created_ desired value to be set
	* @return Builder object with new value for created
	*/
	final public UsageControlObjectBuilder _created_(XMLGregorianCalendar _created_) {
		this.usageControlObjectImpl._created = _created_;
		return this;
	}


	/**
	* This function allows setting a value for modified
	* @param _modified_ desired value to be set
	* @return Builder object with new value for modified
	*/
	final public UsageControlObjectBuilder _modified_(XMLGregorianCalendar _modified_) {
		this.usageControlObjectImpl._modified = _modified_;
		return this;
	}


	/**
	* This function allows setting a value for action
	* @param _action_ desired value to be set
	* @return Builder object with new value for action
	*/
	final public UsageControlObjectBuilder _action_(ArrayList<? extends Action> _action_) {
		this.usageControlObjectImpl._action = _action_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public UsageControlObject build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(usageControlObjectImpl);
		return usageControlObjectImpl;
	}
}
