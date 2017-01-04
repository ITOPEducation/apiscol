package fr.apiscol.exceptionMappers;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import fr.apiscol.MissingRequestedParameterException;

@Provider
public class MissingRequestedParameterExceptionMapper implements
		ExceptionMapper<MissingRequestedParameterException> {

	@Override
	public Response toResponse(MissingRequestedParameterException e) {
		return Response.status(Status.BAD_REQUEST)
				.type(MediaType.APPLICATION_XML).entity(e.getXMLMessage())
				.build();
	}
}