/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.DecimalFormat;//package for decimal format 
import java.util.Scanner;// package for scanner class

/**
 *
 *Michael Curley NUIG PROGRAMMING 1 Mr Seamus Hill
 */




public class Assignment4CP {// class name

    /**
     * @param args the command line arguments
     */
	static double totalTime=0; //class variables of the class to store sum of time
	static double totalCharge=0;//class variables of the class to store sum of charge 
	
	
    public static void main(String[] args) {//main method
        Scanner input = new Scanner(System.in);// object of scanner class
        double time=0;// time variable
        while(time!=-1){// loop while time is not -1
         System.out.print("Enter number of hours (-1 to quit): ");
         time=input.nextDouble();//assign input to the variable time 
         //conditional check if greater that zero invoke the method if not close program
         if(time>0){
             calculateCharges(time);
         }else{
             System.out.close();   
         }
       }
    }
    
    public static void calculateCharges(double time){//static method to calculate charges
    	DecimalFormat df = new DecimalFormat("0.00"); // format the results 2 decimal places
        double charge=0;
        totalTime=totalTime+time;// keeping summing the time 
        
        	if(totalTime>=24){
        		charge=25;// charge is set to 25€
        		totalTime=0;// once total time hits 24 it is set to zero
        	}else if (totalTime>3){// if time is greater than 3 
        		double x=time-3;//time -3 assigned to x
        		charge=(x*1.50);// x multipled by 1.50 and assigned to charge
        		charge=charge+5;//5 is then added to this value
        	}else if(totalTime<=3){// if time less than equal 3 charge is €5
        		charge=5;
        	}
        totalCharge=totalCharge+charge;//sum of total charge
        //print out results
        System.out.println("charge is €"+df.format(charge)+" total charge is €"+df.format(totalCharge));
    }
    
}
