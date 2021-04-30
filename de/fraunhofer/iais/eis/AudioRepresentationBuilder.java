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

public class AudioRepresentationBuilder {

	private AudioRepresentationImpl audioRepresentationImpl;

	public AudioRepresentationBuilder() {
		audioRepresentationImpl = new AudioRepresentationImpl();
	}

	public AudioRepresentationBuilder(URI id) {
		this();
		audioRepresentationImpl.id = id;
	}

	/**
	* This function allows setting a value for _samplingRate
	* @param _samplingRate_ desired value to be set
	* @return Builder object with new value for _samplingRate
	*/
	final public AudioRepresentationBuilder _samplingRate_(java.math.BigDecimal _samplingRate_) {
		this.audioRepresentationImpl._samplingRate = _samplingRate_;
		return this;
	}


	/**
	* This function allows setting a value for _instance
	* @param _instance_ desired value to be set
	* @return Builder object with new value for _instance
	*/
	final public AudioRepresentationBuilder _instance_(List<RepresentationInstance> _instance_) {
		this.audioRepresentationImpl._instance = _instance_;
		return this;
	}


	/**
	* This function allows setting a value for _mediaType
	* @param _mediaType_ desired value to be set
	* @return Builder object with new value for _mediaType
	*/
	final public AudioRepresentationBuilder _mediaType_(MediaType _mediaType_) {
		this.audioRepresentationImpl._mediaType = _mediaType_;
		return this;
	}


	/**
	* This function allows setting a value for _representationStandard
	* @param _representationStandard_ desired value to be set
	* @return Builder object with new value for _representationStandard
	*/
	final public AudioRepresentationBuilder _representationStandard_(URI _representationStandard_) {
		this.audioRepresentationImpl._representationStandard = _representationStandard_;
		return this;
	}


	/**
	* This function allows setting a value for _language
	* @param _language_ desired value to be set
	* @return Builder object with new value for _language
	*/
	final public AudioRepresentationBuilder _language_(Language _language_) {
		this.audioRepresentationImpl._language = _language_;
		return this;
	}


	/**
	* This function allows setting a value for _created
	* @param _created_ desired value to be set
	* @return Builder object with new value for _created
	*/
	final public AudioRepresentationBuilder _created_(XMLGregorianCalendar _created_) {
		this.audioRepresentationImpl._created = _created_;
		return this;
	}


	/**
	* This function allows setting a value for _modified
	* @param _modified_ desired value to be set
	* @return Builder object with new value for _modified
	*/
	final public AudioRepresentationBuilder _modified_(XMLGregorianCalendar _modified_) {
		this.audioRepresentationImpl._modified = _modified_;
		return this;
	}




	/**
	* This function allows setting a value for _shapesGraph
	* @param _shapesGraph_ desired value to be set
	* @return Builder object with new value for _shapesGraph
	*/
	final public AudioRepresentationBuilder _shapesGraph_(URI _shapesGraph_) {
		this.audioRepresentationImpl._shapesGraph = _shapesGraph_;
		return this;
	}

	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public AudioRepresentation build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(audioRepresentationImpl);
		return audioRepresentationImpl;
	}
}
