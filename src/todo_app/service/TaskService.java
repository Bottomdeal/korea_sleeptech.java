package todo_app.service;

import java.util.List;

import todo_app.dto.request.TaskRequestDto;

public interface TaskService {
	void createTask(TaskRequestDto dto);
	List<TaskRequestDto> getAllTasks();
	List<TaskRequestDto> filterTasksBydateOfTodo(String dateOfTodo);
	void deleteTask(Long num);
}
