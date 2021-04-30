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

public class SystemAdapterBuilder {

	private SystemAdapterImpl systemAdapterImpl;

	public SystemAdapterBuilder() {
		systemAdapterImpl = new SystemAdapterImpl();
	}

	public SystemAdapterBuilder(URI id) {
		this();
		systemAdapterImpl.id = id;
	}


	/**
	* This function allows setting a value for _appDocumentation
	* @param _appDocumentation_ desired value to be set
	* @return Builder object with new value for _appDocumentation
	*/
	final public SystemAdapterBuilder _appDocumentation_(String _appDocumentation_) {
		this.systemAdapterImpl._appDocumentation = _appDocumentation_;
		return this;
	}


	/**
	* This function allows setting a value for _appEndpoint
	* @param _appEndpoint_ desired value to be set
	* @return Builder object with new value for _appEndpoint
	*/
	final public SystemAdapterBuilder _appEndpoint_(List<AppEndpoint> _appEndpoint_) {
		this.systemAdapterImpl._appEndpoint = _appEndpoint_;
		return this;
	}


	/**
	* This function allows setting a value for _appEnvironmentVariables
	* @param _appEnvironmentVariables_ desired value to be set
	* @return Builder object with new value for _appEnvironmentVariables
	*/
	final public SystemAdapterBuilder _appEnvironmentVariables_(String _appEnvironmentVariables_) {
		this.systemAdapterImpl._appEnvironmentVariables = _appEnvironmentVariables_;
		return this;
	}


	/**
	* This function allows setting a value for _appStorageConfiguration
	* @param _appStorageConfiguration_ desired value to be set
	* @return Builder object with new value for _appStorageConfiguration
	*/
	final public SystemAdapterBuilder _appStorageConfiguration_(String _appStorageConfiguration_) {
		this.systemAdapterImpl._appStorageConfiguration = _appStorageConfiguration_;
		return this;
	}


	/**
	* This function allows setting a value for _supportedUsagePolicies
	* @param _supportedUsagePolicies_ desired value to be set
	* @return Builder object with new value for _supportedUsagePolicies
	*/
	final public SystemAdapterBuilder _supportedUsagePolicies_(List<UsagePolicyClass> _supportedUsagePolicies_) {
		this.systemAdapterImpl._supportedUsagePolicies = _supportedUsagePolicies_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public SystemAdapter build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(systemAdapterImpl);
		return systemAdapterImpl;
	}
}
