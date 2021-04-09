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
import com.fasterxml.jackson.databind.JsonNode;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** 
* "Language"@en
* "The class of languages potentially being used by textual Data Assets."@en 
*/
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:Language")
public enum Language {

	/** 
	* "Afar"@en
	*/
	AA("https://w3id.org/idsa/code/AA", Arrays.asList(new TypedLiteral("Afar", "en")), Collections.emptyList()),

	/** 
	* "Abkhaz"@en
	*/
	AB("https://w3id.org/idsa/code/AB", Arrays.asList(new TypedLiteral("Abkhaz", "en")), Collections.emptyList()),

	/** 
	* "Avestan"@en
	*/
	AE("https://w3id.org/idsa/code/AE", Arrays.asList(new TypedLiteral("Avestan", "en")), Collections.emptyList()),

	/** 
	* "Afrikaans"@en
	*/
	AF("https://w3id.org/idsa/code/AF", Arrays.asList(new TypedLiteral("Afrikaans", "en")), Collections.emptyList()),

	/** 
	* "Akan"@en
	*/
	AK("https://w3id.org/idsa/code/AK", Arrays.asList(new TypedLiteral("Akan", "en")), Collections.emptyList()),

	/** 
	* "Amharic"@en
	*/
	AM("https://w3id.org/idsa/code/AM", Arrays.asList(new TypedLiteral("Amharic", "en")), Collections.emptyList()),

	/** 
	* "Aragonese"@en
	*/
	AN("https://w3id.org/idsa/code/AN", Arrays.asList(new TypedLiteral("Aragonese", "en")), Collections.emptyList()),

	/** 
	* "Arabic"@en
	*/
	AR("https://w3id.org/idsa/code/AR", Arrays.asList(new TypedLiteral("Arabic", "en")), Collections.emptyList()),

	/** 
	* "Assamese"@en
	*/
	AS("https://w3id.org/idsa/code/AS", Arrays.asList(new TypedLiteral("Assamese", "en")), Collections.emptyList()),

	/** 
	* "Avaric"@en
	*/
	AV("https://w3id.org/idsa/code/AV", Arrays.asList(new TypedLiteral("Avaric", "en")), Collections.emptyList()),

	/** 
	* "Aymara"@en
	*/
	AY("https://w3id.org/idsa/code/AY", Arrays.asList(new TypedLiteral("Aymara", "en")), Collections.emptyList()),

	/** 
	* "Azerbaijani"@en
	*/
	AZ("https://w3id.org/idsa/code/AZ", Arrays.asList(new TypedLiteral("Azerbaijani", "en")), Collections.emptyList()),

	/** 
	* "Bashkir"@en
	*/
	BA("https://w3id.org/idsa/code/BA", Arrays.asList(new TypedLiteral("Bashkir", "en")), Collections.emptyList()),

	/** 
	* "Belarusian"@en
	*/
	BE("https://w3id.org/idsa/code/BE", Arrays.asList(new TypedLiteral("Belarusian", "en")), Collections.emptyList()),

	/** 
	* "Bulgarian"@en
	*/
	BG("https://w3id.org/idsa/code/BG", Arrays.asList(new TypedLiteral("Bulgarian", "en")), Collections.emptyList()),

	/** 
	* "Bihari"@en
	*/
	BH("https://w3id.org/idsa/code/BH", Arrays.asList(new TypedLiteral("Bihari", "en")), Collections.emptyList()),

	/** 
	* "Bislama"@en
	*/
	BI("https://w3id.org/idsa/code/BI", Arrays.asList(new TypedLiteral("Bislama", "en")), Collections.emptyList()),

	/** 
	* "Bambara"@en
	*/
	BM("https://w3id.org/idsa/code/BM", Arrays.asList(new TypedLiteral("Bambara", "en")), Collections.emptyList()),

	/** 
	* "Bengali, Bangla"@en
	*/
	BN("https://w3id.org/idsa/code/BN", Arrays.asList(new TypedLiteral("Bengali, Bangla", "en")), Collections.emptyList()),

	/** 
	* "Tibetan Standard, Tibetan, Central"@en
	*/
	BO("https://w3id.org/idsa/code/BO", Arrays.asList(new TypedLiteral("Tibetan Standard, Tibetan, Central", "en")), Collections.emptyList()),

	/** 
	* "Breton"@en
	*/
	BR("https://w3id.org/idsa/code/BR", Arrays.asList(new TypedLiteral("Breton", "en")), Collections.emptyList()),

	/** 
	* "Bosnian"@en
	*/
	BS("https://w3id.org/idsa/code/BS", Arrays.asList(new TypedLiteral("Bosnian", "en")), Collections.emptyList()),

	/** 
	* "Catalan"@en
	*/
	CA("https://w3id.org/idsa/code/CA", Arrays.asList(new TypedLiteral("Catalan", "en")), Collections.emptyList()),

	/** 
	* "Chechen"@en
	*/
	CE("https://w3id.org/idsa/code/CE", Arrays.asList(new TypedLiteral("Chechen", "en")), Collections.emptyList()),

