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
					//debugging
					System.out.println("Creating Dollar");
					d1 = new Dollar(Double.parseDouble(separatedInput[2]));
					firstpound.print();
					firstdollar.print();
				}
				if(Objects.equals(separatedInput[3], "pound"))
				{
					System.out.println("Creating Pound");
					p1 = new Pound(Double.parseDouble(separatedInput[2]));
					firstpound.print();
					firstdollar.print();

				}
				
				if(Objects.equals(separatedInput[1], "d"))
				{
					if(Objects.equals(separatedInput[0], "a"))
					{
						firstdollar.add(d1);
						firstpound.print();
						firstdollar.print();
					}
					if(Objects.equals(separatedInput[0], "s"))
					{
						firstdollar.subtract(d1);
						firstpound.print();
						firstdollar.print();

					}
				}
				
				if(Objects.equals(separatedInput[1], "p"))
				{
					if (Objects.equals(separatedInput[0], "a"))
					{
						firstpound.add(p1);
						firstpound.print();
						firstdollar.print();

					}
					if(Objects.equals(separatedInput[0], "s"))
					{
						firstpound.subtract(p1);
						firstpound.print();
						firstdollar.print();
					}
				}
				
			}
		}
	}
}

