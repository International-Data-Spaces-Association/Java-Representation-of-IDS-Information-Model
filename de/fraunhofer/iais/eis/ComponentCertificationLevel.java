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
	"Component Certification Level"@en

	"Level of a Component Certification"@en */

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:ComponentCertificationLevel")
public enum ComponentCertificationLevel implements CertificationLevel {
	/** 
	"Base Security Profile Certification of Components based on Checklist Approach"@en */
	COMPONENT_BASE_SECURITY_PROFILE_CHECKLIST_APPROACH("https://w3id.org/idsa/code/COMPONENT_BASE_SECURITY_PROFILE_CHECKLIST_APPROACH", Arrays.asList(new TypedLiteral("Base Security Profile Certification of Components based on Checklist Approach", "en")), java.util.Collections.emptyList()),
	/** 
	"Base Security Profile Certification of Components based on Concept Review"@en */
	COMPONENT_BASE_SECURITY_PROFILE_CONCEPT_REVIEW("https://w3id.org/idsa/code/COMPONENT_BASE_SECURITY_PROFILE_CONCEPT_REVIEW", Arrays.asList(new TypedLiteral("Base Security Profile Certification of Components based on Concept Review", "en")), java.util.Collections.emptyList()),
	/** 
	"Trust Security Profile Certification of Components based on Concept Review"@en */
	COMPONENT_TRUST_SECURITY_PROFILE_CONCEPT_REVIEW("https://w3id.org/idsa/code/COMPONENT_TRUST_SECURITY_PROFILE_CONCEPT_REVIEW", Arrays.asList(new TypedLiteral("Trust Security Profile Certification of Components based on Concept Review", "en")), java.util.Collections.emptyList()),
	/** 
	"Trust Security Profile Certification of Components based on High Assurance Evaluation"@en */
	COMPONENT_TRUST_SECURITY_PROFILE_HIGH_ASSURANCE_EVALUATION("https://w3id.org/idsa/code/COMPONENT_TRUST_SECURITY_PROFILE_HIGH_ASSURANCE_EVALUATION", Arrays.asList(new TypedLiteral("Trust Security Profile Certification of Components based on High Assurance Evaluation", "en")), java.util.Collections.emptyList()),
	/** 
	"Trust-Plus Security Profile Certification of Components based on Concept Review"@en */
	COMPONENT_TRUSTPLUS_SECURITY_PROFILE_CONCEPT_REVIEW("https://w3id.org/idsa/code/COMPONENT_TRUSTPLUS_SECURITY_PROFILE_CONCEPT_REVIEW", Arrays.asList(new TypedLiteral("Trust-Plus Security Profile Certification of Components based on Concept Review", "en")), java.util.Collections.emptyList()),
	/** 
	"Trust-Plus Security Profile Certification of Components based on High AssuranceEvaluation"@en */
	COMPONENT_TRUSTPLUS_SECURITY_PROFILE_HIGH_ASSURANCE_EVALUATION("https://w3id.org/idsa/code/COMPONENT_TRUSTPLUS_SECURITY_PROFILE_HIGH_ASSURANCE_EVALUATION", Arrays.asList(new TypedLiteral("Trust-Plus Security Profile Certification of Components based on High AssuranceEvaluation", "en")), java.util.Collections.emptyList());

	private static final Map<String,ComponentCertificationLevel> uriInstanceMapping;
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

	ComponentCertificationLevel(String id, java.util.List<TypedLiteral> label, java.util.List<TypedLiteral> comment) {
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
	public static ComponentCertificationLevel deserialize(JsonNode node) {
		return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
	}

	@Override
	public String toString() {
		return id.toString();
	}



	@JsonIgnore
	final public 
	
	
	@JsonProperty("ids:includedCertificationLevel")
	CertificationLevel getIncludedCertificationLevel() {
		//not implemented for enums
		throw new UnsupportedOperationException();
	}
	
}
