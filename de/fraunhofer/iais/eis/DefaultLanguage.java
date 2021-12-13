package de.fraunhofer.iais.eis;

import java.net.URI;
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
public enum DefaultLanguage implements Language {

    /** 
    */
    AA("https://w3id.org/idsa/code/AA"),

    /** 
    */
    AB("https://w3id.org/idsa/code/AB"),

    /** 
    */
    AE("https://w3id.org/idsa/code/AE"),

    /** 
    */
    AF("https://w3id.org/idsa/code/AF"),

    /** 
    */
    AK("https://w3id.org/idsa/code/AK"),

    /** 
    */
    AM("https://w3id.org/idsa/code/AM"),

    /** 
    */
    AN("https://w3id.org/idsa/code/AN"),

    /** 
    */
    AR("https://w3id.org/idsa/code/AR"),

    /** 
    */
    AS("https://w3id.org/idsa/code/AS"),

    /** 
    */
    AV("https://w3id.org/idsa/code/AV"),

    /** 
    */
    AY("https://w3id.org/idsa/code/AY"),

    /** 
    */
    AZ("https://w3id.org/idsa/code/AZ"),

    /** 
    */
    BA("https://w3id.org/idsa/code/BA"),

    /** 
    */
    BE("https://w3id.org/idsa/code/BE"),

    /** 
    */
    BG("https://w3id.org/idsa/code/BG"),

    /** 
    */
    BH("https://w3id.org/idsa/code/BH"),

    /** 
    */
    BI("https://w3id.org/idsa/code/BI"),

    /** 
    */
    BM("https://w3id.org/idsa/code/BM"),

    /** 
    */
    BN("https://w3id.org/idsa/code/BN"),

    /** 
    */
    BO("https://w3id.org/idsa/code/BO"),

    /** 
    */
    BR("https://w3id.org/idsa/code/BR"),

    /** 
    */
    BS("https://w3id.org/idsa/code/BS"),

    /** 
    */
    CA("https://w3id.org/idsa/code/CA"),

    /** 
    */
    CE("https://w3id.org/idsa/code/CE"),

    /** 
    */
    CH("https://w3id.org/idsa/code/CH"),

    /** 
    */
    CO("https://w3id.org/idsa/code/CO"),

    /** 
    */
    CR("https://w3id.org/idsa/code/CR"),

    /** 
    */
    CS("https://w3id.org/idsa/code/CS"),

    /** 
    */
    CU("https://w3id.org/idsa/code/CU"),

    /** 
    */
    CV("https://w3id.org/idsa/code/CV"),

    /** 
    */
    CY("https://w3id.org/idsa/code/CY"),

    /** 
    */
    DA("https://w3id.org/idsa/code/DA"),

    /** 
    */
    DE("https://w3id.org/idsa/code/DE"),

    /** 
    */
    DV("https://w3id.org/idsa/code/DV"),

    /** 
    */
    DZ("https://w3id.org/idsa/code/DZ"),

    /** 
    */
    EE("https://w3id.org/idsa/code/EE"),

    /** 
    */
    EL("https://w3id.org/idsa/code/EL"),

    /** 
    */
    EN("https://w3id.org/idsa/code/EN"),

    /** 
    */
    EO("https://w3id.org/idsa/code/EO"),

    /** 
    */
    ES("https://w3id.org/idsa/code/ES"),

    /** 
    */
    ET("https://w3id.org/idsa/code/ET"),

    /** 
    */
    EU("https://w3id.org/idsa/code/EU"),

    /** 
    */
    FA("https://w3id.org/idsa/code/FA"),

    /** 
    */
    FF("https://w3id.org/idsa/code/FF"),

    /** 
    */
    FI("https://w3id.org/idsa/code/FI"),

    /** 
    */
    FJ("https://w3id.org/idsa/code/FJ"),

    /** 
    */
    FO("https://w3id.org/idsa/code/FO"),

    /** 
    */
    FR("https://w3id.org/idsa/code/FR"),

