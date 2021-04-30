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

public class AppRouteBuilder {

	private AppRouteImpl appRouteImpl;

	public AppRouteBuilder() {
		appRouteImpl = new AppRouteImpl();
	}

	public AppRouteBuilder(URI id) {
		this();
		appRouteImpl.id = id;
	}

	/**
	* This function allows setting a value for _routeDeployMethod
	* @param _routeDeployMethod_ desired value to be set
	* @return Builder object with new value for _routeDeployMethod
	*/
	final public AppRouteBuilder _routeDeployMethod_(String _routeDeployMethod_) {
		this.appRouteImpl._routeDeployMethod = _routeDeployMethod_;
		return this;
	}


	/**
	* This function allows setting a value for _routeDescription
	* @param _routeDescription_ desired value to be set
	* @return Builder object with new value for _routeDescription
	*/
	final public AppRouteBuilder _routeDescription_(String _routeDescription_) {
		this.appRouteImpl._routeDescription = _routeDescription_;
		return this;
	}


	/**
	* This function allows setting a value for _routeConfiguration
	* @param _routeConfiguration_ desired value to be set
	* @return Builder object with new value for _routeConfiguration
	*/
	final public AppRouteBuilder _routeConfiguration_(String _routeConfiguration_) {
		this.appRouteImpl._routeConfiguration = _routeConfiguration_;
		return this;
	}


	/**
	* This function allows setting a value for _hasSubRoute
	* @param _hasSubRoute_ desired value to be set
	* @return Builder object with new value for _hasSubRoute
	*/
	final public AppRouteBuilder _hasSubRoute_(List<RouteStep> _hasSubRoute_) {
		this.appRouteImpl._hasSubRoute = _hasSubRoute_;
		return this;
	}


	/**
	* This function allows setting a value for _appRouteStart
	* @param _appRouteStart_ desired value to be set
	* @return Builder object with new value for _appRouteStart
	*/
	final public AppRouteBuilder _appRouteStart_(List<Endpoint> _appRouteStart_) {
		this.appRouteImpl._appRouteStart = _appRouteStart_;
		return this;
	}


	/**
	* This function allows setting a value for _appRouteEnd
	* @param _appRouteEnd_ desired value to be set
	* @return Builder object with new value for _appRouteEnd
	*/
	final public AppRouteBuilder _appRouteEnd_(List<Endpoint> _appRouteEnd_) {
		this.appRouteImpl._appRouteEnd = _appRouteEnd_;
		return this;
	}


	/**
	* This function allows setting a value for _appRouteOutput
	* @param _appRouteOutput_ desired value to be set
	* @return Builder object with new value for _appRouteOutput
	*/
	final public AppRouteBuilder _appRouteOutput_(List<Resource> _appRouteOutput_) {
		this.appRouteImpl._appRouteOutput = _appRouteOutput_;
		return this;
	}


	/**
	* This function allows setting a value for _appRouteBroker
	* @param _appRouteBroker_ desired value to be set
	* @return Builder object with new value for _appRouteBroker
	*/
	final public AppRouteBuilder _appRouteBroker_(List<Broker> _appRouteBroker_) {
		this.appRouteImpl._appRouteBroker = _appRouteBroker_;
		return this;
	}


	/**
	* This function allows setting a value for _appRouteClearingHouse
	* @param _appRouteClearingHouse_ desired value to be set
	* @return Builder object with new value for _appRouteClearingHouse
	*/
	final public AppRouteBuilder _appRouteClearingHouse_(List<ClearingHouse> _appRouteClearingHouse_) {
		this.appRouteImpl._appRouteClearingHouse = _appRouteClearingHouse_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public AppRoute build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(appRouteImpl);
		return appRouteImpl;
	}
}
