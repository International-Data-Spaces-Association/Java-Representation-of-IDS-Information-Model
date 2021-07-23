package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.Arrays;
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
public enum Frequency implements ModelClass {

    /**
     * The event occurs once a year.
     */
    ANNUAL("https://w3id.org/idsa/code/ANNUAL", Arrays.asList(new TypedLiteral("Annual", "en")),
        Arrays.asList(new TypedLiteral("The event occurs once a year.", "en"))),

    /**
     * The event occurs every two years.
     */
    BIENNIAL("https://w3id.org/idsa/code/BIENNIAL", Arrays.asList(new TypedLiteral("Biennial", "en")),
        Arrays.asList(new TypedLiteral("The event occurs every two years.", "en"))),

    /**
     * The event occurs twice an hour.
     */
    BIHOURLY("https://w3id.org/idsa/code/BIHOURLY", Arrays.asList(new TypedLiteral("Bihourly", "en")),
        Arrays.asList(new TypedLiteral("The event occurs twice an hour.", "en"))),

    /**
     * The event occurs every two months.
     */
    BIMONTHLY("https://w3id.org/idsa/code/BIMONTHLY", Arrays.asList(new TypedLiteral("Bimonthly", "en")),
        Arrays.asList(new TypedLiteral("The event occurs every two months.", "en"))),

    /**
     * The event occurs every two weeks.
     */
    BIWEEKLY("https://w3id.org/idsa/code/BIWEEKLY", Arrays.asList(new TypedLiteral("Biweekly", "en")),
        Arrays.asList(new TypedLiteral("The event occurs every two weeks.", "en"))),

    /**
     * The event repeats without interruption.
     */
    CONTINUOUS("https://w3id.org/idsa/code/CONTINUOUS", Arrays.asList(new TypedLiteral("Continuous", "en")),
        Arrays.asList(new TypedLiteral("The event repeats without interruption.", "en"))),

    /**
     * The event occurs once a day.
     */
    DAILY("https://w3id.org/idsa/code/DAILY", Arrays.asList(new TypedLiteral("Daily", "en")),
        Arrays.asList(new TypedLiteral("The event occurs once a day.", "en"))),

    /**
     * The event occurs every 10 minutes.
     */
    EVERY_10_MINUTES("https://w3id.org/idsa/code/EVERY_10_MINUTES", Arrays.asList(new TypedLiteral("Every 10 minutes", "en")),
        Arrays.asList(new TypedLiteral("The event occurs every 10 minutes.", "en"))),

    /**
     * The event occurs every 15 minutes.
     */
    EVERY_15_MINUTES("https://w3id.org/idsa/code/EVERY_15_MINUTES", Arrays.asList(new TypedLiteral("Every 15 minutes", "en")),
        Arrays.asList(new TypedLiteral("The event occurs every 15 minutes.", "en"))),

    /**
     * The event occurs every 1 minute.
     */
    EVERY_1_MINUTE("https://w3id.org/idsa/code/EVERY_1_MINUTE", Arrays.asList(new TypedLiteral("Every 1 minutes", "en")),
        Arrays.asList(new TypedLiteral("The event occurs every 1 minute.", "en"))),

    /**
     * The event occurs every 30 minutes.
     */
    EVERY_30_MINUTES("https://w3id.org/idsa/code/EVERY_30_MINUTES", Arrays.asList(new TypedLiteral("Every 30 minutes", "en")),
        Arrays.asList(new TypedLiteral("The event occurs every 30 minutes.", "en"))),

    /**
     * The event occurs every 5 minutes.
     */
    EVERY_5_MINUTES("https://w3id.org/idsa/code/EVERY_5_MINUTES", Arrays.asList(new TypedLiteral("Every 5 minutes", "en")),
        Arrays.asList(new TypedLiteral("The event occurs every 5 minutes.", "en"))),

    /**
     * The event occurs every three hours.
     */
    EVERY_THREE_HOURS("https://w3id.org/idsa/code/EVERY_THREE_HOURS", Arrays.asList(new TypedLiteral("Every three hours", "en")),
        Arrays.asList(new TypedLiteral("The event occurs every three hours.", "en"))),

    /**
     * The event occurs every hour.
     */
    HOURLY("https://w3id.org/idsa/code/HOURLY", Arrays.asList(new TypedLiteral("Hourly", "en")),
        Arrays.asList(new TypedLiteral("The event occurs every hour.", "en"))),

