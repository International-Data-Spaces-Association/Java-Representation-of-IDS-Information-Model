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

public class SoftwareResourceBuilder {

	private SoftwareResourceImpl softwareResourceImpl;

	public SoftwareResourceBuilder() {
		softwareResourceImpl = new SoftwareResourceImpl();
	}

	public SoftwareResourceBuilder(URI id) {
		this();
		softwareResourceImpl.id = id;
	}


	/**
	* This function allows setting a value for _standardLicense
	* @param _standardLicense_ desired value to be set
	* @return Builder object with new value for _standardLicense
	*/
	final public SoftwareResourceBuilder _standardLicense_(URI _standardLicense_) {
		this.softwareResourceImpl._standardLicense = _standardLicense_;
		return this;
	}


	/**
	* This function allows setting a value for _customLicense
	* @param _customLicense_ desired value to be set
	* @return Builder object with new value for _customLicense
	*/
	final public SoftwareResourceBuilder _customLicense_(URI _customLicense_) {
		this.softwareResourceImpl._customLicense = _customLicense_;
		return this;
	}


	/**
	* This function allows setting a value for _resourcePart
	* @param _resourcePart_ desired value to be set
	* @return Builder object with new value for _resourcePart
	*/
	final public SoftwareResourceBuilder _resourcePart_(List<Resource> _resourcePart_) {
		this.softwareResourceImpl._resourcePart = _resourcePart_;
		return this;
	}


	/**
	* This function allows setting a value for _resourceEndpoint
	* @param _resourceEndpoint_ desired value to be set
	* @return Builder object with new value for _resourceEndpoint
	*/
	final public SoftwareResourceBuilder _resourceEndpoint_(List<ConnectorEndpoint> _resourceEndpoint_) {
		this.softwareResourceImpl._resourceEndpoint = _resourceEndpoint_;
		return this;
	}


	/**
	* This function allows setting a value for _contractOffer
	* @param _contractOffer_ desired value to be set
	* @return Builder object with new value for _contractOffer
	*/
	final public SoftwareResourceBuilder _contractOffer_(List<ContractOffer> _contractOffer_) {
		this.softwareResourceImpl._contractOffer = _contractOffer_;
		return this;
	}


	/**
	* This function allows setting a value for _publisher
	* @param _publisher_ desired value to be set
	* @return Builder object with new value for _publisher
	*/
	final public SoftwareResourceBuilder _publisher_(URI _publisher_) {
		this.softwareResourceImpl._publisher = _publisher_;
		return this;
	}


	/**
	* This function allows setting a value for _sovereign
	* @param _sovereign_ desired value to be set
	* @return Builder object with new value for _sovereign
	*/
	final public SoftwareResourceBuilder _sovereign_(URI _sovereign_) {
		this.softwareResourceImpl._sovereign = _sovereign_;
		return this;
	}


	/**
	* This function allows setting a value for _sample
	* @param _sample_ desired value to be set
	* @return Builder object with new value for _sample
	*/
	final public SoftwareResourceBuilder _sample_(List<Resource> _sample_) {
		this.softwareResourceImpl._sample = _sample_;
		return this;
	}


	/**
	* This function allows setting a value for _variant
	* @param _variant_ desired value to be set
	* @return Builder object with new value for _variant
	*/
	final public SoftwareResourceBuilder _variant_(Resource _variant_) {
		this.softwareResourceImpl._variant = _variant_;
		return this;
	}




	/**
	* This function allows setting a value for _contentType
	* @param _contentType_ desired value to be set
	* @return Builder object with new value for _contentType
	*/
	final public SoftwareResourceBuilder _contentType_(ContentType _contentType_) {
		this.softwareResourceImpl._contentType = _contentType_;
		return this;
	}


	/**
	* This function allows setting a value for _contentPart
	* @param _contentPart_ desired value to be set
	* @return Builder object with new value for _contentPart
	*/
	final public SoftwareResourceBuilder _contentPart_(List<DigitalContent> _contentPart_) {
		this.softwareResourceImpl._contentPart = _contentPart_;
		return this;
	}


	/**
	* This function allows setting a value for _representation
	* @param _representation_ desired value to be set
	* @return Builder object with new value for _representation
	*/
	final public SoftwareResourceBuilder _representation_(List<Representation> _representation_) {
		this.softwareResourceImpl._representation = _representation_;
		return this;
	}


	/**
	* This function allows setting a value for _defaultRepresentation
	* @param _defaultRepresentation_ desired value to be set
	* @return Builder object with new value for _defaultRepresentation
	*/
	final public SoftwareResourceBuilder _defaultRepresentation_(List<Representation> _defaultRepresentation_) {
		this.softwareResourceImpl._defaultRepresentation = _defaultRepresentation_;
		return this;
	}


