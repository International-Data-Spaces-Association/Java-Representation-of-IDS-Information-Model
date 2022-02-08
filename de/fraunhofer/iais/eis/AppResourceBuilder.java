package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class AppResourceBuilder implements Builder<AppResource> {

    private AppResourceImpl appResourceImpl;

    public AppResourceBuilder() {
        appResourceImpl = new AppResourceImpl();
    }

    public AppResourceBuilder(URI id) {
        this();
        appResourceImpl.id = id;
    }

    /**
     * This function allows setting a value for _standardLicense
     * 
     * @param _standardLicense_ desired value to be set
     * @return Builder object with new value for _standardLicense
     */
    public AppResourceBuilder _standardLicense_(URI _standardLicense_) {
        this.appResourceImpl.setStandardLicense(_standardLicense_);
        return this;
    }

    /**
     * This function allows setting a value for _customLicense
     * 
     * @param _customLicense_ desired value to be set
     * @return Builder object with new value for _customLicense
     */
    public AppResourceBuilder _customLicense_(URI _customLicense_) {
        this.appResourceImpl.setCustomLicense(_customLicense_);
        return this;
    }

    /**
     * This function allows setting a value for _resourcePart
     * 
     * @param _resourcePart_ desired value to be set
     * @return Builder object with new value for _resourcePart
     */
    public AppResourceBuilder _resourcePart_(List<Resource> _resourcePart_) {
        this.appResourceImpl.setResourcePart(_resourcePart_);
        return this;
    }

    /**
     * This function allows adding a value to the List _resourcePart
     * 
     * @param _resourcePart_ desired value to be added
     * @return Builder object with new value for _resourcePart
     */
    public AppResourceBuilder _resourcePart_(Resource _resourcePart_) {
        this.appResourceImpl.getResourcePart().add(_resourcePart_);
        return this;
    }

    /**
     * This function allows setting a value for _resourceEndpoint
     * 
     * @param _resourceEndpoint_ desired value to be set
     * @return Builder object with new value for _resourceEndpoint
     */
    public AppResourceBuilder _resourceEndpoint_(List<ConnectorEndpoint> _resourceEndpoint_) {
        this.appResourceImpl.setResourceEndpoint(_resourceEndpoint_);
        return this;
    }

    /**
     * This function allows adding a value to the List _resourceEndpoint
     * 
     * @param _resourceEndpoint_ desired value to be added
     * @return Builder object with new value for _resourceEndpoint
     */
    public AppResourceBuilder _resourceEndpoint_(ConnectorEndpoint _resourceEndpoint_) {
        this.appResourceImpl.getResourceEndpoint().add(_resourceEndpoint_);
        return this;
    }

    /**
     * This function allows setting a value for _contractOffer
     * 
     * @param _contractOffer_ desired value to be set
     * @return Builder object with new value for _contractOffer
     */
    public AppResourceBuilder _contractOffer_(List<ContractOffer> _contractOffer_) {
        this.appResourceImpl.setContractOffer(_contractOffer_);
        return this;
    }

    /**
     * This function allows adding a value to the List _contractOffer
     * 
     * @param _contractOffer_ desired value to be added
     * @return Builder object with new value for _contractOffer
     */
    public AppResourceBuilder _contractOffer_(ContractOffer _contractOffer_) {
        this.appResourceImpl.getContractOffer().add(_contractOffer_);
        return this;
    }

    /**
     * This function allows setting a value for _paymentModality
     * 
     * @param _paymentModality_ desired value to be set
     * @return Builder object with new value for _paymentModality
     */
    public AppResourceBuilder _paymentModality_(PaymentModality _paymentModality_) {
        this.appResourceImpl.setPaymentModality(_paymentModality_);
        return this;
    }

    /**
     * This function allows setting a value for _publisher
     * 
     * @param _publisher_ desired value to be set
     * @return Builder object with new value for _publisher
     */
    public AppResourceBuilder _publisher_(URI _publisher_) {
        this.appResourceImpl.setPublisher(_publisher_);
        return this;
    }

    /**
     * This function allows setting a value for _sovereign
     * 
     * @param _sovereign_ desired value to be set
     * @return Builder object with new value for _sovereign
     */
    public AppResourceBuilder _sovereign_(URI _sovereign_) {
        this.appResourceImpl.setSovereign(_sovereign_);
        return this;
    }

    /**
     * This function allows setting a value for _sample
     * 
     * @param _sample_ desired value to be set
     * @return Builder object with new value for _sample
     */
    public AppResourceBuilder _sample_(List<Resource> _sample_) {
        this.appResourceImpl.setSample(_sample_);
        return this;
    }

    /**
     * This function allows adding a value to the List _sample
     * 
     * @param _sample_ desired value to be added
     * @return Builder object with new value for _sample
     */
    public AppResourceBuilder _sample_(Resource _sample_) {
        this.appResourceImpl.getSample().add(_sample_);
        return this;
    }

    /**
     * This function allows setting a value for _variant
     * 
     * @param _variant_ desired value to be set
     * @return Builder object with new value for _variant
     */
    public AppResourceBuilder _variant_(Resource _variant_) {
        this.appResourceImpl.setVariant(_variant_);
        return this;
    }

    /**
     * This function allows setting a value for _contentType
     * 
     * @param _contentType_ desired value to be set
     * @return Builder object with new value for _contentType
     */
    public AppResourceBuilder _contentType_(ContentType _contentType_) {
        this.appResourceImpl.setContentType(_contentType_);
        return this;
    }

    /**
     * This function allows setting a value for _contentPart
     * 
     * @param _contentPart_ desired value to be set
     * @return Builder object with new value for _contentPart
     */
    public AppResourceBuilder _contentPart_(List<DigitalContent> _contentPart_) {
        this.appResourceImpl.setContentPart(_contentPart_);
        return this;
    }

    /**
     * This function allows adding a value to the List _contentPart
     * 
     * @param _contentPart_ desired value to be added
     * @return Builder object with new value for _contentPart
     */
    public AppResourceBuilder _contentPart_(DigitalContent _contentPart_) {
        this.appResourceImpl.getContentPart().add(_contentPart_);
        return this;
    }

    /**
     * This function allows setting a value for _representation
     * 
     * @param _representation_ desired value to be set
     * @return Builder object with new value for _representation
     */
    public AppResourceBuilder _representation_(List<Representation> _representation_) {
        this.appResourceImpl.setRepresentation(_representation_);
        return this;
    }

    /**
     * This function allows adding a value to the List _representation
     * 
     * @param _representation_ desired value to be added
     * @return Builder object with new value for _representation
     */
    public AppResourceBuilder _representation_(Representation _representation_) {
        this.appResourceImpl.getRepresentation().add(_representation_);
        return this;
    }

    /**
     * This function allows setting a value for _defaultRepresentation
     * 
     * @param _defaultRepresentation_ desired value to be set
     * @return Builder object with new value for _defaultRepresentation
     */
    public AppResourceBuilder _defaultRepresentation_(List<Representation> _defaultRepresentation_) {
        this.appResourceImpl.setDefaultRepresentation(_defaultRepresentation_);
        return this;
    }

    /**
     * This function allows adding a value to the List _defaultRepresentation
     * 
     * @param _defaultRepresentation_ desired value to be added
     * @return Builder object with new value for _defaultRepresentation
     */
    public AppResourceBuilder _defaultRepresentation_(Representation _defaultRepresentation_) {
        this.appResourceImpl.getDefaultRepresentation().add(_defaultRepresentation_);
        return this;
    }

    /**
     * This function allows setting a value for _theme
     * 
     * @param _theme_ desired value to be set
     * @return Builder object with new value for _theme
     */
    public AppResourceBuilder _theme_(List<URI> _theme_) {
        this.appResourceImpl.setTheme(_theme_);
        return this;
    }

    /**
     * This function allows adding a value to the List _theme
     * 
     * @param _theme_ desired value to be added
     * @return Builder object with new value for _theme
     */
    public AppResourceBuilder _theme_(URI _theme_) {
        this.appResourceImpl.getTheme().add(_theme_);
        return this;
    }

    /**
     * This function allows setting a value for _keyword
     * 
     * @param _keyword_ desired value to be set
     * @return Builder object with new value for _keyword
     */
    public AppResourceBuilder _keyword_(List<TypedLiteral> _keyword_) {
        this.appResourceImpl.setKeyword(_keyword_);
        return this;
    }

    /**
     * This function allows adding a value to the List _keyword
     * 
     * @param _keyword_ desired value to be added
     * @return Builder object with new value for _keyword
     */
    public AppResourceBuilder _keyword_(TypedLiteral _keyword_) {
        this.appResourceImpl.getKeyword().add(_keyword_);
        return this;
    }

    /**
     * This function allows setting a value for _temporalCoverage
     * 
     * @param _temporalCoverage_ desired value to be set
     * @return Builder object with new value for _temporalCoverage
     */
    public AppResourceBuilder _temporalCoverage_(List<TemporalEntity> _temporalCoverage_) {
        this.appResourceImpl.setTemporalCoverage(_temporalCoverage_);
        return this;
    }

    /**
     * This function allows adding a value to the List _temporalCoverage
     * 
     * @param _temporalCoverage_ desired value to be added
     * @return Builder object with new value for _temporalCoverage
     */
    public AppResourceBuilder _temporalCoverage_(TemporalEntity _temporalCoverage_) {
        this.appResourceImpl.getTemporalCoverage().add(_temporalCoverage_);
        return this;
    }

    /**
     * This function allows setting a value for _temporalResolution
     * 
     * @param _temporalResolution_ desired value to be set
     * @return Builder object with new value for _temporalResolution
     */
    public AppResourceBuilder _temporalResolution_(Frequency _temporalResolution_) {
        this.appResourceImpl.setTemporalResolution(_temporalResolution_);
        return this;
    }

    /**
     * This function allows setting a value for _spatialCoverage
     * 
     * @param _spatialCoverage_ desired value to be set
     * @return Builder object with new value for _spatialCoverage
     */
    public AppResourceBuilder _spatialCoverage_(List<Location> _spatialCoverage_) {
        this.appResourceImpl.setSpatialCoverage(_spatialCoverage_);
        return this;
    }

    /**
     * This function allows adding a value to the List _spatialCoverage
     * 
     * @param _spatialCoverage_ desired value to be added
     * @return Builder object with new value for _spatialCoverage
     */
    public AppResourceBuilder _spatialCoverage_(Location _spatialCoverage_) {
        this.appResourceImpl.getSpatialCoverage().add(_spatialCoverage_);
        return this;
    }

    /**
     * This function allows setting a value for _accrualPeriodicity
     * 
     * @param _accrualPeriodicity_ desired value to be set
     * @return Builder object with new value for _accrualPeriodicity
     */
    public AppResourceBuilder _accrualPeriodicity_(Frequency _accrualPeriodicity_) {
        this.appResourceImpl.setAccrualPeriodicity(_accrualPeriodicity_);
        return this;
    }

    /**
     * This function allows setting a value for _contentStandard
     * 
     * @param _contentStandard_ desired value to be set
     * @return Builder object with new value for _contentStandard
     */
    public AppResourceBuilder _contentStandard_(URI _contentStandard_) {
        this.appResourceImpl.setContentStandard(_contentStandard_);
        return this;
    }

    /**
     * This function allows setting a value for _language
     * 
     * @param _language_ desired value to be set
     * @return Builder object with new value for _language
     */
    public AppResourceBuilder _language_(List<Language> _language_) {
        this.appResourceImpl.setLanguage(_language_);
        return this;
    }

    /**
     * This function allows adding a value to the List _language
     * 
     * @param _language_ desired value to be added
     * @return Builder object with new value for _language
     */
    public AppResourceBuilder _language_(Language _language_) {
        this.appResourceImpl.getLanguage().add(_language_);
        return this;
    }

    /**
     * This function allows setting a value for _created
     * 
     * @param _created_ desired value to be set
     * @return Builder object with new value for _created
     */
    public AppResourceBuilder _created_(XMLGregorianCalendar _created_) {
        this.appResourceImpl.setCreated(_created_);
        return this;
    }

    /**
     * This function allows setting a value for _modified
     * 
     * @param _modified_ desired value to be set
     * @return Builder object with new value for _modified
     */
    public AppResourceBuilder _modified_(XMLGregorianCalendar _modified_) {
        this.appResourceImpl.setModified(_modified_);
        return this;
    }

    /**
     * This function allows setting a value for _title
     * 
     * @param _title_ desired value to be set
     * @return Builder object with new value for _title
     */
    public AppResourceBuilder _title_(List<TypedLiteral> _title_) {
        this.appResourceImpl.setTitle(_title_);
        return this;
    }

    /**
     * This function allows adding a value to the List _title
     * 
     * @param _title_ desired value to be added
     * @return Builder object with new value for _title
     */
    public AppResourceBuilder _title_(TypedLiteral _title_) {
        this.appResourceImpl.getTitle().add(_title_);
        return this;
    }

    /**
     * This function allows setting a value for _description
     * 
     * @param _description_ desired value to be set
     * @return Builder object with new value for _description
     */
    public AppResourceBuilder _description_(List<TypedLiteral> _description_) {
        this.appResourceImpl.setDescription(_description_);
        return this;
    }

    /**
     * This function allows adding a value to the List _description
     * 
     * @param _description_ desired value to be added
     * @return Builder object with new value for _description
     */
    public AppResourceBuilder _description_(TypedLiteral _description_) {
        this.appResourceImpl.getDescription().add(_description_);
        return this;
    }

    /**
     * This function allows setting a value for _shapesGraph
     * 
     * @param _shapesGraph_ desired value to be set
     * @return Builder object with new value for _shapesGraph
     */
    public AppResourceBuilder _shapesGraph_(URI _shapesGraph_) {
        this.appResourceImpl.setShapesGraph(_shapesGraph_);
        return this;
    }

    /**
     * This function allows setting a value for _version
     * 
     * @param _version_ desired value to be set
     * @return Builder object with new value for _version
     */
    public AppResourceBuilder _version_(String _version_) {
        this.appResourceImpl.setVersion(_version_);
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
    public AppResource build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(appResourceImpl);
        return appResourceImpl;
    }
}
