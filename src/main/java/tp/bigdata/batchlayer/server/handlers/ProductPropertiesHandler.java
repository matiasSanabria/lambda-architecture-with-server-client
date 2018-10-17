package tp.bigdata.batchlayer.server.handlers;

import org.apache.thrift.TException;

import tp.bigdata.batchlayer.schema.DataUnit;
import tp.bigdata.batchlayer.schema.Product;
import tp.bigdata.batchlayer.schema.ProductProperty;
import tp.bigdata.batchlayer.schema.ProductPropertyValue;
import tp.bigdata.batchlayer.schema.factories.ProductFactory;
import tp.bigdata.batchlayer.server.ProductProperties.Iface;
import tp.bigdata.batchlayer.server.storing.DataUnitStorer;

public class ProductPropertiesHandler implements Iface {

	public void setBarcode(long id, String barcode) throws TException {
		ProductPropertyValue ppv = new ProductPropertyValue();
		ppv.setBarcode(barcode);
		
		storeProperty(id, ppv);
	}

	public void setDescription(long id, String description) throws TException {
		ProductPropertyValue ppv = new ProductPropertyValue();
		ppv.setDescription(description);
		
		storeProperty(id, ppv);		
	}

	public void setStock(long id, double stock) throws TException {
		ProductPropertyValue ppv = new ProductPropertyValue();
		ppv.setStock(stock);
		
		storeProperty(id, ppv);		
	}

	public void setSalePrice(long id, double salePrice) throws TException {
		ProductPropertyValue ppv = new ProductPropertyValue();
		ppv.setSalePrice(salePrice);
		
		storeProperty(id, ppv);		
	}
	
	private void storeProperty(long id, ProductPropertyValue ppv) {
		ProductFactory productFactory = new ProductFactory();
		Product product = productFactory.build(id);
		ProductProperty property = new ProductProperty(product, ppv);
		System.out.println("product property: " + property);
		
		DataUnit propertyDataUnit = new DataUnit();
		propertyDataUnit.setProductProperty(property);

		DataUnitStorer storer = new DataUnitStorer();
		storer.store(propertyDataUnit);
	}
}
