package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class ParticipantCatalogBuilder implements Builder<ParticipantCatalog> {

    private ParticipantCatalogImpl participantCatalogImpl;

    public ParticipantCatalogBuilder() {
        participantCatalogImpl = new ParticipantCatalogImpl();
    }

    public ParticipantCatalogBuilder(URI id) {
        this();
        participantCatalogImpl.id = id;
    }

    /**
     * This function allows setting a value for _member
     * 
     * @param _member_ desired value to be set
     * @return Builder object with new value for _member
     */
    public ParticipantCatalogBuilder _member_(List<Participant> _member_) {
        this.participantCatalogImpl.setMember(_member_);
        return this;
    }

    /**
     * This function allows adding a value to the List _member
     * 
     * @param _member_ desired value to be added
     * @return Builder object with new value for _member
     */
    public ParticipantCatalogBuilder _member_(Participant _member_) {
        if (!this.participantCatalogImpl.getMemberAsUri().isEmpty()) {
            this.participantCatalogImpl.setMemberAsUri(new ArrayList<>());
        }
        this.participantCatalogImpl.getMember().add(_member_);
        return this;
    }

    /**
     * This function allows setting a value for _memberAsUri
     * 
     * @param _member_ desired value to be set
     * @return Builder object with new value for _memberAsUri
     */
    public ParticipantCatalogBuilder _memberAsUri_(List<URI> _member_) {
        this.participantCatalogImpl.setMemberAsUri(_member_);
        return this;
    }

    /**
     * This function allows adding a value to the List _memberAsUri
     * 
     * @param _member_ desired value to be added
     * @return Builder object with new value for _memberAsUri
     */
    public ParticipantCatalogBuilder _memberAsUri_(URI _member_) {
        if (!this.participantCatalogImpl.getMember().isEmpty()) {
            this.participantCatalogImpl.setMember(new ArrayList<>());
        }
        this.participantCatalogImpl.getMemberAsUri().add(_member_);
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
    public ParticipantCatalog build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(participantCatalogImpl);
        return participantCatalogImpl;
    }
}
