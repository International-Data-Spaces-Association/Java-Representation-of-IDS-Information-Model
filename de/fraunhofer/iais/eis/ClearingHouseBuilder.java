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

public class ClearingHouseBuilder {

	private ClearingHouseImpl clearingHouseImpl;

	public ClearingHouseBuilder() {
		clearingHouseImpl = new ClearingHouseImpl();
	}

	public ClearingHouseBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		clearingHouseImpl.id = id;
	}


	final public ClearingHouseBuilder _maintainer_(URI _maintainer_) {
		this.clearingHouseImpl._maintainer = _maintainer_;
		return this;
	}


	final public ClearingHouseBuilder _curator_(URI _curator_) {
		this.clearingHouseImpl._curator = _curator_;
		return this;
	}


	final public ClearingHouseBuilder _inboundModelVersion_(java.util.ArrayList<? extends String> _inboundModelVersion_) {
		this.clearingHouseImpl._inboundModelVersion = _inboundModelVersion_;
		return this;
	}


	final public ClearingHouseBuilder _outboundModelVersion_(String _outboundModelVersion_) {
		this.clearingHouseImpl._outboundModelVersion = _outboundModelVersion_;
		return this;
	}


	final public ClearingHouseBuilder _physicalLocation_(Location _physicalLocation_) {
		this.clearingHouseImpl._physicalLocation = _physicalLocation_;
		return this;
	}


	final public ClearingHouseBuilder _componentCertification_(ComponentCertification _componentCertification_) {
		this.clearingHouseImpl._componentCertification = _componentCertification_;
		return this;
	}


	final public ClearingHouseBuilder _publicKey_(PublicKey _publicKey_) {
		this.clearingHouseImpl._publicKey = _publicKey_;
		return this;
	}


	final public ClearingHouseBuilder _version_(String _version_) {
		this.clearingHouseImpl._version = _version_;
		return this;
	}


	final public ClearingHouseBuilder _title_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _title_) {
		this.clearingHouseImpl._title = _title_;
		return this;
	}


	final public ClearingHouseBuilder _description_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _description_) {
		this.clearingHouseImpl._description = _description_;
		return this;
	}

	public final ClearingHouse build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(clearingHouseImpl);
		return clearingHouseImpl;
	}
}
