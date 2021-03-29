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

public class TextRepresentationBuilder {

	private TextRepresentationImpl textRepresentationImpl;

	public TextRepresentationBuilder() {
		textRepresentationImpl = new TextRepresentationImpl();
	}

	public TextRepresentationBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		textRepresentationImpl.id = id;
	}


	final public TextRepresentationBuilder _instance_(java.util.ArrayList<? extends RepresentationInstance> _instance_) {
		this.textRepresentationImpl._instance = _instance_;
		return this;
	}


	final public TextRepresentationBuilder _mediaType_(MediaType _mediaType_) {
		this.textRepresentationImpl._mediaType = _mediaType_;
		return this;
	}


	final public TextRepresentationBuilder _representationStandard_(URI _representationStandard_) {
		this.textRepresentationImpl._representationStandard = _representationStandard_;
		return this;
	}


	final public TextRepresentationBuilder _language_(Language _language_) {
		this.textRepresentationImpl._language = _language_;
		return this;
	}


	final public TextRepresentationBuilder _created_(XMLGregorianCalendar _created_) {
		this.textRepresentationImpl._created = _created_;
		return this;
	}


	final public TextRepresentationBuilder _modified_(XMLGregorianCalendar _modified_) {
		this.textRepresentationImpl._modified = _modified_;
		return this;
	}




	final public TextRepresentationBuilder _shapesGraph_(URI _shapesGraph_) {
		this.textRepresentationImpl._shapesGraph = _shapesGraph_;
		return this;
	}


	public final TextRepresentation build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(textRepresentationImpl);
		return textRepresentationImpl;
	}
}
