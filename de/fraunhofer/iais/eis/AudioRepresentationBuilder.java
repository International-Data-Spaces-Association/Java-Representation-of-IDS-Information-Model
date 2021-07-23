package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class AudioRepresentationBuilder implements Builder<AudioRepresentation> {

    private AudioRepresentationImpl audioRepresentationImpl;

    public AudioRepresentationBuilder() {
        audioRepresentationImpl = new AudioRepresentationImpl();
    }

    public AudioRepresentationBuilder(URI id) {
        this();
        audioRepresentationImpl.id = id;
    }

    /**
     * This function allows setting a value for _samplingRate
     * 
     * @param _samplingRate_ desired value to be set
     * @return Builder object with new value for _samplingRate
     */
    public AudioRepresentationBuilder _samplingRate_(java.math.BigDecimal _samplingRate_) {
        this.audioRepresentationImpl.setSamplingRate(_samplingRate_);
        return this;
    }

    /**
     * This function allows setting a value for _instance
     * 
     * @param _instance_ desired value to be set
     * @return Builder object with new value for _instance
     */
    public AudioRepresentationBuilder _instance_(List<RepresentationInstance> _instance_) {
        this.audioRepresentationImpl.setInstance(_instance_);
        return this;
    }

    /**
     * This function allows adding a value to the List _instance
     * 
     * @param _instance_ desired value to be added
     * @return Builder object with new value for _instance
     */
    public AudioRepresentationBuilder _instance_(RepresentationInstance _instance_) {
        this.audioRepresentationImpl.getInstance().add(_instance_);
        return this;
    }

    /**
     * This function allows setting a value for _mediaType
     * 
     * @param _mediaType_ desired value to be set
     * @return Builder object with new value for _mediaType
     */
    public AudioRepresentationBuilder _mediaType_(MediaType _mediaType_) {
        this.audioRepresentationImpl.setMediaType(_mediaType_);
        return this;
    }

    /**
     * This function allows setting a value for _representationStandard
     * 
     * @param _representationStandard_ desired value to be set
     * @return Builder object with new value for _representationStandard
     */
    public AudioRepresentationBuilder _representationStandard_(URI _representationStandard_) {
        this.audioRepresentationImpl.setRepresentationStandard(_representationStandard_);
        return this;
    }

    /**
     * This function allows setting a value for _language
     * 
     * @param _language_ desired value to be set
     * @return Builder object with new value for _language
     */
    public AudioRepresentationBuilder _language_(Language _language_) {
        this.audioRepresentationImpl.setLanguage(_language_);
        return this;
    }

    /**
     * This function allows setting a value for _created
     * 
     * @param _created_ desired value to be set
     * @return Builder object with new value for _created
     */
    public AudioRepresentationBuilder _created_(XMLGregorianCalendar _created_) {
        this.audioRepresentationImpl.setCreated(_created_);
        return this;
    }

    /**
     * This function allows setting a value for _modified
     * 
     * @param _modified_ desired value to be set
     * @return Builder object with new value for _modified
     */
    public AudioRepresentationBuilder _modified_(XMLGregorianCalendar _modified_) {
        this.audioRepresentationImpl.setModified(_modified_);
        return this;
    }

    /**
     * This function allows setting a value for _title
     * 
     * @param _title_ desired value to be set
     * @return Builder object with new value for _title
     */
    public AudioRepresentationBuilder _title_(List<TypedLiteral> _title_) {
        this.audioRepresentationImpl.setTitle(_title_);
        return this;
    }

    /**
     * This function allows adding a value to the List _title
     * 
     * @param _title_ desired value to be added
     * @return Builder object with new value for _title
     */
    public AudioRepresentationBuilder _title_(TypedLiteral _title_) {
        this.audioRepresentationImpl.getTitle().add(_title_);
        return this;
    }

    /**
     * This function allows setting a value for _description
     * 
     * @param _description_ desired value to be set
     * @return Builder object with new value for _description
     */
    public AudioRepresentationBuilder _description_(List<TypedLiteral> _description_) {
        this.audioRepresentationImpl.setDescription(_description_);
        return this;
    }

    /**
     * This function allows adding a value to the List _description
     * 
     * @param _description_ desired value to be added
     * @return Builder object with new value for _description
     */
    public AudioRepresentationBuilder _description_(TypedLiteral _description_) {
        this.audioRepresentationImpl.getDescription().add(_description_);
        return this;
    }

    /**
     * This function allows setting a value for _shapesGraph
     * 
     * @param _shapesGraph_ desired value to be set
     * @return Builder object with new value for _shapesGraph
     */
    public AudioRepresentationBuilder _shapesGraph_(URI _shapesGraph_) {
        this.audioRepresentationImpl.setShapesGraph(_shapesGraph_);
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
    public AudioRepresentation build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(audioRepresentationImpl);
        return audioRepresentationImpl;
    }
}
