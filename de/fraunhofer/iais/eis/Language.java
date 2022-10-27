package de.fraunhofer.iais.eis;

import java.net.URI;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import de.fraunhofer.iais.eis.util.*;

/**
 * The class of languages potentially being used by textual Data Assets.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = LanguageImpl.class)
})
public interface Language extends ModelClass {

    // standard methods

    @Beta
    public Language deepCopy();

    // Default instances of this class as defined in the ontology

    /** 
    */
    Language AA = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/AA")).build();

    /** 
    */
    Language AB = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/AB")).build();

    /** 
    */
    Language AE = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/AE")).build();

    /** 
    */
    Language AF = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/AF")).build();

    /** 
    */
    Language AK = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/AK")).build();

    /** 
    */
    Language AM = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/AM")).build();

    /** 
    */
    Language AN = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/AN")).build();

    /** 
    */
    Language AR = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/AR")).build();

    /** 
    */
    Language AS = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/AS")).build();

    /** 
    */
    Language AV = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/AV")).build();

    /** 
    */
    Language AY = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/AY")).build();

    /** 
    */
    Language AZ = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/AZ")).build();

    /** 
    */
    Language BA = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/BA")).build();

    /** 
    */
    Language BE = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/BE")).build();

    /** 
    */
    Language BG = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/BG")).build();

    /** 
    */
    Language BH = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/BH")).build();

    /** 
    */
    Language BI = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/BI")).build();

    /** 
    */
    Language BM = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/BM")).build();

    /** 
    */
    Language BN = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/BN")).build();

    /** 
    */
    Language BO = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/BO")).build();

    /** 
    */
    Language BR = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/BR")).build();

    /** 
    */
    Language BS = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/BS")).build();

    /** 
    */
    Language CA = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/CA")).build();

    /** 
    */
    Language CE = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/CE")).build();

    /** 
    */
    Language CH = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/CH")).build();

    /** 
    */
    Language CO = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/CO")).build();

    /** 
    */
    Language CR = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/CR")).build();

    /** 
    */
    Language CS = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/CS")).build();

    /** 
    */
    Language CU = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/CU")).build();

    /** 
    */
    Language CV = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/CV")).build();

    /** 
    */
    Language CY = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/CY")).build();

    /** 
    */
    Language DA = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/DA")).build();

    /** 
    */
    Language DE = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/DE")).build();

    /** 
    */
    Language DV = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/DV")).build();

    /** 
    */
    Language DZ = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/DZ")).build();

    /** 
    */
    Language EE = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/EE")).build();

    /** 
    */
    Language EL = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/EL")).build();

    /** 
    */
    Language EN = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/EN")).build();

    /** 
    */
    Language EO = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/EO")).build();

    /** 
    */
    Language ES = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/ES")).build();

    /** 
    */
    Language ET = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/ET")).build();

    /** 
    */
    Language EU = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/EU")).build();

    /** 
    */
    Language FA = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/FA")).build();

    /** 
    */
    Language FF = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/FF")).build();

    /** 
    */
    Language FI = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/FI")).build();

    /** 
    */
    Language FJ = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/FJ")).build();

    /** 
    */
    Language FO = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/FO")).build();

    /** 
    */
    Language FR = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/FR")).build();

    /** 
    */
    Language FY = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/FY")).build();

    /** 
    */
    Language GA = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/GA")).build();

    /** 
    */
    Language GD = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/GD")).build();

    /** 
    */
    Language GL = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/GL")).build();

    /** 
    */
    Language GN = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/GN")).build();

    /** 
    */
    Language GU = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/GU")).build();

    /** 
    */
    Language GV = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/GV")).build();

    /** 
    */
    Language HA = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/HA")).build();

    /** 
    */
    Language HE = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/HE")).build();

    /** 
    */
    Language HI = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/HI")).build();

    /** 
    */
    Language HO = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/HO")).build();

    /** 
    */
    Language HR = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/HR")).build();

    /** 
    */
    Language HT = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/HT")).build();

    /** 
    */
    Language HU = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/HU")).build();

    /** 
    */
    Language HY = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/HY")).build();

    /** 
    */
    Language HZ = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/HZ")).build();

    /** 
    */
    Language IA = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/IA")).build();

    /** 
    */
    Language ID = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/ID")).build();

    /** 
    */
    Language IE = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/IE")).build();

    /** 
    */
    Language IG = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/IG")).build();

    /** 
    */
    Language II = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/II")).build();

    /** 
    */
    Language IK = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/IK")).build();

    /** 
    */
    Language IO = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/IO")).build();

    /** 
    */
    Language IS = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/IS")).build();

    /** 
    */
    Language IT = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/IT")).build();

    /** 
    */
    Language IU = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/IU")).build();

    /** 
    */
    Language JA = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/JA")).build();

    /** 
    */
    Language JV = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/JV")).build();

    /** 
    */
    Language KA = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/KA")).build();

    /** 
    */
    Language KG = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/KG")).build();

    /** 
    */
    Language KI = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/KI")).build();

    /** 
    */
    Language KJ = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/KJ")).build();

    /** 
    */
    Language KK = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/KK")).build();

    /** 
    */
    Language KL = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/KL")).build();

    /** 
    */
    Language KM = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/KM")).build();

    /** 
    */
    Language KN = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/KN")).build();

    /** 
    */
    Language KO = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/KO")).build();

    /** 
    */
    Language KR = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/KR")).build();

    /** 
    */
    Language KS = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/KS")).build();

    /** 
    */
    Language KU = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/KU")).build();

    /** 
    */
    Language KV = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/KV")).build();

    /** 
    */
    Language KW = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/KW")).build();

    /** 
    */
    Language KY = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/KY")).build();

    /** 
    */
    Language LA = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/LA")).build();

    /** 
    */
    Language LB = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/LB")).build();

    /** 
    */
    Language LG = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/LG")).build();

    /** 
    */
    Language LI = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/LI")).build();

    /** 
    */
    Language LN = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/LN")).build();

    /** 
    */
    Language LO = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/LO")).build();

    /**
     * Less-than operator. Can be used for numeric (2 idsc:LT 5) comparisons. Do not confuse with
     * idsc:LT (which is a language).
     */
    Language LT = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/LT")).build();

    /** 
    */
    Language LU = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/LU")).build();

    /** 
    */
    Language LV = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/LV")).build();

    /** 
    */
    Language MG = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/MG")).build();

    /** 
    */
    Language MH = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/MH")).build();

    /** 
    */
    Language MI = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/MI")).build();

    /** 
    */
    Language MK = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/MK")).build();

    /** 
    */
    Language ML = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/ML")).build();

    /** 
    */
    Language MN = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/MN")).build();

    /** 
    */
    Language MR = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/MR")).build();

    /** 
    */
    Language MS = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/MS")).build();

    /** 
    */
    Language MT = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/MT")).build();

    /**
     * Code indicates that several languages are used or no concrete language can be determined.
     */
    Language MULTI_LINGUAL = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/MULTI_LINGUAL")).build();

    /** 
    */
    Language MY = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/MY")).build();

    /** 
    */
    Language NA = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/NA")).build();

    /** 
    */
    Language NB = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/NB")).build();

    /** 
    */
    Language ND = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/ND")).build();

    /** 
    */
    Language NE = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/NE")).build();

    /** 
    */
    Language NG = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/NG")).build();

    /** 
    */
    Language NL = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/NL")).build();

    /** 
    */
    Language NN = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/NN")).build();

    /** 
    */
    Language NO = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/NO")).build();

    /** 
    */
    Language NR = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/NR")).build();

    /** 
    */
    Language NV = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/NV")).build();

    /** 
    */
    Language NY = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/NY")).build();

    /** 
    */
    Language OC = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/OC")).build();

    /** 
    */
    Language OJ = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/OJ")).build();

    /** 
    */
    Language OM = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/OM")).build();

    /** 
    */
    Language OR = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/OR")).build();

    /** 
    */
    Language OS = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/OS")).build();

    /** 
    */
    Language PA = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/PA")).build();

    /** 
    */
    Language PI = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/PI")).build();

    /** 
    */
    Language PL = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/PL")).build();

    /** 
    */
    Language PS = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/PS")).build();

    /** 
    */
    Language PT = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/PT")).build();

    /** 
    */
    Language QU = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/QU")).build();

    /** 
    */
    Language RM = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/RM")).build();

    /** 
    */
    Language RN = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/RN")).build();

    /** 
    */
    Language RO = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/RO")).build();

    /** 
    */
    Language RU = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/RU")).build();

    /** 
    */
    Language RW = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/RW")).build();

    /** 
    */
    Language SA = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/SA")).build();

    /** 
    */
    Language SC = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/SC")).build();

    /** 
    */
    Language SD = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/SD")).build();

    /** 
    */
    Language SE = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/SE")).build();

    /** 
    */
    Language SG = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/SG")).build();

    /** 
    */
    Language SI = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/SI")).build();

    /** 
    */
    Language SK = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/SK")).build();

    /** 
    */
    Language SL = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/SL")).build();

    /** 
    */
    Language SM = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/SM")).build();

    /** 
    */
    Language SN = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/SN")).build();

    /** 
    */
    Language SO = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/SO")).build();

    /** 
    */
    Language SQ = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/SQ")).build();

    /** 
    */
    Language SR = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/SR")).build();

    /** 
    */
    Language SS = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/SS")).build();

    /** 
    */
    Language ST = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/ST")).build();

    /** 
    */
    Language SU = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/SU")).build();

    /** 
    */
    Language SV = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/SV")).build();

    /** 
    */
    Language SW = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/SW")).build();

    /** 
    */
    Language TA = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/TA")).build();

    /** 
    */
    Language TE = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/TE")).build();

    /** 
    */
    Language TG = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/TG")).build();

    /** 
    */
    Language TH = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/TH")).build();

    /** 
    */
    Language TI = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/TI")).build();

    /** 
    */
    Language TK = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/TK")).build();

    /** 
    */
    Language TL = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/TL")).build();

    /** 
    */
    Language TN = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/TN")).build();

    /** 
    */
    Language TO = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/TO")).build();

    /** 
    */
    Language TR = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/TR")).build();

    /** 
    */
    Language TS = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/TS")).build();

    /** 
    */
    Language TT = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/TT")).build();

    /** 
    */
    Language TW = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/TW")).build();

    /** 
    */
    Language TY = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/TY")).build();

    /** 
    */
    Language UG = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/UG")).build();

    /** 
    */
    Language UK = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/UK")).build();

    /** 
    */
    Language UR = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/UR")).build();

    /** 
    */
    Language UZ = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/UZ")).build();

    /** 
    */
    Language VE = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/VE")).build();

    /** 
    */
    Language VI = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/VI")).build();

    /** 
    */
    Language VO = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/VO")).build();

    /** 
    */
    Language WA = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/WA")).build();

    /** 
    */
    Language WO = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/WO")).build();

    /** 
    */
    Language XH = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/XH")).build();

    /** 
    */
    Language YI = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/YI")).build();

    /** 
    */
    Language YO = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/YO")).build();

    /** 
    */
    Language ZA = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/ZA")).build();

    /** 
    */
    Language ZH = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/ZH")).build();

    /** 
    */
    Language ZU = new LanguageBuilder(URI.create("https://w3id.org/idsa/code/ZU")).build();

}
