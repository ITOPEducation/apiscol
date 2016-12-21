package fr.apiscol.content.fileSystemAccess;

import fr.apiscol.ApiscolException;

public class ResourceDirectoryNotFoundException extends ApiscolException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ResourceDirectoryNotFoundException(String resourceId) {
		super(
				String.format(
						"The resource directory %s was not found, impossible to achieve the request.",
						resourceId));
	}

}
