package fr.apiscol.content.exceptionMappers;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import fr.apiscol.content.url.InvalidUrlException;

@Provider
public class InvalidUrlExceptionMapper implements ExceptionMapper<InvalidUrlException> {
	@Override
	public Response toResponse(InvalidUrlException e) {
		return Response.status(Status.BAD_REQUEST)
				.type(MediaType.APPLICATION_XML)
				.entity(e.getMessage()).build();
	}
}