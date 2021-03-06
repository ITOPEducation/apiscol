package fr.apiscol.content.languageDetection;

import org.apache.log4j.Logger;

import fr.apiscol.utils.LogUtility;

public abstract class AbstractLanguageDetector implements ILanguageDetector {

	protected static Logger logger;

	protected void createLogger() {
		if (logger == null)
			logger = LogUtility
					.createLogger(this.getClass().getCanonicalName());

	}

}
