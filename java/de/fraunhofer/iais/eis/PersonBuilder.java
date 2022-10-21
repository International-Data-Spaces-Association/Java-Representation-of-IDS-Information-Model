package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class PersonBuilder implements Builder<Person> {

    private PersonImpl personImpl;

    public PersonBuilder() {
        personImpl = new PersonImpl();
    }

    public PersonBuilder(URI id) {
        this();
        personImpl.id = id;
    }

    /**
     * This function allows setting a value for _familyName
     * 
     * @param _familyName_ desired value to be set
     * @return Builder object with new value for _familyName
     */
    public PersonBuilder _familyName_(String _familyName_) {
        this.personImpl.setFamilyName(_familyName_);
        return this;
    }

    /**
     * This function allows setting a value for _givenName
     * 
     * @param _givenName_ desired value to be set
     * @return Builder object with new value for _givenName
     */
    public PersonBuilder _givenName_(String _givenName_) {
        this.personImpl.setGivenName(_givenName_);
        return this;
    }

    /**
     * This function allows setting a value for _phoneNumber
     * 
     * @param _phoneNumber_ desired value to be set
     * @return Builder object with new value for _phoneNumber
     */
    public PersonBuilder _phoneNumber_(List<String> _phoneNumber_) {
        this.personImpl.setPhoneNumber(_phoneNumber_);
        return this;
    }

    /**
     * This function allows adding a value to the List _phoneNumber
     * 
     * @param _phoneNumber_ desired value to be added
     * @return Builder object with new value for _phoneNumber
     */
    public PersonBuilder _phoneNumber_(String _phoneNumber_) {
        this.personImpl.getPhoneNumber().add(_phoneNumber_);
        return this;
    }

    /**
     * This function allows setting a value for _emailAddress
     * 
     * @param _emailAddress_ desired value to be set
     * @return Builder object with new value for _emailAddress
     */
    public PersonBuilder _emailAddress_(List<String> _emailAddress_) {
        this.personImpl.setEmailAddress(_emailAddress_);
        return this;
    }

    /**
     * This function allows adding a value to the List _emailAddress
     * 
     * @param _emailAddress_ desired value to be added
     * @return Builder object with new value for _emailAddress
     */
    public PersonBuilder _emailAddress_(String _emailAddress_) {
        this.personImpl.getEmailAddress().add(_emailAddress_);
        return this;
    }

    /**
     * This function allows setting a value for _homepage
     * 
     * @param _homepage_ desired value to be set
     * @return Builder object with new value for _homepage
     */
    public PersonBuilder _homepage_(String _homepage_) {
        this.personImpl.setHomepage(_homepage_);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     * @throws ConstraintViolationException This exception is thrown, if a validator is used and a
     *         violation is found.
     */
    @Override
    public Person build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(personImpl);
        return personImpl;
    }
}
