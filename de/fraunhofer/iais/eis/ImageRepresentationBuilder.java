package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class ImageRepresentationBuilder implements Builder<ImageRepresentation> {

    private ImageRepresentationImpl imageRepresentationImpl;

    public ImageRepresentationBuilder() {
        imageRepresentationImpl = new ImageRepresentationImpl();
    }

    public ImageRepresentationBuilder(URI id) {
        this();
        imageRepresentationImpl.id = id;
    }

    /**
     * This function allows setting a value for _width
     * 
     * @param _width_ desired value to be set
     * @return Builder object with new value for _width
     */
    public ImageRepresentationBuilder _width_(java.math.BigDecimal _width_) {
        this.imageRepresentationImpl.setWidth(_width_);
        return this;
    }

    /**
     * This function allows setting a value for _height
     * 
     * @param _height_ desired value to be set
     * @return Builder object with new value for _height
     */
    public ImageRepresentationBuilder _height_(java.math.BigDecimal _height_) {
        this.imageRepresentationImpl.setHeight(_height_);
        return this;
    }

    /**
     * This function allows setting a value for _instance
     * 
     * @param _instance_ desired value to be set
     * @return Builder object with new value for _instance
     */
    public ImageRepresentationBuilder _instance_(List<RepresentationInstance> _instance_) {
        this.imageRepresentationImpl.setInstance(_instance_);
        return this;
    }

    /**
     * This function allows adding a value to the List _instance
     * 
     * @param _instance_ desired value to be added
     * @return Builder object with new value for _instance
     */
    public ImageRepresentationBuilder _instance_(RepresentationInstance _instance_) {
        this.imageRepresentationImpl.getInstance().add(_instance_);
        return this;
    }

    /**
     * This function allows setting a value for _mediaType
     * 
     * @param _mediaType_ desired value to be set
     * @return Builder object with new value for _mediaType
     */
    public ImageRepresentationBuilder _mediaType_(MediaType _mediaType_) {
        this.imageRepresentationImpl.setMediaType(_mediaType_);
        return this;
    }

    /**
     * This function allows setting a value for _representationStandard
     * 
     * @param _representationStandard_ desired value to be set
     * @return Builder object with new value for _representationStandard
     */
    public ImageRepresentationBuilder _representationStandard_(URI _representationStandard_) {
        this.imageRepresentationImpl.setRepresentationStandard(_representationStandard_);
        return this;
    }

    /**
     * This function allows setting a value for _language
     * 
     * @param _language_ desired value to be set
     * @return Builder object with new value for _language
     */
    public ImageRepresentationBuilder _language_(Language _language_) {
        this.imageRepresentationImpl.setLanguage(_language_);
        return this;
    }

    /**
     * This function allows setting a value for _created
     * 
     * @param _created_ desired value to be set
     * @return Builder object with new value for _created
     */
    public ImageRepresentationBuilder _created_(XMLGregorianCalendar _created_) {
        this.imageRepresentationImpl.setCreated(_created_);
        return this;
    }

    /**
     * This function allows setting a value for _modified
     * 
     * @param _modified_ desired value to be set
     * @return Builder object with new value for _modified
     */
    public ImageRepresentationBuilder _modified_(XMLGregorianCalendar _modified_) {
        this.imageRepresentationImpl.setModified(_modified_);
        return this;
    }

    /**
     * This function allows setting a value for _title
     * 
     * @param _title_ desired value to be set
     * @return Builder object with new value for _title
     */
    public ImageRepresentationBuilder _title_(List<TypedLiteral> _title_) {
        this.imageRepresentationImpl.setTitle(_title_);
        return this;
    }

    /**
     * This function allows adding a value to the List _title
     * 
     * @param _title_ desired value to be added
     * @return Builder object with new value for _title
     */
    public ImageRepresentationBuilder _title_(TypedLiteral _title_) {
        this.imageRepresentationImpl.getTitle().add(_title_);
        return this;
    }

    /**
     * This function allows setting a value for _description
     * 
     * @param _description_ desired value to be set
     * @return Builder object with new value for _description
     */
    public ImageRepresentationBuilder _description_(List<TypedLiteral> _description_) {
        this.imageRepresentationImpl.setDescription(_description_);
        return this;
    }

    /**
     * This function allows adding a value to the List _description
     * 
     * @param _description_ desired value to be added
     * @return Builder object with new value for _description
     */
    public ImageRepresentationBuilder _description_(TypedLiteral _description_) {
        this.imageRepresentationImpl.getDescription().add(_description_);
        return this;
    }

    /**
     * This function allows setting a value for _shapesGraph
     * 
     * @param _shapesGraph_ desired value to be set
     * @return Builder object with new value for _shapesGraph
     */
    public ImageRepresentationBuilder _shapesGraph_(URI _shapesGraph_) {
        this.imageRepresentationImpl.setShapesGraph(_shapesGraph_);
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
    public ImageRepresentation build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(imageRepresentationImpl);
        return imageRepresentationImpl;
    }
}
