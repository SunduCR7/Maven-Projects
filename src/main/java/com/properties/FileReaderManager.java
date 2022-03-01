package com.properties;

import java.io.IOException;

public class FileReaderManager {

	// Private Constructor

	private FileReaderManager() {

	}

	// Static method

	public static FileReaderManager getInstanceFRM() {

		FileReaderManager frm = new FileReaderManager();

		return frm;

	}

	// Non-static method

	public ConfigurationReader getInstanceCR() throws IOException {

		ConfigurationReader cr = new ConfigurationReader();

		return cr;

	}

}
