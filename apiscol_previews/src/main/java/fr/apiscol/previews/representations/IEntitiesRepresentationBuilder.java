package fr.apiscol.previews.representations;

import javax.ws.rs.core.UriInfo;

import fr.apiscol.previews.Conversion;

public interface IEntitiesRepresentationBuilder<T> {
	T getConversionRepresentation(Conversion conversion, UriInfo uriInfo);

	T getNotFoundMessage(String conversionId);
}
