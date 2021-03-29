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

	"Holds Proxy information."@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:Proxy")
public class ProxyImpl implements Serializable, Proxy {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Proxy", "en"));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Holds Proxy information.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

	/**
	"no proxy"@en

	"URLs that should be excluded from proxying.GNU emcs documentation contains a good explanation for the usage of noProxy."@en
	*/
	@JsonAlias({"ids:noProxy", "noProxy"})
	 java.util.ArrayList<? extends URI> _noProxy;

	/**
	"proxy Authentication"@en

	"authentication information for the proxy"@en
	*/
	@JsonAlias({"ids:proxyAuthentication", "proxyAuthentication"})
	 BasicAuthentication _proxyAuthentication;

	/**
	"proxy URI"@en

	"URI of the proxy server."@en
	*/
	@NotNull@JsonAlias({"ids:proxyURI", "proxyURI"})
	 URI _proxyURI;

	// no manual construction
	ProxyImpl() {
		id = VocabUtil.getInstance().createRandomUrl("proxy");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	public java.util.List<TypedLiteral> getLabel() {
		return this.label;
	}

	public java.util.List<TypedLiteral> getComment() {
		return this.comment;
	}

	// getter and setter for generic property map
	@JsonAnyGetter
	public java.util.Map<String,Object> getProperties() {
		if (this.properties == null) return null;
		Iterator<String> iter = this.properties.keySet().iterator();
		java.util.Map<String,Object> resultset = new HashMap<String, Object>();
		while (iter.hasNext()) {
			String key = iter.next();
			resultset.put(key,urifyObjects(this.properties.get(key)));
		}
		return resultset ;
	}

	public Object urifyObjects(Object value) {
		if (value instanceof String && value.toString().startsWith("http")) {
			try {
				value = new URI(value.toString());
			} catch (Exception e) { /* do nothing */ }
		} else if (value instanceof ArrayList) {
			ArrayList<Object> result_array = new ArrayList<Object>();
			((ArrayList) value).forEach(x -> result_array.add(urifyObjects(x)));
			return result_array;
		} else if (value instanceof java.util.Map) {
			java.util.Map<String, Object> result_map = new HashMap<String, Object>();
			((java.util.Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	@JsonAnySetter
	public void setProperty(String property, Object value) {
	if (this.properties == null) this.properties = new java.util.HashMap<String,Object>();
	if (property.startsWith("@")) {return ;};
	this.properties.put(property, value) ;
	}
	// accessor method implementations as derived from information model

	final public 
	
	
	@JsonProperty("ids:noProxy")
	java.util.ArrayList<? extends URI> getNoProxy() {
		return _noProxy;
	}
	final public void setNoProxy (java.util.ArrayList<? extends URI> _noProxy_) {
		this._noProxy = _noProxy_;
	}

	final public 
	
	@NotNull
	@JsonProperty("ids:proxyURI")
	URI getProxyURI() {
		return _proxyURI;
	}
	final public void setProxyURI (URI _proxyURI_) {
		this._proxyURI = _proxyURI_;
	}

	final public 
	
	
	@JsonProperty("ids:proxyAuthentication")
	BasicAuthentication getProxyAuthentication() {
		return _proxyAuthentication;
	}
	final public void setProxyAuthentication (BasicAuthentication _proxyAuthentication_) {
		this._proxyAuthentication = _proxyAuthentication_;
	}
}
