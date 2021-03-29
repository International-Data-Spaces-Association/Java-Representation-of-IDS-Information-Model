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

public class AudioRepresentationBuilder {

	private AudioRepresentationImpl audioRepresentationImpl;

	public AudioRepresentationBuilder() {
		audioRepresentationImpl = new AudioRepresentationImpl();
	}

	public AudioRepresentationBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		audioRepresentationImpl.id = id;
	}

	final public AudioRepresentationBuilder _samplingRate_(java.math.BigDecimal _samplingRate_) {
		this.audioRepresentationImpl._samplingRate = _samplingRate_;
		return this;
	}


	final public AudioRepresentationBuilder _instance_(java.util.ArrayList<? extends RepresentationInstance> _instance_) {
		this.audioRepresentationImpl._instance = _instance_;
		return this;
	}


	final public AudioRepresentationBuilder _mediaType_(MediaType _mediaType_) {
		this.audioRepresentationImpl._mediaType = _mediaType_;
		return this;
	}


	final public AudioRepresentationBuilder _representationStandard_(URI _representationStandard_) {
		this.audioRepresentationImpl._representationStandard = _representationStandard_;
		return this;
	}


	final public AudioRepresentationBuilder _language_(Language _language_) {
		this.audioRepresentationImpl._language = _language_;
		return this;
	}


	final public AudioRepresentationBuilder _created_(XMLGregorianCalendar _created_) {
		this.audioRepresentationImpl._created = _created_;
		return this;
	}


	final public AudioRepresentationBuilder _modified_(XMLGregorianCalendar _modified_) {
		this.audioRepresentationImpl._modified = _modified_;
		return this;
	}




	final public AudioRepresentationBuilder _shapesGraph_(URI _shapesGraph_) {
		this.audioRepresentationImpl._shapesGraph = _shapesGraph_;
		return this;
	}


	public final AudioRepresentation build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(audioRepresentationImpl);
		return audioRepresentationImpl;
	}
}