    /** 
    */
    FY("https://w3id.org/idsa/code/FY"),

    /** 
    */
    GA("https://w3id.org/idsa/code/GA"),

    /** 
    */
    GD("https://w3id.org/idsa/code/GD"),

    /** 
    */
    GL("https://w3id.org/idsa/code/GL"),

    /** 
    */
    GN("https://w3id.org/idsa/code/GN"),

    /** 
    */
    GU("https://w3id.org/idsa/code/GU"),

    /** 
    */
    GV("https://w3id.org/idsa/code/GV"),

    /** 
    */
    HA("https://w3id.org/idsa/code/HA"),

    /** 
    */
    HE("https://w3id.org/idsa/code/HE"),

    /** 
    */
    HI("https://w3id.org/idsa/code/HI"),

    /** 
    */
    HO("https://w3id.org/idsa/code/HO"),

    /** 
    */
    HR("https://w3id.org/idsa/code/HR"),

    /** 
    */
    HT("https://w3id.org/idsa/code/HT"),

    /** 
    */
    HU("https://w3id.org/idsa/code/HU"),

    /** 
    */
    HY("https://w3id.org/idsa/code/HY"),

    /** 
    */
    HZ("https://w3id.org/idsa/code/HZ"),

    /** 
    */
    IA("https://w3id.org/idsa/code/IA"),

    /** 
    */
    ID("https://w3id.org/idsa/code/ID"),

    /** 
    */
    IE("https://w3id.org/idsa/code/IE"),

    /** 
    */
    IG("https://w3id.org/idsa/code/IG"),

    /** 
    */
    II("https://w3id.org/idsa/code/II"),

    /** 
    */
    IK("https://w3id.org/idsa/code/IK"),

    /** 
    */
    IO("https://w3id.org/idsa/code/IO"),

    /** 
    */
    IS("https://w3id.org/idsa/code/IS"),

    /** 
    */
    IT("https://w3id.org/idsa/code/IT"),

    /** 
    */
    IU("https://w3id.org/idsa/code/IU"),

    /** 
    */
    JA("https://w3id.org/idsa/code/JA"),

    /** 
    */
    JV("https://w3id.org/idsa/code/JV"),

    /** 
    */
    KA("https://w3id.org/idsa/code/KA"),

    /** 
    */
    KG("https://w3id.org/idsa/code/KG"),

    /** 
    */
    KI("https://w3id.org/idsa/code/KI"),

    /** 
    */
    KJ("https://w3id.org/idsa/code/KJ"),

    /** 
    */
    KK("https://w3id.org/idsa/code/KK"),

    /** 
    */
    KL("https://w3id.org/idsa/code/KL"),

    /** 
    */
    KM("https://w3id.org/idsa/code/KM"),

    /** 
    */
    KN("https://w3id.org/idsa/code/KN"),

    /** 
    */
    KO("https://w3id.org/idsa/code/KO"),

    /** 
    */
    KR("https://w3id.org/idsa/code/KR"),

    /** 
    */
    KS("https://w3id.org/idsa/code/KS"),

    /** 
    */
    KU("https://w3id.org/idsa/code/KU"),

    /** 
    */
    KV("https://w3id.org/idsa/code/KV"),

    /** 
    */
    KW("https://w3id.org/idsa/code/KW"),

    /** 
    */
    KY("https://w3id.org/idsa/code/KY"),

    /** 
    */
    LA("https://w3id.org/idsa/code/LA"),

    /** 
    */
    LB("https://w3id.org/idsa/code/LB"),

    /** 
    */
    LG("https://w3id.org/idsa/code/LG"),

    /** 
    */
    LI("https://w3id.org/idsa/code/LI"),

    /** 
    */
    LN("https://w3id.org/idsa/code/LN"),

    /** 
    */
    LO("https://w3id.org/idsa/code/LO"),

    /**
     * Less-than operator. Can be used for numeric (2 idsc:LT 5) comparisons. Do not confuse with
     * idsc:LT (which is a language).
     */
    LT("https://w3id.org/idsa/code/LT"),

