package de.fraunhofer.iais.eis;

import java.net.URI;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Class of all frequencies.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = FrequencyImpl.class)
})
public interface Frequency extends ModelClass {

    // standard methods

    @Beta
    public Frequency deepCopy();

    // Default instances of this class as defined in the ontology

    /**
     * The event occurs once a year.
     */
    Frequency ANNUAL = new FrequencyBuilder(URI.create("https://w3id.org/idsa/code/ANNUAL")).build();

    /**
     * The event occurs every two years.
     */
    Frequency BIENNIAL = new FrequencyBuilder(URI.create("https://w3id.org/idsa/code/BIENNIAL")).build();

    /**
     * The event occurs twice an hour.
     */
    Frequency BIHOURLY = new FrequencyBuilder(URI.create("https://w3id.org/idsa/code/BIHOURLY")).build();

    /**
     * The event occurs every two months.
     */
    Frequency BIMONTHLY = new FrequencyBuilder(URI.create("https://w3id.org/idsa/code/BIMONTHLY")).build();

    /**
     * The event occurs every two weeks.
     */
    Frequency BIWEEKLY = new FrequencyBuilder(URI.create("https://w3id.org/idsa/code/BIWEEKLY")).build();

    /**
     * The event repeats without interruption.
     */
    Frequency CONTINUOUS = new FrequencyBuilder(URI.create("https://w3id.org/idsa/code/CONTINUOUS")).build();

    /**
     * The event occurs once a day.
     */
    Frequency DAILY = new FrequencyBuilder(URI.create("https://w3id.org/idsa/code/DAILY")).build();

    /**
     * The event occurs every 10 minutes.
     */
    Frequency EVERY_10_MINUTES = new FrequencyBuilder(URI.create("https://w3id.org/idsa/code/EVERY_10_MINUTES")).build();

    /**
     * The event occurs every 15 minutes.
     */
    Frequency EVERY_15_MINUTES = new FrequencyBuilder(URI.create("https://w3id.org/idsa/code/EVERY_15_MINUTES")).build();

    /**
     * The event occurs every 1 minute.
     */
    Frequency EVERY_1_MINUTE = new FrequencyBuilder(URI.create("https://w3id.org/idsa/code/EVERY_1_MINUTE")).build();

    /**
     * The event occurs every 30 minutes.
     */
    Frequency EVERY_30_MINUTES = new FrequencyBuilder(URI.create("https://w3id.org/idsa/code/EVERY_30_MINUTES")).build();

    /**
     * The event occurs every 5 minutes.
     */
    Frequency EVERY_5_MINUTES = new FrequencyBuilder(URI.create("https://w3id.org/idsa/code/EVERY_5_MINUTES")).build();

    /**
     * The event occurs every three hours.
     */
    Frequency EVERY_THREE_HOURS = new FrequencyBuilder(URI.create("https://w3id.org/idsa/code/EVERY_THREE_HOURS")).build();

    /**
     * The event occurs every hour.
     */
    Frequency HOURLY = new FrequencyBuilder(URI.create("https://w3id.org/idsa/code/HOURLY")).build();

    /**
     * The event occurs at uneven intervals.
     */
    Frequency IRREGULAR = new FrequencyBuilder(URI.create("https://w3id.org/idsa/code/IRREGULAR")).build();

    /**
     * The event occurs once a month.
     */
    Frequency MONTHLY = new FrequencyBuilder(URI.create("https://w3id.org/idsa/code/MONTHLY")).build();

    /**
     * The event occurs every three months.
     */
    Frequency QUARTERLY = new FrequencyBuilder(URI.create("https://w3id.org/idsa/code/QUARTERLY")).build();

    /**
     * The event occurs twice a year.
     */
    Frequency SEMIANNUAL = new FrequencyBuilder(URI.create("https://w3id.org/idsa/code/SEMIANNUAL")).build();

    /**
     * The event occurs twice a month.
     */
    Frequency SEMIMONTHLY = new FrequencyBuilder(URI.create("https://w3id.org/idsa/code/SEMIMONTHLY")).build();

    /**
     * The event occurs twice a week.
     */
    Frequency SEMIWEEKLY = new FrequencyBuilder(URI.create("https://w3id.org/idsa/code/SEMIWEEKLY")).build();

    /**
     * The event occurs three times a month.
     */
    Frequency THREE_TIMES_A_MONTH = new FrequencyBuilder(URI.create("https://w3id.org/idsa/code/THREE_TIMES_A_MONTH")).build();

    /**
     * The event occurs three times a week.
     */
    Frequency THREE_TIMES_A_WEEK = new FrequencyBuilder(URI.create("https://w3id.org/idsa/code/THREE_TIMES_A_WEEK")).build();

    /**
     * The event occurs three times a year.
     */
    Frequency THREE_TIMES_A_YEAR = new FrequencyBuilder(URI.create("https://w3id.org/idsa/code/THREE_TIMES_A_YEAR")).build();

    /**
     * The event occurs every three years.
     */
    Frequency TRIENNIAL = new FrequencyBuilder(URI.create("https://w3id.org/idsa/code/TRIENNIAL")).build();

    /**
     * The event occurs twice a day.
     */
    Frequency TWO_TIMES_A_DAY = new FrequencyBuilder(URI.create("https://w3id.org/idsa/code/TWO_TIMES_A_DAY")).build();

    /**
     * The event occurs once a week.
     */
    Frequency WEEKLY = new FrequencyBuilder(URI.create("https://w3id.org/idsa/code/WEEKLY")).build();

}
