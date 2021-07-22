
public class Rectangle extends Shape{
	
	private double width = 1.0;
	private double length = 1.0;
	
	public Rectangle(){
		
		width = 1.0;
		length = 1.0;
	}
	
	public Rectangle(double w, double l) {
		
		width = w;
		length  = l;
	}
	
   public Rectangle(double w, double l, String color, boolean filled) {
		
	super(color,filled); //extend shape
	
		width = w;
		length  = l;
	}
   
   public double getWidth() {
	   

	   return width;
   }
   
   public void setWidth(double wi) {
	   
	    width = wi;
   }
   
   public double getLength() {
	   

	   return length;
   }

    public void setLength(double le) {
            	
          length = le;
     }
    
    public double getArea() {
    	
    	double area = width * length;
    	
    	return area;
		
    }
    public double getPerimeter() {
    	
    	double perimeter = 2 * (length + width);
    	return perimeter;
    }
    
}

