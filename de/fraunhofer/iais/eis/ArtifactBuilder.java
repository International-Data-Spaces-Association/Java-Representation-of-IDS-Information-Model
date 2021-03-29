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

public class ArtifactBuilder {

	private ArtifactImpl artifactImpl;

	public ArtifactBuilder() {
		artifactImpl = new ArtifactImpl();
	}

	public ArtifactBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		artifactImpl.id = id;
	}

	final public ArtifactBuilder _byteSize_(BigInteger _byteSize_) {
		this.artifactImpl._byteSize = _byteSize_;
		return this;
	}


	final public ArtifactBuilder _fileName_(String _fileName_) {
		this.artifactImpl._fileName = _fileName_;
		return this;
	}


	final public ArtifactBuilder _creationDate_(XMLGregorianCalendar _creationDate_) {
		this.artifactImpl._creationDate = _creationDate_;
		return this;
	}


	final public ArtifactBuilder _checkSum_(String _checkSum_) {
		this.artifactImpl._checkSum = _checkSum_;
		return this;
	}


	final public ArtifactBuilder _duration_(java.math.BigDecimal _duration_) {
		this.artifactImpl._duration = _duration_;
		return this;
	}




	public final Artifact build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(artifactImpl);
		return artifactImpl;
	}
}
