import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Profile implements Screen, ActionListener {

	JFrame frame = new JFrame("Profile");
	JButton postMessage, logOut; 
	JTextField message, myMessages;
	public void createLayout()
	{
		frame.setSize(1000, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel one, two, bigger, last;
		JLabel name;
	
		bigger = new JPanel();
		bigger.setLayout(new GridLayout(1, 2));
		one = new JPanel();
		two = new JPanel();
		last = new JPanel();
		one.setLayout( new GridLayout( 3,1 ));
		name = new JLabel("ProfileName");
		one.add(name);
		message = new JTextField(140);
		one.add(message);
		postMessage = new JButton("Post Message");
		postMessage.addActionListener(this);
		one.add(postMessage);
		myMessages = new JTextField(140);
		two.add(myMessages);
		bigger.add(one);
		bigger.add(two);
		logOut = new JButton("Logout");
		logOut.addActionListener(this);
		last.add(logOut);
		frame.add(last, BorderLayout.SOUTH);
		frame.add(bigger, BorderLayout.CENTER);
		
		frame.pack();
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		
		 if(e.getSource()==postMessage){
			 String msg = message.getText();
			 System.out.println(msg);
			 //frame.setVisible(false);
			 //frame.dispose();
			 //add message
		 }
		 else if(e.getSource()==logOut){
			 frame.setVisible(false);
			 frame.dispose();
			 HomeScreen myHS = new HomeScreen();
			 myHS.createLayout();
			 //add message
		 }
		 
	}
}
