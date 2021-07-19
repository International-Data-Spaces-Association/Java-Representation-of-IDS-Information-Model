package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.ConstraintViolationException;

public interface Builder<T> {

    public T build() throws ConstraintViolationException;

}
