package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class SecurityProfileBuilder implements Builder<SecurityProfile> {

    private SecurityProfileImpl securityProfileImpl;

    public SecurityProfileBuilder() {
        securityProfileImpl = new SecurityProfileImpl();
    }

    public SecurityProfileBuilder(URI id) {
        this();
        securityProfileImpl.id = id;
    }

    /**
     * This function allows setting a value for _securityGuarantee
     * 
     * @param _securityGuarantee_ desired value to be set
     * @return Builder object with new value for _securityGuarantee
     */
    public SecurityProfileBuilder _securityGuarantee_(List<SecurityGuarantee> _securityGuarantee_) {
        this.securityProfileImpl.setSecurityGuarantee(_securityGuarantee_);
        return this;
    }

    /**
     * This function allows adding a value to the List _securityGuarantee
     * 
     * @param _securityGuarantee_ desired value to be added
     * @return Builder object with new value for _securityGuarantee
     */
    public SecurityProfileBuilder _securityGuarantee_(SecurityGuarantee _securityGuarantee_) {
        this.securityProfileImpl.getSecurityGuarantee().add(_securityGuarantee_);
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
    public SecurityProfile build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(securityProfileImpl);
        return securityProfileImpl;
    }
}
