package de.fraunhofer.iais.eis.mixins;

import java.net.URI;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Constraint")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface ConstraintMixin {
    @JsonProperty("ids:leftOperand")
    @NotNull
    public LeftOperand getLeftOperand();

    @JsonProperty("ids:leftOperand")
    public void setLeftOperand(LeftOperand _leftOperand_);

    @JsonProperty("ids:operator")
    @NotNull
    public BinaryOperator getOperator();

    @JsonProperty("ids:operator")
    public void setOperator(BinaryOperator _operator_);

    @JsonProperty("ids:rightOperand")
    public RdfResource getRightOperand();

    @JsonProperty("ids:rightOperand")
    public void setRightOperand(RdfResource _rightOperand_);

    @JsonProperty("ids:rightOperandReference")
    public URI getRightOperandReference();

    @JsonProperty("ids:rightOperandReference")
    public void setRightOperandReference(URI _rightOperandReference_);

    @JsonProperty("ids:unit")
    public URI getUnit();

    @JsonProperty("ids:unit")
    public void setUnit(URI _unit_);

    @JsonProperty("ids:pipEndpoint")
    public PIP getPipEndpoint();

    @JsonProperty("ids:pipEndpoint")
    public void setPipEndpoint(PIP _pipEndpoint_);
}
