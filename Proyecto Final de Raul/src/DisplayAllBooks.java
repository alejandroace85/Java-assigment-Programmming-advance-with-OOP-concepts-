
public class DisplayAllBooks implements Selected {

	
	
	
	//implements the classes
    public void classes(Libary libary) {
    	
    	
    	//for loops with getsize for disply all books of array
        for (int i = 0; i < libary.getsize(); i++) {
        	
        	//print using index
            System.out.println(libary.getBooks(i));
        }//end loop
        
    }// end implement method
}//end class


