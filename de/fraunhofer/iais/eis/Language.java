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
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

	/** 
	"Language"@en

	"The class of languages potentially being used by textual Data Assets."@en */

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:Language")
public enum Language {
	/** 
	"less than"@en

	"Lithuanian"@en

	"Less-than operator. Can be used for numeric (2 idsc:LT 5) comparisons."@en */
	LT("https://w3id.org/idsa/code/LT", Arrays.asList(new TypedLiteral("less than", "en"),
new TypedLiteral("Lithuanian", "en")), Arrays.asList(new TypedLiteral("Less-than operator. Can be used for numeric (2 idsc:LT 5) comparisons.", "en"))),
	/** 
	"Multilingual"@en

	"Code indicates that several languages are used or no concrete language can be determined." */
	MULTI_LINGUAL("https://w3id.org/idsa/code/MULTI_LINGUAL", Arrays.asList(new TypedLiteral("Multilingual", "en")), Arrays.asList(new TypedLiteral("Code indicates that several languages are used or no concrete language can be determined.", ""))),
	/** 
	"Abkhaz"@en */
	AB("https://w3id.org/idsa/code/AB", Arrays.asList(new TypedLiteral("Abkhaz", "en")), java.util.Collections.emptyList()),
	/** 
	"Afar"@en */
	AA("https://w3id.org/idsa/code/AA", Arrays.asList(new TypedLiteral("Afar", "en")), java.util.Collections.emptyList()),
	/** 
	"Afrikaans"@en */
	AF("https://w3id.org/idsa/code/AF", Arrays.asList(new TypedLiteral("Afrikaans", "en")), java.util.Collections.emptyList()),
	/** 
	"Akan"@en */
	AK("https://w3id.org/idsa/code/AK", Arrays.asList(new TypedLiteral("Akan", "en")), java.util.Collections.emptyList()),
	/** 
	"Albanian"@en */
	SQ("https://w3id.org/idsa/code/SQ", Arrays.asList(new TypedLiteral("Albanian", "en")), java.util.Collections.emptyList()),
	/** 
	"Amharic"@en */
	AM("https://w3id.org/idsa/code/AM", Arrays.asList(new TypedLiteral("Amharic", "en")), java.util.Collections.emptyList()),
	/** 
	"Arabic"@en */
	AR("https://w3id.org/idsa/code/AR", Arrays.asList(new TypedLiteral("Arabic", "en")), java.util.Collections.emptyList()),
	/** 
	"Aragonese"@en */
	AN("https://w3id.org/idsa/code/AN", Arrays.asList(new TypedLiteral("Aragonese", "en")), java.util.Collections.emptyList()),
	/** 
	"Armenian"@en */
	HY("https://w3id.org/idsa/code/HY", Arrays.asList(new TypedLiteral("Armenian", "en")), java.util.Collections.emptyList()),
	/** 
	"Assamese"@en */
	AS("https://w3id.org/idsa/code/AS", Arrays.asList(new TypedLiteral("Assamese", "en")), java.util.Collections.emptyList()),
	/** 
	"Avaric"@en */
	AV("https://w3id.org/idsa/code/AV", Arrays.asList(new TypedLiteral("Avaric", "en")), java.util.Collections.emptyList()),
	/** 
	"Avestan"@en */
	AE("https://w3id.org/idsa/code/AE", Arrays.asList(new TypedLiteral("Avestan", "en")), java.util.Collections.emptyList()),
	/** 
	"Aymara"@en */
	AY("https://w3id.org/idsa/code/AY", Arrays.asList(new TypedLiteral("Aymara", "en")), java.util.Collections.emptyList()),
	/** 
	"Azerbaijani"@en */
	AZ("https://w3id.org/idsa/code/AZ", Arrays.asList(new TypedLiteral("Azerbaijani", "en")), java.util.Collections.emptyList()),
	/** 
	"Bambara"@en */
	BM("https://w3id.org/idsa/code/BM", Arrays.asList(new TypedLiteral("Bambara", "en")), java.util.Collections.emptyList()),
	/** 
	"Bashkir"@en */
	BA("https://w3id.org/idsa/code/BA", Arrays.asList(new TypedLiteral("Bashkir", "en")), java.util.Collections.emptyList()),
	/** 
	"Basque"@en */
	EU("https://w3id.org/idsa/code/EU", Arrays.asList(new TypedLiteral("Basque", "en")), java.util.Collections.emptyList()),
	/** 
	"Belarusian"@en */
	BE("https://w3id.org/idsa/code/BE", Arrays.asList(new TypedLiteral("Belarusian", "en")), java.util.Collections.emptyList()),
	/** 
	"Bengali, Bangla"@en */
	BN("https://w3id.org/idsa/code/BN", Arrays.asList(new TypedLiteral("Bengali, Bangla", "en")), java.util.Collections.emptyList()),
	/** 
	"Bihari"@en */
	BH("https://w3id.org/idsa/code/BH", Arrays.asList(new TypedLiteral("Bihari", "en")), java.util.Collections.emptyList()),
	/** 
	"Bislama"@en */
	BI("https://w3id.org/idsa/code/BI", Arrays.asList(new TypedLiteral("Bislama", "en")), java.util.Collections.emptyList()),
	/** 
	"Bosnian"@en */
	BS("https://w3id.org/idsa/code/BS", Arrays.asList(new TypedLiteral("Bosnian", "en")), java.util.Collections.emptyList()),
	/** 
	"Breton"@en */
	BR("https://w3id.org/idsa/code/BR", Arrays.asList(new TypedLiteral("Breton", "en")), java.util.Collections.emptyList()),
	/** 
	"Bulgarian"@en */
	BG("https://w3id.org/idsa/code/BG", Arrays.asList(new TypedLiteral("Bulgarian", "en")), java.util.Collections.emptyList()),
	/** 
	"Burmese"@en */
	MY("https://w3id.org/idsa/code/MY", Arrays.asList(new TypedLiteral("Burmese", "en")), java.util.Collections.emptyList()),
	/** 
	"Catalan"@en */
	CA("https://w3id.org/idsa/code/CA", Arrays.asList(new TypedLiteral("Catalan", "en")), java.util.Collections.emptyList()),
	/** 
	"Chamorro"@en */
	CH("https://w3id.org/idsa/code/CH", Arrays.asList(new TypedLiteral("Chamorro", "en")), java.util.Collections.emptyList()),
	/** 
	"Chechen"@en */
	CE("https://w3id.org/idsa/code/CE", Arrays.asList(new TypedLiteral("Chechen", "en")), java.util.Collections.emptyList()),
	/** 
	"Chichewa, Chewa, Nyanja"@en */
	NY("https://w3id.org/idsa/code/NY", Arrays.asList(new TypedLiteral("Chichewa, Chewa, Nyanja", "en")), java.util.Collections.emptyList()),
	/** 
	"Chinese"@en */
	ZH("https://w3id.org/idsa/code/ZH", Arrays.asList(new TypedLiteral("Chinese", "en")), java.util.Collections.emptyList()),
	/** 
	"Chuvash"@en */
	CV("https://w3id.org/idsa/code/CV", Arrays.asList(new TypedLiteral("Chuvash", "en")), java.util.Collections.emptyList()),
	/** 
	"Cornish"@en */
	KW("https://w3id.org/idsa/code/KW", Arrays.asList(new TypedLiteral("Cornish", "en")), java.util.Collections.emptyList()),
	/** 
	"Corsican"@en */
	CO("https://w3id.org/idsa/code/CO", Arrays.asList(new TypedLiteral("Corsican", "en")), java.util.Collections.emptyList()),
	/** 
	"Cree"@en */
	CR("https://w3id.org/idsa/code/CR", Arrays.asList(new TypedLiteral("Cree", "en")), java.util.Collections.emptyList()),
	/** 
	"Croatian"@en */
	HR("https://w3id.org/idsa/code/HR", Arrays.asList(new TypedLiteral("Croatian", "en")), java.util.Collections.emptyList()),
	/** 
	"Czech"@en */
	CS("https://w3id.org/idsa/code/CS", Arrays.asList(new TypedLiteral("Czech", "en")), java.util.Collections.emptyList()),
	/** 
	"Danish"@en */
	DA("https://w3id.org/idsa/code/DA", Arrays.asList(new TypedLiteral("Danish", "en")), java.util.Collections.emptyList()),
	/** 
	"Divehi, Dhivehi, Maldivian"@en */
	DV("https://w3id.org/idsa/code/DV", Arrays.asList(new TypedLiteral("Divehi, Dhivehi, Maldivian", "en")), java.util.Collections.emptyList()),
	/** 
	"Dutch"@en */
	NL("https://w3id.org/idsa/code/NL", Arrays.asList(new TypedLiteral("Dutch", "en")), java.util.Collections.emptyList()),
	/** 
	"Dzongkha"@en */
	DZ("https://w3id.org/idsa/code/DZ", Arrays.asList(new TypedLiteral("Dzongkha", "en")), java.util.Collections.emptyList()),
	/** 
	"English"@en */
	EN("https://w3id.org/idsa/code/EN", Arrays.asList(new TypedLiteral("English", "en")), java.util.Collections.emptyList()),
	/** 
	"Esperanto"@en */
	EO("https://w3id.org/idsa/code/EO", Arrays.asList(new TypedLiteral("Esperanto", "en")), java.util.Collections.emptyList()),
	/** 
	"Estonian"@en */
	ET("https://w3id.org/idsa/code/ET", Arrays.asList(new TypedLiteral("Estonian", "en")), java.util.Collections.emptyList()),
	/** 
	"Ewe"@en */
	EE("https://w3id.org/idsa/code/EE", Arrays.asList(new TypedLiteral("Ewe", "en")), java.util.Collections.emptyList()),
	/** 
	"Faroese"@en */
	FO("https://w3id.org/idsa/code/FO", Arrays.asList(new TypedLiteral("Faroese", "en")), java.util.Collections.emptyList()),
	/** 
	"Fijian"@en */
	FJ("https://w3id.org/idsa/code/FJ", Arrays.asList(new TypedLiteral("Fijian", "en")), java.util.Collections.emptyList()),
	/** 
	"Finnish"@en */
	FI("https://w3id.org/idsa/code/FI", Arrays.asList(new TypedLiteral("Finnish", "en")), java.util.Collections.emptyList()),
	/** 
	"French"@en */
	FR("https://w3id.org/idsa/code/FR", Arrays.asList(new TypedLiteral("French", "en")), java.util.Collections.emptyList()),
	/** 
	"Fula, Fulah, Pulaar, Pular"@en */
	FF("https://w3id.org/idsa/code/FF", Arrays.asList(new TypedLiteral("Fula, Fulah, Pulaar, Pular", "en")), java.util.Collections.emptyList()),
	/** 
	"Galician"@en */
	GL("https://w3id.org/idsa/code/GL", Arrays.asList(new TypedLiteral("Galician", "en")), java.util.Collections.emptyList()),
	/** 
	"Georgian"@en */
	KA("https://w3id.org/idsa/code/KA", Arrays.asList(new TypedLiteral("Georgian", "en")), java.util.Collections.emptyList()),
	/** 
	"German"@en */
	DE("https://w3id.org/idsa/code/DE", Arrays.asList(new TypedLiteral("German", "en")), java.util.Collections.emptyList()),
	/** 
	"Greek (modern)"@en */
	EL("https://w3id.org/idsa/code/EL", Arrays.asList(new TypedLiteral("Greek (modern)", "en")), java.util.Collections.emptyList()),
	/** 
	"Guaraní"@en */
	GN("https://w3id.org/idsa/code/GN", Arrays.asList(new TypedLiteral("Guaraní", "en")), java.util.Collections.emptyList()),
	/** 
	"Gujarati"@en */
	GU("https://w3id.org/idsa/code/GU", Arrays.asList(new TypedLiteral("Gujarati", "en")), java.util.Collections.emptyList()),
	/** 
	"Haitian, Haitian Creole"@en */
	HT("https://w3id.org/idsa/code/HT", Arrays.asList(new TypedLiteral("Haitian, Haitian Creole", "en")), java.util.Collections.emptyList()),
	/** 
	"Hausa"@en */
	HA("https://w3id.org/idsa/code/HA", Arrays.asList(new TypedLiteral("Hausa", "en")), java.util.Collections.emptyList()),
	/** 
	"Hebrew (modern)"@en */
	HE("https://w3id.org/idsa/code/HE", Arrays.asList(new TypedLiteral("Hebrew (modern)", "en")), java.util.Collections.emptyList()),
	/** 
	"Herero"@en */
	HZ("https://w3id.org/idsa/code/HZ", Arrays.asList(new TypedLiteral("Herero", "en")), java.util.Collections.emptyList()),
	/** 
	"Hindi"@en */
	HI("https://w3id.org/idsa/code/HI", Arrays.asList(new TypedLiteral("Hindi", "en")), java.util.Collections.emptyList()),
	/** 
	"Hiri Motu"@en */
	HO("https://w3id.org/idsa/code/HO", Arrays.asList(new TypedLiteral("Hiri Motu", "en")), java.util.Collections.emptyList()),
	/** 
	"Hungarian"@en */
	HU("https://w3id.org/idsa/code/HU", Arrays.asList(new TypedLiteral("Hungarian", "en")), java.util.Collections.emptyList()),
	/** 
	"Interlingua"@en */
	IA("https://w3id.org/idsa/code/IA", Arrays.asList(new TypedLiteral("Interlingua", "en")), java.util.Collections.emptyList()),
	/** 
	"Indonesian"@en */
	ID("https://w3id.org/idsa/code/ID", Arrays.asList(new TypedLiteral("Indonesian", "en")), java.util.Collections.emptyList()),
	/** 
	"Interlingue"@en */
	IE("https://w3id.org/idsa/code/IE", Arrays.asList(new TypedLiteral("Interlingue", "en")), java.util.Collections.emptyList()),
	/** 
	"Irish"@en */
	GA("https://w3id.org/idsa/code/GA", Arrays.asList(new TypedLiteral("Irish", "en")), java.util.Collections.emptyList()),
	/** 
	"Igbo"@en */
	IG("https://w3id.org/idsa/code/IG", Arrays.asList(new TypedLiteral("Igbo", "en")), java.util.Collections.emptyList()),
	/** 
	"Inupiaq"@en */
	IK("https://w3id.org/idsa/code/IK", Arrays.asList(new TypedLiteral("Inupiaq", "en")), java.util.Collections.emptyList()),
	/** 
	"Ido"@en */
	IO("https://w3id.org/idsa/code/IO", Arrays.asList(new TypedLiteral("Ido", "en")), java.util.Collections.emptyList()),
	/** 
	"Icelandic"@en */
	IS("https://w3id.org/idsa/code/IS", Arrays.asList(new TypedLiteral("Icelandic", "en")), java.util.Collections.emptyList()),
	/** 
	"Italian"@en */
	IT("https://w3id.org/idsa/code/IT", Arrays.asList(new TypedLiteral("Italian", "en")), java.util.Collections.emptyList()),
	/** 
	"Inuktitut"@en */
	IU("https://w3id.org/idsa/code/IU", Arrays.asList(new TypedLiteral("Inuktitut", "en")), java.util.Collections.emptyList()),
	/** 
	"Japanese"@en */
	JA("https://w3id.org/idsa/code/JA", Arrays.asList(new TypedLiteral("Japanese", "en")), java.util.Collections.emptyList()),
	/** 
	"Javanese"@en */
	JV("https://w3id.org/idsa/code/JV", Arrays.asList(new TypedLiteral("Javanese", "en")), java.util.Collections.emptyList()),
	/** 
	"Kalaallisut, Greenlandic"@en */
	KL("https://w3id.org/idsa/code/KL", Arrays.asList(new TypedLiteral("Kalaallisut, Greenlandic", "en")), java.util.Collections.emptyList()),
	/** 
	"Kannada"@en */
	KN("https://w3id.org/idsa/code/KN", Arrays.asList(new TypedLiteral("Kannada", "en")), java.util.Collections.emptyList()),
	/** 
	"Kanuri"@en */
	KR("https://w3id.org/idsa/code/KR", Arrays.asList(new TypedLiteral("Kanuri", "en")), java.util.Collections.emptyList()),
	/** 
	"Kashmiri"@en */
	KS("https://w3id.org/idsa/code/KS", Arrays.asList(new TypedLiteral("Kashmiri", "en")), java.util.Collections.emptyList()),
	/** 
	"Kazakh"@en */
	KK("https://w3id.org/idsa/code/KK", Arrays.asList(new TypedLiteral("Kazakh", "en")), java.util.Collections.emptyList()),
	/** 
	"Khmer"@en */
	KM("https://w3id.org/idsa/code/KM", Arrays.asList(new TypedLiteral("Khmer", "en")), java.util.Collections.emptyList()),
	/** 
	"Kikuyu, Gikuyu"@en */
	KI("https://w3id.org/idsa/code/KI", Arrays.asList(new TypedLiteral("Kikuyu, Gikuyu", "en")), java.util.Collections.emptyList()),
	/** 
	"Kinyarwanda"@en */
	RW("https://w3id.org/idsa/code/RW", Arrays.asList(new TypedLiteral("Kinyarwanda", "en")), java.util.Collections.emptyList()),
	/** 
	"Kyrgyz"@en */
	KY("https://w3id.org/idsa/code/KY", Arrays.asList(new TypedLiteral("Kyrgyz", "en")), java.util.Collections.emptyList()),
	/** 
	"Komi"@en */
	KV("https://w3id.org/idsa/code/KV", Arrays.asList(new TypedLiteral("Komi", "en")), java.util.Collections.emptyList()),
	/** 
	"Kongo"@en */
	KG("https://w3id.org/idsa/code/KG", Arrays.asList(new TypedLiteral("Kongo", "en")), java.util.Collections.emptyList()),
	/** 
	"Korean"@en */
	KO("https://w3id.org/idsa/code/KO", Arrays.asList(new TypedLiteral("Korean", "en")), java.util.Collections.emptyList()),
	/** 
	"Kurdish"@en */
	KU("https://w3id.org/idsa/code/KU", Arrays.asList(new TypedLiteral("Kurdish", "en")), java.util.Collections.emptyList()),
	/** 
	"Kwanyama, Kuanyama"@en */
	KJ("https://w3id.org/idsa/code/KJ", Arrays.asList(new TypedLiteral("Kwanyama, Kuanyama", "en")), java.util.Collections.emptyList()),
	/** 
	"Latin"@en */
	LA("https://w3id.org/idsa/code/LA", Arrays.asList(new TypedLiteral("Latin", "en")), java.util.Collections.emptyList()),
	/** 
	"Luxembourgish, Letzeburgesch"@en */
	LB("https://w3id.org/idsa/code/LB", Arrays.asList(new TypedLiteral("Luxembourgish, Letzeburgesch", "en")), java.util.Collections.emptyList()),
	/** 
	"Ganda"@en */
	LG("https://w3id.org/idsa/code/LG", Arrays.asList(new TypedLiteral("Ganda", "en")), java.util.Collections.emptyList()),
	/** 
	"Limburgish, Limburgan, Limburger"@en */
	LI("https://w3id.org/idsa/code/LI", Arrays.asList(new TypedLiteral("Limburgish, Limburgan, Limburger", "en")), java.util.Collections.emptyList()),
	/** 
	"Lingala"@en */
	LN("https://w3id.org/idsa/code/LN", Arrays.asList(new TypedLiteral("Lingala", "en")), java.util.Collections.emptyList()),
	/** 
	"Lao"@en */
	LO("https://w3id.org/idsa/code/LO", Arrays.asList(new TypedLiteral("Lao", "en")), java.util.Collections.emptyList()),
	/** 
	"Luba-Katanga"@en */
	LU("https://w3id.org/idsa/code/LU", Arrays.asList(new TypedLiteral("Luba-Katanga", "en")), java.util.Collections.emptyList()),
	/** 
	"Latvian"@en */
	LV("https://w3id.org/idsa/code/LV", Arrays.asList(new TypedLiteral("Latvian", "en")), java.util.Collections.emptyList()),
	/** 
	"Manx"@en */
	GV("https://w3id.org/idsa/code/GV", Arrays.asList(new TypedLiteral("Manx", "en")), java.util.Collections.emptyList()),
	/** 
	"Macedonian"@en */
	MK("https://w3id.org/idsa/code/MK", Arrays.asList(new TypedLiteral("Macedonian", "en")), java.util.Collections.emptyList()),
	/** 
	"Malagasy"@en */
	MG("https://w3id.org/idsa/code/MG", Arrays.asList(new TypedLiteral("Malagasy", "en")), java.util.Collections.emptyList()),
	/** 
	"Malay"@en */
	MS("https://w3id.org/idsa/code/MS", Arrays.asList(new TypedLiteral("Malay", "en")), java.util.Collections.emptyList()),
	/** 
	"Malayalam"@en */
	ML("https://w3id.org/idsa/code/ML", Arrays.asList(new TypedLiteral("Malayalam", "en")), java.util.Collections.emptyList()),
	/** 
	"Maltese"@en */
	MT("https://w3id.org/idsa/code/MT", Arrays.asList(new TypedLiteral("Maltese", "en")), java.util.Collections.emptyList()),
	/** 
	"Māori"@en */
	MI("https://w3id.org/idsa/code/MI", Arrays.asList(new TypedLiteral("Māori", "en")), java.util.Collections.emptyList()),
	/** 
	"Marathi (Marāṭhī)"@en */
	MR("https://w3id.org/idsa/code/MR", Arrays.asList(new TypedLiteral("Marathi (Marāṭhī)", "en")), java.util.Collections.emptyList()),
	/** 
	"Marshallese"@en */
	MH("https://w3id.org/idsa/code/MH", Arrays.asList(new TypedLiteral("Marshallese", "en")), java.util.Collections.emptyList()),
	/** 
	"Mongolian"@en */
	MN("https://w3id.org/idsa/code/MN", Arrays.asList(new TypedLiteral("Mongolian", "en")), java.util.Collections.emptyList()),
	/** 
	"Nauruan"@en */
	NA("https://w3id.org/idsa/code/NA", Arrays.asList(new TypedLiteral("Nauruan", "en")), java.util.Collections.emptyList()),
	/** 
	"Navajo, Navaho"@en */
	NV("https://w3id.org/idsa/code/NV", Arrays.asList(new TypedLiteral("Navajo, Navaho", "en")), java.util.Collections.emptyList()),
	/** 
	"Northern Ndebele"@en */
	ND("https://w3id.org/idsa/code/ND", Arrays.asList(new TypedLiteral("Northern Ndebele", "en")), java.util.Collections.emptyList()),
	/** 
	"Nepali"@en */
	NE("https://w3id.org/idsa/code/NE", Arrays.asList(new TypedLiteral("Nepali", "en")), java.util.Collections.emptyList()),
	/** 
	"Ndonga"@en */
	NG("https://w3id.org/idsa/code/NG", Arrays.asList(new TypedLiteral("Ndonga", "en")), java.util.Collections.emptyList()),
	/** 
	"Norwegian Bokmål"@en */
	NB("https://w3id.org/idsa/code/NB", Arrays.asList(new TypedLiteral("Norwegian Bokmål", "en")), java.util.Collections.emptyList()),
	/** 
	"Norwegian Nynorsk"@en */
	NN("https://w3id.org/idsa/code/NN", Arrays.asList(new TypedLiteral("Norwegian Nynorsk", "en")), java.util.Collections.emptyList()),
	/** 
	"Norwegian"@en */
	NO("https://w3id.org/idsa/code/NO", Arrays.asList(new TypedLiteral("Norwegian", "en")), java.util.Collections.emptyList()),
	/** 
	"Nuosu"@en */
	II("https://w3id.org/idsa/code/II", Arrays.asList(new TypedLiteral("Nuosu", "en")), java.util.Collections.emptyList()),
	/** 
	"Southern Ndebele"@en */
	NR("https://w3id.org/idsa/code/NR", Arrays.asList(new TypedLiteral("Southern Ndebele", "en")), java.util.Collections.emptyList()),
	/** 
	"Occitan"@en */
	OC("https://w3id.org/idsa/code/OC", Arrays.asList(new TypedLiteral("Occitan", "en")), java.util.Collections.emptyList()),
	/** 
	"Ojibwe, Ojibwa"@en */
	OJ("https://w3id.org/idsa/code/OJ", Arrays.asList(new TypedLiteral("Ojibwe, Ojibwa", "en")), java.util.Collections.emptyList()),
	/** 
	"Old Church Slavonic, Church Slavonic, Old Bulgarian"@en */
	CU("https://w3id.org/idsa/code/CU", Arrays.asList(new TypedLiteral("Old Church Slavonic, Church Slavonic, Old Bulgarian", "en")), java.util.Collections.emptyList()),
	/** 
	"Oromo"@en */
	OM("https://w3id.org/idsa/code/OM", Arrays.asList(new TypedLiteral("Oromo", "en")), java.util.Collections.emptyList()),
	/** 
	"Oriya"@en */
	OR("https://w3id.org/idsa/code/OR", Arrays.asList(new TypedLiteral("Oriya", "en")), java.util.Collections.emptyList()),
	/** 
	"Ossetian, Ossetic"@en */
	OS("https://w3id.org/idsa/code/OS", Arrays.asList(new TypedLiteral("Ossetian, Ossetic", "en")), java.util.Collections.emptyList()),
	/** 
	"(Eastern) Punjabi"@en */
	PA("https://w3id.org/idsa/code/PA", Arrays.asList(new TypedLiteral("(Eastern) Punjabi", "en")), java.util.Collections.emptyList()),
	/** 
	"Pāli"@en */
	PI("https://w3id.org/idsa/code/PI", Arrays.asList(new TypedLiteral("Pāli", "en")), java.util.Collections.emptyList()),
	/** 
	"Persian (Farsi)"@en */
	FA("https://w3id.org/idsa/code/FA", Arrays.asList(new TypedLiteral("Persian (Farsi)", "en")), java.util.Collections.emptyList()),
	/** 
	"Polish"@en */
	PL("https://w3id.org/idsa/code/PL", Arrays.asList(new TypedLiteral("Polish", "en")), java.util.Collections.emptyList()),
	/** 
	"Pashto, Pushto"@en */
	PS("https://w3id.org/idsa/code/PS", Arrays.asList(new TypedLiteral("Pashto, Pushto", "en")), java.util.Collections.emptyList()),
	/** 
	"Portuguese"@en */
	PT("https://w3id.org/idsa/code/PT", Arrays.asList(new TypedLiteral("Portuguese", "en")), java.util.Collections.emptyList()),
	/** 
	"Quechua"@en */
	QU("https://w3id.org/idsa/code/QU", Arrays.asList(new TypedLiteral("Quechua", "en")), java.util.Collections.emptyList()),
	/** 
	"Romansh"@en */
	RM("https://w3id.org/idsa/code/RM", Arrays.asList(new TypedLiteral("Romansh", "en")), java.util.Collections.emptyList()),
	/** 
	"Kirundi"@en */
	RN("https://w3id.org/idsa/code/RN", Arrays.asList(new TypedLiteral("Kirundi", "en")), java.util.Collections.emptyList()),
	/** 
	"Romanian"@en */
	RO("https://w3id.org/idsa/code/RO", Arrays.asList(new TypedLiteral("Romanian", "en")), java.util.Collections.emptyList()),
	/** 
	"Russian"@en */
	RU("https://w3id.org/idsa/code/RU", Arrays.asList(new TypedLiteral("Russian", "en")), java.util.Collections.emptyList()),
	/** 
	"Sanskrit (Saṁskṛta)"@en */
	SA("https://w3id.org/idsa/code/SA", Arrays.asList(new TypedLiteral("Sanskrit (Saṁskṛta)", "en")), java.util.Collections.emptyList()),
	/** 
	"Sardinian"@en */
	SC("https://w3id.org/idsa/code/SC", Arrays.asList(new TypedLiteral("Sardinian", "en")), java.util.Collections.emptyList()),
	/** 
	"Sindhi"@en */
	SD("https://w3id.org/idsa/code/SD", Arrays.asList(new TypedLiteral("Sindhi", "en")), java.util.Collections.emptyList()),
	/** 
	"Northern Sami"@en */
	SE("https://w3id.org/idsa/code/SE", Arrays.asList(new TypedLiteral("Northern Sami", "en")), java.util.Collections.emptyList()),
	/** 
	"Samoan"@en */
	SM("https://w3id.org/idsa/code/SM", Arrays.asList(new TypedLiteral("Samoan", "en")), java.util.Collections.emptyList()),
	/** 
	"Sango"@en */
	SG("https://w3id.org/idsa/code/SG", Arrays.asList(new TypedLiteral("Sango", "en")), java.util.Collections.emptyList()),
	/** 
	"Serbian"@en */
	SR("https://w3id.org/idsa/code/SR", Arrays.asList(new TypedLiteral("Serbian", "en")), java.util.Collections.emptyList()),
	/** 
	"Scottish Gaelic, Gaelic"@en */
	GD("https://w3id.org/idsa/code/GD", Arrays.asList(new TypedLiteral("Scottish Gaelic, Gaelic", "en")), java.util.Collections.emptyList()),
	/** 
	"Shona"@en */
	SN("https://w3id.org/idsa/code/SN", Arrays.asList(new TypedLiteral("Shona", "en")), java.util.Collections.emptyList()),
	/** 
	"Sinhalese, Sinhala"@en */
	SI("https://w3id.org/idsa/code/SI", Arrays.asList(new TypedLiteral("Sinhalese, Sinhala", "en")), java.util.Collections.emptyList()),
	/** 
	"Slovak"@en */
	SK("https://w3id.org/idsa/code/SK", Arrays.asList(new TypedLiteral("Slovak", "en")), java.util.Collections.emptyList()),
	/** 
	"Slovene"@en */
	SL("https://w3id.org/idsa/code/SL", Arrays.asList(new TypedLiteral("Slovene", "en")), java.util.Collections.emptyList()),
	/** 
	"Somali"@en */
	SO("https://w3id.org/idsa/code/SO", Arrays.asList(new TypedLiteral("Somali", "en")), java.util.Collections.emptyList()),
	/** 
	"Southern Sotho"@en */
	ST("https://w3id.org/idsa/code/ST", Arrays.asList(new TypedLiteral("Southern Sotho", "en")), java.util.Collections.emptyList()),
	/** 
	"Spanish"@en */
	ES("https://w3id.org/idsa/code/ES", Arrays.asList(new TypedLiteral("Spanish", "en")), java.util.Collections.emptyList()),
	/** 
	"Sundanese"@en */
	SU("https://w3id.org/idsa/code/SU", Arrays.asList(new TypedLiteral("Sundanese", "en")), java.util.Collections.emptyList()),
	/** 
	"Swahili"@en */
	SW("https://w3id.org/idsa/code/SW", Arrays.asList(new TypedLiteral("Swahili", "en")), java.util.Collections.emptyList()),
	/** 
	"Swati"@en */
	SS("https://w3id.org/idsa/code/SS", Arrays.asList(new TypedLiteral("Swati", "en")), java.util.Collections.emptyList()),
	/** 
	"Swedish"@en */
	SV("https://w3id.org/idsa/code/SV", Arrays.asList(new TypedLiteral("Swedish", "en")), java.util.Collections.emptyList()),
	/** 
	"Tamil"@en */
	TA("https://w3id.org/idsa/code/TA", Arrays.asList(new TypedLiteral("Tamil", "en")), java.util.Collections.emptyList()),
	/** 
	"Telugu"@en */
	TE("https://w3id.org/idsa/code/TE", Arrays.asList(new TypedLiteral("Telugu", "en")), java.util.Collections.emptyList()),
	/** 
	"Tajik"@en */
	TG("https://w3id.org/idsa/code/TG", Arrays.asList(new TypedLiteral("Tajik", "en")), java.util.Collections.emptyList()),
	/** 
	"Thai"@en */
	TH("https://w3id.org/idsa/code/TH", Arrays.asList(new TypedLiteral("Thai", "en")), java.util.Collections.emptyList()),
	/** 
	"Tigrinya"@en */
	TI("https://w3id.org/idsa/code/TI", Arrays.asList(new TypedLiteral("Tigrinya", "en")), java.util.Collections.emptyList()),
	/** 
	"Tibetan Standard, Tibetan, Central"@en */
	BO("https://w3id.org/idsa/code/BO", Arrays.asList(new TypedLiteral("Tibetan Standard, Tibetan, Central", "en")), java.util.Collections.emptyList()),
	/** 
	"Turkmen"@en */
	TK("https://w3id.org/idsa/code/TK", Arrays.asList(new TypedLiteral("Turkmen", "en")), java.util.Collections.emptyList()),
	/** 
	"Tagalog"@en */
	TL("https://w3id.org/idsa/code/TL", Arrays.asList(new TypedLiteral("Tagalog", "en")), java.util.Collections.emptyList()),
	/** 
	"Tswana"@en */
	TN("https://w3id.org/idsa/code/TN", Arrays.asList(new TypedLiteral("Tswana", "en")), java.util.Collections.emptyList()),
	/** 
	"Tonga (Tonga Islands)"@en */
	TO("https://w3id.org/idsa/code/TO", Arrays.asList(new TypedLiteral("Tonga (Tonga Islands)", "en")), java.util.Collections.emptyList()),
	/** 
	"Turkish"@en */
	TR("https://w3id.org/idsa/code/TR", Arrays.asList(new TypedLiteral("Turkish", "en")), java.util.Collections.emptyList()),
	/** 
	"Tsonga"@en */
	TS("https://w3id.org/idsa/code/TS", Arrays.asList(new TypedLiteral("Tsonga", "en")), java.util.Collections.emptyList()),
	/** 
	"Tatar"@en */
	TT("https://w3id.org/idsa/code/TT", Arrays.asList(new TypedLiteral("Tatar", "en")), java.util.Collections.emptyList()),
	/** 
	"Twi"@en */
	TW("https://w3id.org/idsa/code/TW", Arrays.asList(new TypedLiteral("Twi", "en")), java.util.Collections.emptyList()),
	/** 
	"Tahitian"@en */
	TY("https://w3id.org/idsa/code/TY", Arrays.asList(new TypedLiteral("Tahitian", "en")), java.util.Collections.emptyList()),
	/** 
	"Uyghur"@en */
	UG("https://w3id.org/idsa/code/UG", Arrays.asList(new TypedLiteral("Uyghur", "en")), java.util.Collections.emptyList()),
	/** 
	"Ukrainian"@en */
	UK("https://w3id.org/idsa/code/UK", Arrays.asList(new TypedLiteral("Ukrainian", "en")), java.util.Collections.emptyList()),
	/** 
	"Urdu"@en */
	UR("https://w3id.org/idsa/code/UR", Arrays.asList(new TypedLiteral("Urdu", "en")), java.util.Collections.emptyList()),
	/** 
	"Uzbek"@en */
	UZ("https://w3id.org/idsa/code/UZ", Arrays.asList(new TypedLiteral("Uzbek", "en")), java.util.Collections.emptyList()),
	/** 
	"Venda"@en */
	VE("https://w3id.org/idsa/code/VE", Arrays.asList(new TypedLiteral("Venda", "en")), java.util.Collections.emptyList()),
	/** 
	"Vietnamese"@en */
	VI("https://w3id.org/idsa/code/VI", Arrays.asList(new TypedLiteral("Vietnamese", "en")), java.util.Collections.emptyList()),
	/** 
	"Volapük"@en */
	VO("https://w3id.org/idsa/code/VO", Arrays.asList(new TypedLiteral("Volapük", "en")), java.util.Collections.emptyList()),
	/** 
	"Walloon"@en */
	WA("https://w3id.org/idsa/code/WA", Arrays.asList(new TypedLiteral("Walloon", "en")), java.util.Collections.emptyList()),
	/** 
	"Welsh"@en */
	CY("https://w3id.org/idsa/code/CY", Arrays.asList(new TypedLiteral("Welsh", "en")), java.util.Collections.emptyList()),
	/** 
	"Wolof"@en */
	WO("https://w3id.org/idsa/code/WO", Arrays.asList(new TypedLiteral("Wolof", "en")), java.util.Collections.emptyList()),
	/** 
	"Western Frisian"@en */
	FY("https://w3id.org/idsa/code/FY", Arrays.asList(new TypedLiteral("Western Frisian", "en")), java.util.Collections.emptyList()),
	/** 
	"Xhosa"@en */
	XH("https://w3id.org/idsa/code/XH", Arrays.asList(new TypedLiteral("Xhosa", "en")), java.util.Collections.emptyList()),
	/** 
	"Yiddish"@en */
	YI("https://w3id.org/idsa/code/YI", Arrays.asList(new TypedLiteral("Yiddish", "en")), java.util.Collections.emptyList()),
	/** 
	"Yoruba"@en */
	YO("https://w3id.org/idsa/code/YO", Arrays.asList(new TypedLiteral("Yoruba", "en")), java.util.Collections.emptyList()),
	/** 
	"Zhuang, Chuang"@en */
	ZA("https://w3id.org/idsa/code/ZA", Arrays.asList(new TypedLiteral("Zhuang, Chuang", "en")), java.util.Collections.emptyList()),
	/** 
	"Zulu"@en */
	ZU("https://w3id.org/idsa/code/ZU", Arrays.asList(new TypedLiteral("Zulu", "en")), java.util.Collections.emptyList());

	private static final Map<String,Language> uriInstanceMapping;
	static {
		uriInstanceMapping = new HashMap<>();
		uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
		uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
	}

	private URI id;
	private java.util.List<TypedLiteral> label;
	private java.util.List<TypedLiteral> comment;

	//TODO dummy method for generic properties, should be deleted in future versions
	public java.util.Map<String,Object> getProperties() {
		return null ;
	}
	public void setProperty(String property, Object value) {
		//do nothing
	}

	Language(String id, java.util.List<TypedLiteral> label, java.util.List<TypedLiteral> comment) {
		try {
			this.id = new URI(id);
			this.label = label;
			this.comment = comment;
		}
		catch (java.net.URISyntaxException e) {
			throw new IllegalArgumentException(e);
		}
	}

	@JsonIgnore
	final public URI getId() {
		return id;
	}

	@JsonIgnore
	final public java.util.List<TypedLiteral> getLabel() {
		return label;
	}

	@JsonIgnore
	final public java.util.List<TypedLiteral> getComment() {
		return comment;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	@JsonProperty("@id")
	final public URI getSerializedId() {
		try {
			 return new URI("idsc:" + id.toString().substring(id.toString().lastIndexOf("/") + 1));
		} catch (Exception e) {}
		return null;
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
