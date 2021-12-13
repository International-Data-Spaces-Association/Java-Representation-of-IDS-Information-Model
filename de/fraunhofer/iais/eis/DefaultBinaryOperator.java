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
 * The class of binary operators.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:BinaryOperator")
public enum DefaultBinaryOperator implements BinaryOperator {

    /**
     * If a temporal entity T1 is after another temporal entity T2, then the beginning of T1 is after
     * the end of T2 and the beginning of T1 is different to the ending of T2. Temporal entities can
     * either be a xsd:dateTimeStamp or an ids:TemporalEntity.
     */
    AFTER("https://w3id.org/idsa/code/AFTER"),

    /**
     * If a temporal entity T1 is before another temporal entity T2, then the ending of T1 is before the
     * end of T2 and the ending of T1 is different to the beginning of T2. Temporal entities can either
     * be a xsd:dateTimeStamp or an ids:TemporalEntity. Compares an instance of ids:TemporalEntity or a
     * Literal of xsd:dateTimeStamp to an instance of ids:TemporalEntity or a Literal of
     * xsd:dateTimeStamp.
     */
    BEFORE("https://w3id.org/idsa/code/BEFORE"),

    /**
     * If a TemporalEntity (or xsd:dateTimeStamp) T1 contains another ids:TemporalEntity T2, then the
     * beginning of T1 is idsc:AFTER the beginning of T2 and the ending of T1 is idsc:BEFORE the ending
     * of T2. An Instant (or xsd:dateTimeStamp) cannot contain another Instant (or xsd:dateTimeStamp),
     * neihter contains itself. Compares an instance of ids:Instant, ids:Interval or xsd:dateTimeStamp
     * with an instance of ids:Interval. Evaluates to false if compared to a non ids:Interval.
     */
    CONTAINS("https://w3id.org/idsa/code/CONTAINS"),

    /**
     * Spatial operator 'covered by' as defined by the Egenhofer Topological Relations family: An object
     * A is covered_by another object B if both objects share common bounding and interior faces; if A
     * has interior faces which are bounding faces of B; and if none of B's interior faces are part of
     * A's boundary. (https://doi.org/10.1007/3-540-51295-0_148 Definition 7)
     */
    COVERED_BY("https://w3id.org/idsa/code/COVERED_BY"),

    /**
     * Spatial operator 'covers' as defined by the Egenhofer Topological Relations family: An object A
     * covers another object B if both objects share common bounding and interior faces; if B has
     * interior faces which are bounding faces of A; and if none of A's interior faces are part of B's
     * boundary. (https://doi.org/10.1007/3-540-51295-0_148 Definition 6)
     */
    COVERS("https://w3id.org/idsa/code/COVERS"),

    /**
     * Allows assignments similar to 'var x := {RightOperand}'. Different to the other
     * ids:BinaryOperator, idsc:DEFINES_AS does *not* compare a feature but tells the interpreter where
     * to *find* one. Therefore, the constraint is not evaluated in the same way as with other
     * operators.
     */
    DEFINES_AS("https://w3id.org/idsa/code/DEFINES_AS"),

    /**
     * Spatial operator 'disjoint' as defined by the Egenhofer Topological Relations family: If all four
     * intersections among all object parts are empty, then the two objects are disjoint.
     * (https://doi.org/10.1007/3-540-51295-0_148 Definition 1)
     */
    DISJOINT("https://w3id.org/idsa/code/DISJOINT"),

    /**
     * If a temporal entity T1 has the same duration as another temporal entity T2, then their length or
     * their duration is equal. Instants and xsd:dateTimeStamp Literals have always the duration
     * 'P0Y0M0DT0H0M0S'^^xsd:duration and therefore have always the same duration. Compares an instance
     * of ids:TemporalEntity with an instance of ids:TemporalEntity.
     */
    DURATION_EQ("https://w3id.org/idsa/code/DURATION_EQ"),

    /**
     * If a TemporalEntity T1 is during another TemporalEntity T2, then the beginning of T1 is after the
     * beginning of T2, and the end of T1 is before the end of T2. Compares an instance of ids:Instant,
     * ids:Interval or xsd:dateTimeStamp with an instance of ids:Interval. Evaluates to false if
     * compared to a non ids:Interval.
     */
    DURING("https://w3id.org/idsa/code/DURING"),

    /**
     * Arithmetic equals operator (5 = 5).
     */
    EQ("https://w3id.org/idsa/code/EQ"),

    /**
     * Logical equals operator (true = true).
     */
    EQUALS("https://w3id.org/idsa/code/EQUALS"),

