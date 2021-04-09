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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

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
* "Software Resource"@en
* "Resource (at least partially) comprising Software."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:SoftwareResource")
public class SoftwareResourceImpl implements Serializable, SoftwareResource {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Software Resource", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Resource (at least partially) comprising Software.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDSA Information Model ontology

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
	protected ArrayList<? extends DigitalContent> _contentPart;


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
	protected ArrayList<? extends ContractOffer> _contractOffer;


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
	protected ArrayList<? extends Representation> _defaultRepresentation;


	/**
	* "description"@en
	* "Explanation of the resource in a natural language text."@en
	*/
	@JsonAlias({"ids:description", "description"})
	protected ArrayList<? extends TypedLiteral> _description;


	/**
	* "keyword"@en
	* "Controlled keywords that describe the nature, purpose, or use of the content."@en
	*/
	@JsonAlias({"ids:keyword", "keyword"})
	protected ArrayList<? extends TypedLiteral> _keyword;


	/**
	* "language"@en
	* "Natural language(s) used within the content."@en
	*/
	@JsonAlias({"ids:language", "language"})
	protected ArrayList<? extends Language> _language;


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
	protected ArrayList<? extends Representation> _representation;


	/**
	* "resource endpoint"@en
	* "Reference to the Endpoints serving the resource\'s content or let you exchange messages with an IDS Connector."@en
	*/
	@JsonAlias({"ids:resourceEndpoint", "resourceEndpoint"})
	protected ArrayList<? extends ConnectorEndpoint> _resourceEndpoint;


	/**
	* "resource part"@en
	* "Reference to a Resource (physically or logically) included, definition of part-whole hierarchies."@en
	*/
	@JsonAlias({"ids:resourcePart", "resourcePart"})
	protected ArrayList<? extends Resource> _resourcePart;


	/**
	* "sample"@en
	* "Sample Resource instance."@en
	*/
	@JsonAlias({"ids:sample", "sample"})
	protected ArrayList<? extends Resource> _sample;


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
	protected ArrayList<? extends Location> _spatialCoverage;


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
	protected ArrayList<? extends TemporalEntity> _temporalCoverage;


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
	protected ArrayList<? extends URI> _theme;


	/**
	* "title"@en
	* "(Localized) name of the entity."@en
	*/
	@JsonAlias({"ids:title", "title"})
	protected ArrayList<? extends TypedLiteral> _title;


	/**
	* "variant"@en
	* "(Equivalent) variant of given Resource, e.g. a translation."@en
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
	protected SoftwareResourceImpl() {
		id = VocabUtil.getInstance().createRandomUrl("softwareResource");
	}

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel() {
		return this.label;
	}

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
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

	// accessor method implementations as derived from the IDSA Information Model ontology



	/**
	* "\n    Reference to a well-known License regulating the general usage of the Resource.\n    Check wikidata license documentation for an extensive list of licenses.\n    License IRI should refer to the direct of link for a given standard license,\n    e.g., MIT license (https://www.wikidata.org/wiki/Q334661). The label of the resolved wikidata license IRI can be used to\n    present the license in human-readable form.\n    "@en
	* @return Returns the URI for the property standardLicense.
	* More information under https://w3id.org/idsa/core/standardLicense
	*/
	@JsonProperty("ids:standardLicense")
	final public URI getStandardLicense() {
		return _standardLicense;
	}

	
	/**
	* "\n    Reference to a well-known License regulating the general usage of the Resource.\n    Check wikidata license documentation for an extensive list of licenses.\n    License IRI should refer to the direct of link for a given standard license,\n    e.g., MIT license (https://www.wikidata.org/wiki/Q334661). The label of the resolved wikidata license IRI can be used to\n    present the license in human-readable form.\n    "@en
	* @param _standardLicense_ desired value for the property standardLicense.
	* More information under https://w3id.org/idsa/core/standardLicense
	*/
	final public void setStandardLicense (URI _standardLicense_) {
		this._standardLicense = _standardLicense_;
	}

	/**
	* "URL reference to a custom license regulating the general usage of the Resource."@en
	* @return Returns the URI for the property customLicense.
	* More information under https://w3id.org/idsa/core/customLicense
	*/
	@JsonProperty("ids:customLicense")
	final public URI getCustomLicense() {
		return _customLicense;
	}

	
	/**
	* "URL reference to a custom license regulating the general usage of the Resource."@en
	* @param _customLicense_ desired value for the property customLicense.
	* More information under https://w3id.org/idsa/core/customLicense
	*/
	final public void setCustomLicense (URI _customLicense_) {
		this._customLicense = _customLicense_;
	}

