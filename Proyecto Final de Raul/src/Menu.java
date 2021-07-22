
//input the Scanner
import java.util.Scanner;


//Abstract class
public abstract class Menu {
	
	 //the array interface protected instance field
	
	//protected method selected menu interface including array 
    protected Selected[] selected;
    
    //create scanner input
	 Scanner sc = new Scanner(System.in);
	
	 //mensaje is method static void
      public static void mensaje() {
		
		System.out.println("Este es mi proyecto final\n");
		
	}
	                 //abstract menu with integer
               public abstract int menu(); 
               
               
               //void method using choice in for Menu driver and both Libary declaring with do selected
		  public void doSelected(int choice, Libary libary){
		    	
			  // selected menu include idex the choice and classes the inplements with parentesis libary class
		        selected[choice].classes(libary);
		
	}
}

