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

public class VideoResourceBuilder {

	private VideoResourceImpl videoResourceImpl;

	public VideoResourceBuilder() {
		videoResourceImpl = new VideoResourceImpl();
	}

	public VideoResourceBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		videoResourceImpl.id = id;
	}


	final public VideoResourceBuilder _standardLicense_(URI _standardLicense_) {
		this.videoResourceImpl._standardLicense = _standardLicense_;
		return this;
	}


	final public VideoResourceBuilder _customLicense_(URI _customLicense_) {
		this.videoResourceImpl._customLicense = _customLicense_;
		return this;
	}


	final public VideoResourceBuilder _resourceEndpoint_(java.util.ArrayList<? extends ConnectorEndpoint> _resourceEndpoint_) {
		this.videoResourceImpl._resourceEndpoint = _resourceEndpoint_;
		return this;
	}


	final public VideoResourceBuilder _resourcePart_(java.util.ArrayList<? extends Resource> _resourcePart_) {
		this.videoResourceImpl._resourcePart = _resourcePart_;
		return this;
	}


	final public VideoResourceBuilder _contractOffer_(java.util.ArrayList<? extends ContractOffer> _contractOffer_) {
		this.videoResourceImpl._contractOffer = _contractOffer_;
		return this;
	}


	final public VideoResourceBuilder _sample_(java.util.ArrayList<? extends Resource> _sample_) {
		this.videoResourceImpl._sample = _sample_;
		return this;
	}


	final public VideoResourceBuilder _publisher_(URI _publisher_) {
		this.videoResourceImpl._publisher = _publisher_;
		return this;
	}


	final public VideoResourceBuilder _sovereign_(URI _sovereign_) {
		this.videoResourceImpl._sovereign = _sovereign_;
		return this;
	}


	final public VideoResourceBuilder _variant_(Resource _variant_) {
		this.videoResourceImpl._variant = _variant_;
		return this;
	}




	final public VideoResourceBuilder _contentPart_(java.util.ArrayList<? extends DigitalContent> _contentPart_) {
		this.videoResourceImpl._contentPart = _contentPart_;
		return this;
	}


	final public VideoResourceBuilder _spatialCoverage_(java.util.ArrayList<? extends Location> _spatialCoverage_) {
		this.videoResourceImpl._spatialCoverage = _spatialCoverage_;
		return this;
	}


	final public VideoResourceBuilder _temporalCoverage_(java.util.ArrayList<? extends TemporalEntity> _temporalCoverage_) {
		this.videoResourceImpl._temporalCoverage = _temporalCoverage_;
		return this;
	}


	final public VideoResourceBuilder _theme_(java.util.ArrayList<? extends URI> _theme_) {
		this.videoResourceImpl._theme = _theme_;
		return this;
	}


	final public VideoResourceBuilder _keyword_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _keyword_) {
		this.videoResourceImpl._keyword = _keyword_;
		return this;
	}


	final public VideoResourceBuilder _representation_(java.util.ArrayList<? extends Representation> _representation_) {
		this.videoResourceImpl._representation = _representation_;
		return this;
	}


	final public VideoResourceBuilder _contentType_(ContentType _contentType_) {
		this.videoResourceImpl._contentType = _contentType_;
		return this;
	}


	final public VideoResourceBuilder _defaultRepresentation_(java.util.ArrayList<? extends Representation> _defaultRepresentation_) {
		this.videoResourceImpl._defaultRepresentation = _defaultRepresentation_;
		return this;
	}


	final public VideoResourceBuilder _temporalResolution_(Frequency _temporalResolution_) {
		this.videoResourceImpl._temporalResolution = _temporalResolution_;
		return this;
	}


	final public VideoResourceBuilder _accrualPeriodicity_(Frequency _accrualPeriodicity_) {
		this.videoResourceImpl._accrualPeriodicity = _accrualPeriodicity_;
		return this;
	}


	final public VideoResourceBuilder _contentStandard_(URI _contentStandard_) {
		this.videoResourceImpl._contentStandard = _contentStandard_;
		return this;
	}


	final public VideoResourceBuilder _language_(java.util.ArrayList<? extends Language> _language_) {
		this.videoResourceImpl._language = _language_;
		return this;
	}


	final public VideoResourceBuilder _created_(XMLGregorianCalendar _created_) {
		this.videoResourceImpl._created = _created_;
		return this;
	}


	final public VideoResourceBuilder _modified_(XMLGregorianCalendar _modified_) {
		this.videoResourceImpl._modified = _modified_;
		return this;
	}


	final public VideoResourceBuilder _title_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _title_) {
		this.videoResourceImpl._title = _title_;
		return this;
	}


	final public VideoResourceBuilder _description_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _description_) {
		this.videoResourceImpl._description = _description_;
		return this;
	}



	final public VideoResourceBuilder _shapesGraph_(URI _shapesGraph_) {
		this.videoResourceImpl._shapesGraph = _shapesGraph_;
		return this;
	}


	final public VideoResourceBuilder _version_(String _version_) {
		this.videoResourceImpl._version = _version_;
		return this;
	}

	public final VideoResource build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(videoResourceImpl);
		return videoResourceImpl;
	}
}
