package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class TextResourceBuilder implements Builder<TextResource> {

    private TextResourceImpl textResourceImpl;

    public TextResourceBuilder() {
        textResourceImpl = new TextResourceImpl();
    }

    public TextResourceBuilder(URI id) {
        this();
        textResourceImpl.id = id;
    }

    /**
     * This function allows setting a value for _standardLicense
     * 
     * @param _standardLicense_ desired value to be set
     * @return Builder object with new value for _standardLicense
     */
    public TextResourceBuilder _standardLicense_(URI _standardLicense_) {
        this.textResourceImpl.setStandardLicense(_standardLicense_);
        return this;
    }

    /**
     * This function allows setting a value for _customLicense
     * 
     * @param _customLicense_ desired value to be set
     * @return Builder object with new value for _customLicense
     */
    public TextResourceBuilder _customLicense_(URI _customLicense_) {
        this.textResourceImpl.setCustomLicense(_customLicense_);
        return this;
    }

    /**
     * This function allows setting a value for _resourcePart
     * 
     * @param _resourcePart_ desired value to be set
     * @return Builder object with new value for _resourcePart
     */
    public TextResourceBuilder _resourcePart_(List<Resource> _resourcePart_) {
        this.textResourceImpl.setResourcePart(_resourcePart_);
        return this;
    }

    /**
     * This function allows adding a value to the List _resourcePart
     * 
     * @param _resourcePart_ desired value to be added
     * @return Builder object with new value for _resourcePart
     */
    public TextResourceBuilder _resourcePart_(Resource _resourcePart_) {
        this.textResourceImpl.getResourcePart().add(_resourcePart_);
        return this;
    }

    /**
     * This function allows setting a value for _resourceEndpoint
     * 
     * @param _resourceEndpoint_ desired value to be set
     * @return Builder object with new value for _resourceEndpoint
     */
    public TextResourceBuilder _resourceEndpoint_(List<ConnectorEndpoint> _resourceEndpoint_) {
        this.textResourceImpl.setResourceEndpoint(_resourceEndpoint_);
        return this;
    }

    /**
     * This function allows adding a value to the List _resourceEndpoint
     * 
     * @param _resourceEndpoint_ desired value to be added
     * @return Builder object with new value for _resourceEndpoint
     */
    public TextResourceBuilder _resourceEndpoint_(ConnectorEndpoint _resourceEndpoint_) {
        this.textResourceImpl.getResourceEndpoint().add(_resourceEndpoint_);
        return this;
    }

    /**
     * This function allows setting a value for _contractOffer
     * 
     * @param _contractOffer_ desired value to be set
     * @return Builder object with new value for _contractOffer
     */
    public TextResourceBuilder _contractOffer_(List<ContractOffer> _contractOffer_) {
        this.textResourceImpl.setContractOffer(_contractOffer_);
        return this;
    }

    /**
     * This function allows adding a value to the List _contractOffer
     * 
     * @param _contractOffer_ desired value to be added
     * @return Builder object with new value for _contractOffer
     */
    public TextResourceBuilder _contractOffer_(ContractOffer _contractOffer_) {
        this.textResourceImpl.getContractOffer().add(_contractOffer_);
        return this;
    }

    /**
     * This function allows setting a value for _paymentModality
     * 
     * @param _paymentModality_ desired value to be set
     * @return Builder object with new value for _paymentModality
     */
    public TextResourceBuilder _paymentModality_(PaymentModality _paymentModality_) {
        this.textResourceImpl.setPaymentModality(_paymentModality_);
        return this;
    }

    /**
     * This function allows setting a value for _publisher
     * 
     * @param _publisher_ desired value to be set
     * @return Builder object with new value for _publisher
     */
    public TextResourceBuilder _publisher_(URI _publisher_) {
        this.textResourceImpl.setPublisher(_publisher_);
        return this;
    }

    /**
     * This function allows setting a value for _sovereign
     * 
     * @param _sovereign_ desired value to be set
     * @return Builder object with new value for _sovereign
     */
    public TextResourceBuilder _sovereign_(URI _sovereign_) {
        this.textResourceImpl.setSovereign(_sovereign_);
        return this;
    }

    /**
     * This function allows setting a value for _sample
     * 
     * @param _sample_ desired value to be set
     * @return Builder object with new value for _sample
     */
    public TextResourceBuilder _sample_(List<Resource> _sample_) {
        this.textResourceImpl.setSample(_sample_);
        return this;
    }

    /**
     * This function allows adding a value to the List _sample
     * 
     * @param _sample_ desired value to be added
     * @return Builder object with new value for _sample
     */
    public TextResourceBuilder _sample_(Resource _sample_) {
        this.textResourceImpl.getSample().add(_sample_);
        return this;
    }

    /**
     * This function allows setting a value for _variant
     * 
     * @param _variant_ desired value to be set
     * @return Builder object with new value for _variant
     */
    public TextResourceBuilder _variant_(Resource _variant_) {
        this.textResourceImpl.setVariant(_variant_);
        return this;
    }

    /**
     * This function allows setting a value for _contentType
     * 
     * @param _contentType_ desired value to be set
     * @return Builder object with new value for _contentType
     */
    public TextResourceBuilder _contentType_(ContentType _contentType_) {
        this.textResourceImpl.setContentType(_contentType_);
        return this;
    }

    /**
     * This function allows setting a value for _contentPart
     * 
     * @param _contentPart_ desired value to be set
     * @return Builder object with new value for _contentPart
     */
    public TextResourceBuilder _contentPart_(List<DigitalContent> _contentPart_) {
        this.textResourceImpl.setContentPart(_contentPart_);
        return this;
    }

    /**
     * This function allows adding a value to the List _contentPart
     * 
     * @param _contentPart_ desired value to be added
     * @return Builder object with new value for _contentPart
     */
    public TextResourceBuilder _contentPart_(DigitalContent _contentPart_) {
        this.textResourceImpl.getContentPart().add(_contentPart_);
        return this;
    }

    /**
     * This function allows setting a value for _representation
     * 
     * @param _representation_ desired value to be set
     * @return Builder object with new value for _representation
     */
    public TextResourceBuilder _representation_(List<Representation> _representation_) {
        this.textResourceImpl.setRepresentation(_representation_);
        return this;
    }

    /**
     * This function allows adding a value to the List _representation
     * 
     * @param _representation_ desired value to be added
     * @return Builder object with new value for _representation
     */
    public TextResourceBuilder _representation_(Representation _representation_) {
        this.textResourceImpl.getRepresentation().add(_representation_);
        return this;
    }

    /**
     * This function allows setting a value for _defaultRepresentation
     * 
     * @param _defaultRepresentation_ desired value to be set
     * @return Builder object with new value for _defaultRepresentation
     */
    public TextResourceBuilder _defaultRepresentation_(List<Representation> _defaultRepresentation_) {
        this.textResourceImpl.setDefaultRepresentation(_defaultRepresentation_);
        return this;
    }

    /**
     * This function allows adding a value to the List _defaultRepresentation
     * 
     * @param _defaultRepresentation_ desired value to be added
     * @return Builder object with new value for _defaultRepresentation
     */
    public TextResourceBuilder _defaultRepresentation_(Representation _defaultRepresentation_) {
        this.textResourceImpl.getDefaultRepresentation().add(_defaultRepresentation_);
        return this;
    }

    /**
     * This function allows setting a value for _theme
     * 
     * @param _theme_ desired value to be set
     * @return Builder object with new value for _theme
     */
    public TextResourceBuilder _theme_(List<URI> _theme_) {
        this.textResourceImpl.setTheme(_theme_);
        return this;
    }

    /**
     * This function allows adding a value to the List _theme
     * 
     * @param _theme_ desired value to be added
     * @return Builder object with new value for _theme
     */
    public TextResourceBuilder _theme_(URI _theme_) {
        this.textResourceImpl.getTheme().add(_theme_);
        return this;
    }

    /**
     * This function allows setting a value for _keyword
     * 
     * @param _keyword_ desired value to be set
     * @return Builder object with new value for _keyword
     */
    public TextResourceBuilder _keyword_(List<TypedLiteral> _keyword_) {
        this.textResourceImpl.setKeyword(_keyword_);
        return this;
    }

    /**
     * This function allows adding a value to the List _keyword
     * 
     * @param _keyword_ desired value to be added
     * @return Builder object with new value for _keyword
     */
    public TextResourceBuilder _keyword_(TypedLiteral _keyword_) {
        this.textResourceImpl.getKeyword().add(_keyword_);
        return this;
    }

    /**
     * This function allows setting a value for _temporalCoverage
     * 
     * @param _temporalCoverage_ desired value to be set
     * @return Builder object with new value for _temporalCoverage
     */
    public TextResourceBuilder _temporalCoverage_(List<TemporalEntity> _temporalCoverage_) {
        this.textResourceImpl.setTemporalCoverage(_temporalCoverage_);
        return this;
    }

    /**
     * This function allows adding a value to the List _temporalCoverage
     * 
     * @param _temporalCoverage_ desired value to be added
     * @return Builder object with new value for _temporalCoverage
     */
    public TextResourceBuilder _temporalCoverage_(TemporalEntity _temporalCoverage_) {
        this.textResourceImpl.getTemporalCoverage().add(_temporalCoverage_);
        return this;
    }

    /**
     * This function allows setting a value for _temporalResolution
     * 
     * @param _temporalResolution_ desired value to be set
     * @return Builder object with new value for _temporalResolution
     */
    public TextResourceBuilder _temporalResolution_(Frequency _temporalResolution_) {
        this.textResourceImpl.setTemporalResolution(_temporalResolution_);
        return this;
    }

    /**
     * This function allows setting a value for _spatialCoverage
     * 
     * @param _spatialCoverage_ desired value to be set
     * @return Builder object with new value for _spatialCoverage
     */
    public TextResourceBuilder _spatialCoverage_(List<Location> _spatialCoverage_) {
        this.textResourceImpl.setSpatialCoverage(_spatialCoverage_);
        return this;
    }

    /**
     * This function allows adding a value to the List _spatialCoverage
     * 
     * @param _spatialCoverage_ desired value to be added
     * @return Builder object with new value for _spatialCoverage
     */
    public TextResourceBuilder _spatialCoverage_(Location _spatialCoverage_) {
        this.textResourceImpl.getSpatialCoverage().add(_spatialCoverage_);
        return this;
    }

    /**
     * This function allows setting a value for _accrualPeriodicity
     * 
     * @param _accrualPeriodicity_ desired value to be set
     * @return Builder object with new value for _accrualPeriodicity
     */
    public TextResourceBuilder _accrualPeriodicity_(Frequency _accrualPeriodicity_) {
        this.textResourceImpl.setAccrualPeriodicity(_accrualPeriodicity_);
        return this;
    }

    /**
     * This function allows setting a value for _contentStandard
     * 
     * @param _contentStandard_ desired value to be set
     * @return Builder object with new value for _contentStandard
     */
    public TextResourceBuilder _contentStandard_(URI _contentStandard_) {
        this.textResourceImpl.setContentStandard(_contentStandard_);
        return this;
    }

    /**
     * This function allows setting a value for _language
     * 
     * @param _language_ desired value to be set
     * @return Builder object with new value for _language
     */
    public TextResourceBuilder _language_(List<Language> _language_) {
        this.textResourceImpl.setLanguage(_language_);
        return this;
    }

    /**
     * This function allows adding a value to the List _language
     * 
     * @param _language_ desired value to be added
     * @return Builder object with new value for _language
     */
    public TextResourceBuilder _language_(Language _language_) {
        this.textResourceImpl.getLanguage().add(_language_);
        return this;
    }

    /**
     * This function allows setting a value for _created
     * 
     * @param _created_ desired value to be set
     * @return Builder object with new value for _created
     */
    public TextResourceBuilder _created_(XMLGregorianCalendar _created_) {
        this.textResourceImpl.setCreated(_created_);
        return this;
    }

    /**
     * This function allows setting a value for _modified
     * 
     * @param _modified_ desired value to be set
     * @return Builder object with new value for _modified
     */
    public TextResourceBuilder _modified_(XMLGregorianCalendar _modified_) {
        this.textResourceImpl.setModified(_modified_);
        return this;
    }

    /**
     * This function allows setting a value for _title
     * 
     * @param _title_ desired value to be set
     * @return Builder object with new value for _title
     */
    public TextResourceBuilder _title_(List<TypedLiteral> _title_) {
        this.textResourceImpl.setTitle(_title_);
        return this;
    }

    /**
     * This function allows adding a value to the List _title
     * 
     * @param _title_ desired value to be added
     * @return Builder object with new value for _title
     */
    public TextResourceBuilder _title_(TypedLiteral _title_) {
        this.textResourceImpl.getTitle().add(_title_);
        return this;
    }

    /**
     * This function allows setting a value for _description
     * 
     * @param _description_ desired value to be set
     * @return Builder object with new value for _description
     */
    public TextResourceBuilder _description_(List<TypedLiteral> _description_) {
        this.textResourceImpl.setDescription(_description_);
        return this;
    }

    /**
     * This function allows adding a value to the List _description
     * 
     * @param _description_ desired value to be added
     * @return Builder object with new value for _description
     */
    public TextResourceBuilder _description_(TypedLiteral _description_) {
        this.textResourceImpl.getDescription().add(_description_);
        return this;
    }

    /**
     * This function allows setting a value for _shapesGraph
     * 
     * @param _shapesGraph_ desired value to be set
     * @return Builder object with new value for _shapesGraph
     */
    public TextResourceBuilder _shapesGraph_(URI _shapesGraph_) {
        this.textResourceImpl.setShapesGraph(_shapesGraph_);
        return this;
    }

    /**
     * This function allows setting a value for _version
     * 
     * @param _version_ desired value to be set
     * @return Builder object with new value for _version
     */
    public TextResourceBuilder _version_(String _version_) {
        this.textResourceImpl.setVersion(_version_);
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
    public TextResource build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(textResourceImpl);
        return textResourceImpl;
    }
}
