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

/**
	"Security guarantee"@en

	"Security guarantee claimed by a security profile."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = SecurityGuaranteeImpl.class),
@JsonSubTypes.Type(value = AppExecutionResources.class),

@JsonSubTypes.Type(value = AuditGuarantee.class),

@JsonSubTypes.Type(value = AuthenticationGuarantee.class),

@JsonSubTypes.Type(value = IntegrityGuarantee.class),

@JsonSubTypes.Type(value = IntegrityVerificationScopeGuarantee.class),

@JsonSubTypes.Type(value = LocalDataConfidentialityGuarantee.class),

@JsonSubTypes.Type(value = ServiceIsolationGuarantee.class),

@JsonSubTypes.Type(value = UsageControlGuarantee.class),})
public interface SecurityGuarantee {

	// standard methods

	@JsonProperty("@id")
	@javax.validation.constraints.NotNull URI getId();
	java.util.List<TypedLiteral> getLabel();
	java.util.List<TypedLiteral> getComment();
	String toRdf();

	// getter and setter for generic property map
	public java.util.Map<String,Object> getProperties();
	public void setProperty(String property, Object value);

	// accessor methods as derived from information model

}
