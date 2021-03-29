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

public class AppStoreCatalogBuilder {

	private AppStoreCatalogImpl appStoreCatalogImpl;

	public AppStoreCatalogBuilder() {
		appStoreCatalogImpl = new AppStoreCatalogImpl();
	}

	public AppStoreCatalogBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		appStoreCatalogImpl.id = id;
	}


	final public AppStoreCatalogBuilder _listedConnector_(java.util.ArrayList<? extends Connector> _listedConnector_) {
		this.appStoreCatalogImpl._listedConnector = _listedConnector_;
		return this;
	}



	public final AppStoreCatalog build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(appStoreCatalogImpl);
		return appStoreCatalogImpl;
	}
}
