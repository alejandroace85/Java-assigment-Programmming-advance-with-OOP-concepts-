import java.util.Vector; //import for vector

public class Exercise1 {
	 
	     //instance fields
       int findNumber = 0; // This method will use to find number 5 with position index
       int oddNumber = 0; // This mwthod use for Odd number
       boolean number = false; //flag for number 5
       Vector<Integer> vec = new Vector<Integer>(); // declaring vector


// Add one void method for two method to avoid hardcoding.
 public void vecMethod() {
  //add elements of vector 
   vec.add(1);  
   vec.add(7);
   vec.add(4);
   vec.add(2);
   vec.add(43);
   vec.add(1);
   vec.add(20);
   vec.add(5);
   //Note: You can change the number you want but the result will be the same.
  }

//This is the first method

// void method to locate the number
public void numberFive(){

vecMethod(); //enter method call for ineract elements of vector

// for loop using range base for loop like using in C++ 11 to avoid the arguments
for (int i =0; i < vec.size(); i++) {
  //find number 5
	if (i == 5) {
	
	  number = true; //flag for result number 5 if not not working
	  findNumber = i;
	  System.out.println("The number " + findNumber + " was found in position " + vec.indexOf(5));
    System.out.println();
	 }
	
}
   //not finding number using flag
  if (number == false) {
  System.out.println( "The number 5 is not appearing");
  
}
  
}

//Second method find odd number using public int to count each number in vector.
public int counterOdd() {
vecMethod(); //enter method call for ineract elements of vector

System.out.print("This will print the Odd number of vectors: ");


// for loop using based range for loop like using in C++ 11 to avoid buffer the Odd number.
for (int i : vec) {
  
  //codition if statement operator odd number
  if (i % 2  != 0) {
   
    
     System.out.print (i + " ");
  }
}
return oddNumber;
} //end odd
 // end program


        //************************************************ 
        // Exercise number 1:                            *
        // Main method the last for reason of scope      *
        //                                               *
        //************************************************

public static void main(String[] args) {
		    
   Exercise1 one = new Exercise1(); //Creating to display number 5 
   Exercise1 two = new Exercise1(); //Creating to display Odd number
   
   
      one.numberFive(); // number 5 in one method
      two.counterOdd(); // displaying odd number for each vector.
      
    
  }//end class
}// end main
