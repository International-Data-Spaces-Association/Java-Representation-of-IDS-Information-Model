package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class EvaluationFacilityBuilder implements Builder<EvaluationFacility> {

    private EvaluationFacilityImpl evaluationFacilityImpl;

    public EvaluationFacilityBuilder() {
        evaluationFacilityImpl = new EvaluationFacilityImpl();
    }

    public EvaluationFacilityBuilder(URI id) {
        this();
        evaluationFacilityImpl.id = id;
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
    public EvaluationFacility build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(evaluationFacilityImpl);
        return evaluationFacilityImpl;
    }
}
