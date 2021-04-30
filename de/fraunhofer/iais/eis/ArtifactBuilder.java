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

public class ArtifactBuilder {

	private ArtifactImpl artifactImpl;

	public ArtifactBuilder() {
		artifactImpl = new ArtifactImpl();
	}

	public ArtifactBuilder(URI id) {
		this();
		artifactImpl.id = id;
	}

	/**
	* This function allows setting a value for _byteSize
	* @param _byteSize_ desired value to be set
	* @return Builder object with new value for _byteSize
	*/
	final public ArtifactBuilder _byteSize_(BigInteger _byteSize_) {
		this.artifactImpl._byteSize = _byteSize_;
		return this;
	}


	/**
	* This function allows setting a value for _fileName
	* @param _fileName_ desired value to be set
	* @return Builder object with new value for _fileName
	*/
	final public ArtifactBuilder _fileName_(String _fileName_) {
		this.artifactImpl._fileName = _fileName_;
		return this;
	}


	/**
	* This function allows setting a value for _creationDate
	* @param _creationDate_ desired value to be set
	* @return Builder object with new value for _creationDate
	*/
	final public ArtifactBuilder _creationDate_(XMLGregorianCalendar _creationDate_) {
		this.artifactImpl._creationDate = _creationDate_;
		return this;
	}


	/**
	* This function allows setting a value for _checkSum
	* @param _checkSum_ desired value to be set
	* @return Builder object with new value for _checkSum
	*/
	final public ArtifactBuilder _checkSum_(String _checkSum_) {
		this.artifactImpl._checkSum = _checkSum_;
		return this;
	}


	/**
	* This function allows setting a value for _duration
	* @param _duration_ desired value to be set
	* @return Builder object with new value for _duration
	*/
	final public ArtifactBuilder _duration_(java.math.BigDecimal _duration_) {
		this.artifactImpl._duration = _duration_;
		return this;
	}



	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public Artifact build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(artifactImpl);
		return artifactImpl;
	}
}
