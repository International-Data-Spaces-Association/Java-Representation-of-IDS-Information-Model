package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class AppRouteBuilder implements Builder<AppRoute> {

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
     * 
     * @param _routeDeployMethod_ desired value to be set
     * @return Builder object with new value for _routeDeployMethod
     */
    public AppRouteBuilder _routeDeployMethod_(String _routeDeployMethod_) {
        this.appRouteImpl.setRouteDeployMethod(_routeDeployMethod_);
        return this;
    }

    /**
     * This function allows setting a value for _routeDescription
     * 
     * @param _routeDescription_ desired value to be set
     * @return Builder object with new value for _routeDescription
     */
    public AppRouteBuilder _routeDescription_(String _routeDescription_) {
        this.appRouteImpl.setRouteDescription(_routeDescription_);
        return this;
    }

    /**
     * This function allows setting a value for _routeConfiguration
     * 
     * @param _routeConfiguration_ desired value to be set
     * @return Builder object with new value for _routeConfiguration
     */
    public AppRouteBuilder _routeConfiguration_(String _routeConfiguration_) {
        this.appRouteImpl.setRouteConfiguration(_routeConfiguration_);
        return this;
    }

    /**
     * This function allows setting a value for _hasSubRoute
     * 
     * @param _hasSubRoute_ desired value to be set
     * @return Builder object with new value for _hasSubRoute
     */
    public AppRouteBuilder _hasSubRoute_(List<RouteStep> _hasSubRoute_) {
        this.appRouteImpl.setHasSubRoute(_hasSubRoute_);
        return this;
    }

    /**
     * This function allows adding a value to the List _hasSubRoute
     * 
     * @param _hasSubRoute_ desired value to be added
     * @return Builder object with new value for _hasSubRoute
     */
    public AppRouteBuilder _hasSubRoute_(RouteStep _hasSubRoute_) {
        this.appRouteImpl.getHasSubRoute().add(_hasSubRoute_);
        return this;
    }

    /**
     * This function allows setting a value for _appRouteStart
     * 
     * @param _appRouteStart_ desired value to be set
     * @return Builder object with new value for _appRouteStart
     */
    public AppRouteBuilder _appRouteStart_(List<Endpoint> _appRouteStart_) {
        this.appRouteImpl.setAppRouteStart(_appRouteStart_);
        return this;
    }

    /**
     * This function allows adding a value to the List _appRouteStart
     * 
     * @param _appRouteStart_ desired value to be added
     * @return Builder object with new value for _appRouteStart
     */
    public AppRouteBuilder _appRouteStart_(Endpoint _appRouteStart_) {
        this.appRouteImpl.getAppRouteStart().add(_appRouteStart_);
        return this;
    }

    /**
     * This function allows setting a value for _appRouteEnd
     * 
     * @param _appRouteEnd_ desired value to be set
     * @return Builder object with new value for _appRouteEnd
     */
    public AppRouteBuilder _appRouteEnd_(List<Endpoint> _appRouteEnd_) {
        this.appRouteImpl.setAppRouteEnd(_appRouteEnd_);
        return this;
    }

    /**
     * This function allows adding a value to the List _appRouteEnd
     * 
     * @param _appRouteEnd_ desired value to be added
     * @return Builder object with new value for _appRouteEnd
     */
    public AppRouteBuilder _appRouteEnd_(Endpoint _appRouteEnd_) {
        this.appRouteImpl.getAppRouteEnd().add(_appRouteEnd_);
        return this;
    }

    /**
     * This function allows setting a value for _appRouteOutput
     * 
     * @param _appRouteOutput_ desired value to be set
     * @return Builder object with new value for _appRouteOutput
     */
    public AppRouteBuilder _appRouteOutput_(List<Resource> _appRouteOutput_) {
        this.appRouteImpl.setAppRouteOutput(_appRouteOutput_);
        return this;
    }

    /**
     * This function allows adding a value to the List _appRouteOutput
     * 
     * @param _appRouteOutput_ desired value to be added
     * @return Builder object with new value for _appRouteOutput
     */
    public AppRouteBuilder _appRouteOutput_(Resource _appRouteOutput_) {
        this.appRouteImpl.getAppRouteOutput().add(_appRouteOutput_);
        return this;
    }

    /**
     * This function allows setting a value for _appRouteBroker
     * 
     * @param _appRouteBroker_ desired value to be set
     * @return Builder object with new value for _appRouteBroker
     */
    public AppRouteBuilder _appRouteBroker_(List<Broker> _appRouteBroker_) {
        this.appRouteImpl.setAppRouteBroker(_appRouteBroker_);
        return this;
    }

    /**
     * This function allows adding a value to the List _appRouteBroker
     * 
     * @param _appRouteBroker_ desired value to be added
     * @return Builder object with new value for _appRouteBroker
     */
    public AppRouteBuilder _appRouteBroker_(Broker _appRouteBroker_) {
        this.appRouteImpl.getAppRouteBroker().add(_appRouteBroker_);
        return this;
    }

    /**
     * This function allows setting a value for _appRouteClearingHouse
     * 
     * @param _appRouteClearingHouse_ desired value to be set
     * @return Builder object with new value for _appRouteClearingHouse
     */
    public AppRouteBuilder _appRouteClearingHouse_(List<ClearingHouse> _appRouteClearingHouse_) {
        this.appRouteImpl.setAppRouteClearingHouse(_appRouteClearingHouse_);
        return this;
    }

    /**
     * This function allows adding a value to the List _appRouteClearingHouse
     * 
     * @param _appRouteClearingHouse_ desired value to be added
     * @return Builder object with new value for _appRouteClearingHouse
     */
    public AppRouteBuilder _appRouteClearingHouse_(ClearingHouse _appRouteClearingHouse_) {
        this.appRouteImpl.getAppRouteClearingHouse().add(_appRouteClearingHouse_);
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
    public AppRoute build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(appRouteImpl);
        return appRouteImpl;
    }
}
