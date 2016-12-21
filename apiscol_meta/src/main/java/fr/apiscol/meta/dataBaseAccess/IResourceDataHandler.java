package fr.apiscol.meta.dataBaseAccess;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.w3c.dom.Document;

import fr.apiscol.database.DBAccessException;
import fr.apiscol.database.InexistentResourceInDatabaseException;
import fr.apiscol.meta.hierarchy.Modification;
import fr.apiscol.meta.hierarchy.Node;
import fr.apiscol.metadata.scolomfr3utils.IScolomfr3Utils;

public interface IResourceDataHandler {

	void createMetadataEntry(String metadataId, Document metadata)
			throws DBAccessException;

	void setMetadata(String metadataId, Document lomData)
			throws DBAccessException, InexistentResourceInDatabaseException;

	void deInitialize();

	void deleteAllDocuments() throws DBAccessException;

	HashMap<String, String> getMetadataProperties(String metadataId)
			throws DBAccessException;

	void updateMetadataEntry(String metadataId, Document metadata)
			throws DBAccessException;;

	void deleteMetadataEntry(String metadataId) throws DBAccessException;

	Node getMetadataHierarchyFromRoot(String rootId, URI baseUri)
			throws DBAccessException;

	HashMap<String, ArrayList<Modification>> getModificationsToApplyToRelatedResources(
			String url) throws DBAccessException;

	void setScolomfrUtils(IScolomfr3Utils skosVocabulary);

	void loadMetadata(List<String> metadataList) throws DBAccessException;

}
