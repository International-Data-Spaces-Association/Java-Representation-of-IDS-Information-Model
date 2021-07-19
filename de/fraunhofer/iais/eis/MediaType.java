package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * General class of media types (formerly known as MIME types). ids:CustomMediaType is used only
 * when no ids:IANAMediaType available.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = CustomMediaType.class),
    @JsonSubTypes.Type(value = IANAMediaType.class)
})
public interface MediaType extends ModelClass {

    // standard methods

    @Beta
    public MediaType deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Suffix of a file name, typically separated by a period, indicating the nature and intended
     * processing of the file.
     *
     * More information under https://w3id.org/idsa/core/filenameExtension
     *
     * @return Returns the String for the property _filenameExtension.
     */
    @JsonProperty("ids:filenameExtension")
    String getFilenameExtension();

    /**
     * Suffix of a file name, typically separated by a period, indicating the nature and intended
     * processing of the file.
     *
     * More information under https://w3id.org/idsa/core/filenameExtension
     *
     * @param _filenameExtension_ desired value for the property _filenameExtension.
     */
    void setFilenameExtension(String _filenameExtension_);

}
