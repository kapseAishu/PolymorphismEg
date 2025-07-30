package com.prime.Polymorphism;
//compile time polymorphism
public class FlightBooking {
	public void onewaytrip(String from,String to) {
		System.out.println("Travelling from"+from+"To"+to);
	}
	public void onewaytrip(String from,String to,String startdate,String enddate) {
       System.out.println("Travelling from"+from+"To"+to+"on"+startdate);
}
}
