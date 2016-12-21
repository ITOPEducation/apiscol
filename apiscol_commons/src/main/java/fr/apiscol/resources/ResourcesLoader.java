package fr.apiscol.resources;

import java.io.InputStream;

public class ResourcesLoader  {
	public static InputStream loadResource(final String path) {
		return ResourcesLoader.class.getResourceAsStream(path);

	}
}
