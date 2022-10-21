package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class AudioResourceBuilder implements Builder<AudioResource> {

    private AudioResourceImpl audioResourceImpl;

    public AudioResourceBuilder() {
        audioResourceImpl = new AudioResourceImpl();
    }

    public AudioResourceBuilder(URI id) {
        this();
        audioResourceImpl.id = id;
    }

    /**
     * This function allows setting a value for _standardLicense
     * 
     * @param _standardLicense_ desired value to be set
     * @return Builder object with new value for _standardLicense
     */
    public AudioResourceBuilder _standardLicense_(URI _standardLicense_) {
        this.audioResourceImpl.setStandardLicense(_standardLicense_);
        return this;
    }

    /**
     * This function allows setting a value for _customLicense
     * 
     * @param _customLicense_ desired value to be set
     * @return Builder object with new value for _customLicense
     */
    public AudioResourceBuilder _customLicense_(URI _customLicense_) {
        this.audioResourceImpl.setCustomLicense(_customLicense_);
        return this;
    }

    /**
     * This function allows setting a value for _resourcePart
     * 
     * @param _resourcePart_ desired value to be set
     * @return Builder object with new value for _resourcePart
     */
    public AudioResourceBuilder _resourcePart_(List<Resource> _resourcePart_) {
        this.audioResourceImpl.setResourcePart(_resourcePart_);
        return this;
    }

    /**
     * This function allows adding a value to the List _resourcePart
     * 
     * @param _resourcePart_ desired value to be added
     * @return Builder object with new value for _resourcePart
     */
    public AudioResourceBuilder _resourcePart_(Resource _resourcePart_) {
        this.audioResourceImpl.getResourcePart().add(_resourcePart_);
        return this;
    }

    /**
     * This function allows setting a value for _resourceEndpoint
     * 
     * @param _resourceEndpoint_ desired value to be set
     * @return Builder object with new value for _resourceEndpoint
     */
    public AudioResourceBuilder _resourceEndpoint_(List<ConnectorEndpoint> _resourceEndpoint_) {
        this.audioResourceImpl.setResourceEndpoint(_resourceEndpoint_);
        return this;
    }

    /**
     * This function allows adding a value to the List _resourceEndpoint
     * 
     * @param _resourceEndpoint_ desired value to be added
     * @return Builder object with new value for _resourceEndpoint
     */
    public AudioResourceBuilder _resourceEndpoint_(ConnectorEndpoint _resourceEndpoint_) {
        this.audioResourceImpl.getResourceEndpoint().add(_resourceEndpoint_);
        return this;
    }

    /**
     * This function allows setting a value for _contractOffer
     * 
     * @param _contractOffer_ desired value to be set
     * @return Builder object with new value for _contractOffer
     */
    public AudioResourceBuilder _contractOffer_(List<ContractOffer> _contractOffer_) {
        this.audioResourceImpl.setContractOffer(_contractOffer_);
        return this;
    }

    /**
     * This function allows adding a value to the List _contractOffer
     * 
     * @param _contractOffer_ desired value to be added
     * @return Builder object with new value for _contractOffer
     */
    public AudioResourceBuilder _contractOffer_(ContractOffer _contractOffer_) {
        this.audioResourceImpl.getContractOffer().add(_contractOffer_);
        return this;
    }

    /**
     * This function allows setting a value for _paymentModality
     * 
     * @param _paymentModality_ desired value to be set
     * @return Builder object with new value for _paymentModality
     */
    public AudioResourceBuilder _paymentModality_(PaymentModality _paymentModality_) {
        this.audioResourceImpl.setPaymentModality(_paymentModality_);
        return this;
    }

    /**
     * This function allows setting a value for _publisher
     * 
     * @param _publisher_ desired value to be set
     * @return Builder object with new value for _publisher
     */
    public AudioResourceBuilder _publisher_(URI _publisher_) {
        this.audioResourceImpl.setPublisher(_publisher_);
        return this;
    }

    /**
     * This function allows setting a value for _sovereign
     * 
     * @param _sovereign_ desired value to be set
     * @return Builder object with new value for _sovereign
     */
    public AudioResourceBuilder _sovereign_(URI _sovereign_) {
        this.audioResourceImpl.setSovereign(_sovereign_);
        return this;
    }

    /**
     * This function allows setting a value for _sample
     * 
     * @param _sample_ desired value to be set
     * @return Builder object with new value for _sample
     */
    public AudioResourceBuilder _sample_(List<Resource> _sample_) {
        this.audioResourceImpl.setSample(_sample_);
        return this;
    }

    /**
     * This function allows adding a value to the List _sample
     * 
     * @param _sample_ desired value to be added
     * @return Builder object with new value for _sample
     */
    public AudioResourceBuilder _sample_(Resource _sample_) {
        this.audioResourceImpl.getSample().add(_sample_);
        return this;
    }

    /**
     * This function allows setting a value for _variant
     * 
     * @param _variant_ desired value to be set
     * @return Builder object with new value for _variant
     */
    public AudioResourceBuilder _variant_(Resource _variant_) {
        this.audioResourceImpl.setVariant(_variant_);
        return this;
    }

    /**
     * This function allows setting a value for _contentType
     * 
     * @param _contentType_ desired value to be set
     * @return Builder object with new value for _contentType
     */
    public AudioResourceBuilder _contentType_(ContentType _contentType_) {
        this.audioResourceImpl.setContentType(_contentType_);
        return this;
    }

    /**
     * This function allows setting a value for _contentPart
     * 
     * @param _contentPart_ desired value to be set
     * @return Builder object with new value for _contentPart
     */
    public AudioResourceBuilder _contentPart_(List<DigitalContent> _contentPart_) {
        this.audioResourceImpl.setContentPart(_contentPart_);
        return this;
    }

    /**
     * This function allows adding a value to the List _contentPart
     * 
     * @param _contentPart_ desired value to be added
     * @return Builder object with new value for _contentPart
     */
    public AudioResourceBuilder _contentPart_(DigitalContent _contentPart_) {
        this.audioResourceImpl.getContentPart().add(_contentPart_);
        return this;
    }

    /**
     * This function allows setting a value for _representation
     * 
     * @param _representation_ desired value to be set
     * @return Builder object with new value for _representation
     */
    public AudioResourceBuilder _representation_(List<Representation> _representation_) {
        this.audioResourceImpl.setRepresentation(_representation_);
        return this;
    }

    /**
     * This function allows adding a value to the List _representation
     * 
     * @param _representation_ desired value to be added
     * @return Builder object with new value for _representation
     */
    public AudioResourceBuilder _representation_(Representation _representation_) {
        this.audioResourceImpl.getRepresentation().add(_representation_);
        return this;
    }

    /**
     * This function allows setting a value for _defaultRepresentation
     * 
     * @param _defaultRepresentation_ desired value to be set
     * @return Builder object with new value for _defaultRepresentation
     */
    public AudioResourceBuilder _defaultRepresentation_(List<Representation> _defaultRepresentation_) {
        this.audioResourceImpl.setDefaultRepresentation(_defaultRepresentation_);
        return this;
    }

    /**
     * This function allows adding a value to the List _defaultRepresentation
     * 
     * @param _defaultRepresentation_ desired value to be added
     * @return Builder object with new value for _defaultRepresentation
     */
    public AudioResourceBuilder _defaultRepresentation_(Representation _defaultRepresentation_) {
        this.audioResourceImpl.getDefaultRepresentation().add(_defaultRepresentation_);
        return this;
    }

    /**
     * This function allows setting a value for _theme
     * 
     * @param _theme_ desired value to be set
     * @return Builder object with new value for _theme
     */
    public AudioResourceBuilder _theme_(List<URI> _theme_) {
        this.audioResourceImpl.setTheme(_theme_);
        return this;
    }

    /**
     * This function allows adding a value to the List _theme
     * 
     * @param _theme_ desired value to be added
     * @return Builder object with new value for _theme
     */
    public AudioResourceBuilder _theme_(URI _theme_) {
        this.audioResourceImpl.getTheme().add(_theme_);
        return this;
    }

    /**
     * This function allows setting a value for _keyword
     * 
     * @param _keyword_ desired value to be set
     * @return Builder object with new value for _keyword
     */
    public AudioResourceBuilder _keyword_(List<TypedLiteral> _keyword_) {
        this.audioResourceImpl.setKeyword(_keyword_);
        return this;
    }

    /**
     * This function allows adding a value to the List _keyword
     * 
     * @param _keyword_ desired value to be added
     * @return Builder object with new value for _keyword
     */
    public AudioResourceBuilder _keyword_(TypedLiteral _keyword_) {
        this.audioResourceImpl.getKeyword().add(_keyword_);
        return this;
    }

    /**
     * This function allows setting a value for _temporalCoverage
     * 
     * @param _temporalCoverage_ desired value to be set
     * @return Builder object with new value for _temporalCoverage
     */
    public AudioResourceBuilder _temporalCoverage_(List<TemporalEntity> _temporalCoverage_) {
        this.audioResourceImpl.setTemporalCoverage(_temporalCoverage_);
        return this;
    }

    /**
     * This function allows adding a value to the List _temporalCoverage
     * 
     * @param _temporalCoverage_ desired value to be added
     * @return Builder object with new value for _temporalCoverage
     */
    public AudioResourceBuilder _temporalCoverage_(TemporalEntity _temporalCoverage_) {
        this.audioResourceImpl.getTemporalCoverage().add(_temporalCoverage_);
        return this;
    }

    /**
     * This function allows setting a value for _temporalResolution
     * 
     * @param _temporalResolution_ desired value to be set
     * @return Builder object with new value for _temporalResolution
     */
    public AudioResourceBuilder _temporalResolution_(Frequency _temporalResolution_) {
        this.audioResourceImpl.setTemporalResolution(_temporalResolution_);
        return this;
    }

    /**
     * This function allows setting a value for _spatialCoverage
     * 
     * @param _spatialCoverage_ desired value to be set
     * @return Builder object with new value for _spatialCoverage
     */
    public AudioResourceBuilder _spatialCoverage_(List<Location> _spatialCoverage_) {
        this.audioResourceImpl.setSpatialCoverage(_spatialCoverage_);
        return this;
    }

    /**
     * This function allows adding a value to the List _spatialCoverage
     * 
     * @param _spatialCoverage_ desired value to be added
     * @return Builder object with new value for _spatialCoverage
     */
    public AudioResourceBuilder _spatialCoverage_(Location _spatialCoverage_) {
        this.audioResourceImpl.getSpatialCoverage().add(_spatialCoverage_);
        return this;
    }

    /**
     * This function allows setting a value for _accrualPeriodicity
     * 
     * @param _accrualPeriodicity_ desired value to be set
     * @return Builder object with new value for _accrualPeriodicity
     */
    public AudioResourceBuilder _accrualPeriodicity_(Frequency _accrualPeriodicity_) {
        this.audioResourceImpl.setAccrualPeriodicity(_accrualPeriodicity_);
        return this;
    }

    /**
     * This function allows setting a value for _contentStandard
     * 
     * @param _contentStandard_ desired value to be set
     * @return Builder object with new value for _contentStandard
     */
    public AudioResourceBuilder _contentStandard_(URI _contentStandard_) {
        this.audioResourceImpl.setContentStandard(_contentStandard_);
        return this;
    }

    /**
     * This function allows setting a value for _language
     * 
     * @param _language_ desired value to be set
     * @return Builder object with new value for _language
     */
    public AudioResourceBuilder _language_(List<Language> _language_) {
        this.audioResourceImpl.setLanguage(_language_);
        return this;
    }

    /**
     * This function allows adding a value to the List _language
     * 
     * @param _language_ desired value to be added
     * @return Builder object with new value for _language
     */
    public AudioResourceBuilder _language_(Language _language_) {
        this.audioResourceImpl.getLanguage().add(_language_);
        return this;
    }

    /**
     * This function allows setting a value for _created
     * 
     * @param _created_ desired value to be set
     * @return Builder object with new value for _created
     */
    public AudioResourceBuilder _created_(XMLGregorianCalendar _created_) {
        this.audioResourceImpl.setCreated(_created_);
        return this;
    }

    /**
     * This function allows setting a value for _modified
     * 
     * @param _modified_ desired value to be set
     * @return Builder object with new value for _modified
     */
    public AudioResourceBuilder _modified_(XMLGregorianCalendar _modified_) {
        this.audioResourceImpl.setModified(_modified_);
        return this;
    }

    /**
     * This function allows setting a value for _title
     * 
     * @param _title_ desired value to be set
     * @return Builder object with new value for _title
     */
    public AudioResourceBuilder _title_(List<TypedLiteral> _title_) {
        this.audioResourceImpl.setTitle(_title_);
        return this;
    }

    /**
     * This function allows adding a value to the List _title
     * 
     * @param _title_ desired value to be added
     * @return Builder object with new value for _title
     */
    public AudioResourceBuilder _title_(TypedLiteral _title_) {
        this.audioResourceImpl.getTitle().add(_title_);
        return this;
    }

    /**
     * This function allows setting a value for _description
     * 
     * @param _description_ desired value to be set
     * @return Builder object with new value for _description
     */
    public AudioResourceBuilder _description_(List<TypedLiteral> _description_) {
        this.audioResourceImpl.setDescription(_description_);
        return this;
    }

    /**
     * This function allows adding a value to the List _description
     * 
     * @param _description_ desired value to be added
     * @return Builder object with new value for _description
     */
    public AudioResourceBuilder _description_(TypedLiteral _description_) {
        this.audioResourceImpl.getDescription().add(_description_);
        return this;
    }

    /**
     * This function allows setting a value for _shapesGraph
     * 
     * @param _shapesGraph_ desired value to be set
     * @return Builder object with new value for _shapesGraph
     */
    public AudioResourceBuilder _shapesGraph_(URI _shapesGraph_) {
        this.audioResourceImpl.setShapesGraph(_shapesGraph_);
        return this;
    }

    /**
     * This function allows setting a value for _version
     * 
     * @param _version_ desired value to be set
     * @return Builder object with new value for _version
     */
    public AudioResourceBuilder _version_(String _version_) {
        this.audioResourceImpl.setVersion(_version_);
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
    public AudioResource build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(audioResourceImpl);
        return audioResourceImpl;
    }
}
