package fr.apiscol.previews.workers;

import java.io.File;
import java.util.List;
import java.util.UUID;

import fr.apiscol.previews.Conversion;
import fr.apiscol.utils.FileUtils;

public class RemotePDFConversionWorker extends PDFConversionWorker {

	private String url;

	public RemotePDFConversionWorker(String url, File outputDir,
			List<String> outputMimeTypeList, int pageLimit,
			Conversion conversion) {
		super(null, outputDir, outputMimeTypeList, pageLimit, conversion);
		this.url = url;

	}

	@Override
	public void run() {
		if (downLoadPdf() == true) {
			convertPdfToImage();
		}
	}

	protected boolean downLoadPdf() {
		conversion.setState(Conversion.States.INITIATED,
				"Pdf file will be downloaded");
		incomingFile = new File(String.format("%s/%s.pdf",
				System.getProperty("java.io.tmpdir"), UUID.randomUUID()));
		conversion.setState(
				Conversion.States.INITIATED,
				String.format("Trying to dump pdf file to %s",
						incomingFile.getAbsolutePath()));
		return FileUtils.downloadFileFromURL(url, incomingFile);
	}

}
