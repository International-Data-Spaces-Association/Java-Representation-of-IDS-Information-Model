package de.fraunhofer.iais.eis;

import java.net.URI;

import de.fraunhofer.iais.eis.util.*;

public class ConnectorDeployModeBuilder implements Builder<ConnectorDeployMode> {

    private ConnectorDeployModeImpl connectorDeployModeImpl;

    public ConnectorDeployModeBuilder() {
        connectorDeployModeImpl = new ConnectorDeployModeImpl();
    }

    public ConnectorDeployModeBuilder(URI id) {
        this();
        connectorDeployModeImpl.id = id;
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
    public ConnectorDeployMode build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(connectorDeployModeImpl);
        return connectorDeployModeImpl;
    }
}
