package de.fraunhofer.iais.eis;

import java.net.URI;

import de.fraunhofer.iais.eis.util.*;

public class LanguageBuilder implements Builder<Language> {

    private LanguageImpl languageImpl;

    public LanguageBuilder() {
        languageImpl = new LanguageImpl();
    }

    public LanguageBuilder(URI id) {
        this();
        languageImpl.id = id;
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
    public Language build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(languageImpl);
        return languageImpl;
    }
}
