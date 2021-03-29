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
	"Contract offer"@en

	"Contract issued by the Data Provider offering the usage of a Resource at particular conditions."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = ContractOfferImpl.class),
@JsonSubTypes.Type(value = ConnectorbasedOffer.class),

@JsonSubTypes.Type(value = DeleteAfterIntervalOffer.class),

@JsonSubTypes.Type(value = DistributeEcryptedOffer.class),

@JsonSubTypes.Type(value = DurationOffer.class),

@JsonSubTypes.Type(value = EventOffer.class),

@JsonSubTypes.Type(value = IntervalUsageOffer.class),

@JsonSubTypes.Type(value = LoggingOffer.class),

@JsonSubTypes.Type(value = NotMoreThanNOffer.class),

@JsonSubTypes.Type(value = NotificationOffer.class),

@JsonSubTypes.Type(value = PurposeOffer.class),

@JsonSubTypes.Type(value = RentalOffer.class),

@JsonSubTypes.Type(value = RolebasedOffer.class),

@JsonSubTypes.Type(value = SalesOffer.class),

@JsonSubTypes.Type(value = SecurityOffer.class),

@JsonSubTypes.Type(value = SpatialOffer.class),

@JsonSubTypes.Type(value = SwapOffer.class),})
public interface ContractOffer extends Contract {

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
