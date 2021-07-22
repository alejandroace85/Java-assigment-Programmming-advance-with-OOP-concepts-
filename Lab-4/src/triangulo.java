import java.util.Scanner;

public class triangulo {
	//Scanner for find base y altura
	Scanner input = new Scanner(System.in);
	
    //instance fields
	double base = 0;
	double altura = 0;
	
	//constructor area triangle default
	public triangulo() {
		
		this.base = base;  
		this.altura = altura; 
		
	}
	
//method area triangle using keybrard
public triangulo(int b, int h) {
		
		base = b;
		altura = h;
		
        System.out.print("Entra la base de triangulo ");
        base = input.nextInt();
        
        System.out.print("Entra la altura de triangulo ");
        altura = input.nextInt();      
	 
	}

//calculating area the triangle
      public double area (double a) {
    	  
    	   a = base*altura/2;
    	  return a;
      }//end method calculation
}//end class
