package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class QueryLanguageBuilder implements Builder<QueryLanguage> {

    private QueryLanguageImpl queryLanguageImpl;

    public QueryLanguageBuilder() {
        queryLanguageImpl = new QueryLanguageImpl();
    }

    public QueryLanguageBuilder(URI id) {
        this();
        queryLanguageImpl.id = id;
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
    public QueryLanguage build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(queryLanguageImpl);
        return queryLanguageImpl;
    }
}
