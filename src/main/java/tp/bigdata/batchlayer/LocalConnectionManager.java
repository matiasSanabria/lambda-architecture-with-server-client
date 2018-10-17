package tp.bigdata.batchlayer;

import java.io.IOException;

import tp.bigdata.batchlayer.schema.Data;

import com.backtype.hadoop.pail.Pail;
import com.backtype.hadoop.pail.Pail.TypedRecordOutputStream;

public class LocalConnectionManager {
	private static LocalConnectionManager instance = null;
	private String fullPath;
	private Pail<Data> pail;

	public static LocalConnectionManager getInstance() throws IOException {
		if (instance == null)
			instance = new LocalConnectionManager();
		return instance;
	}

	private LocalConnectionManager(String path) throws IOException {
		fullPath = path;
		pail = Pail.create(path, new DataPailStructure());
	}

	private LocalConnectionManager() throws IOException {
		this("/home/hadoop/batchlayer/test" + System.currentTimeMillis());
	}

	public TypedRecordOutputStream getOutputStream() throws IOException {
		return pail.openWrite();
	}

	public String getPath() {
		return fullPath;
	}
}