	/**
	* "Reference to the Endpoints serving the resource\'s content or let you exchange messages with an IDS Connector."@en
	* @return Returns the ArrayList of ConnectorEndpoint for the property resourceEndpoint.
	* More information under https://w3id.org/idsa/core/resourceEndpoint
	*/
	@JsonProperty("ids:resourceEndpoint")
	final public ArrayList<? extends ConnectorEndpoint> getResourceEndpoint() {
		return _resourceEndpoint;
	}

	
	/**
	* "Reference to the Endpoints serving the resource\'s content or let you exchange messages with an IDS Connector."@en
	* @param _resourceEndpoint_ desired value for the property resourceEndpoint.
	* More information under https://w3id.org/idsa/core/resourceEndpoint
	*/
	final public void setResourceEndpoint (ArrayList<? extends ConnectorEndpoint> _resourceEndpoint_) {
		this._resourceEndpoint = _resourceEndpoint_;
	}

	/**
	* "Reference to a Resource (physically or logically) included, definition of part-whole hierarchies."@en
	* @return Returns the ArrayList of Resource for the property resourcePart.
	* More information under https://w3id.org/idsa/core/resourcePart
	*/
	@JsonProperty("ids:resourcePart")
	final public ArrayList<? extends Resource> getResourcePart() {
		return _resourcePart;
	}

	
	/**
	* "Reference to a Resource (physically or logically) included, definition of part-whole hierarchies."@en
	* @param _resourcePart_ desired value for the property resourcePart.
	* More information under https://w3id.org/idsa/core/resourcePart
	*/
	final public void setResourcePart (ArrayList<? extends Resource> _resourcePart_) {
		this._resourcePart = _resourcePart_;
	}

	/**
	* "Reference to a Contract Offer defining the authorized use of the Resource."@en
	* @return Returns the ArrayList of ContractOffer for the property contractOffer.
	* More information under https://w3id.org/idsa/core/contractOffer
	*/
	@JsonProperty("ids:contractOffer")
	final public ArrayList<? extends ContractOffer> getContractOffer() {
		return _contractOffer;
	}

	
	/**
	* "Reference to a Contract Offer defining the authorized use of the Resource."@en
	* @param _contractOffer_ desired value for the property contractOffer.
	* More information under https://w3id.org/idsa/core/contractOffer
	*/
	final public void setContractOffer (ArrayList<? extends ContractOffer> _contractOffer_) {
		this._contractOffer = _contractOffer_;
	}

	/**
	* "Sample Resource instance."@en
	* @return Returns the ArrayList of Resource for the property sample.
	* More information under https://w3id.org/idsa/core/sample
	*/
	@JsonProperty("ids:sample")
	final public ArrayList<? extends Resource> getSample() {
		return _sample;
	}

	
	/**
	* "Sample Resource instance."@en
	* @param _sample_ desired value for the property sample.
	* More information under https://w3id.org/idsa/core/sample
	*/
	final public void setSample (ArrayList<? extends Resource> _sample_) {
		this._sample = _sample_;
	}

	/**
	* "The publisher of the resource (which may differ from the sovereign)."@en
	* @return Returns the URI for the property publisher.
	* More information under https://w3id.org/idsa/core/publisher
	*/
	@JsonProperty("ids:publisher")
	final public URI getPublisher() {
		return _publisher;
	}

	
	/**
	* "The publisher of the resource (which may differ from the sovereign)."@en
	* @param _publisher_ desired value for the property publisher.
	* More information under https://w3id.org/idsa/core/publisher
	*/
	final public void setPublisher (URI _publisher_) {
		this._publisher = _publisher_;
	}

	/**
	* "The \'owner\', i.e. sovereign of the data."@en
	* @return Returns the URI for the property sovereign.
	* More information under https://w3id.org/idsa/core/sovereign
	*/
	@JsonProperty("ids:sovereign")
	final public URI getSovereign() {
		return _sovereign;
	}

	
	/**
	* "The \'owner\', i.e. sovereign of the data."@en
	* @param _sovereign_ desired value for the property sovereign.
	* More information under https://w3id.org/idsa/core/sovereign
	*/
	final public void setSovereign (URI _sovereign_) {
		this._sovereign = _sovereign_;
	}

