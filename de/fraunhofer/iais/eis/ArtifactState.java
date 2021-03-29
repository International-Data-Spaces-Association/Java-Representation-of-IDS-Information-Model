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
	"Artifact State"@en

	"The state which an ids:Artifact may have or not."@en */

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:ArtifactState")
public enum ArtifactState {
	/** 
	"is anonymized"@en

	"The artifact is anonymized so the data source can not be recognized by any further user."@en */
	ANONYMIZED("https://w3id.org/idsa/code/ANONYMIZED", Arrays.asList(new TypedLiteral("is anonymized", "en")), Arrays.asList(new TypedLiteral("The artifact is anonymized so the data source can not be recognized by any further user.", "en"))),
	/** 
	"is pseudonymized"@en

	"The artifact is pseudo pseudonymized."@en */
	PSEUDONYMIZED("https://w3id.org/idsa/code/PSEUDONYMIZED", Arrays.asList(new TypedLiteral("is pseudonymized", "en")), Arrays.asList(new TypedLiteral("The artifact is pseudo pseudonymized.", "en"))),
	/** 
	"is encrypted"@en

	"The artifact is encrypted so the data itself cannot be read by any user without having the corresponding key."@en */
	ENCRYPTED("https://w3id.org/idsa/code/ENCRYPTED", Arrays.asList(new TypedLiteral("is encrypted", "en")), Arrays.asList(new TypedLiteral("The artifact is encrypted so the data itself cannot be read by any user without having the corresponding key.", "en"))),
	/** 
	"is combined"@en

	"The artifact is a collection of smaller artifacts and can be split into parts when necessary."@en */
	COMBINED("https://w3id.org/idsa/code/COMBINED", Arrays.asList(new TypedLiteral("is combined", "en")), Arrays.asList(new TypedLiteral("The artifact is a collection of smaller artifacts and can be split into parts when necessary.", "en")));

	private static final Map<String,ArtifactState> uriInstanceMapping;
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

	ArtifactState(String id, java.util.List<TypedLiteral> label, java.util.List<TypedLiteral> comment) {
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
	public static ArtifactState deserialize(JsonNode node) {
		return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
	}

	@Override
	public String toString() {
		return id.toString();
	}

}