	/** 
	* "Chamorro"@en
	*/
	CH("https://w3id.org/idsa/code/CH", Arrays.asList(new TypedLiteral("Chamorro", "en")), Collections.emptyList()),

	/** 
	* "Corsican"@en
	*/
	CO("https://w3id.org/idsa/code/CO", Arrays.asList(new TypedLiteral("Corsican", "en")), Collections.emptyList()),

	/** 
	* "Cree"@en
	*/
	CR("https://w3id.org/idsa/code/CR", Arrays.asList(new TypedLiteral("Cree", "en")), Collections.emptyList()),

	/** 
	* "Czech"@en
	*/
	CS("https://w3id.org/idsa/code/CS", Arrays.asList(new TypedLiteral("Czech", "en")), Collections.emptyList()),

	/** 
	* "Old Church Slavonic, Church Slavonic, Old Bulgarian"@en
	*/
	CU("https://w3id.org/idsa/code/CU", Arrays.asList(new TypedLiteral("Old Church Slavonic, Church Slavonic, Old Bulgarian", "en")), Collections.emptyList()),

	/** 
	* "Chuvash"@en
	*/
	CV("https://w3id.org/idsa/code/CV", Arrays.asList(new TypedLiteral("Chuvash", "en")), Collections.emptyList()),

	/** 
	* "Welsh"@en
	*/
	CY("https://w3id.org/idsa/code/CY", Arrays.asList(new TypedLiteral("Welsh", "en")), Collections.emptyList()),

	/** 
	* "Danish"@en
	*/
	DA("https://w3id.org/idsa/code/DA", Arrays.asList(new TypedLiteral("Danish", "en")), Collections.emptyList()),

	/** 
	* "German"@en
	*/
	DE("https://w3id.org/idsa/code/DE", Arrays.asList(new TypedLiteral("German", "en")), Collections.emptyList()),

	/** 
	* "Divehi, Dhivehi, Maldivian"@en
	*/
	DV("https://w3id.org/idsa/code/DV", Arrays.asList(new TypedLiteral("Divehi, Dhivehi, Maldivian", "en")), Collections.emptyList()),

	/** 
	* "Dzongkha"@en
	*/
	DZ("https://w3id.org/idsa/code/DZ", Arrays.asList(new TypedLiteral("Dzongkha", "en")), Collections.emptyList()),

	/** 
	* "Ewe"@en
	*/
	EE("https://w3id.org/idsa/code/EE", Arrays.asList(new TypedLiteral("Ewe", "en")), Collections.emptyList()),

	/** 
	* "Greek (modern)"@en
	*/
	EL("https://w3id.org/idsa/code/EL", Arrays.asList(new TypedLiteral("Greek (modern)", "en")), Collections.emptyList()),

	/** 
	* "English"@en
	*/
	EN("https://w3id.org/idsa/code/EN", Arrays.asList(new TypedLiteral("English", "en")), Collections.emptyList()),

	/** 
	* "Esperanto"@en
	*/
	EO("https://w3id.org/idsa/code/EO", Arrays.asList(new TypedLiteral("Esperanto", "en")), Collections.emptyList()),

	/** 
	* "Spanish"@en
	*/
	ES("https://w3id.org/idsa/code/ES", Arrays.asList(new TypedLiteral("Spanish", "en")), Collections.emptyList()),

	/** 
	* "Estonian"@en
	*/
	ET("https://w3id.org/idsa/code/ET", Arrays.asList(new TypedLiteral("Estonian", "en")), Collections.emptyList()),

	/** 
	* "Basque"@en
	*/
	EU("https://w3id.org/idsa/code/EU", Arrays.asList(new TypedLiteral("Basque", "en")), Collections.emptyList()),

	/** 
	* "Persian (Farsi)"@en
	*/
	FA("https://w3id.org/idsa/code/FA", Arrays.asList(new TypedLiteral("Persian (Farsi)", "en")), Collections.emptyList()),

	/** 
	* "Fula, Fulah, Pulaar, Pular"@en
	*/
	FF("https://w3id.org/idsa/code/FF", Arrays.asList(new TypedLiteral("Fula, Fulah, Pulaar, Pular", "en")), Collections.emptyList()),

	/** 
	* "Finnish"@en
	*/
	FI("https://w3id.org/idsa/code/FI", Arrays.asList(new TypedLiteral("Finnish", "en")), Collections.emptyList()),

	/** 
	* "Fijian"@en
	*/
	FJ("https://w3id.org/idsa/code/FJ", Arrays.asList(new TypedLiteral("Fijian", "en")), Collections.emptyList()),

	/** 
	* "Faroese"@en
	*/
	FO("https://w3id.org/idsa/code/FO", Arrays.asList(new TypedLiteral("Faroese", "en")), Collections.emptyList()),

	/** 
	* "French"@en
	*/
	FR("https://w3id.org/idsa/code/FR", Arrays.asList(new TypedLiteral("French", "en")), Collections.emptyList()),

