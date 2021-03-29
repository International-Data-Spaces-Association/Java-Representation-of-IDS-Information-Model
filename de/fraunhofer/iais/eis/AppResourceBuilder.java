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

public class AppResourceBuilder {

	private AppResourceImpl appResourceImpl;

	public AppResourceBuilder() {
		appResourceImpl = new AppResourceImpl();
	}

	public AppResourceBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		appResourceImpl.id = id;
	}


	final public AppResourceBuilder _standardLicense_(URI _standardLicense_) {
		this.appResourceImpl._standardLicense = _standardLicense_;
		return this;
	}


	final public AppResourceBuilder _customLicense_(URI _customLicense_) {
		this.appResourceImpl._customLicense = _customLicense_;
		return this;
	}


	final public AppResourceBuilder _resourceEndpoint_(java.util.ArrayList<? extends ConnectorEndpoint> _resourceEndpoint_) {
		this.appResourceImpl._resourceEndpoint = _resourceEndpoint_;
		return this;
	}


	final public AppResourceBuilder _resourcePart_(java.util.ArrayList<? extends Resource> _resourcePart_) {
		this.appResourceImpl._resourcePart = _resourcePart_;
		return this;
	}


	final public AppResourceBuilder _contractOffer_(java.util.ArrayList<? extends ContractOffer> _contractOffer_) {
		this.appResourceImpl._contractOffer = _contractOffer_;
		return this;
	}


	final public AppResourceBuilder _sample_(java.util.ArrayList<? extends Resource> _sample_) {
		this.appResourceImpl._sample = _sample_;
		return this;
	}


	final public AppResourceBuilder _publisher_(URI _publisher_) {
		this.appResourceImpl._publisher = _publisher_;
		return this;
	}


	final public AppResourceBuilder _sovereign_(URI _sovereign_) {
		this.appResourceImpl._sovereign = _sovereign_;
		return this;
	}


	final public AppResourceBuilder _variant_(Resource _variant_) {
		this.appResourceImpl._variant = _variant_;
		return this;
	}




	final public AppResourceBuilder _contentPart_(java.util.ArrayList<? extends DigitalContent> _contentPart_) {
		this.appResourceImpl._contentPart = _contentPart_;
		return this;
	}


	final public AppResourceBuilder _spatialCoverage_(java.util.ArrayList<? extends Location> _spatialCoverage_) {
		this.appResourceImpl._spatialCoverage = _spatialCoverage_;
		return this;
	}


	final public AppResourceBuilder _temporalCoverage_(java.util.ArrayList<? extends TemporalEntity> _temporalCoverage_) {
		this.appResourceImpl._temporalCoverage = _temporalCoverage_;
		return this;
	}


	final public AppResourceBuilder _theme_(java.util.ArrayList<? extends URI> _theme_) {
		this.appResourceImpl._theme = _theme_;
		return this;
	}


	final public AppResourceBuilder _keyword_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _keyword_) {
		this.appResourceImpl._keyword = _keyword_;
		return this;
	}


	final public AppResourceBuilder _representation_(java.util.ArrayList<? extends Representation> _representation_) {
		this.appResourceImpl._representation = _representation_;
		return this;
	}


	final public AppResourceBuilder _contentType_(ContentType _contentType_) {
		this.appResourceImpl._contentType = _contentType_;
		return this;
	}


	final public AppResourceBuilder _defaultRepresentation_(java.util.ArrayList<? extends Representation> _defaultRepresentation_) {
		this.appResourceImpl._defaultRepresentation = _defaultRepresentation_;
		return this;
	}


	final public AppResourceBuilder _temporalResolution_(Frequency _temporalResolution_) {
		this.appResourceImpl._temporalResolution = _temporalResolution_;
		return this;
	}


	final public AppResourceBuilder _accrualPeriodicity_(Frequency _accrualPeriodicity_) {
		this.appResourceImpl._accrualPeriodicity = _accrualPeriodicity_;
		return this;
	}


	final public AppResourceBuilder _contentStandard_(URI _contentStandard_) {
		this.appResourceImpl._contentStandard = _contentStandard_;
		return this;
	}


	final public AppResourceBuilder _language_(java.util.ArrayList<? extends Language> _language_) {
		this.appResourceImpl._language = _language_;
		return this;
	}


	final public AppResourceBuilder _created_(XMLGregorianCalendar _created_) {
		this.appResourceImpl._created = _created_;
		return this;
	}


	final public AppResourceBuilder _modified_(XMLGregorianCalendar _modified_) {
		this.appResourceImpl._modified = _modified_;
		return this;
	}


	final public AppResourceBuilder _title_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _title_) {
		this.appResourceImpl._title = _title_;
		return this;
	}


	final public AppResourceBuilder _description_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _description_) {
		this.appResourceImpl._description = _description_;
		return this;
	}



	final public AppResourceBuilder _shapesGraph_(URI _shapesGraph_) {
		this.appResourceImpl._shapesGraph = _shapesGraph_;
		return this;
	}


	final public AppResourceBuilder _version_(String _version_) {
		this.appResourceImpl._version = _version_;
		return this;
	}

	public final AppResource build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(appResourceImpl);
		return appResourceImpl;
	}
}
