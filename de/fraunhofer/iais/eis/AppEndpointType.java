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
	"App endpoint type"@en

	"Class of endpoint types a data app offers."@en */

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:AppEndpointType")
public enum AppEndpointType {
	/** 
	"Input endpoint"@en

	"Endpoint is used for data input."@en */
	INPUT_ENDPOINT("https://w3id.org/idsa/code/INPUT_ENDPOINT", Arrays.asList(new TypedLiteral("Input endpoint", "en")), Arrays.asList(new TypedLiteral("Endpoint is used for data input.", "en"))),
	/** 
	"Output endpoint"@en

	"Endpoint is used for data output."@en */
	OUTPUT_ENDPOINT("https://w3id.org/idsa/code/OUTPUT_ENDPOINT", Arrays.asList(new TypedLiteral("Output endpoint", "en")), Arrays.asList(new TypedLiteral("Endpoint is used for data output.", "en"))),
	/** 
	"Status endpoint"@en

	"Endpoint is used to get app health / lifecycle status."@en */
	STATUS_ENDPOINT("https://w3id.org/idsa/code/STATUS_ENDPOINT", Arrays.asList(new TypedLiteral("Status endpoint", "en")), Arrays.asList(new TypedLiteral("Endpoint is used to get app health / lifecycle status.", "en"))),
	/** 
	"Config endpoint"@en

	"Endpoint is used for runtime-related app configurations and app parameters."@en */
	CONFIG_ENDPOINT("https://w3id.org/idsa/code/CONFIG_ENDPOINT", Arrays.asList(new TypedLiteral("Config endpoint", "en")), Arrays.asList(new TypedLiteral("Endpoint is used for runtime-related app configurations and app parameters.", "en"))),
	/** 
	"Process endpoint"@en

	"Endpoint is used to start (or control) app processing."@en */
	PROCESS_ENDPOINT("https://w3id.org/idsa/code/PROCESS_ENDPOINT", Arrays.asList(new TypedLiteral("Process endpoint", "en")), Arrays.asList(new TypedLiteral("Endpoint is used to start (or control) app processing.", "en"))),
	/** 
	"Usage policy endpoint"@en

	"Endpoint is used for usage policy / usage control related scenarios."@en */
	USAGE_POLICY_ENDPOINT("https://w3id.org/idsa/code/USAGE_POLICY_ENDPOINT", Arrays.asList(new TypedLiteral("Usage policy endpoint", "en")), Arrays.asList(new TypedLiteral("Endpoint is used for usage policy / usage control related scenarios.", "en"))),
	/** 
	"Self-description endpoint"@en

	"Pre-defined endpoint used to return the corresponding self-description of the data app."@en */
	SELF_DESCRIPTION_ENDPOINT("https://w3id.org/idsa/code/SELF_DESCRIPTION_ENDPOINT", Arrays.asList(new TypedLiteral("Self-description endpoint", "en")), Arrays.asList(new TypedLiteral("Pre-defined endpoint used to return the corresponding self-description of the data app.", "en")));

	private static final Map<String,AppEndpointType> uriInstanceMapping;
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

	AppEndpointType(String id, java.util.List<TypedLiteral> label, java.util.List<TypedLiteral> comment) {
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
	public static AppEndpointType deserialize(JsonNode node) {
		return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
	}

	@Override
	public String toString() {
		return id.toString();
	}

}
