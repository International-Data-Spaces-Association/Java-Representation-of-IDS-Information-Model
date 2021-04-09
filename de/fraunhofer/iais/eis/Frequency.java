package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** 
* "Frequency"@en
* "Class of all frequencies."@en 
*/
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:Frequency")
public enum Frequency {

	/** 
	* "Annual"@en
	* "The event occurs once a year."@en
	*/
	ANNUAL("https://w3id.org/idsa/code/ANNUAL", Arrays.asList(new TypedLiteral("Annual", "en")), Arrays.asList(new TypedLiteral("The event occurs once a year.", "en"))),

	/** 
	* "Biennial"@en
	* "The event occurs every two years."@en
	*/
	BIENNIAL("https://w3id.org/idsa/code/BIENNIAL", Arrays.asList(new TypedLiteral("Biennial", "en")), Arrays.asList(new TypedLiteral("The event occurs every two years.", "en"))),

	/** 
	* "Bimonthly"@en
	* "The event occurs every two months."@en
	*/
	BIMONTHLY("https://w3id.org/idsa/code/BIMONTHLY", Arrays.asList(new TypedLiteral("Bimonthly", "en")), Arrays.asList(new TypedLiteral("The event occurs every two months.", "en"))),

	/** 
	* "Biweekly"@en
	* "The event occurs every two weeks."@en
	*/
	BIWEEKLY("https://w3id.org/idsa/code/BIWEEKLY", Arrays.asList(new TypedLiteral("Biweekly", "en")), Arrays.asList(new TypedLiteral("The event occurs every two weeks.", "en"))),

	/** 
	* "Continuous"@en
	* "The event repeats without interruption."@en
	*/
	CONTINUOUS("https://w3id.org/idsa/code/CONTINUOUS", Arrays.asList(new TypedLiteral("Continuous", "en")), Arrays.asList(new TypedLiteral("The event repeats without interruption.", "en"))),

	/** 
	* "Daily"@en
	* "The event occurs once a day."@en
	*/
	DAILY("https://w3id.org/idsa/code/DAILY", Arrays.asList(new TypedLiteral("Daily", "en")), Arrays.asList(new TypedLiteral("The event occurs once a day.", "en"))),

	/** 
	* "Irregular"@en
	* "The event occurs at uneven intervals."@en
	*/
	IRREGULAR("https://w3id.org/idsa/code/IRREGULAR", Arrays.asList(new TypedLiteral("Irregular", "en")), Arrays.asList(new TypedLiteral("The event occurs at uneven intervals.", "en"))),

	/** 
	* "Monthly"@en
	* "The event occurs once a month."@en
	*/
	MONTHLY("https://w3id.org/idsa/code/MONTHLY", Arrays.asList(new TypedLiteral("Monthly", "en")), Arrays.asList(new TypedLiteral("The event occurs once a month.", "en"))),

	/** 
	* "Quarterly"@en
	* "The event occurs every three months."@en
	*/
	QUARTERLY("https://w3id.org/idsa/code/QUARTERLY", Arrays.asList(new TypedLiteral("Quarterly", "en")), Arrays.asList(new TypedLiteral("The event occurs every three months.", "en"))),

	/** 
	* "Semiannual"@en
	* "The event occurs twice a year."@en
	*/
	SEMIANNUAL("https://w3id.org/idsa/code/SEMIANNUAL", Arrays.asList(new TypedLiteral("Semiannual", "en")), Arrays.asList(new TypedLiteral("The event occurs twice a year.", "en"))),

	/** 
	* "Semimonthly"@en
	* "The event occurs twice a month."@en
	*/
	SEMIMONTHLY("https://w3id.org/idsa/code/SEMIMONTHLY", Arrays.asList(new TypedLiteral("Semimonthly", "en")), Arrays.asList(new TypedLiteral("The event occurs twice a month.", "en"))),

	/** 
	* "Semiweekly"@en
	* "The event occurs twice a week."@en
	*/
	SEMIWEEKLY("https://w3id.org/idsa/code/SEMIWEEKLY", Arrays.asList(new TypedLiteral("Semiweekly", "en")), Arrays.asList(new TypedLiteral("The event occurs twice a week.", "en"))),

	/** 
	* "Three times a month"@en
	* "The event occurs three times a month."@en
	*/
	THREE_TIMES_A_MONTH("https://w3id.org/idsa/code/THREE_TIMES_A_MONTH", Arrays.asList(new TypedLiteral("Three times a month", "en")), Arrays.asList(new TypedLiteral("The event occurs three times a month.", "en"))),

	/** 
	* "Three times a week"@en
	* "The event occurs three times a week."@en
	*/
	THREE_TIMES_A_WEEK("https://w3id.org/idsa/code/THREE_TIMES_A_WEEK", Arrays.asList(new TypedLiteral("Three times a week", "en")), Arrays.asList(new TypedLiteral("The event occurs three times a week.", "en"))),

	/** 
	* "Three times a year"@en
	* "The event occurs three times a year."@en
	*/
	THREE_TIMES_A_YEAR("https://w3id.org/idsa/code/THREE_TIMES_A_YEAR", Arrays.asList(new TypedLiteral("Three times a year", "en")), Arrays.asList(new TypedLiteral("The event occurs three times a year.", "en"))),

	/** 
	* "Triennial"@en
	* "The event occurs every three years."@en
	*/
	TRIENNIAL("https://w3id.org/idsa/code/TRIENNIAL", Arrays.asList(new TypedLiteral("Triennial", "en")), Arrays.asList(new TypedLiteral("The event occurs every three years.", "en"))),

	/** 
	* "Weekly"@en
	* "The event occurs once a week."@en
	*/
	WEEKLY("https://w3id.org/idsa/code/WEEKLY", Arrays.asList(new TypedLiteral("Weekly", "en")), Arrays.asList(new TypedLiteral("The event occurs once a week.", "en")));

	private static final Map<String,Frequency> uriInstanceMapping;
	static {
		uriInstanceMapping = new HashMap<>();
		uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
		uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
	}

	private URI id;
	private List<TypedLiteral> label;
	private List<TypedLiteral> comment;


	Frequency(String id, List<TypedLiteral> label, List<TypedLiteral> comment) {
		try {
			this.id = new URI(id);
			this.label = label;
			this.comment = comment;
		}
		catch (java.net.URISyntaxException e) {
			throw new IllegalArgumentException(e);
		}
	}
	//TODO dummy method for generic properties, should be deleted in future versions
	public Map<String,Object> getProperties() {
		return null ;
	}
	public void setProperty(String property, Object value) {
		//do nothing
	}
	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/

	@JsonIgnore
	final public URI getId() {
		return id;
	}

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	@JsonIgnore
	final public List<TypedLiteral> getLabel() {
		return label;
	}

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	@JsonIgnore
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
