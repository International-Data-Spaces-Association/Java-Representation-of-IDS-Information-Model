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

public class ComponentCertificationBuilder {

	private ComponentCertificationImpl componentCertificationImpl;

	public ComponentCertificationBuilder() {
		componentCertificationImpl = new ComponentCertificationImpl();
	}

	public ComponentCertificationBuilder(URI id) {
		this();
		componentCertificationImpl.id = id;
	}


	/**
	* This function allows setting a value for _certificationLevel
	* @param _certificationLevel_ desired value to be set
	* @return Builder object with new value for _certificationLevel
	*/
	final public ComponentCertificationBuilder _certificationLevel_(CertificationLevel _certificationLevel_) {
		this.componentCertificationImpl._certificationLevel = _certificationLevel_;
		return this;
	}


	/**
	* This function allows setting a value for _lastValidDate
	* @param _lastValidDate_ desired value to be set
	* @return Builder object with new value for _lastValidDate
	*/
	final public ComponentCertificationBuilder _lastValidDate_(XMLGregorianCalendar _lastValidDate_) {
		this.componentCertificationImpl._lastValidDate = _lastValidDate_;
		return this;
	}


	/**
	* This function allows setting a value for _evaluationFacility
	* @param _evaluationFacility_ desired value to be set
	* @return Builder object with new value for _evaluationFacility
	*/
	final public ComponentCertificationBuilder _evaluationFacility_(EvaluationFacility _evaluationFacility_) {
		this.componentCertificationImpl._evaluationFacility = _evaluationFacility_;
		return this;
	}


	/**
	* This function allows setting a value for _version
	* @param _version_ desired value to be set
	* @return Builder object with new value for _version
	*/
	final public ComponentCertificationBuilder _version_(String _version_) {
		this.componentCertificationImpl._version = _version_;
		return this;
	}


	/**
	* This function allows setting a value for _title
	* @param _title_ desired value to be set
	* @return Builder object with new value for _title
	*/
	final public ComponentCertificationBuilder _title_(List<TypedLiteral> _title_) {
		this.componentCertificationImpl._title = _title_;
		return this;
	}


	/**
	* This function allows setting a value for _description
	* @param _description_ desired value to be set
	* @return Builder object with new value for _description
	*/
	final public ComponentCertificationBuilder _description_(List<TypedLiteral> _description_) {
		this.componentCertificationImpl._description = _description_;
		return this;
	}

	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public ComponentCertification build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(componentCertificationImpl);
		return componentCertificationImpl;
	}
}