	/** 
	* "Western Frisian"@en
	*/
	FY("https://w3id.org/idsa/code/FY", Arrays.asList(new TypedLiteral("Western Frisian", "en")), Collections.emptyList()),

	/** 
	* "Irish"@en
	*/
	GA("https://w3id.org/idsa/code/GA", Arrays.asList(new TypedLiteral("Irish", "en")), Collections.emptyList()),

	/** 
	* "Scottish Gaelic, Gaelic"@en
	*/
	GD("https://w3id.org/idsa/code/GD", Arrays.asList(new TypedLiteral("Scottish Gaelic, Gaelic", "en")), Collections.emptyList()),

	/** 
	* "Galician"@en
	*/
	GL("https://w3id.org/idsa/code/GL", Arrays.asList(new TypedLiteral("Galician", "en")), Collections.emptyList()),

	/** 
	* "Guaraní"@en
	*/
	GN("https://w3id.org/idsa/code/GN", Arrays.asList(new TypedLiteral("Guaraní", "en")), Collections.emptyList()),

	/** 
	* "Gujarati"@en
	*/
	GU("https://w3id.org/idsa/code/GU", Arrays.asList(new TypedLiteral("Gujarati", "en")), Collections.emptyList()),

	/** 
	* "Manx"@en
	*/
	GV("https://w3id.org/idsa/code/GV", Arrays.asList(new TypedLiteral("Manx", "en")), Collections.emptyList()),

	/** 
	* "Hausa"@en
	*/
	HA("https://w3id.org/idsa/code/HA", Arrays.asList(new TypedLiteral("Hausa", "en")), Collections.emptyList()),

	/** 
	* "Hebrew (modern)"@en
	*/
	HE("https://w3id.org/idsa/code/HE", Arrays.asList(new TypedLiteral("Hebrew (modern)", "en")), Collections.emptyList()),

	/** 
	* "Hindi"@en
	*/
	HI("https://w3id.org/idsa/code/HI", Arrays.asList(new TypedLiteral("Hindi", "en")), Collections.emptyList()),

	/** 
	* "Hiri Motu"@en
	*/
	HO("https://w3id.org/idsa/code/HO", Arrays.asList(new TypedLiteral("Hiri Motu", "en")), Collections.emptyList()),

	/** 
	* "Croatian"@en
	*/
	HR("https://w3id.org/idsa/code/HR", Arrays.asList(new TypedLiteral("Croatian", "en")), Collections.emptyList()),

	/** 
	* "Haitian, Haitian Creole"@en
	*/
	HT("https://w3id.org/idsa/code/HT", Arrays.asList(new TypedLiteral("Haitian, Haitian Creole", "en")), Collections.emptyList()),

	/** 
	* "Hungarian"@en
	*/
	HU("https://w3id.org/idsa/code/HU", Arrays.asList(new TypedLiteral("Hungarian", "en")), Collections.emptyList()),

	/** 
	* "Armenian"@en
	*/
	HY("https://w3id.org/idsa/code/HY", Arrays.asList(new TypedLiteral("Armenian", "en")), Collections.emptyList()),

	/** 
	* "Herero"@en
	*/
	HZ("https://w3id.org/idsa/code/HZ", Arrays.asList(new TypedLiteral("Herero", "en")), Collections.emptyList()),

	/** 
	* "Interlingua"@en
	*/
	IA("https://w3id.org/idsa/code/IA", Arrays.asList(new TypedLiteral("Interlingua", "en")), Collections.emptyList()),

	/** 
	* "Indonesian"@en
	*/
	ID("https://w3id.org/idsa/code/ID", Arrays.asList(new TypedLiteral("Indonesian", "en")), Collections.emptyList()),

	/** 
	* "Interlingue"@en
	*/
	IE("https://w3id.org/idsa/code/IE", Arrays.asList(new TypedLiteral("Interlingue", "en")), Collections.emptyList()),

	/** 
	* "Igbo"@en
	*/
	IG("https://w3id.org/idsa/code/IG", Arrays.asList(new TypedLiteral("Igbo", "en")), Collections.emptyList()),

	/** 
	* "Nuosu"@en
	*/
	II("https://w3id.org/idsa/code/II", Arrays.asList(new TypedLiteral("Nuosu", "en")), Collections.emptyList()),

	/** 
	* "Inupiaq"@en
	*/
	IK("https://w3id.org/idsa/code/IK", Arrays.asList(new TypedLiteral("Inupiaq", "en")), Collections.emptyList()),

	/** 
	* "Ido"@en
	*/
	IO("https://w3id.org/idsa/code/IO", Arrays.asList(new TypedLiteral("Ido", "en")), Collections.emptyList()),

	/** 
	* "Icelandic"@en
	*/
	IS("https://w3id.org/idsa/code/IS", Arrays.asList(new TypedLiteral("Icelandic", "en")), Collections.emptyList()),

