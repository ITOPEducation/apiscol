package fr.apiscol.content.thumbs;

import fr.apiscol.auth.oauth.OauthServersProxy;
import fr.apiscol.content.ContentType;
import fr.apiscol.content.databaseAccess.IResourceDataHandler;
import fr.apiscol.database.DBAccessException;
import fr.apiscol.database.InexistentResourceInDatabaseException;

public class ThumbExtracterFactory {

	private static OauthServersProxy oauthServersProxy;

	public static ThumbExtracter getExtracter(
			IResourceDataHandler resourceDataHandler, String resourceId)
			throws DBAccessException, InexistentResourceInDatabaseException {
		String scormType = resourceDataHandler
				.getScormTypeForResource(resourceId);
		if (ContentType.isFile(scormType))
			return new FileThumbExtracter();
		else {
			String url = resourceDataHandler.getUrlForResource(resourceId);
			if (url!=null && url.toLowerCase().endsWith(".pdf")) {
				RemotePdfThumbExtracter remotePdfThumbExtracter = new RemotePdfThumbExtracter();
				if (oauthServersProxy != null) {
					remotePdfThumbExtracter
							.setOAuthServersProxy(oauthServersProxy);
				}
				return remotePdfThumbExtracter;
			}
			WebPageThumbExtracter webPageThumbExtracter = new WebPageThumbExtracter();
			if (oauthServersProxy != null) {
				webPageThumbExtracter.setOAuthServersProxy(oauthServersProxy);
			}
			return webPageThumbExtracter;
		}
	}

	public static void setOAuthServersProxy(OauthServersProxy oauthServersProxy) {
		ThumbExtracterFactory.oauthServersProxy = oauthServersProxy;

	}

}
