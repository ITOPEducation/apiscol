package fr.apiscol.content.mimeDetection;

import java.io.File;

public interface IMimeTypeDetector {

	String detectType(File mainFile);

}
