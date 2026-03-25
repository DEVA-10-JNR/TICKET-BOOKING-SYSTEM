package com.tmf.servlets;

public class Booking {

	private int bookingId;
	private int customerId;
	private int driverId;
	private String pickupLocation;
	private String dropLocation;
	private String status;
	private double price;

	public Booking(int bookingId, int customerId, int driverId, String pickupLocation, String dropLocation,
			String status,double price) {
		super();
		this.bookingId = bookingId;
		this.customerId = customerId;
		this.driverId = driverId;
		this.pickupLocation = pickupLocation;
		this.dropLocation = dropLocation;
		this.status = status;
		this.price= price;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getPickupLocation() {
		return pickupLocation;
	}

	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	public String getDropLocation() {
		return dropLocation;
	}

	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

}


