package fr.apiscol;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.MediaType;

public class RequestHandler {

	public static String extractAcceptHeader(HttpServletRequest request) {
		String header = request.getHeader("accept");
		if (header == null) {
			return null;
		}
		return header.trim().toLowerCase();

	}

	public static String convertFormatQueryParam(String format) {
		if (format.trim().toLowerCase().contains("json"))
			return MediaType.APPLICATION_JSON;
		else if (format.trim().toLowerCase().contains("javascript"))
			return CustomMediaType.JSONP.toString();
		else if (format.trim().toLowerCase().contains("html"))
			return MediaType.APPLICATION_XHTML_XML;
		return MediaType.APPLICATION_XML;
	}

}
