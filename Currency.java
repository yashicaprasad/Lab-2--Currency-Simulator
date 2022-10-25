/*
Lab 2
Yashica Prasad and Lois Wong
Purpose of the assignment: Demonstrate use of classes, polymorphism, and inheritance
 */
public abstract class Currency {
	//Class Variables
	protected int currencyWhole;
	protected int currencyFrac;
	
	//Getter Setters
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
		currencyFrac = Integer.parseInt(doubleAsString.substring(indexOfDecimal));
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
