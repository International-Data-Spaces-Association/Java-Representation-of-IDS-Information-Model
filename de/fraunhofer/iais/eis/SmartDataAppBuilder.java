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

public class SmartDataAppBuilder {

	private SmartDataAppImpl smartDataAppImpl;

	public SmartDataAppBuilder() {
		smartDataAppImpl = new SmartDataAppImpl();
	}

	public SmartDataAppBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		smartDataAppImpl.id = id;
	}


	final public SmartDataAppBuilder _appEndpoint_(java.util.ArrayList<? extends AppEndpoint> _appEndpoint_) {
		this.smartDataAppImpl._appEndpoint = _appEndpoint_;
		return this;
	}


	final public SmartDataAppBuilder _supportedUsagePolicies_(java.util.ArrayList<? extends UsagePolicyClass> _supportedUsagePolicies_) {
		this.smartDataAppImpl._supportedUsagePolicies = _supportedUsagePolicies_;
		return this;
	}


	final public SmartDataAppBuilder _appDocumentation_(String _appDocumentation_) {
		this.smartDataAppImpl._appDocumentation = _appDocumentation_;
		return this;
	}


	final public SmartDataAppBuilder _appEnvironmentVariables_(String _appEnvironmentVariables_) {
		this.smartDataAppImpl._appEnvironmentVariables = _appEnvironmentVariables_;
		return this;
	}


	final public SmartDataAppBuilder _appStorageConfiguration_(String _appStorageConfiguration_) {
		this.smartDataAppImpl._appStorageConfiguration = _appStorageConfiguration_;
		return this;
	}

	public final SmartDataApp build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(smartDataAppImpl);
		return smartDataAppImpl;
	}
}
