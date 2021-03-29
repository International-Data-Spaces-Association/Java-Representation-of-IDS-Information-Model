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

/**
	"Resource"@en

	"Resource is a single digital content or a coherent set of digital contents. Resource content is formalized in Representations and optionally materialized as Artifacts. The Resource\'s content is exposed via defined Interfaces at various protocol Endpoints."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = ResourceImpl.class),
@JsonSubTypes.Type(value = AppResource.class),

@JsonSubTypes.Type(value = AudioResource.class),

@JsonSubTypes.Type(value = DataResource.class),

@JsonSubTypes.Type(value = ImageResource.class),

@JsonSubTypes.Type(value = SoftwareResource.class),

@JsonSubTypes.Type(value = TextResource.class),

@JsonSubTypes.Type(value = VideoResource.class),})
public interface Resource extends Asset
, DigitalContent
, DescribedSemantically
, ManagedEntity {

	// standard methods

	@JsonProperty("@id")
	@javax.validation.constraints.NotNull URI getId();
	java.util.List<TypedLiteral> getLabel();
	java.util.List<TypedLiteral> getComment();
	String toRdf();

	// getter and setter for generic property map
	public java.util.Map<String,Object> getProperties();
	public void setProperty(String property, Object value);

	// accessor methods as derived from information model
	/**
	"Standard License"@en

	"\n    Reference to a well-known License regulating the general usage of the Resource.\n    Check wikidata license documentation for an extensive list of licenses.\n    License IRI should refer to the direct of link for a given standard license,\n    e.g., MIT license (https://www.wikidata.org/wiki/Q334661). The label of the resolved wikidata license IRI can be used to\n    present the license in human-readable form.\n    "@en
	*/
	
	
	@JsonProperty("ids:standardLicense")
	URI getStandardLicense();
	/**
	"Custom License"@en

	"URL reference to a custom license regulating the general usage of the Resource."@en
	*/
	
	
	@JsonProperty("ids:customLicense")
	URI getCustomLicense();
	/**
	"resource endpoint"@en

	"Reference to the Endpoints serving the resource\'s content or let you exchange messages with an IDS Connector."@en
	*/
	
	
	@JsonProperty("ids:resourceEndpoint")
	java.util.ArrayList<? extends ConnectorEndpoint> getResourceEndpoint();
	/**
	"resource part"@en

	"Reference to a Resource (physically or logically) included, definition of part-whole hierarchies."@en
	*/
	
	
	@JsonProperty("ids:resourcePart")
	java.util.ArrayList<? extends Resource> getResourcePart();
	/**
	"contract offer"@en

	"Reference to a Contract Offer defining the authorized use of the Resource."@en
	*/
	
	
	@JsonProperty("ids:contractOffer")
	java.util.ArrayList<? extends ContractOffer> getContractOffer();
	/**
	"sample"@en

	"Sample Resource instance."@en
	*/
	
	
	@JsonProperty("ids:sample")
	java.util.ArrayList<? extends Resource> getSample();
	/**
	"publisher"@en

	"The publisher of the resource (which may differ from the sovereign)."@en
	*/
	
	
	@JsonProperty("ids:publisher")
	URI getPublisher();
	/**
	"sovereign"@en

	"The \'owner\', i.e. sovereign of the data."@en
	*/
	
	
	@JsonProperty("ids:sovereign")
	URI getSovereign();
	/**
	"variant"@en

	"(Equivalent) variant of given Resource, e.g. a translation."@en
	*/
	
	
	@JsonProperty("ids:variant")
	Resource getVariant();
}
