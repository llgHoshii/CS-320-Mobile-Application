package Project;

public class Task {

	private String taskID;
	private String taskName;
	private String taskDescription;
	
	public Task (String taskID, String taskName, String taskDescription){
		
		if (taskID == null || taskID.length()>10) {
			throw new IllegalArgumentException("Invalid Task ID");
		}
		
		if (taskName == null || taskName.length()>20) {
			throw new IllegalArgumentException("Invalid Task Name");
		}
		
		if (taskDescription == null || taskDescription.length()>50) {
			throw new IllegalArgumentException("Invalid Task Description");
		}
		
		this.taskID = taskID;
		this.taskName = taskName;
		this.taskDescription = taskDescription;
		
	}
	
	public String getTaskID(){
		return taskID;
	}
	public String getTaskName() {
		return taskName;
	}
	public String getTaskDescription() {
		return taskDescription;
	}
	

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
}
