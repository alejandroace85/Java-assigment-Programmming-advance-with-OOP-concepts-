
public class Circle extends Shape{

	private double radius = 1.0;
	
	public Circle() {
		
		radius = 1.0;
	}
		public Circle(double ra) {
			
			radius = ra;
		}
		
		public Circle(double ra, String color, boolean filled) {
			
			super(color,filled); //super to apply extend shape
			
			radius = ra;
		}
		
		public double getRadius() {
			
			return radius;
		}
		
		public void setRadius(double r) {
			
			radius = r;
		}
		public double getArea() {
			
			
			double area = Math.pow(radius, 2)* 3.14;
			
			return area; 
		}
		public double getPerimeter() {
			
			double perimeter = 2 * 3.14 * radius;
			
            return perimeter;
		}
	}
	
