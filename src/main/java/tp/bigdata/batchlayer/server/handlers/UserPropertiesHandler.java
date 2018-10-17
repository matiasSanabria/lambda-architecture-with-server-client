package tp.bigdata.batchlayer.server.handlers;

import org.apache.thrift.TException;

import tp.bigdata.batchlayer.schema.DataUnit;
import tp.bigdata.batchlayer.schema.User;
import tp.bigdata.batchlayer.schema.UserProperty;
import tp.bigdata.batchlayer.schema.UserPropertyValue;
import tp.bigdata.batchlayer.schema.factories.UserFactory;
import tp.bigdata.batchlayer.server.UserProperties.Iface;
import tp.bigdata.batchlayer.server.storing.DataUnitStorer;

public class UserPropertiesHandler implements Iface {

	public void setUsername(long id, String username) throws TException {
		UserPropertyValue upv = new UserPropertyValue();
		upv.setUsername(username);
		
		storeProperty(id, upv);
	}

	public void setName(long id, String name) throws TException {
		UserPropertyValue upv = new UserPropertyValue();
		upv.setName(name);
		
		storeProperty(id, upv);
	}

	public void setEmail(long id, String email) throws TException {
		UserPropertyValue upv = new UserPropertyValue();
		upv.setEmail(email);
		
		storeProperty(id, upv);
	}

	public void setPhone(long id, String phone) throws TException {
		UserPropertyValue upv = new UserPropertyValue();
		upv.setPhone(phone);
		
		storeProperty(id, upv);		
	}

	public void setBirthday(long id, String birthday) throws TException {
		UserPropertyValue upv = new UserPropertyValue();
		upv.setBirthday(birthday);
		
		storeProperty(id, upv);		
	}
	
	private void storeProperty(long id, UserPropertyValue upv) {
		UserFactory userFactory = new UserFactory();
		User user = userFactory.build(id);
		UserProperty property = new UserProperty(user, upv);
		System.out.println("user property: " + property);
		
		DataUnit propertyDataUnit = new DataUnit();
		propertyDataUnit.setUserProperty(property);

		DataUnitStorer storer = new DataUnitStorer();
		storer.store(propertyDataUnit);
	}

}
