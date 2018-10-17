package tp.bigdata.batchlayer.server;

import org.apache.thrift.TMultiplexedProcessor;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.server.TServer.Args;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

import tp.bigdata.batchlayer.server.ProductProperties;
import tp.bigdata.batchlayer.server.handlers.PagePropertiesHandler;
import tp.bigdata.batchlayer.server.handlers.ProductPropertiesHandler;
import tp.bigdata.batchlayer.server.handlers.ProductPurchasedRelationShipHandler;
import tp.bigdata.batchlayer.server.handlers.UserPropertiesHandler;

public class Server {
	final static int PORT = 9090;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		try {
			UserPropertiesHandler userPropertiesHandler = new UserPropertiesHandler();
			PagePropertiesHandler pagePropertiesHandler = new PagePropertiesHandler();
			ProductPropertiesHandler productPropertiesHandler = new ProductPropertiesHandler();
			ProductPurchasedRelationShipHandler productPurchasedRelationshipHandler = new ProductPurchasedRelationShipHandler();
			
			TMultiplexedProcessor multiplexedProcessor = new TMultiplexedProcessor();

			UserProperties.Processor userPropertiesProcessor = 
					new UserProperties.Processor(userPropertiesHandler);
			multiplexedProcessor.registerProcessor("userProperties", userPropertiesProcessor);
			
			PageProperties.Processor pagePropertiesProcessor = 
					new PageProperties.Processor(pagePropertiesHandler);
			multiplexedProcessor.registerProcessor("pageProperties", pagePropertiesProcessor);
			
			ProductProperties.Processor productPropertiesProcessor = 
					new ProductProperties.Processor(productPropertiesHandler);
			multiplexedProcessor.registerProcessor("productProperties", productPropertiesProcessor);
			
			ProductPurchasedRelationShip.Processor productPurchasedRelationshipProcessor = 
					new ProductPurchasedRelationShip.Processor(productPurchasedRelationshipHandler);
			multiplexedProcessor.registerProcessor("productPurchasedRelationship", productPurchasedRelationshipProcessor);
			
			TServerTransport serverTransport = new TServerSocket(PORT);
			TServer server = new TSimpleServer(new Args(serverTransport).processor(multiplexedProcessor));
			
			System.out.println("Starting server at port " + PORT);
			server.serve();
			System.out.println("Server stoped");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
