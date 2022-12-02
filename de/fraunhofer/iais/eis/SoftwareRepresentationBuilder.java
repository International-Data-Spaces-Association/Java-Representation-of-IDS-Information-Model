package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class SoftwareRepresentationBuilder implements Builder<SoftwareRepresentation> {

    private SoftwareRepresentationImpl softwareRepresentationImpl;

    public SoftwareRepresentationBuilder() {
        softwareRepresentationImpl = new SoftwareRepresentationImpl();
    }

    public SoftwareRepresentationBuilder(URI id) {
        this();
        softwareRepresentationImpl.id = id;
    }

    /**
     * This function allows setting a value for _instance
     * 
     * @param _instance_ desired value to be set
     * @return Builder object with new value for _instance
     */
    public SoftwareRepresentationBuilder _instance_(List<RepresentationInstance> _instance_) {
        this.softwareRepresentationImpl.setInstance(_instance_);
        return this;
    }

    /**
     * This function allows adding a value to the List _instance
     * 
     * @param _instance_ desired value to be added
     * @return Builder object with new value for _instance
     */
    public SoftwareRepresentationBuilder _instance_(RepresentationInstance _instance_) {
        this.softwareRepresentationImpl.getInstance().add(_instance_);
        return this;
    }

    /**
     * This function allows setting a value for _mediaType
     * 
     * @param _mediaType_ desired value to be set
     * @return Builder object with new value for _mediaType
     */
    public SoftwareRepresentationBuilder _mediaType_(MediaType _mediaType_) {
        this.softwareRepresentationImpl.setMediaType(_mediaType_);
        return this;
    }

    /**
     * This function allows setting a value for _representationStandard
     * 
     * @param _representationStandard_ desired value to be set
     * @return Builder object with new value for _representationStandard
     */
    public SoftwareRepresentationBuilder _representationStandard_(URI _representationStandard_) {
        this.softwareRepresentationImpl.setRepresentationStandard(_representationStandard_);
        return this;
    }

    /**
     * This function allows setting a value for _language
     * 
     * @param _language_ desired value to be set
     * @return Builder object with new value for _language
     */
    public SoftwareRepresentationBuilder _language_(Language _language_) {
        this.softwareRepresentationImpl.setLanguage(_language_);
        return this;
    }

    /**
     * This function allows setting a value for _created
     * 
     * @param _created_ desired value to be set
     * @return Builder object with new value for _created
     */
    public SoftwareRepresentationBuilder _created_(XMLGregorianCalendar _created_) {
        this.softwareRepresentationImpl.setCreated(_created_);
        return this;
    }

    /**
     * This function allows setting a value for _modified
     * 
     * @param _modified_ desired value to be set
     * @return Builder object with new value for _modified
     */
    public SoftwareRepresentationBuilder _modified_(XMLGregorianCalendar _modified_) {
        this.softwareRepresentationImpl.setModified(_modified_);
        return this;
    }

    /**
     * This function allows setting a value for _title
     * 
     * @param _title_ desired value to be set
     * @return Builder object with new value for _title
     */
    public SoftwareRepresentationBuilder _title_(List<TypedLiteral> _title_) {
        this.softwareRepresentationImpl.setTitle(_title_);
        return this;
    }

    /**
     * This function allows adding a value to the List _title
     * 
     * @param _title_ desired value to be added
     * @return Builder object with new value for _title
     */
    public SoftwareRepresentationBuilder _title_(TypedLiteral _title_) {
        this.softwareRepresentationImpl.getTitle().add(_title_);
        return this;
    }

    /**
     * This function allows setting a value for _description
     * 
     * @param _description_ desired value to be set
     * @return Builder object with new value for _description
     */
    public SoftwareRepresentationBuilder _description_(List<TypedLiteral> _description_) {
        this.softwareRepresentationImpl.setDescription(_description_);
        return this;
    }

    /**
     * This function allows adding a value to the List _description
     * 
     * @param _description_ desired value to be added
     * @return Builder object with new value for _description
     */
    public SoftwareRepresentationBuilder _description_(TypedLiteral _description_) {
        this.softwareRepresentationImpl.getDescription().add(_description_);
        return this;
    }

    /**
     * This function allows setting a value for _shapesGraph
     * 
     * @param _shapesGraph_ desired value to be set
     * @return Builder object with new value for _shapesGraph
     */
    public SoftwareRepresentationBuilder _shapesGraph_(URI _shapesGraph_) {
        this.softwareRepresentationImpl.setShapesGraph(_shapesGraph_);
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
    public SoftwareRepresentation build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(softwareRepresentationImpl);
        return softwareRepresentationImpl;
    }
}
