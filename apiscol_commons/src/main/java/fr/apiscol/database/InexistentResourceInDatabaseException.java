package fr.apiscol.database;

import fr.apiscol.ApiscolException;

public class InexistentResourceInDatabaseException extends ApiscolException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InexistentResourceInDatabaseException(String message) {
		super(message, false);
	}
}
