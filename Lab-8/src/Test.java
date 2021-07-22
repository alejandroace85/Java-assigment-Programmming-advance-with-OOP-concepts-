

public class Test {

	public static void main(String[] args) {

		//creating the first object
		cilindro x = new cilindro(3,4); //input 2 number in instance

		System.out.println("El perimetro para cilindro es " + x.Perimetro());
		System.out.println("El area para cilindro es " + x.area());
		System.out.println("El volumen para cilindro es " + x.volumen());
		x.mensaje();
		System.out.println();
		System.out.println("======================================================================================");
		System.out.println();

		//creating the second object
		prismaRecto y = new prismaRecto(9, 5, 4); //input 3 number in instance


		System.out.println("El perimetro para prisma rectangular es " + y.Perimetro());
		System.out.println("El area para el prisma rectangular lado A es " + y.area());
		System.out.println("El volumen para el prisma rectangular de 3 lados es " + y.volumen());
		y.mensaje();
	}

}
