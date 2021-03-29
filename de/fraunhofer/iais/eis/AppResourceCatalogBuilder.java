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

public class AppResourceCatalogBuilder {

	private AppResourceCatalogImpl appResourceCatalogImpl;

	public AppResourceCatalogBuilder() {
		appResourceCatalogImpl = new AppResourceCatalogImpl();
	}

	public AppResourceCatalogBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		appResourceCatalogImpl.id = id;
	}

	final public AppResourceCatalogBuilder _listedAppResource_(java.util.ArrayList<? extends AppResource> _listedAppResource_) {
		this.appResourceCatalogImpl._listedAppResource = _listedAppResource_;
		return this;
	}



	public final AppResourceCatalog build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(appResourceCatalogImpl);
		return appResourceCatalogImpl;
	}
}
