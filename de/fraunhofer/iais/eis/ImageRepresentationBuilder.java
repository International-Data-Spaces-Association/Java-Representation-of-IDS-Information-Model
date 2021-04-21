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

public class ImageRepresentationBuilder {

	private ImageRepresentationImpl imageRepresentationImpl;

	public ImageRepresentationBuilder() {
		imageRepresentationImpl = new ImageRepresentationImpl();
	}

	public ImageRepresentationBuilder(URI id) {
		this();
		imageRepresentationImpl.id = id;
	}

	/**
	* This function allows setting a value for _width
	* @param _width_ desired value to be set
	* @return Builder object with new value for _width
	*/
	final public ImageRepresentationBuilder _width_(java.math.BigDecimal _width_) {
		this.imageRepresentationImpl._width = _width_;
		return this;
	}


	/**
	* This function allows setting a value for _height
	* @param _height_ desired value to be set
	* @return Builder object with new value for _height
	*/
	final public ImageRepresentationBuilder _height_(java.math.BigDecimal _height_) {
		this.imageRepresentationImpl._height = _height_;
		return this;
	}


	/**
	* This function allows setting a value for _instance
	* @param _instance_ desired value to be set
	* @return Builder object with new value for _instance
	*/
	final public ImageRepresentationBuilder _instance_(List<RepresentationInstance> _instance_) {
		this.imageRepresentationImpl._instance = _instance_;
		return this;
	}


	/**
	* This function allows setting a value for _mediaType
	* @param _mediaType_ desired value to be set
	* @return Builder object with new value for _mediaType
	*/
	final public ImageRepresentationBuilder _mediaType_(MediaType _mediaType_) {
		this.imageRepresentationImpl._mediaType = _mediaType_;
		return this;
	}


	/**
	* This function allows setting a value for _representationStandard
	* @param _representationStandard_ desired value to be set
	* @return Builder object with new value for _representationStandard
	*/
	final public ImageRepresentationBuilder _representationStandard_(URI _representationStandard_) {
		this.imageRepresentationImpl._representationStandard = _representationStandard_;
		return this;
	}


	/**
	* This function allows setting a value for _language
	* @param _language_ desired value to be set
	* @return Builder object with new value for _language
	*/
	final public ImageRepresentationBuilder _language_(Language _language_) {
		this.imageRepresentationImpl._language = _language_;
		return this;
	}


	/**
	* This function allows setting a value for _created
	* @param _created_ desired value to be set
	* @return Builder object with new value for _created
	*/
	final public ImageRepresentationBuilder _created_(XMLGregorianCalendar _created_) {
		this.imageRepresentationImpl._created = _created_;
		return this;
	}


	/**
	* This function allows setting a value for _modified
	* @param _modified_ desired value to be set
	* @return Builder object with new value for _modified
	*/
	final public ImageRepresentationBuilder _modified_(XMLGregorianCalendar _modified_) {
		this.imageRepresentationImpl._modified = _modified_;
		return this;
	}




	/**
	* This function allows setting a value for _shapesGraph
	* @param _shapesGraph_ desired value to be set
	* @return Builder object with new value for _shapesGraph
	*/
	final public ImageRepresentationBuilder _shapesGraph_(URI _shapesGraph_) {
		this.imageRepresentationImpl._shapesGraph = _shapesGraph_;
		return this;
	}

	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public ImageRepresentation build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(imageRepresentationImpl);
		return imageRepresentationImpl;
	}
}
