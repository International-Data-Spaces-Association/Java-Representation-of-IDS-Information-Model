package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class ConstraintBuilder implements Builder<Constraint> {

    private ConstraintImpl constraintImpl;

    public ConstraintBuilder() {
        constraintImpl = new ConstraintImpl();
    }

    public ConstraintBuilder(URI id) {
        this();
        constraintImpl.id = id;
    }

    /**
     * This function allows setting a value for _leftOperand
     * 
     * @param _leftOperand_ desired value to be set
     * @return Builder object with new value for _leftOperand
     */
    public ConstraintBuilder _leftOperand_(LeftOperand _leftOperand_) {
        this.constraintImpl.setLeftOperand(_leftOperand_);
        return this;
    }

    /**
     * This function allows setting a value for _operator
     * 
     * @param _operator_ desired value to be set
     * @return Builder object with new value for _operator
     */
    public ConstraintBuilder _operator_(BinaryOperator _operator_) {
        this.constraintImpl.setOperator(_operator_);
        return this;
    }

    /**
     * This function allows setting a value for _rightOperand
     * 
     * @param _rightOperand_ desired value to be set
     * @return Builder object with new value for _rightOperand
     */
    public ConstraintBuilder _rightOperand_(RdfResource _rightOperand_) {
        this.constraintImpl.setRightOperand(_rightOperand_);
        return this;
    }

    /**
     * This function allows setting a value for _rightOperandReference
     * 
     * @param _rightOperandReference_ desired value to be set
     * @return Builder object with new value for _rightOperandReference
     */
    public ConstraintBuilder _rightOperandReference_(URI _rightOperandReference_) {
        this.constraintImpl.setRightOperandReference(_rightOperandReference_);
        return this;
    }

    /**
     * This function allows setting a value for _unit
     * 
     * @param _unit_ desired value to be set
     * @return Builder object with new value for _unit
     */
    public ConstraintBuilder _unit_(URI _unit_) {
        this.constraintImpl.setUnit(_unit_);
        return this;
    }

    /**
     * This function allows setting a value for _pipEndpoint
     * 
     * @param _pipEndpoint_ desired value to be set
     * @return Builder object with new value for _pipEndpoint
     */
    public ConstraintBuilder _pipEndpoint_(URI _pipEndpoint_) {
        this.constraintImpl.setPipEndpoint(_pipEndpoint_);
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
    public Constraint build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(constraintImpl);
        return constraintImpl;
    }
}