    /**
     * If an interval T1 is finished by another interval T2, then the beginning of T1 is before the
     * beginning of T2, and the end of T1 is coincident with the end of T2. Compares an instance of
     * ids:Interval to another instance of ids:Interval. Evaluates to false if compared to a non
     * ids:Interval or one interval is empty.
     */
    FINISHED_BY("https://w3id.org/idsa/code/FINISHED_BY"),

    /**
     * If an Interval T1 finishes another interval T2, then the beginning of T1 is after the beginning
     * of T2, and the end of T1 is coincident with the end of T2. Compares an instance of ids:Interval
     * to another instance of ids:Interval. Evaluates to false if compared to a non ids:Interval or one
     * interval is empty.
     */
    FINISHES("https://w3id.org/idsa/code/FINISHES"),

    /**
     * Greater-than operator. Can be used for numeric (5 idsc:GT 2) comparisons.
     */
    GT("https://w3id.org/idsa/code/GT"),

    /**
     * Greater-than-or-equals operator. Can be used for numeric (5 idsc:GTEQ 2) comparisons.
     */
    GTEQ("https://w3id.org/idsa/code/GTEQ"),

    /**
     * If a user has a specific membership required for accessing a resource. A membership includes
     * always a role and a related organisation (see also org:). Should be used together with a
     * RightOperand pointing to an accessible endpoint providing this information.
     */
    HAS_MEMBERSHIP("https://w3id.org/idsa/code/HAS_MEMBERSHIP"),

    /**
     * If a user needs to be located at a certain site required for accessing a resource. A 'HAS_SITE'
     * relation includes always a membership (role and related organisation) corresponding to the site.
     * Should be used together with a RightOperand pointing to an accessible endpoint providing this
     * information.
     */
    HAS_SITE("https://w3id.org/idsa/code/HAS_SITE"),

    /**
     * Operator examining if the target resource has a certain state at the moment, for instance is
     * anonymized (idsc:ANONYMIZED).
     */
    HAS_STATE("https://w3id.org/idsa/code/HAS_STATE"),

    /**
     * Element-of operator. Allowed RightOperands are RDF collections('(A B C)').
     */
    IN("https://w3id.org/idsa/code/IN"),

    /**
     * Spatial operator 'inside' as defined by the Egenhofer Topological Relations family: An object A
     * is inside of another object B if (1) A and B share interior, but not bounding faces, (2) if A has
     * bounding faces which are interior faces of B, and (3) none of B's bounding faces coincides with
     * any of A's interior faces. (https://doi.org/10.1007/3-540-51295-0_148 Definition 4) In addition,
     * a point is inside a polygom iff the point is in the polygom's interior (the point itself has no
     * interior).
     */
    INSIDE("https://w3id.org/idsa/code/INSIDE"),

    /**
     * Is satisfied if a system is inside a specified target network or network range.
     */
    INSIDE_NETWORK("https://w3id.org/idsa/code/INSIDE_NETWORK"),

    /**
     * If a temporal entity T1 is longer than another temporal entity T2, then the length or duration of
     * T1 is bigger. Instants and xsd:dateTimeStamp Literals have always the duration
     * 'P0Y0M0DT0H0M0S'^^xsd:duration and therefore have always the same duration. Compares an instance
     * of ids:TemporalEntity with an instance of xsd:duration.
     */
    LONGER("https://w3id.org/idsa/code/LONGER"),

    /**
     * If temporal entity T1 is longer or equals than another temporal entity T2, then the length or
     * duration of T1 is bigger or their length or their duration is equal. Instants and
     * xsd:dateTimeStamp Literals have always the duration 'P0Y0M0DT0H0M0S'^^xsd:duration and therefore
     * have always the same duration. Compares an instance of ids:TemporalEntity with an instance of
     * xsd:duration.
     */
    LONGER_EQ("https://w3id.org/idsa/code/LONGER_EQ"),

    /**
     * Less-than operator. Can be used for numeric (2 idsc:LT 5) comparisons. Do not confuse with
     * idsc:LT (which is a language).
     */
    LT("https://w3id.org/idsa/code/LT"),

    /**
     * Less-than-or-equals operator. Can be used for numeric (2 idsc:LTEQ 5) comparisons.
     */
    LTEQ("https://w3id.org/idsa/code/LTEQ"),

    /**
     * Regex operator for strings. Evaluates to true iff the regex pattern of the RightOperand matches
     * the LeftOperand.
     */
    MATCHES("https://w3id.org/idsa/code/MATCHES"),

