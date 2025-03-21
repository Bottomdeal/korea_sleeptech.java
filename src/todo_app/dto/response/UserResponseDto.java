package todo_app.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserResponseDto {
	private String id;
	private String nickName;
	private String dateOfSignUp;
}
