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

public class AppRepresentationBuilder {

	private AppRepresentationImpl appRepresentationImpl;

	public AppRepresentationBuilder() {
		appRepresentationImpl = new AppRepresentationImpl();
	}

	public AppRepresentationBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		appRepresentationImpl.id = id;
	}

	final public AppRepresentationBuilder _dataAppInformation_(DataApp _dataAppInformation_) {
		this.appRepresentationImpl._dataAppInformation = _dataAppInformation_;
		return this;
	}


	final public AppRepresentationBuilder _dataAppDistributionService_(URI _dataAppDistributionService_) {
		this.appRepresentationImpl._dataAppDistributionService = _dataAppDistributionService_;
		return this;
	}


	final public AppRepresentationBuilder _dataAppRuntimeEnvironment_(String _dataAppRuntimeEnvironment_) {
		this.appRepresentationImpl._dataAppRuntimeEnvironment = _dataAppRuntimeEnvironment_;
		return this;
	}



	final public AppRepresentationBuilder _instance_(java.util.ArrayList<? extends RepresentationInstance> _instance_) {
		this.appRepresentationImpl._instance = _instance_;
		return this;
	}


	final public AppRepresentationBuilder _mediaType_(MediaType _mediaType_) {
		this.appRepresentationImpl._mediaType = _mediaType_;
		return this;
	}


	final public AppRepresentationBuilder _representationStandard_(URI _representationStandard_) {
		this.appRepresentationImpl._representationStandard = _representationStandard_;
		return this;
	}


	final public AppRepresentationBuilder _language_(Language _language_) {
		this.appRepresentationImpl._language = _language_;
		return this;
	}


	final public AppRepresentationBuilder _created_(XMLGregorianCalendar _created_) {
		this.appRepresentationImpl._created = _created_;
		return this;
	}


	final public AppRepresentationBuilder _modified_(XMLGregorianCalendar _modified_) {
		this.appRepresentationImpl._modified = _modified_;
		return this;
	}




	final public AppRepresentationBuilder _shapesGraph_(URI _shapesGraph_) {
		this.appRepresentationImpl._shapesGraph = _shapesGraph_;
		return this;
	}


	public final AppRepresentation build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(appRepresentationImpl);
		return appRepresentationImpl;
	}
}
