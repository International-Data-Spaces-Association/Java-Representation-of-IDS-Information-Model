package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.*;
import javax.validation.constraints.*;
import java.util.Arrays;
import java.io.Serializable;

import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/** 
	"Data Resource"@en

	"Resource (at least partially) comprising data content."@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:DataResource")
public class DataResourceImpl implements Serializable, DataResource {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Data Resource", "en"));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Resource (at least partially) comprising data content.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

	/**
	"Accrual periodicity"@en

	"The regular period with which items are added to a collection."@en
	*/
	@JsonAlias({"ids:accrualPeriodicity", "accrualPeriodicity"})
	 Frequency _accrualPeriodicity;

	/**
	"content part"@en

	"Reference to a Digital Content (physically or logically) included, definition of part-whole hierarchies."@en
	*/
	@JsonAlias({"ids:contentPart", "contentPart"})
	 java.util.ArrayList<? extends DigitalContent> _contentPart;


	/**
	"content standard"@en

	"IRI containing document, which defines the standard for the given Digital Content. The content is assumed to conform to that Standard."@en
	*/
	@JsonAlias({"ids:contentStandard", "contentStandard"})
	 URI _contentStandard;

	/**
	"content type"@en

	"Detailed type, genre or interpretation of the Digital Content."@en
	*/
	@JsonAlias({"ids:contentType", "contentType"})
	 ContentType _contentType;

	/**
	"contract offer"@en

	"Reference to a Contract Offer defining the authorized use of the Resource."@en
	*/
	@JsonAlias({"ids:contractOffer", "contractOffer"})
	 java.util.ArrayList<? extends ContractOffer> _contractOffer;

	/**
	"created"@en

	"The date of the creation of the Digital Content. In contrast to the ids:temporalCoverage, creation dates of ids:Representation, ids:Artifacts or any other form of meta-data, this property describes the creation date of referenced Digital Content itself."@en
	*/
	@JsonAlias({"ids:created", "created"})
	 XMLGregorianCalendar _created;

	/**
	"Custom License"@en

	"URL reference to a custom license regulating the general usage of the Resource."@en
	*/
	@JsonAlias({"ids:customLicense", "customLicense"})
	 URI _customLicense;

	/**
	"Default representation"@en

	"Default representation of the content."@en
	*/
	@JsonAlias({"ids:defaultRepresentation", "defaultRepresentation"})
	 java.util.ArrayList<? extends Representation> _defaultRepresentation;

	/**
	"description"@en

	"Explanation of the resource in a natural language text."@en
	*/
	@JsonAlias({"ids:description", "description"})
	 java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _description;

	/**
	"keyword"@en

	"Controlled keywords that describe the nature, purpose, or use of the content."@en
	*/
	@JsonAlias({"ids:keyword", "keyword"})
	 java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _keyword;

	/**
	"language"@en

	"Natural language(s) used within the content."@en
	*/
	@JsonAlias({"ids:language", "language"})
	 java.util.ArrayList<? extends Language> _language;

	/**
	"modified"@en

	"The date/time this Digital Content has been changed the last time. Only one \'modified\' attribute is usually needed."@en
	*/
	@JsonAlias({"ids:modified", "modified"})
	 XMLGregorianCalendar _modified;

	/**
	"publisher"@en

	"The publisher of the resource (which may differ from the sovereign)."@en
	*/
	@JsonAlias({"ids:publisher", "publisher"})
	 URI _publisher;

	/**
	"representation"@en

	"Representation of the content."@en
	*/
	@JsonAlias({"ids:representation", "representation"})
	 java.util.ArrayList<? extends Representation> _representation;

	/**
	"resource endpoint"@en

	"Reference to the Endpoints serving the resource\'s content or let you exchange messages with an IDS Connector."@en
	*/
	@JsonAlias({"ids:resourceEndpoint", "resourceEndpoint"})
	 java.util.ArrayList<? extends ConnectorEndpoint> _resourceEndpoint;

	/**
	"resource part"@en

	"Reference to a Resource (physically or logically) included, definition of part-whole hierarchies."@en
	*/
	@JsonAlias({"ids:resourcePart", "resourcePart"})
	 java.util.ArrayList<? extends Resource> _resourcePart;

	/**
	"sample"@en

	"Sample Resource instance."@en
	*/
	@JsonAlias({"ids:sample", "sample"})
	 java.util.ArrayList<? extends Resource> _sample;

	/**
	"shapeGraph"@en

	"Reference to SHACL shape graph, which describes domain-specific knowledge."@en
	*/
	@JsonAlias({"ids:shapesGraph", "shapesGraph"})
	 URI _shapesGraph;

	/**
	"sovereign"@en

	"The \'owner\', i.e. sovereign of the data."@en
	*/
	@JsonAlias({"ids:sovereign", "sovereign"})
	 URI _sovereign;

	/**
	"spatial coverage"@en

	"Named spatial entity covered by the Resource."@en
	*/
	@JsonAlias({"ids:spatialCoverage", "spatialCoverage"})
	 java.util.ArrayList<? extends Location> _spatialCoverage;

	/**
	"Standard License"@en

	"\n    Reference to a well-known License regulating the general usage of the Resource.\n    Check wikidata license documentation for an extensive list of licenses.\n    License IRI should refer to the direct of link for a given standard license,\n    e.g., MIT license (https://www.wikidata.org/wiki/Q334661). The label of the resolved wikidata license IRI can be used to\n    present the license in human-readable form.\n    "@en
	*/
	@JsonAlias({"ids:standardLicense", "standardLicense"})
	 URI _standardLicense;

	/**
	"temporal coverage"@en

	"Temporal period or instance covered by the content."@en
	*/
	@JsonAlias({"ids:temporalCoverage", "temporalCoverage"})
	 java.util.ArrayList<? extends TemporalEntity> _temporalCoverage;

	/**
	"temporal resolution"@en

	"Minimum time between collected data points in a time series within this content."@en
	*/
	@JsonAlias({"ids:temporalResolution", "temporalResolution"})
	 Frequency _temporalResolution;

	/**
	"theme"@en

	"Abstract or concrete concept related to or referred by the content."@en
	*/
	@JsonAlias({"ids:theme", "theme"})
	 java.util.ArrayList<? extends URI> _theme;

	/**
	"title"@en

	"(Localized) name of the entity."@en
	*/
	@JsonAlias({"ids:title", "title"})
	 java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _title;

	/**
	"variant"@en

	"(Equivalent) variant of given Resource, e.g. a translation."@en
	*/
	@JsonAlias({"ids:variant", "variant"})
	 Resource _variant;

	/**
	"version"@en

	"Version identifier of the Managed Entity"@en
	*/
	@JsonAlias({"ids:version", "version"})
	 String _version;

	// no manual construction
	DataResourceImpl() {
		id = VocabUtil.getInstance().createRandomUrl("dataResource");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	public java.util.List<TypedLiteral> getLabel() {
		return this.label;
	}

	public java.util.List<TypedLiteral> getComment() {
		return this.comment;
	}

	// getter and setter for generic property map
	@JsonAnyGetter
	public java.util.Map<String,Object> getProperties() {
		if (this.properties == null) return null;
		Iterator<String> iter = this.properties.keySet().iterator();
		java.util.Map<String,Object> resultset = new HashMap<String, Object>();
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
		} else if (value instanceof java.util.Map) {
			java.util.Map<String, Object> result_map = new HashMap<String, Object>();
			((java.util.Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	@JsonAnySetter
	public void setProperty(String property, Object value) {
	if (this.properties == null) this.properties = new java.util.HashMap<String,Object>();
	if (property.startsWith("@")) {return ;};
	this.properties.put(property, value) ;
	}
	// accessor method implementations as derived from information model


	final public 
	
	
	@JsonProperty("ids:standardLicense")
	URI getStandardLicense() {
		return _standardLicense;
	}
	final public void setStandardLicense (URI _standardLicense_) {
		this._standardLicense = _standardLicense_;
	}

	final public 
	
	
	@JsonProperty("ids:customLicense")
	URI getCustomLicense() {
		return _customLicense;
	}
	final public void setCustomLicense (URI _customLicense_) {
		this._customLicense = _customLicense_;
	}

	final public 
	
	
	@JsonProperty("ids:resourceEndpoint")
	java.util.ArrayList<? extends ConnectorEndpoint> getResourceEndpoint() {
		return _resourceEndpoint;
	}
	final public void setResourceEndpoint (java.util.ArrayList<? extends ConnectorEndpoint> _resourceEndpoint_) {
		this._resourceEndpoint = _resourceEndpoint_;
	}

	final public 
	
	
	@JsonProperty("ids:resourcePart")
	java.util.ArrayList<? extends Resource> getResourcePart() {
		return _resourcePart;
	}
	final public void setResourcePart (java.util.ArrayList<? extends Resource> _resourcePart_) {
		this._resourcePart = _resourcePart_;
	}

	final public 
	
	
	@JsonProperty("ids:contractOffer")
	java.util.ArrayList<? extends ContractOffer> getContractOffer() {
		return _contractOffer;
	}
	final public void setContractOffer (java.util.ArrayList<? extends ContractOffer> _contractOffer_) {
		this._contractOffer = _contractOffer_;
	}

	final public 
	
	
	@JsonProperty("ids:sample")
	java.util.ArrayList<? extends Resource> getSample() {
		return _sample;
	}
	final public void setSample (java.util.ArrayList<? extends Resource> _sample_) {
		this._sample = _sample_;
	}

	final public 
	
	
	@JsonProperty("ids:publisher")
	URI getPublisher() {
		return _publisher;
	}
	final public void setPublisher (URI _publisher_) {
		this._publisher = _publisher_;
	}

	final public 
	
	
	@JsonProperty("ids:sovereign")
	URI getSovereign() {
		return _sovereign;
	}
	final public void setSovereign (URI _sovereign_) {
		this._sovereign = _sovereign_;
	}

	final public 
	
	
	@JsonProperty("ids:variant")
	Resource getVariant() {
		return _variant;
	}
	final public void setVariant (Resource _variant_) {
		this._variant = _variant_;
	}



	final public 
	
	
	@JsonProperty("ids:contentPart")
	java.util.ArrayList<? extends DigitalContent> getContentPart() {
		return _contentPart;
	}
	final public void setContentPart (java.util.ArrayList<? extends DigitalContent> _contentPart_) {
		this._contentPart = _contentPart_;
	}

	final public 
	
	
	@JsonProperty("ids:spatialCoverage")
	java.util.ArrayList<? extends Location> getSpatialCoverage() {
		return _spatialCoverage;
	}
	final public void setSpatialCoverage (java.util.ArrayList<? extends Location> _spatialCoverage_) {
		this._spatialCoverage = _spatialCoverage_;
	}

	final public 
	
	
	@JsonProperty("ids:temporalCoverage")
	java.util.ArrayList<? extends TemporalEntity> getTemporalCoverage() {
		return _temporalCoverage;
	}
	final public void setTemporalCoverage (java.util.ArrayList<? extends TemporalEntity> _temporalCoverage_) {
		this._temporalCoverage = _temporalCoverage_;
	}

	final public 
	
	
	@JsonProperty("ids:theme")
	java.util.ArrayList<? extends URI> getTheme() {
		return _theme;
	}
	final public void setTheme (java.util.ArrayList<? extends URI> _theme_) {
		this._theme = _theme_;
	}

	final public 
	
	
	@JsonProperty("ids:keyword")
	java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> getKeyword() {
		return _keyword;
	}
	final public void setKeyword (java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _keyword_) {
		this._keyword = _keyword_;
	}

	final public 
	
	
	@JsonProperty("ids:representation")
	java.util.ArrayList<? extends Representation> getRepresentation() {
		return _representation;
	}
	final public void setRepresentation (java.util.ArrayList<? extends Representation> _representation_) {
		this._representation = _representation_;
	}

	final public 
	
	
	@JsonProperty("ids:contentType")
	ContentType getContentType() {
		return _contentType;
	}
	final public void setContentType (ContentType _contentType_) {
		this._contentType = _contentType_;
	}

	final public 
	
	
	@JsonProperty("ids:defaultRepresentation")
	java.util.ArrayList<? extends Representation> getDefaultRepresentation() {
		return _defaultRepresentation;
	}
	final public void setDefaultRepresentation (java.util.ArrayList<? extends Representation> _defaultRepresentation_) {
		this._defaultRepresentation = _defaultRepresentation_;
	}

	final public 
	
	
	@JsonProperty("ids:temporalResolution")
	Frequency getTemporalResolution() {
		return _temporalResolution;
	}
	final public void setTemporalResolution (Frequency _temporalResolution_) {
		this._temporalResolution = _temporalResolution_;
	}

	final public 
	
	
	@JsonProperty("ids:accrualPeriodicity")
	Frequency getAccrualPeriodicity() {
		return _accrualPeriodicity;
	}
	final public void setAccrualPeriodicity (Frequency _accrualPeriodicity_) {
		this._accrualPeriodicity = _accrualPeriodicity_;
	}

	final public 
	
	
	@JsonProperty("ids:contentStandard")
	URI getContentStandard() {
		return _contentStandard;
	}
	final public void setContentStandard (URI _contentStandard_) {
		this._contentStandard = _contentStandard_;
	}

	final public 
	
	
	@JsonProperty("ids:language")
	java.util.ArrayList<? extends Language> getLanguage() {
		return _language;
	}
	final public void setLanguage (java.util.ArrayList<? extends Language> _language_) {
		this._language = _language_;
	}

	final public 
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	
	@JsonProperty("ids:created")
	XMLGregorianCalendar getCreated() {
		return _created;
	}
	final public void setCreated (XMLGregorianCalendar _created_) {
		this._created = _created_;
	}

	final public 
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	
	@JsonProperty("ids:modified")
	XMLGregorianCalendar getModified() {
		return _modified;
	}
	final public void setModified (XMLGregorianCalendar _modified_) {
		this._modified = _modified_;
	}

	final public 
	
	
	@JsonProperty("ids:title")
	java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> getTitle() {
		return _title;
	}
	final public void setTitle (java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _title_) {
		this._title = _title_;
	}

	final public 
	
	
	@JsonProperty("ids:description")
	java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> getDescription() {
		return _description;
	}
	final public void setDescription (java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _description_) {
		this._description = _description_;
	}


	final public 
	
	
	@JsonProperty("ids:shapesGraph")
	URI getShapesGraph() {
		return _shapesGraph;
	}
	final public void setShapesGraph (URI _shapesGraph_) {
		this._shapesGraph = _shapesGraph_;
	}

	final public 
	
	
	@JsonProperty("ids:version")
	String getVersion() {
		return _version;
	}
	final public void setVersion (String _version_) {
		this._version = _version_;
	}
}
