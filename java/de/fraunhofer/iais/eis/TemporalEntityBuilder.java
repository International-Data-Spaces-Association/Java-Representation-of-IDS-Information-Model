package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class TemporalEntityBuilder implements Builder<TemporalEntity> {

    private TemporalEntityImpl temporalEntityImpl;

    public TemporalEntityBuilder() {
        temporalEntityImpl = new TemporalEntityImpl();
    }

    public TemporalEntityBuilder(URI id) {
        this();
        temporalEntityImpl.id = id;
    }

    /**
     * This function allows setting a value for _hasDuration
     * 
     * @param _hasDuration_ desired value to be set
     * @return Builder object with new value for _hasDuration
     */
    public TemporalEntityBuilder _hasDuration_(javax.xml.datatype.Duration _hasDuration_) {
        this.temporalEntityImpl.setHasDuration(_hasDuration_);
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
    public TemporalEntity build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(temporalEntityImpl);
        return temporalEntityImpl;
    }
}
