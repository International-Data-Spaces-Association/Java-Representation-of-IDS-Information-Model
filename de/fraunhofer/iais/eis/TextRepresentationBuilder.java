package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class TextRepresentationBuilder implements Builder<TextRepresentation> {

    private TextRepresentationImpl textRepresentationImpl;

    public TextRepresentationBuilder() {
        textRepresentationImpl = new TextRepresentationImpl();
    }

    public TextRepresentationBuilder(URI id) {
        this();
        textRepresentationImpl.id = id;
    }

    /**
     * This function allows setting a value for _instance
     * 
     * @param _instance_ desired value to be set
     * @return Builder object with new value for _instance
     */
    public TextRepresentationBuilder _instance_(List<RepresentationInstance> _instance_) {
        this.textRepresentationImpl.setInstance(_instance_);
        return this;
    }

    /**
     * This function allows adding a value to the List _instance
     * 
     * @param _instance_ desired value to be added
     * @return Builder object with new value for _instance
     */
    public TextRepresentationBuilder _instance_(RepresentationInstance _instance_) {
        this.textRepresentationImpl.getInstance().add(_instance_);
        return this;
    }

    /**
     * This function allows setting a value for _mediaType
     * 
     * @param _mediaType_ desired value to be set
     * @return Builder object with new value for _mediaType
     */
    public TextRepresentationBuilder _mediaType_(MediaType _mediaType_) {
        this.textRepresentationImpl.setMediaType(_mediaType_);
        return this;
    }

    /**
     * This function allows setting a value for _representationStandard
     * 
     * @param _representationStandard_ desired value to be set
     * @return Builder object with new value for _representationStandard
     */
    public TextRepresentationBuilder _representationStandard_(URI _representationStandard_) {
        this.textRepresentationImpl.setRepresentationStandard(_representationStandard_);
        return this;
    }

    /**
     * This function allows setting a value for _language
     * 
     * @param _language_ desired value to be set
     * @return Builder object with new value for _language
     */
    public TextRepresentationBuilder _language_(Language _language_) {
        this.textRepresentationImpl.setLanguage(_language_);
        return this;
    }

    /**
     * This function allows setting a value for _created
     * 
     * @param _created_ desired value to be set
     * @return Builder object with new value for _created
     */
    public TextRepresentationBuilder _created_(XMLGregorianCalendar _created_) {
        this.textRepresentationImpl.setCreated(_created_);
        return this;
    }

    /**
     * This function allows setting a value for _modified
     * 
     * @param _modified_ desired value to be set
     * @return Builder object with new value for _modified
     */
    public TextRepresentationBuilder _modified_(XMLGregorianCalendar _modified_) {
        this.textRepresentationImpl.setModified(_modified_);
        return this;
    }

    /**
     * This function allows setting a value for _title
     * 
     * @param _title_ desired value to be set
     * @return Builder object with new value for _title
     */
    public TextRepresentationBuilder _title_(List<TypedLiteral> _title_) {
        this.textRepresentationImpl.setTitle(_title_);
        return this;
    }

    /**
     * This function allows adding a value to the List _title
     * 
     * @param _title_ desired value to be added
     * @return Builder object with new value for _title
     */
    public TextRepresentationBuilder _title_(TypedLiteral _title_) {
        this.textRepresentationImpl.getTitle().add(_title_);
        return this;
    }

    /**
     * This function allows setting a value for _description
     * 
     * @param _description_ desired value to be set
     * @return Builder object with new value for _description
     */
    public TextRepresentationBuilder _description_(List<TypedLiteral> _description_) {
        this.textRepresentationImpl.setDescription(_description_);
        return this;
    }

    /**
     * This function allows adding a value to the List _description
     * 
     * @param _description_ desired value to be added
     * @return Builder object with new value for _description
     */
    public TextRepresentationBuilder _description_(TypedLiteral _description_) {
        this.textRepresentationImpl.getDescription().add(_description_);
        return this;
    }

    /**
     * This function allows setting a value for _shapesGraph
     * 
     * @param _shapesGraph_ desired value to be set
     * @return Builder object with new value for _shapesGraph
     */
    public TextRepresentationBuilder _shapesGraph_(URI _shapesGraph_) {
        this.textRepresentationImpl.setShapesGraph(_shapesGraph_);
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
    public TextRepresentation build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(textRepresentationImpl);
        return textRepresentationImpl;
    }
}
