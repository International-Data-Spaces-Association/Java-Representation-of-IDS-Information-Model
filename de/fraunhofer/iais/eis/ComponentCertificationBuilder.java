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

public class ComponentCertificationBuilder {

	private ComponentCertificationImpl componentCertificationImpl;

	public ComponentCertificationBuilder() {
		componentCertificationImpl = new ComponentCertificationImpl();
	}

	public ComponentCertificationBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		componentCertificationImpl.id = id;
	}


	final public ComponentCertificationBuilder _certificationLevel_(CertificationLevel _certificationLevel_) {
		this.componentCertificationImpl._certificationLevel = _certificationLevel_;
		return this;
	}


	final public ComponentCertificationBuilder _lastValidDate_(XMLGregorianCalendar _lastValidDate_) {
		this.componentCertificationImpl._lastValidDate = _lastValidDate_;
		return this;
	}


	final public ComponentCertificationBuilder _evaluationFacility_(EvaluationFacility _evaluationFacility_) {
		this.componentCertificationImpl._evaluationFacility = _evaluationFacility_;
		return this;
	}


	final public ComponentCertificationBuilder _version_(String _version_) {
		this.componentCertificationImpl._version = _version_;
		return this;
	}


	final public ComponentCertificationBuilder _title_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _title_) {
		this.componentCertificationImpl._title = _title_;
		return this;
	}


	final public ComponentCertificationBuilder _description_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _description_) {
		this.componentCertificationImpl._description = _description_;
		return this;
	}


	public final ComponentCertification build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(componentCertificationImpl);
		return componentCertificationImpl;
	}
}
