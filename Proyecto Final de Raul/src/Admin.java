
public class Admin extends Menu {
	
	//extending abstract class menu
		
		
		//complete
		
		//constructor method
		public Admin() {
			
			//this method array with adding bracket like using method
		  this.selected = new Selected[] {
				
	      		//array with new objects menu selected with coma selecting index 0
	              new Quit(), 
	              new Addbooks(), 
	              new DisplayAllBooks(),
	              new DeleteBook(),
	              new SearchBook(),
	              
	      }; //addinng semicolon
	  
		}//end constructor
		
		
	         //OVERRIDING METHOD 
	   public int menu(){

		   //Menu mention
		  System.out.println();
	      System.out.println("Welcome to the Torres Libary for the administrator selected the menu");
	      System.out.println("1. Add books");
	      System.out.println("2. View all books");
	      System.out.println("3. Delete books");
	      System.out.println("4. Search books");
	      System.out.println("0. Exit the system");
	      
	      //variables the input
	      int choice = sc.nextInt();
	      
	      //return method
	      return choice;
	      
	  }//end method menu



		

	}// end class
