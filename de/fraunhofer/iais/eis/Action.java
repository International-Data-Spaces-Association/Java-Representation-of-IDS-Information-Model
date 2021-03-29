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
	"Action"@en

	"A thing one might be permitted to do or prohibited from doing to something."@en */

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:Action")
public enum Action {
	/** 
	"anonymize"@en

	"To anonymize all, parts or certain attributes of the resource."@en */
	ANONYMIZE("https://w3id.org/idsa/code/ANONYMIZE", Arrays.asList(new TypedLiteral("anonymize", "en")), Arrays.asList(new TypedLiteral("To anonymize all, parts or certain attributes of the resource.", "en"))),
	/** 
	"use"@en

	"To use a resource in any possible way. Includes all other actions."@en */
	USE("https://w3id.org/idsa/code/USE", Arrays.asList(new TypedLiteral("use", "en")), Arrays.asList(new TypedLiteral("To use a resource in any possible way. Includes all other actions.", "en"))),
	/** 
	"aggregate by consumer"@en

	"Data will be part of another piece of data so that it is not distinguishable anymore."@en */
	AGGREGATE_BY_CONSUMER("https://w3id.org/idsa/code/AGGREGATE_BY_CONSUMER", Arrays.asList(new TypedLiteral("aggregate by consumer", "en")), Arrays.asList(new TypedLiteral("Data will be part of another piece of data so that it is not distinguishable anymore.", "en"))),
	/** 
	"aggregate by provider"@en

	"Data will be part of another piece of data so that it is not distinguishable anymore."@en */
	AGGREGATE_BY_PROVIDER("https://w3id.org/idsa/code/AGGREGATE_BY_PROVIDER", Arrays.asList(new TypedLiteral("aggregate by provider", "en")), Arrays.asList(new TypedLiteral("Data will be part of another piece of data so that it is not distinguishable anymore.", "en"))),
	/** 
	"compensate"@en

	"To pay a certain amount of money in order to use a resource."@en */
	COMPENSATE("https://w3id.org/idsa/code/COMPENSATE", Arrays.asList(new TypedLiteral("compensate", "en")), Arrays.asList(new TypedLiteral("To pay a certain amount of money in order to use a resource.", "en"))),
	/** 
	"delete"@en

	"To remove a resource or inhibit any further access with reasonable measures."@en */
	DELETE("https://w3id.org/idsa/code/DELETE", Arrays.asList(new TypedLiteral("delete", "en")), Arrays.asList(new TypedLiteral("To remove a resource or inhibit any further access with reasonable measures.", "en"))),
	/** 
	"write"@en

	"To change a remote resource."@en */
	WRITE("https://w3id.org/idsa/code/WRITE", Arrays.asList(new TypedLiteral("write", "en")), Arrays.asList(new TypedLiteral("To change a remote resource.", "en"))),
	/** 
	"distribute"@en

	"To forward or supply a resource to a third-party."@en */
	DISTRIBUTE("https://w3id.org/idsa/code/DISTRIBUTE", Arrays.asList(new TypedLiteral("distribute", "en")), Arrays.asList(new TypedLiteral("To forward or supply a resource to a third-party.", "en"))),
	/** 
	"grant use"@en

	"To grant use of a resource to another party. Does *not* imply any other usage rights."@en */
	GRANT_USE("https://w3id.org/idsa/code/GRANT_USE", Arrays.asList(new TypedLiteral("grant use", "en")), Arrays.asList(new TypedLiteral("To grant use of a resource to another party. Does *not* imply any other usage rights.", "en"))),
	/** 
	"ecrypt"@en

	"The data artifact or parts of it are encrypted and can not be read by neither the ids:DataConsumer nor any other third party. The encryption algorithm might be specified by a constraint."@en */
	ENCRYPT("https://w3id.org/idsa/code/ENCRYPT", Arrays.asList(new TypedLiteral("ecrypt", "en")), Arrays.asList(new TypedLiteral("The data artifact or parts of it are encrypted and can not be read by neither the ids:DataConsumer nor any other third party. The encryption algorithm might be specified by a constraint.", "en"))),
	/** 
	"log"@en

	"To log information or store information about incidents in a local file or database. Is not necessarily available to external parties but can be used to create transparency on happened events."@en */
	LOG("https://w3id.org/idsa/code/LOG", Arrays.asList(new TypedLiteral("log", "en")), Arrays.asList(new TypedLiteral("To log information or store information about incidents in a local file or database. Is not necessarily available to external parties but can be used to create transparency on happened events.", "en"))),
	/** 
	"modify"@en

	"To change a resource locally."@en */
	MODIFY("https://w3id.org/idsa/code/MODIFY", Arrays.asList(new TypedLiteral("modify", "en")), Arrays.asList(new TypedLiteral("To change a resource locally.", "en"))),
	/** 
	"next policy"@en

	"To forward the resource under the same policy. Implies a permission to distribute."@en */
	NEXT_POLICY("https://w3id.org/idsa/code/NEXT_POLICY", Arrays.asList(new TypedLiteral("next policy", "en")), Arrays.asList(new TypedLiteral("To forward the resource under the same policy. Implies a permission to distribute.", "en"))),
	/** 
	"notify"@en

	"To log information or notify an instance about incidents. Can be used to define Clearing House interactions."@en */
	NOTIFY("https://w3id.org/idsa/code/NOTIFY", Arrays.asList(new TypedLiteral("notify", "en")), Arrays.asList(new TypedLiteral("To log information or notify an instance about incidents. Can be used to define Clearing House interactions.", "en"))),
	/** 
	"read"@en

	"To obtain data from the resource."@en */
	READ("https://w3id.org/idsa/code/READ", Arrays.asList(new TypedLiteral("read", "en")), Arrays.asList(new TypedLiteral("To obtain data from the resource.", "en"))),
	/** 
	"track provenance"@en

	"To accept that the use of the Asset may be tracked."@en */
	TRACK_PROVENANCE("https://w3id.org/idsa/code/TRACK_PROVENANCE", Arrays.asList(new TypedLiteral("track provenance", "en")), Arrays.asList(new TypedLiteral("To accept that the use of the Asset may be tracked.", "en")));

	private static final Map<String,Action> uriInstanceMapping;
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

	Action(String id, java.util.List<TypedLiteral> label, java.util.List<TypedLiteral> comment) {
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
	public static Action deserialize(JsonNode node) {
		return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
	}

	@Override
	public String toString() {
		return id.toString();
	}


	@JsonIgnore
	final public 
	
	
	@JsonProperty("ids:actionRefinement")
	java.util.ArrayList<? extends Constraint> getActionRefinement() {
		//not implemented for enums
		throw new UnsupportedOperationException();
	}
	


	@JsonIgnore
	final public 
	
	
	@JsonProperty("ids:includedIn")
	Action getIncludedIn() {
		//not implemented for enums
		throw new UnsupportedOperationException();
	}
	

}
