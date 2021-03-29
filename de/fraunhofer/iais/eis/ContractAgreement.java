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
	"Contract agreement"@en

	"Contract governing the actual usage of a Resource that has been agreed by all parties."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = ContractAgreementImpl.class),
@JsonSubTypes.Type(value = ConnectorbasedAgreement.class),

@JsonSubTypes.Type(value = DeleteAfterIntervalAgreement.class),

@JsonSubTypes.Type(value = DistributeEcryptedAgreement.class),

@JsonSubTypes.Type(value = DurationAgreement.class),

@JsonSubTypes.Type(value = EventAgreement.class),

@JsonSubTypes.Type(value = IntervalUsageAgreement.class),

@JsonSubTypes.Type(value = LoggingAgreement.class),

@JsonSubTypes.Type(value = NotMoreThanNAgreement.class),

@JsonSubTypes.Type(value = NotificationAgreement.class),

@JsonSubTypes.Type(value = PurposeAgreement.class),

@JsonSubTypes.Type(value = RentalAgreement.class),

@JsonSubTypes.Type(value = RolebasedAgreement.class),

@JsonSubTypes.Type(value = SalesAgreement.class),

@JsonSubTypes.Type(value = SecurityAgreement.class),

@JsonSubTypes.Type(value = SpatialAgreement.class),

@JsonSubTypes.Type(value = SwapAgreement.class),})
public interface ContractAgreement extends Contract {

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
