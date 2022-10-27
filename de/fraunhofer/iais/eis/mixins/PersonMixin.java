package de.fraunhofer.iais.eis.mixins;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Person")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface PersonMixin {
    @JsonProperty("ids:familyName")
    public String getFamilyName();

    @JsonProperty("ids:familyName")
    public void setFamilyName(String _familyName_);

    @JsonProperty("ids:givenName")
    public String getGivenName();

    @JsonProperty("ids:givenName")
    public void setGivenName(String _givenName_);

    @JsonProperty("ids:phoneNumber")
    public List<String> getPhoneNumber();

    @JsonProperty("ids:phoneNumber")
    public void setPhoneNumber(List<String> _phoneNumber_);

    @JsonProperty("ids:emailAddress")
    public List<String> getEmailAddress();

    @JsonProperty("ids:emailAddress")
    public void setEmailAddress(List<String> _emailAddress_);

    @JsonProperty("ids:homepage")
    public String getHomepage();

    @JsonProperty("ids:homepage")
    public void setHomepage(String _homepage_);
}
