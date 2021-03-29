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

public class AgentBuilder {

	private AgentImpl agentImpl;

	public AgentBuilder() {
		agentImpl = new AgentImpl();
	}

	public AgentBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		agentImpl.id = id;
	}


	final public AgentBuilder _title_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _title_) {
		this.agentImpl._title = _title_;
		return this;
	}


	final public AgentBuilder _description_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _description_) {
		this.agentImpl._description = _description_;
		return this;
	}



	public final Agent build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(agentImpl);
		return agentImpl;
	}
}