	/** 
	* "Italian"@en
	*/
	IT("https://w3id.org/idsa/code/IT", Arrays.asList(new TypedLiteral("Italian", "en")), Collections.emptyList()),

	/** 
	* "Inuktitut"@en
	*/
	IU("https://w3id.org/idsa/code/IU", Arrays.asList(new TypedLiteral("Inuktitut", "en")), Collections.emptyList()),

	/** 
	* "Japanese"@en
	*/
	JA("https://w3id.org/idsa/code/JA", Arrays.asList(new TypedLiteral("Japanese", "en")), Collections.emptyList()),

	/** 
	* "Javanese"@en
	*/
	JV("https://w3id.org/idsa/code/JV", Arrays.asList(new TypedLiteral("Javanese", "en")), Collections.emptyList()),

	/** 
	* "Georgian"@en
	*/
	KA("https://w3id.org/idsa/code/KA", Arrays.asList(new TypedLiteral("Georgian", "en")), Collections.emptyList()),

	/** 
	* "Kongo"@en
	*/
	KG("https://w3id.org/idsa/code/KG", Arrays.asList(new TypedLiteral("Kongo", "en")), Collections.emptyList()),

	/** 
	* "Kikuyu, Gikuyu"@en
	*/
	KI("https://w3id.org/idsa/code/KI", Arrays.asList(new TypedLiteral("Kikuyu, Gikuyu", "en")), Collections.emptyList()),

	/** 
	* "Kwanyama, Kuanyama"@en
	*/
	KJ("https://w3id.org/idsa/code/KJ", Arrays.asList(new TypedLiteral("Kwanyama, Kuanyama", "en")), Collections.emptyList()),

	/** 
	* "Kazakh"@en
	*/
	KK("https://w3id.org/idsa/code/KK", Arrays.asList(new TypedLiteral("Kazakh", "en")), Collections.emptyList()),

	/** 
	* "Kalaallisut, Greenlandic"@en
	*/
	KL("https://w3id.org/idsa/code/KL", Arrays.asList(new TypedLiteral("Kalaallisut, Greenlandic", "en")), Collections.emptyList()),

	/** 
	* "Khmer"@en
	*/
	KM("https://w3id.org/idsa/code/KM", Arrays.asList(new TypedLiteral("Khmer", "en")), Collections.emptyList()),

	/** 
	* "Kannada"@en
	*/
	KN("https://w3id.org/idsa/code/KN", Arrays.asList(new TypedLiteral("Kannada", "en")), Collections.emptyList()),

	/** 
	* "Korean"@en
	*/
	KO("https://w3id.org/idsa/code/KO", Arrays.asList(new TypedLiteral("Korean", "en")), Collections.emptyList()),

	/** 
	* "Kanuri"@en
	*/
	KR("https://w3id.org/idsa/code/KR", Arrays.asList(new TypedLiteral("Kanuri", "en")), Collections.emptyList()),

	/** 
	* "Kashmiri"@en
	*/
	KS("https://w3id.org/idsa/code/KS", Arrays.asList(new TypedLiteral("Kashmiri", "en")), Collections.emptyList()),

	/** 
	* "Kurdish"@en
	*/
	KU("https://w3id.org/idsa/code/KU", Arrays.asList(new TypedLiteral("Kurdish", "en")), Collections.emptyList()),

	/** 
	* "Komi"@en
	*/
	KV("https://w3id.org/idsa/code/KV", Arrays.asList(new TypedLiteral("Komi", "en")), Collections.emptyList()),

	/** 
	* "Cornish"@en
	*/
	KW("https://w3id.org/idsa/code/KW", Arrays.asList(new TypedLiteral("Cornish", "en")), Collections.emptyList()),

	/** 
	* "Kyrgyz"@en
	*/
	KY("https://w3id.org/idsa/code/KY", Arrays.asList(new TypedLiteral("Kyrgyz", "en")), Collections.emptyList()),

	/** 
	* "Latin"@en
	*/
	LA("https://w3id.org/idsa/code/LA", Arrays.asList(new TypedLiteral("Latin", "en")), Collections.emptyList()),

	/** 
	* "Luxembourgish, Letzeburgesch"@en
	*/
	LB("https://w3id.org/idsa/code/LB", Arrays.asList(new TypedLiteral("Luxembourgish, Letzeburgesch", "en")), Collections.emptyList()),

	/** 
	* "Ganda"@en
	*/
	LG("https://w3id.org/idsa/code/LG", Arrays.asList(new TypedLiteral("Ganda", "en")), Collections.emptyList()),

	/** 
	* "Limburgish, Limburgan, Limburger"@en
	*/
	LI("https://w3id.org/idsa/code/LI", Arrays.asList(new TypedLiteral("Limburgish, Limburgan, Limburger", "en")), Collections.emptyList()),

	/** 
	* "Lingala"@en
	*/
	LN("https://w3id.org/idsa/code/LN", Arrays.asList(new TypedLiteral("Lingala", "en")), Collections.emptyList()),

