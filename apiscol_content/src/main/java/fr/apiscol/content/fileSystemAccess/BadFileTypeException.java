package fr.apiscol.content.fileSystemAccess;

import fr.apiscol.ApiscolException;

public class BadFileTypeException extends ApiscolException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public BadFileTypeException(String resourceId, String fileName) {
		super(String.format(
				"The provided file %s for the resource %s is not a valid zip archive.",
				resourceId, fileName));
	}

}
