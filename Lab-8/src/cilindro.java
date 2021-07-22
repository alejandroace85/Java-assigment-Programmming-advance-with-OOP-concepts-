public class cilindro extends Forma implements Recurso {

	//intance field
	private double r =0;

	private double h = 0;

	private static final double PI =3.14; //adding pi value using static final

	//calculating perimeter int with abstract ineract
	public int Perimetro() {

		int perimeter = (int) (2*(PI)*r);
		return perimeter;
	}
	//void gettting radio
	public double getRadio() {
		return r;	
	}
	public double area() {

		double area = 2*(PI)*r*(h+r);
		return area;
	}
	//calculating volumen
	public double volumen() {

		double volumen = (PI) * (r*r)*h;
		return volumen;
	}
	//double setting radio
	public void setRadio(double ra) {
		r = ra;
	}

	//method constructor cilindro
	public  cilindro(double r, double h) {
		this.r=r;
		this.h=h;

	}


}




