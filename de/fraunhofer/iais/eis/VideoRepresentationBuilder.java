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

public class VideoRepresentationBuilder {

	private VideoRepresentationImpl videoRepresentationImpl;

	public VideoRepresentationBuilder() {
		videoRepresentationImpl = new VideoRepresentationImpl();
	}

	public VideoRepresentationBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		videoRepresentationImpl.id = id;
	}

	final public VideoRepresentationBuilder _frameRate_(java.math.BigDecimal _frameRate_) {
		this.videoRepresentationImpl._frameRate = _frameRate_;
		return this;
	}


	final public VideoRepresentationBuilder _instance_(java.util.ArrayList<? extends RepresentationInstance> _instance_) {
		this.videoRepresentationImpl._instance = _instance_;
		return this;
	}


	final public VideoRepresentationBuilder _mediaType_(MediaType _mediaType_) {
		this.videoRepresentationImpl._mediaType = _mediaType_;
		return this;
	}


	final public VideoRepresentationBuilder _representationStandard_(URI _representationStandard_) {
		this.videoRepresentationImpl._representationStandard = _representationStandard_;
		return this;
	}


	final public VideoRepresentationBuilder _language_(Language _language_) {
		this.videoRepresentationImpl._language = _language_;
		return this;
	}


	final public VideoRepresentationBuilder _created_(XMLGregorianCalendar _created_) {
		this.videoRepresentationImpl._created = _created_;
		return this;
	}


	final public VideoRepresentationBuilder _modified_(XMLGregorianCalendar _modified_) {
		this.videoRepresentationImpl._modified = _modified_;
		return this;
	}




	final public VideoRepresentationBuilder _shapesGraph_(URI _shapesGraph_) {
		this.videoRepresentationImpl._shapesGraph = _shapesGraph_;
		return this;
	}


	public final VideoRepresentation build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(videoRepresentationImpl);
		return videoRepresentationImpl;
	}
}
