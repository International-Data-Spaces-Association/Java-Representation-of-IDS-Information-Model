package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class ArtifactStateBuilder implements Builder<ArtifactState> {

    private ArtifactStateImpl artifactStateImpl;

    public ArtifactStateBuilder() {
        artifactStateImpl = new ArtifactStateImpl();
    }

    public ArtifactStateBuilder(URI id) {
        this();
        artifactStateImpl.id = id;
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
    public ArtifactState build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(artifactStateImpl);
        return artifactStateImpl;
    }
}
