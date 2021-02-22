package Project;

import java.util.HashMap;
import java.util.Map;

public class AppointmentService {
	
	private static int uniqueID = 0;
	Map <Integer, Appointment> appMap = new HashMap<Integer, Appointment>();
	
	
	
	public void addAppointment(Appointment appointment) {
		
		if(!appMap.containsValue(appointment)) {
			uniqueID = uniqueID+1;
			appMap.put(uniqueID, appointment);
		}
		
	}
		
	public void deleteAppointment(Integer i) {
		
		if (!appMap.containsKey(i)) {
			throw new IllegalArgumentException("Key doesnt exist");
		}
		if (appMap.containsKey(i)) {
			appMap.remove(i);
		
		}
	}
	public Map<Integer,Appointment> getMap(){
		return appMap;
		
	}

}
