package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class LogicalConstraintBuilder implements Builder<LogicalConstraint> {

    private LogicalConstraintImpl logicalConstraintImpl;

    public LogicalConstraintBuilder() {
        logicalConstraintImpl = new LogicalConstraintImpl();
    }

    public LogicalConstraintBuilder(URI id) {
        this();
        logicalConstraintImpl.id = id;
    }

    /**
     * This function allows setting a value for _and
     * 
     * @param _and_ desired value to be set
     * @return Builder object with new value for _and
     */
    public LogicalConstraintBuilder _and_(List<Constraint> _and_) {
        this.logicalConstraintImpl.setAnd(_and_);
        return this;
    }

    /**
     * This function allows adding a value to the List _and
     * 
     * @param _and_ desired value to be added
     * @return Builder object with new value for _and
     */
    public LogicalConstraintBuilder _and_(Constraint _and_) {
        this.logicalConstraintImpl.getAnd().add(_and_);
        return this;
    }

    /**
     * This function allows setting a value for _or
     * 
     * @param _or_ desired value to be set
     * @return Builder object with new value for _or
     */
    public LogicalConstraintBuilder _or_(List<Constraint> _or_) {
        this.logicalConstraintImpl.setOr(_or_);
        return this;
    }

    /**
     * This function allows adding a value to the List _or
     * 
     * @param _or_ desired value to be added
     * @return Builder object with new value for _or
     */
    public LogicalConstraintBuilder _or_(Constraint _or_) {
        this.logicalConstraintImpl.getOr().add(_or_);
        return this;
    }

    /**
     * This function allows setting a value for _xone
     * 
     * @param _xone_ desired value to be set
     * @return Builder object with new value for _xone
     */
    public LogicalConstraintBuilder _xone_(List<Constraint> _xone_) {
        this.logicalConstraintImpl.setXone(_xone_);
        return this;
    }

    /**
     * This function allows adding a value to the List _xone
     * 
     * @param _xone_ desired value to be added
     * @return Builder object with new value for _xone
     */
    public LogicalConstraintBuilder _xone_(Constraint _xone_) {
        this.logicalConstraintImpl.getXone().add(_xone_);
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
    public LogicalConstraint build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(logicalConstraintImpl);
        return logicalConstraintImpl;
    }
}
