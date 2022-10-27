package de.fraunhofer.iais.eis;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import de.fraunhofer.iais.eis.util.*;

/**
 * Query message intended to be consumed by a component.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = QueryMessageImpl.class)
})
public interface QueryMessage extends RequestMessage {

    // standard methods

    @Beta
    public QueryMessage deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * This property specifies the language of the query.
     *
     * More information under https://w3id.org/idsa/core/queryLanguage
     *
     * @return Returns the QueryLanguage for the property _queryLanguage.
     */
    @JsonAlias({"https://w3id.org/idsa/core/queryLanguage", "ids:queryLanguage", "queryLanguage"})
    QueryLanguage getQueryLanguage();

    /**
     * This property specifies the language of the query.
     *
     * More information under https://w3id.org/idsa/core/queryLanguage
     *
     * @param _queryLanguage_ desired value for the property _queryLanguage.
     */
    void setQueryLanguage(QueryLanguage _queryLanguage_);

    /**
     * Refers to the scope property of a query message, see ids:QueryScope.
     *
     * More information under https://w3id.org/idsa/core/queryScope
     *
     * @return Returns the QueryScope for the property _queryScope.
     */
    @JsonAlias({"https://w3id.org/idsa/core/queryScope", "ids:queryScope", "queryScope"})
    QueryScope getQueryScope();

    /**
     * Refers to the scope property of a query message, see ids:QueryScope.
     *
     * More information under https://w3id.org/idsa/core/queryScope
     *
     * @param _queryScope_ desired value for the property _queryScope.
     */
    void setQueryScope(QueryScope _queryScope_);

    /**
     * Refers to the target property of a query message, see ids:QueryTarget.
     *
     * More information under https://w3id.org/idsa/core/recipientScope
     *
     * @return Returns the QueryTarget for the property _recipientScope.
     */
    @JsonAlias({"https://w3id.org/idsa/core/recipientScope", "ids:recipientScope", "recipientScope"})
    QueryTarget getRecipientScope();

    /**
     * Refers to the target property of a query message, see ids:QueryTarget.
     *
     * More information under https://w3id.org/idsa/core/recipientScope
     *
     * @param _recipientScope_ desired value for the property _recipientScope.
     */
    void setRecipientScope(QueryTarget _recipientScope_);

    // Default instances of this class as defined in the ontology

}
