package app;

import java.util.Scanner; //This import use to write input

public class exercise {
    public static void main(String[] args) {


        //*********************************************** 
        //  Name: Raul A. Torres Cobian                 *
        //  Student number: Y00566589                   *
        //  Date: November 6, 2020                      *
        //  course: COEN 2220 Advance Programming       *                                             
        //***********************************************




      
        //************************************************ 
        // Exercise number 1:                            *
        // choosing 5 integer number and display greater *
        // than 10                                       *
        //************************************************
      
       // declaring variable  
       int highNumber = 10;
       int n = 5;  
       
       Scanner s = new Scanner(System.in);

       //print instruction
       System.out.println("Exercise 1: Enter 5 integer numbers");

       //create the array
       int a[]  = new int[n];

        


       // looping 5 number with scanner (input)
      for(int i = 0; i < n; i++) {

         //writing input the number you choose will loop 5 times
         a[i] = s.nextInt();
   
         
   
      } // end for loop method
      
      //print result
      System.out.println("Number greater than 10");
      
      // I use separate loop for result 5 number
         for(int j = 0; j < a.length; j++) {
            if(a[j] > highNumber) {

               System.out.println(a[j]);
            }

            else if (a[j] <= 0) {

               System.out.println("No hay numero");
               break;
            }

            else if (a[j] < highNumber) {
               
            //this wont print number less than 10.
               System.out.println();
            }

         } //End exercise number 1

        //*********************************************** 
        // Exercise number 2:                           *
        // finding the two smallest number in array     *
        //***********************************************
      

      //Exercise number 2: finding the two smallest number in array.

      //initialize array and choosing random number. 
       int number[] = {4,43,2,-21,5,9,16,21,34,50};
       int firstSmall = number[0];
       int secondSmall = number[0];

       int firstIndex = 0;
       int secondIndex = 0;
       //im using nested loop method to obtain the smallest number.
        
          //first smallest number with index
          for (int i = 0; i < number.length;  i++) {
               if (number[i] < firstSmall ){ 
               firstSmall = number[i];
               firstIndex = i;
               }
              
            }
            //print the first smallest number with first index 
            System.out.println();
            System.out.println("Exercise 2 finding two smallest number");
            System.out.println();
            System.out.println("The first smallest number is " + firstSmall + " and the first position of index is " + firstIndex);
            System.out.println();
            
                  //Second smallest number with second index (si)
               for ( int si = 0; si < number.length; si++) {

                  //control flow with and (&&) method for the second index
                     if(number[si] > firstSmall && secondSmall > number[si]) {
                        secondSmall = number[si];
                        secondIndex = si;
                     }
                  } 
               //print the second smallest number with second index
               System.out.println("The second smallest number is " + secondSmall + " and the second position of index is " + secondIndex);
               System.out.println();
            
         //End exercise number 2.

        //***************************************************** 
        // Exercise number 3: list 6 final grade student      *                                                   
        //*****************************************************                                                     
       
      

        // following array of 6 student final grade
        int [] A =  {95,70,65,45,85,100};
        //declaring variable 
        int m; //
        System.out.println("Exercise 3: list 6 final grade student");
        System.out.println();

         //using for loop method for grade each student 
         for(int i = 0; i < A.length; i++) {

            m= A[i]; //creating array inside the for loop
               
            if(m >= 90){
               
               System.out.println("The student number " + i + " has A");
               
            }
            
            else if(m >= 80 &&  m <= 89){
               System.out.println("The student number " + i + " has B");
               
            }
   
            else if(m >= 70 &&  m <= 79){
               System.out.println("The student number " + i + " has C");
               
            }
   
            else if(m >= 60 && m <= 69){
               System.out.println("The student number " + i + " has D");
               
            }
   
            else if(m >= 0 && m <= 59){
               System.out.println("The student number " + i + " has F");
            
            }

         } // end for exrcise number 3
         
       
    }// end class
}//end the Lab-1 Structure Program 