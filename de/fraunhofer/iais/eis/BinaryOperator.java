package de.fraunhofer.iais.eis;

import java.net.URI;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import de.fraunhofer.iais.eis.util.*;

/**
 * The class of binary operators.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = BinaryOperatorImpl.class)
})
public interface BinaryOperator extends ModelClass {

    // standard methods

    @Beta
    public BinaryOperator deepCopy();

    // Default instances of this class as defined in the ontology

    /**
     * If a temporal entity T1 is after another temporal entity T2, then the beginning of T1 is after
     * the end of T2 and the beginning of T1 is different to the ending of T2. Temporal entities can
     * either be a xsd:dateTimeStamp or an ids:TemporalEntity.
     */
    BinaryOperator AFTER = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/AFTER")).build();

    /**
     * If a temporal entity T1 is before another temporal entity T2, then the ending of T1 is before the
     * end of T2 and the ending of T1 is different to the beginning of T2. Temporal entities can either
     * be a xsd:dateTimeStamp or an ids:TemporalEntity. Compares an instance of ids:TemporalEntity or a
     * Literal of xsd:dateTimeStamp to an instance of ids:TemporalEntity or a Literal of
     * xsd:dateTimeStamp.
     */
    BinaryOperator BEFORE = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/BEFORE")).build();

    /**
     * If a TemporalEntity (or xsd:dateTimeStamp) T1 contains another ids:TemporalEntity T2, then the
     * beginning of T1 is idsc:AFTER the beginning of T2 and the ending of T1 is idsc:BEFORE the ending
     * of T2. An Instant (or xsd:dateTimeStamp) cannot contain another Instant (or xsd:dateTimeStamp),
     * neihter contains itself. Compares an instance of ids:Instant, ids:Interval or xsd:dateTimeStamp
     * with an instance of ids:Interval. Evaluates to false if compared to a non ids:Interval.
     */
    BinaryOperator CONTAINS = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/CONTAINS")).build();

    /**
     * Spatial operator 'covered by' as defined by the Egenhofer Topological Relations family: An object
     * A is covered_by another object B if both objects share common bounding and interior faces; if A
     * has interior faces which are bounding faces of B; and if none of B's interior faces are part of
     * A's boundary. (https://doi.org/10.1007/3-540-51295-0_148 Definition 7)
     */
    BinaryOperator COVERED_BY = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/COVERED_BY")).build();

    /**
     * Spatial operator 'covers' as defined by the Egenhofer Topological Relations family: An object A
     * covers another object B if both objects share common bounding and interior faces; if B has
     * interior faces which are bounding faces of A; and if none of A's interior faces are part of B's
     * boundary. (https://doi.org/10.1007/3-540-51295-0_148 Definition 6)
     */
    BinaryOperator COVERS = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/COVERS")).build();

    /**
     * Allows assignments similar to 'var x := {RightOperand}'. Different to the other
     * ids:BinaryOperator, idsc:DEFINES_AS does *not* compare a feature but tells the interpreter where
     * to *find* one. Therefore, the constraint is not evaluated in the same way as with other
     * operators.
     */
    BinaryOperator DEFINES_AS = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/DEFINES_AS")).build();

    /**
     * Spatial operator 'disjoint' as defined by the Egenhofer Topological Relations family: If all four
     * intersections among all object parts are empty, then the two objects are disjoint.
     * (https://doi.org/10.1007/3-540-51295-0_148 Definition 1)
     */
    BinaryOperator DISJOINT = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/DISJOINT")).build();

    /**
     * If a temporal entity T1 has the same duration as another temporal entity T2, then their length or
     * their duration is equal. Instants and xsd:dateTimeStamp Literals have always the duration
     * 'P0Y0M0DT0H0M0S'^^xsd:duration and therefore have always the same duration. Compares an instance
     * of ids:TemporalEntity with an instance of ids:TemporalEntity.
     */
    BinaryOperator DURATION_EQ = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/DURATION_EQ")).build();

    /**
     * If a TemporalEntity T1 is during another TemporalEntity T2, then the beginning of T1 is after the
     * beginning of T2, and the end of T1 is before the end of T2. Compares an instance of ids:Instant,
     * ids:Interval or xsd:dateTimeStamp with an instance of ids:Interval. Evaluates to false if
     * compared to a non ids:Interval.
     */
    BinaryOperator DURING = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/DURING")).build();

    /**
     * Arithmetic equals operator (5 = 5).
     */
    BinaryOperator EQ = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/EQ")).build();

    /**
     * Logical equals operator (true = true).
     */
    BinaryOperator EQUALS = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/EQUALS")).build();

    /**
     * If an interval T1 is finished by another interval T2, then the beginning of T1 is before the
     * beginning of T2, and the end of T1 is coincident with the end of T2. Compares an instance of
     * ids:Interval to another instance of ids:Interval. Evaluates to false if compared to a non
     * ids:Interval or one interval is empty.
     */
    BinaryOperator FINISHED_BY = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/FINISHED_BY")).build();

    /**
     * If an Interval T1 finishes another interval T2, then the beginning of T1 is after the beginning
     * of T2, and the end of T1 is coincident with the end of T2. Compares an instance of ids:Interval
     * to another instance of ids:Interval. Evaluates to false if compared to a non ids:Interval or one
     * interval is empty.
     */
    BinaryOperator FINISHES = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/FINISHES")).build();

    /**
     * Greater-than operator. Can be used for numeric (5 idsc:GT 2) comparisons.
     */
    BinaryOperator GT = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/GT")).build();

    /**
     * Greater-than-or-equals operator. Can be used for numeric (5 idsc:GTEQ 2) comparisons.
     */
    BinaryOperator GTEQ = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/GTEQ")).build();

    /**
     * If a user has a specific membership required for accessing a resource. A membership includes
     * always a role and a related organisation (see also org:). Should be used together with a
     * RightOperand pointing to an accessible endpoint providing this information.
     */
    BinaryOperator HAS_MEMBERSHIP = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/HAS_MEMBERSHIP")).build();

    /**
     * If a user needs to be located at a certain site required for accessing a resource. A 'HAS_SITE'
     * relation includes always a membership (role and related organisation) corresponding to the site.
     * Should be used together with a RightOperand pointing to an accessible endpoint providing this
     * information.
     */
    BinaryOperator HAS_SITE = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/HAS_SITE")).build();

    /**
     * Operator examining if the target resource has a certain state at the moment, for instance is
     * anonymized (idsc:ANONYMIZED).
     */
    BinaryOperator HAS_STATE = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/HAS_STATE")).build();

    /**
     * Element-of operator. Allowed RightOperands are RDF collections('(A B C)').
     */
    BinaryOperator IN = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/IN")).build();

    /**
     * Spatial operator 'inside' as defined by the Egenhofer Topological Relations family: An object A
     * is inside of another object B if (1) A and B share interior, but not bounding faces, (2) if A has
     * bounding faces which are interior faces of B, and (3) none of B's bounding faces coincides with
     * any of A's interior faces. (https://doi.org/10.1007/3-540-51295-0_148 Definition 4) In addition,
     * a point is inside a polygom iff the point is in the polygom's interior (the point itself has no
     * interior).
     */
    BinaryOperator INSIDE = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/INSIDE")).build();

    /**
     * Is satisfied if a system is inside a specified target network or network range.
     */
    BinaryOperator INSIDE_NETWORK = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/INSIDE_NETWORK")).build();

    /**
     * If a temporal entity T1 is longer than another temporal entity T2, then the length or duration of
     * T1 is bigger. Instants and xsd:dateTimeStamp Literals have always the duration
     * 'P0Y0M0DT0H0M0S'^^xsd:duration and therefore have always the same duration. Compares an instance
     * of ids:TemporalEntity with an instance of xsd:duration.
     */
    BinaryOperator LONGER = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/LONGER")).build();

    /**
     * If temporal entity T1 is longer or equals than another temporal entity T2, then the length or
     * duration of T1 is bigger or their length or their duration is equal. Instants and
     * xsd:dateTimeStamp Literals have always the duration 'P0Y0M0DT0H0M0S'^^xsd:duration and therefore
     * have always the same duration. Compares an instance of ids:TemporalEntity with an instance of
     * xsd:duration.
     */
    BinaryOperator LONGER_EQ = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/LONGER_EQ")).build();

    /**
     * Less-than operator. Can be used for numeric (2 idsc:LT 5) comparisons. Do not confuse with
     * idsc:LT (which is a language).
     */
    BinaryOperator LT = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/LT")).build();

    /**
     * Less-than-or-equals operator. Can be used for numeric (2 idsc:LTEQ 5) comparisons.
     */
    BinaryOperator LTEQ = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/LTEQ")).build();

    /**
     * Regex operator for strings. Evaluates to true iff the regex pattern of the RightOperand matches
     * the LeftOperand.
     */
    BinaryOperator MATCHES = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/MATCHES")).build();

    /**
     * If a TemporalEntity or (xsd:dateTimeStamp Literal) T1 meets another TemporalEntity (or
     * xsd:dateTimeStamp Literal) T2, then the end of T1 is coincident with the beginning of T2.
     * Compares an instance of TemporalEntity or xsd:dateTimeStamp Literal to another instance of
     * TemporalEntity or xsd:dateTimeStamp Literal. Evaluates to true if T1 or T2 are Instants (or
     * xsd:dateTimeStamp Literal) and the condition in the comment holds.
     */
    BinaryOperator MEETS = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/MEETS")).build();

    /**
     * If a user is part of a certain organisation required for accessing a resource. Should be used
     * together with a RightOperand pointing to an accessible endpoint providing this information.
     */
    BinaryOperator MEMBER_OF = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/MEMBER_OF")).build();

    /**
     * If a TemporalEntity or (xsd:dateTimeStamp Literal) T1 is met by another TemporalEntity or
     * (xsd:dateTimeStamp Literal) T2, then the beginning of T1 is coincident with the end of T2.
     * Compares an instance of TemporalEntity (or xsd:dateTimeStamp Literal) to another instance of
     * TemporalEntity (or xsd:dateTimeStamp Literal). Evaluates to true if T1 or T2 are Instants (or
     * xsd:dateTimeStamp Literal) and the condition in the comment holds.
     */
    BinaryOperator MET_BY = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/MET_BY")).build();

    /**
     * Logical difference operator (false != true).
     */
    BinaryOperator NOT = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/NOT")).build();

    /**
     * If a interval T1 is overlapped another proper interval T2, then the beginning of T1 is before the
     * beginning of T2, the end of T1 is after the beginning of T2, and the end of T1 is before the end
     * of T2. Compares an instance of ids:Interval to another instance of ids:Interval. Evaluates to
     * false if compared to a non ids:Interval or one interval is empty.
     */
    BinaryOperator OVERLAPPED_BY = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/OVERLAPPED_BY")).build();

    /**
     * If an ids:Interval T1 overlapps another ids:Interval T2, then the beginning of T1 is after the
     * beginning of T2, the beginning of T1 is before the end of T2, and the end of T1 is after the end
     * of T2. Compares an instance of ids:Interval to another instance of ids:Interval. Evaluates to
     * false if compared to a non ids:Interval or one interval is empty.
     */
    BinaryOperator OVERLAPS = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/OVERLAPS")).build();

    /**
     * Logical equals operator comparing two RDF URIs. Is true if at least one owl:sameAs relation
     * exists. A owl:sameAs A is always true.
     */
    BinaryOperator SAME_AS = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/SAME_AS")).build();

    /**
     * If a temporal entity T1 is shorter than another temporal entity T2, then the length or duration
     * of T1 is shorter. Instants and xsd:dateTimeStamp Literals have always the duration
     * 'P0Y0M0DT0H0M0S'^^xsd:duration and therefore have always the same duration. Compares an instance
     * of ids:TemporalEntity with an instance of xsd:duration.
     */
    BinaryOperator SHORTER = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/SHORTER")).build();

    /**
     * If a temporal entity T1 is shorter or equals than another temporal entity T2, then the length or
     * duration of T1 is shorter or their length or their duration is equal. Instants and
     * xsd:dateTimeStamp Literals have always the duration 'P0Y0M0DT0H0M0S'^^xsd:duration and therefore
     * have always the same duration. Compares an instance of ids:TemporalEntity with an instance of
     * xsd:duration.
     */
    BinaryOperator SHORTER_EQ = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/SHORTER_EQ")).build();

    /**
     * Spatial operator 'contains' as defined by the Egenhofer Topological Relations family: An object A
     * contains another object B if A and B share interior but no bounding faces; if B has bounding
     * faces which are interior faces of , and none of A's bounding faces coincides with any of B's
     * interior faces. (https://doi.org/10.1007/3-540-51295-0_148 Definition 5) In addition, a polygom
     * contains a point iff the point is in the polygom's interior (the point itself has no interior).
     */
    BinaryOperator SPATIAL_CONTAINS = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/SPATIAL_CONTAINS")).build();

    /**
     * Spatial operator 'equals' as defined by the Egenhofer Topological Relations family: Two objects
     * are equal if both intersections of bounding and interior faces are not empty while the two
     * boundary-interior intersections are empty. (https://doi.org/10.1007/3-540-51295-0_148 Definition
     * 3) In addition, two spatial points are equal iff both coordinates are equal (points have no
     * interior).
     */
    BinaryOperator SPATIAL_EQUALS = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/SPATIAL_EQUALS")).build();

    /**
     * Spatial operator 'meet' as defined by the Egenhofer Topological Relations family: If the
     * intersection among the bounding faces is not empty, whereas all other 3 intersections are empty,
     * then the two objects meet. (https://doi.org/10.1007/3-540-51295-0_148 Definition 2)
     */
    BinaryOperator SPATIAL_MEET = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/SPATIAL_MEET")).build();

    /**
     * Spatial operator 'overlap' as defined by the Egenhofer Topological Relations family: Two objects
     * overlap if they have common interior faces and the bounding faces have common parts with the
     * opposite interior faces. (https://doi.org/10.1007/3-540-51295-0_148 Definition 8)
     */
    BinaryOperator SPATIAL_OVERLAP = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/SPATIAL_OVERLAP")).build();

    /**
     * If a TemporalEntity T1 is started by another proper interval T2, then the beginning of T1 is
     * coincident with the beginning of T2, and the end of T1 is after the end of T2. Compares an
     * instance of TemporalEntity (or xsd:dateTimeStamp Literal) to instance of ids:Interval. Evaluates
     * to false if T1 is an Instant (or xsd:dateTimeStamp Literal) as the end of T1 can then not be
     * idsc:AFTER the end of T2.
     */
    BinaryOperator STARTED_BY = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/STARTED_BY")).build();

    /**
     * If an interval T1 starts with a TemporalEntity T2, then the beginning of T1 is coincident with
     * the beginning of T2, and the end of T1 is before the end of T2. Compares an instance of
     * ids:Interval to another instance of TemporalEntity (or xsd:dateTimeStamp Literal). Evaluates to
     * false if T2 is not an ids:Interval as then the end of T1 can never be idsc:BEFORE the end of T2
     */
    BinaryOperator STARTS = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/STARTS")).build();

    /**
     * Contains operator for strings. Evaluates to true iff the LeftOperand contains the complete
     * RightOperand.
     */
    BinaryOperator STRING_CONTAINS = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/STRING_CONTAINS")).build();

    /**
     * Equals operator for strings. Evaluates to true iff all characters and their sequence is the same.
     */
    BinaryOperator STRING_EQ = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/STRING_EQ")).build();

    /**
     * Contained in operator for strings. Evaluates to true iff the LeftOperand is contained completely
     * by the RightOperand.
     */
    BinaryOperator STRING_IS_CONTAINED = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/STRING_IS_CONTAINED")).build();

    /**
     * If a TemporalEntity (or xsd:dateTimeStamp) T1 is disjoint with another ids:TemporalEntity (or
     * xsd:dateTimeStamp) T2, then T1 is idsc:BEFORE or idsc:AFTER to T2. Compares an instance of
     * ids:TemporalEntity or xsd:dateTimeStamp Literal to an instance of ids:TemporalEntity or
     * xsd:dateTimeStamp Literal.
     */
    BinaryOperator TEMPORAL_DISJOINT = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/TEMPORAL_DISJOINT")).build();

    /**
     * If a TemporalEntity (or xsd:dateTimeStamp Literal) T1 is equals another TemporalEntity (or
     * xsd:dateTimeStamp Literal) T2, then the beginning of T1 is coincident with the beginning of T2,
     * and the end of T1 is coincident with the end of T2. The beginning and ending is the same for
     * instances of ids:Instant (or xsd:dateTimeStamp Literal). Compares an instance of TemporalEntity
     * or xsd:dateTimeStamp Literal to another TemporalEntity or xsd:dateTimeStamp. Evaluates to false
     * if a DurationEntity is involved.
     */
    BinaryOperator TEMPORAL_EQUALS = new BinaryOperatorBuilder(URI.create("https://w3id.org/idsa/code/TEMPORAL_EQUALS")).build();

}
