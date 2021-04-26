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
* "Resource Catalog"@en
* "Class that aggregates Resources form a (distributable) Catalog."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:ResourceCatalog")
public class ResourceCatalogImpl implements Serializable, ResourceCatalog {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Resource Catalog", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Class that aggregates Resources form a (distributable) Catalog.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDSA Information Model ontology

	/**
	* "offered resource"@en
	* "A Resource that is part of a resource catalog, indicating an offering (of, e.g., data)."@en
	*/
	@JsonAlias({"ids:offeredResource", "offeredResource"})
	protected List<Resource> _offeredResource;


	/**
	* "requested resource"@en
	* "A Resource that is part of a resource catalog, indicating a request (of, e.g., data, software,...)."@en
	*/
	@JsonAlias({"ids:requestedResource", "requestedResource"})
	protected List<Resource> _requestedResource;


	// no manual construction
	protected ResourceCatalogImpl() {
		id = VocabUtil.getInstance().createRandomUrl("resourceCatalog");
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
	public int hashCode() {
		return Objects.hash(new Object[]{this._offeredResource,
			this._requestedResource});
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			ResourceCatalogImpl other = (ResourceCatalogImpl) obj;
			return Objects.equals(this._offeredResource, other._offeredResource) &&
				Objects.equals(this._requestedResource, other._requestedResource);
		}
	}


	// accessor method implementations as derived from the IDSA Information Model ontology


	@JsonProperty("ids:offeredResource")
	final public List<Resource> getOfferedResource() {
		return _offeredResource;
	}
	
	final public void setOfferedResource (List<Resource> _offeredResource_) {
		this._offeredResource = _offeredResource_;
	}

	@JsonProperty("ids:requestedResource")
	final public List<Resource> getRequestedResource() {
		return _requestedResource;
	}
	
	final public void setRequestedResource (List<Resource> _requestedResource_) {
		this._requestedResource = _requestedResource_;
	}


}
