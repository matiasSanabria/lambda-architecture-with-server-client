package tp.bigdata.batchlayer.schema.factories;

import tp.bigdata.batchlayer.schema.User;

public class UserFactory implements Factory<User>{

	public User build(long id) {
		User user = new User();
		user.setId(id);
		return user;
	}

}
