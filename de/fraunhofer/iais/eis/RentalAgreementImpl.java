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
* "Rental Agreement"@en
* "The ContractAgreement class representing the \'Data Rental\' policy class."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:RentalAgreement")
public class RentalAgreementImpl implements RentalAgreement {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Rental Agreement", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("The ContractAgreement class representing the 'Data Rental' policy class.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDS Information Model ontology

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
	protected List<Duty> _obligation;


	/**
	* "permission"@en
	* "A Permission granted by the Contract."@en
	*/
	@JsonAlias({"ids:permission", "permission"})
	protected List<Permission> _permission;


	/**
	* "prohibition"@en
	* "A Prohibition imposed by the Contract."@en
	*/
	@JsonAlias({"ids:prohibition", "prohibition"})
	protected List<Prohibition> _prohibition;


	/**
	* "Provider"@en
	* "Provider of a Resource or Service that is the subject matter of the contract. This party may differ from the Assigner specified by the Contract rules."@en
	*/
	@JsonAlias({"ids:provider", "provider"})
	protected URI _provider;


	// no manual construction
	protected RentalAgreementImpl() {
		id = VocabUtil.getInstance().createRandomUrl("rentalAgreement");
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
		return Objects.hash(new Object[]{this._contractStart,
			this._contractEnd,
			this._contractDate,
			this._provider,
			this._consumer,
			this._contractDocument,
			this._contractAnnex,
			this._permission,
			this._prohibition,
			this._obligation});
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
			RentalAgreementImpl other = (RentalAgreementImpl) obj;
			return Objects.equals(this._contractStart, other._contractStart) &&
				Objects.equals(this._contractEnd, other._contractEnd) &&
				Objects.equals(this._contractDate, other._contractDate) &&
				Objects.equals(this._provider, other._provider) &&
				Objects.equals(this._consumer, other._consumer) &&
				Objects.equals(this._contractDocument, other._contractDocument) &&
				Objects.equals(this._contractAnnex, other._contractAnnex) &&
				Objects.equals(this._permission, other._permission) &&
				Objects.equals(this._prohibition, other._prohibition) &&
				Objects.equals(this._obligation, other._obligation);
		}
	}


	// accessor method implementations as derived from the IDS Information Model ontology




	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@NotNull
	@JsonProperty("ids:contractStart")
	final public XMLGregorianCalendar getContractStart() {
		return _contractStart;
	}
	
	final public void setContractStart (XMLGregorianCalendar _contractStart_) {
		this._contractStart = _contractStart_;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@JsonProperty("ids:contractEnd")
	final public XMLGregorianCalendar getContractEnd() {
		return _contractEnd;
	}
	
	final public void setContractEnd (XMLGregorianCalendar _contractEnd_) {
		this._contractEnd = _contractEnd_;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@JsonProperty("ids:contractDate")
	final public XMLGregorianCalendar getContractDate() {
		return _contractDate;
	}
	
	final public void setContractDate (XMLGregorianCalendar _contractDate_) {
		this._contractDate = _contractDate_;
	}

	@JsonProperty("ids:provider")
	final public URI getProvider() {
		return _provider;
	}
	
	final public void setProvider (URI _provider_) {
		this._provider = _provider_;
	}

	@JsonProperty("ids:consumer")
	final public URI getConsumer() {
		return _consumer;
	}
	
	final public void setConsumer (URI _consumer_) {
		this._consumer = _consumer_;
	}

	@JsonProperty("ids:contractDocument")
	final public TextResource getContractDocument() {
		return _contractDocument;
	}
	
	final public void setContractDocument (TextResource _contractDocument_) {
		this._contractDocument = _contractDocument_;
	}

	@JsonProperty("ids:contractAnnex")
	final public Resource getContractAnnex() {
		return _contractAnnex;
	}
	
	final public void setContractAnnex (Resource _contractAnnex_) {
		this._contractAnnex = _contractAnnex_;
	}

	@JsonProperty("ids:permission")
	final public List<Permission> getPermission() {
		return _permission;
	}
	
	final public void setPermission (List<Permission> _permission_) {
		this._permission = _permission_;
	}

	@JsonProperty("ids:prohibition")
	final public List<Prohibition> getProhibition() {
		return _prohibition;
	}
	
	final public void setProhibition (List<Prohibition> _prohibition_) {
		this._prohibition = _prohibition_;
	}

	@JsonProperty("ids:obligation")
	final public List<Duty> getObligation() {
		return _obligation;
	}
	
	final public void setObligation (List<Duty> _obligation_) {
		this._obligation = _obligation_;
	}


}
