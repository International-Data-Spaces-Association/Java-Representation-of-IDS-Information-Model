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

public class TextResourceBuilder {

	private TextResourceImpl textResourceImpl;

	public TextResourceBuilder() {
		textResourceImpl = new TextResourceImpl();
	}

	public TextResourceBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		textResourceImpl.id = id;
	}


	final public TextResourceBuilder _standardLicense_(URI _standardLicense_) {
		this.textResourceImpl._standardLicense = _standardLicense_;
		return this;
	}


	final public TextResourceBuilder _customLicense_(URI _customLicense_) {
		this.textResourceImpl._customLicense = _customLicense_;
		return this;
	}


	final public TextResourceBuilder _resourceEndpoint_(java.util.ArrayList<? extends ConnectorEndpoint> _resourceEndpoint_) {
		this.textResourceImpl._resourceEndpoint = _resourceEndpoint_;
		return this;
	}


	final public TextResourceBuilder _resourcePart_(java.util.ArrayList<? extends Resource> _resourcePart_) {
		this.textResourceImpl._resourcePart = _resourcePart_;
		return this;
	}


	final public TextResourceBuilder _contractOffer_(java.util.ArrayList<? extends ContractOffer> _contractOffer_) {
		this.textResourceImpl._contractOffer = _contractOffer_;
		return this;
	}


	final public TextResourceBuilder _sample_(java.util.ArrayList<? extends Resource> _sample_) {
		this.textResourceImpl._sample = _sample_;
		return this;
	}


	final public TextResourceBuilder _publisher_(URI _publisher_) {
		this.textResourceImpl._publisher = _publisher_;
		return this;
	}


	final public TextResourceBuilder _sovereign_(URI _sovereign_) {
		this.textResourceImpl._sovereign = _sovereign_;
		return this;
	}


	final public TextResourceBuilder _variant_(Resource _variant_) {
		this.textResourceImpl._variant = _variant_;
		return this;
	}




	final public TextResourceBuilder _contentPart_(java.util.ArrayList<? extends DigitalContent> _contentPart_) {
		this.textResourceImpl._contentPart = _contentPart_;
		return this;
	}


	final public TextResourceBuilder _spatialCoverage_(java.util.ArrayList<? extends Location> _spatialCoverage_) {
		this.textResourceImpl._spatialCoverage = _spatialCoverage_;
		return this;
	}


	final public TextResourceBuilder _temporalCoverage_(java.util.ArrayList<? extends TemporalEntity> _temporalCoverage_) {
		this.textResourceImpl._temporalCoverage = _temporalCoverage_;
		return this;
	}


	final public TextResourceBuilder _theme_(java.util.ArrayList<? extends URI> _theme_) {
		this.textResourceImpl._theme = _theme_;
		return this;
	}


	final public TextResourceBuilder _keyword_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _keyword_) {
		this.textResourceImpl._keyword = _keyword_;
		return this;
	}


	final public TextResourceBuilder _representation_(java.util.ArrayList<? extends Representation> _representation_) {
		this.textResourceImpl._representation = _representation_;
		return this;
	}


	final public TextResourceBuilder _contentType_(ContentType _contentType_) {
		this.textResourceImpl._contentType = _contentType_;
		return this;
	}


	final public TextResourceBuilder _defaultRepresentation_(java.util.ArrayList<? extends Representation> _defaultRepresentation_) {
		this.textResourceImpl._defaultRepresentation = _defaultRepresentation_;
		return this;
	}


	final public TextResourceBuilder _temporalResolution_(Frequency _temporalResolution_) {
		this.textResourceImpl._temporalResolution = _temporalResolution_;
		return this;
	}


	final public TextResourceBuilder _accrualPeriodicity_(Frequency _accrualPeriodicity_) {
		this.textResourceImpl._accrualPeriodicity = _accrualPeriodicity_;
		return this;
	}


	final public TextResourceBuilder _contentStandard_(URI _contentStandard_) {
		this.textResourceImpl._contentStandard = _contentStandard_;
		return this;
	}


	final public TextResourceBuilder _language_(java.util.ArrayList<? extends Language> _language_) {
		this.textResourceImpl._language = _language_;
		return this;
	}


	final public TextResourceBuilder _created_(XMLGregorianCalendar _created_) {
		this.textResourceImpl._created = _created_;
		return this;
	}


	final public TextResourceBuilder _modified_(XMLGregorianCalendar _modified_) {
		this.textResourceImpl._modified = _modified_;
		return this;
	}


	final public TextResourceBuilder _title_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _title_) {
		this.textResourceImpl._title = _title_;
		return this;
	}


	final public TextResourceBuilder _description_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _description_) {
		this.textResourceImpl._description = _description_;
		return this;
	}



	final public TextResourceBuilder _shapesGraph_(URI _shapesGraph_) {
		this.textResourceImpl._shapesGraph = _shapesGraph_;
		return this;
	}


	final public TextResourceBuilder _version_(String _version_) {
		this.textResourceImpl._version = _version_;
		return this;
	}

	public final TextResource build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(textResourceImpl);
		return textResourceImpl;
	}
}
