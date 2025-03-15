package todo_app.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TaskRequestDto {
	private String todo;	// 할 일
	private String dateOfTodo; 	// 할일의 날짜
}
