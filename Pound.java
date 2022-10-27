/*
Lab 2
Yashica Prasad and Lois Wong
Purpose of the assignment: Demonstrate use of classes, polymorphism, and inheritance
 */
package com.deanza.lab2;

public class Pound extends Currency{
	public Pound(){
		super();
	}
	
	public Pound(double amt) {
        	super(amt);
    	}

	public Pound(Pound c){
		super(c);
	}
	private String currencyType = "Pound";
	/*
	add()
	Purpose: adds an input object of the same currency type
	Pre: takes a Pound object as input
	Post: currencyWhole and currencyFrac are updated / added to
	Return: N/A

	pseudocode
	if (c.currencyWhole > 0)
		currencyWhole += c.currencyWhole
		int netCents = currencyWhole * 100 + currencyFrac + c.currencyFrac //total value in pence
		currencyWhole = netCents / 100
		currencyFrac = netCents % 100

	else throw invalidAddition exception c.currencyWhole <= 0
	 */
	
	public void add(Pound c) {	
		try {
			if(c.currencyWhole >= 0) {
				currencyWhole += c.currencyWhole;
				//convert all calculations to cents
				int netCents = currencyWhole*100 + currencyFrac + c.currencyFrac;
				currencyWhole = netCents/100;
				currencyFrac = netCents%100;
			}
		}
		catch(Exception e) {
			System.out.println("Invalid addition");
		}
	}
	/*
	subtract()
	Purpose: subtracts an input object of the same currency type
	Pre: takes a Pound object as input
	Post: currencyWhole and currencyFrac are updated / subtracted from
	Return: N/A

	subrract() pseudocode
	if (c.currencyWhole > 0 && !isGreater (c))

		if (isEqual(c))
			currencyWhole = 0
			currencyFrac = 0
		else
			currencyWhole -= c.currencyWhole
			int netCents = currenchWhole * 100 + currencyFrac - c.currencyFrac //total value in cents
			currencyWhole = netCents / 100
			currencyFrac = netCents % 100

	else throw exception e c.currencyWhole <= 0
	 */
	public void subtract(Pound c) {
		try {
			if(c.currencyWhole >= 0 && !isGreater(c)) {
				currencyWhole -= c.currencyWhole;
				//convert all calculations to cents
				int netCents = currencyWhole*100 + currencyFrac - c.currencyFrac;
				currencyWhole = netCents/100;
				currencyFrac = netCents%100;
			}			
		}
		catch(Exception e) {
			System.out.println("Invalid subtraction");
		}
	}
	/*
	isEqual()
	Purpose: checks if the input object's balance is equal to the original (previous object's) balance
	Pre: takes a Pound object as input
	Post: N/A
	Return: returns true if (currencyWhole == c.currencyWhole && currencyFrac == c.currencyFrac)

	isEqual() pseudocode
		if (currencyWhole == c.currencyWhole && currencyFrac == c.currencyFrac)
			return true
	return false
	 */
	public Boolean isEqual(Pound c) {
		if(currencyWhole==c.currencyWhole && currencyFrac==c.currencyFrac) {
			return true;
		}
		return false;
	}
	/*
	isGreater()
	Purpose: checks if the input object's balance is greater than the original (previous object's) balance
	Pre: takes a Pound object as input
	Post: N/A
	Return: returns true if input object's balance > previous/original balance

	isGreater() pseudocode
		if (currencyWhole == c.currencyWhole)
			if (currencyFrac <= c.currencyFrac)
				return true
			else return false
		else if (currencyWhole < c.currencyWhole)
			return true;
		return false
	 */
	public Boolean isGreater(Pound c) {
		if(currencyWhole == c.currencyWhole) {
			if(currencyFrac<c.currencyFrac)
				return true;
			else return false;
		}
		else if(currencyWhole < c.currencyWhole) {
			return true;
		}
		return false;
	}
	/*
	print()
	Purpose: prints the balance and currency of the input object
	Pre: takes a Pound object as input
	Post: N/A
	Return: N/A

	public void print(Pound c) {
		System.out.println(c.currencyWhole + "." + c.currencyFrac + currencyType);
	}
	 */
	public void print() {	
		System.out.println(this.currencyWhole + "." + this.currencyFrac + " " + this.currencyType);
	}
	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void subtract() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Boolean isEqual() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Boolean isGreater() {
		// TODO Auto-generated method stub
		return null;
	}

}
