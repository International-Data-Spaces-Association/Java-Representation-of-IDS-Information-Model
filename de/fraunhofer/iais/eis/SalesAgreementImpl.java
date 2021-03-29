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
	"Sales Agreement"@en

	"The ContractAgreement class representing the Perpetual Data Sale policy class."@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:SalesAgreement")
public class SalesAgreementImpl implements Serializable, SalesAgreement {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Sales Agreement", "en"));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("The ContractAgreement class representing the Perpetual Data Sale policy class.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

	/**
	"Consumer"@en

	"Consumer of a Resource or Service that is the subject matter of the Contract. This party may differ from the Assignee specified by the Contract rules."@en
	*/
	@JsonAlias({"ids:consumer", "consumer"})
	 URI _consumer;

	/**
	"Annex to contract"@en

	"Any type of resource related to the Contract."@en
	*/
	@JsonAlias({"ids:contractAnnex", "contractAnnex"})
	 Resource _contractAnnex;

	/**
	"Contract date"@en

	"Absolute datetime of singing the Contract."@en
	*/
	@JsonAlias({"ids:contractDate", "contractDate"})
	 XMLGregorianCalendar _contractDate;

	/**
	"Contract document"@en

	"Equivalent human-readable encoding of this machine-interpretable Contract."@en
	*/
	@JsonAlias({"ids:contractDocument", "contractDocument"})
	 TextResource _contractDocument;

	/**
	"Contract end"@en

	"Absolute datetime the Contract is requested, offered or expected to end. If omitted, the contract has to be explicitly terminated by any of the parties."@en
	*/
	@JsonAlias({"ids:contractEnd", "contractEnd"})
	 XMLGregorianCalendar _contractEnd;

	/**
	"Contract start"@en

	"Absolute datetime the Contract is requested, offered or expected to start, depending on the type of Contract."@en
	*/
	@NotNull@JsonAlias({"ids:contractStart", "contractStart"})
	 XMLGregorianCalendar _contractStart;

	/**
	"obligation"@en

	"A Duty imposed by the Contract."@en
	*/
	@JsonAlias({"ids:obligation", "obligation"})
	 java.util.ArrayList<? extends Duty> _obligation;

	/**
	"permission"@en

	"A Permission granted by the Contract."@en
	*/
	@JsonAlias({"ids:permission", "permission"})
	 java.util.ArrayList<? extends Permission> _permission;

	/**
	"prohibition"@en

	"A Prohibition imposed by the Contract."@en
	*/
	@JsonAlias({"ids:prohibition", "prohibition"})
	 java.util.ArrayList<? extends Prohibition> _prohibition;

	/**
	"Provider"@en

	"Provider of a Resource or Service that is the subject matter of the contract. This party may differ from the Assigner specified by the Contract rules."@en
	*/
	@JsonAlias({"ids:provider", "provider"})
	 URI _provider;

	// no manual construction
	SalesAgreementImpl() {
		id = VocabUtil.getInstance().createRandomUrl("salesAgreement");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	public java.util.List<TypedLiteral> getLabel() {
		return this.label;
	}

	public java.util.List<TypedLiteral> getComment() {
		return this.comment;
	}

	// getter and setter for generic property map
	@JsonAnyGetter
	public java.util.Map<String,Object> getProperties() {
		if (this.properties == null) return null;
		Iterator<String> iter = this.properties.keySet().iterator();
		java.util.Map<String,Object> resultset = new HashMap<String, Object>();
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
		} else if (value instanceof java.util.Map) {
			java.util.Map<String, Object> result_map = new HashMap<String, Object>();
			((java.util.Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	@JsonAnySetter
	public void setProperty(String property, Object value) {
	if (this.properties == null) this.properties = new java.util.HashMap<String,Object>();
	if (property.startsWith("@")) {return ;};
	this.properties.put(property, value) ;
	}
	// accessor method implementations as derived from information model



	final public 
	
	
	@JsonProperty("ids:permission")
	java.util.ArrayList<? extends Permission> getPermission() {
		return _permission;
	}
	final public void setPermission (java.util.ArrayList<? extends Permission> _permission_) {
		this._permission = _permission_;
	}

	final public 
	
	
	@JsonProperty("ids:prohibition")
	java.util.ArrayList<? extends Prohibition> getProhibition() {
		return _prohibition;
	}
	final public void setProhibition (java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this._prohibition = _prohibition_;
	}

	final public 
	
	
	@JsonProperty("ids:obligation")
	java.util.ArrayList<? extends Duty> getObligation() {
		return _obligation;
	}
	final public void setObligation (java.util.ArrayList<? extends Duty> _obligation_) {
		this._obligation = _obligation_;
	}

	final public 
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	
	@JsonProperty("ids:contractStart")
	XMLGregorianCalendar getContractStart() {
		return _contractStart;
	}
	final public void setContractStart (XMLGregorianCalendar _contractStart_) {
		this._contractStart = _contractStart_;
	}

	final public 
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	
	@JsonProperty("ids:contractEnd")
	XMLGregorianCalendar getContractEnd() {
		return _contractEnd;
	}
	final public void setContractEnd (XMLGregorianCalendar _contractEnd_) {
		this._contractEnd = _contractEnd_;
	}

	final public 
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	
	@JsonProperty("ids:contractDate")
	XMLGregorianCalendar getContractDate() {
		return _contractDate;
	}
	final public void setContractDate (XMLGregorianCalendar _contractDate_) {
		this._contractDate = _contractDate_;
	}

	final public 
	
	
	@JsonProperty("ids:provider")
	URI getProvider() {
		return _provider;
	}
	final public void setProvider (URI _provider_) {
		this._provider = _provider_;
	}

	final public 
	
	
	@JsonProperty("ids:consumer")
	URI getConsumer() {
		return _consumer;
	}
	final public void setConsumer (URI _consumer_) {
		this._consumer = _consumer_;
	}

	final public 
	
	
	@JsonProperty("ids:contractDocument")
	TextResource getContractDocument() {
		return _contractDocument;
	}
	final public void setContractDocument (TextResource _contractDocument_) {
		this._contractDocument = _contractDocument_;
	}

	final public 
	
	
	@JsonProperty("ids:contractAnnex")
	Resource getContractAnnex() {
		return _contractAnnex;
	}
	final public void setContractAnnex (Resource _contractAnnex_) {
		this._contractAnnex = _contractAnnex_;
	}


}
