package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Project.Task;

class TaskTest {

	@Test
	void testTask() {
		Task task = new Task("12345","shopping","This is a shopping cart");
		assertTrue(task.getTaskID().equals("12345"));
		assertTrue(task.getTaskName().equals("shopping"));
		assertTrue(task.getTaskDescription().equals("This is a shopping cart"));
	}
	
	@Test
	void testTaskIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Task("12345678901","shopping","shopping cart");
		});	}
	
	@Test
	void testTaskNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Task("12345","shoppingnametoolongfdsfsdf","shopping cart");
		});	}
	@Test
	void testDescriptionTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Task("13245","shopping","shopping cart is very essential and i need more characters");
		});	}
	@Test
	void testTaskIDIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Task(null,"shopping","shopping cart");
		});	}
	@Test
	void testTaskNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Task("12345678901",null,"shopping cart");
		});	}
	@Test
	void testTaskDescriptionIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Task("12345678901","shopping",null);
		});	}

}