	/**
	* "(Equivalent) variant of given Resource, e.g. a translation."@en
	* @return Returns the Resource for the property variant.
	* More information under https://w3id.org/idsa/core/variant
	*/
	@JsonProperty("ids:variant")
	final public Resource getVariant() {
		return _variant;
	}

	
	/**
	* "(Equivalent) variant of given Resource, e.g. a translation."@en
	* @param _variant_ desired value for the property variant.
	* More information under https://w3id.org/idsa/core/variant
	*/
	final public void setVariant (Resource _variant_) {
		this._variant = _variant_;
	}



	/**
	* "Reference to a Digital Content (physically or logically) included, definition of part-whole hierarchies."@en
	* @return Returns the ArrayList of DigitalContent for the property contentPart.
	* More information under https://w3id.org/idsa/core/contentPart
	*/
	@JsonProperty("ids:contentPart")
	final public ArrayList<? extends DigitalContent> getContentPart() {
		return _contentPart;
	}

	
	/**
	* "Reference to a Digital Content (physically or logically) included, definition of part-whole hierarchies."@en
	* @param _contentPart_ desired value for the property contentPart.
	* More information under https://w3id.org/idsa/core/contentPart
	*/
	final public void setContentPart (ArrayList<? extends DigitalContent> _contentPart_) {
		this._contentPart = _contentPart_;
	}

	/**
	* "Named spatial entity covered by the Resource."@en
	* @return Returns the ArrayList of Location for the property spatialCoverage.
	* More information under https://w3id.org/idsa/core/spatialCoverage
	*/
	@JsonProperty("ids:spatialCoverage")
	final public ArrayList<? extends Location> getSpatialCoverage() {
		return _spatialCoverage;
	}

	
	/**
	* "Named spatial entity covered by the Resource."@en
	* @param _spatialCoverage_ desired value for the property spatialCoverage.
	* More information under https://w3id.org/idsa/core/spatialCoverage
	*/
	final public void setSpatialCoverage (ArrayList<? extends Location> _spatialCoverage_) {
		this._spatialCoverage = _spatialCoverage_;
	}

	/**
	* "Temporal period or instance covered by the content."@en
	* @return Returns the ArrayList of TemporalEntity for the property temporalCoverage.
	* More information under https://w3id.org/idsa/core/temporalCoverage
	*/
	@JsonProperty("ids:temporalCoverage")
	final public ArrayList<? extends TemporalEntity> getTemporalCoverage() {
		return _temporalCoverage;
	}

	
	/**
	* "Temporal period or instance covered by the content."@en
	* @param _temporalCoverage_ desired value for the property temporalCoverage.
	* More information under https://w3id.org/idsa/core/temporalCoverage
	*/
	final public void setTemporalCoverage (ArrayList<? extends TemporalEntity> _temporalCoverage_) {
		this._temporalCoverage = _temporalCoverage_;
	}

	/**
	* "Abstract or concrete concept related to or referred by the content."@en
	* @return Returns the ArrayList of URI for the property theme.
	* More information under https://w3id.org/idsa/core/theme
	*/
	@JsonProperty("ids:theme")
	final public ArrayList<? extends URI> getTheme() {
		return _theme;
	}

	
	/**
	* "Abstract or concrete concept related to or referred by the content."@en
	* @param _theme_ desired value for the property theme.
	* More information under https://w3id.org/idsa/core/theme
	*/
	final public void setTheme (ArrayList<? extends URI> _theme_) {
		this._theme = _theme_;
	}

	/**
	* "Controlled keywords that describe the nature, purpose, or use of the content."@en
	* @return Returns the ArrayList of TypedLiteral for the property keyword.
	* More information under https://w3id.org/idsa/core/keyword
	*/
	@JsonProperty("ids:keyword")
	final public ArrayList<? extends TypedLiteral> getKeyword() {
		return _keyword;
	}

	
	/**
	* "Controlled keywords that describe the nature, purpose, or use of the content."@en
	* @param _keyword_ desired value for the property keyword.
	* More information under https://w3id.org/idsa/core/keyword
	*/
	final public void setKeyword (ArrayList<? extends TypedLiteral> _keyword_) {
		this._keyword = _keyword_;
	}

