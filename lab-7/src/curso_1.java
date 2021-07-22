import java.util.Scanner; // input

//exend using inheritance
public class curso_1 extends Profesor {
	
	//instance field with create scanner input
	String name;
    double nota = 0.0;
	Scanner sn = new Scanner(System.in);
	
	//method constructor course 1
	public curso_1(int x, int y, int z, String name) {
		//Super class
		super(x, y, z);
		//using this keyword to adopted the instance field
		this.name = name;
	}
     
	//method double grade with return
	public double nota(int x , int y , int z) {
		
		
		return suma (x,y,z) / 3;
	}
	//method decimal grade
     public double notaDecimal(int r) {
    	 
    	 //asig equal the arguments
          nota = r; 
          
    	 //math process
    	return nota(x,y,z)/100;
     }
     
	//method void print
	public void print() {
		
		//print result
		 System.out.println("imprime valor de x, y, z y escribe nombre de curso 1.");
		 
		 //input the x,y,z and name of string
		   x = sn.nextInt();
		   y = sn.nextInt();
		   z = sn.nextInt(); 
		   name = sn.next();
		   
		   //print result
		  System.out.println( "Los valores de curso 1: "+ x +", " + y + ", "+ z );
		  
		  System.out.print("nota: ");
		  
    	 System.out.printf( "%.2f\n",nota(x, y, z));
     	 
     	 System.out.println("El nombre de curso 1: " + name);
     	 
     	
		System.out.printf ("nota decimal: %.2f\n", notaDecimal((int) nota));
    
	}//end method

}//end class