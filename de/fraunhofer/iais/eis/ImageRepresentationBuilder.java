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

public class ImageRepresentationBuilder {

	private ImageRepresentationImpl imageRepresentationImpl;

	public ImageRepresentationBuilder() {
		imageRepresentationImpl = new ImageRepresentationImpl();
	}

	public ImageRepresentationBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		imageRepresentationImpl.id = id;
	}

	final public ImageRepresentationBuilder _width_(java.math.BigDecimal _width_) {
		this.imageRepresentationImpl._width = _width_;
		return this;
	}


	final public ImageRepresentationBuilder _height_(java.math.BigDecimal _height_) {
		this.imageRepresentationImpl._height = _height_;
		return this;
	}


	final public ImageRepresentationBuilder _instance_(java.util.ArrayList<? extends RepresentationInstance> _instance_) {
		this.imageRepresentationImpl._instance = _instance_;
		return this;
	}


	final public ImageRepresentationBuilder _mediaType_(MediaType _mediaType_) {
		this.imageRepresentationImpl._mediaType = _mediaType_;
		return this;
	}


	final public ImageRepresentationBuilder _representationStandard_(URI _representationStandard_) {
		this.imageRepresentationImpl._representationStandard = _representationStandard_;
		return this;
	}


	final public ImageRepresentationBuilder _language_(Language _language_) {
		this.imageRepresentationImpl._language = _language_;
		return this;
	}


	final public ImageRepresentationBuilder _created_(XMLGregorianCalendar _created_) {
		this.imageRepresentationImpl._created = _created_;
		return this;
	}


	final public ImageRepresentationBuilder _modified_(XMLGregorianCalendar _modified_) {
		this.imageRepresentationImpl._modified = _modified_;
		return this;
	}




	final public ImageRepresentationBuilder _shapesGraph_(URI _shapesGraph_) {
		this.imageRepresentationImpl._shapesGraph = _shapesGraph_;
		return this;
	}


	public final ImageRepresentation build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(imageRepresentationImpl);
		return imageRepresentationImpl;
	}
}
