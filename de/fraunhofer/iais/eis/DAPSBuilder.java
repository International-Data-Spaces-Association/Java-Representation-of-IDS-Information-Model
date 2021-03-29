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

public class DAPSBuilder {

	private DAPSImpl dAPSImpl;

	public DAPSBuilder() {
		dAPSImpl = new DAPSImpl();
	}

	public DAPSBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		dAPSImpl.id = id;
	}


	final public DAPSBuilder _maintainer_(URI _maintainer_) {
		this.dAPSImpl._maintainer = _maintainer_;
		return this;
	}


	final public DAPSBuilder _curator_(URI _curator_) {
		this.dAPSImpl._curator = _curator_;
		return this;
	}


	final public DAPSBuilder _inboundModelVersion_(java.util.ArrayList<? extends String> _inboundModelVersion_) {
		this.dAPSImpl._inboundModelVersion = _inboundModelVersion_;
		return this;
	}


	final public DAPSBuilder _outboundModelVersion_(String _outboundModelVersion_) {
		this.dAPSImpl._outboundModelVersion = _outboundModelVersion_;
		return this;
	}


	final public DAPSBuilder _physicalLocation_(Location _physicalLocation_) {
		this.dAPSImpl._physicalLocation = _physicalLocation_;
		return this;
	}


	final public DAPSBuilder _componentCertification_(ComponentCertification _componentCertification_) {
		this.dAPSImpl._componentCertification = _componentCertification_;
		return this;
	}


	final public DAPSBuilder _publicKey_(PublicKey _publicKey_) {
		this.dAPSImpl._publicKey = _publicKey_;
		return this;
	}


	final public DAPSBuilder _version_(String _version_) {
		this.dAPSImpl._version = _version_;
		return this;
	}


	final public DAPSBuilder _title_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _title_) {
		this.dAPSImpl._title = _title_;
		return this;
	}


	final public DAPSBuilder _description_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _description_) {
		this.dAPSImpl._description = _description_;
		return this;
	}

	public final DAPS build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(dAPSImpl);
		return dAPSImpl;
	}
}
