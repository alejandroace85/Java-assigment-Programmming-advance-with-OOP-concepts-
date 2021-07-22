import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class User extends Menu implements ActionListener {
	
	//extending abstract class menu
		 JButton ViewAllBooks;
		 JButton SearchBook;
		 JButton GetBooks;
		 JButton ReturnBook;
		 JButton LogOut;
		 
		 //complete
		
		//constructor method
		public User() {
			
			JFrame frame = new JFrame("User Account");
			
			JPanel panel = new JPanel(null);
			
			   frame.add(panel);
			   
			   ViewAllBooks = new JButton("View all Books");
			   ViewAllBooks.setBounds(50,10,150,30);
			   
			   SearchBook = new JButton("Search Book");
			   SearchBook.setBounds(50,50,150,30);
			   
			   GetBooks = new JButton("Get Books");
			   GetBooks.setBounds(50,90,150,30);
			   
			   ReturnBook = new JButton("Return Books");
			   ReturnBook.setBounds(50,130,150,30);
			   
			   LogOut = new JButton("Logout");
			   LogOut.setBounds(50,170,150,30);
			   
			   ViewAllBooks.addActionListener((ActionListener) this);
			   SearchBook.addActionListener((ActionListener) this);
			   GetBooks.addActionListener((ActionListener) this);
			   ReturnBook.addActionListener((ActionListener) this);
			   LogOut.addActionListener((ActionListener) this);
			   
			   panel.add(ViewAllBooks);
			   panel.add(SearchBook);
			   panel.add(GetBooks);
			   panel.add(ReturnBook);
			   panel.add(LogOut);
			   
			   frame.setSize(347, 270);
			   
			   frame.setLocationRelativeTo(null);
			   
			   frame.setVisible(true);
			   
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			//this method array with adding bracket like using method
		  
		}
		//}//end constructor
		
		
	     //    abstract class menu
	   public int menu(){

		  
		   //Menu mention
//		  System.out.println();
//		  System.out.println("For the user Selected Menu"); 
//	      System.out.println("1. View all books");
//	      System.out.println("2. Search books");
//	      System.out.println("3. Get books");
//	      System.out.println("4. Return books");
//	      System.out.println("0. Quit");
		 
	      //variables the input
	      int choice = sc.nextInt();
	      
	      //return method
	      return choice;
	      
	  }//end method menu






			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
				
				if(e.getSource() == ViewAllBooks) {
					this.selected = new Selected[] {
					new DisplayAllBooks(),
					};
				      
				      //return method
				      
				}
				this.selected = new Selected[] {
						
			      		//array with new objects menu selected with coma selecting index 0
		                  new Quit(), 	           
			             
			              new SearchBook(),
			              new GetBook(),
			              new ReturnBook(),
			              
			      }; //addinng semicolon
			}

			



		

	}// end class
