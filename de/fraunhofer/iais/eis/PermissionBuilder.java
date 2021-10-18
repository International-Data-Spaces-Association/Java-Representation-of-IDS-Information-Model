package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class PermissionBuilder implements Builder<Permission> {

    private PermissionImpl permissionImpl;

    public PermissionBuilder() {
        permissionImpl = new PermissionImpl();
    }

    public PermissionBuilder(URI id) {
        this();
        permissionImpl.id = id;
    }

    /**
     * This function allows setting a value for _preDuty
     * 
     * @param _preDuty_ desired value to be set
     * @return Builder object with new value for _preDuty
     */
    public PermissionBuilder _preDuty_(List<Duty> _preDuty_) {
        this.permissionImpl.setPreDuty(_preDuty_);
        return this;
    }

    /**
     * This function allows adding a value to the List _preDuty
     * 
     * @param _preDuty_ desired value to be added
     * @return Builder object with new value for _preDuty
     */
    public PermissionBuilder _preDuty_(Duty _preDuty_) {
        this.permissionImpl.getPreDuty().add(_preDuty_);
        return this;
    }

    /**
     * This function allows setting a value for _postDuty
     * 
     * @param _postDuty_ desired value to be set
     * @return Builder object with new value for _postDuty
     */
    public PermissionBuilder _postDuty_(List<Duty> _postDuty_) {
        this.permissionImpl.setPostDuty(_postDuty_);
        return this;
    }

    /**
     * This function allows adding a value to the List _postDuty
     * 
     * @param _postDuty_ desired value to be added
     * @return Builder object with new value for _postDuty
     */
    public PermissionBuilder _postDuty_(Duty _postDuty_) {
        this.permissionImpl.getPostDuty().add(_postDuty_);
        return this;
    }

    /**
     * This function allows setting a value for _assignee
     * 
     * @param _assignee_ desired value to be set
     * @return Builder object with new value for _assignee
     */
    public PermissionBuilder _assignee_(List<URI> _assignee_) {
        this.permissionImpl.setAssignee(_assignee_);
        return this;
    }

    /**
     * This function allows adding a value to the List _assignee
     * 
     * @param _assignee_ desired value to be added
     * @return Builder object with new value for _assignee
     */
    public PermissionBuilder _assignee_(URI _assignee_) {
        this.permissionImpl.getAssignee().add(_assignee_);
        return this;
    }

    /**
     * This function allows setting a value for _assigner
     * 
     * @param _assigner_ desired value to be set
     * @return Builder object with new value for _assigner
     */
    public PermissionBuilder _assigner_(List<URI> _assigner_) {
        this.permissionImpl.setAssigner(_assigner_);
        return this;
    }

    /**
     * This function allows adding a value to the List _assigner
     * 
     * @param _assigner_ desired value to be added
     * @return Builder object with new value for _assigner
     */
    public PermissionBuilder _assigner_(URI _assigner_) {
        this.permissionImpl.getAssigner().add(_assigner_);
        return this;
    }

    /**
     * This function allows setting a value for _target
     * 
     * @param _target_ desired value to be set
     * @return Builder object with new value for _target
     */
    public PermissionBuilder _target_(URI _target_) {
        this.permissionImpl.setTarget(_target_);
        return this;
    }

    /**
     * This function allows setting a value for _constraint
     * 
     * @param _constraint_ desired value to be set
     * @return Builder object with new value for _constraint
     */
    public PermissionBuilder _constraint_(List<AbstractConstraint> _constraint_) {
        this.permissionImpl.setConstraint(_constraint_);
        return this;
    }

    /**
     * This function allows adding a value to the List _constraint
     * 
     * @param _constraint_ desired value to be added
     * @return Builder object with new value for _constraint
     */
    public PermissionBuilder _constraint_(AbstractConstraint _constraint_) {
        this.permissionImpl.getConstraint().add(_constraint_);
        return this;
    }

    /**
     * This function allows setting a value for _action
     * 
     * @param _action_ desired value to be set
     * @return Builder object with new value for _action
     */
    public PermissionBuilder _action_(List<Action> _action_) {
        this.permissionImpl.setAction(_action_);
        return this;
    }

    /**
     * This function allows adding a value to the List _action
     * 
     * @param _action_ desired value to be added
     * @return Builder object with new value for _action
     */
    public PermissionBuilder _action_(Action _action_) {
        this.permissionImpl.getAction().add(_action_);
        return this;
    }

    /**
     * This function allows setting a value for _assetRefinement
     * 
     * @param _assetRefinement_ desired value to be set
     * @return Builder object with new value for _assetRefinement
     */
    public PermissionBuilder _assetRefinement_(AbstractConstraint _assetRefinement_) {
        this.permissionImpl.setAssetRefinement(_assetRefinement_);
        return this;
    }

    /**
     * This function allows setting a value for _title
     * 
     * @param _title_ desired value to be set
     * @return Builder object with new value for _title
     */
    public PermissionBuilder _title_(List<TypedLiteral> _title_) {
        this.permissionImpl.setTitle(_title_);
        return this;
    }

    /**
     * This function allows adding a value to the List _title
     * 
     * @param _title_ desired value to be added
     * @return Builder object with new value for _title
     */
    public PermissionBuilder _title_(TypedLiteral _title_) {
        this.permissionImpl.getTitle().add(_title_);
        return this;
    }

    /**
     * This function allows setting a value for _description
     * 
     * @param _description_ desired value to be set
     * @return Builder object with new value for _description
     */
    public PermissionBuilder _description_(List<TypedLiteral> _description_) {
        this.permissionImpl.setDescription(_description_);
        return this;
    }

    /**
     * This function allows adding a value to the List _description
     * 
     * @param _description_ desired value to be added
     * @return Builder object with new value for _description
     */
    public PermissionBuilder _description_(TypedLiteral _description_) {
        this.permissionImpl.getDescription().add(_description_);
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
    public Permission build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(permissionImpl);
        return permissionImpl;
    }
}
