package fr.apiscol.content.representations;

import java.awt.Point;
import java.net.URI;
import java.util.Map;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import fr.apiscol.content.RefreshProcessRegistry;
import fr.apiscol.content.fileSystemAccess.ResourceDirectoryNotFoundException;
import fr.apiscol.content.searchEngine.ISearchEngineResultHandler;
import fr.apiscol.database.DBAccessException;
import fr.apiscol.database.InexistentResourceInDatabaseException;

public interface IEntitiesRepresentationBuilder<T> {

	T getResourceRepresentation(URI baseUri, String apiscolInstanceName,
			String resourceId, String editUri) throws DBAccessException,
			InexistentResourceInDatabaseException,
			ResourceDirectoryNotFoundException;

	String getResourceStringRepresentation(URI baseUri,
			String apiscolInstanceName, String resourceId, String editUri)
			throws DBAccessException, InexistentResourceInDatabaseException,
			ResourceDirectoryNotFoundException;

	T getFileSuccessfulDestructionReport(URI baseUri,
			String apiscolInstanceName, String resourceId, String fileName);

	T getInexistentFileDestructionAttemptReport(URI baseuri, String resourceId,
			String fileName);

	T getCompleteResourceListRepresentation(URI baseUri,
			String apiscolInstanceName, int start, int rows, String editUri)
			throws DBAccessException, Exception;

	T selectResourceFollowingCriterium(URI baseUri, String apiscolInstanceName,
			ISearchEngineResultHandler handler, int start, int rows,
			String editUri) throws DBAccessException;

	MediaType getMediaType();

	T getResourceSuccessfulDestructionReport(URI baseUri,
			String apiscolInstanceName, String resourceId, String warnings);

	T getResourceUnsuccessfulDestructionReport(URI baseUri,
			String apiscolInstanceName, String resourceId, String warnings);

	T getSuccessfullOptimizationReport(URI baseUri, UriInfo uriInfo);

	T getLinkUpdateProcedureRepresentation(URI baseUri, UriInfo uriInfo);

	T getSuccessfulGlobalDeletionReport();

	T getSuccessfulRecoveryReport(URI baseUri, UriInfo uriInfo);

	T getThumbListRepresentation(String resourceId,
			Map<String, Point> thumbsUris, URI baseUri,
			String apiscolInstanceName, String editUri)
			throws DBAccessException, InexistentResourceInDatabaseException;

	T getResourceTechnicalInformations(URI baseUri, String apiscolInstanceName,
			String resourceId) throws ResourceDirectoryNotFoundException,
			DBAccessException, InexistentResourceInDatabaseException;

	String getResourcePreviewDirectoryUri(URI baseUri, String resourceId);

	Object getRefreshProcessRepresentation(Integer refreshProcessIdentifier,
			URI baseUri, RefreshProcessRegistry refreshProcessRegistry);

	Object getRecoveryProcedureRepresentation(URI externalUri, UriInfo uriInfo,
			Integer nbLines);

}
