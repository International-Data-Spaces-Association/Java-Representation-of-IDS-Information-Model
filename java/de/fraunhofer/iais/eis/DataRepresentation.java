package de.fraunhofer.iais.eis;

import java.net.URI;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Physical representation of (structured) data.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = DataRepresentationImpl.class)
})
public interface DataRepresentation extends Representation {

    // standard methods

    @Beta
    public DataRepresentation deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Indicates the data type of the Representation.
     *
     * More information under https://w3id.org/idsa/core/dataType
     *
     * @return Returns the URI for the property _dataType.
     */
    @JsonProperty("ids:dataType")
    URI getDataType();

    /**
     * Indicates the data type of the Representation.
     *
     * More information under https://w3id.org/idsa/core/dataType
     *
     * @param _dataType_ desired value for the property _dataType.
     */
    void setDataType(URI _dataType_);

    /**
     * Indicates the data type schema of the Representation.
     *
     * More information under https://w3id.org/idsa/core/dataTypeSchema
     *
     * @return Returns the Resource for the property _dataTypeSchema.
     */
    @JsonProperty("ids:dataTypeSchema")
    Resource getDataTypeSchema();

    /**
     * Indicates the data type schema of the Representation.
     *
     * More information under https://w3id.org/idsa/core/dataTypeSchema
     *
     * @param _dataTypeSchema_ desired value for the property _dataTypeSchema.
     */
    void setDataTypeSchema(Resource _dataTypeSchema_);

}
