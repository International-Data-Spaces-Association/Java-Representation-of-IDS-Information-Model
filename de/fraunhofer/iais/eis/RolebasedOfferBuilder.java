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

public class RolebasedOfferBuilder {

	private RolebasedOfferImpl rolebasedOfferImpl;

	public RolebasedOfferBuilder() {
		rolebasedOfferImpl = new RolebasedOfferImpl();
	}

	public RolebasedOfferBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		rolebasedOfferImpl.id = id;
	}



	final public RolebasedOfferBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.rolebasedOfferImpl._permission = _permission_;
		return this;
	}


	final public RolebasedOfferBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.rolebasedOfferImpl._prohibition = _prohibition_;
		return this;
	}


	final public RolebasedOfferBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.rolebasedOfferImpl._obligation = _obligation_;
		return this;
	}


	final public RolebasedOfferBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.rolebasedOfferImpl._contractStart = _contractStart_;
		return this;
	}


	final public RolebasedOfferBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.rolebasedOfferImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public RolebasedOfferBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.rolebasedOfferImpl._contractDate = _contractDate_;
		return this;
	}


	final public RolebasedOfferBuilder _provider_(URI _provider_) {
		this.rolebasedOfferImpl._provider = _provider_;
		return this;
	}


	final public RolebasedOfferBuilder _consumer_(URI _consumer_) {
		this.rolebasedOfferImpl._consumer = _consumer_;
		return this;
	}


	final public RolebasedOfferBuilder _contractDocument_(TextResource _contractDocument_) {
		this.rolebasedOfferImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public RolebasedOfferBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.rolebasedOfferImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final RolebasedOffer build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(rolebasedOfferImpl);
		return rolebasedOfferImpl;
	}
}
