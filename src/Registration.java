import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Registration implements Screen {
	
	JFrame frame = new JFrame("Registration");	
	public void createLayout()
	{

		JFrame frame = new JFrame("Registration");
		frame.setSize(200, 700);

		JPanel pane1 = new JPanel();
		JPanel pane2 = new JPanel();
		frame.setSize(1000, 700);
		JLabel username, password;
		JTextField name, pass;
		JButton register, cancel;
		pane1.setLayout( new GridLayout( 2,2 ));
		username = new JLabel("Username");
		pane1.add(username);
		name = new JTextField(25);
		pane1.add(name);
		password = new JLabel("Password");
		pane1.add(password);
		pass = new JTextField(25);
		pane1.add(pass);
		register = new JButton("Register");
		pane2.add(register);
		cancel = new JButton("Cancel");
		pane2.add(cancel);
		frame.add(pane1);
		frame.add(pane2, BorderLayout.SOUTH);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//	frame.getContentPane().add(BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}

}
