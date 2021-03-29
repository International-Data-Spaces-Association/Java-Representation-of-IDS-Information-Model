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

public class SoftwareResourceBuilder {

	private SoftwareResourceImpl softwareResourceImpl;

	public SoftwareResourceBuilder() {
		softwareResourceImpl = new SoftwareResourceImpl();
	}

	public SoftwareResourceBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		softwareResourceImpl.id = id;
	}


	final public SoftwareResourceBuilder _standardLicense_(URI _standardLicense_) {
		this.softwareResourceImpl._standardLicense = _standardLicense_;
		return this;
	}


	final public SoftwareResourceBuilder _customLicense_(URI _customLicense_) {
		this.softwareResourceImpl._customLicense = _customLicense_;
		return this;
	}


	final public SoftwareResourceBuilder _resourceEndpoint_(java.util.ArrayList<? extends ConnectorEndpoint> _resourceEndpoint_) {
		this.softwareResourceImpl._resourceEndpoint = _resourceEndpoint_;
		return this;
	}


	final public SoftwareResourceBuilder _resourcePart_(java.util.ArrayList<? extends Resource> _resourcePart_) {
		this.softwareResourceImpl._resourcePart = _resourcePart_;
		return this;
	}


	final public SoftwareResourceBuilder _contractOffer_(java.util.ArrayList<? extends ContractOffer> _contractOffer_) {
		this.softwareResourceImpl._contractOffer = _contractOffer_;
		return this;
	}


	final public SoftwareResourceBuilder _sample_(java.util.ArrayList<? extends Resource> _sample_) {
		this.softwareResourceImpl._sample = _sample_;
		return this;
	}


	final public SoftwareResourceBuilder _publisher_(URI _publisher_) {
		this.softwareResourceImpl._publisher = _publisher_;
		return this;
	}


	final public SoftwareResourceBuilder _sovereign_(URI _sovereign_) {
		this.softwareResourceImpl._sovereign = _sovereign_;
		return this;
	}


	final public SoftwareResourceBuilder _variant_(Resource _variant_) {
		this.softwareResourceImpl._variant = _variant_;
		return this;
	}




	final public SoftwareResourceBuilder _contentPart_(java.util.ArrayList<? extends DigitalContent> _contentPart_) {
		this.softwareResourceImpl._contentPart = _contentPart_;
		return this;
	}


	final public SoftwareResourceBuilder _spatialCoverage_(java.util.ArrayList<? extends Location> _spatialCoverage_) {
		this.softwareResourceImpl._spatialCoverage = _spatialCoverage_;
		return this;
	}


	final public SoftwareResourceBuilder _temporalCoverage_(java.util.ArrayList<? extends TemporalEntity> _temporalCoverage_) {
		this.softwareResourceImpl._temporalCoverage = _temporalCoverage_;
		return this;
	}


	final public SoftwareResourceBuilder _theme_(java.util.ArrayList<? extends URI> _theme_) {
		this.softwareResourceImpl._theme = _theme_;
		return this;
	}


	final public SoftwareResourceBuilder _keyword_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _keyword_) {
		this.softwareResourceImpl._keyword = _keyword_;
		return this;
	}


	final public SoftwareResourceBuilder _representation_(java.util.ArrayList<? extends Representation> _representation_) {
		this.softwareResourceImpl._representation = _representation_;
		return this;
	}


	final public SoftwareResourceBuilder _contentType_(ContentType _contentType_) {
		this.softwareResourceImpl._contentType = _contentType_;
		return this;
	}


	final public SoftwareResourceBuilder _defaultRepresentation_(java.util.ArrayList<? extends Representation> _defaultRepresentation_) {
		this.softwareResourceImpl._defaultRepresentation = _defaultRepresentation_;
		return this;
	}


	final public SoftwareResourceBuilder _temporalResolution_(Frequency _temporalResolution_) {
		this.softwareResourceImpl._temporalResolution = _temporalResolution_;
		return this;
	}


	final public SoftwareResourceBuilder _accrualPeriodicity_(Frequency _accrualPeriodicity_) {
		this.softwareResourceImpl._accrualPeriodicity = _accrualPeriodicity_;
		return this;
	}


	final public SoftwareResourceBuilder _contentStandard_(URI _contentStandard_) {
		this.softwareResourceImpl._contentStandard = _contentStandard_;
		return this;
	}


	final public SoftwareResourceBuilder _language_(java.util.ArrayList<? extends Language> _language_) {
		this.softwareResourceImpl._language = _language_;
		return this;
	}


	final public SoftwareResourceBuilder _created_(XMLGregorianCalendar _created_) {
		this.softwareResourceImpl._created = _created_;
		return this;
	}


	final public SoftwareResourceBuilder _modified_(XMLGregorianCalendar _modified_) {
		this.softwareResourceImpl._modified = _modified_;
		return this;
	}


	final public SoftwareResourceBuilder _title_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _title_) {
		this.softwareResourceImpl._title = _title_;
		return this;
	}


	final public SoftwareResourceBuilder _description_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _description_) {
		this.softwareResourceImpl._description = _description_;
		return this;
	}



	final public SoftwareResourceBuilder _shapesGraph_(URI _shapesGraph_) {
		this.softwareResourceImpl._shapesGraph = _shapesGraph_;
		return this;
	}


	final public SoftwareResourceBuilder _version_(String _version_) {
		this.softwareResourceImpl._version = _version_;
		return this;
	}

	public final SoftwareResource build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(softwareResourceImpl);
		return softwareResourceImpl;
	}
}
