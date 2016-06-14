public class MyListTest {

    public static void main(String[] args){

	List array = new Array(10);

	for(int i=0; i < array.size(); i++){
	    array.add(new Integer(i),i);
	}

	display(array);
	array.remove(3);
	display(array);

	for(int i=0; i < array.size(); i++){
	    array.add(new Double(i),i);
	}

	display(array);
	
    } 

    public static void display(List array){

       for(int i=0; i < array.size(); i++){
            System.out.println(array.get(i));
       }

    }
} 
