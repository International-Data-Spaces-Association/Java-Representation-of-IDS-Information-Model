package de.fraunhofer.iais.eis.mixins;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("ContentType")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface ContentTypeMixin {

}
