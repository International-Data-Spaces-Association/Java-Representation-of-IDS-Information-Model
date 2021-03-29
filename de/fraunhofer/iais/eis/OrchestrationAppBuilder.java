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

public class OrchestrationAppBuilder {

	private OrchestrationAppImpl orchestrationAppImpl;

	public OrchestrationAppBuilder() {
		orchestrationAppImpl = new OrchestrationAppImpl();
	}

	public OrchestrationAppBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		orchestrationAppImpl.id = id;
	}


	final public OrchestrationAppBuilder _appEndpoint_(java.util.ArrayList<? extends AppEndpoint> _appEndpoint_) {
		this.orchestrationAppImpl._appEndpoint = _appEndpoint_;
		return this;
	}


	final public OrchestrationAppBuilder _supportedUsagePolicies_(java.util.ArrayList<? extends UsagePolicyClass> _supportedUsagePolicies_) {
		this.orchestrationAppImpl._supportedUsagePolicies = _supportedUsagePolicies_;
		return this;
	}


	final public OrchestrationAppBuilder _appDocumentation_(String _appDocumentation_) {
		this.orchestrationAppImpl._appDocumentation = _appDocumentation_;
		return this;
	}


	final public OrchestrationAppBuilder _appEnvironmentVariables_(String _appEnvironmentVariables_) {
		this.orchestrationAppImpl._appEnvironmentVariables = _appEnvironmentVariables_;
		return this;
	}


	final public OrchestrationAppBuilder _appStorageConfiguration_(String _appStorageConfiguration_) {
		this.orchestrationAppImpl._appStorageConfiguration = _appStorageConfiguration_;
		return this;
	}

	public final OrchestrationApp build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(orchestrationAppImpl);
		return orchestrationAppImpl;
	}
}