    /**
     * If a TemporalEntity or (xsd:dateTimeStamp Literal) T1 meets another TemporalEntity (or
     * xsd:dateTimeStamp Literal) T2, then the end of T1 is coincident with the beginning of T2.
     * Compares an instance of TemporalEntity or xsd:dateTimeStamp Literal to another instance of
     * TemporalEntity or xsd:dateTimeStamp Literal. Evaluates to true if T1 or T2 are Instants (or
     * xsd:dateTimeStamp Literal) and the condition in the comment holds.
     */
    MEETS("https://w3id.org/idsa/code/MEETS"),

    /**
     * If a user is part of a certain organisation required for accessing a resource. Should be used
     * together with a RightOperand pointing to an accessible endpoint providing this information.
     */
    MEMBER_OF("https://w3id.org/idsa/code/MEMBER_OF"),

    /**
     * If a TemporalEntity or (xsd:dateTimeStamp Literal) T1 is met by another TemporalEntity or
     * (xsd:dateTimeStamp Literal) T2, then the beginning of T1 is coincident with the end of T2.
     * Compares an instance of TemporalEntity (or xsd:dateTimeStamp Literal) to another instance of
     * TemporalEntity (or xsd:dateTimeStamp Literal). Evaluates to true if T1 or T2 are Instants (or
     * xsd:dateTimeStamp Literal) and the condition in the comment holds.
     */
    MET_BY("https://w3id.org/idsa/code/MET_BY"),

    /**
     * Logical difference operator (false != true).
     */
    NOT("https://w3id.org/idsa/code/NOT"),

    /**
     * If a interval T1 is overlapped another proper interval T2, then the beginning of T1 is before the
     * beginning of T2, the end of T1 is after the beginning of T2, and the end of T1 is before the end
     * of T2. Compares an instance of ids:Interval to another instance of ids:Interval. Evaluates to
     * false if compared to a non ids:Interval or one interval is empty.
     */
    OVERLAPPED_BY("https://w3id.org/idsa/code/OVERLAPPED_BY"),

    /**
     * If an ids:Interval T1 overlapps another ids:Interval T2, then the beginning of T1 is after the
     * beginning of T2, the beginning of T1 is before the end of T2, and the end of T1 is after the end
     * of T2. Compares an instance of ids:Interval to another instance of ids:Interval. Evaluates to
     * false if compared to a non ids:Interval or one interval is empty.
     */
    OVERLAPS("https://w3id.org/idsa/code/OVERLAPS"),

    /**
     * Logical equals operator comparing two RDF URIs. Is true if at least one owl:sameAs relation
     * exists. A owl:sameAs A is always true.
     */
    SAME_AS("https://w3id.org/idsa/code/SAME_AS"),

    /**
     * If a temporal entity T1 is shorter than another temporal entity T2, then the length or duration
     * of T1 is shorter. Instants and xsd:dateTimeStamp Literals have always the duration
     * 'P0Y0M0DT0H0M0S'^^xsd:duration and therefore have always the same duration. Compares an instance
     * of ids:TemporalEntity with an instance of xsd:duration.
     */
    SHORTER("https://w3id.org/idsa/code/SHORTER"),

    /**
     * If a temporal entity T1 is shorter or equals than another temporal entity T2, then the length or
     * duration of T1 is shorter or their length or their duration is equal. Instants and
     * xsd:dateTimeStamp Literals have always the duration 'P0Y0M0DT0H0M0S'^^xsd:duration and therefore
     * have always the same duration. Compares an instance of ids:TemporalEntity with an instance of
     * xsd:duration.
     */
    SHORTER_EQ("https://w3id.org/idsa/code/SHORTER_EQ"),

    /**
     * Spatial operator 'contains' as defined by the Egenhofer Topological Relations family: An object A
     * contains another object B if A and B share interior but no bounding faces; if B has bounding
     * faces which are interior faces of , and none of A's bounding faces coincides with any of B's
     * interior faces. (https://doi.org/10.1007/3-540-51295-0_148 Definition 5) In addition, a polygom
     * contains a point iff the point is in the polygom's interior (the point itself has no interior).
     */
    SPATIAL_CONTAINS("https://w3id.org/idsa/code/SPATIAL_CONTAINS"),

    /**
     * Spatial operator 'equals' as defined by the Egenhofer Topological Relations family: Two objects
     * are equal if both intersections of bounding and interior faces are not empty while the two
     * boundary-interior intersections are empty. (https://doi.org/10.1007/3-540-51295-0_148 Definition
     * 3) In addition, two spatial points are equal iff both coordinates are equal (points have no
     * interior).
     */
    SPATIAL_EQUALS("https://w3id.org/idsa/code/SPATIAL_EQUALS"),

