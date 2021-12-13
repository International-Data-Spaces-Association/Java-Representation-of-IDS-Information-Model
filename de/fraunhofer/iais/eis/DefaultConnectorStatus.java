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
 * Connector Status is used to represent a Connectors current state inside the Configuration Model.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:ConnectorStatus")
public enum DefaultConnectorStatus implements ConnectorStatus {

    /**
     * Indicates that a Connector is badly configured.
     */
    CONNECTOR_BADLY_CONFIGURED("https://w3id.org/idsa/code/CONNECTOR_BADLY_CONFIGURED"),

    /**
     * Indicates that a Connector is offline.
     */
    CONNECTOR_OFFLINE("https://w3id.org/idsa/code/CONNECTOR_OFFLINE"),

    /**
     * Indicates that a Connector is online.
     */
    CONNECTOR_ONLINE("https://w3id.org/idsa/code/CONNECTOR_ONLINE"),;

    private static final Map<String, DefaultConnectorStatus> uriInstanceMapping;
    static {
        uriInstanceMapping = new HashMap<>();
        uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
        uriInstanceMapping
            .putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
    }

    private ConnectorStatus connectorStatus;

    DefaultConnectorStatus(String id) {
        this.connectorStatus = new ConnectorStatusBuilder(URI.create(id)).build();
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
        return this.connectorStatus.getId();
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
        return this.connectorStatus.getLabel();
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
        return this.connectorStatus.getComment();
    }

    public String toRdf() {
        return VocabUtil.getInstance().toRdf(this);
    }

    @JsonProperty("@id")
    final public URI getSerializedId() {
        return this.connectorStatus.getId();
    }

    @JsonCreator
    public static DefaultConnectorStatus deserialize(JsonNode node) {
        return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
    }

    @Override
    public String toString() {
        return this.connectorStatus.getId().toString();
    }

    @Override
    public ConnectorStatus deepCopy() {
        // not implemented for enums
        throw new UnsupportedOperationException();
    }

}
