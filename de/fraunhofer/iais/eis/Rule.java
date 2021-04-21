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
* "Rule"@en
* "Superclass of Permissions, Prohibitions and Duties."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = Permission.class),
	@JsonSubTypes.Type(value = Prohibition.class),
	@JsonSubTypes.Type(value = Duty.class)
})
public interface Rule extends Described {

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

	/**
	* This function returns a hash code value for the Rule for the benefit of e.g. hash tables.
	* @return a hash code value for the Rule
	*/
	public int hashCode();

	/**
	* This function indicates whether some other object is equal to this one.
	* @param obj the reference object with which to compare.
	* @return true if this Rule is the same as the obj argument; false otherwise.
	*/
	public boolean equals(Object obj);

	// accessor methods as derived from the IDSA Information Model ontology


	/**
	* "The constraint to be used for a specific rule."@en
	* @return Returns the List of AbstractConstraints for the property _constraint.
	* More information under https://w3id.org/idsa/core/constraint
	*/
	@JsonProperty("ids:constraint")
	public List<AbstractConstraint> getConstraint();

	/**
	* "The issuer of the policy statement."@en
	* @return Returns the List of URIs for the property _assigner.
	* More information under https://w3id.org/idsa/core/assigner
	*/
	@JsonProperty("ids:assigner")
	public List<URI> getAssigner();

	/**
	* "The recipient of the policy statement."@en
	* @return Returns the List of URIs for the property _assignee.
	* More information under https://w3id.org/idsa/core/assignee
	*/
	@JsonProperty("ids:assignee")
	public List<URI> getAssignee();

	/**
	* "The subject of the policy statement (ids:Rule)."@en
	* @return Returns the URI for the property _target.
	* More information under https://w3id.org/idsa/core/target
	*/
	@JsonProperty("ids:target")
	public URI getTarget();

	/**
	* "The operation relating to the asset /  data object. "@en
	* @return Returns the List of Actions for the property _action.
	* More information under https://w3id.org/idsa/core/action
	*/
	@NotEmpty
	@JsonProperty("ids:action")
	public List<Action> getAction();

	/**
	* "AssetRefinement define constraints that refines a (composite) Digital Content in an ids:Rule respectively the ids:AssetCollection."@en
	* @return Returns the AbstractConstraint for the property _assetRefinement.
	* More information under https://w3id.org/idsa/core/assetRefinement
	*/
	@JsonProperty("ids:assetRefinement")
	public AbstractConstraint getAssetRefinement();

}
