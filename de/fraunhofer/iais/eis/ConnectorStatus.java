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
	"Connector Status"@en

	"Connector Status is used to represent a Connectors current state inside the Configuration Model."@en */

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:ConnectorStatus")
public enum ConnectorStatus {
	/** 
	"Connector Online"@en

	"Indicates that a Connector is online."@en */
	CONNECTOR_ONLINE("https://w3id.org/idsa/code/CONNECTOR_ONLINE", Arrays.asList(new TypedLiteral("Connector Online", "en")), Arrays.asList(new TypedLiteral("Indicates that a Connector is online.", "en"))),
	/** 
	"Connector Offline"@en

	"Indicates that a Connector is offline."@en */
	CONNECTOR_OFFLINE("https://w3id.org/idsa/code/CONNECTOR_OFFLINE", Arrays.asList(new TypedLiteral("Connector Offline", "en")), Arrays.asList(new TypedLiteral("Indicates that a Connector is offline.", "en"))),
	/** 
	"Connector badly configured"@en

	"Indicates that a Connector is badly configured."@en */
	CONNECTOR_BADLY_CONFIGURED("https://w3id.org/idsa/code/CONNECTOR_BADLY_CONFIGURED", Arrays.asList(new TypedLiteral("Connector badly configured", "en")), Arrays.asList(new TypedLiteral("Indicates that a Connector is badly configured.", "en")));

	private static final Map<String,ConnectorStatus> uriInstanceMapping;
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

	ConnectorStatus(String id, java.util.List<TypedLiteral> label, java.util.List<TypedLiteral> comment) {
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
	public static ConnectorStatus deserialize(JsonNode node) {
		return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
	}

	@Override
	public String toString() {
		return id.toString();
	}

}
