public class Square extends Rectangle{
	
	public Square() {
		
		System.out.println("Esta vacio");
	}
	
	public Square(double side) {
		
		setWidth(side);
		setLength(side);
	      
	}
	
	public Square(double side, String color, boolean filled) {
		
		setColor(color);
		setFilled(filled);
		setWidth(side);
		setLength(side);
		

	}
	
	public double getSide() {
		
		return getLength(); //tambien puede poner getWidth y sale lo mismo resultado por que hereda el rectangulo
	}
	
	public void setSide(double s) {
	    setWidth(side);
	}
	
public double getArea() {
	
	double area =  getSide() * getSide();
	
	return area;
}

	public double perimetro() {
		
		double perimetro = 4 * getSide();
		
		return perimetro;
	}

}
