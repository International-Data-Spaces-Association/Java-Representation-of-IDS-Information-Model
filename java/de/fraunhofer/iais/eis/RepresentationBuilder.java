package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class RepresentationBuilder implements Builder<Representation> {

    private RepresentationImpl representationImpl;

    public RepresentationBuilder() {
        representationImpl = new RepresentationImpl();
    }

    public RepresentationBuilder(URI id) {
        this();
        representationImpl.id = id;
    }

    /**
     * This function allows setting a value for _instance
     * 
     * @param _instance_ desired value to be set
     * @return Builder object with new value for _instance
     */
    public RepresentationBuilder _instance_(List<RepresentationInstance> _instance_) {
        this.representationImpl.setInstance(_instance_);
        return this;
    }

    /**
     * This function allows adding a value to the List _instance
     * 
     * @param _instance_ desired value to be added
     * @return Builder object with new value for _instance
     */
    public RepresentationBuilder _instance_(RepresentationInstance _instance_) {
        this.representationImpl.getInstance().add(_instance_);
        return this;
    }

    /**
     * This function allows setting a value for _mediaType
     * 
     * @param _mediaType_ desired value to be set
     * @return Builder object with new value for _mediaType
     */
    public RepresentationBuilder _mediaType_(MediaType _mediaType_) {
        this.representationImpl.setMediaType(_mediaType_);
        return this;
    }

    /**
     * This function allows setting a value for _representationStandard
     * 
     * @param _representationStandard_ desired value to be set
     * @return Builder object with new value for _representationStandard
     */
    public RepresentationBuilder _representationStandard_(URI _representationStandard_) {
        this.representationImpl.setRepresentationStandard(_representationStandard_);
        return this;
    }

    /**
     * This function allows setting a value for _language
     * 
     * @param _language_ desired value to be set
     * @return Builder object with new value for _language
     */
    public RepresentationBuilder _language_(Language _language_) {
        this.representationImpl.setLanguage(_language_);
        return this;
    }

    /**
     * This function allows setting a value for _created
     * 
     * @param _created_ desired value to be set
     * @return Builder object with new value for _created
     */
    public RepresentationBuilder _created_(XMLGregorianCalendar _created_) {
        this.representationImpl.setCreated(_created_);
        return this;
    }

    /**
     * This function allows setting a value for _modified
     * 
     * @param _modified_ desired value to be set
     * @return Builder object with new value for _modified
     */
    public RepresentationBuilder _modified_(XMLGregorianCalendar _modified_) {
        this.representationImpl.setModified(_modified_);
        return this;
    }

    /**
     * This function allows setting a value for _title
     * 
     * @param _title_ desired value to be set
     * @return Builder object with new value for _title
     */
    public RepresentationBuilder _title_(List<TypedLiteral> _title_) {
        this.representationImpl.setTitle(_title_);
        return this;
    }

    /**
     * This function allows adding a value to the List _title
     * 
     * @param _title_ desired value to be added
     * @return Builder object with new value for _title
     */
    public RepresentationBuilder _title_(TypedLiteral _title_) {
        this.representationImpl.getTitle().add(_title_);
        return this;
    }

    /**
     * This function allows setting a value for _description
     * 
     * @param _description_ desired value to be set
     * @return Builder object with new value for _description
     */
    public RepresentationBuilder _description_(List<TypedLiteral> _description_) {
        this.representationImpl.setDescription(_description_);
        return this;
    }

    /**
     * This function allows adding a value to the List _description
     * 
     * @param _description_ desired value to be added
     * @return Builder object with new value for _description
     */
    public RepresentationBuilder _description_(TypedLiteral _description_) {
        this.representationImpl.getDescription().add(_description_);
        return this;
    }

    /**
     * This function allows setting a value for _shapesGraph
     * 
     * @param _shapesGraph_ desired value to be set
     * @return Builder object with new value for _shapesGraph
     */
    public RepresentationBuilder _shapesGraph_(URI _shapesGraph_) {
        this.representationImpl.setShapesGraph(_shapesGraph_);
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
    public Representation build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(representationImpl);
        return representationImpl;
    }
}
