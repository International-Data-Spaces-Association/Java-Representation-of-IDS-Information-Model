package de.fraunhofer.iais.eis;

import java.net.URI;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Represents a standard to measure a quality dimension. An observation (instance of
 * dqv:QualityMeasurement) assigns a value in a given unit to a Metric.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = MetricImpl.class)
})
public interface Metric extends ModelClass {

    // standard methods

    @Beta
    public Metric deepCopy();

    // Default instances of this class as defined in the ontology

    /** 
    */
    Metric RATEOFOBJECTSWITHINCONSISTENCYBETWEENGIVENPROPERTIES =
        new MetricBuilder(URI.create("https://data.norge.no/vocabulary/dqvno#rateOfObjectsWithInconsistencyBetweenGivenProperties"))
            .build();

    /** 
    */
    Metric POPULATION_COMPLETENESS = new MetricBuilder(URI.create("https://w3id.org/idsa/code/POPULATION_COMPLETENESS")).build();

    /** 
    */
    Metric SPATIAL_ACCURACY = new MetricBuilder(URI.create("https://w3id.org/idsa/code/SPATIAL_ACCURACY")).build();

    /** 
    */
    Metric SPATIAL_RESOLUTION_AS_ANGULAR_DISTANCE =
        new MetricBuilder(URI.create("https://w3id.org/idsa/code/SPATIAL_RESOLUTION_AS_ANGULAR_DISTANCE")).build();

}
