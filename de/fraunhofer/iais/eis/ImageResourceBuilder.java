package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class ImageResourceBuilder implements Builder<ImageResource> {

    private ImageResourceImpl imageResourceImpl;

    public ImageResourceBuilder() {
        imageResourceImpl = new ImageResourceImpl();
    }

    public ImageResourceBuilder(URI id) {
        this();
        imageResourceImpl.id = id;
    }

    /**
     * This function allows setting a value for _standardLicense
     * 
     * @param _standardLicense_ desired value to be set
     * @return Builder object with new value for _standardLicense
     */
    public ImageResourceBuilder _standardLicense_(URI _standardLicense_) {
        this.imageResourceImpl.setStandardLicense(_standardLicense_);
        return this;
    }

    /**
     * This function allows setting a value for _customLicense
     * 
     * @param _customLicense_ desired value to be set
     * @return Builder object with new value for _customLicense
     */
    public ImageResourceBuilder _customLicense_(URI _customLicense_) {
        this.imageResourceImpl.setCustomLicense(_customLicense_);
        return this;
    }

    /**
     * This function allows setting a value for _resourcePart
     * 
     * @param _resourcePart_ desired value to be set
     * @return Builder object with new value for _resourcePart
     */
    public ImageResourceBuilder _resourcePart_(List<Resource> _resourcePart_) {
        this.imageResourceImpl.setResourcePart(_resourcePart_);
        return this;
    }

    /**
     * This function allows adding a value to the List _resourcePart
     * 
     * @param _resourcePart_ desired value to be added
     * @return Builder object with new value for _resourcePart
     */
    public ImageResourceBuilder _resourcePart_(Resource _resourcePart_) {
        this.imageResourceImpl.getResourcePart().add(_resourcePart_);
        return this;
    }

    /**
     * This function allows setting a value for _resourceEndpoint
     * 
     * @param _resourceEndpoint_ desired value to be set
     * @return Builder object with new value for _resourceEndpoint
     */
    public ImageResourceBuilder _resourceEndpoint_(List<ConnectorEndpoint> _resourceEndpoint_) {
        this.imageResourceImpl.setResourceEndpoint(_resourceEndpoint_);
        return this;
    }

    /**
     * This function allows adding a value to the List _resourceEndpoint
     * 
     * @param _resourceEndpoint_ desired value to be added
     * @return Builder object with new value for _resourceEndpoint
     */
    public ImageResourceBuilder _resourceEndpoint_(ConnectorEndpoint _resourceEndpoint_) {
        this.imageResourceImpl.getResourceEndpoint().add(_resourceEndpoint_);
        return this;
    }

    /**
     * This function allows setting a value for _contractOffer
     * 
     * @param _contractOffer_ desired value to be set
     * @return Builder object with new value for _contractOffer
     */
    public ImageResourceBuilder _contractOffer_(List<ContractOffer> _contractOffer_) {
        this.imageResourceImpl.setContractOffer(_contractOffer_);
        return this;
    }

    /**
     * This function allows adding a value to the List _contractOffer
     * 
     * @param _contractOffer_ desired value to be added
     * @return Builder object with new value for _contractOffer
     */
    public ImageResourceBuilder _contractOffer_(ContractOffer _contractOffer_) {
        this.imageResourceImpl.getContractOffer().add(_contractOffer_);
        return this;
    }

    /**
     * This function allows setting a value for _paymentModality
     * 
     * @param _paymentModality_ desired value to be set
     * @return Builder object with new value for _paymentModality
     */
    public ImageResourceBuilder _paymentModality_(PaymentModality _paymentModality_) {
        this.imageResourceImpl.setPaymentModality(_paymentModality_);
        return this;
    }

    /**
     * This function allows setting a value for _publisher
     * 
     * @param _publisher_ desired value to be set
     * @return Builder object with new value for _publisher
     */
    public ImageResourceBuilder _publisher_(URI _publisher_) {
        this.imageResourceImpl.setPublisher(_publisher_);
        return this;
    }

    /**
     * This function allows setting a value for _sovereign
     * 
     * @param _sovereign_ desired value to be set
     * @return Builder object with new value for _sovereign
     */
    public ImageResourceBuilder _sovereign_(URI _sovereign_) {
        this.imageResourceImpl.setSovereign(_sovereign_);
        return this;
    }

    /**
     * This function allows setting a value for _sample
     * 
     * @param _sample_ desired value to be set
     * @return Builder object with new value for _sample
     */
    public ImageResourceBuilder _sample_(List<Resource> _sample_) {
        this.imageResourceImpl.setSample(_sample_);
        return this;
    }

    /**
     * This function allows adding a value to the List _sample
     * 
     * @param _sample_ desired value to be added
     * @return Builder object with new value for _sample
     */
    public ImageResourceBuilder _sample_(Resource _sample_) {
        this.imageResourceImpl.getSample().add(_sample_);
        return this;
    }

    /**
     * This function allows setting a value for _variant
     * 
     * @param _variant_ desired value to be set
     * @return Builder object with new value for _variant
     */
    public ImageResourceBuilder _variant_(Resource _variant_) {
        this.imageResourceImpl.setVariant(_variant_);
        return this;
    }

    /**
     * This function allows setting a value for _contentType
     * 
     * @param _contentType_ desired value to be set
     * @return Builder object with new value for _contentType
     */
    public ImageResourceBuilder _contentType_(ContentType _contentType_) {
        this.imageResourceImpl.setContentType(_contentType_);
        return this;
    }

    /**
     * This function allows setting a value for _contentPart
     * 
     * @param _contentPart_ desired value to be set
     * @return Builder object with new value for _contentPart
     */
    public ImageResourceBuilder _contentPart_(List<DigitalContent> _contentPart_) {
        this.imageResourceImpl.setContentPart(_contentPart_);
        return this;
    }

    /**
     * This function allows adding a value to the List _contentPart
     * 
     * @param _contentPart_ desired value to be added
     * @return Builder object with new value for _contentPart
     */
    public ImageResourceBuilder _contentPart_(DigitalContent _contentPart_) {
        this.imageResourceImpl.getContentPart().add(_contentPart_);
        return this;
    }

    /**
     * This function allows setting a value for _representation
     * 
     * @param _representation_ desired value to be set
     * @return Builder object with new value for _representation
     */
    public ImageResourceBuilder _representation_(List<Representation> _representation_) {
        this.imageResourceImpl.setRepresentation(_representation_);
        return this;
    }

    /**
     * This function allows adding a value to the List _representation
     * 
     * @param _representation_ desired value to be added
     * @return Builder object with new value for _representation
     */
    public ImageResourceBuilder _representation_(Representation _representation_) {
        this.imageResourceImpl.getRepresentation().add(_representation_);
        return this;
    }

    /**
     * This function allows setting a value for _defaultRepresentation
     * 
     * @param _defaultRepresentation_ desired value to be set
     * @return Builder object with new value for _defaultRepresentation
     */
    public ImageResourceBuilder _defaultRepresentation_(List<Representation> _defaultRepresentation_) {
        this.imageResourceImpl.setDefaultRepresentation(_defaultRepresentation_);
        return this;
    }

    /**
     * This function allows adding a value to the List _defaultRepresentation
     * 
     * @param _defaultRepresentation_ desired value to be added
     * @return Builder object with new value for _defaultRepresentation
     */
    public ImageResourceBuilder _defaultRepresentation_(Representation _defaultRepresentation_) {
        this.imageResourceImpl.getDefaultRepresentation().add(_defaultRepresentation_);
        return this;
    }

    /**
     * This function allows setting a value for _theme
     * 
     * @param _theme_ desired value to be set
     * @return Builder object with new value for _theme
     */
    public ImageResourceBuilder _theme_(List<URI> _theme_) {
        this.imageResourceImpl.setTheme(_theme_);
        return this;
    }

    /**
     * This function allows adding a value to the List _theme
     * 
     * @param _theme_ desired value to be added
     * @return Builder object with new value for _theme
     */
    public ImageResourceBuilder _theme_(URI _theme_) {
        this.imageResourceImpl.getTheme().add(_theme_);
        return this;
    }

    /**
     * This function allows setting a value for _keyword
     * 
     * @param _keyword_ desired value to be set
     * @return Builder object with new value for _keyword
     */
    public ImageResourceBuilder _keyword_(List<TypedLiteral> _keyword_) {
        this.imageResourceImpl.setKeyword(_keyword_);
        return this;
    }

    /**
     * This function allows adding a value to the List _keyword
     * 
     * @param _keyword_ desired value to be added
     * @return Builder object with new value for _keyword
     */
    public ImageResourceBuilder _keyword_(TypedLiteral _keyword_) {
        this.imageResourceImpl.getKeyword().add(_keyword_);
        return this;
    }

    /**
     * This function allows setting a value for _temporalCoverage
     * 
     * @param _temporalCoverage_ desired value to be set
     * @return Builder object with new value for _temporalCoverage
     */
    public ImageResourceBuilder _temporalCoverage_(List<TemporalEntity> _temporalCoverage_) {
        this.imageResourceImpl.setTemporalCoverage(_temporalCoverage_);
        return this;
    }

    /**
     * This function allows adding a value to the List _temporalCoverage
     * 
     * @param _temporalCoverage_ desired value to be added
     * @return Builder object with new value for _temporalCoverage
     */
    public ImageResourceBuilder _temporalCoverage_(TemporalEntity _temporalCoverage_) {
        this.imageResourceImpl.getTemporalCoverage().add(_temporalCoverage_);
        return this;
    }

    /**
     * This function allows setting a value for _temporalResolution
     * 
     * @param _temporalResolution_ desired value to be set
     * @return Builder object with new value for _temporalResolution
     */
    public ImageResourceBuilder _temporalResolution_(Frequency _temporalResolution_) {
        this.imageResourceImpl.setTemporalResolution(_temporalResolution_);
        return this;
    }

    /**
     * This function allows setting a value for _spatialCoverage
     * 
     * @param _spatialCoverage_ desired value to be set
     * @return Builder object with new value for _spatialCoverage
     */
    public ImageResourceBuilder _spatialCoverage_(List<Location> _spatialCoverage_) {
        this.imageResourceImpl.setSpatialCoverage(_spatialCoverage_);
        return this;
    }

    /**
     * This function allows adding a value to the List _spatialCoverage
     * 
     * @param _spatialCoverage_ desired value to be added
     * @return Builder object with new value for _spatialCoverage
     */
    public ImageResourceBuilder _spatialCoverage_(Location _spatialCoverage_) {
        this.imageResourceImpl.getSpatialCoverage().add(_spatialCoverage_);
        return this;
    }

    /**
     * This function allows setting a value for _accrualPeriodicity
     * 
     * @param _accrualPeriodicity_ desired value to be set
     * @return Builder object with new value for _accrualPeriodicity
     */
    public ImageResourceBuilder _accrualPeriodicity_(Frequency _accrualPeriodicity_) {
        this.imageResourceImpl.setAccrualPeriodicity(_accrualPeriodicity_);
        return this;
    }

    /**
     * This function allows setting a value for _contentStandard
     * 
     * @param _contentStandard_ desired value to be set
     * @return Builder object with new value for _contentStandard
     */
    public ImageResourceBuilder _contentStandard_(URI _contentStandard_) {
        this.imageResourceImpl.setContentStandard(_contentStandard_);
        return this;
    }

    /**
     * This function allows setting a value for _language
     * 
     * @param _language_ desired value to be set
     * @return Builder object with new value for _language
     */
    public ImageResourceBuilder _language_(List<Language> _language_) {
        this.imageResourceImpl.setLanguage(_language_);
        return this;
    }

    /**
     * This function allows adding a value to the List _language
     * 
     * @param _language_ desired value to be added
     * @return Builder object with new value for _language
     */
    public ImageResourceBuilder _language_(Language _language_) {
        this.imageResourceImpl.getLanguage().add(_language_);
        return this;
    }

    /**
     * This function allows setting a value for _created
     * 
     * @param _created_ desired value to be set
     * @return Builder object with new value for _created
     */
    public ImageResourceBuilder _created_(XMLGregorianCalendar _created_) {
        this.imageResourceImpl.setCreated(_created_);
        return this;
    }

    /**
     * This function allows setting a value for _modified
     * 
     * @param _modified_ desired value to be set
     * @return Builder object with new value for _modified
     */
    public ImageResourceBuilder _modified_(XMLGregorianCalendar _modified_) {
        this.imageResourceImpl.setModified(_modified_);
        return this;
    }

    /**
     * This function allows setting a value for _title
     * 
     * @param _title_ desired value to be set
     * @return Builder object with new value for _title
     */
    public ImageResourceBuilder _title_(List<TypedLiteral> _title_) {
        this.imageResourceImpl.setTitle(_title_);
        return this;
    }

    /**
     * This function allows adding a value to the List _title
     * 
     * @param _title_ desired value to be added
     * @return Builder object with new value for _title
     */
    public ImageResourceBuilder _title_(TypedLiteral _title_) {
        this.imageResourceImpl.getTitle().add(_title_);
        return this;
    }

    /**
     * This function allows setting a value for _description
     * 
     * @param _description_ desired value to be set
     * @return Builder object with new value for _description
     */
    public ImageResourceBuilder _description_(List<TypedLiteral> _description_) {
        this.imageResourceImpl.setDescription(_description_);
        return this;
    }

    /**
     * This function allows adding a value to the List _description
     * 
     * @param _description_ desired value to be added
     * @return Builder object with new value for _description
     */
    public ImageResourceBuilder _description_(TypedLiteral _description_) {
        this.imageResourceImpl.getDescription().add(_description_);
        return this;
    }

    /**
     * This function allows setting a value for _shapesGraph
     * 
     * @param _shapesGraph_ desired value to be set
     * @return Builder object with new value for _shapesGraph
     */
    public ImageResourceBuilder _shapesGraph_(URI _shapesGraph_) {
        this.imageResourceImpl.setShapesGraph(_shapesGraph_);
        return this;
    }

    /**
     * This function allows setting a value for _version
     * 
     * @param _version_ desired value to be set
     * @return Builder object with new value for _version
     */
    public ImageResourceBuilder _version_(String _version_) {
        this.imageResourceImpl.setVersion(_version_);
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
    public ImageResource build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(imageResourceImpl);
        return imageResourceImpl;
    }
}
