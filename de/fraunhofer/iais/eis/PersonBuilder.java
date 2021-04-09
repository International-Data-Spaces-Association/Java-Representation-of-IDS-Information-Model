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

public class PersonBuilder {

	private PersonImpl personImpl;

	public PersonBuilder() {
		personImpl = new PersonImpl();
	}

	public PersonBuilder(URI id) {
		this();
		personImpl.id = id;
	}

	/**
	* This function allows setting a value for phoneNumber
	* @param _phoneNumber_ desired value to be set
	* @return Builder object with new value for phoneNumber
	*/
	final public PersonBuilder _phoneNumber_(ArrayList<? extends String> _phoneNumber_) {
		this.personImpl._phoneNumber = _phoneNumber_;
		return this;
	}


	/**
	* This function allows setting a value for emailAddress
	* @param _emailAddress_ desired value to be set
	* @return Builder object with new value for emailAddress
	*/
	final public PersonBuilder _emailAddress_(ArrayList<? extends String> _emailAddress_) {
		this.personImpl._emailAddress = _emailAddress_;
		return this;
	}


	/**
	* This function allows setting a value for familyName
	* @param _familyName_ desired value to be set
	* @return Builder object with new value for familyName
	*/
	final public PersonBuilder _familyName_(String _familyName_) {
		this.personImpl._familyName = _familyName_;
		return this;
	}


	/**
	* This function allows setting a value for givenName
	* @param _givenName_ desired value to be set
	* @return Builder object with new value for givenName
	*/
	final public PersonBuilder _givenName_(String _givenName_) {
		this.personImpl._givenName = _givenName_;
		return this;
	}


	/**
	* This function allows setting a value for homepage
	* @param _homepage_ desired value to be set
	* @return Builder object with new value for homepage
	*/
	final public PersonBuilder _homepage_(String _homepage_) {
		this.personImpl._homepage = _homepage_;
		return this;
	}

	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public Person build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(personImpl);
		return personImpl;
	}
}
