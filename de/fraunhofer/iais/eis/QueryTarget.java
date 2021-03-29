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
	"Query Target"@en

	"Class of recipients of a query message, e.g. BROKER, APPSTORE, ANY."@en */

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:QueryTarget")
public enum QueryTarget {
	/** 
	"BROKER" */
	BROKER("https://w3id.org/idsa/code/BROKER", Arrays.asList(new TypedLiteral("BROKER", "")), java.util.Collections.emptyList()),
	/** 
	"APPSTORE" */
	APPSTORE("https://w3id.org/idsa/code/APPSTORE", Arrays.asList(new TypedLiteral("APPSTORE", "")), java.util.Collections.emptyList()),
	/** 
	"PARTICIPANT INFORMATION SERVICE" */
	PARIS("https://w3id.org/idsa/code/PARIS", Arrays.asList(new TypedLiteral("PARTICIPANT INFORMATION SERVICE", "")), java.util.Collections.emptyList()),
	/** 
	"CLEARING_HOUSE" */
	CLEARING_HOUSE("https://w3id.org/idsa/code/CLEARING_HOUSE", Arrays.asList(new TypedLiteral("CLEARING_HOUSE", "")), java.util.Collections.emptyList()),
	/** 
	"ANY" */
	ANY("https://w3id.org/idsa/code/ANY", Arrays.asList(new TypedLiteral("ANY", "")), java.util.Collections.emptyList());

	private static final Map<String,QueryTarget> uriInstanceMapping;
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

	QueryTarget(String id, java.util.List<TypedLiteral> label, java.util.List<TypedLiteral> comment) {
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
	public static QueryTarget deserialize(JsonNode node) {
		return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
	}

	@Override
	public String toString() {
		return id.toString();
	}

}
