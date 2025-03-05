package todo_app.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import todo_app.entity.User;

public class UserRepository {
	List<User> users = new ArrayList<User>();
	private static final UserRepository instance = new UserRepository();
	
	private UserRepository() {}
	
	public static UserRepository getInstance() {
		return instance;
	}
	
	// 사용자 등록
	public void save(User newUser) {
		users.add(newUser);
	}
	//사용자 조회(단건)
	public Optional<User> findById(String id, String pswd) {
		return users.stream()
				.filter(user -> user.getId().equals(id) && user.getPswd().equals(pswd))
				.findFirst();
	}
	//사용자 조회(전체)
	public List<User> findAll() {
		return users;
	}
	
	//사용자 삭제
	public void delete(User user) {
		users.remove(user);
	}
}
