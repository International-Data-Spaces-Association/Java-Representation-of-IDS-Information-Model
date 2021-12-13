package de.fraunhofer.iais.eis.mixins;

import java.net.URI;
import java.util.List;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Rule")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = Permission.class),
    @JsonSubTypes.Type(value = Prohibition.class),
    @JsonSubTypes.Type(value = Duty.class)
})
public interface RuleMixin {
    @JsonProperty("ids:assignee")
    public List<URI> getAssignee();

    @JsonProperty("ids:assignee")
    public void setAssignee(List<URI> _assignee_);

    @JsonProperty("ids:assigner")
    public List<URI> getAssigner();

    @JsonProperty("ids:assigner")
    public void setAssigner(List<URI> _assigner_);

    @JsonProperty("ids:target")
    public URI getTarget();

    @JsonProperty("ids:target")
    public void setTarget(URI _target_);

    @JsonProperty("ids:constraint")
    public List<AbstractConstraint> getConstraint();

    @JsonProperty("ids:constraint")
    public void setConstraint(List<AbstractConstraint> _constraint_);

    @JsonProperty("ids:action")
    @NotEmpty
    public List<Action> getAction();

    @JsonProperty("ids:action")
    public void setAction(List<Action> _action_);

    @JsonProperty("ids:assetRefinement")
    public AbstractConstraint getAssetRefinement();

    @JsonProperty("ids:assetRefinement")
    public void setAssetRefinement(AbstractConstraint _assetRefinement_);
}
