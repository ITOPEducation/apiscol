package fr.apiscol.exceptionMappers;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import fr.apiscol.SystemInitializationFailureException;

@Provider
public class SystemInitializationFailureExceptionMapper
		implements ExceptionMapper<SystemInitializationFailureException> {

	@Override
	public Response toResponse(SystemInitializationFailureException e) {
		return Response.status(Status.SERVICE_UNAVAILABLE).type(MediaType.APPLICATION_XML).entity(e.getXMLMessage()).build();
	}
}