	/** 
	* "Lao"@en
	*/
	LO("https://w3id.org/idsa/code/LO", Arrays.asList(new TypedLiteral("Lao", "en")), Collections.emptyList()),

	/** 
	* "less than"@en
	* "Lithuanian"@en
	* "Less-than operator. Can be used for numeric (2 idsc:LT 5) comparisons."@en
	* "Do not confuse with idsc:LT (which is a language)."@en
	*/
	LT("https://w3id.org/idsa/code/LT", Arrays.asList(new TypedLiteral("less than", "en"), new TypedLiteral("Lithuanian", "en")), Arrays.asList(new TypedLiteral("Less-than operator. Can be used for numeric (2 idsc:LT 5) comparisons.", "en"))),

	/** 
	* "Luba-Katanga"@en
	*/
	LU("https://w3id.org/idsa/code/LU", Arrays.asList(new TypedLiteral("Luba-Katanga", "en")), Collections.emptyList()),

	/** 
	* "Latvian"@en
	*/
	LV("https://w3id.org/idsa/code/LV", Arrays.asList(new TypedLiteral("Latvian", "en")), Collections.emptyList()),

	/** 
	* "Malagasy"@en
	*/
	MG("https://w3id.org/idsa/code/MG", Arrays.asList(new TypedLiteral("Malagasy", "en")), Collections.emptyList()),

	/** 
	* "Marshallese"@en
	*/
	MH("https://w3id.org/idsa/code/MH", Arrays.asList(new TypedLiteral("Marshallese", "en")), Collections.emptyList()),

	/** 
	* "Māori"@en
	*/
	MI("https://w3id.org/idsa/code/MI", Arrays.asList(new TypedLiteral("Māori", "en")), Collections.emptyList()),

	/** 
	* "Macedonian"@en
	*/
	MK("https://w3id.org/idsa/code/MK", Arrays.asList(new TypedLiteral("Macedonian", "en")), Collections.emptyList()),

	/** 
	* "Malayalam"@en
	*/
	ML("https://w3id.org/idsa/code/ML", Arrays.asList(new TypedLiteral("Malayalam", "en")), Collections.emptyList()),

	/** 
	* "Mongolian"@en
	*/
	MN("https://w3id.org/idsa/code/MN", Arrays.asList(new TypedLiteral("Mongolian", "en")), Collections.emptyList()),

	/** 
	* "Marathi (Marāṭhī)"@en
	*/
	MR("https://w3id.org/idsa/code/MR", Arrays.asList(new TypedLiteral("Marathi (Marāṭhī)", "en")), Collections.emptyList()),

	/** 
	* "Malay"@en
	*/
	MS("https://w3id.org/idsa/code/MS", Arrays.asList(new TypedLiteral("Malay", "en")), Collections.emptyList()),

	/** 
	* "Maltese"@en
	*/
	MT("https://w3id.org/idsa/code/MT", Arrays.asList(new TypedLiteral("Maltese", "en")), Collections.emptyList()),

	/** 
	* "Multilingual"@en
	* "Code indicates that several languages are used or no concrete language can be determined."
	*/
	MULTI_LINGUAL("https://w3id.org/idsa/code/MULTI_LINGUAL", Arrays.asList(new TypedLiteral("Multilingual", "en")), Arrays.asList(new TypedLiteral("Code indicates that several languages are used or no concrete language can be determined.", ""))),

	/** 
	* "Burmese"@en
	*/
	MY("https://w3id.org/idsa/code/MY", Arrays.asList(new TypedLiteral("Burmese", "en")), Collections.emptyList()),

	/** 
	* "Nauruan"@en
	*/
	NA("https://w3id.org/idsa/code/NA", Arrays.asList(new TypedLiteral("Nauruan", "en")), Collections.emptyList()),

	/** 
	* "Norwegian Bokmål"@en
	*/
	NB("https://w3id.org/idsa/code/NB", Arrays.asList(new TypedLiteral("Norwegian Bokmål", "en")), Collections.emptyList()),

	/** 
	* "Northern Ndebele"@en
	*/
	ND("https://w3id.org/idsa/code/ND", Arrays.asList(new TypedLiteral("Northern Ndebele", "en")), Collections.emptyList()),

	/** 
	* "Nepali"@en
	*/
	NE("https://w3id.org/idsa/code/NE", Arrays.asList(new TypedLiteral("Nepali", "en")), Collections.emptyList()),

	/** 
	* "Ndonga"@en
	*/
	NG("https://w3id.org/idsa/code/NG", Arrays.asList(new TypedLiteral("Ndonga", "en")), Collections.emptyList()),

	/** 
	* "Dutch"@en
	*/
	NL("https://w3id.org/idsa/code/NL", Arrays.asList(new TypedLiteral("Dutch", "en")), Collections.emptyList()),

	/** 
	* "Norwegian Nynorsk"@en
	*/
	NN("https://w3id.org/idsa/code/NN", Arrays.asList(new TypedLiteral("Norwegian Nynorsk", "en")), Collections.emptyList()),

