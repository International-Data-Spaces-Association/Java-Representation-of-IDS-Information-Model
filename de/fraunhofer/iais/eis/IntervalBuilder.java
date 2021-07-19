package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class IntervalBuilder implements Builder<Interval> {

    private IntervalImpl intervalImpl;

    public IntervalBuilder() {
        intervalImpl = new IntervalImpl();
    }

    public IntervalBuilder(URI id) {
        this();
        intervalImpl.id = id;
    }

    /**
     * This function allows setting a value for _begin
     * 
     * @param _begin_ desired value to be set
     * @return Builder object with new value for _begin
     */
    public IntervalBuilder _begin_(Instant _begin_) {
        this.intervalImpl.setBegin(_begin_);
        return this;
    }

    /**
     * This function allows setting a value for _end
     * 
     * @param _end_ desired value to be set
     * @return Builder object with new value for _end
     */
    public IntervalBuilder _end_(Instant _end_) {
        this.intervalImpl.setEnd(_end_);
        return this;
    }

    /**
     * This function allows setting a value for _hasDuration
     * 
     * @param _hasDuration_ desired value to be set
     * @return Builder object with new value for _hasDuration
     */
    public IntervalBuilder _hasDuration_(javax.xml.datatype.Duration _hasDuration_) {
        this.intervalImpl.setHasDuration(_hasDuration_);
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
    public Interval build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(intervalImpl);
        return intervalImpl;
    }
}
