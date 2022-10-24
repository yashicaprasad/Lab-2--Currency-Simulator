
public class Dollar extends Currency{
	Dollar(){
		super();
	}
	private String currencyType = "Dollar";
	
	public void add(Dollar c) {		
		if(c.currencyWhole > 0) {
			currencyWhole += c.currencyWhole;
			//convert all calculations to cents
			int netCents = currencyWhole*100 + currencyFrac + c.currencyFrac;
			currencyWhole = netCents/100;
			currencyFrac = netCents%100;
		}
		else {
			
		}
	}
	
	public void subtract(Dollar c) {
		if(c.currencyWhole > 0 && !isGreater(c)) {
			currencyWhole -= c.currencyWhole;
			//convert all calculations to cents
			int netCents = currencyWhole*100 + currencyFrac + c.currencyFrac;
			currencyWhole = netCents/100;
			currencyFrac = netCents%100;
		}
		else {
			
		}
	}
	public Boolean isEqual(Dollar c) {
		if(currencyWhole==c.currencyWhole && currencyFrac==c.currencyFrac) {
			return true;
		}
		return false;
	}
	public Boolean isGreater(Dollar c) {
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
	public void print(Dollar c) {	
		System.out.println(c.currencyWhole + "." + c.currencyFrac);
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

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

}
