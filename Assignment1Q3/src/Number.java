//class Number.java  Michael Curley assignment4 Question3
//Dr Matthias Nickles
public abstract class Number {
	
	abstract Double getNumber();//overriden method in NumberDouble and NumberInt returns radius as double 
	
	abstract Number Multiply(Number rad);//overriden method in NumberDouble and NumberInt returns radius as double 
	
	public static  Number sendPi(double r){//gets PI from circle 
		return new NumberDouble(r);//creates NumberDouble object with PI value
	}
	//would be used if PI were an int overloaded method
	/*public static Number numberCreate(int r){//gets PI from circle and creates NumberInt object with PI value
		return  new NumberInt(r);
	}*/

}
