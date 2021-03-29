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

public class CustomMediaTypeBuilder {

	private CustomMediaTypeImpl customMediaTypeImpl;

	public CustomMediaTypeBuilder() {
		customMediaTypeImpl = new CustomMediaTypeImpl();
	}

	public CustomMediaTypeBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		customMediaTypeImpl.id = id;
	}


	final public CustomMediaTypeBuilder _filenameExtension_(String _filenameExtension_) {
		this.customMediaTypeImpl._filenameExtension = _filenameExtension_;
		return this;
	}


	public final CustomMediaType build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(customMediaTypeImpl);
		return customMediaTypeImpl;
	}
}
