package backend.services;

import backend.dao.UserDao;
import backend.model.User;

public class UserRest extends UserService {

	public UserRest(UserDao dao) {
		super(dao);
	}

	@Override
	public void save(User user) {
		System.out.println("Starting a save operation through Rest Protocol!");
		dao.save(user);
	}
}
