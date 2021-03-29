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

public class GeoPointBuilder {

	private GeoPointImpl geoPointImpl;

	public GeoPointBuilder() {
		geoPointImpl = new GeoPointImpl();
	}

	public GeoPointBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		geoPointImpl.id = id;
	}

	final public GeoPointBuilder _latitude_(float _latitude_) {
		this.geoPointImpl._latitude = _latitude_;
		return this;
	}


	final public GeoPointBuilder _longitude_(float _longitude_) {
		this.geoPointImpl._longitude = _longitude_;
		return this;
	}




	public final GeoPoint build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(geoPointImpl);
		return geoPointImpl;
	}
}
