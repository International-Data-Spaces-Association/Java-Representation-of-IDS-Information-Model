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

public class PermissionBuilder {

	private PermissionImpl permissionImpl;

	public PermissionBuilder() {
		permissionImpl = new PermissionImpl();
	}

	public PermissionBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		permissionImpl.id = id;
	}

	final public PermissionBuilder _preDuty_(java.util.ArrayList<? extends Duty> _preDuty_) {
		this.permissionImpl._preDuty = _preDuty_;
		return this;
	}


	final public PermissionBuilder _postDuty_(java.util.ArrayList<? extends Duty> _postDuty_) {
		this.permissionImpl._postDuty = _postDuty_;
		return this;
	}


	final public PermissionBuilder _constraint_(java.util.ArrayList<? extends AbstractConstraint> _constraint_) {
		this.permissionImpl._constraint = _constraint_;
		return this;
	}


	final public PermissionBuilder _assigner_(java.util.ArrayList<? extends URI> _assigner_) {
		this.permissionImpl._assigner = _assigner_;
		return this;
	}


	final public PermissionBuilder _assignee_(java.util.ArrayList<? extends URI> _assignee_) {
		this.permissionImpl._assignee = _assignee_;
		return this;
	}


	final public PermissionBuilder _target_(URI _target_) {
		this.permissionImpl._target = _target_;
		return this;
	}


	final public PermissionBuilder _action_(java.util.ArrayList<? extends Action> _action_) {
		this.permissionImpl._action = _action_;
		return this;
	}


	final public PermissionBuilder _assetRefinement_(AbstractConstraint _assetRefinement_) {
		this.permissionImpl._assetRefinement = _assetRefinement_;
		return this;
	}


	final public PermissionBuilder _title_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _title_) {
		this.permissionImpl._title = _title_;
		return this;
	}


	final public PermissionBuilder _description_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _description_) {
		this.permissionImpl._description = _description_;
		return this;
	}



	public final Permission build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(permissionImpl);
		return permissionImpl;
	}
}
