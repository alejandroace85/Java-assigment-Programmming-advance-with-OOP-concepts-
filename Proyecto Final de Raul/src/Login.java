//libary for GUI Login
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
@SuppressWarnings("serial")

//extends frame with implements Action Listener
public class Login extends JFrame implements ActionListener {
	
	//instance field declaring Jframe
   JPanel panel;
   JLabel userLabel, passwordLabel, message;
   JTextField userName_text;
   JPasswordField password_text;
   JButton Login;
   
   //Method Constructor Login
   Login() {
      // Username Label
	   
      userLabel = new JLabel();
      userLabel.setText("Username :");
      userName_text = new JTextField();
      
      // Password Label
      
      passwordLabel = new JLabel();
      passwordLabel.setText("Password :");
      password_text = new JPasswordField();
      
      // Login  with username and password
      Login = new JButton("Login");
      panel = new JPanel(new GridLayout(3, 5));
      panel.add(userLabel);
      //adding text user
      panel.add(userName_text);
      //adding password label
      panel.add(passwordLabel);
      //adding password text
      panel.add(password_text);
      message = new JLabel();
      panel.add(message);
      panel.add( Login);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // Adding the listeners to components
      Login.addActionListener(this);
      add(panel, BorderLayout.CENTER);
      setTitle("Rent Libary system manegment");
      //size the frame
      setSize(500,203);
      //location for the monitor
      setLocation(1230,365);
      //bool to set the visibleframe
      setVisible(true);
   }


   //Action performed for object log in the user and the admin
public void actionPerformed(ActionEvent ae) {
	
	String userName = userName_text.getText();
	
	//adding deprecation to stay password as a anonymous
	@SuppressWarnings("deprecation")
	String password = password_text.getText();
	
	//conditionals statement
    if (password.trim().equals("1234"))  {
      
    	//message the pain to show if you enter the different account
    	JOptionPane.showMessageDialog(null, "You enter the User account");
    	//object to move to stay the menu for the user
    User x =  new User();
    Libary z = new Libary();
   //enter user
       // new User();
	 dispose();
	 
     System.out.println("Hello " + userName + " Welcome to the Torres Libary");
   while(true) {
   	//declaring variables with the menu
       int choice = x.menu();

       //this include user with selected
       x.doSelected(choice,z);
       
       }
        
    } 
    
    else
    {
    	//message the pain to show if you enter the different account
    	JOptionPane.showMessageDialog(null, "You enter the Admin account");
    	//object to move to stay the menu for the admin
    	 Admin y = new Admin();
    	 Libary z = new Libary();
    	 
    	 dispose();
    	 while(true) {
    		   	//declaring variables with the menu
    		       int choice = y.menu();

    		       //this include user with selected
    		       y.doSelected(choice,z);
    		       
    		       }
    }
 }//end actionPerformed




}//end class GUI login


