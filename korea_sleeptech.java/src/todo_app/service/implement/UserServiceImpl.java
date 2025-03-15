package todo_app.service.implement;

import java.util.List;

import todo_app.dto.request.UserSignInRequestDto;
import todo_app.dto.request.UserSignUpRequestDto;
import todo_app.dto.response.UserResponseDto;
import todo_app.entity.User;
import todo_app.repository.UserRepository;
import todo_app.service.UserService;

public class UserServiceImpl implements UserService {
	private final UserRepository repository;
	private static long currentId = 1;
	
	public UserServiceImpl() {
		this.repository = UserRepository.getInstance();	
	}
	
	//Id 생성 로직
	private Long generateId() {
		return currentId++;
	}

	@Override
	public void registerUser(UserSignInRequestDto dto) {
		User user = new User(
				generateId(), dto.getPswd(), dto.getId()
		);
		
		repository.save(user);
				
	}

	@Override
	public void registerUser(UserSignUpRequestDto dto) {
		User user = new User(
				
		);
				
	}

	@Override
	public List<UserResponseDto> listAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserResponseDto getUserById(String
			id, String pswd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(String id, UserSignInRequestDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(String id) {
		// TODO Auto-generated method stub
		
	}
	
	
}
