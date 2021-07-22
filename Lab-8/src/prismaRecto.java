
public class prismaRecto extends Forma implements Recurso {

	//instance field
	private  double a = 0;
	private  double b = 0;
	private  double c = 0;

	public prismaRecto(double a,double b,double c) {

		this.a=a;
		this.b=b;
		this.c=c;
	}

	public int Perimetro() {

		double perimetro = (2*a) + (2*b);
		return (int) perimetro;
	}
	public double area() {

		double area = 2*(a*b) + 2*(a*c) + 2*(b*c);
		return area;
	}
	public double volumen() {

		double volumen = a*b*c;
		return volumen;
	}
	public double getA() {
		return a;
	}

	public  void setA(double A) {

		a =A;
	}
}
