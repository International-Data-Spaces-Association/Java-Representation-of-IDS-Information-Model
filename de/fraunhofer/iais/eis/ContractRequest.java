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
	"Contract request"@en

	"Contract issued by the Data Consumer requesting the usage of a Resource at particular conditions."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = ContractRequestImpl.class),
@JsonSubTypes.Type(value = ConnectorbasedRequest.class),

@JsonSubTypes.Type(value = DeleteAfterIntervalRequest.class),

@JsonSubTypes.Type(value = DistributeEcryptedRequest.class),

@JsonSubTypes.Type(value = DurationRequest.class),

@JsonSubTypes.Type(value = EventRequest.class),

@JsonSubTypes.Type(value = IntervalUsageRequest.class),

@JsonSubTypes.Type(value = LoggingRequest.class),

@JsonSubTypes.Type(value = NotMoreThanNRequest.class),

@JsonSubTypes.Type(value = NotificationRequest.class),

@JsonSubTypes.Type(value = PurposeRequest.class),

@JsonSubTypes.Type(value = RentalRequest.class),

@JsonSubTypes.Type(value = RolebasedRequest.class),

@JsonSubTypes.Type(value = SalesRequest.class),

@JsonSubTypes.Type(value = SecurityRequest.class),

@JsonSubTypes.Type(value = SpatialRequest.class),

@JsonSubTypes.Type(value = SwapRequest.class),})
public interface ContractRequest extends Contract {

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
