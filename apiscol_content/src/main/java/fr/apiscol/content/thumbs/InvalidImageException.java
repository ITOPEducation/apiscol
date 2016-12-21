package fr.apiscol.content.thumbs;

import fr.apiscol.ApiscolException;

public class InvalidImageException extends ApiscolException {

	public InvalidImageException(String message) {
		super(message, false);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