    /**
     * The event occurs at uneven intervals.
     */
    IRREGULAR("https://w3id.org/idsa/code/IRREGULAR", Arrays.asList(new TypedLiteral("Irregular", "en")),
        Arrays.asList(new TypedLiteral("The event occurs at uneven intervals.", "en"))),

    /**
     * The event occurs once a month.
     */
    MONTHLY("https://w3id.org/idsa/code/MONTHLY", Arrays.asList(new TypedLiteral("Monthly", "en")),
        Arrays.asList(new TypedLiteral("The event occurs once a month.", "en"))),

    /**
     * The event occurs every three months.
     */
    QUARTERLY("https://w3id.org/idsa/code/QUARTERLY", Arrays.asList(new TypedLiteral("Quarterly", "en")),
        Arrays.asList(new TypedLiteral("The event occurs every three months.", "en"))),

    /**
     * The event occurs twice a year.
     */
    SEMIANNUAL("https://w3id.org/idsa/code/SEMIANNUAL", Arrays.asList(new TypedLiteral("Semiannual", "en")),
        Arrays.asList(new TypedLiteral("The event occurs twice a year.", "en"))),

    /**
     * The event occurs twice a month.
     */
    SEMIMONTHLY("https://w3id.org/idsa/code/SEMIMONTHLY", Arrays.asList(new TypedLiteral("Semimonthly", "en")),
        Arrays.asList(new TypedLiteral("The event occurs twice a month.", "en"))),

    /**
     * The event occurs twice a week.
     */
    SEMIWEEKLY("https://w3id.org/idsa/code/SEMIWEEKLY", Arrays.asList(new TypedLiteral("Semiweekly", "en")),
        Arrays.asList(new TypedLiteral("The event occurs twice a week.", "en"))),

    /**
     * The event occurs three times a month.
     */
    THREE_TIMES_A_MONTH("https://w3id.org/idsa/code/THREE_TIMES_A_MONTH", Arrays.asList(new TypedLiteral("Three times a month", "en")),
        Arrays.asList(new TypedLiteral("The event occurs three times a month.", "en"))),

    /**
     * The event occurs three times a week.
     */
    THREE_TIMES_A_WEEK("https://w3id.org/idsa/code/THREE_TIMES_A_WEEK", Arrays.asList(new TypedLiteral("Three times a week", "en")),
        Arrays.asList(new TypedLiteral("The event occurs three times a week.", "en"))),

    /**
     * The event occurs three times a year.
     */
    THREE_TIMES_A_YEAR("https://w3id.org/idsa/code/THREE_TIMES_A_YEAR", Arrays.asList(new TypedLiteral("Three times a year", "en")),
        Arrays.asList(new TypedLiteral("The event occurs three times a year.", "en"))),

    /**
     * The event occurs every three years.
     */
    TRIENNIAL("https://w3id.org/idsa/code/TRIENNIAL", Arrays.asList(new TypedLiteral("Triennial", "en")),
        Arrays.asList(new TypedLiteral("The event occurs every three years.", "en"))),

    /**
     * The event occurs twice a day.
     */
    TWO_TIMES_A_DAY("https://w3id.org/idsa/code/TWO_TIMES_A_DAY", Arrays.asList(new TypedLiteral("Two times a day", "en")),
        Arrays.asList(new TypedLiteral("The event occurs twice a day.", "en"))),

    /**
     * The event occurs once a week.
     */
    WEEKLY("https://w3id.org/idsa/code/WEEKLY", Arrays.asList(new TypedLiteral("Weekly", "en")),
        Arrays.asList(new TypedLiteral("The event occurs once a week.", "en")));

    private static final Map<String, Frequency> uriInstanceMapping;
    static {
        uriInstanceMapping = new HashMap<>();
        uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
        uriInstanceMapping
            .putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
    }

    private URI id;
    private List<TypedLiteral> label;
    private List<TypedLiteral> comment;

    Frequency(String id, List<TypedLiteral> label, List<TypedLiteral> comment) {
        try {
            this.id = new URI(id);
            this.label = label;
            this.comment = comment;
        } catch (java.net.URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
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
        return id;
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
        return label;
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
        return comment;
    }

    public String toRdf() {
        return VocabUtil.getInstance().toRdf(this);
    }

    @JsonProperty("@id")
    final public URI getSerializedId() {
        return id;
    }

    @JsonCreator
    public static Frequency deserialize(JsonNode node) {
        return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
    }

    @Override
    public String toString() {
        return id.toString();
    }

}
