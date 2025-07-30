package com.prime.Polymorphism;

public class MainBank {
   public static void main(String []args) {
	   RBI r;
	   r=new HDFC();
	   System.out.println(r.bankloan());
	   r=new AxisBank();
	   System.out.println( r.bankloan());
	   r=new ICICI();
	   System.out.println(r.bankloan());
   }
}
