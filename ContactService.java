package Project;

import java.util.HashMap;
import java.util.Map;


public class ContactService {
	
		private static int uniqueID = 0;
		private Map <Integer,Contact> contactMap = new HashMap<Integer,Contact>();
		
		
		public void addContact(Contact contact){
			if(!contactMap.containsValue(contact)) {
				uniqueID = uniqueID+1;
				contactMap.put(uniqueID, contact);
			}
			
		}
		
		
		
		public void deleteContact(Integer i) {
			
			if (!contactMap.containsKey(i)) {
				throw new IllegalArgumentException("Key doesnt exist");
			}
			if (contactMap.containsKey(i)) {
				contactMap.remove(i);
			
			}
			
		}
			
		
		public void updateContactFirstName(String s,int i) {
			
			if(contactMap.containsKey(i)) {
				Contact contactHolder = contactMap.get(i);
				contactHolder.setContactFirstName(s);	
			}
			
			if(!contactMap.containsKey(i)) {
				throw new IllegalArgumentException("Key doesnt exist");
			}
			
		}
		
			public void updateContactLastName(String s,int i) {
			
			if(contactMap.containsKey(i)) {
				Contact contactHolder = contactMap.get(i);
				contactHolder.setContactLastName(s);
			}
			
			if(!contactMap.containsKey(i)) {
				throw new IllegalArgumentException("Key doesnt exist");
			}
		}
			public void updateContactPhone(String s,int i) {
				
				if(contactMap.containsKey(i)) {
					Contact contactHolder = contactMap.get(i);
					contactHolder.setContactPhone(s);
				}
				
				if(!contactMap.containsKey(i)) {
					throw new IllegalArgumentException("Key doesnt exist");
				}
			}


			public void updateContactAddress(String s,int i) {
				
				if(contactMap.containsKey(i)) {
					Contact contactHolder = contactMap.get(i);
					contactHolder.setContactAddress(s);
				
				}
				
				if(!contactMap.containsKey(i)) {
					throw new IllegalArgumentException("Key doesnt exist");
				}


			}

			public Map<Integer,Contact> getMap(){
				return contactMap;
				
			}
			
}
			
		


		

	