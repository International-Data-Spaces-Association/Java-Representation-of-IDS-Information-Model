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
	"Permission"@en

	"The class of Permissions as defined in the ODRL ontology."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = PermissionImpl.class),})
public interface Permission extends Rule {

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
	/**
	"pre-duty"@en

	"A Duty imposed by the Rule, which must be executed before the Rule."@en
	*/
	
	
	@JsonProperty("ids:preDuty")
	java.util.ArrayList<? extends Duty> getPreDuty();
	/**
	"post-duty"@en

	"A Duty imposed by the Rule, which must be executed after the Rule."@en
	*/
	
	
	@JsonProperty("ids:postDuty")
	java.util.ArrayList<? extends Duty> getPostDuty();
}
