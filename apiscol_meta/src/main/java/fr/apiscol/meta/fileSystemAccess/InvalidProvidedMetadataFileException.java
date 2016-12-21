package fr.apiscol.meta.fileSystemAccess;

import fr.apiscol.ApiscolException;

public class InvalidProvidedMetadataFileException extends ApiscolException {

	public InvalidProvidedMetadataFileException(String message) {
		super(message, true);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
