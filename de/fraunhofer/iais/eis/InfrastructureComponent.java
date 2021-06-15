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
import java.util.Objects;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

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
* "InfrastructureComponent"@en
* "The class of all infrastructure components of the IDS."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = Connector.class),
	@JsonSubTypes.Type(value = ClearingHouse.class),
	@JsonSubTypes.Type(value = DAPS.class),
	@JsonSubTypes.Type(value = IdentityProvider.class)
})
public interface InfrastructureComponent extends ManagedEntity {

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
	* "Participant responsible for technical maintenance of the InfrastructureComponent."@en
	* @return Returns the URI for the property _maintainer.
	* More information under https://w3id.org/idsa/core/maintainer
	*/
	@NotNull
	@JsonProperty("ids:maintainer")
	public URI getMaintainer();

	/**
	* "Participant responsible for the correctness of the content offered by the InfrastructureComponent."@en
	* @return Returns the URI for the property _curator.
	* More information under https://w3id.org/idsa/core/curator
	*/
	@NotNull
	@JsonProperty("ids:curator")
	public URI getCurator();

	/**
	* "The location where the Connector is physically deployed."@en
	* @return Returns the Location for the property _physicalLocation.
	* More information under https://w3id.org/idsa/core/physicalLocation
	*/
	@JsonProperty("ids:physicalLocation")
	public Location getPhysicalLocation();

	/**
	* "Information Model version that the InfrastructureComponent is capable of reading/processing."@en
	* @return Returns the List of Strings for the property _inboundModelVersion.
	* More information under https://w3id.org/idsa/core/inboundModelVersion
	*/
	@NotEmpty
	@JsonProperty("ids:inboundModelVersion")
	public List<String> getInboundModelVersion();

	/**
	* "Information Model version being produced by the InfrastructureComponent."@en
	* @return Returns the String for the property _outboundModelVersion.
	* More information under https://w3id.org/idsa/core/outboundModelVersion
	*/
	@NotNull
	@JsonProperty("ids:outboundModelVersion")
	public String getOutboundModelVersion();

	/**
	* "Certification issued for the given Infrastructure Component."@en
	* @return Returns the ComponentCertification for the property _componentCertification.
	* More information under https://w3id.org/idsa/core/componentCertification
	*/
	@JsonProperty("ids:componentCertification")
	public ComponentCertification getComponentCertification();

	/**
	* "Public Key that has been created for the Component."@en
	* @return Returns the PublicKey for the property _publicKey.
	* More information under https://w3id.org/idsa/core/publicKey
	*/
	@JsonProperty("ids:publicKey")
	public PublicKey getPublicKey();

}
