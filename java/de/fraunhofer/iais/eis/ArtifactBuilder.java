package de.fraunhofer.iais.eis;

import java.math.BigInteger;
import java.net.URI;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class ArtifactBuilder implements Builder<Artifact> {

    private ArtifactImpl artifactImpl;

    public ArtifactBuilder() {
        artifactImpl = new ArtifactImpl();
    }

    public ArtifactBuilder(URI id) {
        this();
        artifactImpl.id = id;
    }

    /**
     * This function allows setting a value for _byteSize
     * 
     * @param _byteSize_ desired value to be set
     * @return Builder object with new value for _byteSize
     */
    public ArtifactBuilder _byteSize_(BigInteger _byteSize_) {
        this.artifactImpl.setByteSize(_byteSize_);
        return this;
    }

    /**
     * This function allows setting a value for _fileName
     * 
     * @param _fileName_ desired value to be set
     * @return Builder object with new value for _fileName
     */
    public ArtifactBuilder _fileName_(String _fileName_) {
        this.artifactImpl.setFileName(_fileName_);
        return this;
    }

    /**
     * This function allows setting a value for _creationDate
     * 
     * @param _creationDate_ desired value to be set
     * @return Builder object with new value for _creationDate
     */
    public ArtifactBuilder _creationDate_(XMLGregorianCalendar _creationDate_) {
        this.artifactImpl.setCreationDate(_creationDate_);
        return this;
    }

    /**
     * This function allows setting a value for _checkSum
     * 
     * @param _checkSum_ desired value to be set
     * @return Builder object with new value for _checkSum
     */
    public ArtifactBuilder _checkSum_(String _checkSum_) {
        this.artifactImpl.setCheckSum(_checkSum_);
        return this;
    }

    /**
     * This function allows setting a value for _duration
     * 
     * @param _duration_ desired value to be set
     * @return Builder object with new value for _duration
     */
    public ArtifactBuilder _duration_(java.math.BigDecimal _duration_) {
        this.artifactImpl.setDuration(_duration_);
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
    public Artifact build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(artifactImpl);
        return artifactImpl;
    }
}
