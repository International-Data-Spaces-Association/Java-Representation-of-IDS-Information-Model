package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class ConnectorStatusBuilder implements Builder<ConnectorStatus> {

    private ConnectorStatusImpl connectorStatusImpl;

    public ConnectorStatusBuilder() {
        connectorStatusImpl = new ConnectorStatusImpl();
    }

    public ConnectorStatusBuilder(URI id) {
        this();
        connectorStatusImpl.id = id;
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
    public ConnectorStatus build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(connectorStatusImpl);
        return connectorStatusImpl;
    }
}
