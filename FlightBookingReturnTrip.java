package com.prime.Polymorphism;

public class FlightBookingReturnTrip extends FlightBooking {
public void onewaytrip(String from,String to,String enddate) {
	System.out.println("Travelling from"+from+"To"+to+"on"+enddate);
}

}