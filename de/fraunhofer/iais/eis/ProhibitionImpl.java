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
* "Prohibition"@en
* "The class of Prohibitions as defined in the ODRL ontology."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:Prohibition")
public class ProhibitionImpl implements Prohibition {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Prohibition", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("The class of Prohibitions as defined in the ODRL ontology.", "en"));

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
	protected List<Action> _action;


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
	protected List<URI> _assignee;


	/**
	* "assigner"@en
	* "The issuer of the policy statement."@en
	*/
	@JsonAlias({"ids:assigner", "assigner"})
	protected List<URI> _assigner;


	/**
	* "constraint"@en
	* "The constraint to be used for a specific rule."@en
	*/
	@JsonAlias({"ids:constraint", "constraint"})
	protected List<AbstractConstraint> _constraint;


	/**
	* "description"@en
	* "Explanation of the resource in a natural language text."@en
	*/
	@JsonAlias({"ids:description", "description"})
	protected List<TypedLiteral> _description;


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
	protected List<TypedLiteral> _title;


	// no manual construction
	protected ProhibitionImpl() {
		id = VocabUtil.getInstance().createRandomUrl("prohibition");
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
		return Objects.hash(new Object[]{this._assignee,
			this._assigner,
			this._target,
			this._constraint,
			this._action,
			this._assetRefinement,
			this._title,
			this._description});
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
			ProhibitionImpl other = (ProhibitionImpl) obj;
			return Objects.equals(this._assignee, other._assignee) &&
				Objects.equals(this._assigner, other._assigner) &&
				Objects.equals(this._target, other._target) &&
				Objects.equals(this._constraint, other._constraint) &&
				Objects.equals(this._action, other._action) &&
				Objects.equals(this._assetRefinement, other._assetRefinement) &&
				Objects.equals(this._title, other._title) &&
				Objects.equals(this._description, other._description);
		}
	}


	// accessor method implementations as derived from the IDSA Information Model ontology



	@JsonProperty("ids:assignee")
	final public List<URI> getAssignee() {
		return _assignee;
	}
	
	final public void setAssignee (List<URI> _assignee_) {
		this._assignee = _assignee_;
	}

	@JsonProperty("ids:assigner")
	final public List<URI> getAssigner() {
		return _assigner;
	}
	
	final public void setAssigner (List<URI> _assigner_) {
		this._assigner = _assigner_;
	}

	@JsonProperty("ids:target")
	final public URI getTarget() {
		return _target;
	}
	
	final public void setTarget (URI _target_) {
		this._target = _target_;
	}

	@JsonProperty("ids:constraint")
	final public List<AbstractConstraint> getConstraint() {
		return _constraint;
	}
	
	final public void setConstraint (List<AbstractConstraint> _constraint_) {
		this._constraint = _constraint_;
	}

	@NotEmpty
	@JsonProperty("ids:action")
	final public List<Action> getAction() {
		return _action;
	}
	
	final public void setAction (List<Action> _action_) {
		this._action = _action_;
	}

	@JsonProperty("ids:assetRefinement")
	final public AbstractConstraint getAssetRefinement() {
		return _assetRefinement;
	}
	
	final public void setAssetRefinement (AbstractConstraint _assetRefinement_) {
		this._assetRefinement = _assetRefinement_;
	}

	@JsonProperty("ids:title")
	final public List<TypedLiteral> getTitle() {
		return _title;
	}
	
	final public void setTitle (List<TypedLiteral> _title_) {
		this._title = _title_;
	}

	@JsonProperty("ids:description")
	final public List<TypedLiteral> getDescription() {
		return _description;
	}
	
	final public void setDescription (List<TypedLiteral> _description_) {
		this._description = _description_;
	}


}
