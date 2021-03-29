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

public class IANAMediaTypeBuilder {

	private IANAMediaTypeImpl iANAMediaTypeImpl;

	public IANAMediaTypeBuilder() {
		iANAMediaTypeImpl = new IANAMediaTypeImpl();
	}

	public IANAMediaTypeBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		iANAMediaTypeImpl.id = id;
	}


	final public IANAMediaTypeBuilder _filenameExtension_(String _filenameExtension_) {
		this.iANAMediaTypeImpl._filenameExtension = _filenameExtension_;
		return this;
	}


	public final IANAMediaType build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(iANAMediaTypeImpl);
		return iANAMediaTypeImpl;
	}
}
