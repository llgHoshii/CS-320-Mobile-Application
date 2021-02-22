package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Project.Contact;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("12345","Jose","Juarez","7895214587","Street Drive");
		assertTrue(contact.getContactID().equals("12345"));
		assertTrue(contact.getFirstName().equals("Jose"));
		assertTrue(contact.getLastName().equals("Juarez"));
		assertTrue(contact.getPhone().equals("7895214587"));
		assertTrue(contact.getAddress().equals("Street Drive"));	
		
	}
	
	@Test
	void testContactIDToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("12345678901","Juan","Jose","7895214587","Street Drive");
		});	
	}
	
	@Test
	void testContactIDIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact(null,"Juan","Jose","7895214587","Street Drive");
		});		}
	
	@Test
	void testContactNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("12345","JuanJuanJuan","Jose","7895214587","Street Drive");
		});		}
	
	@Test
	void testContactNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("12345",null,"Jose","7895214587","Street Drive");
		});		}
	
	@Test
	void testContactLastNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("12345","Juan","JoseJoseJose","7895214587","Street Drive");
		});		}
	
	@Test
	void testContactLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("12345","Juan",null,"7895214587","Street Drive");
		});		}
	
	@Test
	void testContactPhoneToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("12345","Juan","Jose","78952145871","Street Drive");
		});		}
	
	@Test
	void testContactPhoneToShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("12345","Juan","Jose","7894587","Street Drive");
		});		}
	
	@Test
	void testContactPhoneIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("12345","Juan","Jose",null,"Street Drive");
		});		}
	
	@Test
	void testContactAddressToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("12345","Juan","Jose","7895214587","Street Drive Boulevar Pizzeria Plaza");
		});		}
	
	@Test
	void testContactAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("12345","Juan","Jose","7895214587",null);
		});		}
	
	
	}
	



