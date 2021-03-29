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
	"Proxy"@en

	"Holds Proxy information."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = ProxyImpl.class),})
public interface Proxy {

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
	"no proxy"@en

	"URLs that should be excluded from proxying.GNU emcs documentation contains a good explanation for the usage of noProxy."@en
	*/
	
	
	@JsonProperty("ids:noProxy")
	java.util.ArrayList<? extends URI> getNoProxy();
	/**
	"proxy URI"@en

	"URI of the proxy server."@en
	*/
	
	@NotNull
	@JsonProperty("ids:proxyURI")
	URI getProxyURI();
	/**
	"proxy Authentication"@en

	"authentication information for the proxy"@en
	*/
	
	
	@JsonProperty("ids:proxyAuthentication")
	BasicAuthentication getProxyAuthentication();
}
