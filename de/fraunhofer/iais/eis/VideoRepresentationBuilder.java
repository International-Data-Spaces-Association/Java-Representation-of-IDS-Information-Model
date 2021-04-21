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

public class VideoRepresentationBuilder {

	private VideoRepresentationImpl videoRepresentationImpl;

	public VideoRepresentationBuilder() {
		videoRepresentationImpl = new VideoRepresentationImpl();
	}

	public VideoRepresentationBuilder(URI id) {
		this();
		videoRepresentationImpl.id = id;
	}

	/**
	* This function allows setting a value for _frameRate
	* @param _frameRate_ desired value to be set
	* @return Builder object with new value for _frameRate
	*/
	final public VideoRepresentationBuilder _frameRate_(java.math.BigDecimal _frameRate_) {
		this.videoRepresentationImpl._frameRate = _frameRate_;
		return this;
	}


	/**
	* This function allows setting a value for _instance
	* @param _instance_ desired value to be set
	* @return Builder object with new value for _instance
	*/
	final public VideoRepresentationBuilder _instance_(List<RepresentationInstance> _instance_) {
		this.videoRepresentationImpl._instance = _instance_;
		return this;
	}


	/**
	* This function allows setting a value for _mediaType
	* @param _mediaType_ desired value to be set
	* @return Builder object with new value for _mediaType
	*/
	final public VideoRepresentationBuilder _mediaType_(MediaType _mediaType_) {
		this.videoRepresentationImpl._mediaType = _mediaType_;
		return this;
	}


	/**
	* This function allows setting a value for _representationStandard
	* @param _representationStandard_ desired value to be set
	* @return Builder object with new value for _representationStandard
	*/
	final public VideoRepresentationBuilder _representationStandard_(URI _representationStandard_) {
		this.videoRepresentationImpl._representationStandard = _representationStandard_;
		return this;
	}


	/**
	* This function allows setting a value for _language
	* @param _language_ desired value to be set
	* @return Builder object with new value for _language
	*/
	final public VideoRepresentationBuilder _language_(Language _language_) {
		this.videoRepresentationImpl._language = _language_;
		return this;
	}


	/**
	* This function allows setting a value for _created
	* @param _created_ desired value to be set
	* @return Builder object with new value for _created
	*/
	final public VideoRepresentationBuilder _created_(XMLGregorianCalendar _created_) {
		this.videoRepresentationImpl._created = _created_;
		return this;
	}


	/**
	* This function allows setting a value for _modified
	* @param _modified_ desired value to be set
	* @return Builder object with new value for _modified
	*/
	final public VideoRepresentationBuilder _modified_(XMLGregorianCalendar _modified_) {
		this.videoRepresentationImpl._modified = _modified_;
		return this;
	}




	/**
	* This function allows setting a value for _shapesGraph
	* @param _shapesGraph_ desired value to be set
	* @return Builder object with new value for _shapesGraph
	*/
	final public VideoRepresentationBuilder _shapesGraph_(URI _shapesGraph_) {
		this.videoRepresentationImpl._shapesGraph = _shapesGraph_;
		return this;
	}

	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public VideoRepresentation build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(videoRepresentationImpl);
		return videoRepresentationImpl;
	}
}
