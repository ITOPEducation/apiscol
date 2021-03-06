package fr.apiscol.meta.representations;

import java.net.URI;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.MediaType;

import fr.apiscol.database.DBAccessException;
import fr.apiscol.meta.dataBaseAccess.IResourceDataHandler;
import fr.apiscol.meta.fileSystemAccess.MetadataNotFoundException;
import fr.apiscol.meta.maintenance.MaintenanceRegistry;
import fr.apiscol.meta.searchEngine.ISearchEngineResultHandler;
import fr.apiscol.metadata.scolomfr3utils.Scolomfr3Utils;

public interface IEntitiesRepresentationBuilder<T> {

	MediaType getMediaType();

	String getMetadataDownloadUri(URI baseUri, String metadataId);

	T getMetadataSuccessfulDestructionReport(URI baseUri,
			String apiscolInstanceName, String metadataId, String warnings);

	T getSuccessfullOptimizationReport(String requestedFormat, URI baseUri);

	String getMetadataUri(URI baseUri, String metadataId);

	T getSuccessfulGlobalDeletionReport();

	String getMetadataJsonpDownloadUri(URI baseUri, String metadataId);

	T getMetadataSnippetRepresentation(URI baseUri, String apiscolInstanceName,
			String metadataId, String version);

	String getMetadataSnippetUri(URI baseUri, String metadataId);

	T selectMetadataFollowingCriterium(URI baseUri, String requestPath,
			String apiscolInstanceName, String apiscolInstanceLabel,
			ISearchEngineResultHandler handler, int start, int rows,
			boolean includeDescription, boolean includeTimestamp,
			IResourceDataHandler resourceDataHandler, String editUri,
			String version) throws NumberFormatException, DBAccessException;

	T getMetadataRepresentation(URI baseUri, String apiscolInstanceName,
			String resourceId, boolean includeDescription,
			boolean includeHierarchy, boolean includeTimestamp, int maxDepth, Map<String, String> params,
			IResourceDataHandler resourceDataHandler, String editUri)
			throws MetadataNotFoundException, DBAccessException;

	T getCompleteMetadataListRepresentation(URI baseUri, String requestPath,
			String apiscolInstanceName, String apiscolInstanceLabel, int start,
			int rows, boolean includeDescription, boolean includeTimestamp,
			IResourceDataHandler resourceDataHandler, String editUri,
			String version) throws DBAccessException;

	Object getMaintenanceRecoveryRepresentation(Integer maintenanceRecoveryId,
			URI baseUri, MaintenanceRegistry maintenanceRegistry,
			Integer nbLines);

	void setScolomfrUtils(Scolomfr3Utils scolomfrUtils);

	void addWarningMessages(T metadataRepresentation,
			List<String> warningMessages);

}
