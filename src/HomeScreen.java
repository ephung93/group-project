import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;




public class HomeScreen implements Screen, ActionListener {


	JFrame frame = new JFrame("Home Screen");
	JButton login, register, viewMessages;
	public void createLayout()
	{
		JPanel pane = new JPanel();
		JPanel pane1 = new JPanel();
		frame.setSize(500, 300  );
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JButton login, register, viewMessages;
		JLabel username, password;
		JTextField name, pass;
		login = new JButton("Login");
		login.addActionListener(this);
		pane.add(login);
		register = new JButton("Register");
		register.addActionListener(this);
		pane.add(register);
		viewMessages = new JButton("View Public Messages");
		viewMessages.addActionListener(this);
		pane.add(viewMessages);
		pane1.setLayout( new GridLayout( 2,2 ));
		username = new JLabel("Username");
		pane1.add(username);
		name = new JTextField(5);
		pane1.add(name);
		password = new JLabel("Password");
		pane1.add(password);
		pass = new JTextField(5);
		pane1.add(pass);
		frame.add(pane, BorderLayout.SOUTH);
		frame.add(pane1, BorderLayout.CENTER);
	//	frame.getContentPane().add(BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		
		 if(e.getSource()==register){
			 frame.setVisible(false);
			 frame.dispose();
			
			 Registration myRegistration = new Registration();
			 myRegistration.createLayout();
		 }
		 else if(e.getSource()==login){
			 //If Login Information is correct
			 frame.setVisible(false);
			 frame.dispose();
			 Profile myProfile = new Profile();
			 myProfile.createLayout();
		 }
		 else if(e.getSource()==viewMessages){
			 //If Login Information is correct
			 frame.setVisible(false);
			 frame.dispose();
			 ViewPublicMessages myVPM = new ViewPublicMessages();
			 myVPM.createLayout();
		 }
	}
	
}
