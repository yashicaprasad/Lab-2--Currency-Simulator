/*
Lab 2
Yashica Prasad and Lois Wong
Purpose of the assignment: Demonstrate use of classes, polymorphism, and inheritance
 */
public abstract class Currency {
	//Class Variables
	protected int currencyWhole;
	protected int currencyFrac;
	
	/*
	setters
	Purpose: assign value to specified variables
	Pre: Takes an int value as input
	Post: Sets the value of currencyWhole or currencyFrac
	Return: N/A

	pseudocode:
	this.currencyFrac = currencyFrac;
	 */

	/*
	getters
	Purpose: get the value of specified variables
	Pre: N/A
	Post: N/A
	Return: the int value of the specified variable

	pseudocode:
	return currencyFrac;

	 */
	public int getCurrencyWhole() {
		return currencyWhole;
	}
	public void setCurrencyWhole(int currencyWhole) {
		this.currencyWhole = currencyWhole;
	}
	public int getCurrencyFrac() {
		return currencyFrac;
	}
	public void setCurrencyFrac(int currencyFrac) {
		this.currencyFrac = currencyFrac;
	}
	
	//Default Construction
	public Currency(){
		currencyWhole = 0;
		currencyFrac = 0;
	}
	//Construction with type double as input
	public Currency(double amt){
		String doubleAsString = String.valueOf(amt);
		int indexOfDecimal = doubleAsString.indexOf(".");
		currencyWhole = Integer.parseInt(doubleAsString.substring(0, indexOfDecimal));

		//dec = doubleAsString.substring(indexOfDecimal + 1).split();
		/*
		if(doubleAsString.charAt(doubleAsString.length() - 1).equals(Character.valueOf('0')))
		{
			System.out.println(Integer.parseInt(doubleAsString.substring(indexOfDecimal + 1)) * 10);

			currencyFrac = Integer.parseInt(doubleAsString.substring(indexOfDecimal + 1)) * 10;
		}
		*/

		//System.out.println("doubleAsString.charAt " + doubleAsString.charAt(doubleAsString.length() - 1).);
		//System.out.println("else" + Integer.parseInt(doubleAsString.substring(indexOfDecimal + 1)));
		currencyFrac = Integer.parseInt(doubleAsString.substring(indexOfDecimal + 1));

	}
	//Copy Constructor
	public Currency(Currency c){
		currencyWhole = c.currencyWhole;
		currencyFrac =  c.currencyFrac;
	}
	public abstract void add();
	
	public abstract void subtract();
	
	public abstract Boolean isEqual();
	
	public abstract Boolean isGreater();
	
	public abstract void print();
	
	//Destructor
	protected void finalize(){
	}  
}
