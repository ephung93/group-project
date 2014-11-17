import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.sql.*;


public class Registration implements Screen, ActionListener {
	
 
   private JTextField name, pass, firstName, lastName;
   
   JFrame frame = new JFrame("Registration");
	JButton register, cancel;
	public void createLayout()
	{
		frame.setSize(200, 700);

		JPanel pane1 = new JPanel();
		JPanel pane2 = new JPanel();
		frame.setSize(1000, 700);
		JLabel username, password, fName, lName;
		//JTextField name, pass, firstName, lastName;
		pane1.setLayout( new GridLayout( 4,2 ));
		username = new JLabel("Username");
		pane1.add(username);
		name = new JTextField(25);
		pane1.add(name);
		password = new JLabel("Password");
		pane1.add(password);
		pass = new JTextField(25);
		pane1.add(pass);
		fName = new JLabel("First Name");
		pane1.add(fName);
		firstName = new JTextField(25);
		pane1.add(firstName);
		lName = new JLabel("Last Name");
		pane1.add(lName);
		lastName = new JTextField(25);
		pane1.add(lastName);
		
		register = new JButton("Register");
		register.addActionListener(this);
		pane2.add(register);
		cancel = new JButton("Cancel");
		cancel.addActionListener(this);
		pane2.add(cancel);
		frame.add(pane1);
		frame.add(pane2, BorderLayout.SOUTH);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//	frame.getContentPane().add(BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
      
     	}
		
		public void actionPerformed(ActionEvent e) {
			
			 if(e.getSource()==register){
               
             //variables to hold info read in from text fields 
             String userName = name.getText();
             String fstName = firstName.getText();
             String lstName = lastName.getText();
             String passWord = pass.getText();
		
             //inserts into DB
             //Don't insert if any fields are left blank
             if((userName=="")||(fstName=="")||(lstName=="")||(passWord==""))
            	 Insert.insertUser(userName, fstName, lstName, passWord);
             else
             {
            	 JOptionPane.showMessageDialog(frame, "You may not leave any field blank for registration.");
            	 return;
             } 
				 frame.setVisible(false);
				 frame.dispose();
				 Profile myProfile = new Profile();
				 myProfile.createLayout();
			 }
			 else if(e.getSource()==cancel){
				 frame.setVisible(false);
				 frame.dispose();
				 HomeScreen myHomeScreen = new HomeScreen();
				 myHomeScreen.createLayout();
			 }
			 
	}

}
