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
* "described"@en
* "Entity described by a minimal textual annotation, i.e. a title and description."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = Agent.class),
	@JsonSubTypes.Type(value = DigitalContent.class),
	@JsonSubTypes.Type(value = ManagedEntity.class),
	@JsonSubTypes.Type(value = Rule.class)
})
public interface Described {

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
	* "(Localized) name of the entity."@en
	* @return Returns the List of TypedLiterals for the property _title.
	* More information under https://w3id.org/idsa/core/title
	*/
	@JsonProperty("ids:title")
	public List<TypedLiteral> getTitle();

	/**
	* "Explanation of the resource in a natural language text."@en
	* @return Returns the List of TypedLiterals for the property _description.
	* More information under https://w3id.org/idsa/core/description
	*/
	@JsonProperty("ids:description")
	public List<TypedLiteral> getDescription();

}
