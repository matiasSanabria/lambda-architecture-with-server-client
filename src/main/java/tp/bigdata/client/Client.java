package tp.bigdata.client;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TMultiplexedProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import tp.bigdata.batchlayer.server.PageProperties;
import tp.bigdata.batchlayer.server.ProductProperties;
import tp.bigdata.batchlayer.server.ProductPurchasedRelationShip;
import tp.bigdata.batchlayer.server.UserProperties;

public class Client {
	private final static String USERID_COLUMN_NAME = "user_id";
	private final static String USERNAME_COLUMN_NAME = "username";
	private final static String NAME_COLUMN_NAME = "name";
	private final static String EMAIL_COLUMN_NAME = "email";
	private final static String PHONE_COLUMN_NAME = "phone";
	private final static String BIRTHDAY_COLUMN_NAME = "birthday";
	private final static String PAGEID_COLUMN_NAME = "page_id";
	private final static String URL_COLUMN_NAME = "url";
	private final static String URL_TYPE_COLUMN_NAME = "url_type";
	private final static String PRODUCTID_COLUMN_NAME = "product_id";
	private final static String BARCODE_COLUMN_NAME = "barcode";
	private final static String DESCRIPTION_COLUMN_NAME = "description";
	private final static String SALE_PRICE_COLUMN_NAME = "sale_price";
	private final static String DATE_COLUMN_NAME = "date";
	private final static String QUANTITY_COLUMN_NAME = "quantity";

	private static final String ADDRESS = "192.168.1.197";
	private static final int PORT = 9090;
	private static final int LIMIT = 100;

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Add dataset path");
			return;
		} else if (!new File(args[0]).exists()) {
			System.out.println("The file does not exists");
			return;
		}

		try {
			String datasetPath = args[0];

			System.out.println("Working Directory = " + System.getProperty("user.dir"));

			TTransport transport = new TSocket(ADDRESS, PORT);
			transport.open();

			TProtocol protocol = new TBinaryProtocol(transport);

			Reader reader = Files.newBufferedReader(Paths.get(datasetPath), Charset.forName("ISO-8859-1"));
			CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader());

			int i = 0;
			for (CSVRecord record : csvParser) {
				if (i == LIMIT)
					break;
				System.out.println("==>record" + i + ": " + record + "\n");
				loadPurchaseEvent(record, protocol);
				++i;
			}

			csvParser.close();
			transport.close();
		} catch (TException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void loadPurchaseEvent(CSVRecord record, TProtocol protocol) throws TException {
		final Long userId = loadUserProperties(record, protocol);
		System.out.println("Load user properties ended");
		final Long pageId = loadPageProperties(record, protocol);
		System.out.println("Load page properties ended");
		final Long productId = loadProductProperties(record, protocol);
		System.out.println("Load product properties ended");

		loadProductPurchasedRelationship(record, protocol, userId, pageId, productId);
		System.out.println("Load product purchased relationship ended");
	}

	private static Long loadUserProperties(CSVRecord record, TProtocol protocol) throws TException {
		final String userProtocolStringID = "userProperties";
		TMultiplexedProtocol multiplexedProtocol = new TMultiplexedProtocol(protocol, userProtocolStringID);
		UserProperties.Client userPropertiesClient = new UserProperties.Client(multiplexedProtocol);

		// Get UserId
		final Long userId = Long.parseLong(record.get(USERID_COLUMN_NAME));

		// Set username
		System.out.println(record.get(USERNAME_COLUMN_NAME));
		final String username = record.get(USERNAME_COLUMN_NAME);
		userPropertiesClient.setUsername(userId, username);

		// Set name
		System.out.println(record.get(NAME_COLUMN_NAME));
		final String name = record.get(NAME_COLUMN_NAME);
		userPropertiesClient.send_setName(userId, name);

		// Set email
		System.out.println(record.get(EMAIL_COLUMN_NAME));
		final String email = record.get(EMAIL_COLUMN_NAME);
		userPropertiesClient.send_setEmail(userId, email);

		// Set phone
		System.out.println(record.get(PHONE_COLUMN_NAME));
		final String phone = record.get(PHONE_COLUMN_NAME);
		userPropertiesClient.send_setPhone(userId, phone);

		// Set birthday
		System.out.println(record.get(BIRTHDAY_COLUMN_NAME));
		final String birthday = record.get(BIRTHDAY_COLUMN_NAME);
//		userPropertiesClient.send_setBirthday(userId, birthday);

		return userId;
	}

	private static Long loadPageProperties(CSVRecord record, TProtocol protocol) throws TException {
		final String pageProtocolStringID = "pageProperties";
		TMultiplexedProtocol multiplexedProtocol = new TMultiplexedProtocol(protocol, pageProtocolStringID);
		PageProperties.Client pagePropertiesClient = new PageProperties.Client(multiplexedProtocol);

		// Get page id
		final Long pageId = Long.parseLong(record.get(PAGEID_COLUMN_NAME));

		// Set page url
		System.out.println(record.get(URL_COLUMN_NAME));
		final String url = record.get(URL_COLUMN_NAME);
		pagePropertiesClient.send_setUrl(pageId, url);

		// Set page type
		System.out.println(record.get(URL_TYPE_COLUMN_NAME));
		final String urlType = record.get(URL_TYPE_COLUMN_NAME);
		pagePropertiesClient.send_setUrlType(pageId, urlType);

		return pageId;
	}

	private static Long loadProductProperties(CSVRecord record, TProtocol protocol) throws TException {
		final String productProtocolStringID = "productProperties";
		TMultiplexedProtocol multiplexedProtocol = new TMultiplexedProtocol(protocol, productProtocolStringID);
		ProductProperties.Client productPropertiesClient = new ProductProperties.Client(multiplexedProtocol);

		// Get page id
		final Long productId = Long.parseLong(record.get(PRODUCTID_COLUMN_NAME));

		// Set product barcode
		System.out.println(record.get(BARCODE_COLUMN_NAME));
		final String barcode = record.get(BARCODE_COLUMN_NAME);
		productPropertiesClient.send_setBarcode(productId, barcode);

		// Set product description
		System.out.println(record.get(DESCRIPTION_COLUMN_NAME));
		final String description = record.get(DESCRIPTION_COLUMN_NAME);
		productPropertiesClient.send_setDescription(productId, description);

		// Set product sale price
		System.out.println(record.get(SALE_PRICE_COLUMN_NAME));
		final Double salePrice = Double.parseDouble(record.get(SALE_PRICE_COLUMN_NAME));
		productPropertiesClient.send_setSalePrice(productId, salePrice);

		return productId;
	}

	private static void loadProductPurchasedRelationship(CSVRecord record, TProtocol protocol, Long userId, Long pageId,
			Long productId) throws TException {
		final String relationshipStringID = "productPurchasedRelationship";
		TMultiplexedProtocol multiplexedProtocol = new TMultiplexedProtocol(protocol, relationshipStringID);
		ProductPurchasedRelationShip.Client productPurchasedRelationshipClient = new ProductPurchasedRelationShip.Client(
				multiplexedProtocol);

		System.out.println(record.get(QUANTITY_COLUMN_NAME));
		final Integer quantity = Integer.parseInt(record.get(QUANTITY_COLUMN_NAME));
		System.out.println(record.get(DATE_COLUMN_NAME));
		final String date = record.get(DATE_COLUMN_NAME);

		productPurchasedRelationshipClient.send_setRelationship(userId, pageId, productId, quantity, date);
	}

	private static boolean checkForColumnValue(CSVRecord record, String columnName) {
		return record.isSet(columnName) && !record.get(columnName).isEmpty();
	}

}