
public class exercise2_Test {
    public static void main(final String[] args) {

        int [] B = new int[] {22, 1, 0, -8, -1, 3, 3, 1, 22, 3, 1}; 
         
    
        exercise2 a = new exercise2(B); //constrctutor method array
        
        
        exercise2 one = new exercise2(B); // create the object for part 1

         exercise2 two = new exercise2(B); // create the object for part 2
         
         exercise2 three = new exercise2(B); // create the object for part 3

         exercise2 four = new exercise2(B);
         
         one.suma(0);  // Part 1 sum the positive  number
         
         two.Posicion(0); // Part 2 position the elements of -1
         
         three.Operacion(0); // part 3 sum negative numbers multiply by 2
         
         four.Frequency(); // Finding frequency number of array
   
         
       
       }//end main 
           
       
   }//end program