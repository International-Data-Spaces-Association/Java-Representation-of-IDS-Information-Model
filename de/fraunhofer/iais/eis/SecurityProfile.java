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
	"SecurityProfile"@en

	"Set of security guarantees claimed by a Connector. Connectors may asses their mutual technical reliability and trustworthiness by evaluating each other’s security profile."@en */

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:SecurityProfile")
public enum SecurityProfile {
	/** 
	"Base security profile"@en

	"Default security profile of a certified IDS Connector."@en */
	BASE_SECURITY_PROFILE("https://w3id.org/idsa/code/BASE_SECURITY_PROFILE", Arrays.asList(new TypedLiteral("Base security profile", "en")), Arrays.asList(new TypedLiteral("Default security profile of a certified IDS Connector.", "en"))),
	/** 
	"Trust security profile"@en

	"The Security Profile TRUST as defined by the IDS certification criteria."@en */
	TRUST_SECURITY_PROFILE("https://w3id.org/idsa/code/TRUST_SECURITY_PROFILE", Arrays.asList(new TypedLiteral("Trust security profile", "en")), Arrays.asList(new TypedLiteral("The Security Profile TRUST as defined by the IDS certification criteria.", "en"))),
	/** 
	"Trust Plus security profile"@en

	"The Security Profile TRUST+ as defined by the IDS certification criteria."@en */
	TRUST_PLUS_SECURITY_PROFILE("https://w3id.org/idsa/code/TRUST_PLUS_SECURITY_PROFILE", Arrays.asList(new TypedLiteral("Trust Plus security profile", "en")), Arrays.asList(new TypedLiteral("The Security Profile TRUST+ as defined by the IDS certification criteria.", "en")));

	private static final Map<String,SecurityProfile> uriInstanceMapping;
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

	SecurityProfile(String id, java.util.List<TypedLiteral> label, java.util.List<TypedLiteral> comment) {
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
	public static SecurityProfile deserialize(JsonNode node) {
		return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
	}

	@Override
	public String toString() {
		return id.toString();
	}


	@JsonIgnore
	final public 
	
	
	@JsonProperty("ids:securityGuarantee")
	java.util.ArrayList<? extends SecurityGuarantee> getSecurityGuarantee() {
		//not implemented for enums
		throw new UnsupportedOperationException();
	}
	
}
