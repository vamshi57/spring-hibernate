package com.vamshi.sp11;

public class Car {
	private String carName;
	private String registrationId;
	private String fuelType;
	private String color;
	
	

	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}
public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", registrationId=" + registrationId + ", fuelType=" + fuelType + ", color="
				+ color + "]";
	}
	
	

}
