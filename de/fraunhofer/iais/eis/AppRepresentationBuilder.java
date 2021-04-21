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

public class AppRepresentationBuilder {

	private AppRepresentationImpl appRepresentationImpl;

	public AppRepresentationBuilder() {
		appRepresentationImpl = new AppRepresentationImpl();
	}

	public AppRepresentationBuilder(URI id) {
		this();
		appRepresentationImpl.id = id;
	}

	/**
	* This function allows setting a value for _dataAppInformation
	* @param _dataAppInformation_ desired value to be set
	* @return Builder object with new value for _dataAppInformation
	*/
	final public AppRepresentationBuilder _dataAppInformation_(DataApp _dataAppInformation_) {
		this.appRepresentationImpl._dataAppInformation = _dataAppInformation_;
		return this;
	}


	/**
	* This function allows setting a value for _dataAppDistributionService
	* @param _dataAppDistributionService_ desired value to be set
	* @return Builder object with new value for _dataAppDistributionService
	*/
	final public AppRepresentationBuilder _dataAppDistributionService_(URI _dataAppDistributionService_) {
		this.appRepresentationImpl._dataAppDistributionService = _dataAppDistributionService_;
		return this;
	}


	/**
	* This function allows setting a value for _dataAppRuntimeEnvironment
	* @param _dataAppRuntimeEnvironment_ desired value to be set
	* @return Builder object with new value for _dataAppRuntimeEnvironment
	*/
	final public AppRepresentationBuilder _dataAppRuntimeEnvironment_(String _dataAppRuntimeEnvironment_) {
		this.appRepresentationImpl._dataAppRuntimeEnvironment = _dataAppRuntimeEnvironment_;
		return this;
	}



	/**
	* This function allows setting a value for _instance
	* @param _instance_ desired value to be set
	* @return Builder object with new value for _instance
	*/
	final public AppRepresentationBuilder _instance_(List<RepresentationInstance> _instance_) {
		this.appRepresentationImpl._instance = _instance_;
		return this;
	}


	/**
	* This function allows setting a value for _mediaType
	* @param _mediaType_ desired value to be set
	* @return Builder object with new value for _mediaType
	*/
	final public AppRepresentationBuilder _mediaType_(MediaType _mediaType_) {
		this.appRepresentationImpl._mediaType = _mediaType_;
		return this;
	}


	/**
	* This function allows setting a value for _representationStandard
	* @param _representationStandard_ desired value to be set
	* @return Builder object with new value for _representationStandard
	*/
	final public AppRepresentationBuilder _representationStandard_(URI _representationStandard_) {
		this.appRepresentationImpl._representationStandard = _representationStandard_;
		return this;
	}


	/**
	* This function allows setting a value for _language
	* @param _language_ desired value to be set
	* @return Builder object with new value for _language
	*/
	final public AppRepresentationBuilder _language_(Language _language_) {
		this.appRepresentationImpl._language = _language_;
		return this;
	}


	/**
	* This function allows setting a value for _created
	* @param _created_ desired value to be set
	* @return Builder object with new value for _created
	*/
	final public AppRepresentationBuilder _created_(XMLGregorianCalendar _created_) {
		this.appRepresentationImpl._created = _created_;
		return this;
	}


	/**
	* This function allows setting a value for _modified
	* @param _modified_ desired value to be set
	* @return Builder object with new value for _modified
	*/
	final public AppRepresentationBuilder _modified_(XMLGregorianCalendar _modified_) {
		this.appRepresentationImpl._modified = _modified_;
		return this;
	}




	/**
	* This function allows setting a value for _shapesGraph
	* @param _shapesGraph_ desired value to be set
	* @return Builder object with new value for _shapesGraph
	*/
	final public AppRepresentationBuilder _shapesGraph_(URI _shapesGraph_) {
		this.appRepresentationImpl._shapesGraph = _shapesGraph_;
		return this;
	}

	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public AppRepresentation build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(appRepresentationImpl);
		return appRepresentationImpl;
	}
}
