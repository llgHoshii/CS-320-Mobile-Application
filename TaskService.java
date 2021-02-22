package Project;

import java.util.HashMap;
import java.util.Map;

public class TaskService {

	private static int uniqueID = 0;
	Map <Integer,Task> taskMap = new HashMap<Integer,Task>();

	public void addTask(Task task) {
		if(!taskMap.containsValue(task)) {
			uniqueID = uniqueID+1;
			taskMap.put(uniqueID, task);
		}
	}
	
	public void deleteTask(Integer i) {
		if (!taskMap.containsKey(i)) {
			throw new IllegalArgumentException("Key doesnt exist");
		}
		if (taskMap.containsKey(i)) {
			taskMap.remove(i);
		
		}
	}
	
	public void updateTaskName(String s, Integer i) {
		if(taskMap.containsKey(i)) {
			Task taskHolder = taskMap.get(i);
			taskHolder.setTaskName(s);	
		}
		
		if(!taskMap.containsKey(i)) {
			throw new IllegalArgumentException("Key doesnt exist");
		}
		
		
	}
	public void updateTaskDescription(String s, Integer i) {
		if(taskMap.containsKey(i)) {
			Task taskHolder = taskMap.get(i);
			taskHolder.setTaskDescription(s);	
		}
		
		if(!taskMap.containsKey(i)) {
			throw new IllegalArgumentException("Key doesnt exist");
		}
	}
	
	public Map<Integer,Task> getMap(){
		return taskMap;
		
	}
}
