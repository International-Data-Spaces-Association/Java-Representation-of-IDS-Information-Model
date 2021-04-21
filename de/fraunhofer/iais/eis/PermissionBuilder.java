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
import java.util.Objects;
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

public class PermissionBuilder {

	private PermissionImpl permissionImpl;

	public PermissionBuilder() {
		permissionImpl = new PermissionImpl();
	}

	public PermissionBuilder(URI id) {
		this();
		permissionImpl.id = id;
	}

	/**
	* This function allows setting a value for _preDuty
	* @param _preDuty_ desired value to be set
	* @return Builder object with new value for _preDuty
	*/
	final public PermissionBuilder _preDuty_(List<Duty> _preDuty_) {
		this.permissionImpl._preDuty = _preDuty_;
		return this;
	}


	/**
	* This function allows setting a value for _postDuty
	* @param _postDuty_ desired value to be set
	* @return Builder object with new value for _postDuty
	*/
	final public PermissionBuilder _postDuty_(List<Duty> _postDuty_) {
		this.permissionImpl._postDuty = _postDuty_;
		return this;
	}


	/**
	* This function allows setting a value for _constraint
	* @param _constraint_ desired value to be set
	* @return Builder object with new value for _constraint
	*/
	final public PermissionBuilder _constraint_(List<AbstractConstraint> _constraint_) {
		this.permissionImpl._constraint = _constraint_;
		return this;
	}


	/**
	* This function allows setting a value for _assigner
	* @param _assigner_ desired value to be set
	* @return Builder object with new value for _assigner
	*/
	final public PermissionBuilder _assigner_(List<URI> _assigner_) {
		this.permissionImpl._assigner = _assigner_;
		return this;
	}


	/**
	* This function allows setting a value for _assignee
	* @param _assignee_ desired value to be set
	* @return Builder object with new value for _assignee
	*/
	final public PermissionBuilder _assignee_(List<URI> _assignee_) {
		this.permissionImpl._assignee = _assignee_;
		return this;
	}


	/**
	* This function allows setting a value for _target
	* @param _target_ desired value to be set
	* @return Builder object with new value for _target
	*/
	final public PermissionBuilder _target_(URI _target_) {
		this.permissionImpl._target = _target_;
		return this;
	}


	/**
	* This function allows setting a value for _action
	* @param _action_ desired value to be set
	* @return Builder object with new value for _action
	*/
	final public PermissionBuilder _action_(List<Action> _action_) {
		this.permissionImpl._action = _action_;
		return this;
	}


	/**
	* This function allows setting a value for _assetRefinement
	* @param _assetRefinement_ desired value to be set
	* @return Builder object with new value for _assetRefinement
	*/
	final public PermissionBuilder _assetRefinement_(AbstractConstraint _assetRefinement_) {
		this.permissionImpl._assetRefinement = _assetRefinement_;
		return this;
	}


	/**
	* This function allows setting a value for _title
	* @param _title_ desired value to be set
	* @return Builder object with new value for _title
	*/
	final public PermissionBuilder _title_(List<TypedLiteral> _title_) {
		this.permissionImpl._title = _title_;
		return this;
	}


	/**
	* This function allows setting a value for _description
	* @param _description_ desired value to be set
	* @return Builder object with new value for _description
	*/
	final public PermissionBuilder _description_(List<TypedLiteral> _description_) {
		this.permissionImpl._description = _description_;
		return this;
	}


	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public Permission build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(permissionImpl);
		return permissionImpl;
	}
}
