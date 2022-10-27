/*
Lab 2
Yashica Prasad and Lois Wong
Purpose of the assignment: Demonstrate use of classes, polymorphism, and inheritance
 */

package com.deanza.lab2;
import java.util.Objects;
import java.util.Scanner;

public class Lab2Main {
	public static void main(String[] args) {
		Currency[] currencyArr = new Currency[2]; //array of references
		currencyArr[0] = new Pound(0.00);
		currencyArr[1] = new Dollar(0.00);
		Pound firstpound = (Pound )currencyArr[0];
		Dollar firstdollar = (Dollar )currencyArr[1];


		Dollar d1 = new Dollar(0.00);
		Pound p1 = new Pound(0.00);
		p1.print();
		d1.print();

		for(int i = 0; i > -1; i++) {
			Scanner myObj = new Scanner(System.in);
			System.out.printf("Please enter a command: ");
			String input = myObj.nextLine();
			String[] separatedInput = input.split(" ");

			if (Objects.equals(separatedInput[0], "q"))
			{
				i = -2;
			}
			else {
				if (Objects.equals(separatedInput[3], "dollar"))
				{
					d1 = new Dollar(Double.parseDouble(separatedInput[2]));
					//firstpound.print();
					//firstdollar.print();
				}
				if(Objects.equals(separatedInput[3], "pound"))
				{
					p1 = new Pound(Double.parseDouble(separatedInput[2]));

				}
				
				if(Objects.equals(separatedInput[1], "d"))
				{
					if(Objects.equals(separatedInput[0], "a"))
					{
						if(Objects.equals(separatedInput[3], "dollar")) {
							firstdollar.add(d1);
							firstpound.print();
							firstdollar.print();
						}
						else {
							System.out.println("Invalid addition");
							firstpound.print();
							firstdollar.print();
						}
					}
					if(Objects.equals(separatedInput[0], "s"))
					{
						if(Objects.equals(separatedInput[3], "dollar")) {
							firstdollar.subtract(d1);
							firstpound.print();
							firstdollar.print();
						}
						else {
							System.out.println("Invalid subtraction");
							firstpound.print();
							firstdollar.print();
						}
					}
				}
				
				if(Objects.equals(separatedInput[1], "p") & Objects.equals(separatedInput[3], "pound"))
				{
					if (Objects.equals(separatedInput[0], "a"))
					{
						if(Objects.equals(separatedInput[3], "pound")) {
							firstpound.add(p1);
							firstpound.print();
							firstdollar.print();
						}
						else {
							System.out.println("Invalid addition");
							firstpound.print();
							firstdollar.print();
						}

					}
					if(Objects.equals(separatedInput[0], "s"))
					{
						if(Objects.equals(separatedInput[3], "dollar")) {
							firstpound.subtract(p1);
							firstpound.print();
							firstdollar.print();
						}
						else {
							System.out.println("Invalid subtraction");
							firstpound.print();
							firstdollar.print();
						}
					}
				}
				
			}
		}
	}
}

