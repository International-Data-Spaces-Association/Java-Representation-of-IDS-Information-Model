package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The class of persons (people)
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = PersonImpl.class)
})
public interface Person extends ModelClass {

    // standard methods

    /**
     * This function retrieves the ID of the current object (can be set via the constructor of the
     * builder class)
     * 
     * @return ID of current object as URI
     */
    @JsonProperty("@id")
    @NotNull
    public URI getId();

    /**
     * This function retrieves a human readable label about the current class, as defined in the
     * ontology. This label could, for example, be used as a field heading in a user interface
     * 
     * @return Human readable label
     */
    public List<TypedLiteral> getLabel();

    /**
     * This function retrieves a human readable explanatory comment about the current class, as defined
     * in the ontology. This comment could, for example, be used as a tooltip in a user interface
     * 
     * @return Human readable explanatory comment
     */
    public List<TypedLiteral> getComment();

    public String toRdf();

    // getter and setter for generic property map
    public Map<String, Object> getProperties();

    public void setProperty(String property, Object value);

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Family name of a Person.
     *
     * More information under https://w3id.org/idsa/core/familyName
     *
     * @return Returns the String for the property _familyName.
     */
    @JsonProperty("ids:familyName")
    String getFamilyName();

    /**
     * Family name of a Person.
     *
     * More information under https://w3id.org/idsa/core/familyName
     *
     * @param _familyName_ desired value for the property _familyName.
     */
    void setFamilyName(String _familyName_);

    /**
     * Given name of a Person.
     *
     * More information under https://w3id.org/idsa/core/givenName
     *
     * @return Returns the String for the property _givenName.
     */
    @JsonProperty("ids:givenName")
    String getGivenName();

    /**
     * Given name of a Person.
     *
     * More information under https://w3id.org/idsa/core/givenName
     *
     * @param _givenName_ desired value for the property _givenName.
     */
    void setGivenName(String _givenName_);

    /**
     * Phone number of a person.
     *
     * More information under https://w3id.org/idsa/core/phoneNumber
     *
     * @return Returns the List of Strings for the property _phoneNumber.
     */
    @JsonProperty("ids:phoneNumber")
    List<String> getPhoneNumber();

    /**
     * Phone number of a person.
     *
     * More information under https://w3id.org/idsa/core/phoneNumber
     *
     * @param _phoneNumber_ desired value for the property _phoneNumber.
     */
    void setPhoneNumber(List<String> _phoneNumber_);

    /**
     * Email contact of a person.
     *
     * More information under https://w3id.org/idsa/core/emailAddress
     *
     * @return Returns the List of Strings for the property _emailAddress.
     */
    @JsonProperty("ids:emailAddress")
    List<String> getEmailAddress();

    /**
     * Email contact of a person.
     *
     * More information under https://w3id.org/idsa/core/emailAddress
     *
     * @param _emailAddress_ desired value for the property _emailAddress.
     */
    void setEmailAddress(List<String> _emailAddress_);

    /**
     * Website providing additional information about a person.
     *
     * More information under https://w3id.org/idsa/core/homepage
     *
     * @return Returns the String for the property _homepage.
     */
    @JsonProperty("ids:homepage")
    String getHomepage();

    /**
     * Website providing additional information about a person.
     *
     * More information under https://w3id.org/idsa/core/homepage
     *
     * @param _homepage_ desired value for the property _homepage.
     */
    void setHomepage(String _homepage_);

}
