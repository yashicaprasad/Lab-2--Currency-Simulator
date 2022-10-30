package com.deanza.lab2;

public class Driver {
	public static void main(String[] args) {
		Dollar d1 = new Dollar(0.00);
		Dollar d2 = new Dollar(2.00);
		
		d2.subtract(d1);
		d2.print();
	}
}
