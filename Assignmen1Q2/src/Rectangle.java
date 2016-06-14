
//class Rectangle to test if class Octagon will take it to compare
//class TesterMain.java  Michael Curley assignment4 Question2
public class Rectangle {
	private double length=10;//private datafields
	private double Area=0;
	private double breath=10;
	
	public double calcArea(){//calculate area of octagon
		Area =length * breath;
	return Area;
	}
	public void displayArea(){
		System.out.println("AREA OF RECTANGLE "+Area);
	}
}
