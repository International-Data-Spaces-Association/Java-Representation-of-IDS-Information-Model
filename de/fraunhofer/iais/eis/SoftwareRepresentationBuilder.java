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

public class SoftwareRepresentationBuilder {

	private SoftwareRepresentationImpl softwareRepresentationImpl;

	public SoftwareRepresentationBuilder() {
		softwareRepresentationImpl = new SoftwareRepresentationImpl();
	}

	public SoftwareRepresentationBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		softwareRepresentationImpl.id = id;
	}


	final public SoftwareRepresentationBuilder _instance_(java.util.ArrayList<? extends RepresentationInstance> _instance_) {
		this.softwareRepresentationImpl._instance = _instance_;
		return this;
	}


	final public SoftwareRepresentationBuilder _mediaType_(MediaType _mediaType_) {
		this.softwareRepresentationImpl._mediaType = _mediaType_;
		return this;
	}


	final public SoftwareRepresentationBuilder _representationStandard_(URI _representationStandard_) {
		this.softwareRepresentationImpl._representationStandard = _representationStandard_;
		return this;
	}


	final public SoftwareRepresentationBuilder _language_(Language _language_) {
		this.softwareRepresentationImpl._language = _language_;
		return this;
	}


	final public SoftwareRepresentationBuilder _created_(XMLGregorianCalendar _created_) {
		this.softwareRepresentationImpl._created = _created_;
		return this;
	}


	final public SoftwareRepresentationBuilder _modified_(XMLGregorianCalendar _modified_) {
		this.softwareRepresentationImpl._modified = _modified_;
		return this;
	}




	final public SoftwareRepresentationBuilder _shapesGraph_(URI _shapesGraph_) {
		this.softwareRepresentationImpl._shapesGraph = _shapesGraph_;
		return this;
	}


	public final SoftwareRepresentation build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(softwareRepresentationImpl);
		return softwareRepresentationImpl;
	}
}
