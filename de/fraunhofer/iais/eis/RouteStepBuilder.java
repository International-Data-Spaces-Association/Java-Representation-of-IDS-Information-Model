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
	* This function allows setting a value for requiredDataApp
	* @param _requiredDataApp_ desired value to be set
	* @return Builder object with new value for requiredDataApp
	*/
	final public RouteStepBuilder _requiredDataApp_(AppRepresentation _requiredDataApp_) {
		this.routeStepImpl._requiredDataApp = _requiredDataApp_;
		return this;
	}


	/**
	* This function allows setting a value for routeDeployMethod
	* @param _routeDeployMethod_ desired value to be set
	* @return Builder object with new value for routeDeployMethod
	*/
	final public RouteStepBuilder _routeDeployMethod_(String _routeDeployMethod_) {
		this.routeStepImpl._routeDeployMethod = _routeDeployMethod_;
		return this;
	}


	/**
	* This function allows setting a value for hasSubRoute
	* @param _hasSubRoute_ desired value to be set
	* @return Builder object with new value for hasSubRoute
	*/
	final public RouteStepBuilder _hasSubRoute_(ArrayList<? extends RouteStep> _hasSubRoute_) {
		this.routeStepImpl._hasSubRoute = _hasSubRoute_;
		return this;
	}


	/**
	* This function allows setting a value for appRouteStart
	* @param _appRouteStart_ desired value to be set
	* @return Builder object with new value for appRouteStart
	*/
	final public RouteStepBuilder _appRouteStart_(ArrayList<? extends Endpoint> _appRouteStart_) {
		this.routeStepImpl._appRouteStart = _appRouteStart_;
		return this;
	}


	/**
	* This function allows setting a value for appRouteEnd
	* @param _appRouteEnd_ desired value to be set
	* @return Builder object with new value for appRouteEnd
	*/
	final public RouteStepBuilder _appRouteEnd_(ArrayList<? extends Endpoint> _appRouteEnd_) {
		this.routeStepImpl._appRouteEnd = _appRouteEnd_;
		return this;
	}


	/**
	* This function allows setting a value for appRouteOutput
	* @param _appRouteOutput_ desired value to be set
	* @return Builder object with new value for appRouteOutput
	*/
	final public RouteStepBuilder _appRouteOutput_(ArrayList<? extends Resource> _appRouteOutput_) {
		this.routeStepImpl._appRouteOutput = _appRouteOutput_;
		return this;
	}


	/**
	* This function allows setting a value for appRouteBroker
	* @param _appRouteBroker_ desired value to be set
	* @return Builder object with new value for appRouteBroker
	*/
	final public RouteStepBuilder _appRouteBroker_(ArrayList<? extends Broker> _appRouteBroker_) {
		this.routeStepImpl._appRouteBroker = _appRouteBroker_;
		return this;
	}


	/**
	* This function allows setting a value for appRouteClearingHouse
	* @param _appRouteClearingHouse_ desired value to be set
	* @return Builder object with new value for appRouteClearingHouse
	*/
	final public RouteStepBuilder _appRouteClearingHouse_(ArrayList<? extends ClearingHouse> _appRouteClearingHouse_) {
		this.routeStepImpl._appRouteClearingHouse = _appRouteClearingHouse_;
		return this;
	}


	/**
	* This function allows setting a value for routeDescription
	* @param _routeDescription_ desired value to be set
	* @return Builder object with new value for routeDescription
	*/
	final public RouteStepBuilder _routeDescription_(String _routeDescription_) {
		this.routeStepImpl._routeDescription = _routeDescription_;
		return this;
	}


	/**
	* This function allows setting a value for routeConfiguration
	* @param _routeConfiguration_ desired value to be set
	* @return Builder object with new value for routeConfiguration
	*/
	final public RouteStepBuilder _routeConfiguration_(String _routeConfiguration_) {
		this.routeStepImpl._routeConfiguration = _routeConfiguration_;
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
