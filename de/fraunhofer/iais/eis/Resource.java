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

/**
* "Resource"@en
* "Resource is a single digital content or a coherent set of digital contents. Resource content is formalized in Representations and optionally materialized as Artifacts. The Resource\'s content is exposed via defined Interfaces at various protocol Endpoints."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = ResourceImpl.class),
	@JsonSubTypes.Type(value = TextResource.class),
	@JsonSubTypes.Type(value = AppResource.class),
	@JsonSubTypes.Type(value = DataResource.class),
	@JsonSubTypes.Type(value = AudioResource.class),
	@JsonSubTypes.Type(value = ImageResource.class),
	@JsonSubTypes.Type(value = VideoResource.class),
	@JsonSubTypes.Type(value = SoftwareResource.class)
})
public interface Resource extends Asset, DigitalContent, DescribedSemantically, ManagedEntity {

	// standard methods

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	@NotNull
	public URI getId();

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel();

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	public List<TypedLiteral> getComment();

	public String toRdf();

	// getter and setter for generic property map
	public Map<String,Object> getProperties();
	public void setProperty(String property, Object value);

	// accessor methods as derived from the IDSA Information Model ontology


	/**
	* "\n    Reference to a well-known License regulating the general usage of the Resource.\n    Check wikidata license documentation for an extensive list of licenses.\n    License IRI should refer to the direct of link for a given standard license,\n    e.g., MIT license (https://www.wikidata.org/wiki/Q334661). The label of the resolved wikidata license IRI can be used to\n    present the license in human-readable form.\n    "@en
	* @return Returns the URI for the property standardLicense.
	* More information under https://w3id.org/idsa/core/standardLicense
	*/
	@JsonProperty("ids:standardLicense")
	public URI getStandardLicense();

	/**
	* "URL reference to a custom license regulating the general usage of the Resource."@en
	* @return Returns the URI for the property customLicense.
	* More information under https://w3id.org/idsa/core/customLicense
	*/
	@JsonProperty("ids:customLicense")
	public URI getCustomLicense();

	/**
	* "Reference to the Endpoints serving the resource\'s content or let you exchange messages with an IDS Connector."@en
	* @return Returns the ArrayList of ConnectorEndpoint for the property resourceEndpoint.
	* More information under https://w3id.org/idsa/core/resourceEndpoint
	*/
	@JsonProperty("ids:resourceEndpoint")
	public ArrayList<? extends ConnectorEndpoint> getResourceEndpoint();

	/**
	* "Reference to a Resource (physically or logically) included, definition of part-whole hierarchies."@en
	* @return Returns the ArrayList of Resource for the property resourcePart.
	* More information under https://w3id.org/idsa/core/resourcePart
	*/
	@JsonProperty("ids:resourcePart")
	public ArrayList<? extends Resource> getResourcePart();

	/**
	* "Reference to a Contract Offer defining the authorized use of the Resource."@en
	* @return Returns the ArrayList of ContractOffer for the property contractOffer.
	* More information under https://w3id.org/idsa/core/contractOffer
	*/
	@JsonProperty("ids:contractOffer")
	public ArrayList<? extends ContractOffer> getContractOffer();

	/**
	* "Sample Resource instance."@en
	* @return Returns the ArrayList of Resource for the property sample.
	* More information under https://w3id.org/idsa/core/sample
	*/
	@JsonProperty("ids:sample")
	public ArrayList<? extends Resource> getSample();

	/**
	* "The publisher of the resource (which may differ from the sovereign)."@en
	* @return Returns the URI for the property publisher.
	* More information under https://w3id.org/idsa/core/publisher
	*/
	@JsonProperty("ids:publisher")
	public URI getPublisher();

	/**
	* "The \'owner\', i.e. sovereign of the data."@en
	* @return Returns the URI for the property sovereign.
	* More information under https://w3id.org/idsa/core/sovereign
	*/
	@JsonProperty("ids:sovereign")
	public URI getSovereign();

	/**
	* "(Equivalent) variant of given Resource, e.g. a translation."@en
	* @return Returns the Resource for the property variant.
	* More information under https://w3id.org/idsa/core/variant
	*/
	@JsonProperty("ids:variant")
	public Resource getVariant();

}
