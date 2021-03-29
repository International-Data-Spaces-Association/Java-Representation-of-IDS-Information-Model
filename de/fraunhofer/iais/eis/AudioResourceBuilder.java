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

public class AudioResourceBuilder {

	private AudioResourceImpl audioResourceImpl;

	public AudioResourceBuilder() {
		audioResourceImpl = new AudioResourceImpl();
	}

	public AudioResourceBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		audioResourceImpl.id = id;
	}


	final public AudioResourceBuilder _standardLicense_(URI _standardLicense_) {
		this.audioResourceImpl._standardLicense = _standardLicense_;
		return this;
	}


	final public AudioResourceBuilder _customLicense_(URI _customLicense_) {
		this.audioResourceImpl._customLicense = _customLicense_;
		return this;
	}


	final public AudioResourceBuilder _resourceEndpoint_(java.util.ArrayList<? extends ConnectorEndpoint> _resourceEndpoint_) {
		this.audioResourceImpl._resourceEndpoint = _resourceEndpoint_;
		return this;
	}


	final public AudioResourceBuilder _resourcePart_(java.util.ArrayList<? extends Resource> _resourcePart_) {
		this.audioResourceImpl._resourcePart = _resourcePart_;
		return this;
	}


	final public AudioResourceBuilder _contractOffer_(java.util.ArrayList<? extends ContractOffer> _contractOffer_) {
		this.audioResourceImpl._contractOffer = _contractOffer_;
		return this;
	}


	final public AudioResourceBuilder _sample_(java.util.ArrayList<? extends Resource> _sample_) {
		this.audioResourceImpl._sample = _sample_;
		return this;
	}


	final public AudioResourceBuilder _publisher_(URI _publisher_) {
		this.audioResourceImpl._publisher = _publisher_;
		return this;
	}


	final public AudioResourceBuilder _sovereign_(URI _sovereign_) {
		this.audioResourceImpl._sovereign = _sovereign_;
		return this;
	}


	final public AudioResourceBuilder _variant_(Resource _variant_) {
		this.audioResourceImpl._variant = _variant_;
		return this;
	}




	final public AudioResourceBuilder _contentPart_(java.util.ArrayList<? extends DigitalContent> _contentPart_) {
		this.audioResourceImpl._contentPart = _contentPart_;
		return this;
	}


	final public AudioResourceBuilder _spatialCoverage_(java.util.ArrayList<? extends Location> _spatialCoverage_) {
		this.audioResourceImpl._spatialCoverage = _spatialCoverage_;
		return this;
	}


	final public AudioResourceBuilder _temporalCoverage_(java.util.ArrayList<? extends TemporalEntity> _temporalCoverage_) {
		this.audioResourceImpl._temporalCoverage = _temporalCoverage_;
		return this;
	}


	final public AudioResourceBuilder _theme_(java.util.ArrayList<? extends URI> _theme_) {
		this.audioResourceImpl._theme = _theme_;
		return this;
	}


	final public AudioResourceBuilder _keyword_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _keyword_) {
		this.audioResourceImpl._keyword = _keyword_;
		return this;
	}


	final public AudioResourceBuilder _representation_(java.util.ArrayList<? extends Representation> _representation_) {
		this.audioResourceImpl._representation = _representation_;
		return this;
	}


	final public AudioResourceBuilder _contentType_(ContentType _contentType_) {
		this.audioResourceImpl._contentType = _contentType_;
		return this;
	}


	final public AudioResourceBuilder _defaultRepresentation_(java.util.ArrayList<? extends Representation> _defaultRepresentation_) {
		this.audioResourceImpl._defaultRepresentation = _defaultRepresentation_;
		return this;
	}


	final public AudioResourceBuilder _temporalResolution_(Frequency _temporalResolution_) {
		this.audioResourceImpl._temporalResolution = _temporalResolution_;
		return this;
	}


	final public AudioResourceBuilder _accrualPeriodicity_(Frequency _accrualPeriodicity_) {
		this.audioResourceImpl._accrualPeriodicity = _accrualPeriodicity_;
		return this;
	}


	final public AudioResourceBuilder _contentStandard_(URI _contentStandard_) {
		this.audioResourceImpl._contentStandard = _contentStandard_;
		return this;
	}


	final public AudioResourceBuilder _language_(java.util.ArrayList<? extends Language> _language_) {
		this.audioResourceImpl._language = _language_;
		return this;
	}


	final public AudioResourceBuilder _created_(XMLGregorianCalendar _created_) {
		this.audioResourceImpl._created = _created_;
		return this;
	}


	final public AudioResourceBuilder _modified_(XMLGregorianCalendar _modified_) {
		this.audioResourceImpl._modified = _modified_;
		return this;
	}


	final public AudioResourceBuilder _title_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _title_) {
		this.audioResourceImpl._title = _title_;
		return this;
	}


	final public AudioResourceBuilder _description_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _description_) {
		this.audioResourceImpl._description = _description_;
		return this;
	}



	final public AudioResourceBuilder _shapesGraph_(URI _shapesGraph_) {
		this.audioResourceImpl._shapesGraph = _shapesGraph_;
		return this;
	}


	final public AudioResourceBuilder _version_(String _version_) {
		this.audioResourceImpl._version = _version_;
		return this;
	}

	public final AudioResource build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(audioResourceImpl);
		return audioResourceImpl;
	}
}
