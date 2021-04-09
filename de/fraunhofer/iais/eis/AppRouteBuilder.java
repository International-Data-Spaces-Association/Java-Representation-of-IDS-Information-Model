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
	* This function allows setting a value for routeDeployMethod
	* @param _routeDeployMethod_ desired value to be set
	* @return Builder object with new value for routeDeployMethod
	*/
	final public AppRouteBuilder _routeDeployMethod_(String _routeDeployMethod_) {
		this.appRouteImpl._routeDeployMethod = _routeDeployMethod_;
		return this;
	}


	/**
	* This function allows setting a value for hasSubRoute
	* @param _hasSubRoute_ desired value to be set
	* @return Builder object with new value for hasSubRoute
	*/
	final public AppRouteBuilder _hasSubRoute_(ArrayList<? extends RouteStep> _hasSubRoute_) {
		this.appRouteImpl._hasSubRoute = _hasSubRoute_;
		return this;
	}


	/**
	* This function allows setting a value for appRouteStart
	* @param _appRouteStart_ desired value to be set
	* @return Builder object with new value for appRouteStart
	*/
	final public AppRouteBuilder _appRouteStart_(ArrayList<? extends Endpoint> _appRouteStart_) {
		this.appRouteImpl._appRouteStart = _appRouteStart_;
		return this;
	}


	/**
	* This function allows setting a value for appRouteEnd
	* @param _appRouteEnd_ desired value to be set
	* @return Builder object with new value for appRouteEnd
	*/
	final public AppRouteBuilder _appRouteEnd_(ArrayList<? extends Endpoint> _appRouteEnd_) {
		this.appRouteImpl._appRouteEnd = _appRouteEnd_;
		return this;
	}


	/**
	* This function allows setting a value for appRouteOutput
	* @param _appRouteOutput_ desired value to be set
	* @return Builder object with new value for appRouteOutput
	*/
	final public AppRouteBuilder _appRouteOutput_(ArrayList<? extends Resource> _appRouteOutput_) {
		this.appRouteImpl._appRouteOutput = _appRouteOutput_;
		return this;
	}


	/**
	* This function allows setting a value for appRouteBroker
	* @param _appRouteBroker_ desired value to be set
	* @return Builder object with new value for appRouteBroker
	*/
	final public AppRouteBuilder _appRouteBroker_(ArrayList<? extends Broker> _appRouteBroker_) {
		this.appRouteImpl._appRouteBroker = _appRouteBroker_;
		return this;
	}


	/**
	* This function allows setting a value for appRouteClearingHouse
	* @param _appRouteClearingHouse_ desired value to be set
	* @return Builder object with new value for appRouteClearingHouse
	*/
	final public AppRouteBuilder _appRouteClearingHouse_(ArrayList<? extends ClearingHouse> _appRouteClearingHouse_) {
		this.appRouteImpl._appRouteClearingHouse = _appRouteClearingHouse_;
		return this;
	}


	/**
	* This function allows setting a value for routeDescription
	* @param _routeDescription_ desired value to be set
	* @return Builder object with new value for routeDescription
	*/
	final public AppRouteBuilder _routeDescription_(String _routeDescription_) {
		this.appRouteImpl._routeDescription = _routeDescription_;
		return this;
	}


	/**
	* This function allows setting a value for routeConfiguration
	* @param _routeConfiguration_ desired value to be set
	* @return Builder object with new value for routeConfiguration
	*/
	final public AppRouteBuilder _routeConfiguration_(String _routeConfiguration_) {
		this.appRouteImpl._routeConfiguration = _routeConfiguration_;
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
