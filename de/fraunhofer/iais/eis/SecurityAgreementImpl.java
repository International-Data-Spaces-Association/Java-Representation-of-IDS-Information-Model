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
* "Security Agreement"@en
* "The ContractAgreement class representing the \'Security Level Restricted Policy\' policy class."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:SecurityAgreement")
public class SecurityAgreementImpl implements Serializable, SecurityAgreement {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Security Agreement", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("The ContractAgreement class representing the 'Security Level Restricted Policy' policy class.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDSA Information Model ontology

	/**
	* "Consumer"@en
	* "Consumer of a Resource or Service that is the subject matter of the Contract. This party may differ from the Assignee specified by the Contract rules."@en
	*/
	@JsonAlias({"ids:consumer", "consumer"})
	protected URI _consumer;


	/**
	* "Annex to contract"@en
	* "Any type of resource related to the Contract."@en
	*/
	@JsonAlias({"ids:contractAnnex", "contractAnnex"})
	protected Resource _contractAnnex;


	/**
	* "Contract date"@en
	* "Absolute datetime of singing the Contract."@en
	*/
	@JsonAlias({"ids:contractDate", "contractDate"})
	protected XMLGregorianCalendar _contractDate;


	/**
	* "Contract document"@en
	* "Equivalent human-readable encoding of this machine-interpretable Contract."@en
	*/
	@JsonAlias({"ids:contractDocument", "contractDocument"})
	protected TextResource _contractDocument;


	/**
	* "Contract end"@en
	* "Absolute datetime the Contract is requested, offered or expected to end. If omitted, the contract has to be explicitly terminated by any of the parties."@en
	*/
	@JsonAlias({"ids:contractEnd", "contractEnd"})
	protected XMLGregorianCalendar _contractEnd;


	/**
	* "Contract start"@en
	* "Absolute datetime the Contract is requested, offered or expected to start, depending on the type of Contract."@en
	*/
	@NotNull
	@JsonAlias({"ids:contractStart", "contractStart"})
	protected XMLGregorianCalendar _contractStart;


	/**
	* "obligation"@en
	* "A Duty imposed by the Contract."@en
	*/
	@JsonAlias({"ids:obligation", "obligation"})
	protected ArrayList<? extends Duty> _obligation;


	/**
	* "permission"@en
	* "A Permission granted by the Contract."@en
	*/
	@JsonAlias({"ids:permission", "permission"})
	protected ArrayList<? extends Permission> _permission;


	/**
	* "prohibition"@en
	* "A Prohibition imposed by the Contract."@en
	*/
	@JsonAlias({"ids:prohibition", "prohibition"})
	protected ArrayList<? extends Prohibition> _prohibition;


	/**
	* "Provider"@en
	* "Provider of a Resource or Service that is the subject matter of the contract. This party may differ from the Assigner specified by the Contract rules."@en
	*/
	@JsonAlias({"ids:provider", "provider"})
	protected URI _provider;