    /** 
    */
    LU("https://w3id.org/idsa/code/LU"),

    /** 
    */
    LV("https://w3id.org/idsa/code/LV"),

    /** 
    */
    MG("https://w3id.org/idsa/code/MG"),

    /** 
    */
    MH("https://w3id.org/idsa/code/MH"),

    /** 
    */
    MI("https://w3id.org/idsa/code/MI"),

    /** 
    */
    MK("https://w3id.org/idsa/code/MK"),

    /** 
    */
    ML("https://w3id.org/idsa/code/ML"),

    /** 
    */
    MN("https://w3id.org/idsa/code/MN"),

    /** 
    */
    MR("https://w3id.org/idsa/code/MR"),

    /** 
    */
    MS("https://w3id.org/idsa/code/MS"),

    /** 
    */
    MT("https://w3id.org/idsa/code/MT"),

    /**
     * Code indicates that several languages are used or no concrete language can be determined.
     */
    MULTI_LINGUAL("https://w3id.org/idsa/code/MULTI_LINGUAL"),

    /** 
    */
    MY("https://w3id.org/idsa/code/MY"),

    /** 
    */
    NA("https://w3id.org/idsa/code/NA"),

    /** 
    */
    NB("https://w3id.org/idsa/code/NB"),

    /** 
    */
    ND("https://w3id.org/idsa/code/ND"),

    /** 
    */
    NE("https://w3id.org/idsa/code/NE"),

    /** 
    */
    NG("https://w3id.org/idsa/code/NG"),

    /** 
    */
    NL("https://w3id.org/idsa/code/NL"),

    /** 
    */
    NN("https://w3id.org/idsa/code/NN"),

    /** 
    */
    NO("https://w3id.org/idsa/code/NO"),

    /** 
    */
    NR("https://w3id.org/idsa/code/NR"),

    /** 
    */
    NV("https://w3id.org/idsa/code/NV"),

    /** 
    */
    NY("https://w3id.org/idsa/code/NY"),

    /** 
    */
    OC("https://w3id.org/idsa/code/OC"),

    /** 
    */
    OJ("https://w3id.org/idsa/code/OJ"),

    /** 
    */
    OM("https://w3id.org/idsa/code/OM"),

    /** 
    */
    OR("https://w3id.org/idsa/code/OR"),

    /** 
    */
    OS("https://w3id.org/idsa/code/OS"),

    /** 
    */
    PA("https://w3id.org/idsa/code/PA"),

    /** 
    */
    PI("https://w3id.org/idsa/code/PI"),

    /** 
    */
    PL("https://w3id.org/idsa/code/PL"),

    /** 
    */
    PS("https://w3id.org/idsa/code/PS"),

    /** 
    */
    PT("https://w3id.org/idsa/code/PT"),

    /** 
    */
    QU("https://w3id.org/idsa/code/QU"),

    /** 
    */
    RM("https://w3id.org/idsa/code/RM"),

    /** 
    */
    RN("https://w3id.org/idsa/code/RN"),

    /** 
    */
    RO("https://w3id.org/idsa/code/RO"),

    /** 
    */
    RU("https://w3id.org/idsa/code/RU"),

    /** 
    */
    RW("https://w3id.org/idsa/code/RW"),

    /** 
    */
    SA("https://w3id.org/idsa/code/SA"),

    /** 
    */
    SC("https://w3id.org/idsa/code/SC"),

    /** 
    */
    SD("https://w3id.org/idsa/code/SD"),

    /** 
    */
    SE("https://w3id.org/idsa/code/SE"),

    /** 
    */
    SG("https://w3id.org/idsa/code/SG"),

    /** 
    */
    SI("https://w3id.org/idsa/code/SI"),

    /** 
    */
    SK("https://w3id.org/idsa/code/SK"),

    /** 
    */
    SL("https://w3id.org/idsa/code/SL"),

