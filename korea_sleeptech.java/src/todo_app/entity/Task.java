package todo_app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Task {
	private Long num;		// 할 일 고유 번호
	private String todo;		// 할 일
	private String dateOfTodo; // 할일의 날짜
}
