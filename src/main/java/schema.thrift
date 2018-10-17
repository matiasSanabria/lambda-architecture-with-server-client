namespace java tp.bigdata.batchlayer.schema

# Nodes
union User {
	1: i64 id;
}

union Page {
	1: i64 id;
}

union Product {
	1: i64 id;
}

# Properties
# Page properties
union PagePropertyValue {
	1: string url;
	2: string urlType;
}

struct PageProperty {
	1: required Page page;
	2: required PagePropertyValue property;
}

# User properties
union UserPropertyValue {
	1: string username;
	2: string name;
	3: string email;
	4: string phone;
	5: string birthday;
}

struct UserProperty {
	1: required User user;
	2: required UserPropertyValue property;
}

# Product properties
union ProductPropertyValue {
	1: string barcode;
	2: string description;
	3: double stock;
	4: double salePrice;
}

struct ProductProperty {
	1: required Product product;
	2: required ProductPropertyValue property;
}

# Edges
struct ProductPurchasedEdge {
	1: required User user;
	2: required Page page;
	3: required Product product;
	4: i32 quantity;
	6: string date;
}

# Tying everything together
union DataUnit {
	1: UserProperty userProperty;
	2: PageProperty pageProperty;
	3: ProductProperty productProperty;
	4: ProductPurchasedEdge productPurchased;
}

struct Pedigree {
	1: required i64 trueAsOfSecs;
}

struct Data {
	1: required Pedigree pedigree;
	2: required DataUnit dataUnit;
}