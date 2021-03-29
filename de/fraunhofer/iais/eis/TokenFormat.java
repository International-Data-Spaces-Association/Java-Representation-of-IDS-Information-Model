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
	"Token format"@en

	"Possible formats for (security-related) tokens."@en */

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:TokenFormat")
public enum TokenFormat {
	/** 
	"Json Web Token" */
	JWT("https://w3id.org/idsa/code/JWT", Arrays.asList(new TypedLiteral("Json Web Token", "")), java.util.Collections.emptyList()),
	/** 
	"Simple Web Token" */
	SWT("https://w3id.org/idsa/code/SWT", Arrays.asList(new TypedLiteral("Simple Web Token", "")), java.util.Collections.emptyList()),
	/** 
	"Security Assertion Markup Language (SAML) 1.1" */
	SAML_1_1("https://w3id.org/idsa/code/SAML_1_1", Arrays.asList(new TypedLiteral("Security Assertion Markup Language (SAML) 1.1", "")), java.util.Collections.emptyList()),
	/** 
	"Security Assertion Markup Language (SAML) 2.0" */
	SAML_2_0("https://w3id.org/idsa/code/SAML_2_0", Arrays.asList(new TypedLiteral("Security Assertion Markup Language (SAML) 2.0", "")), java.util.Collections.emptyList()),
	/** 
	"Other" */
	OTHER("https://w3id.org/idsa/code/OTHER", Arrays.asList(new TypedLiteral("Other", "")), java.util.Collections.emptyList()),
	/** 
	"Unknown" */
	UNKNOWN("https://w3id.org/idsa/code/UNKNOWN", Arrays.asList(new TypedLiteral("Unknown", "")), java.util.Collections.emptyList());

	private static final Map<String,TokenFormat> uriInstanceMapping;
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

	TokenFormat(String id, java.util.List<TypedLiteral> label, java.util.List<TypedLiteral> comment) {
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
	public static TokenFormat deserialize(JsonNode node) {
		return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
	}

	@Override
	public String toString() {
		return id.toString();
	}

}
