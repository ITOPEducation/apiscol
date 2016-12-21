package fr.apiscol.meta.fileSystemAccess;

import fr.apiscol.ApiscolException;

public class MetadataNotFoundException extends ApiscolException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MetadataNotFoundException(String metadataId) {
		super(String.format("No file was found for the metadata id %s.", metadataId));
	}

	

}
