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

public class DutyBuilder {

	private DutyImpl dutyImpl;

	public DutyBuilder() {
		dutyImpl = new DutyImpl();
	}

	public DutyBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		dutyImpl.id = id;
	}


	final public DutyBuilder _constraint_(java.util.ArrayList<? extends AbstractConstraint> _constraint_) {
		this.dutyImpl._constraint = _constraint_;
		return this;
	}


	final public DutyBuilder _assigner_(java.util.ArrayList<? extends URI> _assigner_) {
		this.dutyImpl._assigner = _assigner_;
		return this;
	}


	final public DutyBuilder _assignee_(java.util.ArrayList<? extends URI> _assignee_) {
		this.dutyImpl._assignee = _assignee_;
		return this;
	}


	final public DutyBuilder _target_(URI _target_) {
		this.dutyImpl._target = _target_;
		return this;
	}


	final public DutyBuilder _action_(java.util.ArrayList<? extends Action> _action_) {
		this.dutyImpl._action = _action_;
		return this;
	}


	final public DutyBuilder _assetRefinement_(AbstractConstraint _assetRefinement_) {
		this.dutyImpl._assetRefinement = _assetRefinement_;
		return this;
	}


	final public DutyBuilder _title_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _title_) {
		this.dutyImpl._title = _title_;
		return this;
	}


	final public DutyBuilder _description_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _description_) {
		this.dutyImpl._description = _description_;
		return this;
	}



	public final Duty build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(dutyImpl);
		return dutyImpl;
	}
}
