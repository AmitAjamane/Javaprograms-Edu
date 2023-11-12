package com.edu;
import java.util.Scanner;

class ElevatorEcp extends Exception{
	public ElevatorEcp(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
	
}
class Elevator {

    Scanner sc = new Scanner (System.in);
    public int  floor1=1,floor2=1;
    
 // selecting the floor,fire alarm,& quit 
    public void getData() {
    	
    	System.out.println("\n(s):select a flooar \n(f):fire Alarm \n(q):quit");
        System.out.print("Enter s , f, q ==>");
        String select=sc.next();
        select=select.toLowerCase();


        if( select.equals("s")|| select.equals("f") || select.equals("q")) {

            if ( select.equals("f")) {
                fireAlarm();
            }
            else if ( select.equals("s")) {
                selectFloor();
            }
            else {
                quit();
            }
        }
        else {
            System.out.println("!!!!  Invalid Selection !!!!\n");
            getData();
        }
    }
    
    // quit Method 
     public int quit() {
        System.out.println("!!! Thank you !!!");
        return 0  ;
    }
     // Fire Alarm Method
    public void fireAlarm () {
        System.out.println("Danger...! You must exit the building now !");
        System.out.print("you are going down..");
        for ( int i=floor2;i>=1;i--) {
        	System.out.print(i +"..");
        }
        System.out.println("Ding !");
        getData();
    }
    
    // select floor Method
    public void selectFloor() {
        int i;
        System.out.print("Enter the floor that you'd like to go ==>");

        floor1 = sc.nextInt(); 
     // for going up floor
        try {
        	if (floor1>11 || floor1<0)  {
        		throw new ElevatorEcp("--> Invalid floor Enter the valid floor number ");
        		}
        
        	else {
        		
        		if (floor1 >= 1 && floor1 <= 10) {
                    if (floor1>floor2) {
                        System.out.print("Going up...");
                        for (i =floor2; i <= floor1; i++) {
                            System.out.print(i + "..");
                        }
                        floor2=floor1;
                        System.out.println("Ding !");
                        getData();
                    }
                 // for going down floor
                    else if (floor2 > floor1) { 
                        System.out.print("Going Down...") ;
                            for (i = floor2; i >= floor1; i--) {
                                System.out.print(i + "..");
                            }
                            floor2=floor1;
                        System.out.println("Ding !");
                    getData();
                    }
        		}
        	}
        }catch ( ElevatorEcp e) {
        	e.printStackTrace();
        	getData();
        }
        
    }  
    
}
public class ElevatorDrive {
    public static void main(String[] args) {
        Elevator Eob=new Elevator();
        Eob.getData();
    }
}








