package de.fraunhofer.iais.eis;

import java.net.URI;

import de.fraunhofer.iais.eis.util.*;

public class LogLevelBuilder implements Builder<LogLevel> {

    private LogLevelImpl logLevelImpl;

    public LogLevelBuilder() {
        logLevelImpl = new LogLevelImpl();
    }

    public LogLevelBuilder(URI id) {
        this();
        logLevelImpl.id = id;
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
    public LogLevel build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(logLevelImpl);
        return logLevelImpl;
    }
}
