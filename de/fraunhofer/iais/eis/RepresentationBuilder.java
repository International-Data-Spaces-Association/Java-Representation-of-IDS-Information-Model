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

public class RepresentationBuilder {

	private RepresentationImpl representationImpl;

	public RepresentationBuilder() {
		representationImpl = new RepresentationImpl();
	}

	public RepresentationBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		representationImpl.id = id;
	}

	final public RepresentationBuilder _instance_(java.util.ArrayList<? extends RepresentationInstance> _instance_) {
		this.representationImpl._instance = _instance_;
		return this;
	}


	final public RepresentationBuilder _mediaType_(MediaType _mediaType_) {
		this.representationImpl._mediaType = _mediaType_;
		return this;
	}


	final public RepresentationBuilder _representationStandard_(URI _representationStandard_) {
		this.representationImpl._representationStandard = _representationStandard_;
		return this;
	}


	final public RepresentationBuilder _language_(Language _language_) {
		this.representationImpl._language = _language_;
		return this;
	}


	final public RepresentationBuilder _created_(XMLGregorianCalendar _created_) {
		this.representationImpl._created = _created_;
		return this;
	}


	final public RepresentationBuilder _modified_(XMLGregorianCalendar _modified_) {
		this.representationImpl._modified = _modified_;
		return this;
	}




	final public RepresentationBuilder _shapesGraph_(URI _shapesGraph_) {
		this.representationImpl._shapesGraph = _shapesGraph_;
		return this;
	}


	public final Representation build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(representationImpl);
		return representationImpl;
	}
}
