package com.ConstructorInjection.SimpleInjection;

public class Address {
	private int HouseNo;
	private String Street;
	private String City;
	private long Pin;
	private String State;

	public int getHouseNo() {
		return HouseNo;
	}

	public void setHouseNo(int houseNo) {
		HouseNo = houseNo;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public long getPin() {
		return Pin;
	}

	public void setPin(long pin) {
		Pin = pin;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	@Override
	public String toString() {
		return "Address [HouseNo=" + HouseNo + ", Street=" + Street + ", City=" + City + ", Pin=" + Pin + ", State="
				+ State + "]";
	}

}
