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

public class ImageResourceBuilder {

	private ImageResourceImpl imageResourceImpl;

	public ImageResourceBuilder() {
		imageResourceImpl = new ImageResourceImpl();
	}

	public ImageResourceBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		imageResourceImpl.id = id;
	}


	final public ImageResourceBuilder _standardLicense_(URI _standardLicense_) {
		this.imageResourceImpl._standardLicense = _standardLicense_;
		return this;
	}


	final public ImageResourceBuilder _customLicense_(URI _customLicense_) {
		this.imageResourceImpl._customLicense = _customLicense_;
		return this;
	}


	final public ImageResourceBuilder _resourceEndpoint_(java.util.ArrayList<? extends ConnectorEndpoint> _resourceEndpoint_) {
		this.imageResourceImpl._resourceEndpoint = _resourceEndpoint_;
		return this;
	}


	final public ImageResourceBuilder _resourcePart_(java.util.ArrayList<? extends Resource> _resourcePart_) {
		this.imageResourceImpl._resourcePart = _resourcePart_;
		return this;
	}


	final public ImageResourceBuilder _contractOffer_(java.util.ArrayList<? extends ContractOffer> _contractOffer_) {
		this.imageResourceImpl._contractOffer = _contractOffer_;
		return this;
	}


	final public ImageResourceBuilder _sample_(java.util.ArrayList<? extends Resource> _sample_) {
		this.imageResourceImpl._sample = _sample_;
		return this;
	}


	final public ImageResourceBuilder _publisher_(URI _publisher_) {
		this.imageResourceImpl._publisher = _publisher_;
		return this;
	}


	final public ImageResourceBuilder _sovereign_(URI _sovereign_) {
		this.imageResourceImpl._sovereign = _sovereign_;
		return this;
	}


	final public ImageResourceBuilder _variant_(Resource _variant_) {
		this.imageResourceImpl._variant = _variant_;
		return this;
	}




	final public ImageResourceBuilder _contentPart_(java.util.ArrayList<? extends DigitalContent> _contentPart_) {
		this.imageResourceImpl._contentPart = _contentPart_;
		return this;
	}


	final public ImageResourceBuilder _spatialCoverage_(java.util.ArrayList<? extends Location> _spatialCoverage_) {
		this.imageResourceImpl._spatialCoverage = _spatialCoverage_;
		return this;
	}


	final public ImageResourceBuilder _temporalCoverage_(java.util.ArrayList<? extends TemporalEntity> _temporalCoverage_) {
		this.imageResourceImpl._temporalCoverage = _temporalCoverage_;
		return this;
	}


	final public ImageResourceBuilder _theme_(java.util.ArrayList<? extends URI> _theme_) {
		this.imageResourceImpl._theme = _theme_;
		return this;
	}


	final public ImageResourceBuilder _keyword_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _keyword_) {
		this.imageResourceImpl._keyword = _keyword_;
		return this;
	}


	final public ImageResourceBuilder _representation_(java.util.ArrayList<? extends Representation> _representation_) {
		this.imageResourceImpl._representation = _representation_;
		return this;
	}


	final public ImageResourceBuilder _contentType_(ContentType _contentType_) {
		this.imageResourceImpl._contentType = _contentType_;
		return this;
	}


	final public ImageResourceBuilder _defaultRepresentation_(java.util.ArrayList<? extends Representation> _defaultRepresentation_) {
		this.imageResourceImpl._defaultRepresentation = _defaultRepresentation_;
		return this;
	}


	final public ImageResourceBuilder _temporalResolution_(Frequency _temporalResolution_) {
		this.imageResourceImpl._temporalResolution = _temporalResolution_;
		return this;
	}


	final public ImageResourceBuilder _accrualPeriodicity_(Frequency _accrualPeriodicity_) {
		this.imageResourceImpl._accrualPeriodicity = _accrualPeriodicity_;
		return this;
	}


	final public ImageResourceBuilder _contentStandard_(URI _contentStandard_) {
		this.imageResourceImpl._contentStandard = _contentStandard_;
		return this;
	}


	final public ImageResourceBuilder _language_(java.util.ArrayList<? extends Language> _language_) {
		this.imageResourceImpl._language = _language_;
		return this;
	}


	final public ImageResourceBuilder _created_(XMLGregorianCalendar _created_) {
		this.imageResourceImpl._created = _created_;
		return this;
	}


	final public ImageResourceBuilder _modified_(XMLGregorianCalendar _modified_) {
		this.imageResourceImpl._modified = _modified_;
		return this;
	}


	final public ImageResourceBuilder _title_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _title_) {
		this.imageResourceImpl._title = _title_;
		return this;
	}


	final public ImageResourceBuilder _description_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _description_) {
		this.imageResourceImpl._description = _description_;
		return this;
	}



	final public ImageResourceBuilder _shapesGraph_(URI _shapesGraph_) {
		this.imageResourceImpl._shapesGraph = _shapesGraph_;
		return this;
	}


	final public ImageResourceBuilder _version_(String _version_) {
		this.imageResourceImpl._version = _version_;
		return this;
	}

	public final ImageResource build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(imageResourceImpl);
		return imageResourceImpl;
	}
}
