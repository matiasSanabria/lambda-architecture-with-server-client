include "schema.thrift"

namespace java tp.bigdata.batchlayer.server

service UserProperties {
	void setUsername(1:i64 id, 2:string username),
	void setName(1:i64 id, 2:string name),
	void setEmail(1:i64 id, 2:string email),
	void setPhone(1:i64 id, 2:string phone),
	void setBirthday(1:i64 id, 2:string birthday)
}

service PageProperties {
	void setUrl(1:i64 id, 2:string url),
	void setUrlType(1:i64 id, 2:string urlType)
}

service ProductProperties {
	void setBarcode(1:i64 id, 2:string barcode),
	void setDescription(1:i64 id, 2:string description),
	void setStock(1:i64 id, 2:double stock),
	void setSalePrice(1:i64 id, 2:double salePrice)
}

service ProductPurchasedRelationShip {
	void setRelationship(1:i64 userId, 2:i64 pageId, 3:i64 productId, 4:i32 quantity, 5:string date)
}