package de.fraunhofer.iais.eis;

import java.net.URI;

import de.fraunhofer.iais.eis.util.*;

public class AuditGuaranteeBuilder implements Builder<AuditGuarantee> {

    private AuditGuaranteeImpl auditGuaranteeImpl;

    public AuditGuaranteeBuilder() {
        auditGuaranteeImpl = new AuditGuaranteeImpl();
    }

    public AuditGuaranteeBuilder(URI id) {
        this();
        auditGuaranteeImpl.id = id;
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
    public AuditGuarantee build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(auditGuaranteeImpl);
        return auditGuaranteeImpl;
    }
}
