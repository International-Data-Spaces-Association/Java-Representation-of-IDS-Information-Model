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

public class BrokerCatalogBuilder {

	private BrokerCatalogImpl brokerCatalogImpl;

	public BrokerCatalogBuilder() {
		brokerCatalogImpl = new BrokerCatalogImpl();
	}

	public BrokerCatalogBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		brokerCatalogImpl.id = id;
	}


	final public BrokerCatalogBuilder _listedConnector_(java.util.ArrayList<? extends Connector> _listedConnector_) {
		this.brokerCatalogImpl._listedConnector = _listedConnector_;
		return this;
	}



	public final BrokerCatalog build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(brokerCatalogImpl);
		return brokerCatalogImpl;
	}
}
