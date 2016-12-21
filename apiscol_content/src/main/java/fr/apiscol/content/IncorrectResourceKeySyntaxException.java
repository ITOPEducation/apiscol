package fr.apiscol.content;

import fr.apiscol.ApiscolException;


public class IncorrectResourceKeySyntaxException extends ApiscolException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IncorrectResourceKeySyntaxException(String resourceId) {
		super(String.format(
				"%s is not the valid syntax for apiscol content identifiers .",
				resourceId));
	}

}
