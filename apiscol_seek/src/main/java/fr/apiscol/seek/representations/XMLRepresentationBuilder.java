package fr.apiscol.seek.representations;

import javax.ws.rs.core.MediaType;

public class XMLRepresentationBuilder extends AbstractRepresentationBuilder {

	@Override
	public MediaType getMediaType() {
		return MediaType.APPLICATION_XML_TYPE;
	}

}
