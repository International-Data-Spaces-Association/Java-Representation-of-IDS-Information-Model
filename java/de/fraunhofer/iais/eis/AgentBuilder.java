package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class AgentBuilder implements Builder<Agent> {

    private AgentImpl agentImpl;

    public AgentBuilder() {
        agentImpl = new AgentImpl();
    }

    public AgentBuilder(URI id) {
        this();
        agentImpl.id = id;
    }

    /**
     * This function allows setting a value for _title
     * 
     * @param _title_ desired value to be set
     * @return Builder object with new value for _title
     */
    public AgentBuilder _title_(List<TypedLiteral> _title_) {
        this.agentImpl.setTitle(_title_);
        return this;
    }

    /**
     * This function allows adding a value to the List _title
     * 
     * @param _title_ desired value to be added
     * @return Builder object with new value for _title
     */
    public AgentBuilder _title_(TypedLiteral _title_) {
        this.agentImpl.getTitle().add(_title_);
        return this;
    }

    /**
     * This function allows setting a value for _description
     * 
     * @param _description_ desired value to be set
     * @return Builder object with new value for _description
     */
    public AgentBuilder _description_(List<TypedLiteral> _description_) {
        this.agentImpl.setDescription(_description_);
        return this;
    }

    /**
     * This function allows adding a value to the List _description
     * 
     * @param _description_ desired value to be added
     * @return Builder object with new value for _description
     */
    public AgentBuilder _description_(TypedLiteral _description_) {
        this.agentImpl.getDescription().add(_description_);
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
    public Agent build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(agentImpl);
        return agentImpl;
    }
}
