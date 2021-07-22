
public class SearchBook implements Selected{
	
	
	
	//search book will use nested if 
	
	 public void classes(Libary libary) {
		 
		 //asking the output
    	System.out.println("Enter the title of the book that you want to search");
    	
    	//input the title of the book
		String title = sc.nextLine();
		 
		//index 0 for for loop 
		int i =0;
		
		//loop the storage book
		for(; i < libary.getsize(); i++) {
			
			//control flow the if statement if 
			if(libary.getBooks(i).getTitle().equals(title))
				
				//break loop will use for only selected one
				break;
		}
		
		if(i >= libary.getsize()){
            System.out.println("This book does not exist or type specific program");
     
        }
		
		else
		{
            System.out.println(libary.getBooks(i));
        }
		
		
	 }//end method
}//end class
