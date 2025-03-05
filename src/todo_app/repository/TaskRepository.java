package todo_app.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import todo_app.entity.Task;

public class TaskRepository {
	private List<Task> tasks = new ArrayList<Task>();
	private static final TaskRepository instance = new TaskRepository();
	
	private TaskRepository() {}
	
	public static TaskRepository getInstance() {
		return instance;
	}
	
	// 할일 등록
	public void save(Task task) {
		tasks.add(task);
	}
	
	// 할일 조회(단건)
	public Optional<Task> findByDate(String dateOfTodo){
		return tasks.stream()
				.filter(task -> task.getTodo().equals(dateOfTodo))
				.findFirst();
	}
	// 할일 조회(전체)
	public List<Task> findAll() {
		return tasks;
	}
	// 할일 수정
	public void edit(Task task) {
		
	}
	// 할일 삭제
	public void delete(Task task) {
		tasks.remove(task);
	}
}
