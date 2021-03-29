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

public class RolebasedRequestBuilder {

	private RolebasedRequestImpl rolebasedRequestImpl;

	public RolebasedRequestBuilder() {
		rolebasedRequestImpl = new RolebasedRequestImpl();
	}

	public RolebasedRequestBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		rolebasedRequestImpl.id = id;
	}



	final public RolebasedRequestBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.rolebasedRequestImpl._permission = _permission_;
		return this;
	}


	final public RolebasedRequestBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.rolebasedRequestImpl._prohibition = _prohibition_;
		return this;
	}


	final public RolebasedRequestBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.rolebasedRequestImpl._obligation = _obligation_;
		return this;
	}


	final public RolebasedRequestBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.rolebasedRequestImpl._contractStart = _contractStart_;
		return this;
	}


	final public RolebasedRequestBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.rolebasedRequestImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public RolebasedRequestBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.rolebasedRequestImpl._contractDate = _contractDate_;
		return this;
	}


	final public RolebasedRequestBuilder _provider_(URI _provider_) {
		this.rolebasedRequestImpl._provider = _provider_;
		return this;
	}


	final public RolebasedRequestBuilder _consumer_(URI _consumer_) {
		this.rolebasedRequestImpl._consumer = _consumer_;
		return this;
	}


	final public RolebasedRequestBuilder _contractDocument_(TextResource _contractDocument_) {
		this.rolebasedRequestImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public RolebasedRequestBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.rolebasedRequestImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final RolebasedRequest build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(rolebasedRequestImpl);
		return rolebasedRequestImpl;
	}
}
