package todo_app.service.implement;

import java.util.List;

import todo_app.dto.request.TaskRequestDto;
import todo_app.entity.Task;
import todo_app.repository.TaskRepository;
import todo_app.service.TaskService;

public class TaskServiceImpl implements TaskService{
	private final TaskRespository taskRepository = TaskRepository.getInstance();

	@Override
	public void createTask(TaskRequestDto dto) {
		Task task = new Task(
				dto.getNum(), dto.getTodo(), dto.getDateOfTodo(),
				dto.isCompleted(), null);
		taskRepository.save(task);
		
	}

	@Override
	public List<TaskRequestDto> getAllTasks() {
		
		return null;
	}

	@Override
	public List<TaskRequestDto> filterTasksBydateOfTodo(String dateOfTodo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTask(Long num) {
		
	}
}
