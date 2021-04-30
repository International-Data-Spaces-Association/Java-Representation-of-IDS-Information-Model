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
* "Configuration Model"@en
* "Configuration Model is used for Connector deployment."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = ConfigurationModelImpl.class)
})
public interface ConfigurationModel {

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
	* "authentication methods allowed in a Configuration Model"@en
	* @return Returns the List of UserAuthentications for the property _userAuthentication.
	* More information under https://w3id.org/idsa/core/userAuthentication
	*/
	@JsonProperty("ids:userAuthentication")
	public List<UserAuthentication> getUserAuthentication();

	/**
	* "Log level configuration for a Connector which is deployed using the Configuration Model"@en
	* @return Returns the LogLevel for the property _configurationModelLogLevel.
	* More information under https://w3id.org/idsa/core/configurationModelLogLevel
	*/
	@NotNull
	@JsonProperty("ids:configurationModelLogLevel")
	public LogLevel getConfigurationModelLogLevel();

	/**
	* "Status of a Connector deployed by the Configuration Model"@en
	* @return Returns the ConnectorStatus for the property _connectorStatus.
	* More information under https://w3id.org/idsa/core/connectorStatus
	*/
	@NotNull
	@JsonProperty("ids:connectorStatus")
	public ConnectorStatus getConnectorStatus();

	/**
	* "Deply mode of a Connector in the Configuration Model"@en
	* @return Returns the ConnectorDeployMode for the property _connectorDeployMode.
	* More information under https://w3id.org/idsa/core/connectorDeployMode
	*/
	@NotNull
	@JsonProperty("ids:connectorDeployMode")
	public ConnectorDeployMode getConnectorDeployMode();

	/**
	* "References to Connector which is deployed / maintained in the Configuration Model"@en
	* @return Returns the Connector for the property _connectorDescription.
	* More information under https://w3id.org/idsa/core/connectorDescription
	*/
	@JsonProperty("ids:connectorDescription")
	public Connector getConnectorDescription();

	/**
	* "Proxies for a Connector which is deployed using the Configuration Model"@en
	* @return Returns the List of Proxys for the property _connectorProxy.
	* More information under https://w3id.org/idsa/core/connectorProxy
	*/
	@JsonProperty("ids:connectorProxy")
	public List<Proxy> getConnectorProxy();

	/**
	* "URI of the trust store server."@en
	* @return Returns the URI for the property _trustStore.
	* More information under https://w3id.org/idsa/core/trustStore
	*/
	@JsonProperty("ids:trustStore")
	public URI getTrustStore();

	/**
	* "alias for the trust store."@en
	* @return Returns the String for the property _trustStoreAlias.
	* More information under https://w3id.org/idsa/core/trustStoreAlias
	*/
	@JsonProperty("ids:trustStoreAlias")
	public String getTrustStoreAlias();

	/**
	* "Password of the trust store server."@en
	* @return Returns the String for the property _trustStorePassword.
	* More information under https://w3id.org/idsa/core/trustStorePassword
	*/
	@JsonProperty("ids:trustStorePassword")
	public String getTrustStorePassword();

	/**
	* "URI of the key store server."@en
	* @return Returns the URI for the property _keyStore.
	* More information under https://w3id.org/idsa/core/keyStore
	*/
	@JsonProperty("ids:keyStore")
	public URI getKeyStore();

	/**
	* "alias for the key store."@en
	* @return Returns the String for the property _keyStoreAlias.
	* More information under https://w3id.org/idsa/core/keyStoreAlias
	*/
	@JsonProperty("ids:keyStoreAlias")
	public String getKeyStoreAlias();

	/**
	* "Password of the key store server."@en
	* @return Returns the String for the property _keyStorePassword.
	* More information under https://w3id.org/idsa/core/keyStorePassword
	*/
	@JsonProperty("ids:keyStorePassword")
	public String getKeyStorePassword();

	/**
	* "Catalog of Brokers to which the ids:Connector that we are configuring (cf. ids:connectorDescription) may want to talk."@en
	* @return Returns the BrokerCatalog for the property _configuredBroker.
	* More information under https://w3id.org/idsa/core/configuredBroker
	*/
	@JsonProperty("ids:configuredBroker")
	public BrokerCatalog getConfiguredBroker();

	/**
	* @return Returns the List of AppRoutes for the property _appRoute.
	* More information under https://w3id.org/idsa/core/appRoute
	*/
	@JsonProperty("ids:appRoute")
	public List<AppRoute> getAppRoute();

	/**
	* "One or more app stores to which the ids:Connector that we are configuring (cf. ids:connectorDescription) may want to talk, e.g. to retrieve apps from them."@en
	* @return Returns the AppStoreCatalog for the property _configuredAppStore.
	* More information under https://w3id.org/idsa/core/configuredAppStore
	*/
	@JsonProperty("ids:configuredAppStore")
	public AppStoreCatalog getConfiguredAppStore();

	/**
	* "Catalog of app resources for a given Configuration Model. Used to persist configured / installed apps."@en
	* @return Returns the AppResourceCatalog for the property _configuredAppResource.
	* More information under https://w3id.org/idsa/core/configuredAppResource
	*/
	@JsonProperty("ids:configuredAppResource")
	public AppResourceCatalog getConfiguredAppResource();

	/**
	* "Catalog of clearing houses for a given Configuration Model."@en
	* @return Returns the ClearingHouseCatalog for the property _configuredClearingHouse.
	* More information under https://w3id.org/idsa/core/configuredClearingHouse
	*/
	@JsonProperty("ids:configuredClearingHouse")
	public ClearingHouseCatalog getConfiguredClearingHouse();

}
