//class NumberInt.java  Michael Curley assignment4 Question3
// Dr Matthias Nickles

public class NumberInt extends Number {
	private double number;//private datafield to store a double number

	public NumberInt(int n){//constructor to set the value of number 
		this.number=n;
	}
	@Override 
	public Double getNumber(){//getter which returns the decimal value of number
		return number;
	}
	@Override 
	public Number Multiply(Number rad){//overrides the multiply in Number and multiplies number*number
		return new NumberInt(getNumber().intValue()*rad.getNumber().intValue());
	}

}
