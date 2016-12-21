package fr.apiscol.meta.searchEngine;

import fr.apiscol.ApiscolException;

public class SearchEngineErrorException extends ApiscolException {

	public SearchEngineErrorException(String message) {
		super(message, true);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
