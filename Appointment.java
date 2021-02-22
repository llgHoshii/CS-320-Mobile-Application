package Project;


import java.time.LocalDateTime;


public class Appointment {
	
	private String appID;
	private LocalDateTime appDate;
	private String appDescription;
	// creating a variable to compare date
	private LocalDateTime todayDate = LocalDateTime.now();
	
	public Appointment (String appID, LocalDateTime appDate, String appDescription){ 
		 
		if (appID == null || appID.length()>10) {
			throw new IllegalArgumentException("Invalid Appointment ID");
		}
		if (appDate == null || appDate.isBefore(todayDate) || appDate.isEqual(todayDate)) {
			throw new IllegalArgumentException("Invalid Appointment Date");
		}
		if (appDescription == null || appDescription.length()>50) {
			throw new IllegalArgumentException("Invalid Appointment Description");
		}
		
		this.appID = appID;
		this.appDate = appDate;
		this.appDescription = appDescription;
		
	}
	
	public String getappID() {
		return appID;
	}
	public LocalDateTime getappDate() {
		return appDate;
	}
	public String getAppDescription() {
		return appDescription;
	}

}
