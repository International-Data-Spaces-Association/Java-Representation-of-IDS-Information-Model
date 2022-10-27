package de.fraunhofer.iais.eis.mixins;

import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Instant")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface InstantMixin {
    @JsonProperty("ids:dateTime")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    public XMLGregorianCalendar getDateTime();

    @JsonProperty("ids:dateTime")
    public void setDateTime(XMLGregorianCalendar _dateTime_);
}
