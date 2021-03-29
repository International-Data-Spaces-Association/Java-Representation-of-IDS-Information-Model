package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.*;
import javax.validation.constraints.*;
import java.util.Arrays;
import java.io.Serializable;

import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

public class DataRepresentationBuilder {

	private DataRepresentationImpl dataRepresentationImpl;

	public DataRepresentationBuilder() {
		dataRepresentationImpl = new DataRepresentationImpl();
	}

	public DataRepresentationBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		dataRepresentationImpl.id = id;
	}

	final public DataRepresentationBuilder _dataType_(URI _dataType_) {
		this.dataRepresentationImpl._dataType = _dataType_;
		return this;
	}


	final public DataRepresentationBuilder _dataTypeSchema_(Resource _dataTypeSchema_) {
		this.dataRepresentationImpl._dataTypeSchema = _dataTypeSchema_;
		return this;
	}


	final public DataRepresentationBuilder _instance_(java.util.ArrayList<? extends RepresentationInstance> _instance_) {
		this.dataRepresentationImpl._instance = _instance_;
		return this;
	}


	final public DataRepresentationBuilder _mediaType_(MediaType _mediaType_) {
		this.dataRepresentationImpl._mediaType = _mediaType_;
		return this;
	}


	final public DataRepresentationBuilder _representationStandard_(URI _representationStandard_) {
		this.dataRepresentationImpl._representationStandard = _representationStandard_;
		return this;
	}


	final public DataRepresentationBuilder _language_(Language _language_) {
		this.dataRepresentationImpl._language = _language_;
		return this;
	}


	final public DataRepresentationBuilder _created_(XMLGregorianCalendar _created_) {
		this.dataRepresentationImpl._created = _created_;
		return this;
	}


	final public DataRepresentationBuilder _modified_(XMLGregorianCalendar _modified_) {
		this.dataRepresentationImpl._modified = _modified_;
		return this;
	}




	final public DataRepresentationBuilder _shapesGraph_(URI _shapesGraph_) {
		this.dataRepresentationImpl._shapesGraph = _shapesGraph_;
		return this;
	}


	public final DataRepresentation build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(dataRepresentationImpl);
		return dataRepresentationImpl;
	}
}