	/** 
	* "Norwegian"@en
	*/
	NO("https://w3id.org/idsa/code/NO", Arrays.asList(new TypedLiteral("Norwegian", "en")), Collections.emptyList()),

	/** 
	* "Southern Ndebele"@en
	*/
	NR("https://w3id.org/idsa/code/NR", Arrays.asList(new TypedLiteral("Southern Ndebele", "en")), Collections.emptyList()),

	/** 
	* "Navajo, Navaho"@en
	*/
	NV("https://w3id.org/idsa/code/NV", Arrays.asList(new TypedLiteral("Navajo, Navaho", "en")), Collections.emptyList()),

	/** 
	* "Chichewa, Chewa, Nyanja"@en
	*/
	NY("https://w3id.org/idsa/code/NY", Arrays.asList(new TypedLiteral("Chichewa, Chewa, Nyanja", "en")), Collections.emptyList()),

	/** 
	* "Occitan"@en
	*/
	OC("https://w3id.org/idsa/code/OC", Arrays.asList(new TypedLiteral("Occitan", "en")), Collections.emptyList()),

	/** 
	* "Ojibwe, Ojibwa"@en
	*/
	OJ("https://w3id.org/idsa/code/OJ", Arrays.asList(new TypedLiteral("Ojibwe, Ojibwa", "en")), Collections.emptyList()),

	/** 
	* "Oromo"@en
	*/
	OM("https://w3id.org/idsa/code/OM", Arrays.asList(new TypedLiteral("Oromo", "en")), Collections.emptyList()),

	/** 
	* "Oriya"@en
	*/
	OR("https://w3id.org/idsa/code/OR", Arrays.asList(new TypedLiteral("Oriya", "en")), Collections.emptyList()),

	/** 
	* "Ossetian, Ossetic"@en
	*/
	OS("https://w3id.org/idsa/code/OS", Arrays.asList(new TypedLiteral("Ossetian, Ossetic", "en")), Collections.emptyList()),

	/** 
	* "(Eastern) Punjabi"@en
	*/
	PA("https://w3id.org/idsa/code/PA", Arrays.asList(new TypedLiteral("(Eastern) Punjabi", "en")), Collections.emptyList()),

	/** 
	* "Pāli"@en
	*/
	PI("https://w3id.org/idsa/code/PI", Arrays.asList(new TypedLiteral("Pāli", "en")), Collections.emptyList()),

	/** 
	* "Polish"@en
	*/
	PL("https://w3id.org/idsa/code/PL", Arrays.asList(new TypedLiteral("Polish", "en")), Collections.emptyList()),

	/** 
	* "Pashto, Pushto"@en
	*/
	PS("https://w3id.org/idsa/code/PS", Arrays.asList(new TypedLiteral("Pashto, Pushto", "en")), Collections.emptyList()),

	/** 
	* "Portuguese"@en
	*/
	PT("https://w3id.org/idsa/code/PT", Arrays.asList(new TypedLiteral("Portuguese", "en")), Collections.emptyList()),

	/** 
	* "Quechua"@en
	*/
	QU("https://w3id.org/idsa/code/QU", Arrays.asList(new TypedLiteral("Quechua", "en")), Collections.emptyList()),

	/** 
	* "Romansh"@en
	*/
	RM("https://w3id.org/idsa/code/RM", Arrays.asList(new TypedLiteral("Romansh", "en")), Collections.emptyList()),

	/** 
	* "Kirundi"@en
	*/
	RN("https://w3id.org/idsa/code/RN", Arrays.asList(new TypedLiteral("Kirundi", "en")), Collections.emptyList()),

	/** 
	* "Romanian"@en
	*/
	RO("https://w3id.org/idsa/code/RO", Arrays.asList(new TypedLiteral("Romanian", "en")), Collections.emptyList()),

	/** 
	* "Russian"@en
	*/
	RU("https://w3id.org/idsa/code/RU", Arrays.asList(new TypedLiteral("Russian", "en")), Collections.emptyList()),

	/** 
	* "Kinyarwanda"@en
	*/
	RW("https://w3id.org/idsa/code/RW", Arrays.asList(new TypedLiteral("Kinyarwanda", "en")), Collections.emptyList()),

	/** 
	* "Sanskrit (Saṁskṛta)"@en
	*/
	SA("https://w3id.org/idsa/code/SA", Arrays.asList(new TypedLiteral("Sanskrit (Saṁskṛta)", "en")), Collections.emptyList()),

	/** 
	* "Sardinian"@en
	*/
	SC("https://w3id.org/idsa/code/SC", Arrays.asList(new TypedLiteral("Sardinian", "en")), Collections.emptyList()),

	/** 
	* "Sindhi"@en
	*/
	SD("https://w3id.org/idsa/code/SD", Arrays.asList(new TypedLiteral("Sindhi", "en")), Collections.emptyList()),

	/** 
	* "Northern Sami"@en
	*/
	SE("https://w3id.org/idsa/code/SE", Arrays.asList(new TypedLiteral("Northern Sami", "en")), Collections.emptyList()),

