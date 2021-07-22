
public class trianguloTest {

	public static void main(String[] args) {
		
	
		
		//Objects4
		triangulo uno = new triangulo(); //default the constructor
		
		triangulo dos = new triangulo(0, 0); //The value are entered with keyboard
		
        double constr = uno.area(0); //Result object the default
		
		System.out.println("El area de triangulo de primer constructor es: " + constr); //Print default

		double keyboard = dos.area(0); //Result object of Input
		
		System.out.print("El area de triangulo de segundo constructor es: " + keyboard); //Print the input for area triangle
		
		
		
	}

}
