package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.*;
import javax.validation.constraints.*;
import java.util.Arrays;
import java.io.Serializable;

import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

public class RouteStepBuilder {

	private RouteStepImpl routeStepImpl;

	public RouteStepBuilder() {
		routeStepImpl = new RouteStepImpl();
	}

	public RouteStepBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		routeStepImpl.id = id;
	}

	final public RouteStepBuilder _requiredDataApp_(AppRepresentation _requiredDataApp_) {
		this.routeStepImpl._requiredDataApp = _requiredDataApp_;
		return this;
	}


	final public RouteStepBuilder _routeDeployMethod_(String _routeDeployMethod_) {
		this.routeStepImpl._routeDeployMethod = _routeDeployMethod_;
		return this;
	}


	final public RouteStepBuilder _hasSubRoute_(java.util.ArrayList<? extends RouteStep> _hasSubRoute_) {
		this.routeStepImpl._hasSubRoute = _hasSubRoute_;
		return this;
	}


	final public RouteStepBuilder _appRouteStart_(java.util.ArrayList<? extends Endpoint> _appRouteStart_) {
		this.routeStepImpl._appRouteStart = _appRouteStart_;
		return this;
	}


	final public RouteStepBuilder _appRouteEnd_(java.util.ArrayList<? extends Endpoint> _appRouteEnd_) {
		this.routeStepImpl._appRouteEnd = _appRouteEnd_;
		return this;
	}


	final public RouteStepBuilder _appRouteOutput_(java.util.ArrayList<? extends Resource> _appRouteOutput_) {
		this.routeStepImpl._appRouteOutput = _appRouteOutput_;
		return this;
	}


	final public RouteStepBuilder _appRouteBroker_(java.util.ArrayList<? extends Broker> _appRouteBroker_) {
		this.routeStepImpl._appRouteBroker = _appRouteBroker_;
		return this;
	}


	final public RouteStepBuilder _appRouteClearingHouse_(java.util.ArrayList<? extends ClearingHouse> _appRouteClearingHouse_) {
		this.routeStepImpl._appRouteClearingHouse = _appRouteClearingHouse_;
		return this;
	}


	final public RouteStepBuilder _routeDescription_(String _routeDescription_) {
		this.routeStepImpl._routeDescription = _routeDescription_;
		return this;
	}


	final public RouteStepBuilder _routeConfiguration_(String _routeConfiguration_) {
		this.routeStepImpl._routeConfiguration = _routeConfiguration_;
		return this;
	}

	public final RouteStep build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(routeStepImpl);
		return routeStepImpl;
	}
}
