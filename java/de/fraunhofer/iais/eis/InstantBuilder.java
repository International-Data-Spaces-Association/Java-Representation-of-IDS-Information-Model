package de.fraunhofer.iais.eis;

import java.net.URI;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class InstantBuilder implements Builder<Instant> {

    private InstantImpl instantImpl;

    public InstantBuilder() {
        instantImpl = new InstantImpl();
    }

    public InstantBuilder(URI id) {
        this();
        instantImpl.id = id;
    }

    /**
     * This function allows setting a value for _dateTime
     * 
     * @param _dateTime_ desired value to be set
     * @return Builder object with new value for _dateTime
     */
    public InstantBuilder _dateTime_(XMLGregorianCalendar _dateTime_) {
        this.instantImpl.setDateTime(_dateTime_);
        return this;
    }

    /**
     * This function allows setting a value for _hasDuration
     * 
     * @param _hasDuration_ desired value to be set
     * @return Builder object with new value for _hasDuration
     */
    public InstantBuilder _hasDuration_(javax.xml.datatype.Duration _hasDuration_) {
        this.instantImpl.setHasDuration(_hasDuration_);
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
    public Instant build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(instantImpl);
        return instantImpl;
    }
}
