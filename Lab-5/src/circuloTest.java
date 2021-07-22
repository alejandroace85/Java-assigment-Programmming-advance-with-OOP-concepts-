public class circuloTest {
	
	public static void main(String[] args) {

  //choosing variable a to c to calculate area of circle
	int a =0;
	int b =4;
	int c =8;
	
	
	//Create object
	circulo3 result = new circulo3(a,b,c);
	circulo3 f = new circulo3(a,b,c);    //You can create object for adding the result about how many object
	
	
	result.setRadius(4); // you can selected set number of radius 

	
	//Print the program for result
	  System.out.printf("The area of the circle 1 is: %.3f\n", result.area());
	  System.out.printf("The 'long' for the circle 2 is: %.3f\n", result.Long());
	  System.out.printf("The play from circle 3 result in: %.3f\n", result.play());
	  System.out.printf("The objets are %d\n", circulo3.addOb);

	}//end main   
}//end class
