package fr.apiscol.meta.exceptionMappers;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import fr.apiscol.database.DBAccessException;

@Provider
public class DeletionNotAllowedExceptionMapper implements
		ExceptionMapper<DBAccessException> {
	@Override
	public Response toResponse(DBAccessException e) {
		return Response.status(Status.NOT_ACCEPTABLE)
				.type(MediaType.APPLICATION_XML).entity(e.getXMLMessage())
				.build();
	}
}