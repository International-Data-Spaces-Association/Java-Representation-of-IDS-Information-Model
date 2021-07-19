package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class SiteBuilder implements Builder<Site> {

    private SiteImpl siteImpl;

    public SiteBuilder() {
        siteImpl = new SiteImpl();
    }

    public SiteBuilder(URI id) {
        this();
        siteImpl.id = id;
    }

    /**
     * This function allows setting a value for _siteAddress
     * 
     * @param _siteAddress_ desired value to be set
     * @return Builder object with new value for _siteAddress
     */
    public SiteBuilder _siteAddress_(String _siteAddress_) {
        this.siteImpl.setSiteAddress(_siteAddress_);
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
    public Site build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(siteImpl);
        return siteImpl;
    }
}
