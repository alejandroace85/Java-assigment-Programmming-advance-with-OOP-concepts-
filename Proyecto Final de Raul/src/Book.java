
public class Book {
	
	//instance field private with boolean
		private String title;
		private String author;
		private int isbn;
		private double price;
		private double quanity;
		private String releaseDate;
		 private boolean Borrow;
		
		 //constructor method
		 public Book() {
			 
			 title = "";
			 author = "";
			 isbn = 0;
			 price = 0;
			 quanity =0;                                   //(Overloading)
			 releaseDate = "";
		 }

		 //method with arguments overloading
		public Book(String title, String author, double price, int isbn, double quanity, String releaseDate) {
			this.title = title;
			this.author = author;
			this.isbn = isbn;
			this.price = price;
			this.quanity = quanity;
			this.releaseDate = releaseDate;
		}
		
		//get title
		 public String getTitle() {
		        return title;
		    }
               
		 //setter title
		    public void setTitle(String title) {
		        this.title = title;
		    }

		    //get author 
		    public String getAuthor() {
		        return author;
		    }

		    //set author
		    public void setAuthor(String author) {
		        this.author = author;
		    }

		    //get price
		    public double getPrice() {
		        return price;
		    }

		    //set price
		    public void setPrice(double price) {
		        this.price = price;
		    }

		    //get isbn
		    public int getISBN() {
		        return isbn;
		    }
		    
              //set isbn
		    public void setISBN(int isbn) {
		        this.isbn = isbn;
		    }

		    //get bollean the borrow
		    public boolean getBorrow() {
		        return Borrow;
		    }
		    
		    
              //set boolean the borrow
		    public void setBorrow(boolean borrow) {
		        Borrow = borrow;
		    }
		    
		    //method the sub total price
		    public double subTotal() {
				
				
				return price * quanity;
				
			}
			
		   //calculate the total price
			public double totalPrice() {
				
				//return the method for total price
				return subTotal();
				
			}
		    

	            //Overrriding method to String
		    public String toString() {
		    	                                                                                                                                                                        //control flow alternatives.
		        return "Book Title: "  + title + ", " + " author: " + author + ", " + " price: " + totalPrice() +  ", " +" ISBN: " + isbn + "," + " release date: "+ releaseDate +" " + (Borrow ? "Not availabe":"Avaiable")+" ";
		    }
		     
		
		
}
	
	
	
	
	
		
		
		
	

