package tp.bigdata.batchlayer.server.handlers;

import org.apache.thrift.TException;

import tp.bigdata.batchlayer.schema.DataUnit;
import tp.bigdata.batchlayer.schema.Page;
import tp.bigdata.batchlayer.schema.Product;
import tp.bigdata.batchlayer.schema.ProductPurchasedEdge;
import tp.bigdata.batchlayer.schema.User;
import tp.bigdata.batchlayer.schema.factories.PageFactory;
import tp.bigdata.batchlayer.schema.factories.ProductFactory;
import tp.bigdata.batchlayer.schema.factories.UserFactory;
import tp.bigdata.batchlayer.server.ProductPurchasedRelationShip.Iface;
import tp.bigdata.batchlayer.server.storing.DataUnitStorer;

public class ProductPurchasedRelationShipHandler implements Iface {

	public void setRelationship(long userId, long pageId, long productId, int quantity, String date)
			throws TException {
		UserFactory userFactory = new UserFactory();
		User userID = userFactory.build(userId);
		
		PageFactory pageFactory = new PageFactory();
		Page pageID = pageFactory.build(pageId);
		
		ProductFactory productFactory = new ProductFactory();
		Product productID = productFactory.build(productId);
		
		ProductPurchasedEdge edge = new ProductPurchasedEdge(userID, pageID, productID, quantity, date);
		
		storeEdge(edge);
	}

	private void storeEdge(ProductPurchasedEdge edge) {
		DataUnit edgeDataUnit = new DataUnit();
    	edgeDataUnit.setProductPurchased(edge);
    	
    	DataUnitStorer storer = new DataUnitStorer();
    	storer.store(edgeDataUnit);
	}
}
