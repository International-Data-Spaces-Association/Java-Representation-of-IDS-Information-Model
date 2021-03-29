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

public class BoundingPolygonBuilder {

	private BoundingPolygonImpl boundingPolygonImpl;

	public BoundingPolygonBuilder() {
		boundingPolygonImpl = new BoundingPolygonImpl();
	}

	public BoundingPolygonBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		boundingPolygonImpl.id = id;
	}

	final public BoundingPolygonBuilder _geoPoint_(java.util.ArrayList<? extends GeoPoint> _geoPoint_) {
		this.boundingPolygonImpl._geoPoint = _geoPoint_;
		return this;
	}






	public final BoundingPolygon build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(boundingPolygonImpl);
		return boundingPolygonImpl;
	}
}
