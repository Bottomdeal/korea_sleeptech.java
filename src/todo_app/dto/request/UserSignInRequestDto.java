package todo_app.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserSignInRequestDto {
	private String id; // 유저 아이디
	private String pswd; // 유저 비밀번호
	
	
}
