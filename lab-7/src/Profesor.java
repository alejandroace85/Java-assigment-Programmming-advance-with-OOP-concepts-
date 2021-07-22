import java.util.Scanner;

   public class Profesor {
		//instance field
	   int x = 0;
	   int y = 0;
	   int z = 0;
	   //creating input
	  Scanner sn = new Scanner(System.in);
		
	  //The sum method
		  public int suma(int x,int y, int z) {
			 
			  //sum operator return
			 return  (x + y + z);
		  }
		  //constructor method profesor
		  public  Profesor(int x,int y, int z) {
			  //this type varable using this keyword each one 
			 this.x = x;
			 this.y = y;
			 this.z = z;
		  }  
		  //print void method
		  public void print() {
			  //print result
			  System.out.println("imprime valores de x, y, z");
			  //input the x,y,z 
			   x = sn.nextInt();
			   y = sn.nextInt();
			   z = sn.nextInt();
			  System.out.println( "Valores de profesor: " + x +", " + y + ", "+ z );
	 }// end method
	  
}//end class
