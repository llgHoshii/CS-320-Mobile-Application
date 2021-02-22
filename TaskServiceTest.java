package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import Project.Task;
import Project.TaskService;


class TaskServiceTest {

	@Test
	public void testTaskService() {
		
		TaskService task = new TaskService();
		
		Task Task1 = new Task("1","shopping","this is a shopping cart");
		Task Task2 = new Task("2","wash car","dont use hot water");
		
		//testing add tasks
		task.addTask(Task1);
		//second attempt at adding same task is ignored
		task.addTask(Task1);
		task.addTask(Task2);
		assertTrue(task.getMap().size()==2);
		assertTrue(task.getMap().containsKey(1));
		assertTrue(task.getMap().containsKey(2));
		assertFalse(task.getMap().containsKey(3));
		
		//testing delete task
			task.deleteTask(1);
			assertTrue(task.getMap().size()==1);
			assertFalse(task.getMap().containsKey(1));
			assertFalse("Key doesnt exist", task.getMap().isEmpty());
			assertThrows(IllegalArgumentException.class, () -> {
			     task.deleteTask(5);
			   });
					
		//testing update task name
			task.updateTaskName("Cleaning", 2);
			assertTrue(Task2.getTaskName()=="Cleaning");
			assertFalse(Task2.getTaskName()=="wash car");
			assertThrows(IllegalArgumentException.class, () -> {
		        task.updateTaskName("study",5);
			  });
				
		//testing update description
			task.updateTaskDescription("Clean the house", 2);
			assertTrue(Task2.getTaskDescription()=="Clean the house");
			assertFalse(Task2.getTaskDescription()=="dont use hot water");
			assertThrows(IllegalArgumentException.class, () -> {
			      task.updateTaskDescription("Cook",5);
			  });
		
		
		}
}