    /**
     * Spatial operator 'meet' as defined by the Egenhofer Topological Relations family: If the
     * intersection among the bounding faces is not empty, whereas all other 3 intersections are empty,
     * then the two objects meet. (https://doi.org/10.1007/3-540-51295-0_148 Definition 2)
     */
    SPATIAL_MEET("https://w3id.org/idsa/code/SPATIAL_MEET"),

    /**
     * Spatial operator 'overlap' as defined by the Egenhofer Topological Relations family: Two objects
     * overlap if they have common interior faces and the bounding faces have common parts with the
     * opposite interior faces. (https://doi.org/10.1007/3-540-51295-0_148 Definition 8)
     */
    SPATIAL_OVERLAP("https://w3id.org/idsa/code/SPATIAL_OVERLAP"),

    /**
     * If a TemporalEntity T1 is started by another proper interval T2, then the beginning of T1 is
     * coincident with the beginning of T2, and the end of T1 is after the end of T2. Compares an
     * instance of TemporalEntity (or xsd:dateTimeStamp Literal) to instance of ids:Interval. Evaluates
     * to false if T1 is an Instant (or xsd:dateTimeStamp Literal) as the end of T1 can then not be
     * idsc:AFTER the end of T2.
     */
    STARTED_BY("https://w3id.org/idsa/code/STARTED_BY"),

    /**
     * If an interval T1 starts with a TemporalEntity T2, then the beginning of T1 is coincident with
     * the beginning of T2, and the end of T1 is before the end of T2. Compares an instance of
     * ids:Interval to another instance of TemporalEntity (or xsd:dateTimeStamp Literal). Evaluates to
     * false if T2 is not an ids:Interval as then the end of T1 can never be idsc:BEFORE the end of T2
     */
    STARTS("https://w3id.org/idsa/code/STARTS"),

    /**
     * Contains operator for strings. Evaluates to true iff the LeftOperand contains the complete
     * RightOperand.
     */
    STRING_CONTAINS("https://w3id.org/idsa/code/STRING_CONTAINS"),

    /**
     * Equals operator for strings. Evaluates to true iff all characters and their sequence is the same.
     */
    STRING_EQ("https://w3id.org/idsa/code/STRING_EQ"),

    /**
     * Contained in operator for strings. Evaluates to true iff the LeftOperand is contained completely
     * by the RightOperand.
     */
    STRING_IS_CONTAINED("https://w3id.org/idsa/code/STRING_IS_CONTAINED"),

    /**
     * If a TemporalEntity (or xsd:dateTimeStamp) T1 is disjoint with another ids:TemporalEntity (or
     * xsd:dateTimeStamp) T2, then T1 is idsc:BEFORE or idsc:AFTER to T2. Compares an instance of
     * ids:TemporalEntity or xsd:dateTimeStamp Literal to an instance of ids:TemporalEntity or
     * xsd:dateTimeStamp Literal.
     */
    TEMPORAL_DISJOINT("https://w3id.org/idsa/code/TEMPORAL_DISJOINT"),

    /**
     * If a TemporalEntity (or xsd:dateTimeStamp Literal) T1 is equals another TemporalEntity (or
     * xsd:dateTimeStamp Literal) T2, then the beginning of T1 is coincident with the beginning of T2,
     * and the end of T1 is coincident with the end of T2. The beginning and ending is the same for
     * instances of ids:Instant (or xsd:dateTimeStamp Literal). Compares an instance of TemporalEntity
     * or xsd:dateTimeStamp Literal to another TemporalEntity or xsd:dateTimeStamp. Evaluates to false
     * if a DurationEntity is involved.
     */
    TEMPORAL_EQUALS("https://w3id.org/idsa/code/TEMPORAL_EQUALS"),;

    private static final Map<String, DefaultBinaryOperator> uriInstanceMapping;
    static {
        uriInstanceMapping = new HashMap<>();
        uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
        uriInstanceMapping
            .putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
    }

    private BinaryOperator binaryOperator;

    DefaultBinaryOperator(String id) {
        this.binaryOperator = new BinaryOperatorBuilder(URI.create(id)).build();
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
        return this.binaryOperator.getId();
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
        return this.binaryOperator.getLabel();
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
        return this.binaryOperator.getComment();
    }

    public String toRdf() {
        return VocabUtil.getInstance().toRdf(this);
    }

    @JsonProperty("@id")
    final public URI getSerializedId() {
        return this.binaryOperator.getId();
    }

    @JsonCreator
    public static DefaultBinaryOperator deserialize(JsonNode node) {
        return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
    }

    @Override
    public String toString() {
        return this.binaryOperator.getId().toString();
    }

    @Override
    public BinaryOperator deepCopy() {
        // not implemented for enums
        throw new UnsupportedOperationException();
    }

}
