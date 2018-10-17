package tp.bigdata.batchlayer.server.storing;

import java.io.IOException;
import java.net.URISyntaxException;

import tp.bigdata.batchlayer.HDFSConnectionManager;
import tp.bigdata.batchlayer.LocalConnectionManager;
import tp.bigdata.batchlayer.schema.Data;
import tp.bigdata.batchlayer.schema.DataUnit;
import tp.bigdata.batchlayer.schema.Pedigree;

import com.backtype.hadoop.pail.Pail.TypedRecordOutputStream;

public class DataUnitStorer {
	public DataUnitStorer() {
	}
	
	public void store(DataUnit dataUnit) {
		Pedigree pedigree = new Pedigree();
    	pedigree.setTrueAsOfSecs(calculateTimestamp());
    	
    	Data data = new Data();
    	data.setDataUnit(dataUnit);
    	data.setPedigree(pedigree);
		
		System.out.println("Storing: " + data);
		
//		HDFSConnectionManager cm;
		LocalConnectionManager cm;
		try {
			 cm = LocalConnectionManager.getInstance();
//			cm = HDFSConnectionManager.getInstance();
			TypedRecordOutputStream out = cm.getOutputStream();
			out.writeObject(data);
			out.close();
//		} catch (URISyntaxException e) {
//			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private Long calculateTimestamp() {
		return System.currentTimeMillis();
	}
}
