package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class SmartDataAppBuilder implements Builder<SmartDataApp> {

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
     * 
     * @param _appDocumentation_ desired value to be set
     * @return Builder object with new value for _appDocumentation
     */
    public SmartDataAppBuilder _appDocumentation_(String _appDocumentation_) {
        this.smartDataAppImpl.setAppDocumentation(_appDocumentation_);
        return this;
    }

    /**
     * This function allows setting a value for _appEndpoint
     * 
     * @param _appEndpoint_ desired value to be set
     * @return Builder object with new value for _appEndpoint
     */
    public SmartDataAppBuilder _appEndpoint_(List<AppEndpoint> _appEndpoint_) {
        this.smartDataAppImpl.setAppEndpoint(_appEndpoint_);
        return this;
    }

    /**
     * This function allows adding a value to the List _appEndpoint
     * 
     * @param _appEndpoint_ desired value to be added
     * @return Builder object with new value for _appEndpoint
     */
    public SmartDataAppBuilder _appEndpoint_(AppEndpoint _appEndpoint_) {
        this.smartDataAppImpl.getAppEndpoint().add(_appEndpoint_);
        return this;
    }

    /**
     * This function allows setting a value for _appEnvironmentVariables
     * 
     * @param _appEnvironmentVariables_ desired value to be set
     * @return Builder object with new value for _appEnvironmentVariables
     */
    public SmartDataAppBuilder _appEnvironmentVariables_(String _appEnvironmentVariables_) {
        this.smartDataAppImpl.setAppEnvironmentVariables(_appEnvironmentVariables_);
        return this;
    }

    /**
     * This function allows setting a value for _appStorageConfiguration
     * 
     * @param _appStorageConfiguration_ desired value to be set
     * @return Builder object with new value for _appStorageConfiguration
     */
    public SmartDataAppBuilder _appStorageConfiguration_(String _appStorageConfiguration_) {
        this.smartDataAppImpl.setAppStorageConfiguration(_appStorageConfiguration_);
        return this;
    }

    /**
     * This function allows setting a value for _supportedUsagePolicies
     * 
     * @param _supportedUsagePolicies_ desired value to be set
     * @return Builder object with new value for _supportedUsagePolicies
     */
    public SmartDataAppBuilder _supportedUsagePolicies_(List<UsagePolicyClass> _supportedUsagePolicies_) {
        this.smartDataAppImpl.setSupportedUsagePolicies(_supportedUsagePolicies_);
        return this;
    }

    /**
     * This function allows adding a value to the List _supportedUsagePolicies
     * 
     * @param _supportedUsagePolicies_ desired value to be added
     * @return Builder object with new value for _supportedUsagePolicies
     */
    public SmartDataAppBuilder _supportedUsagePolicies_(UsagePolicyClass _supportedUsagePolicies_) {
        this.smartDataAppImpl.getSupportedUsagePolicies().add(_supportedUsagePolicies_);
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
    public SmartDataApp build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(smartDataAppImpl);
        return smartDataAppImpl;
    }
}
