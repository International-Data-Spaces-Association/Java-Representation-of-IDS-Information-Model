package de.fraunhofer.iais.eis.mixins;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Artifact")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface ArtifactMixin {
    @JsonProperty("ids:byteSize")
    public BigInteger getByteSize();

    @JsonProperty("ids:byteSize")
    public void setByteSize(BigInteger _byteSize_);

    @JsonProperty("ids:fileName")
    public String getFileName();

    @JsonProperty("ids:fileName")
    public void setFileName(String _fileName_);

    @JsonProperty("ids:creationDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    public XMLGregorianCalendar getCreationDate();

    @JsonProperty("ids:creationDate")
    public void setCreationDate(XMLGregorianCalendar _creationDate_);

    @JsonProperty("ids:checkSum")
    public String getCheckSum();

    @JsonProperty("ids:checkSum")
    public void setCheckSum(String _checkSum_);

    @JsonProperty("ids:duration")
    public java.math.BigDecimal getDuration();

    @JsonProperty("ids:duration")
    public void setDuration(java.math.BigDecimal _duration_);
}
