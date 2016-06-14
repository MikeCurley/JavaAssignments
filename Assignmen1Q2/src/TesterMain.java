//package for formating number
//class TesterMain.java  Michael Curley assignment4 Question2
public class TesterMain {

	public static void main (String args[]){
		// create o object of octagon
		System.out.println("Creating the O object of type Octagon");
		Octagon o= new Octagon();//create Octagon object
		o.updateFromConsole();//invoke the method updateFromConsole() using the object o
		o.calcArea();//invoke the method calcArea() using the object o
		o.writeToConsole();	//invoke the method writeToConsole() using the object o
		// create o1 object of octagon
		System.out.println("\n\n\nCreating the O1 object of type Octagon");
		Octagon o1= new Octagon();//create second Octagon object
		o1.updateFromConsole();//invoke the method updateFromConsole() using the object o1
		o1.calcArea();//invoke the method calcArea() using the object o1
		o1.writeToConsole();//invoke the method writeToConsole() using the object o1
		
		//compare the 2 objects on area o is the calling object and is passing the o1 object to compare
		int x=o.compareTo(o1);
		//if x=1 then o is bigger than o1 
		//if x-1 then o1 is bigger than o
		//otherwise they are the same
			if(x==1){
				System.out.println("octagon object o Area is bigger than object o1  Area");
			}else if(x==-1){
				System.out.println("octagon object o1 Area is bigger than object o Area");
			}else{
				
				System.out.println("Areas of both Octagons are the same");
			}
			
		//The following codes trys to compare other objects and the Octagon class wont accept then as not Octagon objects	
		//GeometricFigure2 gm2=new Octagon();
		//o.compareTo(gm2);
			
			Rectangle r = new Rectangle();//create object of type octagon 
			r.calcArea();//calculate area
			r.displayArea(); //display area of rectangle
			//int y=o1.compareTo(r); //cannot pass a rectangle type as compareTo method in octagon is  generic type Octagon 
	}

}
