import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Profile implements Screen {

	JFrame frame = new JFrame("Profile");
	public void createLayout()
	{
		frame.setSize(1000, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel one, two, bigger;
		JLabel name;
		JButton postMessage;
		JTextField message, myMessages;
		
		bigger = new JPanel();
		bigger.setLayout(new GridLayout(1, 2));
		one = new JPanel();
		two = new JPanel();
		
		one.setLayout( new GridLayout( 3,1 ));
		name = new JLabel("ProfileName");
		one.add(name);
		message = new JTextField(140);
		one.add(message);
		postMessage = new JButton("Post Message");
		one.add(postMessage);
		myMessages = new JTextField(140);
		two.add(myMessages);
		bigger.add(one, two);
		frame.add(bigger, BorderLayout.CENTER);
		
		
		
		
		
		frame.pack();
		frame.setVisible(true);
	}
}
