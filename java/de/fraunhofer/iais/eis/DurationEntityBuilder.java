package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class DurationEntityBuilder implements Builder<DurationEntity> {

    private DurationEntityImpl durationEntityImpl;

    public DurationEntityBuilder() {
        durationEntityImpl = new DurationEntityImpl();
    }

    public DurationEntityBuilder(URI id) {
        this();
        durationEntityImpl.id = id;
    }

    /**
     * This function allows setting a value for _hasDuration
     * 
     * @param _hasDuration_ desired value to be set
     * @return Builder object with new value for _hasDuration
     */
    public DurationEntityBuilder _hasDuration_(javax.xml.datatype.Duration _hasDuration_) {
        this.durationEntityImpl.setHasDuration(_hasDuration_);
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
    public DurationEntity build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(durationEntityImpl);
        return durationEntityImpl;
    }
}