	/** 
	* "Sango"@en
	*/
	SG("https://w3id.org/idsa/code/SG", Arrays.asList(new TypedLiteral("Sango", "en")), Collections.emptyList()),

	/** 
	* "Sinhalese, Sinhala"@en
	*/
	SI("https://w3id.org/idsa/code/SI", Arrays.asList(new TypedLiteral("Sinhalese, Sinhala", "en")), Collections.emptyList()),

	/** 
	* "Slovak"@en
	*/
	SK("https://w3id.org/idsa/code/SK", Arrays.asList(new TypedLiteral("Slovak", "en")), Collections.emptyList()),

	/** 
	* "Slovene"@en
	*/
	SL("https://w3id.org/idsa/code/SL", Arrays.asList(new TypedLiteral("Slovene", "en")), Collections.emptyList()),

	/** 
	* "Samoan"@en
	*/
	SM("https://w3id.org/idsa/code/SM", Arrays.asList(new TypedLiteral("Samoan", "en")), Collections.emptyList()),

	/** 
	* "Shona"@en
	*/
	SN("https://w3id.org/idsa/code/SN", Arrays.asList(new TypedLiteral("Shona", "en")), Collections.emptyList()),

	/** 
	* "Somali"@en
	*/
	SO("https://w3id.org/idsa/code/SO", Arrays.asList(new TypedLiteral("Somali", "en")), Collections.emptyList()),

	/** 
	* "Albanian"@en
	*/
	SQ("https://w3id.org/idsa/code/SQ", Arrays.asList(new TypedLiteral("Albanian", "en")), Collections.emptyList()),

	/** 
	* "Serbian"@en
	*/
	SR("https://w3id.org/idsa/code/SR", Arrays.asList(new TypedLiteral("Serbian", "en")), Collections.emptyList()),

	/** 
	* "Swati"@en
	*/
	SS("https://w3id.org/idsa/code/SS", Arrays.asList(new TypedLiteral("Swati", "en")), Collections.emptyList()),

	/** 
	* "Southern Sotho"@en
	*/
	ST("https://w3id.org/idsa/code/ST", Arrays.asList(new TypedLiteral("Southern Sotho", "en")), Collections.emptyList()),

	/** 
	* "Sundanese"@en
	*/
	SU("https://w3id.org/idsa/code/SU", Arrays.asList(new TypedLiteral("Sundanese", "en")), Collections.emptyList()),

	/** 
	* "Swedish"@en
	*/
	SV("https://w3id.org/idsa/code/SV", Arrays.asList(new TypedLiteral("Swedish", "en")), Collections.emptyList()),

	/** 
	* "Swahili"@en
	*/
	SW("https://w3id.org/idsa/code/SW", Arrays.asList(new TypedLiteral("Swahili", "en")), Collections.emptyList()),

	/** 
	* "Tamil"@en
	*/
	TA("https://w3id.org/idsa/code/TA", Arrays.asList(new TypedLiteral("Tamil", "en")), Collections.emptyList()),

	/** 
	* "Telugu"@en
	*/
	TE("https://w3id.org/idsa/code/TE", Arrays.asList(new TypedLiteral("Telugu", "en")), Collections.emptyList()),

	/** 
	* "Tajik"@en
	*/
	TG("https://w3id.org/idsa/code/TG", Arrays.asList(new TypedLiteral("Tajik", "en")), Collections.emptyList()),

	/** 
	* "Thai"@en
	*/
	TH("https://w3id.org/idsa/code/TH", Arrays.asList(new TypedLiteral("Thai", "en")), Collections.emptyList()),

	/** 
	* "Tigrinya"@en
	*/
	TI("https://w3id.org/idsa/code/TI", Arrays.asList(new TypedLiteral("Tigrinya", "en")), Collections.emptyList()),

	/** 
	* "Turkmen"@en
	*/
	TK("https://w3id.org/idsa/code/TK", Arrays.asList(new TypedLiteral("Turkmen", "en")), Collections.emptyList()),

	/** 
	* "Tagalog"@en
	*/
	TL("https://w3id.org/idsa/code/TL", Arrays.asList(new TypedLiteral("Tagalog", "en")), Collections.emptyList()),

	/** 
	* "Tswana"@en
	*/
	TN("https://w3id.org/idsa/code/TN", Arrays.asList(new TypedLiteral("Tswana", "en")), Collections.emptyList()),

	/** 
	* "Tonga (Tonga Islands)"@en
	*/
	TO("https://w3id.org/idsa/code/TO", Arrays.asList(new TypedLiteral("Tonga (Tonga Islands)", "en")), Collections.emptyList()),

	/** 
	* "Turkish"@en
	*/
	TR("https://w3id.org/idsa/code/TR", Arrays.asList(new TypedLiteral("Turkish", "en")), Collections.emptyList()),

