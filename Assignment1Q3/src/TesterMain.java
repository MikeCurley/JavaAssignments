//package for formating number
//class TesterMain.java  Michael Curley assignment4 Question3
public class TesterMain {

	public static void main(String[] args) { 
		System.out.println("Assume Vales are in CM");
		//create a object of circle and pass a numberDouble reference to it this can be used 
		//to invoke the required methods in NumberDouble
		Circle<NumberDouble> c = new Circle<NumberDouble>(new NumberDouble(5.9));
		//invoke the method display which displays the radius value and area value of the c object
		c.display();
		//create a object of circle and pass a numberInt reference to it this can be used 
		//to invoke the required methods in NumberInt
		Circle<NumberInt> c1=new Circle<NumberInt>(new NumberInt(5));//wont take a double value compile error
		//invoke the method display which displays the radius value and area value of the c1 object
		c1.display();
	}

}
