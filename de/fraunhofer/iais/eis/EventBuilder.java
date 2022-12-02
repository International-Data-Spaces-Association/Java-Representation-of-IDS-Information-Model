package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class EventBuilder implements Builder<Event> {

    private EventImpl eventImpl;

    public EventBuilder() {
        eventImpl = new EventImpl();
    }

    public EventBuilder(URI id) {
        this();
        eventImpl.id = id;
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
    public Event build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(eventImpl);
        return eventImpl;
    }
}
