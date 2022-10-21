package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class VideoRepresentationBuilder implements Builder<VideoRepresentation> {

    private VideoRepresentationImpl videoRepresentationImpl;

    public VideoRepresentationBuilder() {
        videoRepresentationImpl = new VideoRepresentationImpl();
    }

    public VideoRepresentationBuilder(URI id) {
        this();
        videoRepresentationImpl.id = id;
    }

    /**
     * This function allows setting a value for _frameRate
     * 
     * @param _frameRate_ desired value to be set
     * @return Builder object with new value for _frameRate
     */
    public VideoRepresentationBuilder _frameRate_(java.math.BigDecimal _frameRate_) {
        this.videoRepresentationImpl.setFrameRate(_frameRate_);
        return this;
    }

    /**
     * This function allows setting a value for _instance
     * 
     * @param _instance_ desired value to be set
     * @return Builder object with new value for _instance
     */
    public VideoRepresentationBuilder _instance_(List<RepresentationInstance> _instance_) {
        this.videoRepresentationImpl.setInstance(_instance_);
        return this;
    }

    /**
     * This function allows adding a value to the List _instance
     * 
     * @param _instance_ desired value to be added
     * @return Builder object with new value for _instance
     */
    public VideoRepresentationBuilder _instance_(RepresentationInstance _instance_) {
        this.videoRepresentationImpl.getInstance().add(_instance_);
        return this;
    }

    /**
     * This function allows setting a value for _mediaType
     * 
     * @param _mediaType_ desired value to be set
     * @return Builder object with new value for _mediaType
     */
    public VideoRepresentationBuilder _mediaType_(MediaType _mediaType_) {
        this.videoRepresentationImpl.setMediaType(_mediaType_);
        return this;
    }

    /**
     * This function allows setting a value for _representationStandard
     * 
     * @param _representationStandard_ desired value to be set
     * @return Builder object with new value for _representationStandard
     */
    public VideoRepresentationBuilder _representationStandard_(URI _representationStandard_) {
        this.videoRepresentationImpl.setRepresentationStandard(_representationStandard_);
        return this;
    }

    /**
     * This function allows setting a value for _language
     * 
     * @param _language_ desired value to be set
     * @return Builder object with new value for _language
     */
    public VideoRepresentationBuilder _language_(Language _language_) {
        this.videoRepresentationImpl.setLanguage(_language_);
        return this;
    }

    /**
     * This function allows setting a value for _created
     * 
     * @param _created_ desired value to be set
     * @return Builder object with new value for _created
     */
    public VideoRepresentationBuilder _created_(XMLGregorianCalendar _created_) {
        this.videoRepresentationImpl.setCreated(_created_);
        return this;
    }

    /**
     * This function allows setting a value for _modified
     * 
     * @param _modified_ desired value to be set
     * @return Builder object with new value for _modified
     */
    public VideoRepresentationBuilder _modified_(XMLGregorianCalendar _modified_) {
        this.videoRepresentationImpl.setModified(_modified_);
        return this;
    }

    /**
     * This function allows setting a value for _title
     * 
     * @param _title_ desired value to be set
     * @return Builder object with new value for _title
     */
    public VideoRepresentationBuilder _title_(List<TypedLiteral> _title_) {
        this.videoRepresentationImpl.setTitle(_title_);
        return this;
    }

    /**
     * This function allows adding a value to the List _title
     * 
     * @param _title_ desired value to be added
     * @return Builder object with new value for _title
     */
    public VideoRepresentationBuilder _title_(TypedLiteral _title_) {
        this.videoRepresentationImpl.getTitle().add(_title_);
        return this;
    }

    /**
     * This function allows setting a value for _description
     * 
     * @param _description_ desired value to be set
     * @return Builder object with new value for _description
     */
    public VideoRepresentationBuilder _description_(List<TypedLiteral> _description_) {
        this.videoRepresentationImpl.setDescription(_description_);
        return this;
    }

    /**
     * This function allows adding a value to the List _description
     * 
     * @param _description_ desired value to be added
     * @return Builder object with new value for _description
     */
    public VideoRepresentationBuilder _description_(TypedLiteral _description_) {
        this.videoRepresentationImpl.getDescription().add(_description_);
        return this;
    }

    /**
     * This function allows setting a value for _shapesGraph
     * 
     * @param _shapesGraph_ desired value to be set
     * @return Builder object with new value for _shapesGraph
     */
    public VideoRepresentationBuilder _shapesGraph_(URI _shapesGraph_) {
        this.videoRepresentationImpl.setShapesGraph(_shapesGraph_);
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
    public VideoRepresentation build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(videoRepresentationImpl);
        return videoRepresentationImpl;
    }
}
