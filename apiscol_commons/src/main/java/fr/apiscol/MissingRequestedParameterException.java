package fr.apiscol;

import fr.apiscol.ApiscolException;

public class MissingRequestedParameterException extends ApiscolException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MissingRequestedParameterException(String message) {
		super(message);
	}

}
