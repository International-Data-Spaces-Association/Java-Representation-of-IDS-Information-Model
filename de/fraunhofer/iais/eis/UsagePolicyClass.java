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
	"Usage policy class"@en

	"Defined usage policy classes in the IDS."@en */

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:UsagePolicyClass")
public enum UsagePolicyClass {
	/**  */
	ALLOW_DATA_USAGE("https://w3id.org/idsa/code/ALLOW_DATA_USAGE", java.util.Collections.emptyList(), java.util.Collections.emptyList()),
	/** 
	"Connector restricted data usage"@en

	"This policy restrict the usage of the data to a specific IDS connector."@en */
	CONNECTOR_RESTRICTED_DATA_USAGE("https://w3id.org/idsa/code/CONNECTOR_RESTRICTED_DATA_USAGE", Arrays.asList(new TypedLiteral("Connector restricted data usage", "en")), Arrays.asList(new TypedLiteral("This policy restrict the usage of the data to a specific IDS connector.", "en"))),
	/** 
	"System restricted data usage"@en

	"This policy restricts the usage of the data to a specific system or application inside an IDS connector."@en */
	APPLICATION_RESTRICTED_DATA_USAGE("https://w3id.org/idsa/code/APPLICATION_RESTRICTED_DATA_USAGE", Arrays.asList(new TypedLiteral("System restricted data usage", "en")), Arrays.asList(new TypedLiteral("This policy restricts the usage of the data to a specific system or application inside an IDS connector.", "en"))),
	/** 
	"Interval restricted data usage"@en

	"This policy restricts the usage of the data to a specific (time) interval."@en */
	INTERVAL_RESTRICTED_DATA_USAGE("https://w3id.org/idsa/code/INTERVAL_RESTRICTED_DATA_USAGE", Arrays.asList(new TypedLiteral("Interval restricted data usage", "en")), Arrays.asList(new TypedLiteral("This policy restricts the usage of the data to a specific (time) interval.", "en"))),
	/** 
	"Duration restricted data usage"@en

	"This policy restricts the usage of the data to a specific duration."@en */
	DURATION_RESTRICTED_DATA_USAGE("https://w3id.org/idsa/code/DURATION_RESTRICTED_DATA_USAGE", Arrays.asList(new TypedLiteral("Duration restricted data usage", "en")), Arrays.asList(new TypedLiteral("This policy restricts the usage of the data to a specific duration.", "en"))),
	/** 
	"Location restricted data usage"@en

	"This policy restricts the usage of the data to a specific location, e.g. expressed via location areas, geographic points or geographic bounding polygons."@en */
	LOCATION_RESTRICTED_DATA_USAGE("https://w3id.org/idsa/code/LOCATION_RESTRICTED_DATA_USAGE", Arrays.asList(new TypedLiteral("Location restricted data usage", "en")), Arrays.asList(new TypedLiteral("This policy restricts the usage of the data to a specific location, e.g. expressed via location areas, geographic points or geographic bounding polygons.", "en"))),
	/** 
	"Prepatual data sale"@en

	"This policy restricts the transfer of a Data Asset against a one-off payment in a given currency"@en */
	PREPATUAL_DATA_SALE("https://w3id.org/idsa/code/PREPATUAL_DATA_SALE", Arrays.asList(new TypedLiteral("Prepatual data sale", "en")), Arrays.asList(new TypedLiteral("This policy restricts the transfer of a Data Asset against a one-off payment in a given currency", "en"))),
	/** 
	"Data rental"@en

	"This policy restricts transfer of data in return for a monthly fee. The ending is not specified. Nevertheless, the policy ends when a notice of termination has been made by any of the policy partners."@en */
	DATA_RENTAL("https://w3id.org/idsa/code/DATA_RENTAL", Arrays.asList(new TypedLiteral("Data rental", "en")), Arrays.asList(new TypedLiteral("This policy restricts transfer of data in return for a monthly fee. The ending is not specified. Nevertheless, the policy ends when a notice of termination has been made by any of the policy partners.", "en"))),
	/** 
	"Role restricted data usage"@en

	"This policy restricts the usage of the data to a specific role. \n\t\t\t\t\tFor example, you can instantiate a policy of this class that allows only the members of the engineering department to use your data. \n\t\t\t\t\tThis policy class faces few limitations, i.e., in order to evaluate the conditions, it requires that the user roles are available and follow a common vocabulary"@en */
	ROLE_RESTRICTED_DATA_USAGE("https://w3id.org/idsa/code/ROLE_RESTRICTED_DATA_USAGE", Arrays.asList(new TypedLiteral("Role restricted data usage", "en")), Arrays.asList(new TypedLiteral("This policy restricts the usage of the data to a specific role. 					For example, you can instantiate a policy of this class that allows only the members of the engineering department to use your data. 					This policy class faces few limitations, i.e., in order to evaluate the conditions, it requires that the user roles are available and follow a common vocabulary", "en"))),
	/** 
	"Purpose restricted data usage"@en

	"This policy restricts the usage of data assets limited to specific purposes."@en */
	PURPOSE_RESTRICTED_DATA_USAGE("https://w3id.org/idsa/code/PURPOSE_RESTRICTED_DATA_USAGE", Arrays.asList(new TypedLiteral("Purpose restricted data usage", "en")), Arrays.asList(new TypedLiteral("This policy restricts the usage of data assets limited to specific purposes.", "en"))),
	/** 
	"Event restricted data usage"@en

	"This policy restricts the usage of data assets limited to specific events.\n\t\t\t\t\tThe ODRL language defines an identified event as a context for exercising the action of the Rule. \n\t\t\t\t\tEvents are temporal periods of time. A Data Provider may want to restrict the usage of the data to a specific event when the exact time and date of the event is not clear in advance. \n\t\t\t\t\tTherefore, the event condition can be specified in a policy."@en */
	EVENT_RESTRICTED_DATA_USAGE("https://w3id.org/idsa/code/EVENT_RESTRICTED_DATA_USAGE", Arrays.asList(new TypedLiteral("Event restricted data usage", "en")), Arrays.asList(new TypedLiteral("This policy restricts the usage of data assets limited to specific events.					The ODRL language defines an identified event as a context for exercising the action of the Rule. 					Events are temporal periods of time. A Data Provider may want to restrict the usage of the data to a specific event when the exact time and date of the event is not clear in advance. 					Therefore, the event condition can be specified in a policy.", "en"))),
	/** 
	"Restricted number of usages"@en

	"This policy restricts the usage of data assets limited to numeric count of executions of actions. \n\t\t\t\t\tA mechanism is needed that counts the usage of data in order to enforce the policy."@en */
	RESTRICTED_NUMBER_OF_USAGES("https://w3id.org/idsa/code/RESTRICTED_NUMBER_OF_USAGES", Arrays.asList(new TypedLiteral("Restricted number of usages", "en")), Arrays.asList(new TypedLiteral("This policy restricts the usage of data assets limited to numeric count of executions of actions. 					A mechanism is needed that counts the usage of data in order to enforce the policy.", "en"))),
	/** 
	"Security level restricted policy"@en

	"This policy restricts the usage of data assets limited to a security level the consumer must conform to."@en */
	SECURITY_LEVEL_RESTRICTED_POLICY("https://w3id.org/idsa/code/SECURITY_LEVEL_RESTRICTED_POLICY", Arrays.asList(new TypedLiteral("Security level restricted policy", "en")), Arrays.asList(new TypedLiteral("This policy restricts the usage of data assets limited to a security level the consumer must conform to.", "en"))),
	/** 
	"Use data and delete after"@en

	"This policy restricts the usage of data assets with the obligation to delete the asset after usage."@en */
	USE_DATA_AND_DELETE_AFTER("https://w3id.org/idsa/code/USE_DATA_AND_DELETE_AFTER", Arrays.asList(new TypedLiteral("Use data and delete after", "en")), Arrays.asList(new TypedLiteral("This policy restricts the usage of data assets with the obligation to delete the asset after usage.", "en"))),
	/** 
	"Modfy data in transit"@en

	"This policy restricts the usage of data assets with the obligation to anonymize the data when it is leaving the Data Provider connector or when it is entering the Data Consumer connector"@en */
	MODIFY_DATA_IN_TRANSIT("https://w3id.org/idsa/code/MODIFY_DATA_IN_TRANSIT", Arrays.asList(new TypedLiteral("Modfy data in transit", "en")), Arrays.asList(new TypedLiteral("This policy restricts the usage of data assets with the obligation to anonymize the data when it is leaving the Data Provider connector or when it is entering the Data Consumer connector", "en"))),
	/** 
	"Modfy data in rest"@en

	"This policy restricts the usage of data assets with the obligation to anonymize the data before permission to use the data is granted. \n\t\t\t\t\tIn contrast to the idscMODIFY_DATA_IN_TRANSIT policy class, it demands the modifications to be done when data is stored."@en */
	MODIFY_DATA_IN_REST("https://w3id.org/idsa/code/MODIFY_DATA_IN_REST", Arrays.asList(new TypedLiteral("Modfy data in rest", "en")), Arrays.asList(new TypedLiteral("This policy restricts the usage of data assets with the obligation to anonymize the data before permission to use the data is granted. 					In contrast to the idscMODIFY_DATA_IN_TRANSIT policy class, it demands the modifications to be done when data is stored.", "en"))),
	/** 
	"Local logging"@en

	"This policy restricts the usage of data assets with the obligation to log prior specified processes, such as the data access."@en */
	LOCAL_LOGGING("https://w3id.org/idsa/code/LOCAL_LOGGING", Arrays.asList(new TypedLiteral("Local logging", "en")), Arrays.asList(new TypedLiteral("This policy restricts the usage of data assets with the obligation to log prior specified processes, such as the data access.", "en"))),
	/** 
	"Remote notification"@en

	"This policy restricts the usage of data assets with the obligation to notify a specific party about the data usage."@en */
	REMOTE_NOTIFICATION("https://w3id.org/idsa/code/REMOTE_NOTIFICATION", Arrays.asList(new TypedLiteral("Remote notification", "en")), Arrays.asList(new TypedLiteral("This policy restricts the usage of data assets with the obligation to notify a specific party about the data usage.", "en"))),
	/** 
	"Remote notification"@en

	"This policy restricts the usage of data assets with the obligation to notify a specific party about the data usage."@en */
	ATTACH_POLICY_FOR_THIRD_PARTY("https://w3id.org/idsa/code/ATTACH_POLICY_FOR_THIRD_PARTY", Arrays.asList(new TypedLiteral("Remote notification", "en")), Arrays.asList(new TypedLiteral("This policy restricts the usage of data assets with the obligation to notify a specific party about the data usage.", "en"))),
	/** 
	"Distribute only if encrypted"@en

	"This policy restricts the usage of data assets with the obligation to encrypt the data asset before distribution."@en */
	DISTRIBUTE_ONLY_IF_ENCRYPTED("https://w3id.org/idsa/code/DISTRIBUTE_ONLY_IF_ENCRYPTED", Arrays.asList(new TypedLiteral("Distribute only if encrypted", "en")), Arrays.asList(new TypedLiteral("This policy restricts the usage of data assets with the obligation to encrypt the data asset before distribution.", "en"))),
	/** 
	"State restricted policy"@en

	"This policy restricts the usage of data assets limited to specific states. Possible states include, for example, that the contract for the given data asset has not yet expired."@en */
	STATE_RESTRICTED_POLICY("https://w3id.org/idsa/code/STATE_RESTRICTED_POLICY", Arrays.asList(new TypedLiteral("State restricted policy", "en")), Arrays.asList(new TypedLiteral("This policy restricts the usage of data assets limited to specific states. Possible states include, for example, that the contract for the given data asset has not yet expired.", "en")));

	private static final Map<String,UsagePolicyClass> uriInstanceMapping;
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

	UsagePolicyClass(String id, java.util.List<TypedLiteral> label, java.util.List<TypedLiteral> comment) {
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
	public static UsagePolicyClass deserialize(JsonNode node) {
		return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
	}

	@Override
	public String toString() {
		return id.toString();
	}

}
