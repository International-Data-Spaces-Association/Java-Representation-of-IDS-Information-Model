package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class LicenseBuilder implements Builder<License> {

    private LicenseImpl licenseImpl;

    public LicenseBuilder() {
        licenseImpl = new LicenseImpl();
    }

    public LicenseBuilder(URI id) {
        this();
        licenseImpl.id = id;
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
    public License build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(licenseImpl);
        return licenseImpl;
    }
}
