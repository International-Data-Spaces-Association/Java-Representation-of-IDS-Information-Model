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

public class ProhibitionBuilder {

	private ProhibitionImpl prohibitionImpl;

	public ProhibitionBuilder() {
		prohibitionImpl = new ProhibitionImpl();
	}

	public ProhibitionBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		prohibitionImpl.id = id;
	}


	final public ProhibitionBuilder _constraint_(java.util.ArrayList<? extends AbstractConstraint> _constraint_) {
		this.prohibitionImpl._constraint = _constraint_;
		return this;
	}


	final public ProhibitionBuilder _assigner_(java.util.ArrayList<? extends URI> _assigner_) {
		this.prohibitionImpl._assigner = _assigner_;
		return this;
	}


	final public ProhibitionBuilder _assignee_(java.util.ArrayList<? extends URI> _assignee_) {
		this.prohibitionImpl._assignee = _assignee_;
		return this;
	}


	final public ProhibitionBuilder _target_(URI _target_) {
		this.prohibitionImpl._target = _target_;
		return this;
	}


	final public ProhibitionBuilder _action_(java.util.ArrayList<? extends Action> _action_) {
		this.prohibitionImpl._action = _action_;
		return this;
	}


	final public ProhibitionBuilder _assetRefinement_(AbstractConstraint _assetRefinement_) {
		this.prohibitionImpl._assetRefinement = _assetRefinement_;
		return this;
	}


	final public ProhibitionBuilder _title_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _title_) {
		this.prohibitionImpl._title = _title_;
		return this;
	}


	final public ProhibitionBuilder _description_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _description_) {
		this.prohibitionImpl._description = _description_;
		return this;
	}



	public final Prohibition build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(prohibitionImpl);
		return prohibitionImpl;
	}
}
