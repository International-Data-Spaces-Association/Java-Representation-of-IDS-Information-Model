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

public class AssetCollectionBuilder {

	private AssetCollectionImpl assetCollectionImpl;

	public AssetCollectionBuilder() {
		assetCollectionImpl = new AssetCollectionImpl();
	}

	public AssetCollectionBuilder(URI id) {
		this();
		assetCollectionImpl.id = id;
	}

	/**
	* This function allows setting a value for _assetSource
	* @param _assetSource_ desired value to be set
	* @return Builder object with new value for _assetSource
	*/
	final public AssetCollectionBuilder _assetSource_(URI _assetSource_) {
		this.assetCollectionImpl._assetSource = _assetSource_;
		return this;
	}


	/**
	* This function allows setting a value for _assetRefinement
	* @param _assetRefinement_ desired value to be set
	* @return Builder object with new value for _assetRefinement
	*/
	final public AssetCollectionBuilder _assetRefinement_(AbstractConstraint _assetRefinement_) {
		this.assetCollectionImpl._assetRefinement = _assetRefinement_;
		return this;
	}



	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public AssetCollection build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(assetCollectionImpl);
		return assetCollectionImpl;
	}
}
