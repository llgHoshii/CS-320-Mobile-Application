package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import Project.Appointment;
import Project.AppointmentService;

class AppointmentServiceTest {

	@Test
	void testAppointmentService() {
		
		AppointmentService appointment = new AppointmentService();
		//date variables for appointments
		LocalDateTime today = LocalDateTime.now();
		LocalDateTime tomorrow = today.plusDays(1);
		LocalDateTime pasttomorrow = today.plusDays(2);
		
		Appointment app1 = new Appointment("865",tomorrow,"buissness appointment");
		Appointment app2 = new Appointment("123",pasttomorrow,"wash car");
		
		//testing add appointment
		appointment.addAppointment(app1);
		//second attempt at adding same appointment is ignored
		appointment.addAppointment(app1);
		appointment.addAppointment(app2);
		assertTrue(appointment.getMap().size()==2);
		assertTrue(appointment.getMap().containsKey(1));
		assertTrue(appointment.getMap().containsKey(2));
		assertFalse(appointment.getMap().containsKey(3));
	
		
		
		//testing remove appointment
		appointment.deleteAppointment(1);
		assertTrue(appointment.getMap().size()==1);
		assertFalse(appointment.getMap().containsKey(1));
		assertFalse("Key doesnt exist", appointment.getMap().isEmpty());
		assertThrows(IllegalArgumentException.class, () -> {
			appointment.deleteAppointment(1);
		   });
		assertThrows(IllegalArgumentException.class, () -> {
			appointment.deleteAppointment(5);
		   });
		
		}
}


