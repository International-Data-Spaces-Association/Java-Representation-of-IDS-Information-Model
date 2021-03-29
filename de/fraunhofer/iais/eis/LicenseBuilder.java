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

public class LicenseBuilder {

	private LicenseImpl licenseImpl;

	public LicenseBuilder() {
		licenseImpl = new LicenseImpl();
	}

	public LicenseBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		licenseImpl.id = id;
	}


	public final License build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(licenseImpl);
		return licenseImpl;
	}
}
