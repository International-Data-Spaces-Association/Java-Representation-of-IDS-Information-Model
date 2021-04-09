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
	protected ArrayList<? extends Resource> _offeredResource;


	/**
	* "requested resource"@en
	* "A Resource that is part of a resource catalog, indicating a request (of, e.g., data, software,...)."@en
	*/
	@JsonAlias({"ids:requestedResource", "requestedResource"})
	protected ArrayList<? extends Resource> _requestedResource;


	// no manual construction
	protected ResourceCatalogImpl() {
		id = VocabUtil.getInstance().createRandomUrl("resourceCatalog");
	}

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel() {
		return this.label;
	}

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
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

	// accessor method implementations as derived from the IDSA Information Model ontology


	/**
	* "A Resource that is part of a resource catalog, indicating a request (of, e.g., data, software,...)."@en
	* @return Returns the ArrayList of Resource for the property requestedResource.
	* More information under https://w3id.org/idsa/core/requestedResource
	*/
	@JsonProperty("ids:requestedResource")
	final public ArrayList<? extends Resource> getRequestedResource() {
		return _requestedResource;
	}

	
	/**
	* "A Resource that is part of a resource catalog, indicating a request (of, e.g., data, software,...)."@en
	* @param _requestedResource_ desired value for the property requestedResource.
	* More information under https://w3id.org/idsa/core/requestedResource
	*/
	final public void setRequestedResource (ArrayList<? extends Resource> _requestedResource_) {
		this._requestedResource = _requestedResource_;
	}

	/**
	* "A Resource that is part of a resource catalog, indicating an offering (of, e.g., data)."@en
	* @return Returns the ArrayList of Resource for the property offeredResource.
	* More information under https://w3id.org/idsa/core/offeredResource
	*/
	@JsonProperty("ids:offeredResource")
	final public ArrayList<? extends Resource> getOfferedResource() {
		return _offeredResource;
	}

	
	/**
	* "A Resource that is part of a resource catalog, indicating an offering (of, e.g., data)."@en
	* @param _offeredResource_ desired value for the property offeredResource.
	* More information under https://w3id.org/idsa/core/offeredResource
	*/
	final public void setOfferedResource (ArrayList<? extends Resource> _offeredResource_) {
		this._offeredResource = _offeredResource_;
	}


}
