package fr.apiscol.content.fileSystemAccess;

import fr.apiscol.ApiscolException;

public class ForcedPreviewInvalidMimeTypeException extends ApiscolException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ForcedPreviewInvalidMimeTypeException(String fileName) {
		super(
				String.format(
						"You sent the file %s for forced preview but its not a convenient mime type.",
						fileName));
	}

}
