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

public class RouteStepBuilder {

	private RouteStepImpl routeStepImpl;

	public RouteStepBuilder() {
		routeStepImpl = new RouteStepImpl();
	}

	public RouteStepBuilder(URI id) {
		this();
		routeStepImpl.id = id;
	}

	/**
	* This function allows setting a value for _requiredDataApp
	* @param _requiredDataApp_ desired value to be set
	* @return Builder object with new value for _requiredDataApp
	*/
	final public RouteStepBuilder _requiredDataApp_(AppRepresentation _requiredDataApp_) {
		this.routeStepImpl._requiredDataApp = _requiredDataApp_;
		return this;
	}


	/**
	* This function allows setting a value for _routeDeployMethod
	* @param _routeDeployMethod_ desired value to be set
	* @return Builder object with new value for _routeDeployMethod
	*/
	final public RouteStepBuilder _routeDeployMethod_(String _routeDeployMethod_) {
		this.routeStepImpl._routeDeployMethod = _routeDeployMethod_;
		return this;
	}


	/**
	* This function allows setting a value for _routeDescription
	* @param _routeDescription_ desired value to be set
	* @return Builder object with new value for _routeDescription
	*/
	final public RouteStepBuilder _routeDescription_(String _routeDescription_) {
		this.routeStepImpl._routeDescription = _routeDescription_;
		return this;
	}


	/**
	* This function allows setting a value for _routeConfiguration
	* @param _routeConfiguration_ desired value to be set
	* @return Builder object with new value for _routeConfiguration
	*/
	final public RouteStepBuilder _routeConfiguration_(String _routeConfiguration_) {
		this.routeStepImpl._routeConfiguration = _routeConfiguration_;
		return this;
	}


	/**
	* This function allows setting a value for _hasSubRoute
	* @param _hasSubRoute_ desired value to be set
	* @return Builder object with new value for _hasSubRoute
	*/
	final public RouteStepBuilder _hasSubRoute_(List<RouteStep> _hasSubRoute_) {
		this.routeStepImpl._hasSubRoute = _hasSubRoute_;
		return this;
	}


	/**
	* This function allows setting a value for _appRouteStart
	* @param _appRouteStart_ desired value to be set
	* @return Builder object with new value for _appRouteStart
	*/
	final public RouteStepBuilder _appRouteStart_(List<Endpoint> _appRouteStart_) {
		this.routeStepImpl._appRouteStart = _appRouteStart_;
		return this;
	}


	/**
	* This function allows setting a value for _appRouteEnd
	* @param _appRouteEnd_ desired value to be set
	* @return Builder object with new value for _appRouteEnd
	*/
	final public RouteStepBuilder _appRouteEnd_(List<Endpoint> _appRouteEnd_) {
		this.routeStepImpl._appRouteEnd = _appRouteEnd_;
		return this;
	}


	/**
	* This function allows setting a value for _appRouteOutput
	* @param _appRouteOutput_ desired value to be set
	* @return Builder object with new value for _appRouteOutput
	*/
	final public RouteStepBuilder _appRouteOutput_(List<Resource> _appRouteOutput_) {
		this.routeStepImpl._appRouteOutput = _appRouteOutput_;
		return this;
	}


	/**
	* This function allows setting a value for _appRouteBroker
	* @param _appRouteBroker_ desired value to be set
	* @return Builder object with new value for _appRouteBroker
	*/
	final public RouteStepBuilder _appRouteBroker_(List<Broker> _appRouteBroker_) {
		this.routeStepImpl._appRouteBroker = _appRouteBroker_;
		return this;
	}


	/**
	* This function allows setting a value for _appRouteClearingHouse
	* @param _appRouteClearingHouse_ desired value to be set
	* @return Builder object with new value for _appRouteClearingHouse
	*/
	final public RouteStepBuilder _appRouteClearingHouse_(List<ClearingHouse> _appRouteClearingHouse_) {
		this.routeStepImpl._appRouteClearingHouse = _appRouteClearingHouse_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public RouteStep build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(routeStepImpl);
		return routeStepImpl;
	}
}
