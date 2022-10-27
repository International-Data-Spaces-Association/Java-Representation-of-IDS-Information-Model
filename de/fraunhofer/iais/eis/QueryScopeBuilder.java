package de.fraunhofer.iais.eis;

import java.net.URI;

import de.fraunhofer.iais.eis.util.*;

public class QueryScopeBuilder implements Builder<QueryScope> {

    private QueryScopeImpl queryScopeImpl;

    public QueryScopeBuilder() {
        queryScopeImpl = new QueryScopeImpl();
    }

    public QueryScopeBuilder(URI id) {
        this();
        queryScopeImpl.id = id;
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
    public QueryScope build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(queryScopeImpl);
        return queryScopeImpl;
    }
}
