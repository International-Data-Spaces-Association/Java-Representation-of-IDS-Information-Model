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
* "Artifact State"@en
* "The state which an ids:Artifact may have or not."@en 
*/
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:ArtifactState")
public enum ArtifactState {

	/** 
	* "is anonymized"@en
	* "The artifact is anonymized so the data source can not be recognized by any further user."@en
	*/
	ANONYMIZED("https://w3id.org/idsa/code/ANONYMIZED", Arrays.asList(new TypedLiteral("is anonymized", "en")), Arrays.asList(new TypedLiteral("The artifact is anonymized so the data source can not be recognized by any further user.", "en"))),

	/** 
	* "is combined"@en
	* "The artifact is a collection of smaller artifacts and can be split into parts when necessary."@en
	*/
	COMBINED("https://w3id.org/idsa/code/COMBINED", Arrays.asList(new TypedLiteral("is combined", "en")), Arrays.asList(new TypedLiteral("The artifact is a collection of smaller artifacts and can be split into parts when necessary.", "en"))),

	/** 
	* "is encrypted"@en
	* "The artifact is encrypted so the data itself cannot be read by any user without having the corresponding key."@en
	*/
	ENCRYPTED("https://w3id.org/idsa/code/ENCRYPTED", Arrays.asList(new TypedLiteral("is encrypted", "en")), Arrays.asList(new TypedLiteral("The artifact is encrypted so the data itself cannot be read by any user without having the corresponding key.", "en"))),

	/** 
	* "is pseudonymized"@en
	* "The artifact is pseudo pseudonymized."@en
	*/
	PSEUDONYMIZED("https://w3id.org/idsa/code/PSEUDONYMIZED", Arrays.asList(new TypedLiteral("is pseudonymized", "en")), Arrays.asList(new TypedLiteral("The artifact is pseudo pseudonymized.", "en")));

	private static final Map<String,ArtifactState> uriInstanceMapping;
	static {
		uriInstanceMapping = new HashMap<>();
		uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
		uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
	}

	private URI id;
	private List<TypedLiteral> label;
	private List<TypedLiteral> comment;


	ArtifactState(String id, List<TypedLiteral> label, List<TypedLiteral> comment) {
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
	public static ArtifactState deserialize(JsonNode node) {
		return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
	}

	@Override
	public String toString() {
		return id.toString();
	}

}
