package tp.bigdata.batchlayer.server.handlers;

import org.apache.thrift.TException;

import tp.bigdata.batchlayer.schema.DataUnit;
import tp.bigdata.batchlayer.schema.Page;
import tp.bigdata.batchlayer.schema.PageProperty;
import tp.bigdata.batchlayer.schema.PagePropertyValue;
import tp.bigdata.batchlayer.schema.factories.PageFactory;
import tp.bigdata.batchlayer.server.PageProperties.Iface;
import tp.bigdata.batchlayer.server.storing.DataUnitStorer;

public class PagePropertiesHandler implements Iface {

	public void setUrl(long id, String url) throws TException {
		PagePropertyValue ppv = new PagePropertyValue();
		ppv.setUrl(url);
		
		storeProperty(id, ppv);
	}

	public void setUrlType(long id, String urlType) throws TException {
		PagePropertyValue ppv = new PagePropertyValue();
		ppv.setUrlType(urlType);
		
		storeProperty(id, ppv);
	}
	
	private void storeProperty(long id, PagePropertyValue ppv) {
		PageFactory pageFactory = new PageFactory();
		Page page = pageFactory.build(id);
		PageProperty property = new PageProperty(page, ppv);
		System.out.println("page property: " + property);
		
		DataUnit propertyDataUnit = new DataUnit();
		propertyDataUnit.setPageProperty(property);

		DataUnitStorer storer = new DataUnitStorer();
		storer.store(propertyDataUnit);
	}
}
