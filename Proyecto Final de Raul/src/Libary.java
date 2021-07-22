
public class Libary{
	
	//intance field with the object array the book capacity
    private Book[] books = new Book[20];
    
    //size for getter and setter and print the storage book array 
    private int size = 0;

    //constructor method
    public Libary() {
    	
    	//objects array
    	//Title, author, price, isbn, quanity, release date
    	//this book you can add whetever you want
        books[0] = new Book("Eragon", "Crishopher Paolini",25, 254352, 2,"26/08/2002");
        books[1] = new Book("Sword art online", "Reki Kawahara", 34, 4023452, 2,"10/04/2009");
        books[2] = new Book("Narnia", "C.S.LEWIS", 8, 4023452, 2,"16/10/1950");
        
        size = 3;
    }

    //get method with arguments index with Book objects
    public Book getBooks(int index) {
        return books[index];
    }

    //set method with arguments index including book class
    public void setBooks(int index,Book books) {
    	
    	//set books index array using books
        this.books[index] = books;
    }

    //the get side will not include paramenter but return the instance variable to print de index of the book.
    public int getsize() {
        return size;
    }

    //this size will use for adding or deleting the book, search boook or show all books 
    public void setsize(int count) {
        this.size = this.size+count;
    }

}
