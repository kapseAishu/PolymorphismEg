package com.prime.Polymorphism;

public class TrainBookingReturnTrip extends TrainBooking{
	public void TicketBooking(String source,String destination,String trainname,String endDate) {
		System.out.println("Booked from "+source+" to "+destination+" and train name was "+trainname+" return date is: "+endDate);
 }

}

