package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class LeftOperandBuilder implements Builder<LeftOperand> {

    private LeftOperandImpl leftOperandImpl;

    public LeftOperandBuilder() {
        leftOperandImpl = new LeftOperandImpl();
    }

    public LeftOperandBuilder(URI id) {
        this();
        leftOperandImpl.id = id;
    }

    /**
     * This function allows setting a value for _broader
     * 
     * @param _broader_ desired value to be set
     * @return Builder object with new value for _broader
     */
    public LeftOperandBuilder _broader_(LeftOperand _broader_) {
        this.leftOperandImpl.setBroader(_broader_);
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
    public LeftOperand build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(leftOperandImpl);
        return leftOperandImpl;
    }
}
