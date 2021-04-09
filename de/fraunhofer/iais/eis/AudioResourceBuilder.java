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

public class AudioResourceBuilder {

	private AudioResourceImpl audioResourceImpl;

	public AudioResourceBuilder() {
		audioResourceImpl = new AudioResourceImpl();
	}

	public AudioResourceBuilder(URI id) {
		this();
		audioResourceImpl.id = id;
	}


	/**
	* This function allows setting a value for standardLicense
	* @param _standardLicense_ desired value to be set
	* @return Builder object with new value for standardLicense
	*/
	final public AudioResourceBuilder _standardLicense_(URI _standardLicense_) {
		this.audioResourceImpl._standardLicense = _standardLicense_;
		return this;
	}


	/**
	* This function allows setting a value for customLicense
	* @param _customLicense_ desired value to be set
	* @return Builder object with new value for customLicense
	*/
	final public AudioResourceBuilder _customLicense_(URI _customLicense_) {
		this.audioResourceImpl._customLicense = _customLicense_;
		return this;
	}


	/**
	* This function allows setting a value for resourceEndpoint
	* @param _resourceEndpoint_ desired value to be set
	* @return Builder object with new value for resourceEndpoint
	*/
	final public AudioResourceBuilder _resourceEndpoint_(ArrayList<? extends ConnectorEndpoint> _resourceEndpoint_) {
		this.audioResourceImpl._resourceEndpoint = _resourceEndpoint_;
		return this;
	}


	/**
	* This function allows setting a value for resourcePart
	* @param _resourcePart_ desired value to be set
	* @return Builder object with new value for resourcePart
	*/
	final public AudioResourceBuilder _resourcePart_(ArrayList<? extends Resource> _resourcePart_) {
		this.audioResourceImpl._resourcePart = _resourcePart_;
		return this;
	}


	/**
	* This function allows setting a value for contractOffer
	* @param _contractOffer_ desired value to be set
	* @return Builder object with new value for contractOffer
	*/
	final public AudioResourceBuilder _contractOffer_(ArrayList<? extends ContractOffer> _contractOffer_) {
		this.audioResourceImpl._contractOffer = _contractOffer_;
		return this;
	}


	/**
	* This function allows setting a value for sample
	* @param _sample_ desired value to be set
	* @return Builder object with new value for sample
	*/
	final public AudioResourceBuilder _sample_(ArrayList<? extends Resource> _sample_) {
		this.audioResourceImpl._sample = _sample_;
		return this;
	}


	/**
	* This function allows setting a value for publisher
	* @param _publisher_ desired value to be set
	* @return Builder object with new value for publisher
	*/
	final public AudioResourceBuilder _publisher_(URI _publisher_) {
		this.audioResourceImpl._publisher = _publisher_;
		return this;
	}


	/**
	* This function allows setting a value for sovereign
	* @param _sovereign_ desired value to be set
	* @return Builder object with new value for sovereign
	*/
	final public AudioResourceBuilder _sovereign_(URI _sovereign_) {
		this.audioResourceImpl._sovereign = _sovereign_;
		return this;
	}


	/**
	* This function allows setting a value for variant
	* @param _variant_ desired value to be set
	* @return Builder object with new value for variant
	*/
	final public AudioResourceBuilder _variant_(Resource _variant_) {
		this.audioResourceImpl._variant = _variant_;
		return this;
	}




	/**
	* This function allows setting a value for contentPart
	* @param _contentPart_ desired value to be set
	* @return Builder object with new value for contentPart
	*/
	final public AudioResourceBuilder _contentPart_(ArrayList<? extends DigitalContent> _contentPart_) {
		this.audioResourceImpl._contentPart = _contentPart_;
		return this;
	}


	/**
	* This function allows setting a value for spatialCoverage
	* @param _spatialCoverage_ desired value to be set
	* @return Builder object with new value for spatialCoverage
	*/
	final public AudioResourceBuilder _spatialCoverage_(ArrayList<? extends Location> _spatialCoverage_) {
		this.audioResourceImpl._spatialCoverage = _spatialCoverage_;
		return this;
	}


	/**
	* This function allows setting a value for temporalCoverage
	* @param _temporalCoverage_ desired value to be set
	* @return Builder object with new value for temporalCoverage
	*/
	final public AudioResourceBuilder _temporalCoverage_(ArrayList<? extends TemporalEntity> _temporalCoverage_) {
		this.audioResourceImpl._temporalCoverage = _temporalCoverage_;
		return this;
	}


	/**
	* This function allows setting a value for theme
	* @param _theme_ desired value to be set
	* @return Builder object with new value for theme
	*/
	final public AudioResourceBuilder _theme_(ArrayList<? extends URI> _theme_) {
		this.audioResourceImpl._theme = _theme_;
		return this;
	}


