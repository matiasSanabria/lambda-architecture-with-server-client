package tp.bigdata.batchlayer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import tp.bigdata.batchlayer.DataPailStructure;
import tp.bigdata.batchlayer.EdgeStructure;
import tp.bigdata.batchlayer.FieldStructure;
import tp.bigdata.batchlayer.PropertyStructure;
import tp.bigdata.batchlayer.ThriftPailStructure;
import tp.bigdata.batchlayer.schema.Data;
import tp.bigdata.batchlayer.schema.DataUnit;

@SuppressWarnings("serial")
public class DataPailStructure extends ThriftPailStructure<Data> {
	private static Map<Short, FieldStructure> validFieldMap = new HashMap();
	
	static  {
		for (DataUnit._Fields k: DataUnit.metaDataMap.keySet()) {
			FieldValueMetaData metadata = DataUnit.metaDataMap.get(k).valueMetaData;
			FieldStructure fieldStructure;
			if (metadata instanceof StructMetaData && 
					((StructMetaData) metadata).structClass.getName().endsWith("Property")) {
				fieldStructure = new PropertyStructure(((StructMetaData) metadata).structClass);
			} else {
				fieldStructure = new EdgeStructure();
			}
			validFieldMap.put(k.getThriftFieldId(), fieldStructure);
		}
	}

	public boolean isValidTarget(String... dirs) {
		if(dirs.length == 0) 
			return false;
		try {
			short id = Short.parseShort(dirs[1]);
			FieldStructure fieldStructure = validFieldMap.get(id);
			if( fieldStructure == null ) {
				return false;
			} else {
				return fieldStructure.isValidTarget(dirs);
			}
		}
		catch(NumberFormatException ex) {
			return false;
		}
	}

	public List<String> getTarget(Data object) {		
		List<String> ret = new ArrayList();
		// Add year partition
		
		final String yearDirectoryName = object.getDataUnit().getProductPurchased().getDate();
		ret.add(yearDirectoryName);
		
		DataUnit dataUnit = object.getDataUnit();
		short id = dataUnit.getSetField().getThriftFieldId();
		ret.add("" + id);
		validFieldMap.get(id).fillTarget(ret, dataUnit.getFieldValue());
		
		System.out.println(ret);
		
		return ret;
	}

	public Class getType() {
		return DataPailStructure.class;
	}

	@Override
	protected Data createThriftObject() {
		return new Data();
	}
}
