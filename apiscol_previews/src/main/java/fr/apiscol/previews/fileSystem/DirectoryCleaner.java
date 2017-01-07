package fr.apiscol.previews.fileSystem;

public class DirectoryCleaner implements Runnable {

	@Override
	public void run() {
		System.out
				.println("Running the cleaning process for old directories**");
		FileSystemAccess.cleanOldDirectories();
	}

}
