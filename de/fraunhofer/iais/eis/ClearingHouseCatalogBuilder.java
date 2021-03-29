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

public class ClearingHouseCatalogBuilder {

	private ClearingHouseCatalogImpl clearingHouseCatalogImpl;

	public ClearingHouseCatalogBuilder() {
		clearingHouseCatalogImpl = new ClearingHouseCatalogImpl();
	}

	public ClearingHouseCatalogBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		clearingHouseCatalogImpl.id = id;
	}

	final public ClearingHouseCatalogBuilder _listedClearingHouse_(java.util.ArrayList<? extends ClearingHouse> _listedClearingHouse_) {
		this.clearingHouseCatalogImpl._listedClearingHouse = _listedClearingHouse_;
		return this;
	}



	public final ClearingHouseCatalog build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(clearingHouseCatalogImpl);
		return clearingHouseCatalogImpl;
	}
}
