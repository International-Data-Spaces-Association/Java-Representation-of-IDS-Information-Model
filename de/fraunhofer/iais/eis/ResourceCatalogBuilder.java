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

public class ResourceCatalogBuilder {

	private ResourceCatalogImpl resourceCatalogImpl;

	public ResourceCatalogBuilder() {
		resourceCatalogImpl = new ResourceCatalogImpl();
	}

	public ResourceCatalogBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		resourceCatalogImpl.id = id;
	}

	final public ResourceCatalogBuilder _requestedResource_(java.util.ArrayList<? extends Resource> _requestedResource_) {
		this.resourceCatalogImpl._requestedResource = _requestedResource_;
		return this;
	}


	final public ResourceCatalogBuilder _offeredResource_(java.util.ArrayList<? extends Resource> _offeredResource_) {
		this.resourceCatalogImpl._offeredResource = _offeredResource_;
		return this;
	}



	public final ResourceCatalog build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(resourceCatalogImpl);
		return resourceCatalogImpl;
	}
}
