package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

/**
 * Default implementation of package de.fraunhofer.iais.eis.BaseConnector
 * 
 * Implementation of the Connector specification providing only restricted security capabilities.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:BaseConnector")
public class BaseConnectorImpl implements BaseConnector {

    @JsonProperty("@id")
    @JsonAlias({"@id", "id"})
    @NotNull
    protected URI id;

    // List of all labels of this class
    @JsonIgnore
    protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Base Connector", "en"));

    // List of all comments of this class
    @JsonIgnore
    protected List<TypedLiteral> comment = Arrays
        .asList(new TypedLiteral("Implementation of the Connector specification providing only restricted security capabilities.", "en"));

    // all classes have a generic property array
    @JsonIgnore
    protected Map<String, Object> properties;

    // instance fields as derived from the IDS Information Model ontology

    @JsonAlias({"ids:authInfo", "authInfo"})
    protected AuthInfo _authInfo;

    @JsonAlias({"ids:componentCertification", "componentCertification"})
    protected ComponentCertification _componentCertification;

    @NotNull
    @JsonAlias({"ids:curator", "curator"})
    protected URI _curator;

    @JsonAlias({"ids:description", "description"})
    protected List<TypedLiteral> _description = new ArrayList<>();

    @JsonAlias({"ids:extendedGuarantee", "extendedGuarantee"})
    protected List<SecurityGuarantee> _extendedGuarantee = new ArrayList<>();

    @JsonAlias({"ids:hasAgent", "hasAgent"})
    protected List<URI> _hasAgent = new ArrayList<>();

    @NotNull
    @JsonAlias({"ids:hasDefaultEndpoint", "hasDefaultEndpoint"})
    protected ConnectorEndpoint _hasDefaultEndpoint;

    @JsonAlias({"ids:hasEndpoint", "hasEndpoint"})
    protected List<ConnectorEndpoint> _hasEndpoint = new ArrayList<>();

    @NotEmpty
    @JsonAlias({"ids:inboundModelVersion", "inboundModelVersion"})
    protected List<String> _inboundModelVersion = new ArrayList<>();

    @NotNull
    @JsonAlias({"ids:maintainer", "maintainer"})
    protected URI _maintainer;

    @NotNull
    @JsonAlias({"ids:outboundModelVersion", "outboundModelVersion"})
    protected String _outboundModelVersion;

    @JsonAlias({"ids:physicalLocation", "physicalLocation"})
    protected Location _physicalLocation;

    @JsonAlias({"ids:publicKey", "publicKey"})
    protected PublicKey _publicKey;

    @JsonAlias({"ids:resourceCatalog", "resourceCatalog"})
    protected List<ResourceCatalog> _resourceCatalog = new ArrayList<>();

    @NotNull
    @JsonAlias({"ids:securityProfile", "securityProfile"})
    protected SecurityProfile _securityProfile;

    @JsonAlias({"ids:title", "title"})
    protected List<TypedLiteral> _title = new ArrayList<>();

    @JsonAlias({"ids:version", "version"})
    protected String _version;

    protected BaseConnectorImpl() {
        id = VocabUtil.getInstance().createRandomUrl("baseConnector");
    }

    @JsonProperty("@id")
    final public URI getId() {
        return id;
    }

    public String toRdf() {
        return VocabUtil.getInstance().toRdf(this);
    }

    @Override
    public String toString() {
        return this.toRdf();
    }

    public List<TypedLiteral> getLabel() {
        return this.label;
    }

    public List<TypedLiteral> getComment() {
        return this.comment;
    }

    // getter and setter for generic property map
    @JsonAnyGetter
    public Map<String, Object> getProperties() {
        if (this.properties == null)
            return null;
        Iterator<String> iter = this.properties.keySet().iterator();
        Map<String, Object> resultset = new HashMap<String, Object>();
        while (iter.hasNext()) {
            String key = iter.next();
            resultset.put(key, urifyObjects(this.properties.get(key)));
        }
        return resultset;
    }

    public Object urifyObjects(Object value) {
        if (value instanceof String && value.toString().startsWith("http")) {
            try {
                value = new URI(value.toString());
            } catch (Exception e) {
                /* do nothing */ }
        } else if (value instanceof ArrayList) {
            ArrayList<Object> result_array = new ArrayList<Object>();
            ((ArrayList) value).forEach(x -> result_array.add(urifyObjects(x)));
            return result_array;
        } else if (value instanceof Map) {
            Map<String, Object> result_map = new HashMap<String, Object>();
            ((Map) value).forEach((k, v) -> result_map.put(k.toString(), urifyObjects(v)));
            return result_map;
        }
        return value;
    }

    @JsonAnySetter
    public void setProperty(String property, Object value) {
        if (this.properties == null)
            this.properties = new HashMap<String, Object>();
        if (property.startsWith("@")) {
            return;
        } ;
        this.properties.put(property, value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this._hasDefaultEndpoint,
            this._hasEndpoint,
            this._authInfo,
            this._resourceCatalog,
            this._hasAgent,
            this._securityProfile,
            this._extendedGuarantee,
            this._maintainer,
            this._curator,
            this._physicalLocation,
            this._inboundModelVersion,
            this._outboundModelVersion,
            this._componentCertification,
            this._publicKey,
            this._version,
            this._title,
            this._description);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            BaseConnectorImpl other = (BaseConnectorImpl) obj;
            return Objects.equals(this._hasDefaultEndpoint, other._hasDefaultEndpoint) &&
                Objects.equals(this._hasEndpoint, other._hasEndpoint) &&
                Objects.equals(this._authInfo, other._authInfo) &&
                Objects.equals(this._resourceCatalog, other._resourceCatalog) &&
                Objects.equals(this._hasAgent, other._hasAgent) &&
                Objects.equals(this._securityProfile, other._securityProfile) &&
                Objects.equals(this._extendedGuarantee, other._extendedGuarantee) &&
                Objects.equals(this._maintainer, other._maintainer) &&
                Objects.equals(this._curator, other._curator) &&
                Objects.equals(this._physicalLocation, other._physicalLocation) &&
                Objects.equals(this._inboundModelVersion, other._inboundModelVersion) &&
                Objects.equals(this._outboundModelVersion, other._outboundModelVersion) &&
                Objects.equals(this._componentCertification, other._componentCertification) &&
                Objects.equals(this._publicKey, other._publicKey) &&
                Objects.equals(this._version, other._version) &&
                Objects.equals(this._title, other._title) &&
                Objects.equals(this._description, other._description);
        }
    }

    @Override
    public BaseConnector deepCopy() {
        BaseConnectorBuilder builder = new BaseConnectorBuilder();
        if (this._hasDefaultEndpoint != null) {
            builder._hasDefaultEndpoint_(this._hasDefaultEndpoint.deepCopy());
        }
        for (ConnectorEndpoint item : this._hasEndpoint) {
            if (item != null) {
                builder._hasEndpoint_(item.deepCopy());
            }
        }
        if (this._authInfo != null) {
            builder._authInfo_(this._authInfo.deepCopy());
        }
        for (ResourceCatalog item : this._resourceCatalog) {
            if (item != null) {
                builder._resourceCatalog_(item.deepCopy());
            }
        }
        for (URI item : this._hasAgent) {
            if (item != null) {
                builder._hasAgent_(URI.create(item.toString()));
            }
        }
        builder._securityProfile_(this._securityProfile);
        for (SecurityGuarantee item : this._extendedGuarantee) {
            builder._extendedGuarantee_(item);
        }
        if (this._maintainer != null) {
            builder._maintainer_(URI.create(this._maintainer.toString()));
        }
        if (this._curator != null) {
            builder._curator_(URI.create(this._curator.toString()));
        }
        if (this._physicalLocation != null) {
            builder._physicalLocation_(this._physicalLocation.deepCopy());
        }
        for (String item : this._inboundModelVersion) {
            builder._inboundModelVersion_(item);
        }
        builder._outboundModelVersion_(this._outboundModelVersion);
        if (this._componentCertification != null) {
            builder._componentCertification_(this._componentCertification.deepCopy());
        }
        if (this._publicKey != null) {
            builder._publicKey_(this._publicKey.deepCopy());
        }
        builder._version_(this._version);
        for (TypedLiteral item : this._title) {
            if (item != null && item.getLanguage() != null) {
                builder._title_(new TypedLiteral(item.getValue(), item.getLanguage()));
            } else {
                builder._title_(new TypedLiteral(item.getValue(), URI.create(item.getType())));
            }
        }
        for (TypedLiteral item : this._description) {
            if (item != null && item.getLanguage() != null) {
                builder._description_(new TypedLiteral(item.getValue(), item.getLanguage()));
            } else {
                builder._description_(new TypedLiteral(item.getValue(), URI.create(item.getType())));
            }
        }
        return builder.build();
    }

    // accessor method implementations as derived from the IDS Information Model ontology

    @Override
    @NotNull
    public ConnectorEndpoint getHasDefaultEndpoint() {
        return _hasDefaultEndpoint;
    }

    @Override
    public void setHasDefaultEndpoint(ConnectorEndpoint _hasDefaultEndpoint_) {
        this._hasDefaultEndpoint = _hasDefaultEndpoint_;
    }

    @Override
    public List<ConnectorEndpoint> getHasEndpoint() {
        return _hasEndpoint;
    }

    @Override
    public void setHasEndpoint(List<ConnectorEndpoint> _hasEndpoint_) {
        this._hasEndpoint = _hasEndpoint_;
    }

    @Override
    public AuthInfo getAuthInfo() {
        return _authInfo;
    }

    @Override
    public void setAuthInfo(AuthInfo _authInfo_) {
        this._authInfo = _authInfo_;
    }

    @Override
    public List<ResourceCatalog> getResourceCatalog() {
        return _resourceCatalog;
    }

    @Override
    public void setResourceCatalog(List<ResourceCatalog> _resourceCatalog_) {
        this._resourceCatalog = _resourceCatalog_;
    }

    @Override
    public List<URI> getHasAgent() {
        return _hasAgent;
    }

    @Override
    public void setHasAgent(List<URI> _hasAgent_) {
        this._hasAgent = _hasAgent_;
    }

    @Override
    @NotNull
    public SecurityProfile getSecurityProfile() {
        return _securityProfile;
    }

    @Override
    public void setSecurityProfile(SecurityProfile _securityProfile_) {
        this._securityProfile = _securityProfile_;
    }

    @Override
    public List<SecurityGuarantee> getExtendedGuarantee() {
        return _extendedGuarantee;
    }

    @Override
    public void setExtendedGuarantee(List<SecurityGuarantee> _extendedGuarantee_) {
        this._extendedGuarantee = _extendedGuarantee_;
    }

    @Override
    @NotNull
    public URI getMaintainer() {
        return _maintainer;
    }

    @Override
    public void setMaintainer(URI _maintainer_) {
        this._maintainer = _maintainer_;
    }

    @Override
    @NotNull
    public URI getCurator() {
        return _curator;
    }

    @Override
    public void setCurator(URI _curator_) {
        this._curator = _curator_;
    }

    @Override
    public Location getPhysicalLocation() {
        return _physicalLocation;
    }

    @Override
    public void setPhysicalLocation(Location _physicalLocation_) {
        this._physicalLocation = _physicalLocation_;
    }

    @Override
    @NotEmpty
    public List<String> getInboundModelVersion() {
        return _inboundModelVersion;
    }

    @Override
    public void setInboundModelVersion(List<String> _inboundModelVersion_) {
        this._inboundModelVersion = _inboundModelVersion_;
    }

    @Override
    @NotNull
    public String getOutboundModelVersion() {
        return _outboundModelVersion;
    }

    @Override
    public void setOutboundModelVersion(String _outboundModelVersion_) {
        this._outboundModelVersion = _outboundModelVersion_;
    }

    @Override
    public ComponentCertification getComponentCertification() {
        return _componentCertification;
    }

    @Override
    public void setComponentCertification(ComponentCertification _componentCertification_) {
        this._componentCertification = _componentCertification_;
    }

    @Override
    public PublicKey getPublicKey() {
        return _publicKey;
    }

    @Override
    public void setPublicKey(PublicKey _publicKey_) {
        this._publicKey = _publicKey_;
    }

    @Override
    public String getVersion() {
        return _version;
    }

    @Override
    public void setVersion(String _version_) {
        this._version = _version_;
    }

    @Override
    public List<TypedLiteral> getTitle() {
        return _title;
    }

    @Override
    public void setTitle(List<TypedLiteral> _title_) {
        this._title = _title_;
    }

    @Override
    public List<TypedLiteral> getDescription() {
        return _description;
    }

    @Override
    public void setDescription(List<TypedLiteral> _description_) {
        this._description = _description_;
    }
}
