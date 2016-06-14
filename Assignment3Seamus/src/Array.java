public class Array implements List {

    // Declare an array of Objects
    private Object[] myArray;

    // Constructor - creates an array of Objects of a specified size
    public Array(int length){
	myArray = new Object[length];
    }

    //Inserts the specified object at the specified position in this array. 
    public void add(Object o, int index){
	myArray[index] = o;
    }

    //Returns the specified object at the specified position in this array. 
    public Object get(int index){
	return myArray[index];
    }

    //Removes the specified object at the specified position in this array. 
    public void remove(int index){
	myArray[index] = null;
    }

    //Returns the size of this array. 
    public int size(){
	return myArray.length;
    }

}
