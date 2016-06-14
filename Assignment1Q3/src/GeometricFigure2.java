//class GeometricFigure2.java  Michael Curley assignment4 Question2
//taken from class notes Lecture 7b Dr Matthias Nickles
abstract class GeometricFigure2<T> {
	public static final double PI = 3.141592653;//PI available to Circle class
	private boolean filled;
	public GeometricFigure2() {
		filled = false;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public void display() {
		System.out.println("This is some geometric figure.");
	}
	public abstract T calcArea();//Number is a super of double and int
}

