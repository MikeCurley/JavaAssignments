/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/

import java.util.Scanner; // util contains scanner package

/**
 *
 * @author Michael Curley Assignment 4 NUIG PROGRAMMING 1 Mr Seamus Hill
 */
public class Assignment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {// main program
        
       Scanner input = new Scanner(System.in);//object of scanner class
       int temperature;//variable to hold input temperature
       int check=0;// variable to hold check for while execution and for option
       double farn,cel; //double variables to store result from the method returns
       
       
       while (check!=3){
           
           System.out.println("1. Fahrenheit to Celcius ");
           System.out.println("2. Celcius To Fahrenheit ");
           System.out.println("3. Exit ");
           System.out.print("Choice ");
           check=input.nextInt();//store user choice
           if(check<1 || check>3){
        	   System.out.println("Not a Valid Choice Re Enter Choice");
           }
           if(check==1){// if option 1 fahrenheit to celcius
               System.out.println("Enter Temperature");
               temperature=input.nextInt();
               cel=celcius(temperature);// assign returned answer in cel
               //performed a cast on cel double to int so no decimal places printed
               System.out.println(+temperature+" Fahrenheit is "+(int)cel+" Celsius");
           }else if(check==2){// if option 2 celcius to fahreheit 
               System.out.println("Enter Temperature");
               temperature=input.nextInt();
               farn=fahrenheit(temperature);
               //performed a cast on farn double to int so no decimal places printed
               System.out.println(+temperature+" Celcius is "+(int)farn+" Fahrenheit");
           }else if(check==3){// if option 3 end program 
               System.out.println("Program Terminated");
               System.out.close();   
           }
           
        
       }
    }
    //static method Celcius takes a parameter double and returns a double to the method call
    public static double celcius( double  fahrenheit){
     double celsius = 5.0/9.0 * (fahrenheit - 32);// calculation assigned to double as fractions in result
    return celsius; // returns a double to the method call
    }
    
   //static method fahrenheit takes a parameter double and returns a double to the method call
    public static double fahrenheit(double celsius ){
      double  fahrenheit = 9.0/5.0 * celsius + 32;
    return fahrenheit;// returns a double to the method call
    }
    
}
