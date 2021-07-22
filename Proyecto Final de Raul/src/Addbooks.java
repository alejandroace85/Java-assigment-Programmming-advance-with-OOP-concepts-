
//implements Selected
public class Addbooks implements Selected {
	
	
	//complete
	
	
	
	 public void classes(Libary libary) {
		 
		    //instance field with variables getsize libary class
	        int size = libary.getsize();
		 
		    //input title
	        System.out.println("Please enter the title");
	        String title = sc.nextLine();
	        
	        //input author
	        System.out.println("Please enter the author");
	        String author = sc.nextLine();
	        
	        //input isbn
	        System.out.println("Please Enter number isbn");
	        int isbn = sc.nextInt();
	        
	        //input price
	        System.out.println("Please enter price");
	        double price = sc.nextDouble();
	        
	        //input quanity
	        System.out.println("Please enter quanity");
	        double quanity = sc.nextDouble();
	        
	        //input release date
	        System.out.println("Please enter the release date");
	        String date = sc.next();

	       
	         //The book object with selected parentesis objects
	        Book book = new Book(title,author,price,isbn, quanity,date);

	        //set book to write size and book using libary class
	        libary.setBooks(size,book);
	        
	        //adding a size of book using libary get size
	        libary.setsize(1);
	        
	        //print with the add book
	        System.out.println("Added successfully");
	    }
	  
	}
