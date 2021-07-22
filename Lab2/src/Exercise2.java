
public class Exercise2 {
    public static void main(String[] args) {
      
      //declaring variable arrays.
      int [] ArraysA = {2,4,7,8,3};
      int [] ArraysB = {11,3,2,12,13};
      int [] ArraysC = new int [5]; 
      //im using nested loops for 2 arrays
      System.out.print("The result for array C[] = ");
      for (int i = 0; i < ArraysA.length; i++) {

        for (int j = 0; j < ArraysB.length; j++) {

            //Using if statement for the result.
            if (ArraysA [i] == ArraysB [j]) {
                ArraysC[i] = ArraysA[i];
                //Print the values in a new array “C” 
                System.out.print(ArraysC[i] + ", ");
            }//end if
        }// end loop j colms
      }// end loop i rows
  } // end class
} //end program


