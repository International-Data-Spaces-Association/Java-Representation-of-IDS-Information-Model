package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.JsonNode;

import de.fraunhofer.iais.eis.util.*;

/**
 * The class of languages potentially being used by textual Data Assets.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:Language")
public enum Language implements ModelClass {

    /** 
    */
    AA("https://w3id.org/idsa/code/AA", Arrays.asList(new TypedLiteral("Afar", "en")), Collections.emptyList()),

    /** 
    */
    AB("https://w3id.org/idsa/code/AB", Arrays.asList(new TypedLiteral("Abkhaz", "en")), Collections.emptyList()),

    /** 
    */
    AE("https://w3id.org/idsa/code/AE", Arrays.asList(new TypedLiteral("Avestan", "en")), Collections.emptyList()),

    /** 
    */
    AF("https://w3id.org/idsa/code/AF", Arrays.asList(new TypedLiteral("Afrikaans", "en")), Collections.emptyList()),

    /** 
    */
    AK("https://w3id.org/idsa/code/AK", Arrays.asList(new TypedLiteral("Akan", "en")), Collections.emptyList()),

    /** 
    */
    AM("https://w3id.org/idsa/code/AM", Arrays.asList(new TypedLiteral("Amharic", "en")), Collections.emptyList()),

    /** 
    */
    AN("https://w3id.org/idsa/code/AN", Arrays.asList(new TypedLiteral("Aragonese", "en")), Collections.emptyList()),

    /** 
    */
    AR("https://w3id.org/idsa/code/AR", Arrays.asList(new TypedLiteral("Arabic", "en")), Collections.emptyList()),

    /** 
    */
    AS("https://w3id.org/idsa/code/AS", Arrays.asList(new TypedLiteral("Assamese", "en")), Collections.emptyList()),

    /** 
    */
    AV("https://w3id.org/idsa/code/AV", Arrays.asList(new TypedLiteral("Avaric", "en")), Collections.emptyList()),

    /** 
    */
    AY("https://w3id.org/idsa/code/AY", Arrays.asList(new TypedLiteral("Aymara", "en")), Collections.emptyList()),

    /** 
    */
    AZ("https://w3id.org/idsa/code/AZ", Arrays.asList(new TypedLiteral("Azerbaijani", "en")), Collections.emptyList()),

    /** 
    */
    BA("https://w3id.org/idsa/code/BA", Arrays.asList(new TypedLiteral("Bashkir", "en")), Collections.emptyList()),

    /** 
    */
    BE("https://w3id.org/idsa/code/BE", Arrays.asList(new TypedLiteral("Belarusian", "en")), Collections.emptyList()),

    /** 
    */
    BG("https://w3id.org/idsa/code/BG", Arrays.asList(new TypedLiteral("Bulgarian", "en")), Collections.emptyList()),

    /** 
    */
    BH("https://w3id.org/idsa/code/BH", Arrays.asList(new TypedLiteral("Bihari", "en")), Collections.emptyList()),

    /** 
    */
    BI("https://w3id.org/idsa/code/BI", Arrays.asList(new TypedLiteral("Bislama", "en")), Collections.emptyList()),

    /** 
    */
    BM("https://w3id.org/idsa/code/BM", Arrays.asList(new TypedLiteral("Bambara", "en")), Collections.emptyList()),

    /** 
    */
    BN("https://w3id.org/idsa/code/BN", Arrays.asList(new TypedLiteral("Bengali, Bangla", "en")), Collections.emptyList()),

    /** 
    */
    BO("https://w3id.org/idsa/code/BO", Arrays.asList(new TypedLiteral("Tibetan Standard, Tibetan, Central", "en")),
        Collections.emptyList()),

    /** 
    */
    BR("https://w3id.org/idsa/code/BR", Arrays.asList(new TypedLiteral("Breton", "en")), Collections.emptyList()),

    /** 
    */
    BS("https://w3id.org/idsa/code/BS", Arrays.asList(new TypedLiteral("Bosnian", "en")), Collections.emptyList()),

    /** 
    */
    CA("https://w3id.org/idsa/code/CA", Arrays.asList(new TypedLiteral("Catalan", "en")), Collections.emptyList()),

    /** 
    */
    CE("https://w3id.org/idsa/code/CE", Arrays.asList(new TypedLiteral("Chechen", "en")), Collections.emptyList()),

    /** 
    */
    CH("https://w3id.org/idsa/code/CH", Arrays.asList(new TypedLiteral("Chamorro", "en")), Collections.emptyList()),

    /** 
    */
    CO("https://w3id.org/idsa/code/CO", Arrays.asList(new TypedLiteral("Corsican", "en")), Collections.emptyList()),

    /** 
    */
    CR("https://w3id.org/idsa/code/CR", Arrays.asList(new TypedLiteral("Cree", "en")), Collections.emptyList()),

    /** 
    */
    CS("https://w3id.org/idsa/code/CS", Arrays.asList(new TypedLiteral("Czech", "en")), Collections.emptyList()),

    /** 
    */
    CU("https://w3id.org/idsa/code/CU", Arrays.asList(new TypedLiteral("Old Church Slavonic, Church Slavonic, Old Bulgarian", "en")),
        Collections.emptyList()),

    /** 
    */
    CV("https://w3id.org/idsa/code/CV", Arrays.asList(new TypedLiteral("Chuvash", "en")), Collections.emptyList()),

    /** 
    */
    CY("https://w3id.org/idsa/code/CY", Arrays.asList(new TypedLiteral("Welsh", "en")), Collections.emptyList()),

    /** 
    */
    DA("https://w3id.org/idsa/code/DA", Arrays.asList(new TypedLiteral("Danish", "en")), Collections.emptyList()),

    /** 
    */
    DE("https://w3id.org/idsa/code/DE", Arrays.asList(new TypedLiteral("German", "en")), Collections.emptyList()),

    /** 
    */
    DV("https://w3id.org/idsa/code/DV", Arrays.asList(new TypedLiteral("Divehi, Dhivehi, Maldivian", "en")), Collections.emptyList()),

    /** 
    */
    DZ("https://w3id.org/idsa/code/DZ", Arrays.asList(new TypedLiteral("Dzongkha", "en")), Collections.emptyList()),

    /** 
    */
    EE("https://w3id.org/idsa/code/EE", Arrays.asList(new TypedLiteral("Ewe", "en")), Collections.emptyList()),

    /** 
    */
    EL("https://w3id.org/idsa/code/EL", Arrays.asList(new TypedLiteral("Greek (modern)", "en")), Collections.emptyList()),

    /** 
    */
    EN("https://w3id.org/idsa/code/EN", Arrays.asList(new TypedLiteral("English", "en")), Collections.emptyList()),

    /** 
    */
    EO("https://w3id.org/idsa/code/EO", Arrays.asList(new TypedLiteral("Esperanto", "en")), Collections.emptyList()),

    /** 
    */
    ES("https://w3id.org/idsa/code/ES", Arrays.asList(new TypedLiteral("Spanish", "en")), Collections.emptyList()),

    /** 
    */
    ET("https://w3id.org/idsa/code/ET", Arrays.asList(new TypedLiteral("Estonian", "en")), Collections.emptyList()),

    /** 
    */
    EU("https://w3id.org/idsa/code/EU", Arrays.asList(new TypedLiteral("Basque", "en")), Collections.emptyList()),

    /** 
    */
    FA("https://w3id.org/idsa/code/FA", Arrays.asList(new TypedLiteral("Persian (Farsi)", "en")), Collections.emptyList()),

    /** 
    */
    FF("https://w3id.org/idsa/code/FF", Arrays.asList(new TypedLiteral("Fula, Fulah, Pulaar, Pular", "en")), Collections.emptyList()),

    /** 
    */
    FI("https://w3id.org/idsa/code/FI", Arrays.asList(new TypedLiteral("Finnish", "en")), Collections.emptyList()),

    /** 
    */
    FJ("https://w3id.org/idsa/code/FJ", Arrays.asList(new TypedLiteral("Fijian", "en")), Collections.emptyList()),

    /** 
    */
    FO("https://w3id.org/idsa/code/FO", Arrays.asList(new TypedLiteral("Faroese", "en")), Collections.emptyList()),

    /** 
    */
    FR("https://w3id.org/idsa/code/FR", Arrays.asList(new TypedLiteral("French", "en")), Collections.emptyList()),

    /** 
    */
    FY("https://w3id.org/idsa/code/FY", Arrays.asList(new TypedLiteral("Western Frisian", "en")), Collections.emptyList()),

    /** 
    */
    GA("https://w3id.org/idsa/code/GA", Arrays.asList(new TypedLiteral("Irish", "en")), Collections.emptyList()),

    /** 
    */
    GD("https://w3id.org/idsa/code/GD", Arrays.asList(new TypedLiteral("Scottish Gaelic, Gaelic", "en")), Collections.emptyList()),

    /** 
    */
    GL("https://w3id.org/idsa/code/GL", Arrays.asList(new TypedLiteral("Galician", "en")), Collections.emptyList()),

    /** 
    */
    GN("https://w3id.org/idsa/code/GN", Arrays.asList(new TypedLiteral("Guaraní", "en")), Collections.emptyList()),

    /** 
    */
    GU("https://w3id.org/idsa/code/GU", Arrays.asList(new TypedLiteral("Gujarati", "en")), Collections.emptyList()),

    /** 
    */
    GV("https://w3id.org/idsa/code/GV", Arrays.asList(new TypedLiteral("Manx", "en")), Collections.emptyList()),

    /** 
    */
    HA("https://w3id.org/idsa/code/HA", Arrays.asList(new TypedLiteral("Hausa", "en")), Collections.emptyList()),

    /** 
    */
    HE("https://w3id.org/idsa/code/HE", Arrays.asList(new TypedLiteral("Hebrew (modern)", "en")), Collections.emptyList()),

    /** 
    */
    HI("https://w3id.org/idsa/code/HI", Arrays.asList(new TypedLiteral("Hindi", "en")), Collections.emptyList()),

    /** 
    */
    HO("https://w3id.org/idsa/code/HO", Arrays.asList(new TypedLiteral("Hiri Motu", "en")), Collections.emptyList()),

    /** 
    */
    HR("https://w3id.org/idsa/code/HR", Arrays.asList(new TypedLiteral("Croatian", "en")), Collections.emptyList()),

    /** 
    */
    HT("https://w3id.org/idsa/code/HT", Arrays.asList(new TypedLiteral("Haitian, Haitian Creole", "en")), Collections.emptyList()),

    /** 
    */
    HU("https://w3id.org/idsa/code/HU", Arrays.asList(new TypedLiteral("Hungarian", "en")), Collections.emptyList()),

    /** 
    */
    HY("https://w3id.org/idsa/code/HY", Arrays.asList(new TypedLiteral("Armenian", "en")), Collections.emptyList()),

    /** 
    */
    HZ("https://w3id.org/idsa/code/HZ", Arrays.asList(new TypedLiteral("Herero", "en")), Collections.emptyList()),

    /** 
    */
    IA("https://w3id.org/idsa/code/IA", Arrays.asList(new TypedLiteral("Interlingua", "en")), Collections.emptyList()),

    /** 
    */
    ID("https://w3id.org/idsa/code/ID", Arrays.asList(new TypedLiteral("Indonesian", "en")), Collections.emptyList()),

    /** 
    */
    IE("https://w3id.org/idsa/code/IE", Arrays.asList(new TypedLiteral("Interlingue", "en")), Collections.emptyList()),

    /** 
    */
    IG("https://w3id.org/idsa/code/IG", Arrays.asList(new TypedLiteral("Igbo", "en")), Collections.emptyList()),

    /** 
    */
    II("https://w3id.org/idsa/code/II", Arrays.asList(new TypedLiteral("Nuosu", "en")), Collections.emptyList()),

    /** 
    */
    IK("https://w3id.org/idsa/code/IK", Arrays.asList(new TypedLiteral("Inupiaq", "en")), Collections.emptyList()),

    /** 
    */
    IO("https://w3id.org/idsa/code/IO", Arrays.asList(new TypedLiteral("Ido", "en")), Collections.emptyList()),

    /** 
    */
    IS("https://w3id.org/idsa/code/IS", Arrays.asList(new TypedLiteral("Icelandic", "en")), Collections.emptyList()),

    /** 
    */
    IT("https://w3id.org/idsa/code/IT", Arrays.asList(new TypedLiteral("Italian", "en")), Collections.emptyList()),

    /** 
    */
    IU("https://w3id.org/idsa/code/IU", Arrays.asList(new TypedLiteral("Inuktitut", "en")), Collections.emptyList()),

    /** 
    */
    JA("https://w3id.org/idsa/code/JA", Arrays.asList(new TypedLiteral("Japanese", "en")), Collections.emptyList()),

    /** 
    */
    JV("https://w3id.org/idsa/code/JV", Arrays.asList(new TypedLiteral("Javanese", "en")), Collections.emptyList()),

    /** 
    */
    KA("https://w3id.org/idsa/code/KA", Arrays.asList(new TypedLiteral("Georgian", "en")), Collections.emptyList()),

    /** 
    */
    KG("https://w3id.org/idsa/code/KG", Arrays.asList(new TypedLiteral("Kongo", "en")), Collections.emptyList()),

    /** 
    */
    KI("https://w3id.org/idsa/code/KI", Arrays.asList(new TypedLiteral("Kikuyu, Gikuyu", "en")), Collections.emptyList()),

    /** 
    */
    KJ("https://w3id.org/idsa/code/KJ", Arrays.asList(new TypedLiteral("Kwanyama, Kuanyama", "en")), Collections.emptyList()),

    /** 
    */
    KK("https://w3id.org/idsa/code/KK", Arrays.asList(new TypedLiteral("Kazakh", "en")), Collections.emptyList()),

    /** 
    */
    KL("https://w3id.org/idsa/code/KL", Arrays.asList(new TypedLiteral("Kalaallisut, Greenlandic", "en")), Collections.emptyList()),

    /** 
    */
    KM("https://w3id.org/idsa/code/KM", Arrays.asList(new TypedLiteral("Khmer", "en")), Collections.emptyList()),

    /** 
    */
    KN("https://w3id.org/idsa/code/KN", Arrays.asList(new TypedLiteral("Kannada", "en")), Collections.emptyList()),

    /** 
    */
    KO("https://w3id.org/idsa/code/KO", Arrays.asList(new TypedLiteral("Korean", "en")), Collections.emptyList()),

    /** 
    */
    KR("https://w3id.org/idsa/code/KR", Arrays.asList(new TypedLiteral("Kanuri", "en")), Collections.emptyList()),

    /** 
    */
    KS("https://w3id.org/idsa/code/KS", Arrays.asList(new TypedLiteral("Kashmiri", "en")), Collections.emptyList()),

    /** 
    */
    KU("https://w3id.org/idsa/code/KU", Arrays.asList(new TypedLiteral("Kurdish", "en")), Collections.emptyList()),

    /** 
    */
    KV("https://w3id.org/idsa/code/KV", Arrays.asList(new TypedLiteral("Komi", "en")), Collections.emptyList()),

    /** 
    */
    KW("https://w3id.org/idsa/code/KW", Arrays.asList(new TypedLiteral("Cornish", "en")), Collections.emptyList()),

    /** 
    */
    KY("https://w3id.org/idsa/code/KY", Arrays.asList(new TypedLiteral("Kyrgyz", "en")), Collections.emptyList()),

    /** 
    */
    LA("https://w3id.org/idsa/code/LA", Arrays.asList(new TypedLiteral("Latin", "en")), Collections.emptyList()),

    /** 
    */
    LB("https://w3id.org/idsa/code/LB", Arrays.asList(new TypedLiteral("Luxembourgish, Letzeburgesch", "en")), Collections.emptyList()),

    /** 
    */
    LG("https://w3id.org/idsa/code/LG", Arrays.asList(new TypedLiteral("Ganda", "en")), Collections.emptyList()),

    /** 
    */
    LI("https://w3id.org/idsa/code/LI", Arrays.asList(new TypedLiteral("Limburgish, Limburgan, Limburger", "en")), Collections.emptyList()),

    /** 
    */
    LN("https://w3id.org/idsa/code/LN", Arrays.asList(new TypedLiteral("Lingala", "en")), Collections.emptyList()),

    /** 
    */
    LO("https://w3id.org/idsa/code/LO", Arrays.asList(new TypedLiteral("Lao", "en")), Collections.emptyList()),

    /**
     * Less-than operator. Can be used for numeric (2 idsc:LT 5) comparisons. Do not confuse with
     * idsc:LT (which is a language).
     */
    LT("https://w3id.org/idsa/code/LT", Arrays.asList(new TypedLiteral("less than", "en"), new TypedLiteral("Lithuanian", "en")),
        Arrays.asList(new TypedLiteral("Less-than operator. Can be used for numeric (2 idsc:LT 5) comparisons.", "en"))),

    /** 
    */
    LU("https://w3id.org/idsa/code/LU", Arrays.asList(new TypedLiteral("Luba-Katanga", "en")), Collections.emptyList()),

    /** 
    */
    LV("https://w3id.org/idsa/code/LV", Arrays.asList(new TypedLiteral("Latvian", "en")), Collections.emptyList()),

    /** 
    */
    MG("https://w3id.org/idsa/code/MG", Arrays.asList(new TypedLiteral("Malagasy", "en")), Collections.emptyList()),

    /** 
    */
    MH("https://w3id.org/idsa/code/MH", Arrays.asList(new TypedLiteral("Marshallese", "en")), Collections.emptyList()),

    /** 
    */
    MI("https://w3id.org/idsa/code/MI", Arrays.asList(new TypedLiteral("M�?ori", "en")), Collections.emptyList()),

    /** 
    */
    MK("https://w3id.org/idsa/code/MK", Arrays.asList(new TypedLiteral("Macedonian", "en")), Collections.emptyList()),

    /** 
    */
    ML("https://w3id.org/idsa/code/ML", Arrays.asList(new TypedLiteral("Malayalam", "en")), Collections.emptyList()),

    /** 
    */
    MN("https://w3id.org/idsa/code/MN", Arrays.asList(new TypedLiteral("Mongolian", "en")), Collections.emptyList()),

    /** 
    */
    MR("https://w3id.org/idsa/code/MR", Arrays.asList(new TypedLiteral("Marathi (Mar�?ṭhī)", "en")), Collections.emptyList()),

    /** 
    */
    MS("https://w3id.org/idsa/code/MS", Arrays.asList(new TypedLiteral("Malay", "en")), Collections.emptyList()),

    /** 
    */
    MT("https://w3id.org/idsa/code/MT", Arrays.asList(new TypedLiteral("Maltese", "en")), Collections.emptyList()),

    /**
     * Code indicates that several languages are used or no concrete language can be determined.
     */
    MULTI_LINGUAL("https://w3id.org/idsa/code/MULTI_LINGUAL", Arrays.asList(new TypedLiteral("Multilingual", "en")),
        Arrays.asList(new TypedLiteral("Code indicates that several languages are used or no concrete language can be determined.", ""))),

    /** 
    */
    MY("https://w3id.org/idsa/code/MY", Arrays.asList(new TypedLiteral("Burmese", "en")), Collections.emptyList()),

    /** 
    */
    NA("https://w3id.org/idsa/code/NA", Arrays.asList(new TypedLiteral("Nauruan", "en")), Collections.emptyList()),

    /** 
    */
    NB("https://w3id.org/idsa/code/NB", Arrays.asList(new TypedLiteral("Norwegian Bokmål", "en")), Collections.emptyList()),

    /** 
    */
    ND("https://w3id.org/idsa/code/ND", Arrays.asList(new TypedLiteral("Northern Ndebele", "en")), Collections.emptyList()),

    /** 
    */
    NE("https://w3id.org/idsa/code/NE", Arrays.asList(new TypedLiteral("Nepali", "en")), Collections.emptyList()),

    /** 
    */
    NG("https://w3id.org/idsa/code/NG", Arrays.asList(new TypedLiteral("Ndonga", "en")), Collections.emptyList()),

    /** 
    */
    NL("https://w3id.org/idsa/code/NL", Arrays.asList(new TypedLiteral("Dutch", "en")), Collections.emptyList()),

    /** 
    */
    NN("https://w3id.org/idsa/code/NN", Arrays.asList(new TypedLiteral("Norwegian Nynorsk", "en")), Collections.emptyList()),

    /** 
    */
    NO("https://w3id.org/idsa/code/NO", Arrays.asList(new TypedLiteral("Norwegian", "en")), Collections.emptyList()),

    /** 
    */
    NR("https://w3id.org/idsa/code/NR", Arrays.asList(new TypedLiteral("Southern Ndebele", "en")), Collections.emptyList()),

    /** 
    */
    NV("https://w3id.org/idsa/code/NV", Arrays.asList(new TypedLiteral("Navajo, Navaho", "en")), Collections.emptyList()),

    /** 
    */
    NY("https://w3id.org/idsa/code/NY", Arrays.asList(new TypedLiteral("Chichewa, Chewa, Nyanja", "en")), Collections.emptyList()),

    /** 
    */
    OC("https://w3id.org/idsa/code/OC", Arrays.asList(new TypedLiteral("Occitan", "en")), Collections.emptyList()),

    /** 
    */
    OJ("https://w3id.org/idsa/code/OJ", Arrays.asList(new TypedLiteral("Ojibwe, Ojibwa", "en")), Collections.emptyList()),

    /** 
    */
    OM("https://w3id.org/idsa/code/OM", Arrays.asList(new TypedLiteral("Oromo", "en")), Collections.emptyList()),

    /** 
    */
    OR("https://w3id.org/idsa/code/OR", Arrays.asList(new TypedLiteral("Oriya", "en")), Collections.emptyList()),

    /** 
    */
    OS("https://w3id.org/idsa/code/OS", Arrays.asList(new TypedLiteral("Ossetian, Ossetic", "en")), Collections.emptyList()),

    /** 
    */
    PA("https://w3id.org/idsa/code/PA", Arrays.asList(new TypedLiteral("(Eastern) Punjabi", "en")), Collections.emptyList()),

    /** 
    */
    PI("https://w3id.org/idsa/code/PI", Arrays.asList(new TypedLiteral("P�?li", "en")), Collections.emptyList()),

    /** 
    */
    PL("https://w3id.org/idsa/code/PL", Arrays.asList(new TypedLiteral("Polish", "en")), Collections.emptyList()),

    /** 
    */
    PS("https://w3id.org/idsa/code/PS", Arrays.asList(new TypedLiteral("Pashto, Pushto", "en")), Collections.emptyList()),

    /** 
    */
    PT("https://w3id.org/idsa/code/PT", Arrays.asList(new TypedLiteral("Portuguese", "en")), Collections.emptyList()),

    /** 
    */
    QU("https://w3id.org/idsa/code/QU", Arrays.asList(new TypedLiteral("Quechua", "en")), Collections.emptyList()),

    /** 
    */
    RM("https://w3id.org/idsa/code/RM", Arrays.asList(new TypedLiteral("Romansh", "en")), Collections.emptyList()),

    /** 
    */
    RN("https://w3id.org/idsa/code/RN", Arrays.asList(new TypedLiteral("Kirundi", "en")), Collections.emptyList()),

    /** 
    */
    RO("https://w3id.org/idsa/code/RO", Arrays.asList(new TypedLiteral("Romanian", "en")), Collections.emptyList()),

    /** 
    */
    RU("https://w3id.org/idsa/code/RU", Arrays.asList(new TypedLiteral("Russian", "en")), Collections.emptyList()),

    /** 
    */
    RW("https://w3id.org/idsa/code/RW", Arrays.asList(new TypedLiteral("Kinyarwanda", "en")), Collections.emptyList()),

    /** 
    */
    SA("https://w3id.org/idsa/code/SA", Arrays.asList(new TypedLiteral("Sanskrit (Sa�?skṛta)", "en")), Collections.emptyList()),

    /** 
    */
    SC("https://w3id.org/idsa/code/SC", Arrays.asList(new TypedLiteral("Sardinian", "en")), Collections.emptyList()),

    /** 
    */
    SD("https://w3id.org/idsa/code/SD", Arrays.asList(new TypedLiteral("Sindhi", "en")), Collections.emptyList()),

    /** 
    */
    SE("https://w3id.org/idsa/code/SE", Arrays.asList(new TypedLiteral("Northern Sami", "en")), Collections.emptyList()),

    /** 
    */
    SG("https://w3id.org/idsa/code/SG", Arrays.asList(new TypedLiteral("Sango", "en")), Collections.emptyList()),

    /** 
    */
    SI("https://w3id.org/idsa/code/SI", Arrays.asList(new TypedLiteral("Sinhalese, Sinhala", "en")), Collections.emptyList()),

    /** 
    */
    SK("https://w3id.org/idsa/code/SK", Arrays.asList(new TypedLiteral("Slovak", "en")), Collections.emptyList()),

    /** 
    */
    SL("https://w3id.org/idsa/code/SL", Arrays.asList(new TypedLiteral("Slovene", "en")), Collections.emptyList()),

    /** 
    */
    SM("https://w3id.org/idsa/code/SM", Arrays.asList(new TypedLiteral("Samoan", "en")), Collections.emptyList()),

    /** 
    */
    SN("https://w3id.org/idsa/code/SN", Arrays.asList(new TypedLiteral("Shona", "en")), Collections.emptyList()),

    /** 
    */
    SO("https://w3id.org/idsa/code/SO", Arrays.asList(new TypedLiteral("Somali", "en")), Collections.emptyList()),

    /** 
    */
    SQ("https://w3id.org/idsa/code/SQ", Arrays.asList(new TypedLiteral("Albanian", "en")), Collections.emptyList()),

    /** 
    */
    SR("https://w3id.org/idsa/code/SR", Arrays.asList(new TypedLiteral("Serbian", "en")), Collections.emptyList()),

    /** 
    */
    SS("https://w3id.org/idsa/code/SS", Arrays.asList(new TypedLiteral("Swati", "en")), Collections.emptyList()),

    /** 
    */
    ST("https://w3id.org/idsa/code/ST", Arrays.asList(new TypedLiteral("Southern Sotho", "en")), Collections.emptyList()),

    /** 
    */
    SU("https://w3id.org/idsa/code/SU", Arrays.asList(new TypedLiteral("Sundanese", "en")), Collections.emptyList()),

    /** 
    */
    SV("https://w3id.org/idsa/code/SV", Arrays.asList(new TypedLiteral("Swedish", "en")), Collections.emptyList()),

    /** 
    */
    SW("https://w3id.org/idsa/code/SW", Arrays.asList(new TypedLiteral("Swahili", "en")), Collections.emptyList()),

    /** 
    */
    TA("https://w3id.org/idsa/code/TA", Arrays.asList(new TypedLiteral("Tamil", "en")), Collections.emptyList()),

    /** 
    */
    TE("https://w3id.org/idsa/code/TE", Arrays.asList(new TypedLiteral("Telugu", "en")), Collections.emptyList()),

    /** 
    */
    TG("https://w3id.org/idsa/code/TG", Arrays.asList(new TypedLiteral("Tajik", "en")), Collections.emptyList()),

    /** 
    */
    TH("https://w3id.org/idsa/code/TH", Arrays.asList(new TypedLiteral("Thai", "en")), Collections.emptyList()),

    /** 
    */
    TI("https://w3id.org/idsa/code/TI", Arrays.asList(new TypedLiteral("Tigrinya", "en")), Collections.emptyList()),

    /** 
    */
    TK("https://w3id.org/idsa/code/TK", Arrays.asList(new TypedLiteral("Turkmen", "en")), Collections.emptyList()),

    /** 
    */
    TL("https://w3id.org/idsa/code/TL", Arrays.asList(new TypedLiteral("Tagalog", "en")), Collections.emptyList()),

    /** 
    */
    TN("https://w3id.org/idsa/code/TN", Arrays.asList(new TypedLiteral("Tswana", "en")), Collections.emptyList()),

    /** 
    */
    TO("https://w3id.org/idsa/code/TO", Arrays.asList(new TypedLiteral("Tonga (Tonga Islands)", "en")), Collections.emptyList()),

    /** 
    */
    TR("https://w3id.org/idsa/code/TR", Arrays.asList(new TypedLiteral("Turkish", "en")), Collections.emptyList()),

    /** 
    */
    TS("https://w3id.org/idsa/code/TS", Arrays.asList(new TypedLiteral("Tsonga", "en")), Collections.emptyList()),

    /** 
    */
    TT("https://w3id.org/idsa/code/TT", Arrays.asList(new TypedLiteral("Tatar", "en")), Collections.emptyList()),

    /** 
    */
    TW("https://w3id.org/idsa/code/TW", Arrays.asList(new TypedLiteral("Twi", "en")), Collections.emptyList()),

    /** 
    */
    TY("https://w3id.org/idsa/code/TY", Arrays.asList(new TypedLiteral("Tahitian", "en")), Collections.emptyList()),

    /** 
    */
    UG("https://w3id.org/idsa/code/UG", Arrays.asList(new TypedLiteral("Uyghur", "en")), Collections.emptyList()),

    /** 
    */
    UK("https://w3id.org/idsa/code/UK", Arrays.asList(new TypedLiteral("Ukrainian", "en")), Collections.emptyList()),

    /** 
    */
    UR("https://w3id.org/idsa/code/UR", Arrays.asList(new TypedLiteral("Urdu", "en")), Collections.emptyList()),

    /** 
    */
    UZ("https://w3id.org/idsa/code/UZ", Arrays.asList(new TypedLiteral("Uzbek", "en")), Collections.emptyList()),

    /** 
    */
    VE("https://w3id.org/idsa/code/VE", Arrays.asList(new TypedLiteral("Venda", "en")), Collections.emptyList()),

    /** 
    */
    VI("https://w3id.org/idsa/code/VI", Arrays.asList(new TypedLiteral("Vietnamese", "en")), Collections.emptyList()),

    /** 
    */
    VO("https://w3id.org/idsa/code/VO", Arrays.asList(new TypedLiteral("Volapük", "en")), Collections.emptyList()),

    /** 
    */
    WA("https://w3id.org/idsa/code/WA", Arrays.asList(new TypedLiteral("Walloon", "en")), Collections.emptyList()),

    /** 
    */
    WO("https://w3id.org/idsa/code/WO", Arrays.asList(new TypedLiteral("Wolof", "en")), Collections.emptyList()),

    /** 
    */
    XH("https://w3id.org/idsa/code/XH", Arrays.asList(new TypedLiteral("Xhosa", "en")), Collections.emptyList()),

    /** 
    */
    YI("https://w3id.org/idsa/code/YI", Arrays.asList(new TypedLiteral("Yiddish", "en")), Collections.emptyList()),

    /** 
    */
    YO("https://w3id.org/idsa/code/YO", Arrays.asList(new TypedLiteral("Yoruba", "en")), Collections.emptyList()),

    /** 
    */
    ZA("https://w3id.org/idsa/code/ZA", Arrays.asList(new TypedLiteral("Zhuang, Chuang", "en")), Collections.emptyList()),

    /** 
    */
    ZH("https://w3id.org/idsa/code/ZH", Arrays.asList(new TypedLiteral("Chinese", "en")), Collections.emptyList()),

    /** 
    */
    ZU("https://w3id.org/idsa/code/ZU", Arrays.asList(new TypedLiteral("Zulu", "en")), Collections.emptyList());

    private static final Map<String, Language> uriInstanceMapping;
    static {
        uriInstanceMapping = new HashMap<>();
        uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
        uriInstanceMapping
            .putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
    }

    private URI id;
    private List<TypedLiteral> label;
    private List<TypedLiteral> comment;

    Language(String id, List<TypedLiteral> label, List<TypedLiteral> comment) {
        try {
            this.id = new URI(id);
            this.label = label;
            this.comment = comment;
        } catch (java.net.URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    // TODO dummy method for generic properties, should be deleted in future versions
    public Map<String, Object> getProperties() {
        return null;
    }

    public void setProperty(String property, Object value) {
        // do nothing
    }

    /**
     * This function retrieves the ID of the current object (can be set via the constructor of the
     * builder class)
     * 
     * @return ID of current object as URI
     */

    @JsonIgnore
    @Override
    final public URI getId() {
        return id;
    }

    /**
     * This function retrieves a human readable label about the current class, as defined in the
     * ontology. This label could, for example, be used as a field heading in a user interface
     * 
     * @return Human readable label
     */
    @JsonIgnore
    @Override
    final public List<TypedLiteral> getLabel() {
        return label;
    }

    /**
     * This function retrieves a human readable explanatory comment about the current class, as defined
     * in the ontology. This comment could, for example, be used as a tooltip in a user interface
     * 
     * @return Human readable explanatory comment
     */
    @JsonIgnore
    @Override
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
