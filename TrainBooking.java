package com.prime.Polymorphism;
//compile time polymorphism
public class TrainBooking {
     public void TicketBooking(String source,String destination) {
		  System.out.println("Booked from "+source+" to "+destination);
     }
	 public void TicketBooking(String source,String destination,String trainname) {
			System.out.println("Booked from "+source+" to "+destination+" and train name was "+trainname);
	 }
}
