package fr.apiscol.thumbs;

import fr.apiscol.ApiscolException;

public class InvalidImageUrlException extends ApiscolException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidImageUrlException(String message) {
		super(message);
	}

}
