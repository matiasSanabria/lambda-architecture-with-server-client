package tp.bigdata.batchlayer.schema.factories;

import tp.bigdata.batchlayer.schema.Product;

public class ProductFactory implements Factory<Product>{

	public Product build(long id) {
		Product product = new Product();
		product.setId(id);
		return product;
	}
}