	/**
	* "Representation of the content."@en
	* @return Returns the ArrayList of Representation for the property representation.
	* More information under https://w3id.org/idsa/core/representation
	*/
	@JsonProperty("ids:representation")
	final public ArrayList<? extends Representation> getRepresentation() {
		return _representation;
	}

	
	/**
	* "Representation of the content."@en
	* @param _representation_ desired value for the property representation.
	* More information under https://w3id.org/idsa/core/representation
	*/
	final public void setRepresentation (ArrayList<? extends Representation> _representation_) {
		this._representation = _representation_;
	}

	/**
	* "Detailed type, genre or interpretation of the Digital Content."@en
	* @return Returns the ContentType for the property contentType.
	* More information under https://w3id.org/idsa/core/contentType
	*/
	@JsonProperty("ids:contentType")
	final public ContentType getContentType() {
		return _contentType;
	}

	
	/**
	* "Detailed type, genre or interpretation of the Digital Content."@en
	* @param _contentType_ desired value for the property contentType.
	* More information under https://w3id.org/idsa/core/contentType
	*/
	final public void setContentType (ContentType _contentType_) {
		this._contentType = _contentType_;
	}

	/**
	* "Default representation of the content."@en
	* @return Returns the ArrayList of Representation for the property defaultRepresentation.
	* More information under https://w3id.org/idsa/core/defaultRepresentation
	*/
	@JsonProperty("ids:defaultRepresentation")
	final public ArrayList<? extends Representation> getDefaultRepresentation() {
		return _defaultRepresentation;
	}

	
	/**
	* "Default representation of the content."@en
	* @param _defaultRepresentation_ desired value for the property defaultRepresentation.
	* More information under https://w3id.org/idsa/core/defaultRepresentation
	*/
	final public void setDefaultRepresentation (ArrayList<? extends Representation> _defaultRepresentation_) {
		this._defaultRepresentation = _defaultRepresentation_;
	}

	/**
	* "Minimum time between collected data points in a time series within this content."@en
	* @return Returns the Frequency for the property temporalResolution.
	* More information under https://w3id.org/idsa/core/temporalResolution
	*/
	@JsonProperty("ids:temporalResolution")
	final public Frequency getTemporalResolution() {
		return _temporalResolution;
	}

	
	/**
	* "Minimum time between collected data points in a time series within this content."@en
	* @param _temporalResolution_ desired value for the property temporalResolution.
	* More information under https://w3id.org/idsa/core/temporalResolution
	*/
	final public void setTemporalResolution (Frequency _temporalResolution_) {
		this._temporalResolution = _temporalResolution_;
	}

	/**
	* "The regular period with which items are added to a collection."@en
	* @return Returns the Frequency for the property accrualPeriodicity.
	* More information under https://w3id.org/idsa/core/accrualPeriodicity
	*/
	@JsonProperty("ids:accrualPeriodicity")
	final public Frequency getAccrualPeriodicity() {
		return _accrualPeriodicity;
	}

	
	/**
	* "The regular period with which items are added to a collection."@en
	* @param _accrualPeriodicity_ desired value for the property accrualPeriodicity.
	* More information under https://w3id.org/idsa/core/accrualPeriodicity
	*/
	final public void setAccrualPeriodicity (Frequency _accrualPeriodicity_) {
		this._accrualPeriodicity = _accrualPeriodicity_;
	}

	/**
	* "IRI containing document, which defines the standard for the given Digital Content. The content is assumed to conform to that Standard."@en
	* @return Returns the URI for the property contentStandard.
	* More information under https://w3id.org/idsa/core/contentStandard
	*/
	@JsonProperty("ids:contentStandard")
	final public URI getContentStandard() {
		return _contentStandard;
	}

	
	/**
	* "IRI containing document, which defines the standard for the given Digital Content. The content is assumed to conform to that Standard."@en
	* @param _contentStandard_ desired value for the property contentStandard.
	* More information under https://w3id.org/idsa/core/contentStandard
	*/
	final public void setContentStandard (URI _contentStandard_) {
		this._contentStandard = _contentStandard_;
	}

