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

public class SmartDataAppBuilder {

	private SmartDataAppImpl smartDataAppImpl;

	public SmartDataAppBuilder() {
		smartDataAppImpl = new SmartDataAppImpl();
	}

	public SmartDataAppBuilder(URI id) {
		this();
		smartDataAppImpl.id = id;
	}


	/**
	* This function allows setting a value for _appDocumentation
	* @param _appDocumentation_ desired value to be set
	* @return Builder object with new value for _appDocumentation
	*/
	final public SmartDataAppBuilder _appDocumentation_(String _appDocumentation_) {
		this.smartDataAppImpl._appDocumentation = _appDocumentation_;
		return this;
	}


	/**
	* This function allows setting a value for _appEndpoint
	* @param _appEndpoint_ desired value to be set
	* @return Builder object with new value for _appEndpoint
	*/
	final public SmartDataAppBuilder _appEndpoint_(List<AppEndpoint> _appEndpoint_) {
		this.smartDataAppImpl._appEndpoint = _appEndpoint_;
		return this;
	}


	/**
	* This function allows setting a value for _appEnvironmentVariables
	* @param _appEnvironmentVariables_ desired value to be set
	* @return Builder object with new value for _appEnvironmentVariables
	*/
	final public SmartDataAppBuilder _appEnvironmentVariables_(String _appEnvironmentVariables_) {
		this.smartDataAppImpl._appEnvironmentVariables = _appEnvironmentVariables_;
		return this;
	}


	/**
	* This function allows setting a value for _appStorageConfiguration
	* @param _appStorageConfiguration_ desired value to be set
	* @return Builder object with new value for _appStorageConfiguration
	*/
	final public SmartDataAppBuilder _appStorageConfiguration_(String _appStorageConfiguration_) {
		this.smartDataAppImpl._appStorageConfiguration = _appStorageConfiguration_;
		return this;
	}


	/**
	* This function allows setting a value for _supportedUsagePolicies
	* @param _supportedUsagePolicies_ desired value to be set
	* @return Builder object with new value for _supportedUsagePolicies
	*/
	final public SmartDataAppBuilder _supportedUsagePolicies_(List<UsagePolicyClass> _supportedUsagePolicies_) {
		this.smartDataAppImpl._supportedUsagePolicies = _supportedUsagePolicies_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public SmartDataApp build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(smartDataAppImpl);
		return smartDataAppImpl;
	}
}
