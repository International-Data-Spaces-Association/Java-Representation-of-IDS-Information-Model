package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.*;
import javax.validation.constraints.*;
import java.util.Arrays;
import java.io.Serializable;

import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

	/** 
	"Frequency"@en

	"Class of all frequencies."@en */

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:Frequency")
public enum Frequency {
	/** 
	"Triennial"@en

	"The event occurs every three years."@en */
	TRIENNIAL("https://w3id.org/idsa/code/TRIENNIAL", Arrays.asList(new TypedLiteral("Triennial", "en")), Arrays.asList(new TypedLiteral("The event occurs every three years.", "en"))),
	/** 
	"Biennial"@en

	"The event occurs every two years."@en */
	BIENNIAL("https://w3id.org/idsa/code/BIENNIAL", Arrays.asList(new TypedLiteral("Biennial", "en")), Arrays.asList(new TypedLiteral("The event occurs every two years.", "en"))),
	/** 
	"Annual"@en

	"The event occurs once a year."@en */
	ANNUAL("https://w3id.org/idsa/code/ANNUAL", Arrays.asList(new TypedLiteral("Annual", "en")), Arrays.asList(new TypedLiteral("The event occurs once a year.", "en"))),
	/** 
	"Semiannual"@en

	"The event occurs twice a year."@en */
	SEMIANNUAL("https://w3id.org/idsa/code/SEMIANNUAL", Arrays.asList(new TypedLiteral("Semiannual", "en")), Arrays.asList(new TypedLiteral("The event occurs twice a year.", "en"))),
	/** 
	"Three times a year"@en

	"The event occurs three times a year."@en */
	THREE_TIMES_A_YEAR("https://w3id.org/idsa/code/THREE_TIMES_A_YEAR", Arrays.asList(new TypedLiteral("Three times a year", "en")), Arrays.asList(new TypedLiteral("The event occurs three times a year.", "en"))),
	/** 
	"Quarterly"@en

	"The event occurs every three months."@en */
	QUARTERLY("https://w3id.org/idsa/code/QUARTERLY", Arrays.asList(new TypedLiteral("Quarterly", "en")), Arrays.asList(new TypedLiteral("The event occurs every three months.", "en"))),
	/** 
	"Bimonthly"@en

	"The event occurs every two months."@en */
	BIMONTHLY("https://w3id.org/idsa/code/BIMONTHLY", Arrays.asList(new TypedLiteral("Bimonthly", "en")), Arrays.asList(new TypedLiteral("The event occurs every two months.", "en"))),
	/** 
	"Monthly"@en

	"The event occurs once a month."@en */
	MONTHLY("https://w3id.org/idsa/code/MONTHLY", Arrays.asList(new TypedLiteral("Monthly", "en")), Arrays.asList(new TypedLiteral("The event occurs once a month.", "en"))),
	/** 
	"Semimonthly"@en

	"The event occurs twice a month."@en */
	SEMIMONTHLY("https://w3id.org/idsa/code/SEMIMONTHLY", Arrays.asList(new TypedLiteral("Semimonthly", "en")), Arrays.asList(new TypedLiteral("The event occurs twice a month.", "en"))),
	/** 
	"Biweekly"@en

	"The event occurs every two weeks."@en */
	BIWEEKLY("https://w3id.org/idsa/code/BIWEEKLY", Arrays.asList(new TypedLiteral("Biweekly", "en")), Arrays.asList(new TypedLiteral("The event occurs every two weeks.", "en"))),
	/** 
	"Three times a month"@en

	"The event occurs three times a month."@en */
	THREE_TIMES_A_MONTH("https://w3id.org/idsa/code/THREE_TIMES_A_MONTH", Arrays.asList(new TypedLiteral("Three times a month", "en")), Arrays.asList(new TypedLiteral("The event occurs three times a month.", "en"))),
	/** 
	"Weekly"@en

	"The event occurs once a week."@en */
	WEEKLY("https://w3id.org/idsa/code/WEEKLY", Arrays.asList(new TypedLiteral("Weekly", "en")), Arrays.asList(new TypedLiteral("The event occurs once a week.", "en"))),
	/** 
	"Semiweekly"@en

	"The event occurs twice a week."@en */
	SEMIWEEKLY("https://w3id.org/idsa/code/SEMIWEEKLY", Arrays.asList(new TypedLiteral("Semiweekly", "en")), Arrays.asList(new TypedLiteral("The event occurs twice a week.", "en"))),
	/** 
	"Three times a week"@en

	"The event occurs three times a week."@en */
	THREE_TIMES_A_WEEK("https://w3id.org/idsa/code/THREE_TIMES_A_WEEK", Arrays.asList(new TypedLiteral("Three times a week", "en")), Arrays.asList(new TypedLiteral("The event occurs three times a week.", "en"))),
	/** 
	"Daily"@en

	"The event occurs once a day."@en */
	DAILY("https://w3id.org/idsa/code/DAILY", Arrays.asList(new TypedLiteral("Daily", "en")), Arrays.asList(new TypedLiteral("The event occurs once a day.", "en"))),
	/** 
	"Continuous"@en

	"The event repeats without interruption."@en */
	CONTINUOUS("https://w3id.org/idsa/code/CONTINUOUS", Arrays.asList(new TypedLiteral("Continuous", "en")), Arrays.asList(new TypedLiteral("The event repeats without interruption.", "en"))),
	/** 
	"Irregular"@en

	"The event occurs at uneven intervals."@en */
	IRREGULAR("https://w3id.org/idsa/code/IRREGULAR", Arrays.asList(new TypedLiteral("Irregular", "en")), Arrays.asList(new TypedLiteral("The event occurs at uneven intervals.", "en")));

	private static final Map<String,Frequency> uriInstanceMapping;
	static {
		uriInstanceMapping = new HashMap<>();
		uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
		uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
	}

	private URI id;
	private java.util.List<TypedLiteral> label;
	private java.util.List<TypedLiteral> comment;

	//TODO dummy method for generic properties, should be deleted in future versions
	public java.util.Map<String,Object> getProperties() {
		return null ;
	}
	public void setProperty(String property, Object value) {
		//do nothing
	}

	Frequency(String id, java.util.List<TypedLiteral> label, java.util.List<TypedLiteral> comment) {
		try {
			this.id = new URI(id);
			this.label = label;
			this.comment = comment;
		}
		catch (java.net.URISyntaxException e) {
			throw new IllegalArgumentException(e);
		}
	}

	@JsonIgnore
	final public URI getId() {
		return id;
	}

	@JsonIgnore
	final public java.util.List<TypedLiteral> getLabel() {
		return label;
	}

	@JsonIgnore
	final public java.util.List<TypedLiteral> getComment() {
		return comment;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	@JsonProperty("@id")
	final public URI getSerializedId() {
		try {
			 return new URI("idsc:" + id.toString().substring(id.toString().lastIndexOf("/") + 1));
		} catch (Exception e) {}
		return null;
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
