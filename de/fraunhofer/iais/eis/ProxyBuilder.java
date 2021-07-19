package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class ProxyBuilder implements Builder<Proxy> {

    private ProxyImpl proxyImpl;

    public ProxyBuilder() {
        proxyImpl = new ProxyImpl();
    }

    public ProxyBuilder(URI id) {
        this();
        proxyImpl.id = id;
    }

    /**
     * This function allows setting a value for _proxyURI
     * 
     * @param _proxyURI_ desired value to be set
     * @return Builder object with new value for _proxyURI
     */
    public ProxyBuilder _proxyURI_(URI _proxyURI_) {
        this.proxyImpl.setProxyURI(_proxyURI_);
        return this;
    }

    /**
     * This function allows setting a value for _noProxy
     * 
     * @param _noProxy_ desired value to be set
     * @return Builder object with new value for _noProxy
     */
    public ProxyBuilder _noProxy_(List<URI> _noProxy_) {
        this.proxyImpl.setNoProxy(_noProxy_);
        return this;
    }

    /**
     * This function allows adding a value to the List _noProxy
     * 
     * @param _noProxy_ desired value to be added
     * @return Builder object with new value for _noProxy
     */
    public ProxyBuilder _noProxy_(URI _noProxy_) {
        this.proxyImpl.getNoProxy().add(_noProxy_);
        return this;
    }

    /**
     * This function allows setting a value for _proxyAuthentication
     * 
     * @param _proxyAuthentication_ desired value to be set
     * @return Builder object with new value for _proxyAuthentication
     */
    public ProxyBuilder _proxyAuthentication_(BasicAuthentication _proxyAuthentication_) {
        this.proxyImpl.setProxyAuthentication(_proxyAuthentication_);
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
    public Proxy build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(proxyImpl);
        return proxyImpl;
    }
}
