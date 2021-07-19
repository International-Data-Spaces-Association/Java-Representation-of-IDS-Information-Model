package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class ProhibitionBuilder implements Builder<Prohibition> {

    private ProhibitionImpl prohibitionImpl;

    public ProhibitionBuilder() {
        prohibitionImpl = new ProhibitionImpl();
    }

    public ProhibitionBuilder(URI id) {
        this();
        prohibitionImpl.id = id;
    }

    /**
     * This function allows setting a value for _assignee
     * 
     * @param _assignee_ desired value to be set
     * @return Builder object with new value for _assignee
     */
    public ProhibitionBuilder _assignee_(List<URI> _assignee_) {
        this.prohibitionImpl.setAssignee(_assignee_);
        return this;
    }

    /**
     * This function allows adding a value to the List _assignee
     * 
     * @param _assignee_ desired value to be added
     * @return Builder object with new value for _assignee
     */
    public ProhibitionBuilder _assignee_(URI _assignee_) {
        this.prohibitionImpl.getAssignee().add(_assignee_);
        return this;
    }

    /**
     * This function allows setting a value for _assigner
     * 
     * @param _assigner_ desired value to be set
     * @return Builder object with new value for _assigner
     */
    public ProhibitionBuilder _assigner_(List<URI> _assigner_) {
        this.prohibitionImpl.setAssigner(_assigner_);
        return this;
    }

    /**
     * This function allows adding a value to the List _assigner
     * 
     * @param _assigner_ desired value to be added
     * @return Builder object with new value for _assigner
     */
    public ProhibitionBuilder _assigner_(URI _assigner_) {
        this.prohibitionImpl.getAssigner().add(_assigner_);
        return this;
    }

    /**
     * This function allows setting a value for _target
     * 
     * @param _target_ desired value to be set
     * @return Builder object with new value for _target
     */
    public ProhibitionBuilder _target_(URI _target_) {
        this.prohibitionImpl.setTarget(_target_);
        return this;
    }

    /**
     * This function allows setting a value for _constraint
     * 
     * @param _constraint_ desired value to be set
     * @return Builder object with new value for _constraint
     */
    public ProhibitionBuilder _constraint_(List<AbstractConstraint> _constraint_) {
        this.prohibitionImpl.setConstraint(_constraint_);
        return this;
    }

    /**
     * This function allows adding a value to the List _constraint
     * 
     * @param _constraint_ desired value to be added
     * @return Builder object with new value for _constraint
     */
    public ProhibitionBuilder _constraint_(AbstractConstraint _constraint_) {
        this.prohibitionImpl.getConstraint().add(_constraint_);
        return this;
    }

    /**
     * This function allows setting a value for _action
     * 
     * @param _action_ desired value to be set
     * @return Builder object with new value for _action
     */
    public ProhibitionBuilder _action_(List<Action> _action_) {
        this.prohibitionImpl.setAction(_action_);
        return this;
    }

    /**
     * This function allows adding a value to the List _action
     * 
     * @param _action_ desired value to be added
     * @return Builder object with new value for _action
     */
    public ProhibitionBuilder _action_(Action _action_) {
        this.prohibitionImpl.getAction().add(_action_);
        return this;
    }

    /**
     * This function allows setting a value for _assetRefinement
     * 
     * @param _assetRefinement_ desired value to be set
     * @return Builder object with new value for _assetRefinement
     */
    public ProhibitionBuilder _assetRefinement_(AbstractConstraint _assetRefinement_) {
        this.prohibitionImpl.setAssetRefinement(_assetRefinement_);
        return this;
    }

    /**
     * This function allows setting a value for _title
     * 
     * @param _title_ desired value to be set
     * @return Builder object with new value for _title
     */
    public ProhibitionBuilder _title_(List<TypedLiteral> _title_) {
        this.prohibitionImpl.setTitle(_title_);
        return this;
    }

    /**
     * This function allows adding a value to the List _title
     * 
     * @param _title_ desired value to be added
     * @return Builder object with new value for _title
     */
    public ProhibitionBuilder _title_(TypedLiteral _title_) {
        this.prohibitionImpl.getTitle().add(_title_);
        return this;
    }

    /**
     * This function allows setting a value for _description
     * 
     * @param _description_ desired value to be set
     * @return Builder object with new value for _description
     */
    public ProhibitionBuilder _description_(List<TypedLiteral> _description_) {
        this.prohibitionImpl.setDescription(_description_);
        return this;
    }

    /**
     * This function allows adding a value to the List _description
     * 
     * @param _description_ desired value to be added
     * @return Builder object with new value for _description
     */
    public ProhibitionBuilder _description_(TypedLiteral _description_) {
        this.prohibitionImpl.getDescription().add(_description_);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     * @throws ConstraintViolationException This exception is thrown, if a validator is used and a
     *         violation is found.
     */
    @Override
    public Prohibition build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(prohibitionImpl);
        return prohibitionImpl;
    }
}
