package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

/**
 * Default implementation of package de.fraunhofer.iais.eis.SwapOffer
 * 
 * The ContractOffer class representing the 'Data Swap' policy class.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:SwapOffer")
public class SwapOfferImpl implements SwapOffer {

    @JsonProperty("@id")
    @JsonAlias({"@id", "id"})
    @NotNull
    protected URI id;

    // List of all labels of this class
    @JsonIgnore
    protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Sales Offer", "en"));

    // List of all comments of this class
    @JsonIgnore
    protected List<TypedLiteral> comment =
        Arrays.asList(new TypedLiteral("The ContractOffer class representing the 'Data Swap' policy class.", "en"));

    // all classes have a generic property array
    @JsonIgnore
    protected Map<String, Object> properties;

    // instance fields as derived from the IDS Information Model ontology

    @JsonAlias({"ids:consumer", "consumer"})
    protected URI _consumer;

    @JsonAlias({"ids:contractAnnex", "contractAnnex"})
    protected Resource _contractAnnex;

    @JsonAlias({"ids:contractDate", "contractDate"})
    protected XMLGregorianCalendar _contractDate;

    @JsonAlias({"ids:contractDocument", "contractDocument"})
    protected TextResource _contractDocument;

    @JsonAlias({"ids:contractEnd", "contractEnd"})
    protected XMLGregorianCalendar _contractEnd;

    @JsonAlias({"ids:contractStart", "contractStart"})
    protected XMLGregorianCalendar _contractStart;

    @JsonAlias({"ids:obligation", "obligation"})
    protected List<Duty> _obligation = new ArrayList<>();

    @JsonAlias({"ids:permission", "permission"})
    protected List<Permission> _permission = new ArrayList<>();

    @JsonAlias({"ids:prohibition", "prohibition"})
    protected List<Prohibition> _prohibition = new ArrayList<>();

    @JsonAlias({"ids:provider", "provider"})
    protected URI _provider;

    protected SwapOfferImpl() {
        id = VocabUtil.getInstance().createRandomUrl("swapOffer");
    }

    @JsonProperty("@id")
    final public URI getId() {
        return id;
    }

    public String toRdf() {
        return VocabUtil.getInstance().toRdf(this);
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
        return Objects.hash(this._contractStart,
            this._contractEnd,
            this._contractDate,
            this._provider,
            this._consumer,
            this._contractDocument,
            this._contractAnnex,
            this._permission,
            this._prohibition,
            this._obligation);
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
            SwapOfferImpl other = (SwapOfferImpl) obj;
            return Objects.equals(this._contractStart, other._contractStart) &&
                Objects.equals(this._contractEnd, other._contractEnd) &&
                Objects.equals(this._contractDate, other._contractDate) &&
                Objects.equals(this._provider, other._provider) &&
                Objects.equals(this._consumer, other._consumer) &&
                Objects.equals(this._contractDocument, other._contractDocument) &&
                Objects.equals(this._contractAnnex, other._contractAnnex) &&
                Objects.equals(this._permission, other._permission) &&
                Objects.equals(this._prohibition, other._prohibition) &&
                Objects.equals(this._obligation, other._obligation);
        }
    }

    // accessor method implementations as derived from the IDS Information Model ontology

    @Override
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    public XMLGregorianCalendar getContractStart() {
        return _contractStart;
    }

    @Override
    public void setContractStart(XMLGregorianCalendar _contractStart_) {
        this._contractStart = _contractStart_;
    }

    @Override
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    public XMLGregorianCalendar getContractEnd() {
        return _contractEnd;
    }

    @Override
    public void setContractEnd(XMLGregorianCalendar _contractEnd_) {
        this._contractEnd = _contractEnd_;
    }

    @Override
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    public XMLGregorianCalendar getContractDate() {
        return _contractDate;
    }

    @Override
    public void setContractDate(XMLGregorianCalendar _contractDate_) {
        this._contractDate = _contractDate_;
    }

    @Override
    public URI getProvider() {
        return _provider;
    }

    @Override
    public void setProvider(URI _provider_) {
        this._provider = _provider_;
    }

    @Override
    public URI getConsumer() {
        return _consumer;
    }

    @Override
    public void setConsumer(URI _consumer_) {
        this._consumer = _consumer_;
    }

    @Override
    public TextResource getContractDocument() {
        return _contractDocument;
    }

    @Override
    public void setContractDocument(TextResource _contractDocument_) {
        this._contractDocument = _contractDocument_;
    }

    @Override
    public Resource getContractAnnex() {
        return _contractAnnex;
    }

    @Override
    public void setContractAnnex(Resource _contractAnnex_) {
        this._contractAnnex = _contractAnnex_;
    }

    @Override
    public List<Permission> getPermission() {
        return _permission;
    }

    @Override
    public void setPermission(List<Permission> _permission_) {
        this._permission = _permission_;
    }

    @Override
    public List<Prohibition> getProhibition() {
        return _prohibition;
    }

    @Override
    public void setProhibition(List<Prohibition> _prohibition_) {
        this._prohibition = _prohibition_;
    }

    @Override
    public List<Duty> getObligation() {
        return _obligation;
    }

    @Override
    public void setObligation(List<Duty> _obligation_) {
        this._obligation = _obligation_;
    }

}
