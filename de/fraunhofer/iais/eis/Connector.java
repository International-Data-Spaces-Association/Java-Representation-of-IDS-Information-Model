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
	"Connector"@en

	"Dedicated communication server for sending and receiving data in compliance with the Connector specification. There are different types of Connectors according to provided capabilities."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = AppStore.class),

@JsonSubTypes.Type(value = BaseConnector.class),

@JsonSubTypes.Type(value = Broker.class),

@JsonSubTypes.Type(value = ParIS.class),

@JsonSubTypes.Type(value = TrustedConnector.class),})
public interface Connector extends InfrastructureComponent {

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
	"has endpoint"@en

	"Reference to the Endpoints serving the resource\'s content or let you exchange messages with an IDS Connector."@en
	*/
	
	
	@JsonProperty("ids:hasEndpoint")
	java.util.ArrayList<? extends ConnectorEndpoint> getHasEndpoint();
	/**
	"has Agent"@en

	"The Agents for which this Connector may initiate and receive Messages."@en
	*/
	
	
	@JsonProperty("ids:hasAgent")
	java.util.ArrayList<? extends URI> getHasAgent();
	/**
	"resource catalog"@en

	"References the Catalog of published or requested resource by this Connector."@en
	*/
	
	
	@JsonProperty("ids:resourceCatalog")
	java.util.ArrayList<? extends ResourceCatalog> getResourceCatalog();
	/**
	"has default endpoint"@en

	"Indicates the default endpoint that should be used for basic infrastructure interactions, e.g., providing the self description."@en
	*/
	
	
	@JsonProperty("ids:hasDefaultEndpoint")
	ConnectorEndpoint getHasDefaultEndpoint();
	/**
	"authInfo"@en

	"Information of the authentication service used by the Connector."@en
	*/
	
	
	@JsonProperty("ids:authInfo")
	AuthInfo getAuthInfo();
	/**
	"securityProfile"@en

	"The SecurityProfile supported by the Connector."@en
	*/
	
	@NotNull
	@JsonProperty("ids:securityProfile")
	SecurityProfile getSecurityProfile();
	/**
	"extended guarantee"@en

	"Reference to a security guarantee that, if used in combination with a security profile instance, overrides the respective guarantee of the given predefined instance."@en
	*/
	
	
	@JsonProperty("ids:extendedGuarantee")
	java.util.ArrayList<? extends SecurityGuarantee> getExtendedGuarantee();
}
