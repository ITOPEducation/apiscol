package fr.apiscol.content.previews;

import fr.apiscol.content.RefreshProcessRegistry.States;

public class UntypedPreviewMaker extends AbstractPreviewMaker implements
		IPreviewMaker {

	public UntypedPreviewMaker(String resourceId, String previewsRepoPath,
			String entryPoint, String previewUri) {
		super(resourceId, previewsRepoPath, entryPoint, previewUri);
	}

	@Override
	protected void createPreviewDirectory() {
		// does Nothing
	}

	@Override
	protected void createNewPreview() {
		trackingObject.updateStateAndMessage(States.aborted,
				"Impossible to build preview for this file : " + entryPoint
						+ ". No preview maker registered for his mime type.");
	}

}
