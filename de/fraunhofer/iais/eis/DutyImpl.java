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
* "Duty"@en
* "The class of Duties as defined in the ODRL ontology."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:Duty")
public class DutyImpl implements Serializable, Duty {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Duty", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("The class of Duties as defined in the ODRL ontology.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDSA Information Model ontology

	/**
	* "action"@en
	* "The operation relating to the asset /  data object. "@en
	*/
	@NotEmpty
	@JsonAlias({"ids:action", "action"})
	protected ArrayList<? extends Action> _action;


	/**
	* "content refinement"@en
	* "AssetRefinement define constraints that refines a (composite) Digital Content in an ids:Rule respectively the ids:AssetCollection."@en
	*/
	@JsonAlias({"ids:assetRefinement", "assetRefinement"})
	protected AbstractConstraint _assetRefinement;


	/**
	* "assignee"@en
	* "The recipient of the policy statement."@en
	*/
	@JsonAlias({"ids:assignee", "assignee"})
	protected ArrayList<? extends URI> _assignee;


	/**
	* "assigner"@en
	* "The issuer of the policy statement."@en
	*/
	@JsonAlias({"ids:assigner", "assigner"})
	protected ArrayList<? extends URI> _assigner;


	/**
	* "constraint"@en
	* "The constraint to be used for a specific rule."@en
	*/
	@JsonAlias({"ids:constraint", "constraint"})
	protected ArrayList<? extends AbstractConstraint> _constraint;


	/**
	* "description"@en
	* "Explanation of the resource in a natural language text."@en
	*/
	@JsonAlias({"ids:description", "description"})
	protected ArrayList<? extends TypedLiteral> _description;


	/**
	* "target"@en
	* "The subject of the policy statement (ids:Rule)."@en
	*/
	@JsonAlias({"ids:target", "target"})
	protected URI _target;


	/**
	* "title"@en
	* "(Localized) name of the entity."@en
	*/
	@JsonAlias({"ids:title", "title"})
	protected ArrayList<? extends TypedLiteral> _title;


	// no manual construction
	protected DutyImpl() {
		id = VocabUtil.getInstance().createRandomUrl("duty");
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
	* "The constraint to be used for a specific rule."@en
	* @return Returns the ArrayList of AbstractConstraint for the property constraint.
	* More information under https://w3id.org/idsa/core/constraint
	*/
	@JsonProperty("ids:constraint")
	final public ArrayList<? extends AbstractConstraint> getConstraint() {
		return _constraint;
	}

	
	/**
	* "The constraint to be used for a specific rule."@en
	* @param _constraint_ desired value for the property constraint.
	* More information under https://w3id.org/idsa/core/constraint
	*/
	final public void setConstraint (ArrayList<? extends AbstractConstraint> _constraint_) {
		this._constraint = _constraint_;
	}

	/**
	* "The issuer of the policy statement."@en
	* @return Returns the ArrayList of URI for the property assigner.
	* More information under https://w3id.org/idsa/core/assigner
	*/
	@JsonProperty("ids:assigner")
	final public ArrayList<? extends URI> getAssigner() {
		return _assigner;
	}

	
	/**
	* "The issuer of the policy statement."@en
	* @param _assigner_ desired value for the property assigner.
	* More information under https://w3id.org/idsa/core/assigner
	*/
	final public void setAssigner (ArrayList<? extends URI> _assigner_) {
		this._assigner = _assigner_;
	}

	/**
	* "The recipient of the policy statement."@en
	* @return Returns the ArrayList of URI for the property assignee.
	* More information under https://w3id.org/idsa/core/assignee
	*/
	@JsonProperty("ids:assignee")
	final public ArrayList<? extends URI> getAssignee() {
		return _assignee;
	}

	
	/**
	* "The recipient of the policy statement."@en
	* @param _assignee_ desired value for the property assignee.
	* More information under https://w3id.org/idsa/core/assignee
	*/
	final public void setAssignee (ArrayList<? extends URI> _assignee_) {
		this._assignee = _assignee_;
	}

	/**
	* "The subject of the policy statement (ids:Rule)."@en
	* @return Returns the URI for the property target.
	* More information under https://w3id.org/idsa/core/target
	*/
	@JsonProperty("ids:target")
	final public URI getTarget() {
		return _target;
	}

	
	/**
	* "The subject of the policy statement (ids:Rule)."@en
	* @param _target_ desired value for the property target.
	* More information under https://w3id.org/idsa/core/target
	*/
	final public void setTarget (URI _target_) {
		this._target = _target_;
	}

	/**
	* "The operation relating to the asset /  data object. "@en
	* @return Returns the ArrayList of Action for the property action.
	* More information under https://w3id.org/idsa/core/action
	*/
	@NotEmpty
	@JsonProperty("ids:action")
	final public ArrayList<? extends Action> getAction() {
		return _action;
	}

	
	/**
	* "The operation relating to the asset /  data object. "@en
	* @param _action_ desired value for the property action.
	* More information under https://w3id.org/idsa/core/action
	*/
	final public void setAction (ArrayList<? extends Action> _action_) {
		this._action = _action_;
	}

	/**
	* "AssetRefinement define constraints that refines a (composite) Digital Content in an ids:Rule respectively the ids:AssetCollection."@en
	* @return Returns the AbstractConstraint for the property assetRefinement.
	* More information under https://w3id.org/idsa/core/assetRefinement
	*/
	@JsonProperty("ids:assetRefinement")
	final public AbstractConstraint getAssetRefinement() {
		return _assetRefinement;
	}

	
	/**
	* "AssetRefinement define constraints that refines a (composite) Digital Content in an ids:Rule respectively the ids:AssetCollection."@en
	* @param _assetRefinement_ desired value for the property assetRefinement.
	* More information under https://w3id.org/idsa/core/assetRefinement
	*/
	final public void setAssetRefinement (AbstractConstraint _assetRefinement_) {
		this._assetRefinement = _assetRefinement_;
	}

	/**
	* "(Localized) name of the entity."@en
	* @return Returns the ArrayList of TypedLiteral for the property title.
	* More information under https://w3id.org/idsa/core/title
	*/
	@JsonProperty("ids:title")
	final public ArrayList<? extends TypedLiteral> getTitle() {
		return _title;
	}

	
	/**
	* "(Localized) name of the entity."@en
	* @param _title_ desired value for the property title.
	* More information under https://w3id.org/idsa/core/title
	*/
	final public void setTitle (ArrayList<? extends TypedLiteral> _title_) {
		this._title = _title_;
	}

	/**
	* "Explanation of the resource in a natural language text."@en
	* @return Returns the ArrayList of TypedLiteral for the property description.
	* More information under https://w3id.org/idsa/core/description
	*/
	@JsonProperty("ids:description")
	final public ArrayList<? extends TypedLiteral> getDescription() {
		return _description;
	}

	
	/**
	* "Explanation of the resource in a natural language text."@en
	* @param _description_ desired value for the property description.
	* More information under https://w3id.org/idsa/core/description
	*/
	final public void setDescription (ArrayList<? extends TypedLiteral> _description_) {
		this._description = _description_;
	}


}
