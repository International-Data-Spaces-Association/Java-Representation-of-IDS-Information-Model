package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import de.fraunhofer.iais.eis.util.*;

public class ActionBuilder implements Builder<Action> {

    private ActionImpl actionImpl;

    public ActionBuilder() {
        actionImpl = new ActionImpl();
    }

    public ActionBuilder(URI id) {
        this();
        actionImpl.id = id;
    }

    /**
     * This function allows setting a value for _actionRefinement
     * 
     * @param _actionRefinement_ desired value to be set
     * @return Builder object with new value for _actionRefinement
     */
    public ActionBuilder _actionRefinement_(List<Constraint> _actionRefinement_) {
        this.actionImpl.setActionRefinement(_actionRefinement_);
        return this;
    }

    /**
     * This function allows adding a value to the List _actionRefinement
     * 
     * @param _actionRefinement_ desired value to be added
     * @return Builder object with new value for _actionRefinement
     */
    public ActionBuilder _actionRefinement_(Constraint _actionRefinement_) {
        this.actionImpl.getActionRefinement().add(_actionRefinement_);
        return this;
    }

    /**
     * This function allows setting a value for _includedIn
     * 
     * @param _includedIn_ desired value to be set
     * @return Builder object with new value for _includedIn
     */
    public ActionBuilder _includedIn_(Action _includedIn_) {
        this.actionImpl.setIncludedIn(_includedIn_);
        return this;
    }

    /**
     * This function allows setting a value for _pxpEndpoint
     * 
     * @param _pxpEndpoint_ desired value to be set
     * @return Builder object with new value for _pxpEndpoint
     */
    public ActionBuilder _pxpEndpoint_(PXP _pxpEndpoint_) {
        this.actionImpl.setPxpEndpoint(_pxpEndpoint_);
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
    public Action build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(actionImpl);
        return actionImpl;
    }
}
