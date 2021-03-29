package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.*;
import javax.validation.constraints.*;
import java.util.Arrays;
import java.io.Serializable;

import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

public class PublicKeyBuilder {

	private PublicKeyImpl publicKeyImpl;

	public PublicKeyBuilder() {
		publicKeyImpl = new PublicKeyImpl();
	}

	public PublicKeyBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		publicKeyImpl.id = id;
	}

	final public PublicKeyBuilder _keyType_(KeyType _keyType_) {
		this.publicKeyImpl._keyType = _keyType_;
		return this;
	}


	final public PublicKeyBuilder _keyValue_(byte[] _keyValue_) {
		this.publicKeyImpl._keyValue = _keyValue_;
		return this;
	}

	public final PublicKey build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(publicKeyImpl);
		return publicKeyImpl;
	}
}