    /** 
    */
    SM("https://w3id.org/idsa/code/SM"),

    /** 
    */
    SN("https://w3id.org/idsa/code/SN"),

    /** 
    */
    SO("https://w3id.org/idsa/code/SO"),

    /** 
    */
    SQ("https://w3id.org/idsa/code/SQ"),

    /** 
    */
    SR("https://w3id.org/idsa/code/SR"),

    /** 
    */
    SS("https://w3id.org/idsa/code/SS"),

    /** 
    */
    ST("https://w3id.org/idsa/code/ST"),

    /** 
    */
    SU("https://w3id.org/idsa/code/SU"),

    /** 
    */
    SV("https://w3id.org/idsa/code/SV"),

    /** 
    */
    SW("https://w3id.org/idsa/code/SW"),

    /** 
    */
    TA("https://w3id.org/idsa/code/TA"),

    /** 
    */
    TE("https://w3id.org/idsa/code/TE"),

    /** 
    */
    TG("https://w3id.org/idsa/code/TG"),

    /** 
    */
    TH("https://w3id.org/idsa/code/TH"),

    /** 
    */
    TI("https://w3id.org/idsa/code/TI"),

    /** 
    */
    TK("https://w3id.org/idsa/code/TK"),

    /** 
    */
    TL("https://w3id.org/idsa/code/TL"),

    /** 
    */
    TN("https://w3id.org/idsa/code/TN"),

    /** 
    */
    TO("https://w3id.org/idsa/code/TO"),

    /** 
    */
    TR("https://w3id.org/idsa/code/TR"),

    /** 
    */
    TS("https://w3id.org/idsa/code/TS"),

    /** 
    */
    TT("https://w3id.org/idsa/code/TT"),

    /** 
    */
    TW("https://w3id.org/idsa/code/TW"),

    /** 
    */
    TY("https://w3id.org/idsa/code/TY"),

    /** 
    */
    UG("https://w3id.org/idsa/code/UG"),

    /** 
    */
    UK("https://w3id.org/idsa/code/UK"),

    /** 
    */
    UR("https://w3id.org/idsa/code/UR"),

    /** 
    */
    UZ("https://w3id.org/idsa/code/UZ"),

    /** 
    */
    VE("https://w3id.org/idsa/code/VE"),

    /** 
    */
    VI("https://w3id.org/idsa/code/VI"),

    /** 
    */
    VO("https://w3id.org/idsa/code/VO"),

    /** 
    */
    WA("https://w3id.org/idsa/code/WA"),

    /** 
    */
    WO("https://w3id.org/idsa/code/WO"),

    /** 
    */
    XH("https://w3id.org/idsa/code/XH"),

    /** 
    */
    YI("https://w3id.org/idsa/code/YI"),

    /** 
    */
    YO("https://w3id.org/idsa/code/YO"),

    /** 
    */
    ZA("https://w3id.org/idsa/code/ZA"),

    /** 
    */
    ZH("https://w3id.org/idsa/code/ZH"),

    /** 
    */
    ZU("https://w3id.org/idsa/code/ZU"),;

    private static final Map<String, DefaultLanguage> uriInstanceMapping;
    static {
        uriInstanceMapping = new HashMap<>();
        uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
        uriInstanceMapping
            .putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
    }

    private Language language;

    DefaultLanguage(String id) {
        this.language = new LanguageBuilder(URI.create(id)).build();
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
        return this.language.getId();
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
        return this.language.getLabel();
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
        return this.language.getComment();
    }

    public String toRdf() {
        return VocabUtil.getInstance().toRdf(this);
    }

    @JsonProperty("@id")
    final public URI getSerializedId() {
        return this.language.getId();
    }

    @JsonCreator
    public static DefaultLanguage deserialize(JsonNode node) {
        return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
    }

    @Override
    public String toString() {
        return this.language.getId().toString();
    }

    @Override
    public Language deepCopy() {
        // not implemented for enums
        throw new UnsupportedOperationException();
    }

}
