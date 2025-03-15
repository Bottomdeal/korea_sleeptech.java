package todo_app.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserSignUpRequestDto {
	private String id; // 유저 아이디
	private String pswd; // 유저 비밀번호
	private String nickName; // 유저 닉네임
	private String dateOfSignUp; // 유저 회원가입 날짜
}
