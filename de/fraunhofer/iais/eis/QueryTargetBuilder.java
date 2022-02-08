package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class QueryTargetBuilder implements Builder<QueryTarget> {

    private QueryTargetImpl queryTargetImpl;

    public QueryTargetBuilder() {
        queryTargetImpl = new QueryTargetImpl();
    }

    public QueryTargetBuilder(URI id) {
        this();
        queryTargetImpl.id = id;
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
    public QueryTarget build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(queryTargetImpl);
        return queryTargetImpl;
    }
}
