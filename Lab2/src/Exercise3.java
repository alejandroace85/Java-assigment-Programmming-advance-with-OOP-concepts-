import java.util.Scanner; //import the input

public class Exercise3 {
 
	public static void main(String[] args) {
	
		int size1; // For array A
		int size2; // For array B
		
		 Scanner input = new Scanner(System.in);

			//input the elements
			System.out.print("Enter the number of elements in A: ");
			 size1 = input.nextInt();
			System.out.print("Enter the number of elements in B: ");
			 size2 = input.nextInt();

			 //Creating 2 arrays 
			 int a[] = new int[size1];
			 int b[] = new int[size2];
			 
			 //For loop for array A
			System.out.print("Enter all elements in A: ");
			for (int i = 0; i < size1; i++)
			{

				 a[i] = input.nextInt();
			}
             //For loop for array B
			System.out.print("Enter all elements in B: ");
				for (int j = 0; j < size2; j++)
				{
					 b[j] = input.nextInt();
				}
		       //End Input
				
				int k; //Declaring another array for result A That is not in B

				//Print for result
				System.out.print("The difference for the result C is = ");

				// Calculation using nested loop for final result
				for (int i = 0; i < size1; i++)
				{
					for (k = 0; k < size2; k++)
					{
						if (a[i] == b[k]) //Same number for A-B
						{
							break;
						}
					}
					if (k == size2) //dificultad
					{
						System.out.print(a[i]); // differece number display A that is not in B
						System.out.print(" ");
					}
					
				}// end for loop calculation
				
			   } // end class
	
            }//end program