	// no manual construction
	protected SecurityAgreementImpl() {
		id = VocabUtil.getInstance().createRandomUrl("securityAgreement");
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
	* "A Permission granted by the Contract."@en
	* @return Returns the ArrayList of Permission for the property permission.
	* More information under https://w3id.org/idsa/core/permission
	*/
	@JsonProperty("ids:permission")
	final public ArrayList<? extends Permission> getPermission() {
		return _permission;
	}

	
	/**
	* "A Permission granted by the Contract."@en
	* @param _permission_ desired value for the property permission.
	* More information under https://w3id.org/idsa/core/permission
	*/
	final public void setPermission (ArrayList<? extends Permission> _permission_) {
		this._permission = _permission_;
	}

	/**
	* "A Prohibition imposed by the Contract."@en
	* @return Returns the ArrayList of Prohibition for the property prohibition.
	* More information under https://w3id.org/idsa/core/prohibition
	*/
	@JsonProperty("ids:prohibition")
	final public ArrayList<? extends Prohibition> getProhibition() {
		return _prohibition;
	}

	
	/**
	* "A Prohibition imposed by the Contract."@en
	* @param _prohibition_ desired value for the property prohibition.
	* More information under https://w3id.org/idsa/core/prohibition
	*/
	final public void setProhibition (ArrayList<? extends Prohibition> _prohibition_) {
		this._prohibition = _prohibition_;
	}

	/**
	* "A Duty imposed by the Contract."@en
	* @return Returns the ArrayList of Duty for the property obligation.
	* More information under https://w3id.org/idsa/core/obligation
	*/
	@JsonProperty("ids:obligation")
	final public ArrayList<? extends Duty> getObligation() {
		return _obligation;
	}

	
	/**
	* "A Duty imposed by the Contract."@en
	* @param _obligation_ desired value for the property obligation.
	* More information under https://w3id.org/idsa/core/obligation
	*/
	final public void setObligation (ArrayList<? extends Duty> _obligation_) {
		this._obligation = _obligation_;
	}

	/**
	* "Absolute datetime the Contract is requested, offered or expected to start, depending on the type of Contract."@en
	* @return Returns the XMLGregorianCalendar for the property contractStart.
	* More information under https://w3id.org/idsa/core/contractStart
	*/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@NotNull
	@JsonProperty("ids:contractStart")
	final public XMLGregorianCalendar getContractStart() {
		return _contractStart;
	}

	
	/**
	* "Absolute datetime the Contract is requested, offered or expected to start, depending on the type of Contract."@en
	* @param _contractStart_ desired value for the property contractStart.
	* More information under https://w3id.org/idsa/core/contractStart
	*/
	final public void setContractStart (XMLGregorianCalendar _contractStart_) {
		this._contractStart = _contractStart_;
	}

	/**
	* "Absolute datetime the Contract is requested, offered or expected to end. If omitted, the contract has to be explicitly terminated by any of the parties."@en
	* @return Returns the XMLGregorianCalendar for the property contractEnd.
	* More information under https://w3id.org/idsa/core/contractEnd
	*/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@JsonProperty("ids:contractEnd")
	final public XMLGregorianCalendar getContractEnd() {
		return _contractEnd;
	}

	
	/**
	* "Absolute datetime the Contract is requested, offered or expected to end. If omitted, the contract has to be explicitly terminated by any of the parties."@en
	* @param _contractEnd_ desired value for the property contractEnd.
	* More information under https://w3id.org/idsa/core/contractEnd
	*/
	final public void setContractEnd (XMLGregorianCalendar _contractEnd_) {
		this._contractEnd = _contractEnd_;
	}

	/**
	* "Absolute datetime of singing the Contract."@en
	* @return Returns the XMLGregorianCalendar for the property contractDate.
	* More information under https://w3id.org/idsa/core/contractDate
	*/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@JsonProperty("ids:contractDate")
	final public XMLGregorianCalendar getContractDate() {
		return _contractDate;
	}

	
	/**
	* "Absolute datetime of singing the Contract."@en
	* @param _contractDate_ desired value for the property contractDate.
	* More information under https://w3id.org/idsa/core/contractDate
	*/
	final public void setContractDate (XMLGregorianCalendar _contractDate_) {
		this._contractDate = _contractDate_;
	}

	/**
	* "Provider of a Resource or Service that is the subject matter of the contract. This party may differ from the Assigner specified by the Contract rules."@en
	* @return Returns the URI for the property provider.
	* More information under https://w3id.org/idsa/core/provider
	*/
	@JsonProperty("ids:provider")
	final public URI getProvider() {
		return _provider;
	}

	
	/**
	* "Provider of a Resource or Service that is the subject matter of the contract. This party may differ from the Assigner specified by the Contract rules."@en
	* @param _provider_ desired value for the property provider.
	* More information under https://w3id.org/idsa/core/provider
	*/
	final public void setProvider (URI _provider_) {
		this._provider = _provider_;
	}

	/**
	* "Consumer of a Resource or Service that is the subject matter of the Contract. This party may differ from the Assignee specified by the Contract rules."@en
	* @return Returns the URI for the property consumer.
	* More information under https://w3id.org/idsa/core/consumer
	*/
	@JsonProperty("ids:consumer")
	final public URI getConsumer() {
		return _consumer;
	}

	
	/**
	* "Consumer of a Resource or Service that is the subject matter of the Contract. This party may differ from the Assignee specified by the Contract rules."@en
	* @param _consumer_ desired value for the property consumer.
	* More information under https://w3id.org/idsa/core/consumer
	*/
	final public void setConsumer (URI _consumer_) {
		this._consumer = _consumer_;
	}

	/**
	* "Equivalent human-readable encoding of this machine-interpretable Contract."@en
	* @return Returns the TextResource for the property contractDocument.
	* More information under https://w3id.org/idsa/core/contractDocument
	*/
	@JsonProperty("ids:contractDocument")
	final public TextResource getContractDocument() {
		return _contractDocument;
	}

	
	/**
	* "Equivalent human-readable encoding of this machine-interpretable Contract."@en
	* @param _contractDocument_ desired value for the property contractDocument.
	* More information under https://w3id.org/idsa/core/contractDocument
	*/
	final public void setContractDocument (TextResource _contractDocument_) {
		this._contractDocument = _contractDocument_;
	}

	/**
	* "Any type of resource related to the Contract."@en
	* @return Returns the Resource for the property contractAnnex.
	* More information under https://w3id.org/idsa/core/contractAnnex
	*/
	@JsonProperty("ids:contractAnnex")
	final public Resource getContractAnnex() {
		return _contractAnnex;
	}

	
	/**
	* "Any type of resource related to the Contract."@en
	* @param _contractAnnex_ desired value for the property contractAnnex.
	* More information under https://w3id.org/idsa/core/contractAnnex
	*/
	final public void setContractAnnex (Resource _contractAnnex_) {
		this._contractAnnex = _contractAnnex_;
	}


}
