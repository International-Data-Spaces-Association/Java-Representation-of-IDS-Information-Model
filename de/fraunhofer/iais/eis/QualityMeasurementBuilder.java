package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class QualityMeasurementBuilder implements Builder<QualityMeasurement> {

    private QualityMeasurementImpl qualityMeasurementImpl;

    public QualityMeasurementBuilder() {
        qualityMeasurementImpl = new QualityMeasurementImpl();
    }

    public QualityMeasurementBuilder(URI id) {
        this();
        qualityMeasurementImpl.id = id;
    }

    /**
     * This function allows setting a value for _isMeasurementOf
     * 
     * @param _isMeasurementOf_ desired value to be set
     * @return Builder object with new value for _isMeasurementOf
     */
    public QualityMeasurementBuilder _isMeasurementOf_(Metric _isMeasurementOf_) {
        this.qualityMeasurementImpl.setIsMeasurementOf(_isMeasurementOf_);
        return this;
    }

    /**
     * This function allows setting a value for _value
     * 
     * @param _value_ desired value to be set
     * @return Builder object with new value for _value
     */
    public QualityMeasurementBuilder _value_(TypedLiteral _value_) {
        this.qualityMeasurementImpl.setValue(_value_);
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
    public QualityMeasurement build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(qualityMeasurementImpl);
        return qualityMeasurementImpl;
    }
}
