
public class ReturnBook implements Selected{
 
	
	//implemnt selected method 
    public void classes(Libary libary) {
    	
    	//output asking the title of the book
        System.out.println("Enter the title of the book you want to return:");
        
        //input the title of the book
        String title = sc.nextLine();

        //index instance field to apply the control flow
        int i = 0;
        
        //for loop the array libary (storage book) including break for display only one book
        
        for (; i < libary.getsize(); i++) {
        	
        	//control flow for title of the book break the index to avoid all dispaly.
            if(libary.getBooks(i).getTitle().equals(title)) {
                break;
            }
        }
        
          //input validation 1
        if (i >= libary.getsize()) {
            System.out.println("This book does not exist ");
            
        }
        
        //input validation the book has not return using false Bool
        else if (libary.getBooks(i).getBorrow() == false) {
        	
            System.out.println("This book has not return or is still available");
            
        } 
        
        //displaying result the book return
        else {
            libary.getBooks(i).setBorrow(false);
            
            System.out.println("Return succeeded!");
        }
    }//end implement class
}//end class