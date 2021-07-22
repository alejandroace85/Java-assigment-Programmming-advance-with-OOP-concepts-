
public class arreglo {
      
	//instance fields
    static int A[];
	int maximum;
	float average;
    static int sum;
	
	
	// initialize the array in this method 
	public arreglo() {
		
		int []B =  {-3, 5, 8, 4, 9};
		A = new int [5]; //this will create new array to avoid overloading
	  
			 //for loop for different array
		  for (int i = 0; i< B.length; i++) {
			  
			   A[i] = B[i];
		  }
		  
		  //for loop the sum for different array
			for (int j = 0; j< A.length; j++) {
			  
			  sum = sum + A[j];
		  }
			  
	  }
	
	//The second constructor the array
	public arreglo (int a[]) {
		
		A = a;
		
	   }
	
	//Method about finding the max value the array
	public void maximum() {
		
		for (int i =0; i< A.length; i++) {
			
			if(A[i] > maximum) {
				
				maximum = A[i];
			}	
		}

		System.out.println("El numero maximo de un arreglo es: " + maximum);
	}
	
	public void sum() {
		
		sum =0;
		for (int i =0; i< A.length; i++) {
       	 
       
			sum = sum + A[i];
			
		
		}
		System.out.println("total de sumar todo los elementos es: " + sum);
	}
	
	//Calculating the average the array divide by 5
	public void average() {
		 for (int i = 0; i < A.length; i++) {
		
			 average = (float)sum/5;
		
		
		 }
		 System.out.println("El promedio de un arreglo es: " +average);
	}
	
	
	static void positivo() {
		//declaring variable positive number
	            int pos =0;
	            //using for loop for finding continuos positive number
		         for (int i = 0; i < A.length; i++) {
		        	 
		        	 if(A[i] > 0) {
		        		 
		        		 //calculating for positive number in static
		        		 pos = pos + 1;
		        	 }
		        	 
		        	 
		         }
		         
		         System.out.println("El numero positivo de arreglo hay " + pos + " elementos");
	}//end static
	
	}//end class
	

