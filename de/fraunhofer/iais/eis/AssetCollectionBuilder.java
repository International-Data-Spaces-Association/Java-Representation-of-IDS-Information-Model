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

public class AssetCollectionBuilder {

	private AssetCollectionImpl assetCollectionImpl;

	public AssetCollectionBuilder() {
		assetCollectionImpl = new AssetCollectionImpl();
	}

	public AssetCollectionBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		assetCollectionImpl.id = id;
	}

	final public AssetCollectionBuilder _assetSource_(URI _assetSource_) {
		this.assetCollectionImpl._assetSource = _assetSource_;
		return this;
	}


	final public AssetCollectionBuilder _assetRefinement_(AbstractConstraint _assetRefinement_) {
		this.assetCollectionImpl._assetRefinement = _assetRefinement_;
		return this;
	}




	public final AssetCollection build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(assetCollectionImpl);
		return assetCollectionImpl;
	}
}
