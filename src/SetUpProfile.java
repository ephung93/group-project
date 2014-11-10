import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SetUpProfile implements Screen {
	
	JFrame frame = new JFrame("Set Up Profile");
	public void createLayout()
	{
		JPanel pane = new JPanel();
		frame.setSize(500, 300  );
		JButton save, cancel;
		JLabel fName, lName;
		JTextField firstName, lastName;
		pane.setLayout( new GridLayout( 3,2 ));
		fName = new JLabel("First Name");
		pane.add(fName);
		firstName = new JTextField(25);
		pane.add(firstName);
		lName = new JLabel("Last Name");
		pane.add(lName);
		lastName = new JTextField(25);
		pane.add(lastName);
		save = new JButton("Save");
		pane.add(save);
		cancel = new JButton("Cancel");
		pane.add(cancel);
		frame.add(pane);
		frame.pack();
		frame.setVisible(true);		
	}

}
