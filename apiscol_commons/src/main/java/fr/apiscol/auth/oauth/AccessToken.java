package fr.apiscol.auth.oauth;

import org.apache.commons.lang.StringUtils;

public class AccessToken {
	private String accessToken;
	private float expiresIn = 0;
	private String error;
	private String errorDescription;
	private long creationTime;

	public AccessToken() {
		creationTime = System.currentTimeMillis() / 1000L;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public float getExpiresIn() {
		return expiresIn;
	}

	public String getError() {
		return error;
	}

	public boolean hasError() {
		return StringUtils.isNotBlank(error);
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public float getRemainingSeconds() {
		long spentTime = System.currentTimeMillis() / 1000L - creationTime;
		return Math.max(0, expiresIn - spentTime);
	}

}
