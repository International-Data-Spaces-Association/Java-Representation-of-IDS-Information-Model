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
	"InfrastructureComponent"@en

	"The class of all infrastructure components of the IDS."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = ClearingHouse.class),

@JsonSubTypes.Type(value = Connector.class),

@JsonSubTypes.Type(value = DAPS.class),

@JsonSubTypes.Type(value = IdentityProvider.class),})
public interface InfrastructureComponent extends ManagedEntity {

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
	"maintainer"@en

	"Participant responsible for technical maintenance of the InfrastructureComponent."@en
	*/
	
	@NotNull
	@JsonProperty("ids:maintainer")
	URI getMaintainer();
	/**
	"curator"@en

	"Participant responsible for the correctness of the content offered by the InfrastructureComponent."@en
	*/
	
	@NotNull
	@JsonProperty("ids:curator")
	URI getCurator();
	/**
	"inboundModelVersion"@en

	"Information Model version that the InfrastructureComponent is capable of reading/processing."@en
	*/
	
	@NotEmpty
	@JsonProperty("ids:inboundModelVersion")
	java.util.ArrayList<? extends String> getInboundModelVersion();
	/**
	"outbound model version"@en

	"Information Model version being produced by the InfrastructureComponent."@en
	*/
	
	@NotNull
	@JsonProperty("ids:outboundModelVersion")
	String getOutboundModelVersion();
	/**
	"physicalLocation"@en

	"The location where the Connector is physically deployed."@en
	*/
	
	
	@JsonProperty("ids:physicalLocation")
	Location getPhysicalLocation();
	/**
	"component certification"@en

	"Certification issued for the given Infrastructure Component."@en
	*/
	
	
	@JsonProperty("ids:componentCertification")
	ComponentCertification getComponentCertification();
	/**
	"Public Key"@en

	"Public Key that has been created for the Component."@en
	*/
	
	
	@JsonProperty("ids:publicKey")
	PublicKey getPublicKey();
}
