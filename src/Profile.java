import javax.swing.JFrame;


public class Profile implements Screen {

	public void createLayout()
	{
		JFrame frame = new JFrame("Profile");
		frame.setSize(1000, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//	frame.getContentPane().add(BorderLayout.CENTER);
		frame.setVisible(true);
	}
}
