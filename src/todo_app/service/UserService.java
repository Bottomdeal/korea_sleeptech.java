package todo_app.service;

import java.util.List;

import todo_app.dto.request.UserSignInRequestDto;
import todo_app.dto.request.UserSignUpRequestDto;
import todo_app.dto.response.UserResponseDto;

public interface UserService {
	void registerUser(UserSignInRequestDto dto);
	void registerUser(UserSignUpRequestDto dto);
	List<UserResponseDto> listAllUsers();
	UserResponseDto getUserById(String id, String pswd);
	void updateUser(String id, UserSignInRequestDto dto);
	void deleteUser(String id);
	

}
