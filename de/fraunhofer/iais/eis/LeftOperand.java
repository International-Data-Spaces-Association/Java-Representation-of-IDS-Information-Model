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
	"LeftOperand"@en

	"Instances of the LeftOperand class are used as the leftOperand of a Constraint."@en */

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:LeftOperand")
public enum LeftOperand {
	/** 
	"payment"@en

	"Monetary payment, without any further sepcification on the type, amount or purpose."@en */
	PAYMENT("https://w3id.org/idsa/code/PAYMENT", Arrays.asList(new TypedLiteral("payment", "en")), Arrays.asList(new TypedLiteral("Monetary payment, without any further sepcification on the type, amount or purpose.", "en"))),
	/** 
	"payAmount"@en

	"Monetary amount to pay, usually used with idsc:EQ. Datatype is double. Currency required."@en */
	PAY_AMOUNT("https://w3id.org/idsa/code/PAY_AMOUNT", Arrays.asList(new TypedLiteral("payAmount", "en")), Arrays.asList(new TypedLiteral("Monetary amount to pay, usually used with idsc:EQ. Datatype is double. Currency required.", "en"))),
	/** 
	"policy evaluation time"@en

	"The current system time (as UTC xsd:dateTimeStamp) for evaluating a time-related constraint. Allowed operators are idsc:AFTER, idsc:BEFORE, idsc:CONTAINS, idsc:TEMPORAL_DISJOINT, idsc:DURING, idsc:TEMPORAL_EQUALS, idsc:FINISHED_BY, idsc:FINISHES, idsc:MEETS, idsc:MET_BY, idsc:OVERLAPS, idsc:OVERLAPPED_BY, idsc:STARTS, idsc:STARTED_BY and idsc:DURATION_EQ with RightOperand ids:TemporalEntity."@en */
	POLICY_EVALUATION_TIME("https://w3id.org/idsa/code/POLICY_EVALUATION_TIME", Arrays.asList(new TypedLiteral("policy evaluation time", "en")), Arrays.asList(new TypedLiteral("The current system time (as UTC xsd:dateTimeStamp) for evaluating a time-related constraint. Allowed operators are idsc:AFTER, idsc:BEFORE, idsc:CONTAINS, idsc:TEMPORAL_DISJOINT, idsc:DURING, idsc:TEMPORAL_EQUALS, idsc:FINISHED_BY, idsc:FINISHES, idsc:MEETS, idsc:MET_BY, idsc:OVERLAPS, idsc:OVERLAPPED_BY, idsc:STARTS, idsc:STARTED_BY and idsc:DURATION_EQ with RightOperand ids:TemporalEntity.", "en"))),
	/** 
	"elapsed time"@en

	"A continuous elapsed time period which may be used for exercising of the action of the Rule. Allowed operators are idsc:SHORTER, idsc:SHORTER_EQ, idsc:LONGER, idsc:LONGER_EQ, and idsc:DURATION_EQ with datatype xsd:duration."@en */
	ELAPSED_TIME("https://w3id.org/idsa/code/ELAPSED_TIME", Arrays.asList(new TypedLiteral("elapsed time", "en")), Arrays.asList(new TypedLiteral("A continuous elapsed time period which may be used for exercising of the action of the Rule. Allowed operators are idsc:SHORTER, idsc:SHORTER_EQ, idsc:LONGER, idsc:LONGER_EQ, and idsc:DURATION_EQ with datatype xsd:duration.", "en"))),
	/** 
	"delay"@en

	"Delay the action. Use idsc:DURATION_EQ, idsc:LONGER, idsc:LONGER_EQ, idsc:SHORTER_EQ, or idsc:SHORTER with datatype xsd:duration."@en */
	DELAY("https://w3id.org/idsa/code/DELAY", Arrays.asList(new TypedLiteral("delay", "en")), Arrays.asList(new TypedLiteral("Delay the action. Use idsc:DURATION_EQ, idsc:LONGER, idsc:LONGER_EQ, idsc:SHORTER_EQ, or idsc:SHORTER with datatype xsd:duration.", "en"))),
	/** 
	"current event"@en

	"The feature dimension regarding whether current events are happening. Does NOT refer \'events\' as in real-time data, sensor observations, or Complex Event Processing but rather as \'World Cup 2018\' or \'Hannover Trade Fair\'."@en */
	EVENT("https://w3id.org/idsa/code/EVENT", Arrays.asList(new TypedLiteral("current event", "en")), Arrays.asList(new TypedLiteral("The feature dimension regarding whether current events are happening. Does NOT refer 'events' as in real-time data, sensor observations, or Complex Event Processing but rather as 'World Cup 2018' or 'Hannover Trade Fair'.", "en"))),
	/** 
	"state"@en

	"Specifies whether an (external) resource is true/false, active/inactive, has happened/not happened, etc. Operator must be idsc:EQUALS with RightOperands of datatype xsd:anyURI. The referenced URI should point to a (remote) resource which returns a xsd:boolean value."@en */
	STATE("https://w3id.org/idsa/code/STATE", Arrays.asList(new TypedLiteral("state", "en")), Arrays.asList(new TypedLiteral("Specifies whether an (external) resource is true/false, active/inactive, has happened/not happened, etc. Operator must be idsc:EQUALS with RightOperands of datatype xsd:anyURI. The referenced URI should point to a (remote) resource which returns a xsd:boolean value.", "en"))),
	/** 
	"Absolute geo-spatial position"@en

	"The current geospatial position of the *consuming connector*. In case the connector only appears as a virtual entity, the physical location of the hosting server is referenced. Allowed operators are idsc:in. No other spatial operators (close to, north of, etc.) are currently allowed."@en */
	ABSOLUTE_SPATIAL_POSITION("https://w3id.org/idsa/code/ABSOLUTE_SPATIAL_POSITION", Arrays.asList(new TypedLiteral("Absolute geo-spatial position", "en")), Arrays.asList(new TypedLiteral("The current geospatial position of the *consuming connector*. In case the connector only appears as a virtual entity, the physical location of the hosting server is referenced. Allowed operators are idsc:in. No other spatial operators (close to, north of, etc.) are currently allowed.", "en"))),
	/** 
	"user"@en

	"The user of a system at the *consuming connector* requesting access to a resource. Recommended usage for checking whether the user\'s role is sufficient for his/her desired action. Allowed operators are idsc:MEMBER_OF, idsc:HAS_MEMBERSHIP, idsc:HAS_SITE with a RightOperand referencing a (set of) acceptable organisations (ids:Participant),memberships, sites. Preferred behaviour is that the RightOperand dereferences to an endpoint hosting the required role information."@en */
	USER("https://w3id.org/idsa/code/USER", Arrays.asList(new TypedLiteral("user", "en")), Arrays.asList(new TypedLiteral("The user of a system at the *consuming connector* requesting access to a resource. Recommended usage for checking whether the user's role is sufficient for his/her desired action. Allowed operators are idsc:MEMBER_OF, idsc:HAS_MEMBERSHIP, idsc:HAS_SITE with a RightOperand referencing a (set of) acceptable organisations (ids:Participant),memberships, sites. Preferred behaviour is that the RightOperand dereferences to an endpoint hosting the required role information.", "en"))),
	/** 
	"purpose"@en

	"A defined purpose for exercising the action of the Rule. Use with idsc:IN or idsc:SAME_AS and RDF Resources."@en */
	PURPOSE("https://w3id.org/idsa/code/PURPOSE", Arrays.asList(new TypedLiteral("purpose", "en")), Arrays.asList(new TypedLiteral("A defined purpose for exercising the action of the Rule. Use with idsc:IN or idsc:SAME_AS and RDF Resources.", "en"))),
	/** 
	"count"@en

	"Numeric count of executions of the Rule. Operators can be idsc:LT, idsc:LTEQ, idsc:EQ, idsc:GT, idsc:GTEQ. Datatype is xsd:double."@en */
	COUNT("https://w3id.org/idsa/code/COUNT", Arrays.asList(new TypedLiteral("count", "en")), Arrays.asList(new TypedLiteral("Numeric count of executions of the Rule. Operators can be idsc:LT, idsc:LTEQ, idsc:EQ, idsc:GT, idsc:GTEQ. Datatype is xsd:double.", "en"))),
	/** 
	"quantity"

	"Quantity limitation for exercising the action of the Rule. Operators can be idsc:LT, idsc:LTEQ, idsc:EQ, idsc:GT, idsc:GTEQ. Datatype is xsd:double." */
	QUANTITY("https://w3id.org/idsa/code/QUANTITY", Arrays.asList(new TypedLiteral("quantity", "")), Arrays.asList(new TypedLiteral("Quantity limitation for exercising the action of the Rule. Operators can be idsc:LT, idsc:LTEQ, idsc:EQ, idsc:GT, idsc:GTEQ. Datatype is xsd:double.", ""))),
	/** 
	"recurrence rate"

	"The limit how often exercising the action of the Rule may be possible. Operators can be idsc:LT, idsc:LTEQ, idsc:EQ, idsc:GT, idsc:GTEQ. Datatype is xsd:double." */
	RECURRENCE_RATE("https://w3id.org/idsa/code/RECURRENCE_RATE", Arrays.asList(new TypedLiteral("recurrence rate", "")), Arrays.asList(new TypedLiteral("The limit how often exercising the action of the Rule may be possible. Operators can be idsc:LT, idsc:LTEQ, idsc:EQ, idsc:GT, idsc:GTEQ. Datatype is xsd:double.", ""))),
	/** 
	"security level"

	"The security level the consuming connector must have. Use together with idsc:SAME_AS or idsc:IN. The value decides which attribute dimension is regarded."@en */
	SECURITY_LEVEL("https://w3id.org/idsa/code/SECURITY_LEVEL", Arrays.asList(new TypedLiteral("security level", "")), Arrays.asList(new TypedLiteral("The security level the consuming connector must have. Use together with idsc:SAME_AS or idsc:IN. The value decides which attribute dimension is regarded.", "en"))),
	/** 
	"execution system"

	"Execution system or execution environment that is used to access the asset under consideration, usually an IDS Connector. The regarded data object should correspond to the IDS Connector class and its attributes. Must be used together with idsc:SAME_AS, idsc:NOT, idsc:HAS_STATE, idsc:IN, idsc:COVERED_BY idsc:INSIDE, idsc:SPATIAL_EQUALS, idsc:DISJOINT, or idsc:INSIDE_NETWORK operators. RightOperandReference must be a URI identifying the target system(s)."@en */
	SYSTEM("https://w3id.org/idsa/code/SYSTEM", Arrays.asList(new TypedLiteral("execution system", "")), Arrays.asList(new TypedLiteral("Execution system or execution environment that is used to access the asset under consideration, usually an IDS Connector. The regarded data object should correspond to the IDS Connector class and its attributes. Must be used together with idsc:SAME_AS, idsc:NOT, idsc:HAS_STATE, idsc:IN, idsc:COVERED_BY idsc:INSIDE, idsc:SPATIAL_EQUALS, idsc:DISJOINT, or idsc:INSIDE_NETWORK operators. RightOperandReference must be a URI identifying the target system(s).", "en"))),
	/** 
	"endpoint"

	"Remote target for an action or information provider (PIP). Must be used together with idsc:IS or idsc:IN operators. RightOperand must be a xsd:anyURI or an URL which should point to an actually deployed endpoint. An example is a refinment of idsc:NOTIFY where idsc:REMOTE points to a Clearing House."@en */
	ENDPOINT("https://w3id.org/idsa/code/ENDPOINT", Arrays.asList(new TypedLiteral("endpoint", "")), Arrays.asList(new TypedLiteral("Remote target for an action or information provider (PIP). Must be used together with idsc:IS or idsc:IN operators. RightOperand must be a xsd:anyURI or an URL which should point to an actually deployed endpoint. An example is a refinment of idsc:NOTIFY where idsc:REMOTE points to a Clearing House.", "en"))),
	/** 
	"path to attribute"

	"Path to specific attribute (default JsonPath). Must be used together with idsc:STRING_EQ, idsc:STRING_CONTAINS, idsc:STRING_IS_CONTAINED, or idsc:MATCHES operators. RightOperand must be a xsd:string."@en */
	PATH("https://w3id.org/idsa/code/PATH", Arrays.asList(new TypedLiteral("path to attribute", "")), Arrays.asList(new TypedLiteral("Path to specific attribute (default JsonPath). Must be used together with idsc:STRING_EQ, idsc:STRING_CONTAINS, idsc:STRING_IS_CONTAINED, or idsc:MATCHES operators. RightOperand must be a xsd:string.", "en")));

	private static final Map<String,LeftOperand> uriInstanceMapping;
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

	LeftOperand(String id, java.util.List<TypedLiteral> label, java.util.List<TypedLiteral> comment) {
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
	public static LeftOperand deserialize(JsonNode node) {
		return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
	}

	@Override
	public String toString() {
		return id.toString();
	}


	@JsonIgnore
	final public 
	
	
	@JsonProperty("ids:broader")
	LeftOperand getBroader() {
		//not implemented for enums
		throw new UnsupportedOperationException();
	}
	

}
