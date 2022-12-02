package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Represents the evaluation of a given dataset (or dataset distribution) against a specific quality
 * metric.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = QualityMeasurementImpl.class)
})
public interface QualityMeasurement extends ModelClass {

    // standard methods

    @Beta
    public QualityMeasurement deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Indicates the metric being observed.
     *
     * More information under http://www.w3.org/ns/dqv#isMeasurementOf
     *
     * @return Returns the Metric for the property _isMeasurementOf.
     */
    @JsonAlias({"http://www.w3.org/ns/dqv#isMeasurementOf", "http://www.w3.org/ns/dqv#isMeasurementOf", "isMeasurementOf"})
    Metric getIsMeasurementOf();

    /**
     * Indicates the metric being observed.
     *
     * More information under http://www.w3.org/ns/dqv#isMeasurementOf
     *
     * @param _isMeasurementOf_ desired value for the property _isMeasurementOf.
     */
    void setIsMeasurementOf(Metric _isMeasurementOf_);

    /**
     * Refers to values computed by metric.
     *
     * More information under http://www.w3.org/ns/dqv#value
     *
     * @return Returns the TypedLiteral for the property _value.
     */
    @JsonAlias({"http://www.w3.org/ns/dqv#value", "http://www.w3.org/ns/dqv#value", "value"})
    TypedLiteral getValue();

    /**
     * Refers to values computed by metric.
     *
     * More information under http://www.w3.org/ns/dqv#value
     *
     * @param _value_ desired value for the property _value.
     */
    void setValue(TypedLiteral _value_);

    // Default instances of this class as defined in the ontology

}
