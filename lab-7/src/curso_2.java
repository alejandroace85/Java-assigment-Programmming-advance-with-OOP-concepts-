import java.util.Scanner; //input

//extends curso1 using inheritance 
public class curso_2 extends curso_1 {
	
	//creating input 
	Scanner sn = new Scanner(System.in);
	//instance field
	int codigo = 0;


	//constructor method based the name of file 
	public curso_2(int x, int y, int z, String name, int codigo) {
		//superclass
		super(x, y, z, name);
		//this keyword
		this.codigo = codigo;
	}
      //method grade using overriding again
	public double nota (int x ,int y, int z) {
		
		//math problem using sum with multiplication with return
		 
		 return (0.5*x) + (0.2*y) + (0.3*z);
	}
	
	//Decimal grade another overriding
	public double notaDecimal (int r) {
		
		//assign the argument  
		nota = r;
		
		//math operator with return  
	
 	return nota(x,y,z) + 0.5; 
		
	}

	//method void print 
	public void print() {
		
		System.out.println("Imprime valor de x, y, z, el nombre de curso 2 y el codigo de curso 2.");
		//ineract variable input
		   x = sn.nextInt();
		   y = sn.nextInt();
		   z = sn.nextInt(); 
		   name = sn.next();
		  codigo = sn.nextInt();
		 
		   //print result incluidng decimal note and code
         System.out.println( "Los valores de curso 2: " + x +", " + y + ", "+ z );

 	     System.out.printf("nota decimal: %.2f\n" , notaDecimal((int) nota));
 	 
	     System.out.println("nota: " + nota(x, y, z));
 	 
	     System.out.println("El nombre de curso 2: " + name);
	  
	     System.out.println("El codigo de curso: " + codigo);
		   
		
	}//end method
}//end class