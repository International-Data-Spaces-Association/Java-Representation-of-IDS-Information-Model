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
	"Resource Catalog"@en

	"Class that aggregates Resources form a (distributable) Catalog."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = ResourceCatalogImpl.class),})
public interface ResourceCatalog extends Catalog {

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
	"requested resource"@en

	"A Resource that is part of a resource catalog, indicating a request (of, e.g., data, software,...)."@en
	*/
	
	
	@JsonProperty("ids:requestedResource")
	java.util.ArrayList<? extends Resource> getRequestedResource();
	/**
	"offered resource"@en

	"A Resource that is part of a resource catalog, indicating an offering (of, e.g., data)."@en
	*/
	
	
	@JsonProperty("ids:offeredResource")
	java.util.ArrayList<? extends Resource> getOfferedResource();
}
