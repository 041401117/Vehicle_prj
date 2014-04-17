package org.jx.test.rental;

import org.jx.test.Journey;
import org.jx.test.Vehicle;

public class Service {
	private int serviceTimes;
	private double travelKmLastService;
	public Service(int serviceTimes, double travelKmLastService){
		this.serviceTimes = serviceTimes;
		this.travelKmLastService = travelKmLastService;
	}
	
	public String getInfo(Vehicle vehicle, Journey journey){
		StringBuilder info = new StringBuilder(vehicle.getDetails());
		//info.append( Mercedes-Benz CL600 C220 (2003 model)")
		this.serviceTimes = journey.getTotalServices();
		info.append("\n Service times: " + this.serviceTimes +"\t last travel distance: " + this.travelKmLastService);
		info.append("\n No travel has been recorded yet.");
		info.append("\n The vehicle has not yet been serviced.");
		if(journey.getKilometers() - 100 >= this.travelKmLastService){
			info.append("\n Error: Vehicle must be serviced first");
		}
		
		return info.toString();
	}
	public int getServiceTimes() {
		return this.serviceTimes;
	}

	public void setServiceTimes(int serviceTimes) {
		this.serviceTimes = serviceTimes;
	}

	public double getTravelKmLastService() {
		return travelKmLastService;
	}

	public void setTravelKmLastService(double travelKmLastService) {
		this.travelKmLastService = travelKmLastService;
	}

}
