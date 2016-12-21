package fr.apiscol.content;

import fr.apiscol.ApiscolException;

public class InvalidEtagException extends ApiscolException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public InvalidEtagException(String etag) {
		super(String.format("The provided etag %s does not match the resource etag : refresh your data.", etag));
	}

}
