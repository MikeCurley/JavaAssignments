import java.text.DecimalFormat;
import java.util.Scanner;
//class Octagon.java  Michael Curley assignment4 Question2
public class Octagon extends GeometricFigure2 implements ConsoleIO , Comparable<Octagon>  {
	private double length=0;
	private double Area=0;
	Scanner Sc = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("#.0000"); 
	//calculates area of actagon
	@Override
	public double calcArea(){//calculate area of octagon
		Area =((2*(1+Math.sqrt(2)))*Math.pow(length,2));
	return Area;
	}
	//ask the user for input length of octagon side
	@Override
	public void updateFromConsole(){//ask the user for side length of Ocatagon
		System.out.println("Calculate Octagonal Area");
		System.out.println("Enter Octagonal Side length in cm ");
		length=Sc.nextDouble();
	}
	//prints out the area and length of octagon
	@Override
	public void writeToConsole(){
		System.out.println("Octagonal Area");
		System.out.println("Octagonal Side length "+length+" cm");
		System.out.println("Octagonal Area result "+df.format(Area)+" cm\u00B2");
	}
	//a compare method to compare 2 Octagons 
	@Override
	public int compareTo(Octagon o){//compare octagon
		if(this.Area>o.Area){
			return 1;
		}else if(this.Area<o.Area){
			return -1;
		}
		return 0;
	}
	
}
