package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** 
* "App Resource"@en
* "Resource comprising IDS data apps."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:AppResource")
public class AppResourceImpl implements AppResource {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("App Resource", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Resource comprising IDS data apps.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDS Information Model ontology

	/**
	* "Accrual periodicity"@en
	* "The regular period with which items are added to a collection."@en
	*/
	@JsonAlias({"ids:accrualPeriodicity", "accrualPeriodicity"})
	protected Frequency _accrualPeriodicity;


	/**
	* "content part"@en
	* "Reference to a Digital Content (physically or logically) included, definition of part-whole hierarchies."@en
	*/
	@JsonAlias({"ids:contentPart", "contentPart"})
	protected List<DigitalContent> _contentPart;


	/**
	* "content standard"@en
	* "IRI containing document, which defines the standard for the given Digital Content. The content is assumed to conform to that Standard."@en
	*/
	@JsonAlias({"ids:contentStandard", "contentStandard"})
	protected URI _contentStandard;


	/**
	* "content type"@en
	* "Detailed type, genre or interpretation of the Digital Content."@en
	*/
	@JsonAlias({"ids:contentType", "contentType"})
	protected ContentType _contentType;


	/**
	* "contract offer"@en
	* "Reference to a Contract Offer defining the authorized use of the Resource."@en
	*/
	@JsonAlias({"ids:contractOffer", "contractOffer"})
	protected List<ContractOffer> _contractOffer;


	/**
	* "created"@en
	* "The date of the creation of the Digital Content. In contrast to the ids:temporalCoverage, creation dates of ids:Representation, ids:Artifacts or any other form of meta-data, this property describes the creation date of referenced Digital Content itself."@en
	*/
	@JsonAlias({"ids:created", "created"})
	protected XMLGregorianCalendar _created;


	/**
	* "Custom License"@en
	* "URL reference to a custom license regulating the general usage of the Resource."@en
	*/
	@JsonAlias({"ids:customLicense", "customLicense"})
	protected URI _customLicense;


	/**
	* "Default representation"@en
	* "Default representation of the content."@en
	*/
	@JsonAlias({"ids:defaultRepresentation", "defaultRepresentation"})
	protected List<Representation> _defaultRepresentation;


	/**
	* "description"@en
	* "Explanation of the resource in a natural language text."@en
	*/
	@JsonAlias({"ids:description", "description"})
	protected List<TypedLiteral> _description;


	/**
	* "keyword"@en
	* "Controlled keywords that describe the nature, purpose, or use of the content."@en
	*/
	@JsonAlias({"ids:keyword", "keyword"})
	protected List<TypedLiteral> _keyword;


	/**
	* "language"@en
	* "Natural language(s) used within the content."@en
	*/
	@JsonAlias({"ids:language", "language"})
	protected List<Language> _language;


	/**
	* "modified"@en
	* "The date/time this Digital Content has been changed the last time. Only one \'modified\' attribute is usually needed."@en
	*/
	@JsonAlias({"ids:modified", "modified"})
	protected XMLGregorianCalendar _modified;


	/**
	* "publisher"@en
	* "The publisher of the resource (which may differ from the sovereign)."@en
	*/
	@JsonAlias({"ids:publisher", "publisher"})
	protected URI _publisher;


	/**
	* "representation"@en
	* "Representation of the content."@en
	*/
	@JsonAlias({"ids:representation", "representation"})
	protected List<Representation> _representation;


	/**
	* "resource endpoint"@en
	* "Reference to the Endpoints that serve the resource\'s content or let you exchange messages with an IDS Connector."@en
	*/
	@JsonAlias({"ids:resourceEndpoint", "resourceEndpoint"})
	protected List<ConnectorEndpoint> _resourceEndpoint;


	/**
	* "resource part"@en
	* "Reference to a Resource (physically or logically) included, definition of part-whole hierarchies."@en
	*/
	@JsonAlias({"ids:resourcePart", "resourcePart"})
	protected List<Resource> _resourcePart;


	/**
	* "sample"@en
	* "Sample Resource instance."@en
	*/
	@JsonAlias({"ids:sample", "sample"})
	protected List<Resource> _sample;


	/**
	* "shapeGraph"@en
	* "Reference to SHACL shape graph, which describes domain-specific knowledge."@en
	*/
	@JsonAlias({"ids:shapesGraph", "shapesGraph"})
	protected URI _shapesGraph;


	/**
	* "sovereign"@en
	* "The \'owner\', i.e. sovereign of the data."@en
	*/
	@JsonAlias({"ids:sovereign", "sovereign"})
	protected URI _sovereign;


	/**
	* "spatial coverage"@en
	* "Named spatial entity covered by the Resource."@en
	*/
	@JsonAlias({"ids:spatialCoverage", "spatialCoverage"})
	protected List<Location> _spatialCoverage;


	/**
	* "Standard License"@en
	* "\n    Reference to a well-known License regulating the general usage of the Resource.\n    Check wikidata license documentation for an extensive list of licenses.\n    License IRI should refer to the direct of link for a given standard license,\n    e.g., MIT license (https://www.wikidata.org/wiki/Q334661). The label of the resolved wikidata license IRI can be used to\n    present the license in human-readable form.\n    "@en
	*/
	@JsonAlias({"ids:standardLicense", "standardLicense"})
	protected URI _standardLicense;


	/**
	* "temporal coverage"@en
	* "Temporal period or instance covered by the content."@en
	*/
	@JsonAlias({"ids:temporalCoverage", "temporalCoverage"})
	protected List<TemporalEntity> _temporalCoverage;


	/**
	* "temporal resolution"@en
	* "Minimum time between collected data points in a time series within this content."@en
	*/
	@JsonAlias({"ids:temporalResolution", "temporalResolution"})
	protected Frequency _temporalResolution;


	/**
	* "theme"@en
	* "Abstract or concrete concept related to or referred by the content."@en
	*/
	@JsonAlias({"ids:theme", "theme"})
	protected List<URI> _theme;


	/**
	* "title"@en
	* "(Localized) name of the entity."@en
	*/
	@JsonAlias({"ids:title", "title"})
	protected List<TypedLiteral> _title;


	/**
	* "variant"@en
	* "(Equivalent) variant of given Resource, e.g., a translation."@en
	*/
	@JsonAlias({"ids:variant", "variant"})
	protected Resource _variant;


	/**
	* "version"@en
	* "Version identifier of the Managed Entity"@en
	*/
	@JsonAlias({"ids:version", "version"})
	protected String _version;


	// no manual construction
	protected AppResourceImpl() {
		id = VocabUtil.getInstance().createRandomUrl("appResource");
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
	public Map<String,Object> getProperties() {
		if (this.properties == null) return null;
		Iterator<String> iter = this.properties.keySet().iterator();
		Map<String,Object> resultset = new HashMap<String, Object>();
		while (iter.hasNext()) {
			String key = iter.next();
			resultset.put(key,urifyObjects(this.properties.get(key)));
		}
		return resultset ;
	}

	public Object urifyObjects(Object value) {
		if (value instanceof String && value.toString().startsWith("http")) {
			try {
				value = new URI(value.toString());
			} catch (Exception e) { /* do nothing */ }
		} else if (value instanceof ArrayList) {
			ArrayList<Object> result_array = new ArrayList<Object>();
			((ArrayList) value).forEach(x -> result_array.add(urifyObjects(x)));
			return result_array;
		} else if (value instanceof Map) {
			Map<String, Object> result_map = new HashMap<String, Object>();
			((Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	@JsonAnySetter
	public void setProperty(String property, Object value) {
		if (this.properties == null) this.properties = new HashMap<String,Object>();
		if (property.startsWith("@")) {return ;};
		this.properties.put(property, value) ;
	}
	@Override
	public int hashCode() {
		return Objects.hash(new Object[]{this._standardLicense,
			this._customLicense,
			this._resourcePart,
			this._resourceEndpoint,
			this._contractOffer,
			this._publisher,
			this._sovereign,
			this._sample,
			this._variant,
			this._contentType,
			this._contentPart,
			this._representation,
			this._defaultRepresentation,
			this._theme,
			this._keyword,
			this._temporalCoverage,
			this._temporalResolution,
			this._spatialCoverage,
			this._accrualPeriodicity,
			this._contentStandard,
			this._language,
			this._created,
			this._modified,
			this._title,
			this._description,
			this._shapesGraph,
			this._version});
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
			AppResourceImpl other = (AppResourceImpl) obj;
			return Objects.equals(this._standardLicense, other._standardLicense) &&
				Objects.equals(this._customLicense, other._customLicense) &&
				Objects.equals(this._resourcePart, other._resourcePart) &&
				Objects.equals(this._resourceEndpoint, other._resourceEndpoint) &&
				Objects.equals(this._contractOffer, other._contractOffer) &&
				Objects.equals(this._publisher, other._publisher) &&
				Objects.equals(this._sovereign, other._sovereign) &&
				Objects.equals(this._sample, other._sample) &&
				Objects.equals(this._variant, other._variant) &&
				Objects.equals(this._contentType, other._contentType) &&
				Objects.equals(this._contentPart, other._contentPart) &&
				Objects.equals(this._representation, other._representation) &&
				Objects.equals(this._defaultRepresentation, other._defaultRepresentation) &&
				Objects.equals(this._theme, other._theme) &&
				Objects.equals(this._keyword, other._keyword) &&
				Objects.equals(this._temporalCoverage, other._temporalCoverage) &&
				Objects.equals(this._temporalResolution, other._temporalResolution) &&
				Objects.equals(this._spatialCoverage, other._spatialCoverage) &&
				Objects.equals(this._accrualPeriodicity, other._accrualPeriodicity) &&
				Objects.equals(this._contentStandard, other._contentStandard) &&
				Objects.equals(this._language, other._language) &&
				Objects.equals(this._created, other._created) &&
				Objects.equals(this._modified, other._modified) &&
				Objects.equals(this._title, other._title) &&
				Objects.equals(this._description, other._description) &&
				Objects.equals(this._shapesGraph, other._shapesGraph) &&
				Objects.equals(this._version, other._version);
		}
	}


	// accessor method implementations as derived from the IDS Information Model ontology



	@JsonProperty("ids:standardLicense")
	final public URI getStandardLicense() {
		return _standardLicense;
	}
	
	final public void setStandardLicense (URI _standardLicense_) {
		this._standardLicense = _standardLicense_;
	}

	@JsonProperty("ids:customLicense")
	final public URI getCustomLicense() {
		return _customLicense;
	}
	
	final public void setCustomLicense (URI _customLicense_) {
		this._customLicense = _customLicense_;
	}

	@JsonProperty("ids:resourcePart")
	final public List<Resource> getResourcePart() {
		return _resourcePart;
	}
	
	final public void setResourcePart (List<Resource> _resourcePart_) {
		this._resourcePart = _resourcePart_;
	}

	@JsonProperty("ids:resourceEndpoint")
	final public List<ConnectorEndpoint> getResourceEndpoint() {
		return _resourceEndpoint;
	}
	
	final public void setResourceEndpoint (List<ConnectorEndpoint> _resourceEndpoint_) {
		this._resourceEndpoint = _resourceEndpoint_;
	}

	@JsonProperty("ids:contractOffer")
	final public List<ContractOffer> getContractOffer() {
		return _contractOffer;
	}
	
	final public void setContractOffer (List<ContractOffer> _contractOffer_) {
		this._contractOffer = _contractOffer_;
	}

	@JsonProperty("ids:publisher")
	final public URI getPublisher() {
		return _publisher;
	}
	
	final public void setPublisher (URI _publisher_) {
		this._publisher = _publisher_;
	}

	@JsonProperty("ids:sovereign")
	final public URI getSovereign() {
		return _sovereign;
	}
	
	final public void setSovereign (URI _sovereign_) {
		this._sovereign = _sovereign_;
	}

	@JsonProperty("ids:sample")
	final public List<Resource> getSample() {
		return _sample;
	}
	
	final public void setSample (List<Resource> _sample_) {
		this._sample = _sample_;
	}

	@JsonProperty("ids:variant")
	final public Resource getVariant() {
		return _variant;
	}
	
	final public void setVariant (Resource _variant_) {
		this._variant = _variant_;
	}



	@JsonProperty("ids:contentType")
	final public ContentType getContentType() {
		return _contentType;
	}
	
	final public void setContentType (ContentType _contentType_) {
		this._contentType = _contentType_;
	}

	@JsonProperty("ids:contentPart")
	final public List<DigitalContent> getContentPart() {
		return _contentPart;
	}
	
	final public void setContentPart (List<DigitalContent> _contentPart_) {
		this._contentPart = _contentPart_;
	}

	@JsonProperty("ids:representation")
	final public List<Representation> getRepresentation() {
		return _representation;
	}
	
	final public void setRepresentation (List<Representation> _representation_) {
		this._representation = _representation_;
	}

	@JsonProperty("ids:defaultRepresentation")
	final public List<Representation> getDefaultRepresentation() {
		return _defaultRepresentation;
	}
	
	final public void setDefaultRepresentation (List<Representation> _defaultRepresentation_) {
		this._defaultRepresentation = _defaultRepresentation_;
	}

	@JsonProperty("ids:theme")
	final public List<URI> getTheme() {
		return _theme;
	}
	
	final public void setTheme (List<URI> _theme_) {
		this._theme = _theme_;
	}

	@JsonProperty("ids:keyword")
	final public List<TypedLiteral> getKeyword() {
		return _keyword;
	}
	
	final public void setKeyword (List<TypedLiteral> _keyword_) {
		this._keyword = _keyword_;
	}

	@JsonProperty("ids:temporalCoverage")
	final public List<TemporalEntity> getTemporalCoverage() {
		return _temporalCoverage;
	}
	
	final public void setTemporalCoverage (List<TemporalEntity> _temporalCoverage_) {
		this._temporalCoverage = _temporalCoverage_;
	}

	@JsonProperty("ids:temporalResolution")
	final public Frequency getTemporalResolution() {
		return _temporalResolution;
	}
	
	final public void setTemporalResolution (Frequency _temporalResolution_) {
		this._temporalResolution = _temporalResolution_;
	}

	@JsonProperty("ids:spatialCoverage")
	final public List<Location> getSpatialCoverage() {
		return _spatialCoverage;
	}
	
	final public void setSpatialCoverage (List<Location> _spatialCoverage_) {
		this._spatialCoverage = _spatialCoverage_;
	}

	@JsonProperty("ids:accrualPeriodicity")
	final public Frequency getAccrualPeriodicity() {
		return _accrualPeriodicity;
	}
	
	final public void setAccrualPeriodicity (Frequency _accrualPeriodicity_) {
		this._accrualPeriodicity = _accrualPeriodicity_;
	}

	@JsonProperty("ids:contentStandard")
	final public URI getContentStandard() {
		return _contentStandard;
	}
	
	final public void setContentStandard (URI _contentStandard_) {
		this._contentStandard = _contentStandard_;
	}

	@JsonProperty("ids:language")
	final public List<Language> getLanguage() {
		return _language;
	}
	
	final public void setLanguage (List<Language> _language_) {
		this._language = _language_;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@JsonProperty("ids:created")
	final public XMLGregorianCalendar getCreated() {
		return _created;
	}
	
	final public void setCreated (XMLGregorianCalendar _created_) {
		this._created = _created_;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@JsonProperty("ids:modified")
	final public XMLGregorianCalendar getModified() {
		return _modified;
	}
	
	final public void setModified (XMLGregorianCalendar _modified_) {
		this._modified = _modified_;
	}

	@JsonProperty("ids:title")
	final public List<TypedLiteral> getTitle() {
		return _title;
	}
	
	final public void setTitle (List<TypedLiteral> _title_) {
		this._title = _title_;
	}

	@JsonProperty("ids:description")
	final public List<TypedLiteral> getDescription() {
		return _description;
	}
	
	final public void setDescription (List<TypedLiteral> _description_) {
		this._description = _description_;
	}


	@JsonProperty("ids:shapesGraph")
	final public URI getShapesGraph() {
		return _shapesGraph;
	}
	
	final public void setShapesGraph (URI _shapesGraph_) {
		this._shapesGraph = _shapesGraph_;
	}

	@JsonProperty("ids:version")
	final public String getVersion() {
		return _version;
	}
	
	final public void setVersion (String _version_) {
		this._version = _version_;
	}
}
