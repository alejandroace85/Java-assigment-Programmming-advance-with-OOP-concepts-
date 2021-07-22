public class Test {

	public static void main(String[] args) {


		
		Circle x = new Circle();  //creating object circle
		
		x.setRadius(6.0);
		x.setColor("Red");
		System.out.println("Circle");
		System.out.println();
		System.out.printf("The area for the circle  is: %.2f\n", x.getArea());
		System.out.printf("The perimeter for the circle  is: %.2f\n", x.getPerimeter());
		System.out.println(x.toString()); // the color with true false
		
		System.out.println("-------------------------------------------------------------");
		
		Rectangle y  = new Rectangle();  //creating object rectangle
		
		y.setWidth(6.0);
		y.setLength(6.0);
		y.setColor("Blue");
		System.out.println("Rectangle");
	    System.out.println();
	    System.out.printf("The area for the Rectangle  is: %.2f\n", y.getArea());
	    System.out.printf("The perimeter for the Rectangle  is: %.2f\n", y.getPerimeter());
	    System.out.println(y.toString());
		System.out.println("-------------------------------------------------------------");
		
	    Square z  = new Square(6.0);     //creating object square with create object side
	    
	    
	    z.setColor("Purple");
	    System.out.println("Square");
	    System.out.println();
	    System.out.printf("The area for the Square  is: %.2f\n", z.getArea());
	    System.out.printf("The perimeter for the Square  is: %.2f\n", z.getPerimeter());
	    System.out.println(z.toString());
		System.out.println("-------------------------------------------------------------");
	}
}

