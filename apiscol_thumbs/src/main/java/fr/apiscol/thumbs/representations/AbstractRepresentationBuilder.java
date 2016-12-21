package fr.apiscol.thumbs.representations;

import java.net.URI;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import fr.apiscol.thumbs.ThumbsApi;
import fr.apiscol.thumbs.fileSystemAccess.ResourceDirectoryInterface;
import fr.apiscol.utils.FileUtils;
import fr.apiscol.utils.LogUtility;

public abstract class AbstractRepresentationBuilder<T> implements
		IEntitiesRepresentationBuilder<T> {
	protected static Logger logger;

	public AbstractRepresentationBuilder() {
		createLogger();
	}

	private void createLogger() {
		if (logger == null)
			logger = LogUtility
					.createLogger(this.getClass().getCanonicalName());

	}

	protected String getFileUri(URI baseUri, String metadataId, String status) {
		String thumbId = ThumbsApi.getThumbId(metadataId, status);
		String fileName = ResourceDirectoryInterface.getFileName(thumbId);
		if (!StringUtils.isEmpty(fileName))
			return convertToUrl(fileName, baseUri);
		else
			return StringUtils.EMPTY;
	}

	private String convertToUrl(String imageName, URI baseUri) {
		return (new StringBuilder().append(baseUri).append('/')
				.append(FileUtils.getFilePathHierarchy("files", imageName)))
				.toString();
	}

}