	/**
	* "Natural language(s) used within the content."@en
	* @return Returns the ArrayList of Language for the property language.
	* More information under https://w3id.org/idsa/core/language
	*/
	@JsonProperty("ids:language")
	final public ArrayList<? extends Language> getLanguage() {
		return _language;
	}

	
	/**
	* "Natural language(s) used within the content."@en
	* @param _language_ desired value for the property language.
	* More information under https://w3id.org/idsa/core/language
	*/
	final public void setLanguage (ArrayList<? extends Language> _language_) {
		this._language = _language_;
	}

	/**
	* "The date of the creation of the Digital Content. In contrast to the ids:temporalCoverage, creation dates of ids:Representation, ids:Artifacts or any other form of meta-data, this property describes the creation date of referenced Digital Content itself."@en
	* @return Returns the XMLGregorianCalendar for the property created.
	* More information under https://w3id.org/idsa/core/created
	*/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@JsonProperty("ids:created")
	final public XMLGregorianCalendar getCreated() {
		return _created;
	}

	
	/**
	* "The date of the creation of the Digital Content. In contrast to the ids:temporalCoverage, creation dates of ids:Representation, ids:Artifacts or any other form of meta-data, this property describes the creation date of referenced Digital Content itself."@en
	* @param _created_ desired value for the property created.
	* More information under https://w3id.org/idsa/core/created
	*/
	final public void setCreated (XMLGregorianCalendar _created_) {
		this._created = _created_;
	}

	/**
	* "The date/time this Digital Content has been changed the last time. Only one \'modified\' attribute is usually needed."@en
	* @return Returns the XMLGregorianCalendar for the property modified.
	* More information under https://w3id.org/idsa/core/modified
	*/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
	@JsonProperty("ids:modified")
	final public XMLGregorianCalendar getModified() {
		return _modified;
	}

	
	/**
	* "The date/time this Digital Content has been changed the last time. Only one \'modified\' attribute is usually needed."@en
	* @param _modified_ desired value for the property modified.
	* More information under https://w3id.org/idsa/core/modified
	*/
	final public void setModified (XMLGregorianCalendar _modified_) {
		this._modified = _modified_;
	}

	/**
	* "(Localized) name of the entity."@en
	* @return Returns the ArrayList of TypedLiteral for the property title.
	* More information under https://w3id.org/idsa/core/title
	*/
	@JsonProperty("ids:title")
	final public ArrayList<? extends TypedLiteral> getTitle() {
		return _title;
	}

	
	/**
	* "(Localized) name of the entity."@en
	* @param _title_ desired value for the property title.
	* More information under https://w3id.org/idsa/core/title
	*/
	final public void setTitle (ArrayList<? extends TypedLiteral> _title_) {
		this._title = _title_;
	}

	/**
	* "Explanation of the resource in a natural language text."@en
	* @return Returns the ArrayList of TypedLiteral for the property description.
	* More information under https://w3id.org/idsa/core/description
	*/
	@JsonProperty("ids:description")
	final public ArrayList<? extends TypedLiteral> getDescription() {
		return _description;
	}

	
	/**
	* "Explanation of the resource in a natural language text."@en
	* @param _description_ desired value for the property description.
	* More information under https://w3id.org/idsa/core/description
	*/
	final public void setDescription (ArrayList<? extends TypedLiteral> _description_) {
		this._description = _description_;
	}


	/**
	* "Reference to SHACL shape graph, which describes domain-specific knowledge."@en
	* @return Returns the URI for the property shapesGraph.
	* More information under https://w3id.org/idsa/core/shapesGraph
	*/
	@JsonProperty("ids:shapesGraph")
	final public URI getShapesGraph() {
		return _shapesGraph;
	}

	
	/**
	* "Reference to SHACL shape graph, which describes domain-specific knowledge."@en
	* @param _shapesGraph_ desired value for the property shapesGraph.
	* More information under https://w3id.org/idsa/core/shapesGraph
	*/
	final public void setShapesGraph (URI _shapesGraph_) {
		this._shapesGraph = _shapesGraph_;
	}

	/**
	* "Version identifier of the Managed Entity"@en
	* @return Returns the String for the property version.
	* More information under https://w3id.org/idsa/core/version
	*/
	@JsonProperty("ids:version")
	final public String getVersion() {
		return _version;
	}

	
	/**
	* "Version identifier of the Managed Entity"@en
	* @param _version_ desired value for the property version.
	* More information under https://w3id.org/idsa/core/version
	*/
	final public void setVersion (String _version_) {
		this._version = _version_;
	}
}
