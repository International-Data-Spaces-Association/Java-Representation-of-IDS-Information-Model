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
	"RejectionReason"@en

	"Class of reasons that might lead to issuing a Rejection message."@en */

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:RejectionReason")
public enum RejectionReason {
	/** 
	"NOT_FOUND"

	"Requested Resource was not found." */
	NOT_FOUND("https://w3id.org/idsa/code/NOT_FOUND", Arrays.asList(new TypedLiteral("NOT_FOUND", "")), Arrays.asList(new TypedLiteral("Requested Resource was not found.", ""))),
	/** 
	"NOT_AUTHENTICATED"

	"Authenticity of a message sender has failed or is not verifiable." */
	NOT_AUTHENTICATED("https://w3id.org/idsa/code/NOT_AUTHENTICATED", Arrays.asList(new TypedLiteral("NOT_AUTHENTICATED", "")), Arrays.asList(new TypedLiteral("Authenticity of a message sender has failed or is not verifiable.", ""))),
	/** 
	"NOT_AUTHORIZED"

	"Sender is not authorized to initiate the command." */
	NOT_AUTHORIZED("https://w3id.org/idsa/code/NOT_AUTHORIZED", Arrays.asList(new TypedLiteral("NOT_AUTHORIZED", "")), Arrays.asList(new TypedLiteral("Sender is not authorized to initiate the command.", ""))),
	/** 
	"TOO_MANY_RESULTS"

	"Processing of the command would lead to too many results (computational or bandwidth limitations)" */
	TOO_MANY_RESULTS("https://w3id.org/idsa/code/TOO_MANY_RESULTS", Arrays.asList(new TypedLiteral("TOO_MANY_RESULTS", "")), Arrays.asList(new TypedLiteral("Processing of the command would lead to too many results (computational or bandwidth limitations)", ""))),
	/** 
	"MALFORMED_MESSAGE"

	"The originating message is malformed or missing information." */
	MALFORMED_MESSAGE("https://w3id.org/idsa/code/MALFORMED_MESSAGE", Arrays.asList(new TypedLiteral("MALFORMED_MESSAGE", "")), Arrays.asList(new TypedLiteral("The originating message is malformed or missing information.", ""))),
	/** 
	"INTERNAL_RECIPIENT_ERROR"

	"The message recipient encountered an internal error while processing the message (e.g., storage capacity exceeded)." */
	INTERNAL_RECIPIENT_ERROR("https://w3id.org/idsa/code/INTERNAL_RECIPIENT_ERROR", Arrays.asList(new TypedLiteral("INTERNAL_RECIPIENT_ERROR", "")), Arrays.asList(new TypedLiteral("The message recipient encountered an internal error while processing the message (e.g., storage capacity exceeded).", ""))),
	/** 
	"METHOD_NOT_SUPPORTED"

	"The sender of the rejection does not implement a certain functionality stated in the message (e.g., query language)." */
	METHOD_NOT_SUPPORTED("https://w3id.org/idsa/code/METHOD_NOT_SUPPORTED", Arrays.asList(new TypedLiteral("METHOD_NOT_SUPPORTED", "")), Arrays.asList(new TypedLiteral("The sender of the rejection does not implement a certain functionality stated in the message (e.g., query language).", ""))),
	/** 
	"MESSAGE_TYPE_NOT_SUPPORTED"

	"The sender of the rejection does not support the incoming message type (e.g., ids:QueryMessage)." */
	MESSAGE_TYPE_NOT_SUPPORTED("https://w3id.org/idsa/code/MESSAGE_TYPE_NOT_SUPPORTED", Arrays.asList(new TypedLiteral("MESSAGE_TYPE_NOT_SUPPORTED", "")), Arrays.asList(new TypedLiteral("The sender of the rejection does not support the incoming message type (e.g., ids:QueryMessage).", ""))),
	/** 
	"VERSION_NOT_SUPPORTED"

	"The version of the information model against which the referenced message should be interpreted, is not supported by the recipient." */
	VERSION_NOT_SUPPORTED("https://w3id.org/idsa/code/VERSION_NOT_SUPPORTED", Arrays.asList(new TypedLiteral("VERSION_NOT_SUPPORTED", "")), Arrays.asList(new TypedLiteral("The version of the information model against which the referenced message should be interpreted, is not supported by the recipient.", ""))),
	/** 
	"BAD_PARAMETERS"

	"At least one query or operation parameter is not acceptable for the sender of this rejection message." */
	BAD_PARAMETERS("https://w3id.org/idsa/code/BAD_PARAMETERS", Arrays.asList(new TypedLiteral("BAD_PARAMETERS", "")), Arrays.asList(new TypedLiteral("At least one query or operation parameter is not acceptable for the sender of this rejection message.", ""))),
	/** 
	"TEMPORARILY_NOT_AVAILABLE"

	"The requested resource, representation or artifact is temporarily not available but might be back later." */
	TEMPORARILY_NOT_AVAILABLE("https://w3id.org/idsa/code/TEMPORARILY_NOT_AVAILABLE", Arrays.asList(new TypedLiteral("TEMPORARILY_NOT_AVAILABLE", "")), Arrays.asList(new TypedLiteral("The requested resource, representation or artifact is temporarily not available but might be back later.", "")));

	private static final Map<String,RejectionReason> uriInstanceMapping;
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

	RejectionReason(String id, java.util.List<TypedLiteral> label, java.util.List<TypedLiteral> comment) {
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
	public static RejectionReason deserialize(JsonNode node) {
		return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
	}

	@Override
	public String toString() {
		return id.toString();
	}

}
