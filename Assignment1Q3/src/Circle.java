import java.text.DecimalFormat;

//class Circle.java  Michael Curley assignment4 Question3
//Dr Matthias Nickles
class Circle<T extends Number> extends GeometricFigure2 {//extending Number and GeometricFigure2 
	private T radius; // private storage placeholder
	DecimalFormat df = new DecimalFormat("#.00");


	public Circle(T radius) {//constructor which takes an arguement of an object of numberDouble and NumberInt and stored in parameter T
		this.radius = radius;
	}
	@Override
	public T calcArea() 
	{	//the object invokes multiply in Number but this is abstract so overriden by multiple in the subclasses depends on object type NumberDouble or NumberInt 
		return (T)radius.Multiply(radius.Multiply(Number.sendPi(PI)));//PI is inheritated from GeometricFigure2
		//return 5.9 by PI by 5.9
	}
	public T getRadius() 
	{//returns the object address that is stored a radius T of type T
		return radius;
	}
	 // overrides method display() in superclass and prints the radius value and area of circle
	//  the 2 values are invoked by getting the object and then calling the method gerNumber to print the numerical value
	@Override
	public void display() {
		System.out.println("This is a circle with radius " +df.format(getRadius().getNumber())+" cm");
		System.out.println("Area of Circle " +df.format(this.calcArea().getNumber())+" cm\u00B2");
	}

}

