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

public class RolebasedAgreementBuilder {

	private RolebasedAgreementImpl rolebasedAgreementImpl;

	public RolebasedAgreementBuilder() {
		rolebasedAgreementImpl = new RolebasedAgreementImpl();
	}

	public RolebasedAgreementBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		rolebasedAgreementImpl.id = id;
	}



	final public RolebasedAgreementBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.rolebasedAgreementImpl._permission = _permission_;
		return this;
	}


	final public RolebasedAgreementBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.rolebasedAgreementImpl._prohibition = _prohibition_;
		return this;
	}


	final public RolebasedAgreementBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.rolebasedAgreementImpl._obligation = _obligation_;
		return this;
	}


	final public RolebasedAgreementBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.rolebasedAgreementImpl._contractStart = _contractStart_;
		return this;
	}


	final public RolebasedAgreementBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.rolebasedAgreementImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public RolebasedAgreementBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.rolebasedAgreementImpl._contractDate = _contractDate_;
		return this;
	}


	final public RolebasedAgreementBuilder _provider_(URI _provider_) {
		this.rolebasedAgreementImpl._provider = _provider_;
		return this;
	}


	final public RolebasedAgreementBuilder _consumer_(URI _consumer_) {
		this.rolebasedAgreementImpl._consumer = _consumer_;
		return this;
	}


	final public RolebasedAgreementBuilder _contractDocument_(TextResource _contractDocument_) {
		this.rolebasedAgreementImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public RolebasedAgreementBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.rolebasedAgreementImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final RolebasedAgreement build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(rolebasedAgreementImpl);
		return rolebasedAgreementImpl;
	}
}
