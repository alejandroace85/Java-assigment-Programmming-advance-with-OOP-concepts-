
public class DeleteBook implements Selected{
	
	
	//Complete

	//method implements
    public void classes(Libary libary) {
    	
    	//output the delete
        System.out.println("Please enter the title of the book to be deleted");
        
        //input the title for delete the space
        
        //instance field the String 
        String title = sc.nextLine();
        
        //instance field 
        int i = 0;
        
        
   
        
        //this loop use for delete book with specific line the array
        for (; i < libary.getsize(); i++) {
        	
        	//if use get book including parentesis index with title including equals 
            if(libary.getBooks(i).getTitle().equals(title)){
            	
            	//break to avoid the bufffer 
                break;
            }
        }
        
        //control flow the book input validation.
        
        if(i >= libary.getsize()){
        	
            System.out.println("This book does not exist or the name is not specific");
            //adding return the menu
            return;
        }
        
        //else use the title was found.
        else   {
        	
        	//using for loop for delete the book
            for (int j = i; j < libary.getsize()-1; j++) {
            	
            	//declaring set books for locating especific index with sum 1 for location
            	libary.setBooks(j,libary.getBooks(j+1));
            	  	
            }
            //The result will use outside the loop because inside the loop for delete wont work
            System.out.println("Book was remove");
          	 libary.setsize(-1);
        }
      }
    }