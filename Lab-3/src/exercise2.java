public class exercise2 {
 
  int sum = 0;
  int index = -1;
  int operation;
  //creating new array for constructor 
   int A[];
 //Array fr will store frequencies of element  
 
  int[] fr  = new int [11]; //position the elements
   int j; //declaring variable for nested loop
   int number = -1; // using negative 1 to count frequency number to avoid the buffer
   
   
  //construction method
  public exercise2(int[] B){
      A = B ;
   
  }

  //Method find positive number
  public int suma(int positive) {
    
      sum = positive;

      for(int i =0; i<A.length; i++) {

       if(A[i] > -1) {
         sum = sum + A[i];
       }
      }
      
      System.out.println("The sum for positive number is total " + sum);
      
      return sum;
      
    }// Method the sum positive number finished

     
    //Find position number -1 and location using elements.
      public int Posicion(int num) {
  
       num = index;
    
        for(int i = 0; i < A.length; i++) {
          
                  if (A[i] == -1) {
                      
                      index = i;
                  }
        }
        System.out.println("The position of the element " + num + " is in position " + index);
        
        return num;
        
      } //Method the position number Finished

      //Finding frecuency number using nested loop and void to avoid hardcoding
       public int Operacion(int M) {

           M = operation;
           
           for(int i =0; i < A.length; i++) {
               if(A[i] < 1) {
                    M += (A[i]) * 2;
              }
           }
           
           System.out.println("The operation number is " + M);
           
         return M;
       } 
                 //Frequency number
               public void Frequency() {
                 
                           for(int i=0; i<A.length; i++) {
                             
                             int count = 1; //Creating count to obtain frequency
                             for (j= i+1; j<A.length; j++) 
                               
                               if(A[i] == A[j]) {
                                 
                                 count++;
                                 
                                 //To avoid same array
                                 fr[j] = number;
                                 
                               }
                            //using if outide de loop j to finding frequency number
                              if(fr[i] != number)
                               
                                  fr[i] = count;
                                
                             
                             }
                              
                           //Print the frequency number with repeated
                             for(int i =0; i<fr.length; i++) {
                               
                               if(fr[i] != number) {
                                 
                                 System.out.println( A[i] + " is repeated " + fr[i] + " times ");
                                
                               
                                   
                           }
                  
                
                       }//end for loop
               }//end method	
 }// end class        