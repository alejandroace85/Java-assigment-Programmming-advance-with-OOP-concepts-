
public class circulo2 extends circulo{ //extend the inhyeritance
	
	// instnace field for m
	private int m;
	
	 static int addOb = 0;
	
	public circulo2(int a, int m) {
		
		super(a); // I use super to avoid the constructor error
		this.m = m; //this method for m
	}
	
	public double Long() {
		
		double Log = area() + m; //Log = area()+ m
		return Log;
	}

}
