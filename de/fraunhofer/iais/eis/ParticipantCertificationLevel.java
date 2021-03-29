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
	"Participant Certification Level"@en

	"Level of a Participant Certification"@en */

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:ParticipantCertificationLevel")
public enum ParticipantCertificationLevel implements CertificationLevel {
	/** 
	"Entry Level Self-Assessment Certification of Participants"@en */
	PARTICIPANT_ENTRY_LEVEL_SELF_ASSESSMENT("https://w3id.org/idsa/code/PARTICIPANT_ENTRY_LEVEL_SELF_ASSESSMENT", Arrays.asList(new TypedLiteral("Entry Level Self-Assessment Certification of Participants", "en")), java.util.Collections.emptyList()),
	/** 
	"Entry Level Management System Certification of Participants"@en */
	PARTICIPANT_ENTRY_LEVEL_MANAGEMENT_SYSTEM("https://w3id.org/idsa/code/PARTICIPANT_ENTRY_LEVEL_MANAGEMENT_SYSTEM", Arrays.asList(new TypedLiteral("Entry Level Management System Certification of Participants", "en")), java.util.Collections.emptyList()),
	/** 
	"Member Level Management System Certification of Participants"@en */
	PARTICIPANT_MEMBER_LEVEL_MANAGEMENT_SYSTEM("https://w3id.org/idsa/code/PARTICIPANT_MEMBER_LEVEL_MANAGEMENT_SYSTEM", Arrays.asList(new TypedLiteral("Member Level Management System Certification of Participants", "en")), java.util.Collections.emptyList()),
	/** 
	"Member Level ControlFramework Certification of Participants"@en */
	PARTICIPANT_MEMBER_LEVEL_CONTROL_FRAMEWORK("https://w3id.org/idsa/code/PARTICIPANT_MEMBER_LEVEL_CONTROL_FRAMEWORK", Arrays.asList(new TypedLiteral("Member Level ControlFramework Certification of Participants", "en")), java.util.Collections.emptyList()),
	/** 
	"Central Level Management System Certification of Participants"@en */
	PARTICIPANT_CENTRAL_LEVEL_MANAGEMENT_SYSTEM("https://w3id.org/idsa/code/PARTICIPANT_CENTRAL_LEVEL_MANAGEMENT_SYSTEM", Arrays.asList(new TypedLiteral("Central Level Management System Certification of Participants", "en")), java.util.Collections.emptyList()),
	/** 
	"Central Level Control Framework Certification of Participants"@en */
	PARTICIPANT_CENTRAL_LEVEL_CONTROL_FRAMEWORK("https://w3id.org/idsa/code/PARTICIPANT_CENTRAL_LEVEL_CONTROL_FRAMEWORK", Arrays.asList(new TypedLiteral("Central Level Control Framework Certification of Participants", "en")), java.util.Collections.emptyList());

	private static final Map<String,ParticipantCertificationLevel> uriInstanceMapping;
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

	ParticipantCertificationLevel(String id, java.util.List<TypedLiteral> label, java.util.List<TypedLiteral> comment) {
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
	public static ParticipantCertificationLevel deserialize(JsonNode node) {
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
