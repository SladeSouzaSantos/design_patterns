package hexagonal.core.ports;

import java.util.List;

import hexagonal.core.model.User;

public interface UserRepository {
	void save(User user);
	List<User> getAll();
}
