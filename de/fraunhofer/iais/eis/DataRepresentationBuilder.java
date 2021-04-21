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

public class DataRepresentationBuilder {

	private DataRepresentationImpl dataRepresentationImpl;

	public DataRepresentationBuilder() {
		dataRepresentationImpl = new DataRepresentationImpl();
	}

	public DataRepresentationBuilder(URI id) {
		this();
		dataRepresentationImpl.id = id;
	}

	/**
	* This function allows setting a value for _dataType
	* @param _dataType_ desired value to be set
	* @return Builder object with new value for _dataType
	*/
	final public DataRepresentationBuilder _dataType_(URI _dataType_) {
		this.dataRepresentationImpl._dataType = _dataType_;
		return this;
	}


	/**
	* This function allows setting a value for _dataTypeSchema
	* @param _dataTypeSchema_ desired value to be set
	* @return Builder object with new value for _dataTypeSchema
	*/
	final public DataRepresentationBuilder _dataTypeSchema_(Resource _dataTypeSchema_) {
		this.dataRepresentationImpl._dataTypeSchema = _dataTypeSchema_;
		return this;
	}


	/**
	* This function allows setting a value for _instance
	* @param _instance_ desired value to be set
	* @return Builder object with new value for _instance
	*/
	final public DataRepresentationBuilder _instance_(List<RepresentationInstance> _instance_) {
		this.dataRepresentationImpl._instance = _instance_;
		return this;
	}


	/**
	* This function allows setting a value for _mediaType
	* @param _mediaType_ desired value to be set
	* @return Builder object with new value for _mediaType
	*/
	final public DataRepresentationBuilder _mediaType_(MediaType _mediaType_) {
		this.dataRepresentationImpl._mediaType = _mediaType_;
		return this;
	}


	/**
	* This function allows setting a value for _representationStandard
	* @param _representationStandard_ desired value to be set
	* @return Builder object with new value for _representationStandard
	*/
	final public DataRepresentationBuilder _representationStandard_(URI _representationStandard_) {
		this.dataRepresentationImpl._representationStandard = _representationStandard_;
		return this;
	}


	/**
	* This function allows setting a value for _language
	* @param _language_ desired value to be set
	* @return Builder object with new value for _language
	*/
	final public DataRepresentationBuilder _language_(Language _language_) {
		this.dataRepresentationImpl._language = _language_;
		return this;
	}


	/**
	* This function allows setting a value for _created
	* @param _created_ desired value to be set
	* @return Builder object with new value for _created
	*/
	final public DataRepresentationBuilder _created_(XMLGregorianCalendar _created_) {
		this.dataRepresentationImpl._created = _created_;
		return this;
	}


	/**
	* This function allows setting a value for _modified
	* @param _modified_ desired value to be set
	* @return Builder object with new value for _modified
	*/
	final public DataRepresentationBuilder _modified_(XMLGregorianCalendar _modified_) {
		this.dataRepresentationImpl._modified = _modified_;
		return this;
	}




	/**
	* This function allows setting a value for _shapesGraph
	* @param _shapesGraph_ desired value to be set
	* @return Builder object with new value for _shapesGraph
	*/
	final public DataRepresentationBuilder _shapesGraph_(URI _shapesGraph_) {
		this.dataRepresentationImpl._shapesGraph = _shapesGraph_;
		return this;
	}

	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public DataRepresentation build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(dataRepresentationImpl);
		return dataRepresentationImpl;
	}
}
