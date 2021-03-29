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

public class ResourceBuilder {

	private ResourceImpl resourceImpl;

	public ResourceBuilder() {
		resourceImpl = new ResourceImpl();
	}

	public ResourceBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		resourceImpl.id = id;
	}

	final public ResourceBuilder _standardLicense_(URI _standardLicense_) {
		this.resourceImpl._standardLicense = _standardLicense_;
		return this;
	}


	final public ResourceBuilder _customLicense_(URI _customLicense_) {
		this.resourceImpl._customLicense = _customLicense_;
		return this;
	}


	final public ResourceBuilder _resourceEndpoint_(java.util.ArrayList<? extends ConnectorEndpoint> _resourceEndpoint_) {
		this.resourceImpl._resourceEndpoint = _resourceEndpoint_;
		return this;
	}


	final public ResourceBuilder _resourcePart_(java.util.ArrayList<? extends Resource> _resourcePart_) {
		this.resourceImpl._resourcePart = _resourcePart_;
		return this;
	}


	final public ResourceBuilder _contractOffer_(java.util.ArrayList<? extends ContractOffer> _contractOffer_) {
		this.resourceImpl._contractOffer = _contractOffer_;
		return this;
	}


	final public ResourceBuilder _sample_(java.util.ArrayList<? extends Resource> _sample_) {
		this.resourceImpl._sample = _sample_;
		return this;
	}


	final public ResourceBuilder _publisher_(URI _publisher_) {
		this.resourceImpl._publisher = _publisher_;
		return this;
	}


	final public ResourceBuilder _sovereign_(URI _sovereign_) {
		this.resourceImpl._sovereign = _sovereign_;
		return this;
	}


	final public ResourceBuilder _variant_(Resource _variant_) {
		this.resourceImpl._variant = _variant_;
		return this;
	}




	final public ResourceBuilder _contentPart_(java.util.ArrayList<? extends DigitalContent> _contentPart_) {
		this.resourceImpl._contentPart = _contentPart_;
		return this;
	}


	final public ResourceBuilder _spatialCoverage_(java.util.ArrayList<? extends Location> _spatialCoverage_) {
		this.resourceImpl._spatialCoverage = _spatialCoverage_;
		return this;
	}


	final public ResourceBuilder _temporalCoverage_(java.util.ArrayList<? extends TemporalEntity> _temporalCoverage_) {
		this.resourceImpl._temporalCoverage = _temporalCoverage_;
		return this;
	}


	final public ResourceBuilder _theme_(java.util.ArrayList<? extends URI> _theme_) {
		this.resourceImpl._theme = _theme_;
		return this;
	}


	final public ResourceBuilder _keyword_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _keyword_) {
		this.resourceImpl._keyword = _keyword_;
		return this;
	}


	final public ResourceBuilder _representation_(java.util.ArrayList<? extends Representation> _representation_) {
		this.resourceImpl._representation = _representation_;
		return this;
	}


	final public ResourceBuilder _contentType_(ContentType _contentType_) {
		this.resourceImpl._contentType = _contentType_;
		return this;
	}


	final public ResourceBuilder _defaultRepresentation_(java.util.ArrayList<? extends Representation> _defaultRepresentation_) {
		this.resourceImpl._defaultRepresentation = _defaultRepresentation_;
		return this;
	}


	final public ResourceBuilder _temporalResolution_(Frequency _temporalResolution_) {
		this.resourceImpl._temporalResolution = _temporalResolution_;
		return this;
	}


	final public ResourceBuilder _accrualPeriodicity_(Frequency _accrualPeriodicity_) {
		this.resourceImpl._accrualPeriodicity = _accrualPeriodicity_;
		return this;
	}


	final public ResourceBuilder _contentStandard_(URI _contentStandard_) {
		this.resourceImpl._contentStandard = _contentStandard_;
		return this;
	}


	final public ResourceBuilder _language_(java.util.ArrayList<? extends Language> _language_) {
		this.resourceImpl._language = _language_;
		return this;
	}


	final public ResourceBuilder _created_(XMLGregorianCalendar _created_) {
		this.resourceImpl._created = _created_;
		return this;
	}


	final public ResourceBuilder _modified_(XMLGregorianCalendar _modified_) {
		this.resourceImpl._modified = _modified_;
		return this;
	}


	final public ResourceBuilder _title_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _title_) {
		this.resourceImpl._title = _title_;
		return this;
	}


	final public ResourceBuilder _description_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _description_) {
		this.resourceImpl._description = _description_;
		return this;
	}



	final public ResourceBuilder _shapesGraph_(URI _shapesGraph_) {
		this.resourceImpl._shapesGraph = _shapesGraph_;
		return this;
	}


	final public ResourceBuilder _version_(String _version_) {
		this.resourceImpl._version = _version_;
		return this;
	}

	public final Resource build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(resourceImpl);
		return resourceImpl;
	}
}
