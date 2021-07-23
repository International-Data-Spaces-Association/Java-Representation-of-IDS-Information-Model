package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class DataRepresentationBuilder implements Builder<DataRepresentation> {

    private DataRepresentationImpl dataRepresentationImpl;

    public DataRepresentationBuilder() {
        dataRepresentationImpl = new DataRepresentationImpl();
    }

    public DataRepresentationBuilder(URI id) {
        this();
        dataRepresentationImpl.id = id;
    }

    /**
     * This function allows setting a value for _dataType
     * 
     * @param _dataType_ desired value to be set
     * @return Builder object with new value for _dataType
     */
    public DataRepresentationBuilder _dataType_(URI _dataType_) {
        this.dataRepresentationImpl.setDataType(_dataType_);
        return this;
    }

    /**
     * This function allows setting a value for _dataTypeSchema
     * 
     * @param _dataTypeSchema_ desired value to be set
     * @return Builder object with new value for _dataTypeSchema
     */
    public DataRepresentationBuilder _dataTypeSchema_(Resource _dataTypeSchema_) {
        this.dataRepresentationImpl.setDataTypeSchema(_dataTypeSchema_);
        return this;
    }

    /**
     * This function allows setting a value for _instance
     * 
     * @param _instance_ desired value to be set
     * @return Builder object with new value for _instance
     */
    public DataRepresentationBuilder _instance_(List<RepresentationInstance> _instance_) {
        this.dataRepresentationImpl.setInstance(_instance_);
        return this;
    }

    /**
     * This function allows adding a value to the List _instance
     * 
     * @param _instance_ desired value to be added
     * @return Builder object with new value for _instance
     */
    public DataRepresentationBuilder _instance_(RepresentationInstance _instance_) {
        this.dataRepresentationImpl.getInstance().add(_instance_);
        return this;
    }

    /**
     * This function allows setting a value for _mediaType
     * 
     * @param _mediaType_ desired value to be set
     * @return Builder object with new value for _mediaType
     */
    public DataRepresentationBuilder _mediaType_(MediaType _mediaType_) {
        this.dataRepresentationImpl.setMediaType(_mediaType_);
        return this;
    }

    /**
     * This function allows setting a value for _representationStandard
     * 
     * @param _representationStandard_ desired value to be set
     * @return Builder object with new value for _representationStandard
     */
    public DataRepresentationBuilder _representationStandard_(URI _representationStandard_) {
        this.dataRepresentationImpl.setRepresentationStandard(_representationStandard_);
        return this;
    }

    /**
     * This function allows setting a value for _language
     * 
     * @param _language_ desired value to be set
     * @return Builder object with new value for _language
     */
    public DataRepresentationBuilder _language_(Language _language_) {
        this.dataRepresentationImpl.setLanguage(_language_);
        return this;
    }

    /**
     * This function allows setting a value for _created
     * 
     * @param _created_ desired value to be set
     * @return Builder object with new value for _created
     */
    public DataRepresentationBuilder _created_(XMLGregorianCalendar _created_) {
        this.dataRepresentationImpl.setCreated(_created_);
        return this;
    }

    /**
     * This function allows setting a value for _modified
     * 
     * @param _modified_ desired value to be set
     * @return Builder object with new value for _modified
     */
    public DataRepresentationBuilder _modified_(XMLGregorianCalendar _modified_) {
        this.dataRepresentationImpl.setModified(_modified_);
        return this;
    }

    /**
     * This function allows setting a value for _title
     * 
     * @param _title_ desired value to be set
     * @return Builder object with new value for _title
     */
    public DataRepresentationBuilder _title_(List<TypedLiteral> _title_) {
        this.dataRepresentationImpl.setTitle(_title_);
        return this;
    }

    /**
     * This function allows adding a value to the List _title
     * 
     * @param _title_ desired value to be added
     * @return Builder object with new value for _title
     */
    public DataRepresentationBuilder _title_(TypedLiteral _title_) {
        this.dataRepresentationImpl.getTitle().add(_title_);
        return this;
    }

    /**
     * This function allows setting a value for _description
     * 
     * @param _description_ desired value to be set
     * @return Builder object with new value for _description
     */
    public DataRepresentationBuilder _description_(List<TypedLiteral> _description_) {
        this.dataRepresentationImpl.setDescription(_description_);
        return this;
    }

    /**
     * This function allows adding a value to the List _description
     * 
     * @param _description_ desired value to be added
     * @return Builder object with new value for _description
     */
    public DataRepresentationBuilder _description_(TypedLiteral _description_) {
        this.dataRepresentationImpl.getDescription().add(_description_);
        return this;
    }

    /**
     * This function allows setting a value for _shapesGraph
     * 
     * @param _shapesGraph_ desired value to be set
     * @return Builder object with new value for _shapesGraph
     */
    public DataRepresentationBuilder _shapesGraph_(URI _shapesGraph_) {
        this.dataRepresentationImpl.setShapesGraph(_shapesGraph_);
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
    public DataRepresentation build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(dataRepresentationImpl);
        return dataRepresentationImpl;
    }
}
