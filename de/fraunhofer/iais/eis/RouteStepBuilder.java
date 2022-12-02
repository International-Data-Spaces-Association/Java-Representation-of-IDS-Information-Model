package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class RouteStepBuilder implements Builder<RouteStep> {

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
     * 
     * @param _requiredDataApp_ desired value to be set
     * @return Builder object with new value for _requiredDataApp
     */
    public RouteStepBuilder _requiredDataApp_(AppRepresentation _requiredDataApp_) {
        this.routeStepImpl.setRequiredDataApp(_requiredDataApp_);
        return this;
    }

    /**
     * This function allows setting a value for _routeDeployMethod
     * 
     * @param _routeDeployMethod_ desired value to be set
     * @return Builder object with new value for _routeDeployMethod
     */
    public RouteStepBuilder _routeDeployMethod_(String _routeDeployMethod_) {
        this.routeStepImpl.setRouteDeployMethod(_routeDeployMethod_);
        return this;
    }

    /**
     * This function allows setting a value for _routeDescription
     * 
     * @param _routeDescription_ desired value to be set
     * @return Builder object with new value for _routeDescription
     */
    public RouteStepBuilder _routeDescription_(String _routeDescription_) {
        this.routeStepImpl.setRouteDescription(_routeDescription_);
        return this;
    }

    /**
     * This function allows setting a value for _routeConfiguration
     * 
     * @param _routeConfiguration_ desired value to be set
     * @return Builder object with new value for _routeConfiguration
     */
    public RouteStepBuilder _routeConfiguration_(String _routeConfiguration_) {
        this.routeStepImpl.setRouteConfiguration(_routeConfiguration_);
        return this;
    }

    /**
     * This function allows setting a value for _hasSubRoute
     * 
     * @param _hasSubRoute_ desired value to be set
     * @return Builder object with new value for _hasSubRoute
     */
    public RouteStepBuilder _hasSubRoute_(List<RouteStep> _hasSubRoute_) {
        this.routeStepImpl.setHasSubRoute(_hasSubRoute_);
        return this;
    }

    /**
     * This function allows adding a value to the List _hasSubRoute
     * 
     * @param _hasSubRoute_ desired value to be added
     * @return Builder object with new value for _hasSubRoute
     */
    public RouteStepBuilder _hasSubRoute_(RouteStep _hasSubRoute_) {
        this.routeStepImpl.getHasSubRoute().add(_hasSubRoute_);
        return this;
    }

    /**
     * This function allows setting a value for _appRouteStart
     * 
     * @param _appRouteStart_ desired value to be set
     * @return Builder object with new value for _appRouteStart
     */
    public RouteStepBuilder _appRouteStart_(List<Endpoint> _appRouteStart_) {
        this.routeStepImpl.setAppRouteStart(_appRouteStart_);
        return this;
    }

    /**
     * This function allows adding a value to the List _appRouteStart
     * 
     * @param _appRouteStart_ desired value to be added
     * @return Builder object with new value for _appRouteStart
     */
    public RouteStepBuilder _appRouteStart_(Endpoint _appRouteStart_) {
        this.routeStepImpl.getAppRouteStart().add(_appRouteStart_);
        return this;
    }

    /**
     * This function allows setting a value for _appRouteEnd
     * 
     * @param _appRouteEnd_ desired value to be set
     * @return Builder object with new value for _appRouteEnd
     */
    public RouteStepBuilder _appRouteEnd_(List<Endpoint> _appRouteEnd_) {
        this.routeStepImpl.setAppRouteEnd(_appRouteEnd_);
        return this;
    }

    /**
     * This function allows adding a value to the List _appRouteEnd
     * 
     * @param _appRouteEnd_ desired value to be added
     * @return Builder object with new value for _appRouteEnd
     */
    public RouteStepBuilder _appRouteEnd_(Endpoint _appRouteEnd_) {
        this.routeStepImpl.getAppRouteEnd().add(_appRouteEnd_);
        return this;
    }

    /**
     * This function allows setting a value for _appRouteOutput
     * 
     * @param _appRouteOutput_ desired value to be set
     * @return Builder object with new value for _appRouteOutput
     */
    public RouteStepBuilder _appRouteOutput_(List<Resource> _appRouteOutput_) {
        this.routeStepImpl.setAppRouteOutput(_appRouteOutput_);
        return this;
    }

    /**
     * This function allows adding a value to the List _appRouteOutput
     * 
     * @param _appRouteOutput_ desired value to be added
     * @return Builder object with new value for _appRouteOutput
     */
    public RouteStepBuilder _appRouteOutput_(Resource _appRouteOutput_) {
        this.routeStepImpl.getAppRouteOutput().add(_appRouteOutput_);
        return this;
    }

    /**
     * This function allows setting a value for _appRouteBroker
     * 
     * @param _appRouteBroker_ desired value to be set
     * @return Builder object with new value for _appRouteBroker
     */
    public RouteStepBuilder _appRouteBroker_(List<Broker> _appRouteBroker_) {
        this.routeStepImpl.setAppRouteBroker(_appRouteBroker_);
        return this;
    }

    /**
     * This function allows adding a value to the List _appRouteBroker
     * 
     * @param _appRouteBroker_ desired value to be added
     * @return Builder object with new value for _appRouteBroker
     */
    public RouteStepBuilder _appRouteBroker_(Broker _appRouteBroker_) {
        this.routeStepImpl.getAppRouteBroker().add(_appRouteBroker_);
        return this;
    }

    /**
     * This function allows setting a value for _appRouteClearingHouse
     * 
     * @param _appRouteClearingHouse_ desired value to be set
     * @return Builder object with new value for _appRouteClearingHouse
     */
    public RouteStepBuilder _appRouteClearingHouse_(List<ClearingHouse> _appRouteClearingHouse_) {
        this.routeStepImpl.setAppRouteClearingHouse(_appRouteClearingHouse_);
        return this;
    }

    /**
     * This function allows adding a value to the List _appRouteClearingHouse
     * 
     * @param _appRouteClearingHouse_ desired value to be added
     * @return Builder object with new value for _appRouteClearingHouse
     */
    public RouteStepBuilder _appRouteClearingHouse_(ClearingHouse _appRouteClearingHouse_) {
        this.routeStepImpl.getAppRouteClearingHouse().add(_appRouteClearingHouse_);
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
    public RouteStep build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(routeStepImpl);
        return routeStepImpl;
    }
}
