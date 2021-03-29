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

public class PersonBuilder {

	private PersonImpl personImpl;

	public PersonBuilder() {
		personImpl = new PersonImpl();
	}

	public PersonBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		personImpl.id = id;
	}

	final public PersonBuilder _phoneNumber_(java.util.ArrayList<? extends String> _phoneNumber_) {
		this.personImpl._phoneNumber = _phoneNumber_;
		return this;
	}


	final public PersonBuilder _emailAddress_(java.util.ArrayList<? extends String> _emailAddress_) {
		this.personImpl._emailAddress = _emailAddress_;
		return this;
	}


	final public PersonBuilder _familyName_(String _familyName_) {
		this.personImpl._familyName = _familyName_;
		return this;
	}


	final public PersonBuilder _givenName_(String _givenName_) {
		this.personImpl._givenName = _givenName_;
		return this;
	}


	final public PersonBuilder _homepage_(String _homepage_) {
		this.personImpl._homepage = _homepage_;
		return this;
	}


	public final Person build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(personImpl);
		return personImpl;
	}
}
