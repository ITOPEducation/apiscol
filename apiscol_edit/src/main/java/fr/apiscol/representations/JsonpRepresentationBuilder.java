package fr.apiscol.representations;

import java.net.URI;

import javax.ws.rs.core.MediaType;

import org.w3c.dom.Document;

import fr.apiscol.CustomMediaType;
import fr.apiscol.edit.fileHandling.TransferRegistry;
import fr.apiscol.edit.urlHandling.UrlParsingRegistry;
import fr.apiscol.utils.XMLUtils;

public class JsonpRepresentationBuilder extends XMLRepresentationBuilder {

	@Override
	public Object getFileTransferRepresentation(Integer fileTransferIdentifier,
			URI baseUri, TransferRegistry fileTransferRegistry,
			URI contentWebServiceUri) {
		String string = XMLUtils.XMLToString((Document) super
				.getFileTransferRepresentation(fileTransferIdentifier, baseUri,
						fileTransferRegistry, contentWebServiceUri));
		return new StringBuilder().append("notice(\"")
				.append(string.replaceAll("\"", "\\\\\"")).append("\");")
				.toString();
	}

	@Override
	public MediaType getMediaType() {
		return CustomMediaType.JSONP;
	}

	@Override
	public Object getUrlParsingRespresentation(Integer urlParsingId,
			URI baseUri, UrlParsingRegistry urlParsingRegistry,
			URI contentWebServiceUri) {
		return new StringBuilder()
				.append("notice(\"")
				.append(XMLUtils.XMLToString(
						(Document) super.getUrlParsingRespresentation(
								urlParsingId, baseUri, urlParsingRegistry,
								contentWebServiceUri)).replaceAll("\"", "\\\""))
				.append("\");").toString();
	}

}
