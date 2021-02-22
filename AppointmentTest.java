package tests;

import static org.junit.jupiter.api.Assertions.*;


import java.time.LocalDateTime;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Project.Appointment;


class AppointmentTest {
	
	LocalDateTime today = LocalDateTime.now();
	LocalDateTime tomorrow = today.plusDays(1);
	LocalDateTime yesterday = today.minusDays(1);
		
	@Test
	void testAppointment() {
		Appointment appointment = new Appointment("1", tomorrow ,"Visit dentist");
		assertTrue(appointment.getappID().equals("1"));
		assertTrue(appointment.getappDate().equals(tomorrow));
		assertTrue(appointment.getAppDescription().equals("Visit dentist"));	
	}
	
	@Test
	void testAppIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Appointment(null,tomorrow,"visit dentist");
		});	}
	@Test
	void testAppIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Appointment("12345678900",tomorrow,"visit dentist");
		});	}
	@Test
	void testAppDateIsNull() {
			Assertions.assertThrows(IllegalArgumentException.class, () ->{
				new Appointment("1",null,"visit dentist");
			});	}
	@Test
	void testAppDateIsBefore() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Appointment("1",yesterday,"visit dentist");
		});	}
	@Test
	void testAppDateIsNow() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Appointment("1",today,"visit dentist");
		});	}
	@Test
	void testAppDescriptionIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Appointment("1",tomorrow,null);
		});	}
	@Test
	void testAppDescriptionIsTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Appointment("1",tomorrow,"Visit dentist and wash mouth dont forget to flose and use fluor");
		});	}
	
}
