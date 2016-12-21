package fr.apiscol.content.thumbs;

import java.awt.Point;
import java.util.Map;

import fr.apiscol.content.databaseAccess.IResourceDataHandler;
import fr.apiscol.content.fileSystemAccess.ResourceDirectoryNotFoundException;
import fr.apiscol.database.DBAccessException;
import fr.apiscol.database.InexistentResourceInDatabaseException;

public interface ThumbExtracter {

	Map<String, Point> getThumbsFromResource(String resourceId,
			IResourceDataHandler resourceDataHandler, String baseUrl,
			String mainFileName, double minDimensionsSum) throws ResourceDirectoryNotFoundException,
			DBAccessException, InexistentResourceInDatabaseException;

	Map<String, Point> getThumbsFromPreview(String resourceId,
			String previewsRepoPath, String baseUrl);

}
