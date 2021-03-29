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

public class ConnectorCatalogBuilder {

	private ConnectorCatalogImpl connectorCatalogImpl;

	public ConnectorCatalogBuilder() {
		connectorCatalogImpl = new ConnectorCatalogImpl();
	}

	public ConnectorCatalogBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		connectorCatalogImpl.id = id;
	}

	final public ConnectorCatalogBuilder _listedConnector_(java.util.ArrayList<? extends Connector> _listedConnector_) {
		this.connectorCatalogImpl._listedConnector = _listedConnector_;
		return this;
	}



	public final ConnectorCatalog build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(connectorCatalogImpl);
		return connectorCatalogImpl;
	}
}
