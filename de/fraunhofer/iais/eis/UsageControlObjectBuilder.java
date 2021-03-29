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

public class UsageControlObjectBuilder {

	private UsageControlObjectImpl usageControlObjectImpl;

	public UsageControlObjectBuilder() {
		usageControlObjectImpl = new UsageControlObjectImpl();
	}

	public UsageControlObjectBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		usageControlObjectImpl.id = id;
	}

	final public UsageControlObjectBuilder _data_(URI _data_) {
		this.usageControlObjectImpl._data = _data_;
		return this;
	}


	final public UsageControlObjectBuilder _contract_(java.util.ArrayList<? extends ContractAgreement> _contract_) {
		this.usageControlObjectImpl._contract = _contract_;
		return this;
	}


	final public UsageControlObjectBuilder _hasState_(java.util.ArrayList<? extends ArtifactState> _hasState_) {
		this.usageControlObjectImpl._hasState = _hasState_;
		return this;
	}


	final public UsageControlObjectBuilder _user_(Participant _user_) {
		this.usageControlObjectImpl._user = _user_;
		return this;
	}


	final public UsageControlObjectBuilder _source_(URI _source_) {
		this.usageControlObjectImpl._source = _source_;
		return this;
	}


	final public UsageControlObjectBuilder _usageDuration_(javax.xml.datatype.Duration _usageDuration_) {
		this.usageControlObjectImpl._usageDuration = _usageDuration_;
		return this;
	}


	final public UsageControlObjectBuilder _accessed_(XMLGregorianCalendar _accessed_) {
		this.usageControlObjectImpl._accessed = _accessed_;
		return this;
	}


	final public UsageControlObjectBuilder _requester_(URI _requester_) {
		this.usageControlObjectImpl._requester = _requester_;
		return this;
	}


	final public UsageControlObjectBuilder _created_(XMLGregorianCalendar _created_) {
		this.usageControlObjectImpl._created = _created_;
		return this;
	}


	final public UsageControlObjectBuilder _modified_(XMLGregorianCalendar _modified_) {
		this.usageControlObjectImpl._modified = _modified_;
		return this;
	}


	final public UsageControlObjectBuilder _action_(java.util.ArrayList<? extends Action> _action_) {
		this.usageControlObjectImpl._action = _action_;
		return this;
	}

	public final UsageControlObject build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(usageControlObjectImpl);
		return usageControlObjectImpl;
	}
}
