
public class exercise1 {

     //instance fields
    int[] A = {2, -3, 4, -10, 1, -1, 2, -3}; //initialize array for 3 classes using method.
    
    int sum = 0;
    int index = -1;
    int operation;
    
    //method of sum positive number
    public int suma(int positive) {
      
      sum = positive;

      for(int i =0; i<A.length; i++) {

       if(A[i] > -1) {
         sum = sum + A[i];
       }
      }
      
      System.out.println("The sum for positive number is " + sum);
      
      return sum;
      
    }// Method the sum positive number finished

    
    
    
    //Find position number -1 and location using elements.
      public int Posicion(int num) {
  
       num = index;
	
        for(int i = 0; i< A.length; i++) {
          
                  if (A[i] == -1) {
                      
                      index = i;
                  }
        }
        System.out.println("The position of the element " + num + " is in position " + index);
        
        return num;
        
      } //Method the position number Finished

      
       public int Operacion(int M) {

    	   M = operation;
    	   
    	   for(int i =0; i < A.length; i++) {
    		   if(A[i] < 1) {
    		        M += (A[i]) * 2;
    		  }
    	   }
    	   
    	   System.out.println("The operation number is " + M);
    	   
         return M;
       }// end method of operator

}//end class