	/**
	* This function allows setting a value for keyword
	* @param _keyword_ desired value to be set
	* @return Builder object with new value for keyword
	*/
	final public AudioResourceBuilder _keyword_(ArrayList<? extends TypedLiteral> _keyword_) {
		this.audioResourceImpl._keyword = _keyword_;
		return this;
	}


	/**
	* This function allows setting a value for representation
	* @param _representation_ desired value to be set
	* @return Builder object with new value for representation
	*/
	final public AudioResourceBuilder _representation_(ArrayList<? extends Representation> _representation_) {
		this.audioResourceImpl._representation = _representation_;
		return this;
	}


	/**
	* This function allows setting a value for contentType
	* @param _contentType_ desired value to be set
	* @return Builder object with new value for contentType
	*/
	final public AudioResourceBuilder _contentType_(ContentType _contentType_) {
		this.audioResourceImpl._contentType = _contentType_;
		return this;
	}


	/**
	* This function allows setting a value for defaultRepresentation
	* @param _defaultRepresentation_ desired value to be set
	* @return Builder object with new value for defaultRepresentation
	*/
	final public AudioResourceBuilder _defaultRepresentation_(ArrayList<? extends Representation> _defaultRepresentation_) {
		this.audioResourceImpl._defaultRepresentation = _defaultRepresentation_;
		return this;
	}


	/**
	* This function allows setting a value for temporalResolution
	* @param _temporalResolution_ desired value to be set
	* @return Builder object with new value for temporalResolution
	*/
	final public AudioResourceBuilder _temporalResolution_(Frequency _temporalResolution_) {
		this.audioResourceImpl._temporalResolution = _temporalResolution_;
		return this;
	}


	/**
	* This function allows setting a value for accrualPeriodicity
	* @param _accrualPeriodicity_ desired value to be set
	* @return Builder object with new value for accrualPeriodicity
	*/
	final public AudioResourceBuilder _accrualPeriodicity_(Frequency _accrualPeriodicity_) {
		this.audioResourceImpl._accrualPeriodicity = _accrualPeriodicity_;
		return this;
	}


	/**
	* This function allows setting a value for contentStandard
	* @param _contentStandard_ desired value to be set
	* @return Builder object with new value for contentStandard
	*/
	final public AudioResourceBuilder _contentStandard_(URI _contentStandard_) {
		this.audioResourceImpl._contentStandard = _contentStandard_;
		return this;
	}


	/**
	* This function allows setting a value for language
	* @param _language_ desired value to be set
	* @return Builder object with new value for language
	*/
	final public AudioResourceBuilder _language_(ArrayList<? extends Language> _language_) {
		this.audioResourceImpl._language = _language_;
		return this;
	}


	/**
	* This function allows setting a value for created
	* @param _created_ desired value to be set
	* @return Builder object with new value for created
	*/
	final public AudioResourceBuilder _created_(XMLGregorianCalendar _created_) {
		this.audioResourceImpl._created = _created_;
		return this;
	}


	/**
	* This function allows setting a value for modified
	* @param _modified_ desired value to be set
	* @return Builder object with new value for modified
	*/
	final public AudioResourceBuilder _modified_(XMLGregorianCalendar _modified_) {
		this.audioResourceImpl._modified = _modified_;
		return this;
	}


	/**
	* This function allows setting a value for title
	* @param _title_ desired value to be set
	* @return Builder object with new value for title
	*/
	final public AudioResourceBuilder _title_(ArrayList<? extends TypedLiteral> _title_) {
		this.audioResourceImpl._title = _title_;
		return this;
	}


	/**
	* This function allows setting a value for description
	* @param _description_ desired value to be set
	* @return Builder object with new value for description
	*/
	final public AudioResourceBuilder _description_(ArrayList<? extends TypedLiteral> _description_) {
		this.audioResourceImpl._description = _description_;
		return this;
	}



	/**
	* This function allows setting a value for shapesGraph
	* @param _shapesGraph_ desired value to be set
	* @return Builder object with new value for shapesGraph
	*/
	final public AudioResourceBuilder _shapesGraph_(URI _shapesGraph_) {
		this.audioResourceImpl._shapesGraph = _shapesGraph_;
		return this;
	}


	/**
	* This function allows setting a value for version
	* @param _version_ desired value to be set
	* @return Builder object with new value for version
	*/
	final public AudioResourceBuilder _version_(String _version_) {
		this.audioResourceImpl._version = _version_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public AudioResource build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(audioResourceImpl);
		return audioResourceImpl;
	}
}
