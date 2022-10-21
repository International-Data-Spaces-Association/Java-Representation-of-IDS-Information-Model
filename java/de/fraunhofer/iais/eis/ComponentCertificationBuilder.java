package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class ComponentCertificationBuilder implements Builder<ComponentCertification> {

    private ComponentCertificationImpl componentCertificationImpl;

    public ComponentCertificationBuilder() {
        componentCertificationImpl = new ComponentCertificationImpl();
    }

    public ComponentCertificationBuilder(URI id) {
        this();
        componentCertificationImpl.id = id;
    }

    /**
     * This function allows setting a value for _certificationLevel
     * 
     * @param _certificationLevel_ desired value to be set
     * @return Builder object with new value for _certificationLevel
     */
    public ComponentCertificationBuilder _certificationLevel_(CertificationLevel _certificationLevel_) {
        this.componentCertificationImpl.setCertificationLevel(_certificationLevel_);
        return this;
    }

    /**
     * This function allows setting a value for _lastValidDate
     * 
     * @param _lastValidDate_ desired value to be set
     * @return Builder object with new value for _lastValidDate
     */
    public ComponentCertificationBuilder _lastValidDate_(XMLGregorianCalendar _lastValidDate_) {
        this.componentCertificationImpl.setLastValidDate(_lastValidDate_);
        return this;
    }

    /**
     * This function allows setting a value for _evaluationFacility
     * 
     * @param _evaluationFacility_ desired value to be set
     * @return Builder object with new value for _evaluationFacility
     */
    public ComponentCertificationBuilder _evaluationFacility_(EvaluationFacility _evaluationFacility_) {
        this.componentCertificationImpl.setEvaluationFacility(_evaluationFacility_);
        return this;
    }

    /**
     * This function allows setting a value for _version
     * 
     * @param _version_ desired value to be set
     * @return Builder object with new value for _version
     */
    public ComponentCertificationBuilder _version_(String _version_) {
        this.componentCertificationImpl.setVersion(_version_);
        return this;
    }

    /**
     * This function allows setting a value for _title
     * 
     * @param _title_ desired value to be set
     * @return Builder object with new value for _title
     */
    public ComponentCertificationBuilder _title_(List<TypedLiteral> _title_) {
        this.componentCertificationImpl.setTitle(_title_);
        return this;
    }

    /**
     * This function allows adding a value to the List _title
     * 
     * @param _title_ desired value to be added
     * @return Builder object with new value for _title
     */
    public ComponentCertificationBuilder _title_(TypedLiteral _title_) {
        this.componentCertificationImpl.getTitle().add(_title_);
        return this;
    }

    /**
     * This function allows setting a value for _description
     * 
     * @param _description_ desired value to be set
     * @return Builder object with new value for _description
     */
    public ComponentCertificationBuilder _description_(List<TypedLiteral> _description_) {
        this.componentCertificationImpl.setDescription(_description_);
        return this;
    }

    /**
     * This function allows adding a value to the List _description
     * 
     * @param _description_ desired value to be added
     * @return Builder object with new value for _description
     */
    public ComponentCertificationBuilder _description_(TypedLiteral _description_) {
        this.componentCertificationImpl.getDescription().add(_description_);
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
    public ComponentCertification build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(componentCertificationImpl);
        return componentCertificationImpl;
    }
}
