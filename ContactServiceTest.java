package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import Project.Contact;
import Project.ContactService;

class ContactServiceTest {
	
	
	@Test
	void testContactService() {
		
		ContactService service = new ContactService();
		
		Contact contact1 = new Contact("1" ,"Jaime","Galarreta","1234567890","Jose Antonio 189");
		Contact contact2 = new Contact("2" ,"Jhon","Snow","7539514562","Winterfell");
		
		//testing add contacts
		service.addContact(contact1);
		//second attempt at adding same contact is ignored
		service.addContact(contact1);
		service.addContact(contact2);
		assertTrue(service.getMap().size()==2);
		assertTrue(service.getMap().containsKey(1));
		assertTrue(service.getMap().containsKey(2));
		assertFalse(service.getMap().containsKey(3));
		
		//testing delete contact
		service.deleteContact(1);
		assertTrue(service.getMap().size()==1);
		assertFalse(service.getMap().containsKey(1));
		assertFalse("Key doesnt exist", service.getMap().isEmpty());
		assertThrows(IllegalArgumentException.class, () -> {
	        service.deleteContact(5);
	    });
			
		//testing update first name
		service.updateContactFirstName("Lemon", 2);
		assertTrue(contact2.getFirstName()=="Lemon");
		assertFalse(contact2.getFirstName()=="Jaime");
		assertThrows(IllegalArgumentException.class, () -> {
	        service.updateContactFirstName("Paula",5);
	    });
		
		//testing update last name
		service.updateContactLastName("Fruta", 2);
		assertTrue(contact2.getLastName()=="Fruta");
		assertFalse(contact2.getLastName()=="Galarreta");
		assertThrows(IllegalArgumentException.class, () -> {
	        service.updateContactLastName("Aunteño",5);
	    });
		
		//testing update phone
		service.updateContactPhone("5052420541", 2);
		assertTrue(contact2.getPhone()=="5052420541");
		assertFalse(contact2.getPhone()=="1234567890");
		assertThrows(IllegalArgumentException.class, () -> {
	        service.updateContactPhone("1234567854",5);
	    });
		
		//testing update address
		service.updateContactAddress("La Molina", 2);
		assertTrue(contact2.getAddress()=="La Molina");
		assertFalse(contact2.getAddress()=="Jose Antonio 189");
		assertThrows(IllegalArgumentException.class, () -> {
	        service.updateContactAddress("Cuzco",5);
	    });
		
		
		}
	
	
	
	

	
	
	
	
	
	
}


