
public class GetBook implements Selected{
    
    public void classes(Libary libary) {
    	
    	//output asking
        System.out.println("Selected the book you want to pick?");
        
        //input title of the book
        String title = sc.next();
        
        //instance field de index for for loop using tecniques to obtain getter and setter
        int i =0;
        
        
        for (; i < libary.getsize(); i++) {
            if(libary.getBooks(i).getTitle().equals(title)){
            	
            	//using break to display one book get only
                break;
            }
        }
        
        //input validation part 1
        if(i >= libary.getsize()){
            System.out.println("This book does not exist or you type without Capital letter");
            
            
        }
        
        //input validation for book not available
        else if(libary.getBooks(i).getBorrow()){
            System.out.println("This book has been taken");
            
            
        }
        
        else {
        	
        	//The book obtain result with boolean True
            libary.getBooks(i).setBorrow(true);
            System.out.println("the book has sucess you have two weeks to return");
        }
    }
}

