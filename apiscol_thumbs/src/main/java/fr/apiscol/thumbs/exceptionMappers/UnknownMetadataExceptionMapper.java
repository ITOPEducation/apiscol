package fr.apiscol.thumbs.exceptionMappers;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import fr.apiscol.thumbs.UnknownMetadataException;

@Provider
public class UnknownMetadataExceptionMapper implements
		ExceptionMapper<UnknownMetadataException> {

	@Override
	public Response toResponse(UnknownMetadataException e) {
		return Response.status(Status.BAD_REQUEST)
				.type(MediaType.APPLICATION_XML).entity(e.getXMLMessage())
				.build();
	}
}