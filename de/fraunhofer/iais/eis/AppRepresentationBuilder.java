package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class AppRepresentationBuilder implements Builder<AppRepresentation> {

    private AppRepresentationImpl appRepresentationImpl;

    public AppRepresentationBuilder() {
        appRepresentationImpl = new AppRepresentationImpl();
    }

    public AppRepresentationBuilder(URI id) {
        this();
        appRepresentationImpl.id = id;
    }

    /**
     * This function allows setting a value for _dataAppInformation
     * 
     * @param _dataAppInformation_ desired value to be set
     * @return Builder object with new value for _dataAppInformation
     */
    public AppRepresentationBuilder _dataAppInformation_(DataApp _dataAppInformation_) {
        this.appRepresentationImpl.setDataAppInformation(_dataAppInformation_);
        return this;
    }

    /**
     * This function allows setting a value for _dataAppDistributionService
     * 
     * @param _dataAppDistributionService_ desired value to be set
     * @return Builder object with new value for _dataAppDistributionService
     */
    public AppRepresentationBuilder _dataAppDistributionService_(URI _dataAppDistributionService_) {
        this.appRepresentationImpl.setDataAppDistributionService(_dataAppDistributionService_);
        return this;
    }

    /**
     * This function allows setting a value for _dataAppRuntimeEnvironment
     * 
     * @param _dataAppRuntimeEnvironment_ desired value to be set
     * @return Builder object with new value for _dataAppRuntimeEnvironment
     */
    public AppRepresentationBuilder _dataAppRuntimeEnvironment_(String _dataAppRuntimeEnvironment_) {
        this.appRepresentationImpl.setDataAppRuntimeEnvironment(_dataAppRuntimeEnvironment_);
        return this;
    }

    /**
     * This function allows setting a value for _instance
     * 
     * @param _instance_ desired value to be set
     * @return Builder object with new value for _instance
     */
    public AppRepresentationBuilder _instance_(List<RepresentationInstance> _instance_) {
        this.appRepresentationImpl.setInstance(_instance_);
        return this;
    }

    /**
     * This function allows adding a value to the List _instance
     * 
     * @param _instance_ desired value to be added
     * @return Builder object with new value for _instance
     */
    public AppRepresentationBuilder _instance_(RepresentationInstance _instance_) {
        this.appRepresentationImpl.getInstance().add(_instance_);
        return this;
    }

    /**
     * This function allows setting a value for _mediaType
     * 
     * @param _mediaType_ desired value to be set
     * @return Builder object with new value for _mediaType
     */
    public AppRepresentationBuilder _mediaType_(MediaType _mediaType_) {
        this.appRepresentationImpl.setMediaType(_mediaType_);
        return this;
    }

    /**
     * This function allows setting a value for _representationStandard
     * 
     * @param _representationStandard_ desired value to be set
     * @return Builder object with new value for _representationStandard
     */
    public AppRepresentationBuilder _representationStandard_(URI _representationStandard_) {
        this.appRepresentationImpl.setRepresentationStandard(_representationStandard_);
        return this;
    }

    /**
     * This function allows setting a value for _language
     * 
     * @param _language_ desired value to be set
     * @return Builder object with new value for _language
     */
    public AppRepresentationBuilder _language_(Language _language_) {
        this.appRepresentationImpl.setLanguage(_language_);
        return this;
    }

    /**
     * This function allows setting a value for _created
     * 
     * @param _created_ desired value to be set
     * @return Builder object with new value for _created
     */
    public AppRepresentationBuilder _created_(XMLGregorianCalendar _created_) {
        this.appRepresentationImpl.setCreated(_created_);
        return this;
    }

    /**
     * This function allows setting a value for _modified
     * 
     * @param _modified_ desired value to be set
     * @return Builder object with new value for _modified
     */
    public AppRepresentationBuilder _modified_(XMLGregorianCalendar _modified_) {
        this.appRepresentationImpl.setModified(_modified_);
        return this;
    }

    /**
     * This function allows setting a value for _title
     * 
     * @param _title_ desired value to be set
     * @return Builder object with new value for _title
     */
    public AppRepresentationBuilder _title_(List<TypedLiteral> _title_) {
        this.appRepresentationImpl.setTitle(_title_);
        return this;
    }

    /**
     * This function allows adding a value to the List _title
     * 
     * @param _title_ desired value to be added
     * @return Builder object with new value for _title
     */
    public AppRepresentationBuilder _title_(TypedLiteral _title_) {
        this.appRepresentationImpl.getTitle().add(_title_);
        return this;
    }

    /**
     * This function allows setting a value for _description
     * 
     * @param _description_ desired value to be set
     * @return Builder object with new value for _description
     */
    public AppRepresentationBuilder _description_(List<TypedLiteral> _description_) {
        this.appRepresentationImpl.setDescription(_description_);
        return this;
    }

    /**
     * This function allows adding a value to the List _description
     * 
     * @param _description_ desired value to be added
     * @return Builder object with new value for _description
     */
    public AppRepresentationBuilder _description_(TypedLiteral _description_) {
        this.appRepresentationImpl.getDescription().add(_description_);
        return this;
    }

    /**
     * This function allows setting a value for _shapesGraph
     * 
     * @param _shapesGraph_ desired value to be set
     * @return Builder object with new value for _shapesGraph
     */
    public AppRepresentationBuilder _shapesGraph_(URI _shapesGraph_) {
        this.appRepresentationImpl.setShapesGraph(_shapesGraph_);
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
    public AppRepresentation build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(appRepresentationImpl);
        return appRepresentationImpl;
    }
}
