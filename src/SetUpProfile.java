import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SetUpProfile implements Screen, ActionListener {
	
	JFrame frame = new JFrame("Set Up Profile");
	JButton save, cancel;
	public void createLayout()
	{
		JPanel pane = new JPanel();
		frame.setSize(500, 300  );
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
		save.addActionListener(this);
		pane.add(save);
		cancel = new JButton("Cancel");
		cancel.addActionListener(this);
		pane.add(cancel);
		frame.add(pane);
		frame.pack();
		frame.setVisible(true);		
	}
	public void actionPerformed(ActionEvent e) {
		
		 if(e.getSource()==save){
			 frame.setVisible(false);
			 frame.dispose();
			 Profile myProfile = new Profile();
			 myProfile.createLayout();
		 }
		 else if(e.getSource()==cancel){
			 frame.setVisible(false);
			 frame.dispose();
			 Profile myProfile = new Profile();
			 myProfile.createLayout();
		 }
		 
}

}
