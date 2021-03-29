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

public class DataResourceBuilder {

	private DataResourceImpl dataResourceImpl;

	public DataResourceBuilder() {
		dataResourceImpl = new DataResourceImpl();
	}

	public DataResourceBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		dataResourceImpl.id = id;
	}


	final public DataResourceBuilder _standardLicense_(URI _standardLicense_) {
		this.dataResourceImpl._standardLicense = _standardLicense_;
		return this;
	}


	final public DataResourceBuilder _customLicense_(URI _customLicense_) {
		this.dataResourceImpl._customLicense = _customLicense_;
		return this;
	}


	final public DataResourceBuilder _resourceEndpoint_(java.util.ArrayList<? extends ConnectorEndpoint> _resourceEndpoint_) {
		this.dataResourceImpl._resourceEndpoint = _resourceEndpoint_;
		return this;
	}


	final public DataResourceBuilder _resourcePart_(java.util.ArrayList<? extends Resource> _resourcePart_) {
		this.dataResourceImpl._resourcePart = _resourcePart_;
		return this;
	}


	final public DataResourceBuilder _contractOffer_(java.util.ArrayList<? extends ContractOffer> _contractOffer_) {
		this.dataResourceImpl._contractOffer = _contractOffer_;
		return this;
	}


	final public DataResourceBuilder _sample_(java.util.ArrayList<? extends Resource> _sample_) {
		this.dataResourceImpl._sample = _sample_;
		return this;
	}


	final public DataResourceBuilder _publisher_(URI _publisher_) {
		this.dataResourceImpl._publisher = _publisher_;
		return this;
	}


	final public DataResourceBuilder _sovereign_(URI _sovereign_) {
		this.dataResourceImpl._sovereign = _sovereign_;
		return this;
	}


	final public DataResourceBuilder _variant_(Resource _variant_) {
		this.dataResourceImpl._variant = _variant_;
		return this;
	}




	final public DataResourceBuilder _contentPart_(java.util.ArrayList<? extends DigitalContent> _contentPart_) {
		this.dataResourceImpl._contentPart = _contentPart_;
		return this;
	}


	final public DataResourceBuilder _spatialCoverage_(java.util.ArrayList<? extends Location> _spatialCoverage_) {
		this.dataResourceImpl._spatialCoverage = _spatialCoverage_;
		return this;
	}


	final public DataResourceBuilder _temporalCoverage_(java.util.ArrayList<? extends TemporalEntity> _temporalCoverage_) {
		this.dataResourceImpl._temporalCoverage = _temporalCoverage_;
		return this;
	}


	final public DataResourceBuilder _theme_(java.util.ArrayList<? extends URI> _theme_) {
		this.dataResourceImpl._theme = _theme_;
		return this;
	}


	final public DataResourceBuilder _keyword_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _keyword_) {
		this.dataResourceImpl._keyword = _keyword_;
		return this;
	}


	final public DataResourceBuilder _representation_(java.util.ArrayList<? extends Representation> _representation_) {
		this.dataResourceImpl._representation = _representation_;
		return this;
	}


	final public DataResourceBuilder _contentType_(ContentType _contentType_) {
		this.dataResourceImpl._contentType = _contentType_;
		return this;
	}


	final public DataResourceBuilder _defaultRepresentation_(java.util.ArrayList<? extends Representation> _defaultRepresentation_) {
		this.dataResourceImpl._defaultRepresentation = _defaultRepresentation_;
		return this;
	}


	final public DataResourceBuilder _temporalResolution_(Frequency _temporalResolution_) {
		this.dataResourceImpl._temporalResolution = _temporalResolution_;
		return this;
	}


	final public DataResourceBuilder _accrualPeriodicity_(Frequency _accrualPeriodicity_) {
		this.dataResourceImpl._accrualPeriodicity = _accrualPeriodicity_;
		return this;
	}


	final public DataResourceBuilder _contentStandard_(URI _contentStandard_) {
		this.dataResourceImpl._contentStandard = _contentStandard_;
		return this;
	}


	final public DataResourceBuilder _language_(java.util.ArrayList<? extends Language> _language_) {
		this.dataResourceImpl._language = _language_;
		return this;
	}


	final public DataResourceBuilder _created_(XMLGregorianCalendar _created_) {
		this.dataResourceImpl._created = _created_;
		return this;
	}


	final public DataResourceBuilder _modified_(XMLGregorianCalendar _modified_) {
		this.dataResourceImpl._modified = _modified_;
		return this;
	}


	final public DataResourceBuilder _title_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _title_) {
		this.dataResourceImpl._title = _title_;
		return this;
	}


	final public DataResourceBuilder _description_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _description_) {
		this.dataResourceImpl._description = _description_;
		return this;
	}



	final public DataResourceBuilder _shapesGraph_(URI _shapesGraph_) {
		this.dataResourceImpl._shapesGraph = _shapesGraph_;
		return this;
	}


	final public DataResourceBuilder _version_(String _version_) {
		this.dataResourceImpl._version = _version_;
		return this;
	}

	public final DataResource build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(dataResourceImpl);
		return dataResourceImpl;
	}
}
