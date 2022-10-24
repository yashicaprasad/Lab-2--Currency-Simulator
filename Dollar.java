
public class Dollar extends Currency{
	Dollar() {
		super();
	}
	private String currencyType = "Dollar";

	/*
	add()
	Purpose: adds an input object of the same currency type
	Pre: takes a Dollar object as input
	Post: currencyWhole and currencyFrac are updated / added to
	Return: N/A

	pseudocode
	if (c.currencyWhole > 0)
		currencyWhole += c.currencyWhole
		int netCents = currencyWhole * 100 + currencyFrac + c.currencyFrac //total value in cents
		currencyWhole = netCents / 100
		currencyFrac = netCents % 100

	else throw invalidAddition exception c.currencyWhole <= 0
	 */
	public void add(Dollar c) {
		if(c.currencyWhole > 0) {
			currencyWhole += c.currencyWhole;
			//convert all calculations to cents
			int netCents = currencyWhole * 100 + currencyFrac + c.currencyFrac;
			currencyWhole = netCents / 100;
			currencyFrac = netCents % 100;
		}
		else {

		}
	}
	/*
	subtract()
	Purpose: subtracts an input object of the same currency type
	Pre: takes a Dollar object as input
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

	else throw invalidAddition exception c.currencyWhole <= 0
	 */
	public void subtract(Dollar c) {
		if(c.currencyWhole > 0 && !isGreater(c)) {
			if (isEqual(c)) {
				currencyWhole = 0;
				currencyFrac = 0;
			}
			else {
				currencyWhole -= c.currencyWhole;
				//convert all calculations to cents
				int netCents = currencyWhole * 100 + currencyFrac - c.currencyFrac;
				currencyWhole = netCents / 100;
				currencyFrac = netCents % 100;
			}
		}
		else {}
	}
	/*
		isEqual()
		Purpose: checks if the input object's balance is equal to the original (previous object's) balance
		Pre: takes a Dollar object as input
		Post: N/A
		Return: returns true if (currencyWhole == c.currencyWhole && currencyFrac == c.currencyFrac)

	isEqual() pseudocode
		if (currencyWhole == c.currencyWhole && currencyFrac == c.currencyFrac)
			return true
	return false
	 */
	public Boolean isEqual(Dollar c) {
		if(currencyWhole == c.currencyWhole && currencyFrac == c.currencyFrac) {
			return true;
		}
		return false;
	}

	/*
		isGreater()
		Purpose: checks if the input object's balance is greater than the original (previous object's) balance
		Pre: takes a Dollar object as input
		Post: N/A
		Return: returns true if if input object's balance > previous/original balance

	isGreater() pseudocode
		if (currencyWhole == c.currencyWhole)
			if (currencyFrac <= c.currencyFrac)
				return true
			else return false
		else if (currencyWhole < c.currencyWhole)
			return true;
		return false
	 */

	public Boolean isGreater(Dollar c) {
		if(currencyWhole == c.currencyWhole) {
			if(currencyFrac <= c.currencyFrac)
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
		Pre: takes a Dollar object as input
		Post: N/A
		Return: N/A

	isGreater() pseudocode
	System.out.println(c.currencyWhole + "." + c.currencyFrac);
	 */
	public void print(Dollar c) {
		System.out.println(c.currencyWhole + "." + c.currencyFrac);
	}

}
