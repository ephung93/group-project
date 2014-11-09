import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sun.xml.internal.ws.api.server.Container;


public class HomeScreen implements Screen {

	public void createLayout()
	{
		
		JFrame frame = new JFrame("Home Screen");
		JPanel pane = new JPanel();
		JPanel pane1 = new JPanel();
		frame.setSize(500, 300  );
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton login, register, viewMessages;
		JLabel username, password;
		JTextField name, pass;
		login = new JButton("Login");
		pane.add(login); 
		register = new JButton("Register");
		pane.add(register);
		viewMessages = new JButton("View Public Messages");
		pane.add(viewMessages);
		pane1.setLayout( new GridLayout( 2,2 ));
		username = new JLabel("Username");
		pane1.add(username);
		name = new JTextField(25);
		pane1.add(name);
		password = new JLabel("Password");
		pane1.add(password);
		pass = new JTextField(25);
		pane1.add(pass);
		frame.add(pane, BorderLayout.SOUTH);
		frame.add(pane1, BorderLayout.CENTER);
	//	frame.getContentPane().add(BorderLayout.CENTER);
		frame.setVisible(true);
	}
}
