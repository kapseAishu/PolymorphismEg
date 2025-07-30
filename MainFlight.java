package com.prime.Polymorphism;

public class MainFlight {

	public static void main(String[] args) {
		FlightBooking f=new FlightBooking();
		f.onewaytrip("banga airport","hyd ");
        f.onewaytrip("hyd", "bngr", "8 Dec 2024", "16 dec 2024");
        
        FlightBookingReturnTrip fr=new FlightBookingReturnTrip();
        fr.onewaytrip("bngr air", "hyd air", "16 dec 2024");
	}

}
