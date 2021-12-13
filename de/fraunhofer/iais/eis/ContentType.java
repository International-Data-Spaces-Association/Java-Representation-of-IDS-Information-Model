package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Enumerated types of content expanding upon the Digital Content hierarchy. Instances of Content
 * Type are used to more precisely specify the type, genre or interpretation of a Digital Content.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ContentTypeImpl.class)
})
public interface ContentType extends ModelClass {

    // standard methods

    @Beta
    public ContentType deepCopy();

}
