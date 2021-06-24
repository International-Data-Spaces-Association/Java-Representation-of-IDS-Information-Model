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
* "Proxy"@en
* "Holds Proxy information."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:Proxy")
public class ProxyImpl implements Proxy {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Proxy", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Holds Proxy information.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDS Information Model ontology

	/**
	* "no proxy"@en
	* "URLs that should be excluded from proxying.GNU emcs documentation contains a good explanation for the usage of noProxy."@en
	*/
	@JsonAlias({"ids:noProxy", "noProxy"})
	protected List<URI> _noProxy;


	/**
	* "proxy Authentication"@en
	* "authentication information for the proxy"@en
	*/
	@JsonAlias({"ids:proxyAuthentication", "proxyAuthentication"})
	protected BasicAuthentication _proxyAuthentication;


	/**
	* "proxy URI"@en
	* "URI of the proxy server."@en
	*/
	@NotNull
	@JsonAlias({"ids:proxyURI", "proxyURI"})
	protected URI _proxyURI;


	// no manual construction
	protected ProxyImpl() {
		id = VocabUtil.getInstance().createRandomUrl("proxy");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	public List<TypedLiteral> getLabel() {
		return this.label;
	}

	public List<TypedLiteral> getComment() {
		return this.comment;
	}

	// getter and setter for generic property map
	@JsonAnyGetter
	public Map<String,Object> getProperties() {
		if (this.properties == null) return null;
		Iterator<String> iter = this.properties.keySet().iterator();
		Map<String,Object> resultset = new HashMap<String, Object>();
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
		} else if (value instanceof Map) {
			Map<String, Object> result_map = new HashMap<String, Object>();
			((Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	@JsonAnySetter
	public void setProperty(String property, Object value) {
		if (this.properties == null) this.properties = new HashMap<String,Object>();
		if (property.startsWith("@")) {return ;};
		this.properties.put(property, value) ;
	}
	@Override
	public int hashCode() {
		return Objects.hash(new Object[]{this._proxyURI,
			this._noProxy,
			this._proxyAuthentication});
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			ProxyImpl other = (ProxyImpl) obj;
			return Objects.equals(this._proxyURI, other._proxyURI) &&
				Objects.equals(this._noProxy, other._noProxy) &&
				Objects.equals(this._proxyAuthentication, other._proxyAuthentication);
		}
	}


	// accessor method implementations as derived from the IDS Information Model ontology


	@NotNull
	@JsonProperty("ids:proxyURI")
	final public URI getProxyURI() {
		return _proxyURI;
	}
	
	final public void setProxyURI (URI _proxyURI_) {
		this._proxyURI = _proxyURI_;
	}

	@JsonProperty("ids:noProxy")
	final public List<URI> getNoProxy() {
		return _noProxy;
	}
	
	final public void setNoProxy (List<URI> _noProxy_) {
		this._noProxy = _noProxy_;
	}

	@JsonProperty("ids:proxyAuthentication")
	final public BasicAuthentication getProxyAuthentication() {
		return _proxyAuthentication;
	}
	
	final public void setProxyAuthentication (BasicAuthentication _proxyAuthentication_) {
		this._proxyAuthentication = _proxyAuthentication_;
	}
}