	/** 
	* "Tsonga"@en
	*/
	TS("https://w3id.org/idsa/code/TS", Arrays.asList(new TypedLiteral("Tsonga", "en")), Collections.emptyList()),

	/** 
	* "Tatar"@en
	*/
	TT("https://w3id.org/idsa/code/TT", Arrays.asList(new TypedLiteral("Tatar", "en")), Collections.emptyList()),

	/** 
	* "Twi"@en
	*/
	TW("https://w3id.org/idsa/code/TW", Arrays.asList(new TypedLiteral("Twi", "en")), Collections.emptyList()),

	/** 
	* "Tahitian"@en
	*/
	TY("https://w3id.org/idsa/code/TY", Arrays.asList(new TypedLiteral("Tahitian", "en")), Collections.emptyList()),

	/** 
	* "Uyghur"@en
	*/
	UG("https://w3id.org/idsa/code/UG", Arrays.asList(new TypedLiteral("Uyghur", "en")), Collections.emptyList()),

	/** 
	* "Ukrainian"@en
	*/
	UK("https://w3id.org/idsa/code/UK", Arrays.asList(new TypedLiteral("Ukrainian", "en")), Collections.emptyList()),

	/** 
	* "Urdu"@en
	*/
	UR("https://w3id.org/idsa/code/UR", Arrays.asList(new TypedLiteral("Urdu", "en")), Collections.emptyList()),

	/** 
	* "Uzbek"@en
	*/
	UZ("https://w3id.org/idsa/code/UZ", Arrays.asList(new TypedLiteral("Uzbek", "en")), Collections.emptyList()),

	/** 
	* "Venda"@en
	*/
	VE("https://w3id.org/idsa/code/VE", Arrays.asList(new TypedLiteral("Venda", "en")), Collections.emptyList()),

	/** 
	* "Vietnamese"@en
	*/
	VI("https://w3id.org/idsa/code/VI", Arrays.asList(new TypedLiteral("Vietnamese", "en")), Collections.emptyList()),

	/** 
	* "Volapük"@en
	*/
	VO("https://w3id.org/idsa/code/VO", Arrays.asList(new TypedLiteral("Volapük", "en")), Collections.emptyList()),

	/** 
	* "Walloon"@en
	*/
	WA("https://w3id.org/idsa/code/WA", Arrays.asList(new TypedLiteral("Walloon", "en")), Collections.emptyList()),

	/** 
	* "Wolof"@en
	*/
	WO("https://w3id.org/idsa/code/WO", Arrays.asList(new TypedLiteral("Wolof", "en")), Collections.emptyList()),

	/** 
	* "Xhosa"@en
	*/
	XH("https://w3id.org/idsa/code/XH", Arrays.asList(new TypedLiteral("Xhosa", "en")), Collections.emptyList()),

	/** 
	* "Yiddish"@en
	*/
	YI("https://w3id.org/idsa/code/YI", Arrays.asList(new TypedLiteral("Yiddish", "en")), Collections.emptyList()),

	/** 
	* "Yoruba"@en
	*/
	YO("https://w3id.org/idsa/code/YO", Arrays.asList(new TypedLiteral("Yoruba", "en")), Collections.emptyList()),

	/** 
	* "Zhuang, Chuang"@en
	*/
	ZA("https://w3id.org/idsa/code/ZA", Arrays.asList(new TypedLiteral("Zhuang, Chuang", "en")), Collections.emptyList()),

	/** 
	* "Chinese"@en
	*/
	ZH("https://w3id.org/idsa/code/ZH", Arrays.asList(new TypedLiteral("Chinese", "en")), Collections.emptyList()),

	/** 
	* "Zulu"@en
	*/
	ZU("https://w3id.org/idsa/code/ZU", Arrays.asList(new TypedLiteral("Zulu", "en")), Collections.emptyList());

	private static final Map<String,Language> uriInstanceMapping;
	static {
		uriInstanceMapping = new HashMap<>();
		uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
		uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
	}

	private URI id;
	private List<TypedLiteral> label;
	private List<TypedLiteral> comment;


	Language(String id, List<TypedLiteral> label, List<TypedLiteral> comment) {
		try {
			this.id = new URI(id);
			this.label = label;
			this.comment = comment;
		}
		catch (java.net.URISyntaxException e) {
			throw new IllegalArgumentException(e);
		}
	}
	//TODO dummy method for generic properties, should be deleted in future versions
	public Map<String,Object> getProperties() {
		return null ;
	}
	public void setProperty(String property, Object value) {
		//do nothing
	}
	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/

	@JsonIgnore
	final public URI getId() {
		return id;
	}

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	@JsonIgnore
	final public List<TypedLiteral> getLabel() {
		return label;
	}

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	@JsonIgnore
	final public List<TypedLiteral> getComment() {
		return comment;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	@JsonProperty("@id")
	final public URI getSerializedId() {
		return id;
	}
	

	@JsonCreator
	public static Language deserialize(JsonNode node) {
		return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
	}

	@Override
	public String toString() {
		return id.toString();
	}

}
