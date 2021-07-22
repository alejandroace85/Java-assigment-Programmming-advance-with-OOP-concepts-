
public class arregloTest {
	
	public static void main(String[] args) {
	int  A[] =  {-6, 8, -5, 6, 2};
	
	System.out.println("El primer constructor de arreglo");
	
	//Primer constructor the array
	arreglo x = new arreglo();

	 x.maximum();
	 x.sum();
	 x.average();
	 arreglo.positivo();
	 System.out.println();
	 
	System.out.println("The segundo constructor de arreglo");

	 //Secound constructor the array
	 arreglo y = new arreglo(A);
	 y.maximum();
	 y.sum();
	 y.average();

	 arreglo.positivo();
	}
}