	/**
	* This function allows setting a value for _theme
	* @param _theme_ desired value to be set
	* @return Builder object with new value for _theme
	*/
	final public SoftwareResourceBuilder _theme_(List<URI> _theme_) {
		this.softwareResourceImpl._theme = _theme_;
		return this;
	}


	/**
	* This function allows setting a value for _keyword
	* @param _keyword_ desired value to be set
	* @return Builder object with new value for _keyword
	*/
	final public SoftwareResourceBuilder _keyword_(List<TypedLiteral> _keyword_) {
		this.softwareResourceImpl._keyword = _keyword_;
		return this;
	}


	/**
	* This function allows setting a value for _temporalCoverage
	* @param _temporalCoverage_ desired value to be set
	* @return Builder object with new value for _temporalCoverage
	*/
	final public SoftwareResourceBuilder _temporalCoverage_(List<TemporalEntity> _temporalCoverage_) {
		this.softwareResourceImpl._temporalCoverage = _temporalCoverage_;
		return this;
	}


	/**
	* This function allows setting a value for _temporalResolution
	* @param _temporalResolution_ desired value to be set
	* @return Builder object with new value for _temporalResolution
	*/
	final public SoftwareResourceBuilder _temporalResolution_(Frequency _temporalResolution_) {
		this.softwareResourceImpl._temporalResolution = _temporalResolution_;
		return this;
	}


	/**
	* This function allows setting a value for _spatialCoverage
	* @param _spatialCoverage_ desired value to be set
	* @return Builder object with new value for _spatialCoverage
	*/
	final public SoftwareResourceBuilder _spatialCoverage_(List<Location> _spatialCoverage_) {
		this.softwareResourceImpl._spatialCoverage = _spatialCoverage_;
		return this;
	}


	/**
	* This function allows setting a value for _accrualPeriodicity
	* @param _accrualPeriodicity_ desired value to be set
	* @return Builder object with new value for _accrualPeriodicity
	*/
	final public SoftwareResourceBuilder _accrualPeriodicity_(Frequency _accrualPeriodicity_) {
		this.softwareResourceImpl._accrualPeriodicity = _accrualPeriodicity_;
		return this;
	}


	/**
	* This function allows setting a value for _contentStandard
	* @param _contentStandard_ desired value to be set
	* @return Builder object with new value for _contentStandard
	*/
	final public SoftwareResourceBuilder _contentStandard_(URI _contentStandard_) {
		this.softwareResourceImpl._contentStandard = _contentStandard_;
		return this;
	}


	/**
	* This function allows setting a value for _language
	* @param _language_ desired value to be set
	* @return Builder object with new value for _language
	*/
	final public SoftwareResourceBuilder _language_(List<Language> _language_) {
		this.softwareResourceImpl._language = _language_;
		return this;
	}


	/**
	* This function allows setting a value for _created
	* @param _created_ desired value to be set
	* @return Builder object with new value for _created
	*/
	final public SoftwareResourceBuilder _created_(XMLGregorianCalendar _created_) {
		this.softwareResourceImpl._created = _created_;
		return this;
	}


	/**
	* This function allows setting a value for _modified
	* @param _modified_ desired value to be set
	* @return Builder object with new value for _modified
	*/
	final public SoftwareResourceBuilder _modified_(XMLGregorianCalendar _modified_) {
		this.softwareResourceImpl._modified = _modified_;
		return this;
	}


	/**
	* This function allows setting a value for _title
	* @param _title_ desired value to be set
	* @return Builder object with new value for _title
	*/
	final public SoftwareResourceBuilder _title_(List<TypedLiteral> _title_) {
		this.softwareResourceImpl._title = _title_;
		return this;
	}


	/**
	* This function allows setting a value for _description
	* @param _description_ desired value to be set
	* @return Builder object with new value for _description
	*/
	final public SoftwareResourceBuilder _description_(List<TypedLiteral> _description_) {
		this.softwareResourceImpl._description = _description_;
		return this;
	}



	/**
	* This function allows setting a value for _shapesGraph
	* @param _shapesGraph_ desired value to be set
	* @return Builder object with new value for _shapesGraph
	*/
	final public SoftwareResourceBuilder _shapesGraph_(URI _shapesGraph_) {
		this.softwareResourceImpl._shapesGraph = _shapesGraph_;
		return this;
	}


	/**
	* This function allows setting a value for _version
	* @param _version_ desired value to be set
	* @return Builder object with new value for _version
	*/
	final public SoftwareResourceBuilder _version_(String _version_) {
		this.softwareResourceImpl._version = _version_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public SoftwareResource build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(softwareResourceImpl);
		return softwareResourceImpl;
	}
}
