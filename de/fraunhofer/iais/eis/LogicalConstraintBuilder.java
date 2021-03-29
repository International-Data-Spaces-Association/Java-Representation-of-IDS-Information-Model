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

public class LogicalConstraintBuilder {

	private LogicalConstraintImpl logicalConstraintImpl;

	public LogicalConstraintBuilder() {
		logicalConstraintImpl = new LogicalConstraintImpl();
	}

	public LogicalConstraintBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		logicalConstraintImpl.id = id;
	}

	final public LogicalConstraintBuilder _and_(java.util.ArrayList<? extends Constraint> _and_) {
		this.logicalConstraintImpl._and = _and_;
		return this;
	}


	final public LogicalConstraintBuilder _or_(java.util.ArrayList<? extends Constraint> _or_) {
		this.logicalConstraintImpl._or = _or_;
		return this;
	}


	final public LogicalConstraintBuilder _xone_(java.util.ArrayList<? extends Constraint> _xone_) {
		this.logicalConstraintImpl._xone = _xone_;
		return this;
	}




	public final LogicalConstraint build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(logicalConstraintImpl);
		return logicalConstraintImpl;
	}
}
