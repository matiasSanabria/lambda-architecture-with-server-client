package tp.bigdata.batchlayer;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import tp.bigdata.batchlayer.schema.Data;

import com.backtype.hadoop.pail.Pail;
import com.backtype.hadoop.pail.Pail.TypedRecordOutputStream;

public class HDFSConnectionManager {
	public static final String defaultUri = "hdfs://master:9000/";
	static HDFSConnectionManager instance = null;
	FileSystem filesystem;
	Pail<Data> pail;

	static public HDFSConnectionManager getInstance() throws IOException, URISyntaxException {
		if (instance == null)
			instance = new HDFSConnectionManager();
		return instance;
	}

	public HDFSConnectionManager(String uri, String path) throws IOException, URISyntaxException {
		connectToHDFSFilesystem(uri);

		pail = Pail.create(filesystem, path, new DataPailStructure());
	}

	public HDFSConnectionManager() throws IOException, URISyntaxException {
		this(defaultUri, "data/");
	}

	public TypedRecordOutputStream getOutputStream() throws IOException {
		return pail.openWrite();
	}

	private void connectToHDFSFilesystem(String uri) throws IOException, URISyntaxException {
		Configuration configuration = new Configuration();
//		configuration.set("fs.hdfs.impl", org.apache.hadoop.hdfs.DistributedFileSystem.class.getName());
//		configuration.set("fs.file.impl", org.apache.hadoop.fs.LocalFileSystem.class.getName());
		filesystem = FileSystem.get(new URI(uri), configuration);
	}
}
