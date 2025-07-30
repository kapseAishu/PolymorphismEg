package com.prime.Polymorphism;

public class MainTrainBooking {
	public static void main(String[] args) {
		TrainBooking t1=new TrainBooking();
	    t1.TicketBooking("Bang", "Hyd");
	    t1.TicketBooking("Bang", "Hyd", "CMT EXPRESS");
		
	    TrainBookingReturnTrip t2=new TrainBookingReturnTrip ();
	    t2.TicketBooking("tirupati", "Adoni");
	    t2.TicketBooking("tirupati", "Adoni", "Rayalsemmaexp");
	    t2.TicketBooking("Adoni", "Tirupati", "Rayalsemmaexp", "8 dec 2024");
	}
}
