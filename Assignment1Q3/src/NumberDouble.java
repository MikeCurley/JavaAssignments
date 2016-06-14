//class NumberDouble.java  Michael Curley assignment4 Question3
//Dr Matthias Nickles

public class NumberDouble  extends Number{
	private double number; //private datafield to store the value of number

	public NumberDouble(double n){//constructor to set the value of number 
		this.number=n;
	}
	@Override 
	public Double getNumber(){//getter which returns the value of number
		return number;
	}
	@Override 
	public Number Multiply(Number rad){//overrides the multiply in Number and multiplies number*number
		return new NumberDouble(getNumber()*rad.getNumber());
	}
}
