package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.JsonNode;

import de.fraunhofer.iais.eis.util.*;

/**
 * Class of all frequencies.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:Frequency")
public enum DefaultFrequency implements Frequency {

    /**
     * The event occurs once a year.
     */
    ANNUAL("https://w3id.org/idsa/code/ANNUAL"),

    /**
     * The event occurs every two years.
     */
    BIENNIAL("https://w3id.org/idsa/code/BIENNIAL"),

    /**
     * The event occurs twice an hour.
     */
    BIHOURLY("https://w3id.org/idsa/code/BIHOURLY"),

    /**
     * The event occurs every two months.
     */
    BIMONTHLY("https://w3id.org/idsa/code/BIMONTHLY"),

    /**
     * The event occurs every two weeks.
     */
    BIWEEKLY("https://w3id.org/idsa/code/BIWEEKLY"),

    /**
     * The event repeats without interruption.
     */
    CONTINUOUS("https://w3id.org/idsa/code/CONTINUOUS"),

    /**
     * The event occurs once a day.
     */
    DAILY("https://w3id.org/idsa/code/DAILY"),

    /**
     * The event occurs every 10 minutes.
     */
    EVERY_10_MINUTES("https://w3id.org/idsa/code/EVERY_10_MINUTES"),

    /**
     * The event occurs every 15 minutes.
     */
    EVERY_15_MINUTES("https://w3id.org/idsa/code/EVERY_15_MINUTES"),

    /**
     * The event occurs every 1 minute.
     */
    EVERY_1_MINUTE("https://w3id.org/idsa/code/EVERY_1_MINUTE"),

    /**
     * The event occurs every 30 minutes.
     */
    EVERY_30_MINUTES("https://w3id.org/idsa/code/EVERY_30_MINUTES"),

    /**
     * The event occurs every 5 minutes.
     */
    EVERY_5_MINUTES("https://w3id.org/idsa/code/EVERY_5_MINUTES"),

    /**
     * The event occurs every three hours.
     */
    EVERY_THREE_HOURS("https://w3id.org/idsa/code/EVERY_THREE_HOURS"),

    /**
     * The event occurs every hour.
     */
    HOURLY("https://w3id.org/idsa/code/HOURLY"),

    /**
     * The event occurs at uneven intervals.
     */
    IRREGULAR("https://w3id.org/idsa/code/IRREGULAR"),

    /**
     * The event occurs once a month.
     */
    MONTHLY("https://w3id.org/idsa/code/MONTHLY"),

    /**
     * The event occurs every three months.
     */
    QUARTERLY("https://w3id.org/idsa/code/QUARTERLY"),

    /**
     * The event occurs twice a year.
     */
    SEMIANNUAL("https://w3id.org/idsa/code/SEMIANNUAL"),

    /**
     * The event occurs twice a month.
     */
    SEMIMONTHLY("https://w3id.org/idsa/code/SEMIMONTHLY"),

    /**
     * The event occurs twice a week.
     */
    SEMIWEEKLY("https://w3id.org/idsa/code/SEMIWEEKLY"),

    /**
     * The event occurs three times a month.
     */
    THREE_TIMES_A_MONTH("https://w3id.org/idsa/code/THREE_TIMES_A_MONTH"),

    /**
     * The event occurs three times a week.
     */
    THREE_TIMES_A_WEEK("https://w3id.org/idsa/code/THREE_TIMES_A_WEEK"),

    /**
     * The event occurs three times a year.
     */
    THREE_TIMES_A_YEAR("https://w3id.org/idsa/code/THREE_TIMES_A_YEAR"),

    /**
     * The event occurs every three years.
     */
    TRIENNIAL("https://w3id.org/idsa/code/TRIENNIAL"),

    /**
     * The event occurs twice a day.
     */
    TWO_TIMES_A_DAY("https://w3id.org/idsa/code/TWO_TIMES_A_DAY"),

    /**
     * The event occurs once a week.
     */
    WEEKLY("https://w3id.org/idsa/code/WEEKLY"),;

    private static final Map<String, DefaultFrequency> uriInstanceMapping;
    static {
        uriInstanceMapping = new HashMap<>();
        uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
        uriInstanceMapping
            .putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
    }

    private Frequency frequency;

    DefaultFrequency(String id) {
        this.frequency = new FrequencyBuilder(URI.create(id)).build();
    }

    // TODO dummy method for generic properties, should be deleted in future versions
    public Map<String, Object> getProperties() {
        return null;
    }

    public void setProperty(String property, Object value) {
        // do nothing
    }

    /**
     * This function retrieves the ID of the current object (can be set via the constructor of the
     * builder class)
     * 
     * @return ID of current object as URI
     */

    @JsonIgnore
    @Override
    final public URI getId() {
        return this.frequency.getId();
    }

    /**
     * This function retrieves a human readable label about the current class, as defined in the
     * ontology. This label could, for example, be used as a field heading in a user interface
     * 
     * @return Human readable label
     */
    @JsonIgnore
    @Override
    final public List<TypedLiteral> getLabel() {
        return this.frequency.getLabel();
    }

    /**
     * This function retrieves a human readable explanatory comment about the current class, as defined
     * in the ontology. This comment could, for example, be used as a tooltip in a user interface
     * 
     * @return Human readable explanatory comment
     */
    @JsonIgnore
    @Override
    final public List<TypedLiteral> getComment() {
        return this.frequency.getComment();
    }

    public String toRdf() {
        return VocabUtil.getInstance().toRdf(this);
    }

    @JsonProperty("@id")
    final public URI getSerializedId() {
        return this.frequency.getId();
    }

    @JsonCreator
    public static DefaultFrequency deserialize(JsonNode node) {
        return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
    }

    @Override
    public String toString() {
        return this.frequency.getId().toString();
    }

    @Override
    public Frequency deepCopy() {
        // not implemented for enums
        throw new UnsupportedOperationException();
    }

}
